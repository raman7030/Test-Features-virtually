package com.amazonaws.services.p061s3.model;

/* JADX INFO: loaded from: classes.dex */
public enum Permission {
    FullControl("FULL_CONTROL", "x-amz-grant-full-control"),
    Read("READ", "x-amz-grant-read"),
    Write("WRITE", "x-amz-grant-write"),
    ReadAcp("READ_ACP", "x-amz-grant-read-acp"),
    WriteAcp("WRITE_ACP", "x-amz-grant-write-acp");


    /* JADX INFO: renamed from: ᩸ */
    public String f1808;

    /* JADX INFO: renamed from: ᩹ */
    public String f1809;

    Permission(String str, String str2) {
        this.f1809 = str;
        this.f1808 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m1812() {
        return this.f1808;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1809;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Permission m1811(String str) {
        for (Permission permission : values()) {
            if (permission.f1809.equals(str)) {
                return permission;
            }
        }
        return null;
    }
}
