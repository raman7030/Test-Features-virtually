package org.bouncycastle.pqc.crypto.slhdsa;

/* JADX INFO: loaded from: classes2.dex */
public class SK {
    public final byte[] prf;
    public final byte[] seed;

    public SK(byte[] bArr, byte[] bArr2) {
        this.seed = bArr;
        this.prf = bArr2;
    }
}
