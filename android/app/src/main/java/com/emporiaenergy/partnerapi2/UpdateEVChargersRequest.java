// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api2.proto

package com.emporiaenergy.partnerapi2;

/**
 * <pre>
 * changes one or more EVChargers to the requested settings
 * </pre>
 *
 * Protobuf type {@code emporiaenergy.partner_api_2.UpdateEVChargersRequest}
 */
public final class UpdateEVChargersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:emporiaenergy.partner_api_2.UpdateEVChargersRequest)
    UpdateEVChargersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEVChargersRequest.newBuilder() to construct.
  private UpdateEVChargersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEVChargersRequest() {
    authToken_ = "";
    settings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEVChargersRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateEVChargersRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            authToken_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              settings_ = new java.util.ArrayList<com.emporiaenergy.partnerapi2.EVChargerSettings>();
              mutable_bitField0_ |= 0x00000001;
            }
            settings_.add(
                input.readMessage(com.emporiaenergy.partnerapi2.EVChargerSettings.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        settings_ = java.util.Collections.unmodifiableList(settings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateEVChargersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateEVChargersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.emporiaenergy.partnerapi2.UpdateEVChargersRequest.class, com.emporiaenergy.partnerapi2.UpdateEVChargersRequest.Builder.class);
  }

  public static final int AUTH_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object authToken_;
  /**
   * <code>string auth_token = 1;</code>
   * @return The authToken.
   */
  @java.lang.Override
  public java.lang.String getAuthToken() {
    java.lang.Object ref = authToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authToken_ = s;
      return s;
    }
  }
  /**
   * <code>string auth_token = 1;</code>
   * @return The bytes for authToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthTokenBytes() {
    java.lang.Object ref = authToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SETTINGS_FIELD_NUMBER = 2;
  private java.util.List<com.emporiaenergy.partnerapi2.EVChargerSettings> settings_;
  /**
   * <pre>
   * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.emporiaenergy.partnerapi2.EVChargerSettings> getSettingsList() {
    return settings_;
  }
  /**
   * <pre>
   * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder> 
      getSettingsOrBuilderList() {
    return settings_;
  }
  /**
   * <pre>
   * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
   */
  @java.lang.Override
  public int getSettingsCount() {
    return settings_.size();
  }
  /**
   * <pre>
   * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
   */
  @java.lang.Override
  public com.emporiaenergy.partnerapi2.EVChargerSettings getSettings(int index) {
    return settings_.get(index);
  }
  /**
   * <pre>
   * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
   */
  @java.lang.Override
  public com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder getSettingsOrBuilder(
      int index) {
    return settings_.get(index);
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
    if (!getAuthTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, authToken_);
    }
    for (int i = 0; i < settings_.size(); i++) {
      output.writeMessage(2, settings_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAuthTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, authToken_);
    }
    for (int i = 0; i < settings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, settings_.get(i));
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
    if (!(obj instanceof com.emporiaenergy.partnerapi2.UpdateEVChargersRequest)) {
      return super.equals(obj);
    }
    com.emporiaenergy.partnerapi2.UpdateEVChargersRequest other = (com.emporiaenergy.partnerapi2.UpdateEVChargersRequest) obj;

    if (!getAuthToken()
        .equals(other.getAuthToken())) return false;
    if (!getSettingsList()
        .equals(other.getSettingsList())) return false;
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
    hash = (37 * hash) + AUTH_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAuthToken().hashCode();
    if (getSettingsCount() > 0) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettingsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parseFrom(
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
  public static Builder newBuilder(com.emporiaenergy.partnerapi2.UpdateEVChargersRequest prototype) {
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
   * changes one or more EVChargers to the requested settings
   * </pre>
   *
   * Protobuf type {@code emporiaenergy.partner_api_2.UpdateEVChargersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:emporiaenergy.partner_api_2.UpdateEVChargersRequest)
      com.emporiaenergy.partnerapi2.UpdateEVChargersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateEVChargersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateEVChargersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.emporiaenergy.partnerapi2.UpdateEVChargersRequest.class, com.emporiaenergy.partnerapi2.UpdateEVChargersRequest.Builder.class);
    }

    // Construct using com.emporiaenergy.partnerapi2.UpdateEVChargersRequest.newBuilder()
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
        getSettingsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      authToken_ = "";

      if (settingsBuilder_ == null) {
        settings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        settingsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateEVChargersRequest_descriptor;
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.UpdateEVChargersRequest getDefaultInstanceForType() {
      return com.emporiaenergy.partnerapi2.UpdateEVChargersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.UpdateEVChargersRequest build() {
      com.emporiaenergy.partnerapi2.UpdateEVChargersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.UpdateEVChargersRequest buildPartial() {
      com.emporiaenergy.partnerapi2.UpdateEVChargersRequest result = new com.emporiaenergy.partnerapi2.UpdateEVChargersRequest(this);
      int from_bitField0_ = bitField0_;
      result.authToken_ = authToken_;
      if (settingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          settings_ = java.util.Collections.unmodifiableList(settings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
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
      if (other instanceof com.emporiaenergy.partnerapi2.UpdateEVChargersRequest) {
        return mergeFrom((com.emporiaenergy.partnerapi2.UpdateEVChargersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.emporiaenergy.partnerapi2.UpdateEVChargersRequest other) {
      if (other == com.emporiaenergy.partnerapi2.UpdateEVChargersRequest.getDefaultInstance()) return this;
      if (!other.getAuthToken().isEmpty()) {
        authToken_ = other.authToken_;
        onChanged();
      }
      if (settingsBuilder_ == null) {
        if (!other.settings_.isEmpty()) {
          if (settings_.isEmpty()) {
            settings_ = other.settings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSettingsIsMutable();
            settings_.addAll(other.settings_);
          }
          onChanged();
        }
      } else {
        if (!other.settings_.isEmpty()) {
          if (settingsBuilder_.isEmpty()) {
            settingsBuilder_.dispose();
            settingsBuilder_ = null;
            settings_ = other.settings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            settingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSettingsFieldBuilder() : null;
          } else {
            settingsBuilder_.addAllMessages(other.settings_);
          }
        }
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
      com.emporiaenergy.partnerapi2.UpdateEVChargersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.emporiaenergy.partnerapi2.UpdateEVChargersRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object authToken_ = "";
    /**
     * <code>string auth_token = 1;</code>
     * @return The authToken.
     */
    public java.lang.String getAuthToken() {
      java.lang.Object ref = authToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string auth_token = 1;</code>
     * @return The bytes for authToken.
     */
    public com.google.protobuf.ByteString
        getAuthTokenBytes() {
      java.lang.Object ref = authToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string auth_token = 1;</code>
     * @param value The authToken to set.
     * @return This builder for chaining.
     */
    public Builder setAuthToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      authToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string auth_token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthToken() {
      
      authToken_ = getDefaultInstance().getAuthToken();
      onChanged();
      return this;
    }
    /**
     * <code>string auth_token = 1;</code>
     * @param value The bytes for authToken to set.
     * @return This builder for chaining.
     */
    public Builder setAuthTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      authToken_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.emporiaenergy.partnerapi2.EVChargerSettings> settings_ =
      java.util.Collections.emptyList();
    private void ensureSettingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        settings_ = new java.util.ArrayList<com.emporiaenergy.partnerapi2.EVChargerSettings>(settings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.emporiaenergy.partnerapi2.EVChargerSettings, com.emporiaenergy.partnerapi2.EVChargerSettings.Builder, com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder> settingsBuilder_;

    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public java.util.List<com.emporiaenergy.partnerapi2.EVChargerSettings> getSettingsList() {
      if (settingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(settings_);
      } else {
        return settingsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public int getSettingsCount() {
      if (settingsBuilder_ == null) {
        return settings_.size();
      } else {
        return settingsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.EVChargerSettings getSettings(int index) {
      if (settingsBuilder_ == null) {
        return settings_.get(index);
      } else {
        return settingsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public Builder setSettings(
        int index, com.emporiaenergy.partnerapi2.EVChargerSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSettingsIsMutable();
        settings_.set(index, value);
        onChanged();
      } else {
        settingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public Builder setSettings(
        int index, com.emporiaenergy.partnerapi2.EVChargerSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.set(index, builderForValue.build());
        onChanged();
      } else {
        settingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public Builder addSettings(com.emporiaenergy.partnerapi2.EVChargerSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSettingsIsMutable();
        settings_.add(value);
        onChanged();
      } else {
        settingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public Builder addSettings(
        int index, com.emporiaenergy.partnerapi2.EVChargerSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSettingsIsMutable();
        settings_.add(index, value);
        onChanged();
      } else {
        settingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public Builder addSettings(
        com.emporiaenergy.partnerapi2.EVChargerSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.add(builderForValue.build());
        onChanged();
      } else {
        settingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public Builder addSettings(
        int index, com.emporiaenergy.partnerapi2.EVChargerSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.add(index, builderForValue.build());
        onChanged();
      } else {
        settingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public Builder addAllSettings(
        java.lang.Iterable<? extends com.emporiaenergy.partnerapi2.EVChargerSettings> values) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, settings_);
        onChanged();
      } else {
        settingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        settingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public Builder removeSettings(int index) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.remove(index);
        onChanged();
      } else {
        settingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.EVChargerSettings.Builder getSettingsBuilder(
        int index) {
      return getSettingsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder getSettingsOrBuilder(
        int index) {
      if (settingsBuilder_ == null) {
        return settings_.get(index);  } else {
        return settingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public java.util.List<? extends com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder> 
         getSettingsOrBuilderList() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(settings_);
      }
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.EVChargerSettings.Builder addSettingsBuilder() {
      return getSettingsFieldBuilder().addBuilder(
          com.emporiaenergy.partnerapi2.EVChargerSettings.getDefaultInstance());
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.EVChargerSettings.Builder addSettingsBuilder(
        int index) {
      return getSettingsFieldBuilder().addBuilder(
          index, com.emporiaenergy.partnerapi2.EVChargerSettings.getDefaultInstance());
    }
    /**
     * <pre>
     * one or more ev chargers to update; the caller must set at least one of the changeable fields in each EVChargerSettings.  
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.EVChargerSettings settings = 2;</code>
     */
    public java.util.List<com.emporiaenergy.partnerapi2.EVChargerSettings.Builder> 
         getSettingsBuilderList() {
      return getSettingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.emporiaenergy.partnerapi2.EVChargerSettings, com.emporiaenergy.partnerapi2.EVChargerSettings.Builder, com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.emporiaenergy.partnerapi2.EVChargerSettings, com.emporiaenergy.partnerapi2.EVChargerSettings.Builder, com.emporiaenergy.partnerapi2.EVChargerSettingsOrBuilder>(
                settings_,
                ((bitField0_ & 0x00000001) != 0),
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


    // @@protoc_insertion_point(builder_scope:emporiaenergy.partner_api_2.UpdateEVChargersRequest)
  }

  // @@protoc_insertion_point(class_scope:emporiaenergy.partner_api_2.UpdateEVChargersRequest)
  private static final com.emporiaenergy.partnerapi2.UpdateEVChargersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.emporiaenergy.partnerapi2.UpdateEVChargersRequest();
  }

  public static com.emporiaenergy.partnerapi2.UpdateEVChargersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEVChargersRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEVChargersRequest>() {
    @java.lang.Override
    public UpdateEVChargersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateEVChargersRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateEVChargersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEVChargersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.emporiaenergy.partnerapi2.UpdateEVChargersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
