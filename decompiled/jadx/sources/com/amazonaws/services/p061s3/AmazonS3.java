package com.amazonaws.services.p061s3;

import com.amazonaws.services.p061s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.p061s3.model.GetObjectRequest;
import com.amazonaws.services.p061s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.p061s3.model.PutObjectRequest;
import com.amazonaws.services.p061s3.model.PutObjectResult;
import com.amazonaws.services.p061s3.model.S3Object;
import com.amazonaws.services.p061s3.model.UploadPartRequest;
import com.amazonaws.services.p061s3.model.UploadPartResult;

/* JADX INFO: loaded from: classes.dex */
public interface AmazonS3 {
    /* JADX INFO: renamed from: ֫ */
    CompleteMultipartUploadResult mo1600(CompleteMultipartUploadRequest completeMultipartUploadRequest);

    /* JADX INFO: renamed from: ֫ */
    InitiateMultipartUploadResult mo1601(InitiateMultipartUploadRequest initiateMultipartUploadRequest);

    /* JADX INFO: renamed from: ֫ */
    PutObjectResult mo1602(PutObjectRequest putObjectRequest);

    /* JADX INFO: renamed from: ֫ */
    S3Object mo1603(GetObjectRequest getObjectRequest);

    /* JADX INFO: renamed from: ֫ */
    UploadPartResult mo1604(UploadPartRequest uploadPartRequest);

    /* JADX INFO: renamed from: ֫ */
    void mo1605(AbortMultipartUploadRequest abortMultipartUploadRequest);
}
