package p067l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;

/* JADX INFO: renamed from: l.ۤۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12046 extends AbstractC8022 {
    public C12046() {
        this.f21102 = MLKEMParameters.ml_kem_768;
    }

    @Override // p067l.InterfaceC12737
    public final byte[] getPublicKey() {
        return this.f21103.getEncoded();
    }

    @Override // p067l.InterfaceC12737
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo27605(byte[] bArr) {
        return this.f21101.extractSecret(bArr);
    }
}
