package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ᩴۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18660 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43265(C10130 c10130, C22913 c22913, C9302 c9302, C17975 c17975, boolean z, boolean z2, C7185 c7185, C22707 c22707) {
        C11003.requireNonNull(c10130, "out");
        C11003.requireNonNull(c22913, "definition");
        long position = c10130.getPosition();
        try {
            C15068 c15068M51000 = c22913.m51000();
            C23097 c23097M51001 = c22913.m51001();
            String strM18974 = c15068M51000 == null ? null : C7017.m18974(c15068M51000);
            if (z && c15068M51000 != null && strM18974 != null && c23097M51001 != null && c9302 != null) {
                boolean z3 = false;
                if (z2 && c7185 == null && c17975 != null && c17975.m42010() == c9302.m23880()) {
                    if (c9302.m23885() <= 1000000 && c17975.m42004() <= 1000000) {
                        m43264(c10130, 1, strM18974, c23097M51001, c9302.m23880(), 0, c9302.m23880(), c9302, c17975, c22707);
                        return;
                    }
                }
                if (!z2 && c7185 != null && c7185.m19247() == c9302 && c7185.m19250()) {
                    C9302 c9302M19248 = c7185.m19248();
                    C17975 c17975M19249 = c7185.m19249();
                    if (c9302M19248 != null && c17975M19249 != null && c17975M19249.m42010() == c9302M19248.m23880()) {
                        if (c9302M19248.m23885() <= 1000000 && c17975M19249.m42004() <= 1000000) {
                            z3 = true;
                        }
                        if (z3) {
                            m43264(c10130, 2, strM18974, c23097M51001, c9302.m23880(), c7185.m19245(), c7185.m19241(), c9302M19248, c17975M19249, c22707);
                            return;
                        }
                    }
                }
                m43263(c10130);
                return;
            }
            m43263(c10130);
        } catch (RuntimeException unused) {
            c10130.seek(position);
            c10130.m25420((int) position);
            m43263(c10130);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43264(C10130 c10130, int i, String str, C23097 c23097, int i2, int i3, int i4, C9302 c9302, C17975 c17975, C22707 c22707) {
        if (c9302.m23880() != i4 - i3 || c17975.m42010() != c9302.m23880()) {
            throw new IllegalArgumentException("Syntax cache payload coverage differs");
        }
        c10130.writeInt(1398361651);
        c10130.writeInt(3);
        int position = (int) c10130.getPosition();
        c10130.writeByte(i);
        c10130.m25423((CharSequence) str);
        c10130.writeInt(c23097.m51274());
        c10130.writeInt(i2);
        c10130.writeInt(i3);
        c10130.writeInt(i4);
        c10130.m25425(c22707 != null);
        if (c22707 != null) {
            int iM50729 = c22707.m50729();
            if (iM50729 > 32) {
                throw new IllegalArgumentException("Too many syntax derived refresh ranges");
            }
            c10130.writeInt(iM50729);
            int iM33887 = -1;
            for (int i5 = 0; i5 < iM50729; i5++) {
                C14239 c14239M50724 = c22707.m50724(i5);
                if (c14239M50724.m33888() < 0 || c14239M50724.m33888() >= c14239M50724.m33887() || c14239M50724.m33887() > i2 || c14239M50724.m33888() <= iM33887) {
                    throw new IllegalArgumentException("Invalid syntax derived refresh range");
                }
                c10130.writeInt(c14239M50724.m33888());
                c10130.writeInt(c14239M50724.m33887());
                iM33887 = c14239M50724.m33887();
            }
        }
        C3843 c3843 = new C3843();
        C17768 c17768 = new C17768();
        c17768.m41620(c9302);
        while (c17768.m41625()) {
            c3843.m11596(c17768.m41624());
        }
        c10130.writeInt(c9302.m23885());
        c10130.writeInt(c3843.m11593());
        for (int i6 = 0; i6 < c3843.m11593(); i6++) {
            C21834 c21834M11595 = c3843.m11595(i6);
            c10130.writeInt(c21834M11595.m49210());
            c10130.writeInt(c21834M11595.m49209());
            c10130.writeInt(c21834M11595.m49212());
            c10130.writeInt(c21834M11595.m49211());
            c10130.writeInt(c21834M11595.m49213());
            String strM49200 = c21834M11595.m49200();
            c10130.m25425(strM49200 != null);
            if (strM49200 != null) {
                c10130.m25423((CharSequence) strM49200);
            }
        }
        c17768.m41620(c9302);
        while (c17768.m41625()) {
            int iM41619 = c17768.m41619() - c17768.m41622();
            if (c17768.m41626()) {
                iM41619 |= Integer.MIN_VALUE;
            }
            c10130.writeInt(iM41619);
            c10130.writeInt(c3843.m11594(c17768.m41624()));
        }
        c10130.writeInt(c17975.m42004());
        for (int i7 = 0; i7 < c17975.m42004(); i7++) {
            c10130.writeInt(c17975.m42012(i7));
            c10130.writeInt(c17975.m42013(i7));
            c10130.writeInt(c17975.m42014(i7));
            C15068 c15068M42015 = c17975.m42015(i7);
            int iM51266 = c15068M42015 == null ? -1 : c23097.m51266(c15068M42015);
            if (c15068M42015 != null && iM51266 < 0) {
                throw new IllegalArgumentException("Syntax context language is outside program graph");
            }
            c10130.writeInt(iM51266 + 1);
        }
        byte[] bArrM25438 = c10130.m25438();
        int position2 = (int) c10130.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM25438, position, position2 - position);
        c10130.writeInt((int) crc32.getValue());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43263(C10130 c10130) {
        c10130.writeInt(1398361651);
        c10130.writeInt(3);
        int position = (int) c10130.getPosition();
        c10130.writeByte(0);
        byte[] bArrM25438 = c10130.m25438();
        int position2 = (int) c10130.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM25438, position, position2 - position);
        c10130.writeInt((int) crc32.getValue());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15836 m43260(int i, int i2, C12951 c12951) {
        C15836 c15836M37485;
        C11003.requireNonNull(c12951, "in");
        byte[] bArr = c12951.f38849;
        int iM31488 = c12951.m31488();
        if (i < iM31488 || i > bArr.length) {
            throw new IndexOutOfBoundsException("Syntax cache record is outside input");
        }
        C22913 c22913M50999 = C22913.m50999(null);
        try {
            if (i - iM31488 < 13) {
                c15836M37485 = C15836.m37485(c22913M50999);
            } else {
                C2432 c2432 = new C2432(bArr, iM31488, i);
                if (c2432.m7871() != 1398361651 || c2432.m7871() != 3) {
                    c15836M37485 = C15836.m37485(c22913M50999);
                } else {
                    int iM7869 = c2432.m7869();
                    int i3 = i - 4;
                    int iM43266 = m43266(i3, bArr);
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr, iM7869, i3 - iM7869);
                    if (((int) crc32.getValue()) != iM43266) {
                        c15836M37485 = C15836.m37485(c22913M50999);
                    } else {
                        C2432 c2433 = new C2432(bArr, iM7869, i3);
                        int iM7872 = c2433.m7872();
                        if (iM7872 == 0) {
                            c2433.m7873();
                            c15836M37485 = C15836.m37485(c22913M50999);
                        } else {
                            if (iM7872 != 1 && iM7872 != 2) {
                                throw new IllegalArgumentException("Unknown syntax cache kind");
                            }
                            C22913 c22913M509910 = C22913.m50999(C7017.m18983(c2433.m7870(16384)));
                            C23097 c23097M51001 = c22913M509910.m51001();
                            C15068 c15068M51000 = c22913M509910.m51000();
                            int iM7871 = c2433.m7871();
                            int iM7873 = c2433.m7871();
                            int iM7874 = c2433.m7871();
                            int iM7875 = c2433.m7871();
                            if (c23097M51001 == null || c15068M51000 == null || c23097M51001.m51274() != iM7871 || iM7873 != i2 || iM7873 < 0 || iM7874 < 0 || iM7875 < iM7874 || iM7875 > iM7873) {
                                throw new IllegalArgumentException("Syntax cache identity differs");
                            }
                            int i4 = iM7875 - iM7874;
                            if (iM7872 == 1 && (iM7874 != 0 || iM7875 != iM7873 || iM7873 > 1000000)) {
                                throw new IllegalArgumentException("Invalid full syntax cache coverage");
                            }
                            C22707 c22707M43262 = m43262(c2433, iM7873);
                            C9302 c9302M43267 = m43267(c2433, i4);
                            C17975 c17975M43261 = m43261(c2433, i4, c23097M51001);
                            c2433.m7873();
                            if (iM7872 == 1) {
                                c15836M37485 = C15836.m37487(c22913M509910, c9302M43267, c17975M43261, c22707M43262);
                            } else {
                                c15836M37485 = C15836.m37486(c22913M509910, C7185.m19238(iM7873, iM7874, c9302M43267, c17975M43261, c23097M51001.f74319), c22707M43262);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException unused) {
            c15836M37485 = C15836.m37485(c22913M50999);
        } finally {
            c12951.seek(i);
        }
        return c15836M37485;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C9302 m43267(C2432 c2432, int i) {
        int iM7871 = c2432.m7871();
        int iM7872 = c2432.m7871();
        if (iM7871 < 0 || iM7872 < 0 || ((i == 0 && (iM7871 != 0 || iM7872 != 0)) || ((i != 0 && (iM7871 == 0 || iM7871 > i || iM7871 > 1000000 || iM7872 == 0 || iM7872 > iM7871)) || iM7872 > c2432.m7874() / 21))) {
            throw new IllegalArgumentException("Invalid syntax cache run counts");
        }
        C21834[] c21834Arr = new C21834[iM7872];
        for (int i2 = 0; i2 < iM7872; i2++) {
            int iM7873 = c2432.m7871();
            int iM7874 = c2432.m7871();
            int iM7875 = c2432.m7871();
            int iM7876 = c2432.m7871();
            int iM7877 = c2432.m7871();
            int iM7878 = c2432.m7872();
            if (iM7878 == 0 || iM7878 == 255) {
                c21834Arr[i2] = C21834.m49198(iM7878 != 0 ? c2432.m7870(65536) : null, iM7873, iM7874, iM7875, iM7876, iM7877);
            } else {
                throw new IllegalArgumentException("Invalid syntax cache boolean");
            }
        }
        C16356 c16356 = new C16356();
        int i3 = 0;
        for (int i4 = 0; i4 < iM7871; i4++) {
            int iM7879 = c2432.m7871();
            boolean z = iM7879 < 0;
            int i5 = iM7879 & Integer.MAX_VALUE;
            int iM78710 = c2432.m7871();
            if (i5 <= 0 || iM78710 < 0 || iM78710 >= iM7872 || ((long) i3) + ((long) i5) > i) {
                throw new IllegalArgumentException("Invalid syntax cache run");
            }
            c16356.m38503(i5, c21834Arr[iM78710], z);
            i3 += i5;
        }
        if (i3 != i) {
            throw new IllegalArgumentException("Syntax cache runs do not cover payload");
        }
        return c16356.m38502();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17975 m43261(C2432 c2432, int i, C23097 c23097) {
        int iM7871 = c2432.m7871();
        if (iM7871 <= 0 || iM7871 > 1000000 || iM7871 > c2432.m7874() / 16) {
            throw new IllegalArgumentException("Invalid syntax cache context count");
        }
        int[] iArr = new int[iM7871];
        int[] iArr2 = new int[iM7871];
        int[] iArr3 = new int[iM7871];
        C15068[] c15068Arr = new C15068[iM7871];
        for (int i2 = 0; i2 < iM7871; i2++) {
            int iM7872 = c2432.m7871();
            iArr[i2] = iM7872;
            int iM7873 = c2432.m7871();
            iArr2[i2] = iM7873;
            int iM7874 = c2432.m7871();
            iArr3[i2] = iM7874;
            int iM7875 = c2432.m7871();
            if (iM7872 < 0 || iM7873 < iM7872 || iM7873 > i || ((i2 == 0 && iM7874 != -1) || ((i2 != 0 && (iM7874 < 0 || iM7874 >= i2)) || iM7875 < 0 || iM7875 > c23097.m51265()))) {
                throw new IllegalArgumentException("Invalid syntax cache context node");
            }
            c15068Arr[i2] = iM7875 == 0 ? null : c23097.m51268(iM7875 - 1);
        }
        if (iArr[0] != 0 || iArr2[0] != i || c15068Arr[0] != c23097.f74313) {
            throw new IllegalArgumentException("Invalid syntax cache context root");
        }
        return new C17975(i, iM7871, iArr, iArr2, iArr3, c15068Arr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m43266(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22707 m43262(C2432 c2432, int i) {
        int iM7872 = c2432.m7872();
        if (iM7872 != 0 && iM7872 != 255) {
            throw new IllegalArgumentException("Invalid syntax cache boolean");
        }
        if (iM7872 == 0) {
            return null;
        }
        int iM7871 = c2432.m7871();
        if (iM7871 < 0 || iM7871 > 32 || iM7871 > c2432.m7874() / 8) {
            throw new IllegalArgumentException("Invalid syntax derived refresh range count");
        }
        C22707 c22707M50722 = C22707.f73353;
        int i2 = -1;
        int i3 = 0;
        while (i3 < iM7871) {
            int iM7873 = c2432.m7871();
            int iM7874 = c2432.m7871();
            if (iM7873 < 0 || iM7873 >= iM7874 || iM7874 > i || iM7873 <= i2) {
                throw new IllegalArgumentException("Invalid syntax derived refresh range");
            }
            c22707M50722 = C22707.m50722(c22707M50722, iM7873, iM7874);
            i3++;
            i2 = iM7874;
        }
        return c22707M50722;
    }
}
