package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class BIKEKeyParameters extends AsymmetricKeyParameter {
    public BIKEParameters params;

    public BIKEKeyParameters(boolean z, BIKEParameters bIKEParameters) {
        super(z);
        this.params = bIKEParameters;
    }

    public BIKEParameters getParameters() {
        return this.params;
    }
}
