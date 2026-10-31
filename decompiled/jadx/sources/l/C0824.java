package l;

import java.security.SecureRandom;

/* JADX INFO: renamed from: l.֨ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAYQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0824 implements InterfaceC22198 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SecureRandom f2994;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f2995 = new byte[16];

    public C0824() {
        this.f2994 = null;
        this.f2994 = new SecureRandom();
    }

    @Override // l.InterfaceC22198
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3071(int i, int i2, byte[] bArr) {
        if (i2 > this.f2995.length) {
            this.f2995 = new byte[i2];
        }
        this.f2994.nextBytes(this.f2995);
        System.arraycopy(this.f2995, 0, bArr, i, i2);
    }
}
