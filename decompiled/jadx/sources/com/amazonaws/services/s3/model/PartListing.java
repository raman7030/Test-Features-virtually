package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PartListing implements S3RequesterChargedResult {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f641;

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo465(boolean z) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m645() {
        if (this.f641 == null) {
            this.f641 = new ArrayList();
        }
        return this.f641;
    }
}
