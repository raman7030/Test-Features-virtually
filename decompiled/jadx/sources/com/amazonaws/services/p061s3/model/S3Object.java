package com.amazonaws.services.p061s3.model;

import com.amazonaws.services.p061s3.internal.S3RequesterChargedResult;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import p067l.C10965;

/* JADX INFO: loaded from: classes.dex */
public class S3Object implements Closeable, Serializable, S3RequesterChargedResult {

    /* JADX INFO: renamed from: ۙ */
    public transient S3ObjectInputStream f1811;

    /* JADX INFO: renamed from: ᩹ */
    public String f1814 = null;

    /* JADX INFO: renamed from: ᩸ */
    public String f1813 = null;

    /* JADX INFO: renamed from: ᩶ */
    public ObjectMetadata f1812 = new ObjectMetadata();

    @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1631(boolean z) {
    }

    /* JADX INFO: renamed from: ܽ */
    public final ObjectMetadata m1819() {
        return this.f1812;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        S3ObjectInputStream s3ObjectInputStream = this.f1811;
        if (s3ObjectInputStream != null) {
            s3ObjectInputStream.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final S3ObjectInputStream m1815() {
        return this.f1811;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1816(S3ObjectInputStream s3ObjectInputStream) {
        this.f1811 = s3ObjectInputStream;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1817(String str) {
        this.f1813 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1818(String str) {
        this.f1814 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Object [key=");
        sb.append(this.f1814);
        sb.append(",bucket=");
        String str = this.f1813;
        if (str == null) {
            str = "<Unknown>";
        }
        return C10965.m25286(sb, str, "]");
    }
}
