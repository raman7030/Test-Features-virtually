package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class FalconKeyParameters extends AsymmetricKeyParameter {
    public final FalconParameters params;

    public FalconKeyParameters(boolean z, FalconParameters falconParameters) {
        super(z);
        this.params = falconParameters;
    }

    public FalconParameters getParameters() {
        return this.params;
    }
}
