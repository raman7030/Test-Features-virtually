package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class PicnicKeyParameters extends AsymmetricKeyParameter {
    public final PicnicParameters parameters;

    public PicnicKeyParameters(boolean z, PicnicParameters picnicParameters) {
        super(z);
        this.parameters = picnicParameters;
    }

    public PicnicParameters getParameters() {
        return this.parameters;
    }
}
