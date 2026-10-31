package org.bouncycastle.pqc.crypto.slhdsa;

/* JADX INFO: loaded from: classes2.dex */
public class SIG_XMSS {
    public final byte[][] auth;
    public final byte[] sig;

    public SIG_XMSS(byte[] bArr, byte[][] bArr2) {
        this.sig = bArr;
        this.auth = bArr2;
    }

    public byte[] getWOTSSig() {
        return this.sig;
    }

    public byte[][] getXMSSAUTH() {
        return this.auth;
    }
}
