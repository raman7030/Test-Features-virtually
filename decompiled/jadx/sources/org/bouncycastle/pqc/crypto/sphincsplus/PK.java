package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes2.dex */
public class PK {
    public final byte[] root;
    public final byte[] seed;

    public PK(byte[] bArr, byte[] bArr2) {
        this.seed = bArr;
        this.root = bArr2;
    }
}
