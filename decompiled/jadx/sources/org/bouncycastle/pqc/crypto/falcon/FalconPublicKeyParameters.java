package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class FalconPublicKeyParameters extends FalconKeyParameters {

    /* JADX INFO: renamed from: H */
    public final byte[] f81598H;

    public FalconPublicKeyParameters(FalconParameters falconParameters, byte[] bArr) {
        super(false, falconParameters);
        this.f81598H = Arrays.clone(bArr);
    }

    public byte[] getH() {
        return Arrays.clone(this.f81598H);
    }
}
