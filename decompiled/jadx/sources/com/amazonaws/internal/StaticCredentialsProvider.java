package com.amazonaws.internal;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;

/* JADX INFO: loaded from: classes.dex */
public class StaticCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BasicAWSCredentials f211;

    public StaticCredentialsProvider(BasicAWSCredentials basicAWSCredentials) {
        this.f211 = basicAWSCredentials;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    /* JADX INFO: renamed from: ֫ */
    public final AWSCredentials mo208() {
        return this.f211;
    }
}
