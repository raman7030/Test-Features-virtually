package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;

/* JADX INFO: loaded from: classes.dex */
public class ServerSideEncryptionHeaderHandler implements HeaderHandler {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ֫ */
    public final void mo463(Object obj, HttpResponse httpResponse) {
        ServerSideEncryptionResult serverSideEncryptionResult = (ServerSideEncryptionResult) obj;
        serverSideEncryptionResult.mo485((String) httpResponse.m267().get("x-amz-server-side-encryption"));
        serverSideEncryptionResult.mo482((String) httpResponse.m267().get("x-amz-server-side-encryption-customer-algorithm"));
        serverSideEncryptionResult.mo484((String) httpResponse.m267().get("x-amz-server-side-encryption-customer-key-MD5"));
    }
}
