package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class MLKEMKeyParameters extends AsymmetricKeyParameter {
    public MLKEMParameters params;

    public MLKEMKeyParameters(boolean z, MLKEMParameters mLKEMParameters) {
        super(z);
        this.params = mLKEMParameters;
    }

    public MLKEMParameters getParameters() {
        return this.params;
    }
}
