// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

public interface FmsItsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:fmsitsinterface.FmsItsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fmsitsinterface.MessageType message_type = 1;</code>
   * @return The enum numeric value on the wire for messageType.
   */
  int getMessageTypeValue();
  /**
   * <code>.fmsitsinterface.MessageType message_type = 1;</code>
   * @return The messageType.
   */
  fmsitsinterface.MessageType getMessageType();

  /**
   * <code>string vehicle_id = 2;</code>
   * @return The vehicleId.
   */
  java.lang.String getVehicleId();
  /**
   * <code>string vehicle_id = 2;</code>
   * @return The bytes for vehicleId.
   */
  com.google.protobuf.ByteString
      getVehicleIdBytes();

  /**
   * <code>.fmsitsinterface.FmsItsContainer container = 3;</code>
   * @return Whether the container field is set.
   */
  boolean hasContainer();
  /**
   * <code>.fmsitsinterface.FmsItsContainer container = 3;</code>
   * @return The container.
   */
  fmsitsinterface.FmsItsContainer getContainer();
  /**
   * <code>.fmsitsinterface.FmsItsContainer container = 3;</code>
   */
  fmsitsinterface.FmsItsContainerOrBuilder getContainerOrBuilder();
}
