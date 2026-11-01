package com.amazonaws;

import com.amazonaws.services.p061s3.S3ResponseMetadata;

/* JADX INFO: loaded from: classes.dex */
public class AmazonWebServiceResponse {

    /* JADX INFO: renamed from: ֫ */
    public S3ResponseMetadata f1248;

    /* JADX INFO: renamed from: ۧ */
    public Object f1249;

    /* JADX INFO: renamed from: ۧ */
    public final Object m1332() {
        return this.f1249;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1331(Object obj) {
        this.f1249 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1330(S3ResponseMetadata s3ResponseMetadata) {
        this.f1248 = s3ResponseMetadata;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m1329() {
        S3ResponseMetadata s3ResponseMetadata = this.f1248;
        if (s3ResponseMetadata == null) {
            return null;
        }
        return (String) s3ResponseMetadata.f1277.get("AWS_REQUEST_ID");
    }
}
