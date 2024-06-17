// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

public interface TrafficLightTimingInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:fmsitsinterface.TrafficLightTimingInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The element minEndTime is used to convey the earliest time possible at which the phase could change, except when unpredictable events relating to a pre-emption or priority call disrupt a currently active timing plan. (UTC+00:00).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp min_end_time = 1;</code>
   * @return Whether the minEndTime field is set.
   */
  boolean hasMinEndTime();
  /**
   * <pre>
   * The element minEndTime is used to convey the earliest time possible at which the phase could change, except when unpredictable events relating to a pre-emption or priority call disrupt a currently active timing plan. (UTC+00:00).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp min_end_time = 1;</code>
   * @return The minEndTime.
   */
  com.google.protobuf.Timestamp getMinEndTime();
  /**
   * <pre>
   * The element minEndTime is used to convey the earliest time possible at which the phase could change, except when unpredictable events relating to a pre-emption or priority call disrupt a currently active timing plan. (UTC+00:00).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp min_end_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMinEndTimeOrBuilder();

  /**
   * <pre>
   * The element MaxEndTime is used to convey the latest time possible which the phase could change, except when unpredictable events relating to a pre-emption or priority call come into play and disrupt a currently active timing plan. (UTC+00:00)"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp max_end_time = 2;</code>
   * @return Whether the maxEndTime field is set.
   */
  boolean hasMaxEndTime();
  /**
   * <pre>
   * The element MaxEndTime is used to convey the latest time possible which the phase could change, except when unpredictable events relating to a pre-emption or priority call come into play and disrupt a currently active timing plan. (UTC+00:00)"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp max_end_time = 2;</code>
   * @return The maxEndTime.
   */
  com.google.protobuf.Timestamp getMaxEndTime();
  /**
   * <pre>
   * The element MaxEndTime is used to convey the latest time possible which the phase could change, except when unpredictable events relating to a pre-emption or priority call come into play and disrupt a currently active timing plan. (UTC+00:00)"
   * </pre>
   *
   * <code>.google.protobuf.Timestamp max_end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMaxEndTimeOrBuilder();

  /**
   * <pre>
   * The element likelyTime is used to convey the most likely time the phase changes. This occurs between MinEndTime and MaxEndTime and is only relevant for traffic-actuated control programs. (UTC+00:00).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp likely_time = 3;</code>
   * @return Whether the likelyTime field is set.
   */
  boolean hasLikelyTime();
  /**
   * <pre>
   * The element likelyTime is used to convey the most likely time the phase changes. This occurs between MinEndTime and MaxEndTime and is only relevant for traffic-actuated control programs. (UTC+00:00).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp likely_time = 3;</code>
   * @return The likelyTime.
   */
  com.google.protobuf.Timestamp getLikelyTime();
  /**
   * <pre>
   * The element likelyTime is used to convey the most likely time the phase changes. This occurs between MinEndTime and MaxEndTime and is only relevant for traffic-actuated control programs. (UTC+00:00).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp likely_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLikelyTimeOrBuilder();
}