// Copyright 2012 Android Laboratories, Inc.

package com.darkzero.net;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

/**
 * Test protos.
 */
public final class NetProtoTest {

  @Test
  public void testSanity() {
    NetProto.Request.Query query1 = NetProtoUtil.createQuery();
    NetProto.Response.Result result1 = NetProtoUtil.createResult(query1);
    assertTrue(query1.hasId());
    assertEquals(query1.getId(), result1.getId());
    assertEquals(query1.getVersion(), result1.getVersion());

    NetProto.Request.Query query2 = NetProtoUtil.createQuery(query1.toBuilder());
    NetProto.Response.Result result2 = NetProtoUtil.createResult(query2);
    assertNotSame(result1.getVersion(), result2.getVersion());
  }
}
