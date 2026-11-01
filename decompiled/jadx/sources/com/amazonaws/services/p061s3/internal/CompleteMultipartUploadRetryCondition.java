package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.p061s3.model.AmazonS3Exception;

/* JADX INFO: loaded from: classes.dex */
public class CompleteMultipartUploadRetryCondition implements RetryPolicy.RetryCondition {
    @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1594(AmazonClientException amazonClientException, int i) {
        if (!(amazonClientException instanceof AmazonS3Exception)) {
            return false;
        }
        AmazonS3Exception amazonS3Exception = (AmazonS3Exception) amazonClientException;
        return amazonS3Exception.m1309() != null && amazonS3Exception.m1312() != null && amazonS3Exception.m1309().contains("InternalError") && amazonS3Exception.m1312().contains("Please try again.") && i < 3;
    }
}
