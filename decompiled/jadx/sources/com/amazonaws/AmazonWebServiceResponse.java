package com.amazonaws;

import com.amazonaws.services.s3.S3ResponseMetadata;

/* JADX INFO: loaded from: classes.dex */
public class AmazonWebServiceResponse {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public S3ResponseMetadata f88;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f89;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m166() {
        return this.f89;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m165(Object obj) {
        this.f89 = obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m164(S3ResponseMetadata s3ResponseMetadata) {
        this.f88 = s3ResponseMetadata;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m163() {
        S3ResponseMetadata s3ResponseMetadata = this.f88;
        if (s3ResponseMetadata == null) {
            return null;
        }
        return (String) s3ResponseMetadata.f117.get("AWS_REQUEST_ID");
    }
}
