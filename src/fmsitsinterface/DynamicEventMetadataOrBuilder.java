// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

public interface DynamicEventMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:fmsitsinterface.DynamicEventMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fmsitsinterface.MeasurementType event_speed = 1;</code>
   * @return Whether the eventSpeed field is set.
   */
  boolean hasEventSpeed();
  /**
   * <code>.fmsitsinterface.MeasurementType event_speed = 1;</code>
   * @return The eventSpeed.
   */
  fmsitsinterface.MeasurementType getEventSpeed();
  /**
   * <code>.fmsitsinterface.MeasurementType event_speed = 1;</code>
   */
  fmsitsinterface.MeasurementTypeOrBuilder getEventSpeedOrBuilder();

  /**
   * <pre>
   * Heading of dynamic event in degrees
   * </pre>
   *
   * <code>.fmsitsinterface.MeasurementType event_heading = 2;</code>
   * @return Whether the eventHeading field is set.
   */
  boolean hasEventHeading();
  /**
   * <pre>
   * Heading of dynamic event in degrees
   * </pre>
   *
   * <code>.fmsitsinterface.MeasurementType event_heading = 2;</code>
   * @return The eventHeading.
   */
  fmsitsinterface.MeasurementType getEventHeading();
  /**
   * <pre>
   * Heading of dynamic event in degrees
   * </pre>
   *
   * <code>.fmsitsinterface.MeasurementType event_heading = 2;</code>
   */
  fmsitsinterface.MeasurementTypeOrBuilder getEventHeadingOrBuilder();
}
