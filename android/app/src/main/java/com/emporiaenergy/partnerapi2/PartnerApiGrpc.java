package com.emporiaenergy.partnerapi2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * The methods available from the Emporia Energy Partner API.  The Emporia API is available via gRPC at
 * URL:  partner.emporiaenergy.com 
 * PORT: 50052				
 * 
 * The V1 of the API used to run on port 50051 but it is no longer available.
 * Clients should be prepared to handle the following errors:
 * 		Status.UNAUTHENTICATED if the auth_token is invalid
 *      Status.RESOURCE_EXHAUSTED if the partner has exceeded the allowed number of requests (currently monitored per hour)
 * 		Status.INVALID_ARGUMENT and a description of the problem if the request is invalid
 * 
 * API call frequency, database usage and bandwidth limitations may be imposed to avoid misuse of the API by 
 * partners or erroneous code.  
 * As of March 2023, we recommend that partners limit their API calls to less than 100 calls per hour.  The API provides 
 * the ability to request data for many devices in a single call so this does not limit the number of devices 
 * a partner can monitor and manage via the API. A typical usage pattern might be:
 * -	Request the list of associated devices hourly. 
 * -	Request minute, 15-minute or hourly data for some or all devices not more frequently than once a minute, being aware that requests for recent time periods may return partial bars.
 * -	Control loads such as EV Chargers and Smart Outlets as needed.
 * The Update methods for EVChargers and Batteries take a settings structure that allows the caller to specify one 
 * or more settings to change.  Anything that is not specified isn't changed by the update call.  This requires using
 * Google's protobuf wrappers such as BoolValue rather than bool since with a plain bool we can't tell if it was 
 * set to false or not set at all.     
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: partner_api2.proto")
public final class PartnerApiGrpc {

  private PartnerApiGrpc() {}

  public static final String SERVICE_NAME = "emporiaenergy.partner_api_2.PartnerApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.AuthenticationRequest,
      com.emporiaenergy.partnerapi2.AuthenticationResponse> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = com.emporiaenergy.partnerapi2.AuthenticationRequest.class,
      responseType = com.emporiaenergy.partnerapi2.AuthenticationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.AuthenticationRequest,
      com.emporiaenergy.partnerapi2.AuthenticationResponse> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.AuthenticationRequest, com.emporiaenergy.partnerapi2.AuthenticationResponse> getAuthenticateMethod;
    if ((getAuthenticateMethod = PartnerApiGrpc.getAuthenticateMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getAuthenticateMethod = PartnerApiGrpc.getAuthenticateMethod) == null) {
          PartnerApiGrpc.getAuthenticateMethod = getAuthenticateMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.AuthenticationRequest, com.emporiaenergy.partnerapi2.AuthenticationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.AuthenticationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.AuthenticationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("Authenticate"))
              .build();
        }
      }
    }
    return getAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.DeviceInventoryRequest,
      com.emporiaenergy.partnerapi2.DeviceInventoryResponse> getGetDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevices",
      requestType = com.emporiaenergy.partnerapi2.DeviceInventoryRequest.class,
      responseType = com.emporiaenergy.partnerapi2.DeviceInventoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.DeviceInventoryRequest,
      com.emporiaenergy.partnerapi2.DeviceInventoryResponse> getGetDevicesMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.DeviceInventoryRequest, com.emporiaenergy.partnerapi2.DeviceInventoryResponse> getGetDevicesMethod;
    if ((getGetDevicesMethod = PartnerApiGrpc.getGetDevicesMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getGetDevicesMethod = PartnerApiGrpc.getGetDevicesMethod) == null) {
          PartnerApiGrpc.getGetDevicesMethod = getGetDevicesMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.DeviceInventoryRequest, com.emporiaenergy.partnerapi2.DeviceInventoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.DeviceInventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.DeviceInventoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("GetDevices"))
              .build();
        }
      }
    }
    return getGetDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.DeviceUsageRequest,
      com.emporiaenergy.partnerapi2.DeviceUsageResponse> getGetUsageDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsageData",
      requestType = com.emporiaenergy.partnerapi2.DeviceUsageRequest.class,
      responseType = com.emporiaenergy.partnerapi2.DeviceUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.DeviceUsageRequest,
      com.emporiaenergy.partnerapi2.DeviceUsageResponse> getGetUsageDataMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.DeviceUsageRequest, com.emporiaenergy.partnerapi2.DeviceUsageResponse> getGetUsageDataMethod;
    if ((getGetUsageDataMethod = PartnerApiGrpc.getGetUsageDataMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getGetUsageDataMethod = PartnerApiGrpc.getGetUsageDataMethod) == null) {
          PartnerApiGrpc.getGetUsageDataMethod = getGetUsageDataMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.DeviceUsageRequest, com.emporiaenergy.partnerapi2.DeviceUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsageData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.DeviceUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.DeviceUsageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("GetUsageData"))
              .build();
        }
      }
    }
    return getGetUsageDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest,
      com.emporiaenergy.partnerapi2.UtilityConnectsResponse> getListUtilityConnectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUtilityConnects",
      requestType = com.emporiaenergy.partnerapi2.ListDevicesRequest.class,
      responseType = com.emporiaenergy.partnerapi2.UtilityConnectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest,
      com.emporiaenergy.partnerapi2.UtilityConnectsResponse> getListUtilityConnectsMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest, com.emporiaenergy.partnerapi2.UtilityConnectsResponse> getListUtilityConnectsMethod;
    if ((getListUtilityConnectsMethod = PartnerApiGrpc.getListUtilityConnectsMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getListUtilityConnectsMethod = PartnerApiGrpc.getListUtilityConnectsMethod) == null) {
          PartnerApiGrpc.getListUtilityConnectsMethod = getListUtilityConnectsMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.ListDevicesRequest, com.emporiaenergy.partnerapi2.UtilityConnectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUtilityConnects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.ListDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.UtilityConnectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("ListUtilityConnects"))
              .build();
        }
      }
    }
    return getListUtilityConnectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest,
      com.emporiaenergy.partnerapi2.OutletsResponse> getListOutletsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOutlets",
      requestType = com.emporiaenergy.partnerapi2.ListDevicesRequest.class,
      responseType = com.emporiaenergy.partnerapi2.OutletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest,
      com.emporiaenergy.partnerapi2.OutletsResponse> getListOutletsMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest, com.emporiaenergy.partnerapi2.OutletsResponse> getListOutletsMethod;
    if ((getListOutletsMethod = PartnerApiGrpc.getListOutletsMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getListOutletsMethod = PartnerApiGrpc.getListOutletsMethod) == null) {
          PartnerApiGrpc.getListOutletsMethod = getListOutletsMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.ListDevicesRequest, com.emporiaenergy.partnerapi2.OutletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOutlets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.ListDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.OutletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("ListOutlets"))
              .build();
        }
      }
    }
    return getListOutletsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.UpdateOutletsRequest,
      com.emporiaenergy.partnerapi2.OutletsResponse> getUpdateOutletsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOutlets",
      requestType = com.emporiaenergy.partnerapi2.UpdateOutletsRequest.class,
      responseType = com.emporiaenergy.partnerapi2.OutletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.UpdateOutletsRequest,
      com.emporiaenergy.partnerapi2.OutletsResponse> getUpdateOutletsMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.UpdateOutletsRequest, com.emporiaenergy.partnerapi2.OutletsResponse> getUpdateOutletsMethod;
    if ((getUpdateOutletsMethod = PartnerApiGrpc.getUpdateOutletsMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getUpdateOutletsMethod = PartnerApiGrpc.getUpdateOutletsMethod) == null) {
          PartnerApiGrpc.getUpdateOutletsMethod = getUpdateOutletsMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.UpdateOutletsRequest, com.emporiaenergy.partnerapi2.OutletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOutlets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.UpdateOutletsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.OutletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("UpdateOutlets"))
              .build();
        }
      }
    }
    return getUpdateOutletsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest,
      com.emporiaenergy.partnerapi2.EVChargersResponse> getListEVChargersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEVChargers",
      requestType = com.emporiaenergy.partnerapi2.ListDevicesRequest.class,
      responseType = com.emporiaenergy.partnerapi2.EVChargersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest,
      com.emporiaenergy.partnerapi2.EVChargersResponse> getListEVChargersMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest, com.emporiaenergy.partnerapi2.EVChargersResponse> getListEVChargersMethod;
    if ((getListEVChargersMethod = PartnerApiGrpc.getListEVChargersMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getListEVChargersMethod = PartnerApiGrpc.getListEVChargersMethod) == null) {
          PartnerApiGrpc.getListEVChargersMethod = getListEVChargersMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.ListDevicesRequest, com.emporiaenergy.partnerapi2.EVChargersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEVChargers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.ListDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.EVChargersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("ListEVChargers"))
              .build();
        }
      }
    }
    return getListEVChargersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.UpdateEVChargersRequest,
      com.emporiaenergy.partnerapi2.EVChargersResponse> getUpdateEVChargersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEVChargers",
      requestType = com.emporiaenergy.partnerapi2.UpdateEVChargersRequest.class,
      responseType = com.emporiaenergy.partnerapi2.EVChargersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.UpdateEVChargersRequest,
      com.emporiaenergy.partnerapi2.EVChargersResponse> getUpdateEVChargersMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.UpdateEVChargersRequest, com.emporiaenergy.partnerapi2.EVChargersResponse> getUpdateEVChargersMethod;
    if ((getUpdateEVChargersMethod = PartnerApiGrpc.getUpdateEVChargersMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getUpdateEVChargersMethod = PartnerApiGrpc.getUpdateEVChargersMethod) == null) {
          PartnerApiGrpc.getUpdateEVChargersMethod = getUpdateEVChargersMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.UpdateEVChargersRequest, com.emporiaenergy.partnerapi2.EVChargersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEVChargers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.UpdateEVChargersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.EVChargersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("UpdateEVChargers"))
              .build();
        }
      }
    }
    return getUpdateEVChargersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest,
      com.emporiaenergy.partnerapi2.BatteriesResponse> getListBatteriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBatteries",
      requestType = com.emporiaenergy.partnerapi2.ListDevicesRequest.class,
      responseType = com.emporiaenergy.partnerapi2.BatteriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest,
      com.emporiaenergy.partnerapi2.BatteriesResponse> getListBatteriesMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.ListDevicesRequest, com.emporiaenergy.partnerapi2.BatteriesResponse> getListBatteriesMethod;
    if ((getListBatteriesMethod = PartnerApiGrpc.getListBatteriesMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getListBatteriesMethod = PartnerApiGrpc.getListBatteriesMethod) == null) {
          PartnerApiGrpc.getListBatteriesMethod = getListBatteriesMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.ListDevicesRequest, com.emporiaenergy.partnerapi2.BatteriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBatteries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.ListDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.BatteriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("ListBatteries"))
              .build();
        }
      }
    }
    return getListBatteriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.UpdateBatteriesRequest,
      com.emporiaenergy.partnerapi2.BatteriesResponse> getUpdateBatteriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBatteries",
      requestType = com.emporiaenergy.partnerapi2.UpdateBatteriesRequest.class,
      responseType = com.emporiaenergy.partnerapi2.BatteriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.UpdateBatteriesRequest,
      com.emporiaenergy.partnerapi2.BatteriesResponse> getUpdateBatteriesMethod() {
    io.grpc.MethodDescriptor<com.emporiaenergy.partnerapi2.UpdateBatteriesRequest, com.emporiaenergy.partnerapi2.BatteriesResponse> getUpdateBatteriesMethod;
    if ((getUpdateBatteriesMethod = PartnerApiGrpc.getUpdateBatteriesMethod) == null) {
      synchronized (PartnerApiGrpc.class) {
        if ((getUpdateBatteriesMethod = PartnerApiGrpc.getUpdateBatteriesMethod) == null) {
          PartnerApiGrpc.getUpdateBatteriesMethod = getUpdateBatteriesMethod =
              io.grpc.MethodDescriptor.<com.emporiaenergy.partnerapi2.UpdateBatteriesRequest, com.emporiaenergy.partnerapi2.BatteriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBatteries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.UpdateBatteriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emporiaenergy.partnerapi2.BatteriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartnerApiMethodDescriptorSupplier("UpdateBatteries"))
              .build();
        }
      }
    }
    return getUpdateBatteriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PartnerApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartnerApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartnerApiStub>() {
        @java.lang.Override
        public PartnerApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartnerApiStub(channel, callOptions);
        }
      };
    return PartnerApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PartnerApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartnerApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartnerApiBlockingStub>() {
        @java.lang.Override
        public PartnerApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartnerApiBlockingStub(channel, callOptions);
        }
      };
    return PartnerApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PartnerApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartnerApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartnerApiFutureStub>() {
        @java.lang.Override
        public PartnerApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartnerApiFutureStub(channel, callOptions);
        }
      };
    return PartnerApiFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * The methods available from the Emporia Energy Partner API.  The Emporia API is available via gRPC at
   * URL:  partner.emporiaenergy.com 
   * PORT: 50052				
   * 
   * The V1 of the API used to run on port 50051 but it is no longer available.
   * Clients should be prepared to handle the following errors:
   * 		Status.UNAUTHENTICATED if the auth_token is invalid
   *      Status.RESOURCE_EXHAUSTED if the partner has exceeded the allowed number of requests (currently monitored per hour)
   * 		Status.INVALID_ARGUMENT and a description of the problem if the request is invalid
   * 
   * API call frequency, database usage and bandwidth limitations may be imposed to avoid misuse of the API by 
   * partners or erroneous code.  
   * As of March 2023, we recommend that partners limit their API calls to less than 100 calls per hour.  The API provides 
   * the ability to request data for many devices in a single call so this does not limit the number of devices 
   * a partner can monitor and manage via the API. A typical usage pattern might be:
   * -	Request the list of associated devices hourly. 
   * -	Request minute, 15-minute or hourly data for some or all devices not more frequently than once a minute, being aware that requests for recent time periods may return partial bars.
   * -	Control loads such as EV Chargers and Smart Outlets as needed.
   * The Update methods for EVChargers and Batteries take a settings structure that allows the caller to specify one 
   * or more settings to change.  Anything that is not specified isn't changed by the update call.  This requires using
   * Google's protobuf wrappers such as BoolValue rather than bool since with a plain bool we can't tell if it was 
   * set to false or not set at all.     
   * </pre>
   */
  public static abstract class PartnerApiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * login with the email and password you use on the portal website and get back an auth_token
     * </pre>
     */
    public void authenticate(com.emporiaenergy.partnerapi2.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.AuthenticationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    /**
     * <pre>
     * get the collection of devices associated to your partner account, 
     * optionally limited to devices related to one or more customer emails
     * </pre>
     */
    public void getDevices(com.emporiaenergy.partnerapi2.DeviceInventoryRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.DeviceInventoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDevicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * get usage data for one or more devices
     * </pre>
     */
    public void getUsageData(com.emporiaenergy.partnerapi2.DeviceUsageRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.DeviceUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsageDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * get the device-type specific details for Utility Connect devices
     * </pre>
     */
    public void listUtilityConnects(com.emporiaenergy.partnerapi2.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.UtilityConnectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUtilityConnectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * get the device-type specific details for Outlets, specifically if they are on or off
     * </pre>
     */
    public void listOutlets(com.emporiaenergy.partnerapi2.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.OutletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOutletsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set one or more Outlets to be on or off.  
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public void updateOutlets(com.emporiaenergy.partnerapi2.UpdateOutletsRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.OutletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOutletsMethod(), responseObserver);
    }

    /**
     * <pre>
     * get the device-type specific details for EVChargers
     * </pre>
     */
    public void listEVChargers(com.emporiaenergy.partnerapi2.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.EVChargersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEVChargersMethod(), responseObserver);
    }

    /**
     * <pre>
     * change the settings for one or more EVChargers
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public void updateEVChargers(com.emporiaenergy.partnerapi2.UpdateEVChargersRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.EVChargersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEVChargersMethod(), responseObserver);
    }

    /**
     * <pre>
     * get the device-type specific details for Batteries
     * </pre>
     */
    public void listBatteries(com.emporiaenergy.partnerapi2.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.BatteriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBatteriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * change the settings for one or more batteries 
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public void updateBatteries(com.emporiaenergy.partnerapi2.UpdateBatteriesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.BatteriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBatteriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.AuthenticationRequest,
                com.emporiaenergy.partnerapi2.AuthenticationResponse>(
                  this, METHODID_AUTHENTICATE)))
          .addMethod(
            getGetDevicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.DeviceInventoryRequest,
                com.emporiaenergy.partnerapi2.DeviceInventoryResponse>(
                  this, METHODID_GET_DEVICES)))
          .addMethod(
            getGetUsageDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.DeviceUsageRequest,
                com.emporiaenergy.partnerapi2.DeviceUsageResponse>(
                  this, METHODID_GET_USAGE_DATA)))
          .addMethod(
            getListUtilityConnectsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.ListDevicesRequest,
                com.emporiaenergy.partnerapi2.UtilityConnectsResponse>(
                  this, METHODID_LIST_UTILITY_CONNECTS)))
          .addMethod(
            getListOutletsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.ListDevicesRequest,
                com.emporiaenergy.partnerapi2.OutletsResponse>(
                  this, METHODID_LIST_OUTLETS)))
          .addMethod(
            getUpdateOutletsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.UpdateOutletsRequest,
                com.emporiaenergy.partnerapi2.OutletsResponse>(
                  this, METHODID_UPDATE_OUTLETS)))
          .addMethod(
            getListEVChargersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.ListDevicesRequest,
                com.emporiaenergy.partnerapi2.EVChargersResponse>(
                  this, METHODID_LIST_EVCHARGERS)))
          .addMethod(
            getUpdateEVChargersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.UpdateEVChargersRequest,
                com.emporiaenergy.partnerapi2.EVChargersResponse>(
                  this, METHODID_UPDATE_EVCHARGERS)))
          .addMethod(
            getListBatteriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.ListDevicesRequest,
                com.emporiaenergy.partnerapi2.BatteriesResponse>(
                  this, METHODID_LIST_BATTERIES)))
          .addMethod(
            getUpdateBatteriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.emporiaenergy.partnerapi2.UpdateBatteriesRequest,
                com.emporiaenergy.partnerapi2.BatteriesResponse>(
                  this, METHODID_UPDATE_BATTERIES)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * The methods available from the Emporia Energy Partner API.  The Emporia API is available via gRPC at
   * URL:  partner.emporiaenergy.com 
   * PORT: 50052				
   * 
   * The V1 of the API used to run on port 50051 but it is no longer available.
   * Clients should be prepared to handle the following errors:
   * 		Status.UNAUTHENTICATED if the auth_token is invalid
   *      Status.RESOURCE_EXHAUSTED if the partner has exceeded the allowed number of requests (currently monitored per hour)
   * 		Status.INVALID_ARGUMENT and a description of the problem if the request is invalid
   * 
   * API call frequency, database usage and bandwidth limitations may be imposed to avoid misuse of the API by 
   * partners or erroneous code.  
   * As of March 2023, we recommend that partners limit their API calls to less than 100 calls per hour.  The API provides 
   * the ability to request data for many devices in a single call so this does not limit the number of devices 
   * a partner can monitor and manage via the API. A typical usage pattern might be:
   * -	Request the list of associated devices hourly. 
   * -	Request minute, 15-minute or hourly data for some or all devices not more frequently than once a minute, being aware that requests for recent time periods may return partial bars.
   * -	Control loads such as EV Chargers and Smart Outlets as needed.
   * The Update methods for EVChargers and Batteries take a settings structure that allows the caller to specify one 
   * or more settings to change.  Anything that is not specified isn't changed by the update call.  This requires using
   * Google's protobuf wrappers such as BoolValue rather than bool since with a plain bool we can't tell if it was 
   * set to false or not set at all.     
   * </pre>
   */
  public static final class PartnerApiStub extends io.grpc.stub.AbstractAsyncStub<PartnerApiStub> {
    private PartnerApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnerApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartnerApiStub(channel, callOptions);
    }

    /**
     * <pre>
     * login with the email and password you use on the portal website and get back an auth_token
     * </pre>
     */
    public void authenticate(com.emporiaenergy.partnerapi2.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.AuthenticationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get the collection of devices associated to your partner account, 
     * optionally limited to devices related to one or more customer emails
     * </pre>
     */
    public void getDevices(com.emporiaenergy.partnerapi2.DeviceInventoryRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.DeviceInventoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get usage data for one or more devices
     * </pre>
     */
    public void getUsageData(com.emporiaenergy.partnerapi2.DeviceUsageRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.DeviceUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsageDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get the device-type specific details for Utility Connect devices
     * </pre>
     */
    public void listUtilityConnects(com.emporiaenergy.partnerapi2.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.UtilityConnectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUtilityConnectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get the device-type specific details for Outlets, specifically if they are on or off
     * </pre>
     */
    public void listOutlets(com.emporiaenergy.partnerapi2.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.OutletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOutletsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set one or more Outlets to be on or off.  
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public void updateOutlets(com.emporiaenergy.partnerapi2.UpdateOutletsRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.OutletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOutletsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get the device-type specific details for EVChargers
     * </pre>
     */
    public void listEVChargers(com.emporiaenergy.partnerapi2.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.EVChargersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEVChargersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * change the settings for one or more EVChargers
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public void updateEVChargers(com.emporiaenergy.partnerapi2.UpdateEVChargersRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.EVChargersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEVChargersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get the device-type specific details for Batteries
     * </pre>
     */
    public void listBatteries(com.emporiaenergy.partnerapi2.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.BatteriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBatteriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * change the settings for one or more batteries 
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public void updateBatteries(com.emporiaenergy.partnerapi2.UpdateBatteriesRequest request,
        io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.BatteriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBatteriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * The methods available from the Emporia Energy Partner API.  The Emporia API is available via gRPC at
   * URL:  partner.emporiaenergy.com 
   * PORT: 50052				
   * 
   * The V1 of the API used to run on port 50051 but it is no longer available.
   * Clients should be prepared to handle the following errors:
   * 		Status.UNAUTHENTICATED if the auth_token is invalid
   *      Status.RESOURCE_EXHAUSTED if the partner has exceeded the allowed number of requests (currently monitored per hour)
   * 		Status.INVALID_ARGUMENT and a description of the problem if the request is invalid
   * 
   * API call frequency, database usage and bandwidth limitations may be imposed to avoid misuse of the API by 
   * partners or erroneous code.  
   * As of March 2023, we recommend that partners limit their API calls to less than 100 calls per hour.  The API provides 
   * the ability to request data for many devices in a single call so this does not limit the number of devices 
   * a partner can monitor and manage via the API. A typical usage pattern might be:
   * -	Request the list of associated devices hourly. 
   * -	Request minute, 15-minute or hourly data for some or all devices not more frequently than once a minute, being aware that requests for recent time periods may return partial bars.
   * -	Control loads such as EV Chargers and Smart Outlets as needed.
   * The Update methods for EVChargers and Batteries take a settings structure that allows the caller to specify one 
   * or more settings to change.  Anything that is not specified isn't changed by the update call.  This requires using
   * Google's protobuf wrappers such as BoolValue rather than bool since with a plain bool we can't tell if it was 
   * set to false or not set at all.     
   * </pre>
   */
  public static final class PartnerApiBlockingStub extends io.grpc.stub.AbstractBlockingStub<PartnerApiBlockingStub> {
    private PartnerApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnerApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartnerApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * login with the email and password you use on the portal website and get back an auth_token
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.AuthenticationResponse authenticate(com.emporiaenergy.partnerapi2.AuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get the collection of devices associated to your partner account, 
     * optionally limited to devices related to one or more customer emails
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.DeviceInventoryResponse getDevices(com.emporiaenergy.partnerapi2.DeviceInventoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDevicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get usage data for one or more devices
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.DeviceUsageResponse getUsageData(com.emporiaenergy.partnerapi2.DeviceUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsageDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get the device-type specific details for Utility Connect devices
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.UtilityConnectsResponse listUtilityConnects(com.emporiaenergy.partnerapi2.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUtilityConnectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get the device-type specific details for Outlets, specifically if they are on or off
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.OutletsResponse listOutlets(com.emporiaenergy.partnerapi2.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOutletsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set one or more Outlets to be on or off.  
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.OutletsResponse updateOutlets(com.emporiaenergy.partnerapi2.UpdateOutletsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOutletsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get the device-type specific details for EVChargers
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.EVChargersResponse listEVChargers(com.emporiaenergy.partnerapi2.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEVChargersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * change the settings for one or more EVChargers
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.EVChargersResponse updateEVChargers(com.emporiaenergy.partnerapi2.UpdateEVChargersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEVChargersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get the device-type specific details for Batteries
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.BatteriesResponse listBatteries(com.emporiaenergy.partnerapi2.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBatteriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * change the settings for one or more batteries 
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public com.emporiaenergy.partnerapi2.BatteriesResponse updateBatteries(com.emporiaenergy.partnerapi2.UpdateBatteriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBatteriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * The methods available from the Emporia Energy Partner API.  The Emporia API is available via gRPC at
   * URL:  partner.emporiaenergy.com 
   * PORT: 50052				
   * 
   * The V1 of the API used to run on port 50051 but it is no longer available.
   * Clients should be prepared to handle the following errors:
   * 		Status.UNAUTHENTICATED if the auth_token is invalid
   *      Status.RESOURCE_EXHAUSTED if the partner has exceeded the allowed number of requests (currently monitored per hour)
   * 		Status.INVALID_ARGUMENT and a description of the problem if the request is invalid
   * 
   * API call frequency, database usage and bandwidth limitations may be imposed to avoid misuse of the API by 
   * partners or erroneous code.  
   * As of March 2023, we recommend that partners limit their API calls to less than 100 calls per hour.  The API provides 
   * the ability to request data for many devices in a single call so this does not limit the number of devices 
   * a partner can monitor and manage via the API. A typical usage pattern might be:
   * -	Request the list of associated devices hourly. 
   * -	Request minute, 15-minute or hourly data for some or all devices not more frequently than once a minute, being aware that requests for recent time periods may return partial bars.
   * -	Control loads such as EV Chargers and Smart Outlets as needed.
   * The Update methods for EVChargers and Batteries take a settings structure that allows the caller to specify one 
   * or more settings to change.  Anything that is not specified isn't changed by the update call.  This requires using
   * Google's protobuf wrappers such as BoolValue rather than bool since with a plain bool we can't tell if it was 
   * set to false or not set at all.     
   * </pre>
   */
  public static final class PartnerApiFutureStub extends io.grpc.stub.AbstractFutureStub<PartnerApiFutureStub> {
    private PartnerApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnerApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartnerApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * login with the email and password you use on the portal website and get back an auth_token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.AuthenticationResponse> authenticate(
        com.emporiaenergy.partnerapi2.AuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get the collection of devices associated to your partner account, 
     * optionally limited to devices related to one or more customer emails
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.DeviceInventoryResponse> getDevices(
        com.emporiaenergy.partnerapi2.DeviceInventoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get usage data for one or more devices
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.DeviceUsageResponse> getUsageData(
        com.emporiaenergy.partnerapi2.DeviceUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsageDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get the device-type specific details for Utility Connect devices
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.UtilityConnectsResponse> listUtilityConnects(
        com.emporiaenergy.partnerapi2.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUtilityConnectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get the device-type specific details for Outlets, specifically if they are on or off
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.OutletsResponse> listOutlets(
        com.emporiaenergy.partnerapi2.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOutletsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set one or more Outlets to be on or off.  
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.OutletsResponse> updateOutlets(
        com.emporiaenergy.partnerapi2.UpdateOutletsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOutletsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get the device-type specific details for EVChargers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.EVChargersResponse> listEVChargers(
        com.emporiaenergy.partnerapi2.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEVChargersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * change the settings for one or more EVChargers
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.EVChargersResponse> updateEVChargers(
        com.emporiaenergy.partnerapi2.UpdateEVChargersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEVChargersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get the device-type specific details for Batteries
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.BatteriesResponse> listBatteries(
        com.emporiaenergy.partnerapi2.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBatteriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * change the settings for one or more batteries 
     * Only the devices that were changed will be included in the response; devices that
     * aren't connected to the cloud or were already in the requested state won't be included
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emporiaenergy.partnerapi2.BatteriesResponse> updateBatteries(
        com.emporiaenergy.partnerapi2.UpdateBatteriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBatteriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE = 0;
  private static final int METHODID_GET_DEVICES = 1;
  private static final int METHODID_GET_USAGE_DATA = 2;
  private static final int METHODID_LIST_UTILITY_CONNECTS = 3;
  private static final int METHODID_LIST_OUTLETS = 4;
  private static final int METHODID_UPDATE_OUTLETS = 5;
  private static final int METHODID_LIST_EVCHARGERS = 6;
  private static final int METHODID_UPDATE_EVCHARGERS = 7;
  private static final int METHODID_LIST_BATTERIES = 8;
  private static final int METHODID_UPDATE_BATTERIES = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PartnerApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PartnerApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((com.emporiaenergy.partnerapi2.AuthenticationRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.AuthenticationResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICES:
          serviceImpl.getDevices((com.emporiaenergy.partnerapi2.DeviceInventoryRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.DeviceInventoryResponse>) responseObserver);
          break;
        case METHODID_GET_USAGE_DATA:
          serviceImpl.getUsageData((com.emporiaenergy.partnerapi2.DeviceUsageRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.DeviceUsageResponse>) responseObserver);
          break;
        case METHODID_LIST_UTILITY_CONNECTS:
          serviceImpl.listUtilityConnects((com.emporiaenergy.partnerapi2.ListDevicesRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.UtilityConnectsResponse>) responseObserver);
          break;
        case METHODID_LIST_OUTLETS:
          serviceImpl.listOutlets((com.emporiaenergy.partnerapi2.ListDevicesRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.OutletsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OUTLETS:
          serviceImpl.updateOutlets((com.emporiaenergy.partnerapi2.UpdateOutletsRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.OutletsResponse>) responseObserver);
          break;
        case METHODID_LIST_EVCHARGERS:
          serviceImpl.listEVChargers((com.emporiaenergy.partnerapi2.ListDevicesRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.EVChargersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EVCHARGERS:
          serviceImpl.updateEVChargers((com.emporiaenergy.partnerapi2.UpdateEVChargersRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.EVChargersResponse>) responseObserver);
          break;
        case METHODID_LIST_BATTERIES:
          serviceImpl.listBatteries((com.emporiaenergy.partnerapi2.ListDevicesRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.BatteriesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BATTERIES:
          serviceImpl.updateBatteries((com.emporiaenergy.partnerapi2.UpdateBatteriesRequest) request,
              (io.grpc.stub.StreamObserver<com.emporiaenergy.partnerapi2.BatteriesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PartnerApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PartnerApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PartnerApi");
    }
  }

  private static final class PartnerApiFileDescriptorSupplier
      extends PartnerApiBaseDescriptorSupplier {
    PartnerApiFileDescriptorSupplier() {}
  }

  private static final class PartnerApiMethodDescriptorSupplier
      extends PartnerApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PartnerApiMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PartnerApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PartnerApiFileDescriptorSupplier())
              .addMethod(getAuthenticateMethod())
              .addMethod(getGetDevicesMethod())
              .addMethod(getGetUsageDataMethod())
              .addMethod(getListUtilityConnectsMethod())
              .addMethod(getListOutletsMethod())
              .addMethod(getUpdateOutletsMethod())
              .addMethod(getListEVChargersMethod())
              .addMethod(getUpdateEVChargersMethod())
              .addMethod(getListBatteriesMethod())
              .addMethod(getUpdateBatteriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
