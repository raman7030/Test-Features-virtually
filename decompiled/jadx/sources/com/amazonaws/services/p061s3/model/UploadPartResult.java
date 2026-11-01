package com.amazonaws.services.p061s3.model;

import com.amazonaws.services.p061s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.p061s3.internal.SSEResultBase;

/* JADX INFO: loaded from: classes.dex */
public class UploadPartResult extends SSEResultBase implements S3RequesterChargedResult {

    /* JADX INFO: renamed from: ۗ */
    public int f1841;

    /* JADX INFO: renamed from: ۙ */
    public String f1842;

    @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1631(boolean z) {
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1857(int i) {
        this.f1841 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1860() {
        return this.f1842;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m1858(String str) {
        this.f1842 = str;
    }

    /* JADX INFO: renamed from: ܿ */
    public final PartETag m1859() {
        return new PartETag(this.f1841, this.f1842);
    }
}
