package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class SPHINCSPlusKeyParameters extends AsymmetricKeyParameter {
    public final SPHINCSPlusParameters parameters;

    public SPHINCSPlusKeyParameters(boolean z, SPHINCSPlusParameters sPHINCSPlusParameters) {
        super(z);
        this.parameters = sPHINCSPlusParameters;
    }

    public SPHINCSPlusParameters getParameters() {
        return this.parameters;
    }
}
