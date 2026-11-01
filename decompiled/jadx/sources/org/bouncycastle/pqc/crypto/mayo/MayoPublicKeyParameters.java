package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class MayoPublicKeyParameters extends MayoKeyParameters {

    /* JADX INFO: renamed from: p */
    public final byte[] f81666p;

    public MayoPublicKeyParameters(MayoParameters mayoParameters, byte[] bArr) {
        super(false, mayoParameters);
        this.f81666p = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f81666p);
    }

    public byte[] getP() {
        return Arrays.clone(this.f81666p);
    }
}
