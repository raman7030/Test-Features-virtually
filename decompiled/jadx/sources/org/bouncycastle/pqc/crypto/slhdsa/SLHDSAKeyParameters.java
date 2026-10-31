package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class SLHDSAKeyParameters extends AsymmetricKeyParameter {
    public final SLHDSAParameters parameters;

    public SLHDSAKeyParameters(boolean z, SLHDSAParameters sLHDSAParameters) {
        super(z);
        this.parameters = sLHDSAParameters;
    }

    public SLHDSAParameters getParameters() {
        return this.parameters;
    }
}
