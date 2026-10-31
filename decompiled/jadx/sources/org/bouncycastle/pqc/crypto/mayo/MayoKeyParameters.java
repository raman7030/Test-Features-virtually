package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class MayoKeyParameters extends AsymmetricKeyParameter {
    public final MayoParameters params;

    public MayoKeyParameters(boolean z, MayoParameters mayoParameters) {
        super(z);
        this.params = mayoParameters;
    }

    public MayoParameters getParameters() {
        return this.params;
    }
}
