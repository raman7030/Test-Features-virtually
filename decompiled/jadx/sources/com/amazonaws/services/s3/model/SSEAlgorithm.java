package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public enum SSEAlgorithm {
    AES256("AES256"),
    KMS("aws:kms");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f667;

    public String getAlgorithm() {
        return this.f667;
    }

    SSEAlgorithm(String str) {
        this.f667 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f667;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SSEAlgorithm m670(String str) {
        if (str == null) {
            return null;
        }
        for (SSEAlgorithm sSEAlgorithm : values()) {
            if (sSEAlgorithm.getAlgorithm().equals(str)) {
                return sSEAlgorithm;
            }
        }
        throw new IllegalArgumentException("Unsupported algorithm ".concat(str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SSEAlgorithm m669() {
        return AES256;
    }
}
