// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wallet.proto

package com.pvelilla.walletProto.proto;

public interface APIResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:APIResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.STATUS status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.STATUS status = 1;</code>
   */
  com.pvelilla.walletProto.proto.STATUS getStatus();

  /**
   * <code>string statusMessage = 2;</code>
   */
  java.lang.String getStatusMessage();
  /**
   * <code>string statusMessage = 2;</code>
   */
  com.google.protobuf.ByteString
      getStatusMessageBytes();

  /**
   * <code>.OPERATION operation = 3;</code>
   */
  int getOperationValue();
  /**
   * <code>.OPERATION operation = 3;</code>
   */
  com.pvelilla.walletProto.proto.OPERATION getOperation();
}
