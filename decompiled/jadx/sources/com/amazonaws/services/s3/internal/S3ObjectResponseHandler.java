package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final Object mo276(HttpResponse httpResponse) {
        S3Object s3Object = new S3Object();
        AmazonWebServiceResponse amazonWebServiceResponseM457 = AbstractS3ResponseHandler.m457(httpResponse);
        if (httpResponse.m267().get("x-amz-website-redirect-location") != null) {
        }
        httpResponse.m267().get("x-amz-request-charged");
        if (httpResponse.m267().get("x-amz-tagging-count") != null) {
            Integer.parseInt((String) httpResponse.m267().get("x-amz-tagging-count"));
        }
        AbstractS3ResponseHandler.m456(httpResponse, s3Object.m654());
        s3Object.m651(new S3ObjectInputStream(httpResponse.m266()));
        amazonWebServiceResponseM457.m165(s3Object);
        return amazonWebServiceResponseM457;
    }
}
