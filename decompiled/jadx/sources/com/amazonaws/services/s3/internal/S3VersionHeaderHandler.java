package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;

/* JADX INFO: loaded from: classes.dex */
public class S3VersionHeaderHandler implements HeaderHandler {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ֫ */
    public final void mo463(Object obj, HttpResponse httpResponse) {
        ((S3VersionResult) obj).mo478((String) httpResponse.m267().get("x-amz-version-id"));
    }
}
