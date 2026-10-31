package org.bouncycastle.pqc.crypto.slhdsa;

/* JADX INFO: loaded from: classes2.dex */
public class SIG_FORS {
    public final byte[][] authPath;
    public final byte[] sk;

    public SIG_FORS(byte[] bArr, byte[][] bArr2) {
        this.authPath = bArr2;
        this.sk = bArr;
    }

    public byte[][] getAuthPath() {
        return this.authPath;
    }

    public byte[] getSK() {
        return this.sk;
    }
}
