package p067l;

import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;

/* JADX INFO: renamed from: l.ۗ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R1SU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5672 implements InterfaceC12378 {

    /* JADX INFO: renamed from: ֫ */
    public int f13799;

    public C5672(int i) {
        this.f13799 = i;
    }

    @Override // p067l.InterfaceC12378
    /* JADX INFO: renamed from: ֫ */
    public final int mo12629(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] & Poly1305KeyGenerator.R_MASK_LOW_2) == 72 && (bArr[i4 + 3] & 3) == 1) {
                C19781.m44960(i4, ((C19781.m44956(i4, bArr) + (-((this.f13799 + i4) - i))) & 67108860) | 1207959553, bArr);
            }
            i4 += 4;
        }
        int i5 = i4 - i;
        this.f13799 += i5;
        return i5;
    }
}
