// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wallet.proto

package com.pvelilla.walletProto.proto;

public final class WalletProtoClass {
  private WalletProtoClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_APIResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_APIResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014wallet.proto\"F\n\007Request\022\016\n\006userId\030\001 \001(" +
      "\003\022\016\n\006amount\030\002 \001(\003\022\033\n\010currency\030\003 \001(\0162\t.CU" +
      "RRENCY\"\\\n\013APIResponse\022\027\n\006status\030\001 \001(\0162\007." +
      "STATUS\022\025\n\rstatusMessage\030\002 \001(\t\022\035\n\toperati" +
      "on\030\003 \001(\0162\n.OPERATION*1\n\006STATUS\022\022\n\016OK_TRA" +
      "NSACTION\020\000\022\023\n\017ERR_TRANSACTION\020\001*3\n\tOPERA" +
      "TION\022\013\n\007DEPOSIT\020\000\022\014\n\010WITHDRAW\020\001\022\013\n\007BALAN" +
      "CE\020\002*%\n\010CURRENCY\022\007\n\003USD\020\000\022\007\n\003EUR\020\001\022\007\n\003GB" +
      "P\020\002*\227\001\n\rStatusMessage\022\027\n\023USER_DOES_NOT_E" +
      "XIST\020\000\022\025\n\021INVALID_ARGUMENTS\020\001\022\030\n\024INSUFFI" +
      "CIENT_BALANCE\020\002\022&\n\"AMOUNT_SHOULD_BE_GREA" +
      "TER_THAN_ZERO\020\003\022\024\n\020INVALID_CURRENCY\020\0042\202\001" +
      "\n\rWalletService\022#\n\007deposit\022\010.Request\032\014.A" +
      "PIResponse\"\000\022$\n\010withdraw\022\010.Request\032\014.API" +
      "Response\"\000\022&\n\ngetBalance\022\010.Request\032\014.API" +
      "Response\"\000B9\n\036com.pvelilla.walletProto.p" +
      "rotoB\020WalletProtoClassP\001\242\002\002WCb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Request_descriptor,
        new java.lang.String[] { "UserId", "Amount", "Currency", });
    internal_static_APIResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_APIResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_APIResponse_descriptor,
        new java.lang.String[] { "Status", "StatusMessage", "Operation", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}