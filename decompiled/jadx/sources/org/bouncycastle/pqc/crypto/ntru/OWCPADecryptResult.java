package org.bouncycastle.pqc.crypto.ntru;

/* JADX INFO: loaded from: classes2.dex */
public class OWCPADecryptResult {
    public final int fail;
    public final byte[] rm;

    public OWCPADecryptResult(byte[] bArr, int i) {
        this.rm = bArr;
        this.fail = i;
    }
}
