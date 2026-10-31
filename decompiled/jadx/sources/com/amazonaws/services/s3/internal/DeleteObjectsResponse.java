package com.amazonaws.services.s3.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectsResponse implements S3RequesterChargedResult {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f478;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f479;

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo465(boolean z) {
    }

    public DeleteObjectsResponse() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f478 = arrayList;
        this.f479 = arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m464() {
        return this.f478;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m466() {
        return this.f479;
    }
}
