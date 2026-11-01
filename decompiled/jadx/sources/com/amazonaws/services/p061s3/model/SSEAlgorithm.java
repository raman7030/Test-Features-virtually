package com.amazonaws.services.p061s3.model;

/* JADX INFO: loaded from: classes.dex */
public enum SSEAlgorithm {
    AES256("AES256"),
    KMS("aws:kms");


    /* JADX INFO: renamed from: ᩸ */
    public final String f1827;

    public String getAlgorithm() {
        return this.f1827;
    }

    SSEAlgorithm(String str) {
        this.f1827 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1827;
    }

    /* JADX INFO: renamed from: ֫ */
    public static SSEAlgorithm m1835(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static SSEAlgorithm m1834() {
        return AES256;
    }
}
