package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;

/* JADX INFO: renamed from: l.ۤۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10183 extends AbstractC5949 {
    public C10183() {
        this.f18247 = MLKEMParameters.ml_kem_768;
    }

    @Override // l.InterfaceC10910
    public final byte[] getPublicKey() {
        return this.f18248.getEncoded();
    }

    @Override // l.InterfaceC10910
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo25585(byte[] bArr) {
        return this.f18246.extractSecret(bArr);
    }
}
