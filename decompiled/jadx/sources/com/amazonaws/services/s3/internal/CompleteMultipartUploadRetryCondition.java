package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.model.AmazonS3Exception;

/* JADX INFO: loaded from: classes.dex */
public class CompleteMultipartUploadRetryCondition implements RetryPolicy.RetryCondition {
    @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo428(AmazonClientException amazonClientException, int i) {
        if (!(amazonClientException instanceof AmazonS3Exception)) {
            return false;
        }
        AmazonS3Exception amazonS3Exception = (AmazonS3Exception) amazonClientException;
        return amazonS3Exception.m142() != null && amazonS3Exception.m145() != null && amazonS3Exception.m142().contains("InternalError") && amazonS3Exception.m145().contains("Please try again.") && i < 3;
    }
}
