package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.SSEResultBase;

/* JADX INFO: loaded from: classes.dex */
public class UploadPartResult extends SSEResultBase implements S3RequesterChargedResult {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f681;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f682;

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo465(boolean z) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m692(int i) {
        this.f681 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m695() {
        return this.f682;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m693(String str) {
        this.f682 = str;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final PartETag m694() {
        return new PartETag(this.f681, this.f682);
    }
}
