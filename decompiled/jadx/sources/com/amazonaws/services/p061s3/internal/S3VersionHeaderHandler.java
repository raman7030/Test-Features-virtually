package com.amazonaws.services.p061s3.internal;

import com.amazonaws.http.HttpResponse;

/* JADX INFO: loaded from: classes.dex */
public class S3VersionHeaderHandler implements HeaderHandler {
    @Override // com.amazonaws.services.p061s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ֫ */
    public final void mo1629(Object obj, HttpResponse httpResponse) {
        ((S3VersionResult) obj).mo1644((String) httpResponse.m1433().get("x-amz-version-id"));
    }
}
