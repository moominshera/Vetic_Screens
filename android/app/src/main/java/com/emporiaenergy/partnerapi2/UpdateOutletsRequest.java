// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api2.proto

package com.emporiaenergy.partnerapi2;

/**
 * <pre>
 * Used by the UpdateOutlets method to turn an Outlet on or off
 * </pre>
 *
 * Protobuf type {@code emporiaenergy.partner_api_2.UpdateOutletsRequest}
 */
public final class UpdateOutletsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:emporiaenergy.partner_api_2.UpdateOutletsRequest)
    UpdateOutletsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateOutletsRequest.newBuilder() to construct.
  private UpdateOutletsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateOutletsRequest() {
    authToken_ = "";
    outlets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateOutletsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateOutletsRequest(
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
              outlets_ = new java.util.ArrayList<com.emporiaenergy.partnerapi2.OutletSettings>();
              mutable_bitField0_ |= 0x00000001;
            }
            outlets_.add(
                input.readMessage(com.emporiaenergy.partnerapi2.OutletSettings.parser(), extensionRegistry));
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
        outlets_ = java.util.Collections.unmodifiableList(outlets_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateOutletsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateOutletsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.emporiaenergy.partnerapi2.UpdateOutletsRequest.class, com.emporiaenergy.partnerapi2.UpdateOutletsRequest.Builder.class);
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

  public static final int OUTLETS_FIELD_NUMBER = 2;
  private java.util.List<com.emporiaenergy.partnerapi2.OutletSettings> outlets_;
  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.emporiaenergy.partnerapi2.OutletSettings> getOutletsList() {
    return outlets_;
  }
  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.emporiaenergy.partnerapi2.OutletSettingsOrBuilder> 
      getOutletsOrBuilderList() {
    return outlets_;
  }
  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  @java.lang.Override
  public int getOutletsCount() {
    return outlets_.size();
  }
  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  @java.lang.Override
  public com.emporiaenergy.partnerapi2.OutletSettings getOutlets(int index) {
    return outlets_.get(index);
  }
  /**
   * <pre>
   * a list of one or more outlets with on set to the desired on/off state
   * </pre>
   *
   * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
   */
  @java.lang.Override
  public com.emporiaenergy.partnerapi2.OutletSettingsOrBuilder getOutletsOrBuilder(
      int index) {
    return outlets_.get(index);
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
    for (int i = 0; i < outlets_.size(); i++) {
      output.writeMessage(2, outlets_.get(i));
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
    for (int i = 0; i < outlets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, outlets_.get(i));
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
    if (!(obj instanceof com.emporiaenergy.partnerapi2.UpdateOutletsRequest)) {
      return super.equals(obj);
    }
    com.emporiaenergy.partnerapi2.UpdateOutletsRequest other = (com.emporiaenergy.partnerapi2.UpdateOutletsRequest) obj;

    if (!getAuthToken()
        .equals(other.getAuthToken())) return false;
    if (!getOutletsList()
        .equals(other.getOutletsList())) return false;
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
    if (getOutletsCount() > 0) {
      hash = (37 * hash) + OUTLETS_FIELD_NUMBER;
      hash = (53 * hash) + getOutletsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest parseFrom(
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
  public static Builder newBuilder(com.emporiaenergy.partnerapi2.UpdateOutletsRequest prototype) {
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
   * Used by the UpdateOutlets method to turn an Outlet on or off
   * </pre>
   *
   * Protobuf type {@code emporiaenergy.partner_api_2.UpdateOutletsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:emporiaenergy.partner_api_2.UpdateOutletsRequest)
      com.emporiaenergy.partnerapi2.UpdateOutletsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateOutletsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateOutletsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.emporiaenergy.partnerapi2.UpdateOutletsRequest.class, com.emporiaenergy.partnerapi2.UpdateOutletsRequest.Builder.class);
    }

    // Construct using com.emporiaenergy.partnerapi2.UpdateOutletsRequest.newBuilder()
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
        getOutletsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      authToken_ = "";

      if (outletsBuilder_ == null) {
        outlets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        outletsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.emporiaenergy.partnerapi2.PartnerApi2.internal_static_emporiaenergy_partner_api_2_UpdateOutletsRequest_descriptor;
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.UpdateOutletsRequest getDefaultInstanceForType() {
      return com.emporiaenergy.partnerapi2.UpdateOutletsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.UpdateOutletsRequest build() {
      com.emporiaenergy.partnerapi2.UpdateOutletsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.emporiaenergy.partnerapi2.UpdateOutletsRequest buildPartial() {
      com.emporiaenergy.partnerapi2.UpdateOutletsRequest result = new com.emporiaenergy.partnerapi2.UpdateOutletsRequest(this);
      int from_bitField0_ = bitField0_;
      result.authToken_ = authToken_;
      if (outletsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          outlets_ = java.util.Collections.unmodifiableList(outlets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.outlets_ = outlets_;
      } else {
        result.outlets_ = outletsBuilder_.build();
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
      if (other instanceof com.emporiaenergy.partnerapi2.UpdateOutletsRequest) {
        return mergeFrom((com.emporiaenergy.partnerapi2.UpdateOutletsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.emporiaenergy.partnerapi2.UpdateOutletsRequest other) {
      if (other == com.emporiaenergy.partnerapi2.UpdateOutletsRequest.getDefaultInstance()) return this;
      if (!other.getAuthToken().isEmpty()) {
        authToken_ = other.authToken_;
        onChanged();
      }
      if (outletsBuilder_ == null) {
        if (!other.outlets_.isEmpty()) {
          if (outlets_.isEmpty()) {
            outlets_ = other.outlets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOutletsIsMutable();
            outlets_.addAll(other.outlets_);
          }
          onChanged();
        }
      } else {
        if (!other.outlets_.isEmpty()) {
          if (outletsBuilder_.isEmpty()) {
            outletsBuilder_.dispose();
            outletsBuilder_ = null;
            outlets_ = other.outlets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            outletsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOutletsFieldBuilder() : null;
          } else {
            outletsBuilder_.addAllMessages(other.outlets_);
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
      com.emporiaenergy.partnerapi2.UpdateOutletsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.emporiaenergy.partnerapi2.UpdateOutletsRequest) e.getUnfinishedMessage();
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

    private java.util.List<com.emporiaenergy.partnerapi2.OutletSettings> outlets_ =
      java.util.Collections.emptyList();
    private void ensureOutletsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        outlets_ = new java.util.ArrayList<com.emporiaenergy.partnerapi2.OutletSettings>(outlets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.emporiaenergy.partnerapi2.OutletSettings, com.emporiaenergy.partnerapi2.OutletSettings.Builder, com.emporiaenergy.partnerapi2.OutletSettingsOrBuilder> outletsBuilder_;

    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public java.util.List<com.emporiaenergy.partnerapi2.OutletSettings> getOutletsList() {
      if (outletsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(outlets_);
      } else {
        return outletsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public int getOutletsCount() {
      if (outletsBuilder_ == null) {
        return outlets_.size();
      } else {
        return outletsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.OutletSettings getOutlets(int index) {
      if (outletsBuilder_ == null) {
        return outlets_.get(index);
      } else {
        return outletsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public Builder setOutlets(
        int index, com.emporiaenergy.partnerapi2.OutletSettings value) {
      if (outletsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutletsIsMutable();
        outlets_.set(index, value);
        onChanged();
      } else {
        outletsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public Builder setOutlets(
        int index, com.emporiaenergy.partnerapi2.OutletSettings.Builder builderForValue) {
      if (outletsBuilder_ == null) {
        ensureOutletsIsMutable();
        outlets_.set(index, builderForValue.build());
        onChanged();
      } else {
        outletsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public Builder addOutlets(com.emporiaenergy.partnerapi2.OutletSettings value) {
      if (outletsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutletsIsMutable();
        outlets_.add(value);
        onChanged();
      } else {
        outletsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public Builder addOutlets(
        int index, com.emporiaenergy.partnerapi2.OutletSettings value) {
      if (outletsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutletsIsMutable();
        outlets_.add(index, value);
        onChanged();
      } else {
        outletsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public Builder addOutlets(
        com.emporiaenergy.partnerapi2.OutletSettings.Builder builderForValue) {
      if (outletsBuilder_ == null) {
        ensureOutletsIsMutable();
        outlets_.add(builderForValue.build());
        onChanged();
      } else {
        outletsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public Builder addOutlets(
        int index, com.emporiaenergy.partnerapi2.OutletSettings.Builder builderForValue) {
      if (outletsBuilder_ == null) {
        ensureOutletsIsMutable();
        outlets_.add(index, builderForValue.build());
        onChanged();
      } else {
        outletsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public Builder addAllOutlets(
        java.lang.Iterable<? extends com.emporiaenergy.partnerapi2.OutletSettings> values) {
      if (outletsBuilder_ == null) {
        ensureOutletsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, outlets_);
        onChanged();
      } else {
        outletsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public Builder clearOutlets() {
      if (outletsBuilder_ == null) {
        outlets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        outletsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public Builder removeOutlets(int index) {
      if (outletsBuilder_ == null) {
        ensureOutletsIsMutable();
        outlets_.remove(index);
        onChanged();
      } else {
        outletsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.OutletSettings.Builder getOutletsBuilder(
        int index) {
      return getOutletsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.OutletSettingsOrBuilder getOutletsOrBuilder(
        int index) {
      if (outletsBuilder_ == null) {
        return outlets_.get(index);  } else {
        return outletsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public java.util.List<? extends com.emporiaenergy.partnerapi2.OutletSettingsOrBuilder> 
         getOutletsOrBuilderList() {
      if (outletsBuilder_ != null) {
        return outletsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(outlets_);
      }
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.OutletSettings.Builder addOutletsBuilder() {
      return getOutletsFieldBuilder().addBuilder(
          com.emporiaenergy.partnerapi2.OutletSettings.getDefaultInstance());
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public com.emporiaenergy.partnerapi2.OutletSettings.Builder addOutletsBuilder(
        int index) {
      return getOutletsFieldBuilder().addBuilder(
          index, com.emporiaenergy.partnerapi2.OutletSettings.getDefaultInstance());
    }
    /**
     * <pre>
     * a list of one or more outlets with on set to the desired on/off state
     * </pre>
     *
     * <code>repeated .emporiaenergy.partner_api_2.OutletSettings outlets = 2;</code>
     */
    public java.util.List<com.emporiaenergy.partnerapi2.OutletSettings.Builder> 
         getOutletsBuilderList() {
      return getOutletsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.emporiaenergy.partnerapi2.OutletSettings, com.emporiaenergy.partnerapi2.OutletSettings.Builder, com.emporiaenergy.partnerapi2.OutletSettingsOrBuilder> 
        getOutletsFieldBuilder() {
      if (outletsBuilder_ == null) {
        outletsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.emporiaenergy.partnerapi2.OutletSettings, com.emporiaenergy.partnerapi2.OutletSettings.Builder, com.emporiaenergy.partnerapi2.OutletSettingsOrBuilder>(
                outlets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        outlets_ = null;
      }
      return outletsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:emporiaenergy.partner_api_2.UpdateOutletsRequest)
  }

  // @@protoc_insertion_point(class_scope:emporiaenergy.partner_api_2.UpdateOutletsRequest)
  private static final com.emporiaenergy.partnerapi2.UpdateOutletsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.emporiaenergy.partnerapi2.UpdateOutletsRequest();
  }

  public static com.emporiaenergy.partnerapi2.UpdateOutletsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateOutletsRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateOutletsRequest>() {
    @java.lang.Override
    public UpdateOutletsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateOutletsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateOutletsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateOutletsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.emporiaenergy.partnerapi2.UpdateOutletsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
