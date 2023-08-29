// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api2.proto

package com.emporiaenergy.partnerapi2;

public interface UtilityConnectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emporiaenergy.partner_api_2.UtilityConnect)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string manufacturer_device_id = 1;</code>
   * @return The manufacturerDeviceId.
   */
  java.lang.String getManufacturerDeviceId();
  /**
   * <code>string manufacturer_device_id = 1;</code>
   * @return The bytes for manufacturerDeviceId.
   */
  com.google.protobuf.ByteString
      getManufacturerDeviceIdBytes();

  /**
   * <pre>
   ** the MAC of the Zigbee radio, which will be unavailable if the device hasn't connected to Emporia's cloud yet 
   * </pre>
   *
   * <code>string zigbee_mac = 12;</code>
   * @return The zigbeeMac.
   */
  java.lang.String getZigbeeMac();
  /**
   * <pre>
   ** the MAC of the Zigbee radio, which will be unavailable if the device hasn't connected to Emporia's cloud yet 
   * </pre>
   *
   * <code>string zigbee_mac = 12;</code>
   * @return The bytes for zigbeeMac.
   */
  com.google.protobuf.ByteString
      getZigbeeMacBytes();
}