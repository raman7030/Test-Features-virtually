package p067l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ᩴۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C20103 {
    /* JADX INFO: renamed from: ֫ */
    public static void m45531(C11996 c11996, C24145 c24145, C11209 c11209, C19452 c19452, boolean z, boolean z2, C9197 c9197, C23949 c23949) {
        C12826.requireNonNull(c11996, "out");
        C12826.requireNonNull(c24145, "definition");
        long position = c11996.getPosition();
        try {
            C16689 c16689M53391 = c24145.m53391();
            C24320 c24320M53392 = c24145.m53392();
            String strM20931 = c16689M53391 == null ? null : C9038.m20931(c16689M53391);
            if (z && c16689M53391 != null && strM20931 != null && c24320M53392 != null && c11209 != null) {
                boolean z3 = false;
                if (z2 && c9197 == null && c19452 != null && c19452.m44259() == c11209.m25889()) {
                    if (c11209.m25894() <= 1000000 && c19452.m44253() <= 1000000) {
                        m45530(c11996, 1, strM20931, c24320M53392, c11209.m25889(), 0, c11209.m25889(), c11209, c19452, c23949);
                        return;
                    }
                }
                if (!z2 && c9197 != null && c9197.m21194() == c11209 && c9197.m21197()) {
                    C11209 c11209M21195 = c9197.m21195();
                    C19452 c19452M21196 = c9197.m21196();
                    if (c11209M21195 != null && c19452M21196 != null && c19452M21196.m44259() == c11209M21195.m25889()) {
                        if (c11209M21195.m25894() <= 1000000 && c19452M21196.m44253() <= 1000000) {
                            z3 = true;
                        }
                        if (z3) {
                            m45530(c11996, 2, strM20931, c24320M53392, c11209.m25889(), c9197.m21192(), c9197.m21188(), c11209M21195, c19452M21196, c23949);
                            return;
                        }
                    }
                }
                m45529(c11996);
                return;
            }
            m45529(c11996);
        } catch (RuntimeException unused) {
            c11996.seek(position);
            c11996.m27440((int) position);
            m45529(c11996);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45530(C11996 c11996, int i, String str, C24320 c24320, int i2, int i3, int i4, C11209 c11209, C19452 c19452, C23949 c23949) {
        if (c11209.m25889() != i4 - i3 || c19452.m44259() != c11209.m25889()) {
            throw new IllegalArgumentException("Syntax cache payload coverage differs");
        }
        c11996.writeInt(1398361651);
        c11996.writeInt(3);
        int position = (int) c11996.getPosition();
        c11996.writeByte(i);
        c11996.m27443((CharSequence) str);
        c11996.writeInt(c24320.m53668());
        c11996.writeInt(i2);
        c11996.writeInt(i3);
        c11996.writeInt(i4);
        c11996.m27445(c23949 != null);
        if (c23949 != null) {
            int iM53055 = c23949.m53055();
            if (iM53055 > 32) {
                throw new IllegalArgumentException("Too many syntax derived refresh ranges");
            }
            c11996.writeInt(iM53055);
            int iM36019 = -1;
            for (int i5 = 0; i5 < iM53055; i5++) {
                C15901 c15901M53050 = c23949.m53050(i5);
                if (c15901M53050.m36020() < 0 || c15901M53050.m36020() >= c15901M53050.m36019() || c15901M53050.m36019() > i2 || c15901M53050.m36020() <= iM36019) {
                    throw new IllegalArgumentException("Invalid syntax derived refresh range");
                }
                c11996.writeInt(c15901M53050.m36020());
                c11996.writeInt(c15901M53050.m36019());
                iM36019 = c15901M53050.m36019();
            }
        }
        C6021 c6021 = new C6021();
        C19255 c19255 = new C19255();
        c19255.m43866(c11209);
        while (c19255.m43871()) {
            c6021.m13532(c19255.m43870());
        }
        c11996.writeInt(c11209.m25894());
        c11996.writeInt(c6021.m13529());
        for (int i6 = 0; i6 < c6021.m13529(); i6++) {
            C23120 c23120M13531 = c6021.m13531(i6);
            c11996.writeInt(c23120M13531.m51561());
            c11996.writeInt(c23120M13531.m51560());
            c11996.writeInt(c23120M13531.m51563());
            c11996.writeInt(c23120M13531.m51562());
            c11996.writeInt(c23120M13531.m51564());
            String strM51551 = c23120M13531.m51551();
            c11996.m27445(strM51551 != null);
            if (strM51551 != null) {
                c11996.m27443((CharSequence) strM51551);
            }
        }
        c19255.m43866(c11209);
        while (c19255.m43871()) {
            int iM43865 = c19255.m43865() - c19255.m43868();
            if (c19255.m43872()) {
                iM43865 |= Integer.MIN_VALUE;
            }
            c11996.writeInt(iM43865);
            c11996.writeInt(c6021.m13530(c19255.m43870()));
        }
        c11996.writeInt(c19452.m44253());
        for (int i7 = 0; i7 < c19452.m44253(); i7++) {
            c11996.writeInt(c19452.m44261(i7));
            c11996.writeInt(c19452.m44262(i7));
            c11996.writeInt(c19452.m44263(i7));
            C16689 c16689M44264 = c19452.m44264(i7);
            int iM53660 = c16689M44264 == null ? -1 : c24320.m53660(c16689M44264);
            if (c16689M44264 != null && iM53660 < 0) {
                throw new IllegalArgumentException("Syntax context language is outside program graph");
            }
            c11996.writeInt(iM53660 + 1);
        }
        byte[] bArrM27458 = c11996.m27458();
        int position2 = (int) c11996.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM27458, position, position2 - position);
        c11996.writeInt((int) crc32.getValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45529(C11996 c11996) {
        c11996.writeInt(1398361651);
        c11996.writeInt(3);
        int position = (int) c11996.getPosition();
        c11996.writeByte(0);
        byte[] bArrM27458 = c11996.m27458();
        int position2 = (int) c11996.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM27458, position, position2 - position);
        c11996.writeInt((int) crc32.getValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17419 m45526(int i, int i2, C14677 c14677) {
        C17419 c17419M39657;
        C12826.requireNonNull(c14677, "in");
        byte[] bArr = c14677.f41893;
        int iM33575 = c14677.m33575();
        if (i < iM33575 || i > bArr.length) {
            throw new IndexOutOfBoundsException("Syntax cache record is outside input");
        }
        C24145 c24145M53390 = C24145.m53390(null);
        try {
            if (i - iM33575 < 13) {
                c17419M39657 = C17419.m39657(c24145M53390);
            } else {
                C4680 c4680 = new C4680(bArr, iM33575, i);
                if (c4680.m9919() != 1398361651 || c4680.m9919() != 3) {
                    c17419M39657 = C17419.m39657(c24145M53390);
                } else {
                    int iM9917 = c4680.m9917();
                    int i3 = i - 4;
                    int iM45532 = m45532(i3, bArr);
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr, iM9917, i3 - iM9917);
                    if (((int) crc32.getValue()) != iM45532) {
                        c17419M39657 = C17419.m39657(c24145M53390);
                    } else {
                        C4680 c4681 = new C4680(bArr, iM9917, i3);
                        int iM9920 = c4681.m9920();
                        if (iM9920 == 0) {
                            c4681.m9921();
                            c17419M39657 = C17419.m39657(c24145M53390);
                        } else {
                            if (iM9920 != 1 && iM9920 != 2) {
                                throw new IllegalArgumentException("Unknown syntax cache kind");
                            }
                            C24145 c24145M53391 = C24145.m53390(C9038.m20940(c4681.m9918(16384)));
                            C24320 c24320M53392 = c24145M53391.m53392();
                            C16689 c16689M53391 = c24145M53391.m53391();
                            int iM9919 = c4681.m9919();
                            int iM99110 = c4681.m9919();
                            int iM99111 = c4681.m9919();
                            int iM99112 = c4681.m9919();
                            if (c24320M53392 == null || c16689M53391 == null || c24320M53392.m53668() != iM9919 || iM99110 != i2 || iM99110 < 0 || iM99111 < 0 || iM99112 < iM99111 || iM99112 > iM99110) {
                                throw new IllegalArgumentException("Syntax cache identity differs");
                            }
                            int i4 = iM99112 - iM99111;
                            if (iM9920 == 1 && (iM99111 != 0 || iM99112 != iM99110 || iM99110 > 1000000)) {
                                throw new IllegalArgumentException("Invalid full syntax cache coverage");
                            }
                            C23949 c23949M45528 = m45528(c4681, iM99110);
                            C11209 c11209M45533 = m45533(c4681, i4);
                            C19452 c19452M45527 = m45527(c4681, i4, c24320M53392);
                            c4681.m9921();
                            if (iM9920 == 1) {
                                c17419M39657 = C17419.m39659(c24145M53391, c11209M45533, c19452M45527, c23949M45528);
                            } else {
                                c17419M39657 = C17419.m39658(c24145M53391, C9197.m21185(iM99110, iM99111, c11209M45533, c19452M45527, c24320M53392.f77065), c23949M45528);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException unused) {
            c17419M39657 = C17419.m39657(c24145M53390);
        } finally {
            c14677.seek(i);
        }
        return c17419M39657;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C11209 m45533(C4680 c4680, int i) {
        int iM9919 = c4680.m9919();
        int iM99110 = c4680.m9919();
        if (iM9919 < 0 || iM99110 < 0 || ((i == 0 && (iM9919 != 0 || iM99110 != 0)) || ((i != 0 && (iM9919 == 0 || iM9919 > i || iM9919 > 1000000 || iM99110 == 0 || iM99110 > iM9919)) || iM99110 > c4680.m9922() / 21))) {
            throw new IllegalArgumentException("Invalid syntax cache run counts");
        }
        C23120[] c23120Arr = new C23120[iM99110];
        for (int i2 = 0; i2 < iM99110; i2++) {
            int iM99111 = c4680.m9919();
            int iM99112 = c4680.m9919();
            int iM99113 = c4680.m9919();
            int iM99114 = c4680.m9919();
            int iM99115 = c4680.m9919();
            int iM9920 = c4680.m9920();
            if (iM9920 == 0 || iM9920 == 255) {
                c23120Arr[i2] = C23120.m51549(iM9920 != 0 ? c4680.m9918(65536) : null, iM99111, iM99112, iM99113, iM99114, iM99115);
            } else {
                throw new IllegalArgumentException("Invalid syntax cache boolean");
            }
        }
        C17913 c17913 = new C17913();
        int i3 = 0;
        for (int i4 = 0; i4 < iM9919; i4++) {
            int iM99116 = c4680.m9919();
            boolean z = iM99116 < 0;
            int i5 = iM99116 & Integer.MAX_VALUE;
            int iM99117 = c4680.m9919();
            if (i5 <= 0 || iM99117 < 0 || iM99117 >= iM99110 || ((long) i3) + ((long) i5) > i) {
                throw new IllegalArgumentException("Invalid syntax cache run");
            }
            c17913.m40720(i5, c23120Arr[iM99117], z);
            i3 += i5;
        }
        if (i3 != i) {
            throw new IllegalArgumentException("Syntax cache runs do not cover payload");
        }
        return c17913.m40719();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19452 m45527(C4680 c4680, int i, C24320 c24320) {
        int iM9919 = c4680.m9919();
        if (iM9919 <= 0 || iM9919 > 1000000 || iM9919 > c4680.m9922() / 16) {
            throw new IllegalArgumentException("Invalid syntax cache context count");
        }
        int[] iArr = new int[iM9919];
        int[] iArr2 = new int[iM9919];
        int[] iArr3 = new int[iM9919];
        C16689[] c16689Arr = new C16689[iM9919];
        for (int i2 = 0; i2 < iM9919; i2++) {
            int iM99110 = c4680.m9919();
            iArr[i2] = iM99110;
            int iM99111 = c4680.m9919();
            iArr2[i2] = iM99111;
            int iM99112 = c4680.m9919();
            iArr3[i2] = iM99112;
            int iM99113 = c4680.m9919();
            if (iM99110 < 0 || iM99111 < iM99110 || iM99111 > i || ((i2 == 0 && iM99112 != -1) || ((i2 != 0 && (iM99112 < 0 || iM99112 >= i2)) || iM99113 < 0 || iM99113 > c24320.m53659()))) {
                throw new IllegalArgumentException("Invalid syntax cache context node");
            }
            c16689Arr[i2] = iM99113 == 0 ? null : c24320.m53662(iM99113 - 1);
        }
        if (iArr[0] != 0 || iArr2[0] != i || c16689Arr[0] != c24320.f77059) {
            throw new IllegalArgumentException("Invalid syntax cache context root");
        }
        return new C19452(i, iM9919, iArr, iArr2, iArr3, c16689Arr);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m45532(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23949 m45528(C4680 c4680, int i) {
        int iM9920 = c4680.m9920();
        if (iM9920 != 0 && iM9920 != 255) {
            throw new IllegalArgumentException("Invalid syntax cache boolean");
        }
        if (iM9920 == 0) {
            return null;
        }
        int iM9919 = c4680.m9919();
        if (iM9919 < 0 || iM9919 > 32 || iM9919 > c4680.m9922() / 8) {
            throw new IllegalArgumentException("Invalid syntax derived refresh range count");
        }
        C23949 c23949M53048 = C23949.f76078;
        int i2 = -1;
        int i3 = 0;
        while (i3 < iM9919) {
            int iM99110 = c4680.m9919();
            int iM99111 = c4680.m9919();
            if (iM99110 < 0 || iM99110 >= iM99111 || iM99111 > i || iM99110 <= i2) {
                throw new IllegalArgumentException("Invalid syntax derived refresh range");
            }
            c23949M53048 = C23949.m53048(c23949M53048, iM99110, iM99111);
            i3++;
            i2 = iM99111;
        }
        return c23949M53048;
    }
}
