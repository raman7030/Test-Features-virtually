package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class NTRULPRimeKeyParameters extends AsymmetricKeyParameter {
    public final NTRULPRimeParameters params;

    public NTRULPRimeKeyParameters(boolean z, NTRULPRimeParameters nTRULPRimeParameters) {
        super(z);
        this.params = nTRULPRimeParameters;
    }

    public NTRULPRimeParameters getParameters() {
        return this.params;
    }
}
