package com.amazonaws.services.p061s3.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class SSEResultBase implements ServerSideEncryptionResult {

    /* JADX INFO: renamed from: ᩶ */
    public String f1669;

    /* JADX INFO: renamed from: ᩸ */
    public String f1670;

    /* JADX INFO: renamed from: ᩹ */
    public String f1671;

    /* JADX INFO: renamed from: ֫ */
    public final String m1646() {
        return this.f1670;
    }

    @Override // com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1651(String str) {
        this.f1670 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m1647() {
        return this.f1671;
    }

    @Override // com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ۧ */
    public final void mo1648(String str) {
        this.f1671 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m1649() {
        return this.f1669;
    }

    @Override // com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ܿ */
    public final void mo1650(String str) {
        this.f1669 = str;
    }
}
