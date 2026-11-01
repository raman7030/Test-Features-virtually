package com.amazonaws.services.p061s3.internal;

import com.amazonaws.auth.Signer;
import com.amazonaws.http.ExecutionContext;

/* JADX INFO: loaded from: classes.dex */
public class S3ExecutionContext extends ExecutionContext {

    /* JADX INFO: renamed from: ᩳ */
    public Signer f1659;

    /* JADX INFO: renamed from: ֫ */
    public final void m1641(Signer signer) {
        this.f1659 = signer;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Signer m1642() {
        return this.f1659;
    }
}
