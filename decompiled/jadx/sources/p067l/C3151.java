package p067l;

import java.security.SecureRandom;

/* JADX INFO: renamed from: l.֨ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAYQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3151 implements InterfaceC23465 {

    /* JADX INFO: renamed from: ֫ */
    public SecureRandom f5768;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f5769 = new byte[16];

    public C3151() {
        this.f5768 = null;
        this.f5768 = new SecureRandom();
    }

    @Override // p067l.InterfaceC23465
    /* JADX INFO: renamed from: ֫ */
    public final void mo5385(int i, int i2, byte[] bArr) {
        if (i2 > this.f5769.length) {
            this.f5769 = new byte[i2];
        }
        this.f5768.nextBytes(this.f5769);
        System.arraycopy(this.f5769, 0, bArr, i, i2);
    }
}
