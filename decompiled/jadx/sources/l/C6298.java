package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۛ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J1SN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6298 implements InterfaceC10532 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean[] f19465 = {true, true, true, false, true, false, false, false};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f19466 = {0, 1, 2, 2, 3, 3, 3, 3};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f19467;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f19468 = 0;

    public C6298(int i) {
        this.f19467 = i + 5;
    }

    @Override // l.InterfaceC10532
    /* JADX INFO: renamed from: ֫ */
    public final int mo10634(int i, int i2, byte[] bArr) {
        int i3;
        int i4;
        int i5 = i - 1;
        int i6 = (i2 + i) - 5;
        int i7 = i;
        while (true) {
            if (i7 > i6) {
                break;
            }
            if ((bArr[i7] & UTF8.S_ERR) == 232) {
                int i8 = i7 - i5;
                int i9 = i8 & (-4);
                int[] iArr = f19466;
                if (i9 != 0) {
                    this.f19468 = 0;
                } else {
                    int i10 = (this.f19468 << (i8 - 1)) & 7;
                    this.f19468 = i10;
                    if (i10 != 0 && (!f19465[i10] || (i3 = bArr[(i7 + 4) - iArr[i10]] & 255) == 0 || i3 == 255)) {
                        this.f19468 = (i10 << 1) | 1;
                    }
                    i5 = i7;
                }
                int i11 = i7 + 4;
                int i12 = bArr[i11] & 255;
                if (i12 == 0 || i12 == 255) {
                    int i13 = i7 + 1;
                    int iM42700 = C18321.m42700(i13, bArr);
                    while (true) {
                        i4 = iM42700 - ((this.f19467 + i7) - i);
                        int i14 = this.f19468;
                        if (i14 != 0) {
                            int i15 = iArr[i14] * 8;
                            int i16 = ((byte) (i4 >>> (24 - i15))) & 255;
                            if (i16 != 0 && i16 != 255) {
                                break;
                            }
                            iM42700 = i4 ^ ((1 << (32 - i15)) - 1);
                        } else {
                            break;
                        }
                    }
                    C18321.m42701(i13, (i4 << 7) >> 7, bArr);
                    i5 = i7;
                    i7 = i11;
                } else {
                    this.f19468 = (this.f19468 << 1) | 1;
                    i5 = i7;
                }
            }
            i7++;
        }
        int i17 = i7 - i5;
        this.f19468 = (i17 & (-4)) == 0 ? this.f19468 << (i17 - 1) : 0;
        int i18 = i7 - i;
        this.f19467 += i18;
        return i18;
    }
}
