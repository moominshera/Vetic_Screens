// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api2.proto

package com.emporiaenergy.partnerapi2;

public interface DeviceInventoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emporiaenergy.partner_api_2.DeviceInventoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of devices associated with the partner
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.DeviceInventoryResponse.Device devices = 1;</code>
   */
  java.util.List<com.emporiaenergy.partnerapi2.DeviceInventoryResponse.Device> 
      getDevicesList();
  /**
   * <pre>
   * list of devices associated with the partner
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.DeviceInventoryResponse.Device devices = 1;</code>
   */
  com.emporiaenergy.partnerapi2.DeviceInventoryResponse.Device getDevices(int index);
  /**
   * <pre>
   * list of devices associated with the partner
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.DeviceInventoryResponse.Device devices = 1;</code>
   */
  int getDevicesCount();
  /**
   * <pre>
   * list of devices associated with the partner
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.DeviceInventoryResponse.Device devices = 1;</code>
   */
  java.util.List<? extends com.emporiaenergy.partnerapi2.DeviceInventoryResponse.DeviceOrBuilder> 
      getDevicesOrBuilderList();
  /**
   * <pre>
   * list of devices associated with the partner
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.DeviceInventoryResponse.Device devices = 1;</code>
   */
  com.emporiaenergy.partnerapi2.DeviceInventoryResponse.DeviceOrBuilder getDevicesOrBuilder(
      int index);
}
