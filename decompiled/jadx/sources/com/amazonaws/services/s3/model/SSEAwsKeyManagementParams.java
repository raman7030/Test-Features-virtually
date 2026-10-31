package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class SSEAwsKeyManagementParams implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f668;

    public SSEAwsKeyManagementParams(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("AWS Key Management System Key id cannot be null");
        }
        this.f668 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m671() {
        return this.f668;
    }
}
