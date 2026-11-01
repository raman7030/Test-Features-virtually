package com.amazonaws.services.p061s3.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectsResponse implements S3RequesterChargedResult {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f1638;

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f1639;

    @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1631(boolean z) {
    }

    public DeleteObjectsResponse() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f1638 = arrayList;
        this.f1639 = arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m1630() {
        return this.f1638;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m1632() {
        return this.f1639;
    }
}
