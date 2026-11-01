package com.amazonaws.services.p061s3.model.transform;

import com.amazonaws.services.p061s3.internal.SSEResultBase;
import com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    /* JADX INFO: renamed from: ܳ */
    public abstract ServerSideEncryptionResult mo1866();

    /* JADX INFO: renamed from: ܽ */
    public String m1867() {
        ServerSideEncryptionResult serverSideEncryptionResultMo1866 = mo1866();
        if (serverSideEncryptionResultMo1866 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo1866).m1646();
    }

    @Override // com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1651(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo1866 = mo1866();
        if (serverSideEncryptionResultMo1866 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo1866).mo1651(str);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public String m1869() {
        ServerSideEncryptionResult serverSideEncryptionResultMo1866 = mo1866();
        if (serverSideEncryptionResultMo1866 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo1866).m1647();
    }

    @Override // com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ۧ */
    public final void mo1648(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo1866 = mo1866();
        if (serverSideEncryptionResultMo1866 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo1866).mo1648(str);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public String m1868() {
        ServerSideEncryptionResult serverSideEncryptionResultMo1866 = mo1866();
        if (serverSideEncryptionResultMo1866 == null) {
            return null;
        }
        return ((SSEResultBase) serverSideEncryptionResultMo1866).m1649();
    }

    @Override // com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ܿ */
    public final void mo1650(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultMo1866 = mo1866();
        if (serverSideEncryptionResultMo1866 != null) {
            ((SSEResultBase) serverSideEncryptionResultMo1866).mo1650(str);
        }
    }
}
