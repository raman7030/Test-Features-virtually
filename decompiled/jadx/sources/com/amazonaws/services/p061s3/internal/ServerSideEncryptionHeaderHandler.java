package com.amazonaws.services.p061s3.internal;

import com.amazonaws.http.HttpResponse;

/* JADX INFO: loaded from: classes.dex */
public class ServerSideEncryptionHeaderHandler implements HeaderHandler {
    @Override // com.amazonaws.services.p061s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ֫ */
    public final void mo1629(Object obj, HttpResponse httpResponse) {
        ServerSideEncryptionResult serverSideEncryptionResult = (ServerSideEncryptionResult) obj;
        serverSideEncryptionResult.mo1651((String) httpResponse.m1433().get("x-amz-server-side-encryption"));
        serverSideEncryptionResult.mo1648((String) httpResponse.m1433().get("x-amz-server-side-encryption-customer-algorithm"));
        serverSideEncryptionResult.mo1650((String) httpResponse.m1433().get("x-amz-server-side-encryption-customer-key-MD5"));
    }
}
