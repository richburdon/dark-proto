// Copyright 2012 Android Laboratories, Inc.

package com.darkzero.net;

/**
 * Class utility.
 */
public final class NetProtoUtil {

  private NetProtoUtil() {}

  static int counter = 0;

  public static NetProto.Request.Query createQuery() {
    return createQuery(NetProto.Request.Query.newBuilder()
        .setId("Q-" + (++counter))
        .setVersion(0));
  }

  public static NetProto.Request.Query createQuery(NetProto.Request.Query.Builder builder) {
    return builder
        .setVersion(builder.getVersion() + 1)
        .build();
  }

  public static NetProto.Response.Result createResult(NetProto.Request.Query query) {
    return NetProto.Response.Result.newBuilder()
        .setId(query.getId())
        .setVersion(query.getVersion())
        .build();
  }

}
