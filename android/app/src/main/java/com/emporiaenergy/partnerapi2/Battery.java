// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api2.proto

package com.emporiaenergy.partnerapi2;

/**
 * <pre>
 **
 * Describes an Emporia Battery, a WiFi connected home battery with Weeyu inverter and Alpha battery packs
 * If the device is not currently connected to the Emporia cloud (device_connected for the Device in the DeviceInventoryResponse is false),
 * the soc_percentage isn't known and won't be provided.  Calling UpdateBatteries will fail for a disconnected Battery.
 * </pre>
 *
 * Protobuf type {@code emporiaenergy.partner_api_2.Battery}
 */
public final class Battery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:emporiaenergy.partner_api_2.Battery)
    BatteryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Battery.newBuilder() to construct.
  private Battery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Battery() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Battery();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Battery(
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
          case 9: {

            capacityKwhs_ = input.readDouble();
            break;
          }
          case 17: {

            inverterMaxPowerKwatts_ = input.readDouble();
            break;
          }
          case 26: {
            com.google.protobuf.DoubleValue.Builder subBuilder = null;
            if (socPercentage_ != null) {
              subBuilder = socPercentage_.toBuilder();
            }
            socPercentage_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(socPercentage_);
              socPercentage_ = subBuilder.buildPartial();
            }

            break;
          }
          case 82: {
            com.emporiaenergy.partnerapi2.BatterySettings.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(com.emporiaenergy.partnerapi2.BatterySettings.parser(), extensionRegistry);
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
    return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_Battery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_Battery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.emporiaenergy.partnerapi2.Battery.class, com.emporiaenergy.partnerapi2.Battery.Builder.class);
  }

  public static final int CAPACITY_KWHS_FIELD_NUMBER = 1;
  private double capacityKwhs_;
  /**
   * <pre>
   * the maximum capacity of the battery in kilowatt-hours
   * </pre>
   *
   * <code>double capacity_kwhs = 1;</code>
   * @return The capacityKwhs.
   */
  @java.lang.Override
  public double getCapacityKwhs() {
    return capacityKwhs_;
  }

  public static final int INVERTER_MAX_POWER_KWATTS_FIELD_NUMBER = 2;
  private double inverterMaxPowerKwatts_;
  /**
   * <pre>
   * the maximum power of the inverter in kWatts
   * </pre>
   *
   * <code>double inverter_max_power_kwatts = 2;</code>
   * @return The inverterMaxPowerKwatts.
   */
  @java.lang.Override
  public double getInverterMaxPowerKwatts() {
    return inverterMaxPowerKwatts_;
  }

  public static final int SOC_PERCENTAGE_FIELD_NUMBER = 3;
  private com.google.protobuf.DoubleValue socPercentage_;
  /**
   * <pre>
   * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
   * @return Whether the socPercentage field is set.
   */
  @java.lang.Override
  public boolean hasSocPercentage() {
    return socPercentage_ != null;
  }
  /**
   * <pre>
   * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
   * @return The socPercentage.
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValue getSocPercentage() {
    return socPercentage_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : socPercentage_;
  }
  /**
   * <pre>
   * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValueOrBuilder getSocPercentageOrBuilder() {
    return getSocPercentage();
  }

  public static final int SETTINGS_FIELD_NUMBER = 10;
  private com.emporiaenergy.partnerapi2.BatterySettings settings_;
  /**
   * <pre>
   * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
   * </pre>
   *
   * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
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
   * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
   * @return The settings.
   */
  @java.lang.Override
  public com.emporiaenergy.partnerapi2.BatterySettings getSettings() {
    return settings_ == null ? com.emporiaenergy.partnerapi2.BatterySettings.getDefaultInstance() : settings_;
  }
  /**
   * <pre>
   * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
   * </pre>
   *
   * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
   */
  @java.lang.Override
  public com.emporiaenergy.partnerapi2.BatterySettingsOrBuilder getSettingsOrBuilder() {
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
    if (capacityKwhs_ != 0D) {
      output.writeDouble(1, capacityKwhs_);
    }
    if (inverterMaxPowerKwatts_ != 0D) {
      output.writeDouble(2, inverterMaxPowerKwatts_);
    }
    if (socPercentage_ != null) {
      output.writeMessage(3, getSocPercentage());
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
    if (capacityKwhs_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, capacityKwhs_);
    }
    if (inverterMaxPowerKwatts_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, inverterMaxPowerKwatts_);
    }
    if (socPercentage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSocPercentage());
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
    if (!(obj instanceof com.emporiaenergy.partnerapi2.Battery)) {
      return super.equals(obj);
    }
    com.emporiaenergy.partnerapi2.Battery other = (com.emporiaenergy.partnerapi2.Battery) obj;

    if (java.lang.Double.doubleToLongBits(getCapacityKwhs())
        != java.lang.Double.doubleToLongBits(
            other.getCapacityKwhs())) return false;
    if (java.lang.Double.doubleToLongBits(getInverterMaxPowerKwatts())
        != java.lang.Double.doubleToLongBits(
            other.getInverterMaxPowerKwatts())) return false;
    if (hasSocPercentage() != other.hasSocPercentage()) return false;
    if (hasSocPercentage()) {
      if (!getSocPercentage()
          .equals(other.getSocPercentage())) return false;
    }
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
    hash = (37 * hash) + CAPACITY_KWHS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCapacityKwhs()));
    hash = (37 * hash) + INVERTER_MAX_POWER_KWATTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getInverterMaxPowerKwatts()));
    if (hasSocPercentage()) {
      hash = (37 * hash) + SOC_PERCENTAGE_FIELD_NUMBER;
      hash = (53 * hash) + getSocPercentage().hashCode();
    }
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.emporiaenergy.partnerapi2.Battery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.Battery parseFrom(
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
  public static Builder newBuilder(com.emporiaenergy.partnerapi2.Battery prototype) {
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
   **
   * Describes an Emporia Battery, a WiFi connected home battery with Weeyu inverter and Alpha battery packs
   * If the device is not currently connected to the Emporia cloud (device_connected for the Device in the DeviceInventoryResponse is false),
   * the soc_percentage isn't known and won't be provided.  Calling UpdateBatteries will fail for a disconnected Battery.
   * </pre>
   *
   * Protobuf type {@code emporiaenergy.partner_api_2.Battery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:emporiaenergy.partner_api_2.Battery)
      com.emporiaenergy.partnerapi2.BatteryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_Battery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_Battery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.emporiaenergy.partnerapi2.Battery.class, com.emporiaenergy.partnerapi2.Battery.Builder.class);
    }

    // Construct using com.emporiaenergy.partnerapi2.Battery.newBuilder()
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
      capacityKwhs_ = 0D;

      inverterMaxPowerKwatts_ = 0D;

      if (socPercentageBuilder_ == null) {
        socPercentage_ = null;
      } else {
        socPercentage_ = null;
        socPercentageBuilder_ = null;
      }
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
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_Battery_descriptor;
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.Battery getDefaultInstanceForType() {
      return com.emporiaenergy.partnerapi2.Battery.getDefaultInstance();
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.Battery build() {
      com.emporiaenergy.partnerapi2.Battery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.Battery buildPartial() {
      com.emporiaenergy.partnerapi2.Battery result = new com.emporiaenergy.partnerapi2.Battery(this);
      result.capacityKwhs_ = capacityKwhs_;
      result.inverterMaxPowerKwatts_ = inverterMaxPowerKwatts_;
      if (socPercentageBuilder_ == null) {
        result.socPercentage_ = socPercentage_;
      } else {
        result.socPercentage_ = socPercentageBuilder_.build();
      }
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
      if (other instanceof com.emporiaenergy.partnerapi2.Battery) {
        return mergeFrom((com.emporiaenergy.partnerapi2.Battery)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.emporiaenergy.partnerapi2.Battery other) {
      if (other == com.emporiaenergy.partnerapi2.Battery.getDefaultInstance()) return this;
      if (other.getCapacityKwhs() != 0D) {
        setCapacityKwhs(other.getCapacityKwhs());
      }
      if (other.getInverterMaxPowerKwatts() != 0D) {
        setInverterMaxPowerKwatts(other.getInverterMaxPowerKwatts());
      }
      if (other.hasSocPercentage()) {
        mergeSocPercentage(other.getSocPercentage());
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
      com.emporiaenergy.partnerapi2.Battery parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.emporiaenergy.partnerapi2.Battery) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double capacityKwhs_ ;
    /**
     * <pre>
     * the maximum capacity of the battery in kilowatt-hours
     * </pre>
     *
     * <code>double capacity_kwhs = 1;</code>
     * @return The capacityKwhs.
     */
    @java.lang.Override
    public double getCapacityKwhs() {
      return capacityKwhs_;
    }
    /**
     * <pre>
     * the maximum capacity of the battery in kilowatt-hours
     * </pre>
     *
     * <code>double capacity_kwhs = 1;</code>
     * @param value The capacityKwhs to set.
     * @return This builder for chaining.
     */
    public Builder setCapacityKwhs(double value) {
      
      capacityKwhs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the maximum capacity of the battery in kilowatt-hours
     * </pre>
     *
     * <code>double capacity_kwhs = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCapacityKwhs() {
      
      capacityKwhs_ = 0D;
      onChanged();
      return this;
    }

    private double inverterMaxPowerKwatts_ ;
    /**
     * <pre>
     * the maximum power of the inverter in kWatts
     * </pre>
     *
     * <code>double inverter_max_power_kwatts = 2;</code>
     * @return The inverterMaxPowerKwatts.
     */
    @java.lang.Override
    public double getInverterMaxPowerKwatts() {
      return inverterMaxPowerKwatts_;
    }
    /**
     * <pre>
     * the maximum power of the inverter in kWatts
     * </pre>
     *
     * <code>double inverter_max_power_kwatts = 2;</code>
     * @param value The inverterMaxPowerKwatts to set.
     * @return This builder for chaining.
     */
    public Builder setInverterMaxPowerKwatts(double value) {
      
      inverterMaxPowerKwatts_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the maximum power of the inverter in kWatts
     * </pre>
     *
     * <code>double inverter_max_power_kwatts = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInverterMaxPowerKwatts() {
      
      inverterMaxPowerKwatts_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.DoubleValue socPercentage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> socPercentageBuilder_;
    /**
     * <pre>
     * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
     * @return Whether the socPercentage field is set.
     */
    public boolean hasSocPercentage() {
      return socPercentageBuilder_ != null || socPercentage_ != null;
    }
    /**
     * <pre>
     * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
     * @return The socPercentage.
     */
    public com.google.protobuf.DoubleValue getSocPercentage() {
      if (socPercentageBuilder_ == null) {
        return socPercentage_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : socPercentage_;
      } else {
        return socPercentageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
     */
    public Builder setSocPercentage(com.google.protobuf.DoubleValue value) {
      if (socPercentageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        socPercentage_ = value;
        onChanged();
      } else {
        socPercentageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
     */
    public Builder setSocPercentage(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (socPercentageBuilder_ == null) {
        socPercentage_ = builderForValue.build();
        onChanged();
      } else {
        socPercentageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
     */
    public Builder mergeSocPercentage(com.google.protobuf.DoubleValue value) {
      if (socPercentageBuilder_ == null) {
        if (socPercentage_ != null) {
          socPercentage_ =
            com.google.protobuf.DoubleValue.newBuilder(socPercentage_).mergeFrom(value).buildPartial();
        } else {
          socPercentage_ = value;
        }
        onChanged();
      } else {
        socPercentageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
     */
    public Builder clearSocPercentage() {
      if (socPercentageBuilder_ == null) {
        socPercentage_ = null;
        onChanged();
      } else {
        socPercentage_ = null;
        socPercentageBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
     */
    public com.google.protobuf.DoubleValue.Builder getSocPercentageBuilder() {
      
      onChanged();
      return getSocPercentageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getSocPercentageOrBuilder() {
      if (socPercentageBuilder_ != null) {
        return socPercentageBuilder_.getMessageOrBuilder();
      } else {
        return socPercentage_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : socPercentage_;
      }
    }
    /**
     * <pre>
     * the current State of Charge of the battery, as a percentage 1 to 100 (inclusive) 
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue soc_percentage = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getSocPercentageFieldBuilder() {
      if (socPercentageBuilder_ == null) {
        socPercentageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getSocPercentage(),
                getParentForChildren(),
                isClean());
        socPercentage_ = null;
      }
      return socPercentageBuilder_;
    }

    private com.emporiaenergy.partnerapi2.BatterySettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.emporiaenergy.partnerapi2.BatterySettings, com.emporiaenergy.partnerapi2.BatterySettings.Builder, com.emporiaenergy.partnerapi2.BatterySettingsOrBuilder> settingsBuilder_;
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
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
     * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
     * @return The settings.
     */
    public com.emporiaenergy.partnerapi2.BatterySettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.emporiaenergy.partnerapi2.BatterySettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
     */
    public Builder setSettings(com.emporiaenergy.partnerapi2.BatterySettings value) {
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
     * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
     */
    public Builder setSettings(
        com.emporiaenergy.partnerapi2.BatterySettings.Builder builderForValue) {
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
     * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
     */
    public Builder mergeSettings(com.emporiaenergy.partnerapi2.BatterySettings value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            com.emporiaenergy.partnerapi2.BatterySettings.newBuilder(settings_).mergeFrom(value).buildPartial();
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
     * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
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
     * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
     */
    public com.emporiaenergy.partnerapi2.BatterySettings.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
     */
    public com.emporiaenergy.partnerapi2.BatterySettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.emporiaenergy.partnerapi2.BatterySettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <pre>
     * the settings that may be changed using the API, starting at a higher index to leave room for additional non-changeable fields
     * </pre>
     *
     * <code>.emporiaenergy.partner_api_2.BatterySettings settings = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.emporiaenergy.partnerapi2.BatterySettings, com.emporiaenergy.partnerapi2.BatterySettings.Builder, com.emporiaenergy.partnerapi2.BatterySettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.emporiaenergy.partnerapi2.BatterySettings, com.emporiaenergy.partnerapi2.BatterySettings.Builder, com.emporiaenergy.partnerapi2.BatterySettingsOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:emporiaenergy.partner_api_2.Battery)
  }

  // @@protoc_insertion_point(class_scope:emporiaenergy.partner_api_2.Battery)
  private static final com.emporiaenergy.partnerapi2.Battery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.emporiaenergy.partnerapi2.Battery();
  }

  public static com.emporiaenergy.partnerapi2.Battery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Battery>
      PARSER = new com.google.protobuf.AbstractParser<Battery>() {
    @java.lang.Override
    public Battery parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Battery(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Battery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Battery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.emporiaenergy.partnerapi2.Battery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

