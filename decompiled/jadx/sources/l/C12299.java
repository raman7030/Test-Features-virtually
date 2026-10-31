package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;

/* JADX INFO: renamed from: l.۫ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7UZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12299 extends AbstractC5949 {
    public C12299() {
        this.f18247 = MLKEMParameters.ml_kem_1024;
    }

    @Override // l.InterfaceC10910
    public final byte[] getPublicKey() {
        return this.f18248.getEncoded();
    }

    @Override // l.InterfaceC10910
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo25585(byte[] bArr) {
        return this.f18246.extractSecret(bArr);
    }
}
