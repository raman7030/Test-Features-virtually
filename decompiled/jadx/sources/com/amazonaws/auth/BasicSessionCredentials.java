package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {

    /* JADX INFO: renamed from: ֫ */
    public final String f1304;

    /* JADX INFO: renamed from: ۧ */
    public final String f1305;

    /* JADX INFO: renamed from: ܽ */
    public final String f1306;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.f1304 = str;
        this.f1305 = str2;
        this.f1306 = str3;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ֫ */
    public final String mo1372() {
        return this.f1304;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ܽ */
    public final String mo1373() {
        return this.f1305;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    /* JADX INFO: renamed from: ۧ */
    public final String mo1375() {
        return this.f1306;
    }
}
