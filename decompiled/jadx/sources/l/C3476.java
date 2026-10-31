package l;

import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;

/* JADX INFO: renamed from: l.ۗ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R1SU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3476 implements InterfaceC10532 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f10994;

    public C3476(int i) {
        this.f10994 = i;
    }

    @Override // l.InterfaceC10532
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo10634(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] & Poly1305KeyGenerator.R_MASK_LOW_2) == 72 && (bArr[i4 + 3] & 3) == 1) {
                C18321.m42698(i4, ((C18321.m42694(i4, bArr) + (-((this.f10994 + i4) - i))) & 67108860) | 1207959553, bArr);
            }
            i4 += 4;
        }
        int i5 = i4 - i;
        this.f10994 += i5;
        return i5;
    }
}
