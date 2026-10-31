package l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۙۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 68AX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4633 extends AbstractC2988 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC2988 f14709 = new C4633(2);

    @Override // l.AbstractC2988
    /* JADX INFO: renamed from: ֫ */
    public final int mo9121(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C6322.m17572(0, i, bArr);
        C6322.m17572(0, i2, bArr2);
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
                    int i15 = i10 << C2517.f7991;
                    int i16 = 1;
                    while (true) {
                        int i17 = i16 + i13;
                        int i18 = i15 + 1;
                        int i19 = i15 >>> C2517.f7991;
                        if (i17 > i12) {
                            break loop0;
                        }
                        int iM17576 = (C6322.m17576(i13, bArr) * (-1640531535)) >>> 19;
                        i8 = sArr[iM17576] & HPKE.aead_EXPORT_ONLY;
                        sArr[iM17576] = (short) i13;
                        if (C13099.m31761(i8, i13, bArr)) {
                            break;
                        }
                        i13 = i17;
                        i15 = i18;
                        i16 = i19;
                    }
                    int iM31763 = C13099.m31763(i8, bArr, i13, i7);
                    int i20 = i13 - iM31763;
                    int i21 = i8 - iM31763;
                    int i22 = i20 - i7;
                    int iM31762 = i14 + 1;
                    if (iM31762 + i22 + 8 + (i22 >>> 8) > i2) {
                        throw new C3928("maxDestLen is too small");
                    }
                    if (i22 >= i9) {
                        bArr2[i14] = (byte) 240;
                        iM31762 = C13099.m31762(i22 - 15, iM31762, bArr2);
                    } else {
                        bArr2[i14] = (byte) (i22 << 4);
                    }
                    C13099.m31760(i7, bArr, iM31762, bArr2, i22);
                    int i23 = iM31762 + i22;
                    while (true) {
                        short s = (short) (i20 - i21);
                        bArr2[i23] = (byte) s;
                        bArr2[i23 + 1] = (byte) (s >>> 8);
                        int iM31764 = i23 + 2;
                        int i24 = i20 + 4;
                        int iM31757 = C13099.m31757(i21 + 4, bArr, i24, i11);
                        if (i23 + 8 + (iM31757 >>> 8) > i2) {
                            throw new C3928("maxDestLen is too small");
                        }
                        i20 = i24 + iM31757;
                        if (iM31757 >= 15) {
                            bArr2[i14] = (byte) (15 | bArr2[i14]);
                            iM31764 = C13099.m31762(iM31757 - 15, iM31764, bArr2);
                        } else {
                            bArr2[i14] = (byte) (iM31757 | bArr2[i14]);
                        }
                        i14 = iM31764;
                        if (i20 > i12) {
                            i7 = i20;
                            break loop0;
                        }
                        int i25 = i20 - 2;
                        sArr[(C6322.m17576(i25, bArr) * (-1640531535)) >>> 19] = (short) i25;
                        int iM17577 = (C6322.m17576(i20, bArr) * (-1640531535)) >>> 19;
                        int i26 = sArr[iM17577] & HPKE.aead_EXPORT_ONLY;
                        sArr[iM17577] = (short) i20;
                        if (!C13099.m31761(i20, i26, bArr)) {
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
            return C13099.m31758(bArr, i7, i - i7, bArr2, i6, i2);
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
            int i34 = i28 << C2517.f7991;
            int i35 = 1;
            while (true) {
                int i36 = i35 + i33;
                int i37 = i34 + 1;
                int i38 = i34 >>> C2517.f7991;
                if (i36 > i30) {
                    i3 = i31;
                    break loop3;
                }
                int iM17578 = (C6322.m17576(i33, bArr) * i27) >>> 20;
                i4 = iArr[iM17578];
                i5 = i33 - i4;
                iArr[iM17578] = i33;
                if (i5 >= 65536 || !C13099.m31761(i4, i33, bArr)) {
                    i33 = i36;
                    i34 = i37;
                    i35 = i38;
                    i27 = -1640531535;
                }
            }
            int iM31765 = C13099.m31763(i4, bArr, i33, i31);
            i3 = i33 - iM31765;
            int i39 = i4 - iM31765;
            int i40 = i3 - i31;
            int iM31766 = i32 + 1;
            if (iM31766 + i40 + 8 + (i40 >>> 8) > i2) {
                throw new C3928("maxDestLen is too small");
            }
            if (i40 >= 15) {
                bArr2[i32] = (byte) 240;
                iM31766 = C13099.m31762(i40 - 15, iM31766, bArr2);
            } else {
                bArr2[i32] = (byte) (i40 << 4);
            }
            C13099.m31760(i31, bArr, iM31766, bArr2, i40);
            int i41 = iM31766 + i40;
            while (true) {
                bArr2[i41] = (byte) i5;
                bArr2[i41 + 1] = (byte) (i5 >>> 8);
                int iM31767 = i41 + 2;
                int i42 = i3 + 4;
                int iM31758 = C13099.m31757(i39 + 4, bArr, i42, i29);
                if (i41 + 8 + (iM31758 >>> 8) > i2) {
                    throw new C3928("maxDestLen is too small");
                }
                i3 = i42 + iM31758;
                if (iM31758 >= 15) {
                    bArr2[i32] = (byte) (15 | bArr2[i32]);
                    iM31767 = C13099.m31762(iM31758 - 15, iM31767, bArr2);
                } else {
                    bArr2[i32] = (byte) (iM31758 | bArr2[i32]);
                }
                i32 = iM31767;
                if (i3 > i30) {
                    break loop3;
                }
                int i43 = i3 - 2;
                iArr[(C6322.m17576(i43, bArr) * (-1640531535)) >>> 20] = i43;
                int iM17579 = (C6322.m17576(i3, bArr) * (-1640531535)) >>> 20;
                i39 = iArr[iM17579];
                iArr[iM17579] = i3;
                i5 = i3 - i39;
                if (i5 >= 65536 || !C13099.m31761(i39, i3, bArr)) {
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
        return C13099.m31758(bArr, i3, i - i3, bArr2, i32, i2);
    }
}
