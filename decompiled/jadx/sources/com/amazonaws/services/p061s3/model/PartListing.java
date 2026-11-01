package com.amazonaws.services.p061s3.model;

import com.amazonaws.services.p061s3.internal.S3RequesterChargedResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PartListing implements S3RequesterChargedResult {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f1801;

    @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1631(boolean z) {
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m1810() {
        if (this.f1801 == null) {
            this.f1801 = new ArrayList();
        }
        return this.f1801;
    }
}
