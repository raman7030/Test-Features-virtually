package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PicnicPublicKeyParameters extends PicnicKeyParameters {
    public final byte[] publicKey;

    public PicnicPublicKeyParameters(PicnicParameters picnicParameters, byte[] bArr) {
        super(false, picnicParameters);
        this.publicKey = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.publicKey);
    }
}
