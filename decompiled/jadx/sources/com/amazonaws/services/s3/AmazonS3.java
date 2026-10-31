package com.amazonaws.services.s3;

import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

/* JADX INFO: loaded from: classes.dex */
public interface AmazonS3 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    CompleteMultipartUploadResult mo434(CompleteMultipartUploadRequest completeMultipartUploadRequest);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    InitiateMultipartUploadResult mo435(InitiateMultipartUploadRequest initiateMultipartUploadRequest);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    PutObjectResult mo436(PutObjectRequest putObjectRequest);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    S3Object mo437(GetObjectRequest getObjectRequest);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    UploadPartResult mo438(UploadPartRequest uploadPartRequest);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    void mo439(AbortMultipartUploadRequest abortMultipartUploadRequest);
}
