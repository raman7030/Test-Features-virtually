package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.SSEResultBase;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract ServerSideEncryptionResult mo701();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String m702() {
        ServerSideEncryptionResult serverSideEncryptionResultMo701 = mo701();
        if (serverSideEncryptionResultMo701 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo701).m480();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩳ */
    public final void mo485(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo701 = mo701();
        if (serverSideEncryptionResultMo701 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo701).mo485(str);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String m704() {
        ServerSideEncryptionResult serverSideEncryptionResultMo701 = mo701();
        if (serverSideEncryptionResultMo701 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo701).m481();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ۧ */
    public final void mo482(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo701 = mo701();
        if (serverSideEncryptionResultMo701 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo701).mo482(str);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String m703() {
        ServerSideEncryptionResult serverSideEncryptionResultMo701 = mo701();
        if (serverSideEncryptionResultMo701 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo701).m483();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ܿ */
    public final void mo484(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo701 = mo701();
        if (serverSideEncryptionResultMo701 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo701).mo484(str);
        }
    }
}
