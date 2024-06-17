// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

public interface SpeedInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:fmsitsinterface.SpeedInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * maximum speed limit, its_event_code MAXIMUM_SPEED
   * </pre>
   *
   * <code>int32 maximum_speed_limit = 1;</code>
   * @return The maximumSpeedLimit.
   */
  int getMaximumSpeedLimit();

  /**
   * <pre>
   * optimal speed, its_event_code ADVISORY_SPEED_LIMIT
   * </pre>
   *
   * <code>int32 optimal_speed = 2;</code>
   * @return The optimalSpeed.
   */
  int getOptimalSpeed();

  /**
   * <pre>
   * units in which maximumSpeedLimit and optimalSpeed are expressed, , its_event_code MAXIMUM_SPEED or ADVISORY_SPEED_LIMIT
   * </pre>
   *
   * <code>.fmsitsinterface.MeasurementUnit speed_limit_unit = 3;</code>
   * @return The enum numeric value on the wire for speedLimitUnit.
   */
  int getSpeedLimitUnitValue();
  /**
   * <pre>
   * units in which maximumSpeedLimit and optimalSpeed are expressed, , its_event_code MAXIMUM_SPEED or ADVISORY_SPEED_LIMIT
   * </pre>
   *
   * <code>.fmsitsinterface.MeasurementUnit speed_limit_unit = 3;</code>
   * @return The speedLimitUnit.
   */
  fmsitsinterface.MeasurementUnit getSpeedLimitUnit();
}
