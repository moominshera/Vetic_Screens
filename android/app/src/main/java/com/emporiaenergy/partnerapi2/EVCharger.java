// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api2.proto

package com.emporiaenergy.partnerapi2;

/**
 * <pre>
 ** Describes an Emporia EV Charger, a WiFi connected 48 amp level 2 Electric Vehicle charger
 * The MDI is stored in the Settings so that it can be sent back to the API to change the settings
 * 
 * If the device is not currently connected to the Emporia cloud (check the device_connected that is part of Device in the DeviceInventoryResponse),
 * the car_connected and car_charging flags below may be out of date and a call to UpdateEVChargers will fail 
 * </pre>
 *
 * Protobuf type {@code emporiaenergy.partner_api_2.EVCharger}
 */
public final class EVCharger extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:emporiaenergy.partner_api_2.EVCharger)
    EVChargerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EVCharger.newBuilder() to construct.
  private EVCharger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EVCharger() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EVCharger();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EVCharger(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            carConnected_ = input.readBool();
            break;
          }
          case 16: {

            carCharging_ = input.readBool();
            break;
          }
          case 24: {

            maxChargeRateAmps_ = input.readUInt32();
            break;
          }
          case 82: {
            com.emporiaenergy.partnerapi2.EVChargerSettings.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(com.emporiaenergy.partnerapi2.EVChargerSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(settings_);
              settings_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_EVCharger_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_EVCharger_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.emporiaenergy.partnerapi2.EVCharger.class, com.emporiaenergy.partnerapi2.EVCharger.Builder.class);
  }

  public static final int CAR_CONNECTED_FIELD_NUMBER = 1;
  private boolean carConnected_;
  /**
   * <pre>
   * is there a car connected to the EV Charger?  
   * </pre>
   *
   * <code>bool car_connected = 1;</code>
   * @return The carConnected.
   */
  @java.lang.Override
  public boolean getCarConnected() {
    return carConnected_;
  }

  public static final int CAR_CHARGING_FIELD_NUMBER = 2;
  private boolean carCharging_;
  /**
   * <pre>
   * is the car actively taking power from the charger?  If the car is connected but full or the charger is not set to On then this will be false 
   * </pre>
   *
   * <code>bool car_charging = 2;</code>
   * @return The carCharging.
   */
  @java.lang.Override
  public boolean getCarCharging() {
    return carCharging_;
  }

  public static final int MAX_CHARGE_RATE_AMPS_FIELD_NUMBER = 3;
  private int maxChargeRateAmps_;
  /**
   * <pre>
   * maximum rate that the charger may be set at; configured by the customer based on their breaker size
   * </pre>
   *
   * <code>uint32 max_charge_rate_amps = 3;</code>
   * @return The maxChargeRateAmps.
   */
  @java.lang.Override
  public int getMaxChargeRateAmps() {
    return maxChargeRateAmps_;
  }

  public static final int SETTINGS_FIELD_NUMBER = 10;
  private com.emporiaenergy.partnerapi2.EVChargerSettings settings_;
  /**
   * <pre>
   * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
   * </pre>
   *
   * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <pre>
   * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
   * </pre>
   *
   * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
   * @return The settings.
   */
  @java.lang.Override
  public com.emporiaenergy.partnerapi2.EVChargerSettings getSettings() {
    return settings_ == null ? com.emporiaenergy.partnerapi2.EVChargerSettings.getDefaultInstance() : settings_;
  }
  /**
   * <pre>
   * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
   * </pre>
   *
   * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
   */
  @java.lang.Override
  public com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder getSettingsOrBuilder() {
    return getSettings();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (carConnected_ != false) {
      output.writeBool(1, carConnected_);
    }
    if (carCharging_ != false) {
      output.writeBool(2, carCharging_);
    }
    if (maxChargeRateAmps_ != 0) {
      output.writeUInt32(3, maxChargeRateAmps_);
    }
    if (settings_ != null) {
      output.writeMessage(10, getSettings());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (carConnected_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, carConnected_);
    }
    if (carCharging_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, carCharging_);
    }
    if (maxChargeRateAmps_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, maxChargeRateAmps_);
    }
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getSettings());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.emporiaenergy.partnerapi2.EVCharger)) {
      return super.equals(obj);
    }
    com.emporiaenergy.partnerapi2.EVCharger other = (com.emporiaenergy.partnerapi2.EVCharger) obj;

    if (getCarConnected()
        != other.getCarConnected()) return false;
    if (getCarCharging()
        != other.getCarCharging()) return false;
    if (getMaxChargeRateAmps()
        != other.getMaxChargeRateAmps()) return false;
    if (hasSettings() != other.hasSettings()) return false;
    if (hasSettings()) {
      if (!getSettings()
          .equals(other.getSettings())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CAR_CONNECTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCarConnected());
    hash = (37 * hash) + CAR_CHARGING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCarCharging());
    hash = (37 * hash) + MAX_CHARGE_RATE_AMPS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxChargeRateAmps();
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.EVCharger parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.emporiaenergy.partnerapi2.EVCharger prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   ** Describes an Emporia EV Charger, a WiFi connected 48 amp level 2 Electric Vehicle charger
   * The MDI is stored in the Settings so that it can be sent back to the API to change the settings
   * 
   * If the device is not currently connected to the Emporia cloud (check the device_connected that is part of Device in the DeviceInventoryResponse),
   * the car_connected and car_charging flags below may be out of date and a call to UpdateEVChargers will fail 
   * </pre>
   *
   * Protobuf type {@code emporiaenergy.partner_api_2.EVCharger}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:emporiaenergy.partner_api_2.EVCharger)
      com.emporiaenergy.partnerapi2.EVChargerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_EVCharger_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_EVCharger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.emporiaenergy.partnerapi2.EVCharger.class, com.emporiaenergy.partnerapi2.EVCharger.Builder.class);
    }

    // Construct using com.emporiaenergy.partnerapi2.EVCharger.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      carConnected_ = false;

      carCharging_ = false;

      maxChargeRateAmps_ = 0;

      if (settingsBuilder_ == null) {
        settings_ = null;
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_EVCharger_descriptor;
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.EVCharger getDefaultInstanceForType() {
      return com.emporiaenergy.partnerapi2.EVCharger.getDefaultInstance();
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.EVCharger build() {
      com.emporiaenergy.partnerapi2.EVCharger result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.EVCharger buildPartial() {
      com.emporiaenergy.partnerapi2.EVCharger result = new com.emporiaenergy.partnerapi2.EVCharger(this);
      result.carConnected_ = carConnected_;
      result.carCharging_ = carCharging_;
      result.maxChargeRateAmps_ = maxChargeRateAmps_;
      if (settingsBuilder_ == null) {
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.emporiaenergy.partnerapi2.EVCharger) {
        return mergeFrom((com.emporiaenergy.partnerapi2.EVCharger)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.emporiaenergy.partnerapi2.EVCharger other) {
      if (other == com.emporiaenergy.partnerapi2.EVCharger.getDefaultInstance()) return this;
      if (other.getCarConnected() != false) {
        setCarConnected(other.getCarConnected());
      }
      if (other.getCarCharging() != false) {
        setCarCharging(other.getCarCharging());
      }
      if (other.getMaxChargeRateAmps() != 0) {
        setMaxChargeRateAmps(other.getMaxChargeRateAmps());
      }
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.emporiaenergy.partnerapi2.EVCharger parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.emporiaenergy.partnerapi2.EVCharger) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean carConnected_ ;
    /**
     * <pre>
     * is there a car connected to the EV Charger?  
     * </pre>
     *
     * <code>bool car_connected = 1;</code>
     * @return The carConnected.
     */
    @java.lang.Override
    public boolean getCarConnected() {
      return carConnected_;
    }
    /**
     * <pre>
     * is there a car connected to the EV Charger?  
     * </pre>
     *
     * <code>bool car_connected = 1;</code>
     * @param value The carConnected to set.
     * @return This builder for chaining.
     */
    public Builder setCarConnected(boolean value) {
      
      carConnected_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is there a car connected to the EV Charger?  
     * </pre>
     *
     * <code>bool car_connected = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCarConnected() {
      
      carConnected_ = false;
      onChanged();
      return this;
    }

    private boolean carCharging_ ;
    /**
     * <pre>
     * is the car actively taking power from the charger?  If the car is connected but full or the charger is not set to On then this will be false 
     * </pre>
     *
     * <code>bool car_charging = 2;</code>
     * @return The carCharging.
     */
    @java.lang.Override
    public boolean getCarCharging() {
      return carCharging_;
    }
    /**
     * <pre>
     * is the car actively taking power from the charger?  If the car is connected but full or the charger is not set to On then this will be false 
     * </pre>
     *
     * <code>bool car_charging = 2;</code>
     * @param value The carCharging to set.
     * @return This builder for chaining.
     */
    public Builder setCarCharging(boolean value) {
      
      carCharging_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is the car actively taking power from the charger?  If the car is connected but full or the charger is not set to On then this will be false 
     * </pre>
     *
     * <code>bool car_charging = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCarCharging() {
      
      carCharging_ = false;
      onChanged();
      return this;
    }

    private int maxChargeRateAmps_ ;
    /**
     * <pre>
     * maximum rate that the charger may be set at; configured by the customer based on their breaker size
     * </pre>
     *
     * <code>uint32 max_charge_rate_amps = 3;</code>
     * @return The maxChargeRateAmps.
     */
    @java.lang.Override
    public int getMaxChargeRateAmps() {
      return maxChargeRateAmps_;
    }
    /**
     * <pre>
     * maximum rate that the charger may be set at; configured by the customer based on their breaker size
     * </pre>
     *
     * <code>uint32 max_charge_rate_amps = 3;</code>
     * @param value The maxChargeRateAmps to set.
     * @return This builder for chaining.
     */
    public Builder setMaxChargeRateAmps(int value) {
      
      maxChargeRateAmps_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * maximum rate that the charger may be set at; configured by the customer based on their breaker size
     * </pre>
     *
     * <code>uint32 max_charge_rate_amps = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxChargeRateAmps() {
      
      maxChargeRateAmps_ = 0;
      onChanged();
      return this;
    }

    private com.emporiaenergy.partnerapi2.EVChargerSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.emporiaenergy.partnerapi2.EVChargerSettings, com.emporiaenergy.partnerapi2.EVChargerSettings.Builder, com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder> settingsBuilder_;
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
     * @return The settings.
     */
    public com.emporiaenergy.partnerapi2.EVChargerSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.emporiaenergy.partnerapi2.EVChargerSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
     */
    public Builder setSettings(com.emporiaenergy.partnerapi2.EVChargerSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
        onChanged();
      } else {
        settingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
     */
    public Builder setSettings(
        com.emporiaenergy.partnerapi2.EVChargerSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
     */
    public Builder mergeSettings(com.emporiaenergy.partnerapi2.EVChargerSettings value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            com.emporiaenergy.partnerapi2.EVChargerSettings.newBuilder(settings_).mergeFrom(value).buildPartial();
        } else {
          settings_ = value;
        }
        onChanged();
      } else {
        settingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = null;
        onChanged();
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
     */
    public com.emporiaenergy.partnerapi2.EVChargerSettings.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
     */
    public com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.emporiaenergy.partnerapi2.EVChargerSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.EVChargerSettings settings = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.emporiaenergy.partnerapi2.EVChargerSettings, com.emporiaenergy.partnerapi2.EVChargerSettings.Builder, com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.emporiaenergy.partnerapi2.EVChargerSettings, com.emporiaenergy.partnerapi2.EVChargerSettings.Builder, com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:emporiaenergy.partner_api_2.EVCharger)
  }

  // @@protoc_insertion_point(class_scope:emporiaenergy.partner_api_2.EVCharger)
  private static final com.emporiaenergy.partnerapi2.EVCharger DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.emporiaenergy.partnerapi2.EVCharger();
  }

  public static com.emporiaenergy.partnerapi2.EVCharger getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EVCharger>
      PARSER = new com.google.protobuf.AbstractParser<EVCharger>() {
    @java.lang.Override
    public EVCharger parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EVCharger(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EVCharger> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EVCharger> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.emporiaenergy.partnerapi2.EVCharger getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
