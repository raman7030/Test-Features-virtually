package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class MLDSAKeyParameters extends AsymmetricKeyParameter {
    public final MLDSAParameters params;

    public MLDSAKeyParameters(boolean z, MLDSAParameters mLDSAParameters) {
        super(z);
        this.params = mLDSAParameters;
    }

    public MLDSAParameters getParameters() {
        return this.params;
    }
}
