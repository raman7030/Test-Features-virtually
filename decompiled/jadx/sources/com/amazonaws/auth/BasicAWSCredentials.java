package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class BasicAWSCredentials implements AWSCredentials {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f142;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f143;

    public BasicAWSCredentials(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Access key cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Secret key cannot be null.");
        }
        this.f142 = str;
        this.f143 = str2;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ֫ */
    public final String mo206() {
        return this.f142;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ܽ */
    public final String mo207() {
        return this.f143;
    }
}
