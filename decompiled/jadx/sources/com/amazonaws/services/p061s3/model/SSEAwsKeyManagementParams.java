package com.amazonaws.services.p061s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class SSEAwsKeyManagementParams implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final String f1828;

    public SSEAwsKeyManagementParams(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("AWS Key Management System Key id cannot be null");
        }
        this.f1828 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m1836() {
        return this.f1828;
    }
}
