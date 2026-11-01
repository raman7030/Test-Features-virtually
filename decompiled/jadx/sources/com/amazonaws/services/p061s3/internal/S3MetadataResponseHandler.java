package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.p061s3.model.ObjectMetadata;

/* JADX INFO: loaded from: classes.dex */
public class S3MetadataResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1442(HttpResponse httpResponse) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        AbstractS3ResponseHandler.m1622(httpResponse, objectMetadata);
        AmazonWebServiceResponse amazonWebServiceResponseM1623 = AbstractS3ResponseHandler.m1623(httpResponse);
        amazonWebServiceResponseM1623.m1331(objectMetadata);
        return amazonWebServiceResponseM1623;
    }
}
