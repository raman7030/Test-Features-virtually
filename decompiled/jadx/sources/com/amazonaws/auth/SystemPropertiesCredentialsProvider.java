package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SystemPropertiesCredentialsProvider implements AWSCredentialsProvider {
    @Override // com.amazonaws.auth.AWSCredentialsProvider
    /* JADX INFO: renamed from: ֫ */
    public final AWSCredentials mo1374() {
        if (System.getProperty("aws.accessKeyId") != null && System.getProperty("aws.secretKey") != null) {
            return new BasicAWSCredentials(System.getProperty("aws.accessKeyId"), System.getProperty("aws.secretKey"));
        }
        throw new AmazonClientException("Unable to load AWS credentials from Java system properties (aws.accessKeyId and aws.secretKey)");
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
