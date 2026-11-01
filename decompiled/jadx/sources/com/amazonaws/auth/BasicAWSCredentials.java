package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class BasicAWSCredentials implements AWSCredentials {

    /* JADX INFO: renamed from: ֫ */
    public final String f1302;

    /* JADX INFO: renamed from: ۧ */
    public final String f1303;

    public BasicAWSCredentials(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Access key cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Secret key cannot be null.");
        }
        this.f1302 = str;
        this.f1303 = str2;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ֫ */
    public final String mo1372() {
        return this.f1302;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ܽ */
    public final String mo1373() {
        return this.f1303;
    }
}
