package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class BIKEPublicKeyParameters extends BIKEKeyParameters {
    public byte[] publicKey;

    public BIKEPublicKeyParameters(BIKEParameters bIKEParameters, byte[] bArr) {
        super(false, bIKEParameters);
        this.publicKey = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.publicKey);
    }
}
