// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner_api2.proto

package com.emporiaenergy.partnerapi2;

/**
 * <pre>
 **
 * Defines the time covered by the returned usage "bars".  Historical data is returned in buckets covering the requested duration.  
 * For example, requesting 2 hours of FifteenMinutes data will return 8 items. As described in the ChannelUsageData definition, 
 * the returned usage is in watt-hours.
 * A partial bar is a bar covering a time period that isn't yet complete such as asking for the current hour or the current day.  
 * The API will only return partial bars for DataResolution's of Days or longer.  So if you request the hour bars you won't get
 * a bar reporting the energy consumed so far in the current hour since that will change as time passes.  However, for Days
 * and longer the API will return a partial bar and the user should know that bar may change.
 * 
 * The Emporia cloud retains Minute data for one week, 15-minute data for one year and Hourly and longer data is kept indefinitely.  
 * </pre>
 *
 * Protobuf enum {@code emporiaenergy.partner_api_2.DataResolution}
 */
public enum DataResolution
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Minutes = 0;</code>
   */
  Minutes(0),
  /**
   * <code>FifteenMinutes = 1;</code>
   */
  FifteenMinutes(1),
  /**
   * <code>Hours = 2;</code>
   */
  Hours(2),
  /**
   * <code>Days = 3;</code>
   */
  Days(3),
  /**
   * <code>Weeks = 4;</code>
   */
  Weeks(4),
  /**
   * <code>Months = 5;</code>
   */
  Months(5),
  /**
   * <code>Years = 6;</code>
   */
  Years(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Minutes = 0;</code>
   */
  public static final int Minutes_VALUE = 0;
  /**
   * <code>FifteenMinutes = 1;</code>
   */
  public static final int FifteenMinutes_VALUE = 1;
  /**
   * <code>Hours = 2;</code>
   */
  public static final int Hours_VALUE = 2;
  /**
   * <code>Days = 3;</code>
   */
  public static final int Days_VALUE = 3;
  /**
   * <code>Weeks = 4;</code>
   */
  public static final int Weeks_VALUE = 4;
  /**
   * <code>Months = 5;</code>
   */
  public static final int Months_VALUE = 5;
  /**
   * <code>Years = 6;</code>
   */
  public static final int Years_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DataResolution valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataResolution forNumber(int value) {
    switch (value) {
      case 0: return Minutes;
      case 1: return FifteenMinutes;
      case 2: return Hours;
      case 3: return Days;
      case 4: return Weeks;
      case 5: return Months;
      case 6: return Years;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataResolution>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataResolution> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataResolution>() {
          public DataResolution findValueByNumber(int number) {
            return DataResolution.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.emporiaenergy.partnerapi2.PartnerApi2.getDescriptor().getEnumTypes().get(0);
  }

  private static final DataResolution[] VALUES = values();

  public static DataResolution valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataResolution(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:emporiaenergy.partner_api_2.DataResolution)
}

