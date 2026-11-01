package com.amazonaws.internal;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;

/* JADX INFO: loaded from: classes.dex */
public class StaticCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: ֫ */
    public final BasicAWSCredentials f1371;

    public StaticCredentialsProvider(BasicAWSCredentials basicAWSCredentials) {
        this.f1371 = basicAWSCredentials;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    /* JADX INFO: renamed from: ֫ */
    public final AWSCredentials mo1374() {
        return this.f1371;
    }
}
