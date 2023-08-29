package com.vetic;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Callback;
import io.grpc.android.AndroidChannelBuilder;
import io.grpc.ManagedChannel;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;
import java.time.Instant;

import com.emporiaenergy.partnerapi2.PartnerApiGrpc;
import com.emporiaenergy.partnerapi2.PartnerApiGrpc.PartnerApiBlockingStub;
import com.emporiaenergy.partnerapi2.AuthenticationRequest;
import com.emporiaenergy.partnerapi2.AuthenticationResponse;
import com.emporiaenergy.partnerapi2.DeviceInventoryRequest;
import com.emporiaenergy.partnerapi2.DeviceInventoryResponse;
import com.emporiaenergy.partnerapi2.DeviceUsageRequest;
import com.emporiaenergy.partnerapi2.DeviceUsageResponse;
import com.emporiaenergy.partnerapi2.DeviceUsageRequest.UsageChannel;
import com.emporiaenergy.partnerapi2.DeviceUsageResponse.DeviceUsage;
import com.emporiaenergy.partnerapi2.DataResolution;

public class VeticApiClient extends ReactContextBaseJavaModule {
    private static ManagedChannel channel = AndroidChannelBuilder.forAddress("partner.emporiaenergy.com", 50052)
            .build();
    private static PartnerApiGrpc.PartnerApiBlockingStub stub = PartnerApiGrpc.newBlockingStub(channel);
    private static String authToken = "";
    private static String deviceId = "";

    private static ReactApplicationContext reactContext;

    // Constructor
    VeticApiClient(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @Override
    public String getName() {
        return "ClientConnector";
    }

    @ReactMethod
    public void authenticateMethod(Callback callback) {
        AuthenticationRequest authRequest = AuthenticationRequest.newBuilder().setPartnerEmail("abdullah@vetic.sa")
                .setPassword("V!8MkXXgY!qeDpj").build();
        AuthenticationResponse authResponse = stub.authenticate(authRequest);
        authToken = authResponse.getAuthToken();
        callback.invoke(authToken);
    }

    @ReactMethod
    public void deviceRegistrationStatus(String devId, Callback callback) {
        if (authToken != "") {

            deviceId = devId;
            DeviceInventoryRequest inventoryRequest = DeviceInventoryRequest.newBuilder().setAuthToken(authToken)
                    .build();
            DeviceInventoryResponse inventoryResponse = stub.getDevices(inventoryRequest);
            boolean isDeviceRegistered = false;
            for (int i = 0; i < inventoryResponse.getDevicesCount(); i++) {
                if (inventoryResponse.getDevices(i).getManufacturerDeviceId().equals(deviceId)) {
                    isDeviceRegistered = true;
                    break;
                }
            }
            if (isDeviceRegistered) {
                callback.invoke("Device " + deviceId + " is Registered");
            } else {
                callback.invoke("Device " + deviceId + " is not Registered");
            }
        } else {
            callback.invoke("Generate Auth Token First");
        }
    }

    @ReactMethod
    public void deviceDailyUsage(Callback callback) {
        if (authToken != "" && deviceId != "") {
            long thirtyMinutesAgo = Instant.now().minus(30, ChronoUnit.MINUTES).getEpochSecond();
            long oneMonthAgo = Instant.now().minus(31, ChronoUnit.DAYS).getEpochSecond();
            List<String> devId = new ArrayList<String>();
            devId.add(deviceId);
            DeviceUsageRequest usageRequest = DeviceUsageRequest.newBuilder()
                    .setAuthToken(authToken)
                    .setStartEpochSeconds(oneMonthAgo)
                    .setEndEpochSeconds(thirtyMinutesAgo)
                    .setScale(DataResolution.Hours)
                    .setChannels(UsageChannel.ALL)
                    .addAllManufacturerDeviceIds(devId)
                    .build();

            DeviceUsageResponse usageResponse = stub.getUsageData(usageRequest);
            ArrayList<String> timeList = new ArrayList<>();
            ArrayList<String> usageList = new ArrayList<>();
            for (DeviceUsage usage : usageResponse.getDeviceUsagesList()) {
                for (int i = 0; i < usage.getChannelUsagesList().get(0).getUsagesList().size(); i++) {
                    usageList.add(String.valueOf(
                            usage.getChannelUsagesList().get(0).getUsages(i) +
                                    usage.getChannelUsagesList().get(1).getUsages(i) +
                                    usage.getChannelUsagesList().get(2).getUsages(i) +
                                    usage.getChannelUsagesList().get(3).getUsages(i) +
                                    usage.getChannelUsagesList().get(4).getUsages(i) +
                                    usage.getChannelUsagesList().get(5).getUsages(i) +
                                    usage.getChannelUsagesList().get(6).getUsages(i) +
                                    usage.getChannelUsagesList().get(7).getUsages(i) +
                                    usage.getChannelUsagesList().get(8).getUsages(i) +
                                    usage.getChannelUsagesList().get(9).getUsages(i) +
                                    usage.getChannelUsagesList().get(10).getUsages(i) +
                                    usage.getChannelUsagesList().get(11).getUsages(i) +
                                    usage.getChannelUsagesList().get(12).getUsages(i) +
                                    usage.getChannelUsagesList().get(13).getUsages(i) +
                                    usage.getChannelUsagesList().get(14).getUsages(i)));
                }
                for (int i = 0; i < usage.getBucketEpochSecondsList().size(); i++) {
                    String date = new java.text.SimpleDateFormat("hh:mm:a")
                            .format(new java.util.Date(usage.getBucketEpochSecondsList().get(i) * 1000));
                    timeList.add(date);
                }

            }
            callback.invoke(usageList.get(0));
        } else {
            callback.invoke("Generate auth token and check for device registration first");
        }

    }
}
