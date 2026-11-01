package p067l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۙۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 68AX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6772 extends AbstractC5208 {

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC5208 f17537 = new C6772(2);

    @Override // p067l.AbstractC5208
    /* JADX INFO: renamed from: ֫ */
    public final int mo11172(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C8377.m19512(0, i, bArr);
        C8377.m19512(0, i2, bArr2);
        int i9 = 15;
        int i10 = 1;
        if (i < 65547) {
            int i11 = i - 5;
            int i12 = i - 12;
            if (i >= 13) {
                short[] sArr = new short[8192];
                int i13 = 1;
                i7 = 0;
                int i14 = 0;
                loop0: while (true) {
                    int i15 = i10 << C4761.f10783;
                    int i16 = 1;
                    while (true) {
                        int i17 = i16 + i13;
                        int i18 = i15 + 1;
                        int i19 = i15 >>> C4761.f10783;
                        if (i17 > i12) {
                            break loop0;
                        }
                        int iM19516 = (C8377.m19516(i13, bArr) * (-1640531535)) >>> 19;
                        i8 = sArr[iM19516] & HPKE.aead_EXPORT_ONLY;
                        sArr[iM19516] = (short) i13;
                        if (C14818.m33851(i8, i13, bArr)) {
                            break;
                        }
                        i13 = i17;
                        i15 = i18;
                        i16 = i19;
                    }
                    int iM33853 = C14818.m33853(i8, bArr, i13, i7);
                    int i20 = i13 - iM33853;
                    int i21 = i8 - iM33853;
                    int i22 = i20 - i7;
                    int iM33852 = i14 + 1;
                    if (iM33852 + i22 + 8 + (i22 >>> 8) > i2) {
                        throw new C6102("maxDestLen is too small");
                    }
                    if (i22 >= i9) {
                        bArr2[i14] = (byte) 240;
                        iM33852 = C14818.m33852(i22 - 15, iM33852, bArr2);
                    } else {
                        bArr2[i14] = (byte) (i22 << 4);
                    }
                    C14818.m33850(i7, bArr, iM33852, bArr2, i22);
                    int i23 = iM33852 + i22;
                    while (true) {
                        short s = (short) (i20 - i21);
                        bArr2[i23] = (byte) s;
                        bArr2[i23 + 1] = (byte) (s >>> 8);
                        int iM33854 = i23 + 2;
                        int i24 = i20 + 4;
                        int iM33847 = C14818.m33847(i21 + 4, bArr, i24, i11);
                        if (i23 + 8 + (iM33847 >>> 8) > i2) {
                            throw new C6102("maxDestLen is too small");
                        }
                        i20 = i24 + iM33847;
                        if (iM33847 >= 15) {
                            bArr2[i14] = (byte) (15 | bArr2[i14]);
                            iM33854 = C14818.m33852(iM33847 - 15, iM33854, bArr2);
                        } else {
                            bArr2[i14] = (byte) (iM33847 | bArr2[i14]);
                        }
                        i14 = iM33854;
                        if (i20 > i12) {
                            i7 = i20;
                            break loop0;
                        }
                        int i25 = i20 - 2;
                        sArr[(C8377.m19516(i25, bArr) * (-1640531535)) >>> 19] = (short) i25;
                        int iM19517 = (C8377.m19516(i20, bArr) * (-1640531535)) >>> 19;
                        int i26 = sArr[iM19517] & HPKE.aead_EXPORT_ONLY;
                        sArr[iM19517] = (short) i20;
                        if (!C14818.m33851(i20, i26, bArr)) {
                            break;
                        }
                        i23 = i14 + 1;
                        bArr2[i14] = (byte) 0;
                        i21 = i26;
                    }
                    i7 = i20;
                    i10 = 1;
                    i13 = i20 + 1;
                    i9 = 15;
                }
                i6 = i14;
            } else {
                i6 = 0;
                i7 = 0;
            }
            return C14818.m33848(bArr, i7, i - i7, bArr2, i6, i2);
        }
        int i27 = -1640531535;
        int i28 = 1;
        int i29 = i - 5;
        int i30 = i - 12;
        int[] iArr = new int[4096];
        int i31 = 0;
        Arrays.fill(iArr, 0);
        int i32 = 0;
        int i33 = 1;
        loop3: while (true) {
            int i34 = i28 << C4761.f10783;
            int i35 = 1;
            while (true) {
                int i36 = i35 + i33;
                int i37 = i34 + 1;
                int i38 = i34 >>> C4761.f10783;
                if (i36 > i30) {
                    i3 = i31;
                    break loop3;
                }
                int iM19518 = (C8377.m19516(i33, bArr) * i27) >>> 20;
                i4 = iArr[iM19518];
                i5 = i33 - i4;
                iArr[iM19518] = i33;
                if (i5 >= 65536 || !C14818.m33851(i4, i33, bArr)) {
                    i33 = i36;
                    i34 = i37;
                    i35 = i38;
                    i27 = -1640531535;
                }
            }
            int iM33855 = C14818.m33853(i4, bArr, i33, i31);
            i3 = i33 - iM33855;
            int i39 = i4 - iM33855;
            int i40 = i3 - i31;
            int iM33856 = i32 + 1;
            if (iM33856 + i40 + 8 + (i40 >>> 8) > i2) {
                throw new C6102("maxDestLen is too small");
            }
            if (i40 >= 15) {
                bArr2[i32] = (byte) 240;
                iM33856 = C14818.m33852(i40 - 15, iM33856, bArr2);
            } else {
                bArr2[i32] = (byte) (i40 << 4);
            }
            C14818.m33850(i31, bArr, iM33856, bArr2, i40);
            int i41 = iM33856 + i40;
            while (true) {
                bArr2[i41] = (byte) i5;
                bArr2[i41 + 1] = (byte) (i5 >>> 8);
                int iM33857 = i41 + 2;
                int i42 = i3 + 4;
                int iM33848 = C14818.m33847(i39 + 4, bArr, i42, i29);
                if (i41 + 8 + (iM33848 >>> 8) > i2) {
                    throw new C6102("maxDestLen is too small");
                }
                i3 = i42 + iM33848;
                if (iM33848 >= 15) {
                    bArr2[i32] = (byte) (15 | bArr2[i32]);
                    iM33857 = C14818.m33852(iM33848 - 15, iM33857, bArr2);
                } else {
                    bArr2[i32] = (byte) (iM33848 | bArr2[i32]);
                }
                i32 = iM33857;
                if (i3 > i30) {
                    break loop3;
                }
                int i43 = i3 - 2;
                iArr[(C8377.m19516(i43, bArr) * (-1640531535)) >>> 20] = i43;
                int iM19519 = (C8377.m19516(i3, bArr) * (-1640531535)) >>> 20;
                i39 = iArr[iM19519];
                iArr[iM19519] = i3;
                i5 = i3 - i39;
                if (i5 >= 65536 || !C14818.m33851(i39, i3, bArr)) {
                    i31 = i3;
                    i28 = 1;
                    i33 = i3 + 1;
                    i27 = -1640531535;
                } else {
                    i41 = i32 + 1;
                    bArr2[i32] = (byte) 0;
                }
            }
        }
        return C14818.m33848(bArr, i3, i - i3, bArr2, i32, i2);
    }
}
