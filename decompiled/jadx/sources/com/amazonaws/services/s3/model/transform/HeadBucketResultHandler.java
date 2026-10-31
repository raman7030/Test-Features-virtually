package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.s3.model.HeadBucketResult;

/* JADX INFO: loaded from: classes.dex */
public class HeadBucketResultHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final Object mo276(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
        HeadBucketResult headBucketResult = new HeadBucketResult();
        headBucketResult.m579((String) httpResponse.m267().get("x-amz-bucket-region"));
        amazonWebServiceResponse.m165(headBucketResult);
        return amazonWebServiceResponse;
    }
}
