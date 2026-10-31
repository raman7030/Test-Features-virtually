package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class BucketReplicationConfiguration implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f547 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m535(String str, ReplicationRule replicationRule) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Rule id cannot be null or empty.");
        }
        if (replicationRule == null) {
            throw new IllegalArgumentException("Replication rule cannot be null");
        }
        this.f547.put(str, replicationRule);
    }
}
