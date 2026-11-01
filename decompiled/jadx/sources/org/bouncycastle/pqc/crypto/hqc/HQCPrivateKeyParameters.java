package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class HQCPrivateKeyParameters extends HQCKeyParameters {

    /* JADX INFO: renamed from: sk */
    public final byte[] f81632sk;

    public HQCPrivateKeyParameters(HQCParameters hQCParameters, byte[] bArr) {
        super(true, hQCParameters);
        this.f81632sk = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f81632sk);
    }

    public byte[] getPrivateKey() {
        return Arrays.clone(this.f81632sk);
    }
}
