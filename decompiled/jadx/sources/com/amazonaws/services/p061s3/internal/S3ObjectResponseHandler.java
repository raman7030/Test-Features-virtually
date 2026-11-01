package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.p061s3.model.S3Object;
import com.amazonaws.services.p061s3.model.S3ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1442(HttpResponse httpResponse) {
        S3Object s3Object = new S3Object();
        AmazonWebServiceResponse amazonWebServiceResponseM1623 = AbstractS3ResponseHandler.m1623(httpResponse);
        if (httpResponse.m1433().get("x-amz-website-redirect-location") != null) {
        }
        httpResponse.m1433().get("x-amz-request-charged");
        if (httpResponse.m1433().get("x-amz-tagging-count") != null) {
            Integer.parseInt((String) httpResponse.m1433().get("x-amz-tagging-count"));
        }
        AbstractS3ResponseHandler.m1622(httpResponse, s3Object.m1819());
        s3Object.m1816(new S3ObjectInputStream(httpResponse.m1432()));
        amazonWebServiceResponseM1623.m1331(s3Object);
        return amazonWebServiceResponseM1623;
    }
}
