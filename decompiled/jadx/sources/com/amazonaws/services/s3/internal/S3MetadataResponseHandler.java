package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.ObjectMetadata;

/* JADX INFO: loaded from: classes.dex */
public class S3MetadataResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ֫ */
    public final Object mo276(HttpResponse httpResponse) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        AbstractS3ResponseHandler.m456(httpResponse, objectMetadata);
        AmazonWebServiceResponse amazonWebServiceResponseM457 = AbstractS3ResponseHandler.m457(httpResponse);
        amazonWebServiceResponseM457.m165(objectMetadata);
        return amazonWebServiceResponseM457;
    }
}
