package p067l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۛ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J1SN */
/* JADX INFO: loaded from: classes3.dex */
public final class C8354 implements InterfaceC12378 {

    /* JADX INFO: renamed from: ܽ */
    public static final boolean[] f22336 = {true, true, true, false, true, false, false, false};

    /* JADX INFO: renamed from: ᩳ */
    public static final int[] f22337 = {0, 1, 2, 2, 3, 3, 3, 3};

    /* JADX INFO: renamed from: ֫ */
    public int f22338;

    /* JADX INFO: renamed from: ۧ */
    public int f22339 = 0;

    public C8354(int i) {
        this.f22338 = i + 5;
    }

    @Override // p067l.InterfaceC12378
    /* JADX INFO: renamed from: ֫ */
    public final int mo12629(int i, int i2, byte[] bArr) {
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
                int[] iArr = f22337;
                if (i9 != 0) {
                    this.f22339 = 0;
                } else {
                    int i10 = (this.f22339 << (i8 - 1)) & 7;
                    this.f22339 = i10;
                    if (i10 != 0 && (!f22336[i10] || (i3 = bArr[(i7 + 4) - iArr[i10]] & 255) == 0 || i3 == 255)) {
                        this.f22339 = (i10 << 1) | 1;
                    }
                    i5 = i7;
                }
                int i11 = i7 + 4;
                int i12 = bArr[i11] & 255;
                if (i12 == 0 || i12 == 255) {
                    int i13 = i7 + 1;
                    int iM44962 = C19781.m44962(i13, bArr);
                    while (true) {
                        i4 = iM44962 - ((this.f22338 + i7) - i);
                        int i14 = this.f22339;
                        if (i14 != 0) {
                            int i15 = iArr[i14] * 8;
                            int i16 = ((byte) (i4 >>> (24 - i15))) & 255;
                            if (i16 != 0 && i16 != 255) {
                                break;
                            }
                            iM44962 = i4 ^ ((1 << (32 - i15)) - 1);
                        } else {
                            break;
                        }
                    }
                    C19781.m44963(i13, (i4 << 7) >> 7, bArr);
                    i5 = i7;
                    i7 = i11;
                } else {
                    this.f22339 = (this.f22339 << 1) | 1;
                    i5 = i7;
                }
            }
            i7++;
        }
        int i17 = i7 - i5;
        this.f22339 = (i17 & (-4)) == 0 ? this.f22339 << (i17 - 1) : 0;
        int i18 = i7 - i;
        this.f22338 += i18;
        return i18;
    }
}
