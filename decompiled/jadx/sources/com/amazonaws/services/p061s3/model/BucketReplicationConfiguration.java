package com.amazonaws.services.p061s3.model;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class BucketReplicationConfiguration implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public HashMap f1707 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m1701(String str, ReplicationRule replicationRule) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Rule id cannot be null or empty.");
        }
        if (replicationRule == null) {
            throw new IllegalArgumentException("Replication rule cannot be null");
        }
        this.f1707.put(str, replicationRule);
    }
}
