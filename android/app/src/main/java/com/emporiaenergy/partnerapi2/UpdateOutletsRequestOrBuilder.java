// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api2.proto

package com.emporiaenergy.partnerapi2;

public interface UpdateOutletsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emporiaenergy.partner_api_2.UpdateOutletsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string auth_token = 1;</code>
   * @return The authToken.
   */
  java.lang.String getAuthToken();
  /**
   * <code>string auth_token = 1;</code>
   * @return The bytes for authToken.
   */
  com.google.protobuf.ByteString
      getAuthTokenBytes();

  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  java.util.List<com.emporiaenergy.partnerapi2.OutletSettings> 
      getOutletsList();
  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  com.emporiaenergy.partnerapi2.OutletSettings getOutlets(int index);
  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  int getOutletsCount();
  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  java.util.List<? extends com.emporiaenergy.partnerapi2.OutletSettingsOrBuilder> 
      getOutletsOrBuilderList();
  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  com.emporiaenergy.partnerapi2.OutletSettingsOrBuilder getOutletsOrBuilder(
      int index);
}
