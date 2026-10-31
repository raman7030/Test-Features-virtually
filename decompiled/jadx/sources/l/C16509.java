package l;

import com.umeng.analytics.pro.bo;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܽ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S8SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16509 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f50737 = {0, 0, 0, 1};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final float[] f50736 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f50739 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int[] f50738 = new int[10];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38880(int i, byte[] bArr) {
        int i2;
        synchronized (f50739) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f50738;
                    if (iArr.length <= i4) {
                        f50738 = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f50738[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f50738[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38881(C8353 c8353) {
        if (C11003.equals(c8353.f25614, "video/avc")) {
            return 1;
        }
        return (C11003.equals(c8353.f25614, "video/hevc") || C9786.m24803(c8353.f25619, "video/hevc") != null) ? 2 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38888(byte[] bArr, int i, C8353 c8353) {
        int i2;
        if (C11003.equals(c8353.f25614, "video/avc")) {
            byte b = bArr[4];
            if (((b & UTF8.S_P4B) >> 5) == 0 && ((i2 = b & bo.j) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (C11003.equals(c8353.f25614, "video/hevc")) {
            C4309 c4309M38884 = m38884(new C17921(bArr, 4, i + 4));
            int i3 = c4309M38884.f13892;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && c4309M38884.f13893 == c8353.f25616 - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:128:0x0201  */
    /* JADX WARN: Code duplicated, block: B:131:0x020a  */
    /* JADX WARN: Code duplicated, block: B:133:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0211  */
    /* JADX WARN: Code duplicated, block: B:137:0x021d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0234  */
    /* JADX WARN: Code duplicated, block: B:140:0x0240  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0178  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0188  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C10866 m38891(int i, int i2, byte[] bArr) {
        int iM41928;
        boolean z;
        int i3;
        int i4;
        int iM41929;
        boolean z2;
        int i5;
        boolean zM41927;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM47898;
        float f;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM47897;
        int i15;
        boolean zM41928;
        boolean zM41929;
        int iM419210;
        int iM41923;
        int iM41924;
        int iM41925;
        int i16;
        int i17;
        int i18;
        C17921 c17921 = new C17921(bArr, i + 1, i2);
        int iM41926 = c17921.m41923(8);
        int iM41927 = c17921.m41923(8);
        int iM419211 = c17921.m41923(8);
        int iM419212 = c17921.m41928();
        if (iM41926 == 100 || iM41926 == 110 || iM41926 == 122 || iM41926 == 244 || iM41926 == 44 || iM41926 == 83 || iM41926 == 86 || iM41926 == 118 || iM41926 == 128 || iM41926 == 138) {
            iM41928 = c17921.m41928();
            boolean zM419210 = iM41928 == 3 ? c17921.m41927() : false;
            int iM419213 = c17921.m41928();
            int iM419214 = c17921.m41928();
            c17921.m41925();
            if (c17921.m41927()) {
                int i19 = iM41928 != 3 ? 8 : 12;
                int i20 = 0;
                while (i20 < i19) {
                    if (c17921.m41927()) {
                        int i21 = i20 < 6 ? 16 : 64;
                        int iM419215 = 8;
                        int i22 = 8;
                        for (int i23 = 0; i23 < i21; i23++) {
                            if (iM419215 != 0) {
                                iM419215 = ((c17921.m41929() + i22) + 256) % 256;
                            }
                            if (iM419215 != 0) {
                                i22 = iM419215;
                            }
                        }
                    }
                    i20++;
                }
            }
            z = zM419210;
            i3 = iM419213;
            i4 = iM419214;
        } else {
            i3 = 0;
            iM41928 = 1;
            i4 = 0;
            z = false;
        }
        int iM419216 = c17921.m41928() + 4;
        int iM419217 = c17921.m41928();
        if (iM419217 != 0) {
            if (iM419217 == 1) {
                boolean zM419211 = c17921.m41927();
                c17921.m41929();
                c17921.m41929();
                long jM41928 = c17921.m41928();
                i3 = i3;
                for (int i24 = 0; i24 < jM41928; i24++) {
                    c17921.m41928();
                }
                z2 = zM419211;
                i5 = 0;
            } else {
                iM41929 = 0;
            }
            c17921.m41928();
            c17921.m41925();
            int iM419218 = c17921.m41928() + 1;
            int iM419219 = c17921.m41928() + 1;
            zM41927 = c17921.m41927();
            i6 = 2 - (zM41927 ? 1 : 0);
            int i25 = iM419219 * i6;
            if (!zM41927) {
                c17921.m41925();
            }
            c17921.m41925();
            i7 = iM419218 * 16;
            i8 = i25 * 16;
            if (c17921.m41927()) {
                int iM419220 = c17921.m41928();
                int iM419221 = c17921.m41928();
                int iM419222 = c17921.m41928();
                int iM419223 = c17921.m41928();
                if (iM41928 == 0) {
                    i18 = 1;
                } else {
                    if (iM41928 == 3) {
                        i16 = 1;
                    } else {
                        i16 = 2;
                    }
                    if (iM41928 == 1) {
                        i17 = 2;
                    } else {
                        i17 = 1;
                    }
                    i6 *= i17;
                    i18 = i16;
                }
                i7 -= (iM419220 + iM419221) * i18;
                i8 -= (iM419222 + iM419223) * i6;
            } else {
                iM419217 = iM419217;
            }
            int i26 = i7;
            int i27 = i8;
            i9 = ((iM41926 != 44 || iM41926 == 86 || iM41926 == 100 || iM41926 == 110 || iM41926 == 122 || iM41926 == 244) && (iM41927 & 16) != 0) ? 0 : 16;
            iM47898 = -1;
            f = 1.0f;
            if (c17921.m41927()) {
                if (c17921.m41927()) {
                    iM41923 = c17921.m41923(8);
                    if (iM41923 == 255) {
                        iM41924 = c17921.m41923(16);
                        iM41925 = c17921.m41923(16);
                        if (iM41924 != 0 && iM41925 != 0) {
                            f = iM41924 / iM41925;
                        }
                    } else if (iM41923 < 17) {
                        f = f50736[iM41923];
                    } else {
                        C8083.m21451(iM41923, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (c17921.m41927()) {
                    c17921.m41925();
                }
                if (c17921.m41927()) {
                    c17921.m41926(3);
                    if (c17921.m41927()) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    if (c17921.m41927()) {
                        int iM419224 = c17921.m41923(8);
                        int iM419225 = c17921.m41923(8);
                        c17921.m41926(8);
                        iM47898 = C21054.m47898(iM419224);
                        iM47897 = C21054.m47897(iM419225);
                    }
                    if (c17921.m41927()) {
                        c17921.m41928();
                        c17921.m41928();
                    }
                    i15 = i9;
                    if (c17921.m41927()) {
                        c17921.m41926(65);
                    }
                    zM41928 = c17921.m41927();
                    if (zM41928) {
                        m38890(c17921);
                    }
                    zM41929 = c17921.m41927();
                    if (zM41929) {
                        m38890(c17921);
                    }
                    if (zM41928 || zM41929) {
                        c17921.m41925();
                    }
                    c17921.m41925();
                    if (c17921.m41927()) {
                        c17921.m41925();
                        c17921.m41928();
                        c17921.m41928();
                        c17921.m41928();
                        c17921.m41928();
                        iM419210 = c17921.m41928();
                        c17921.m41928();
                    } else {
                        iM419210 = i15;
                    }
                    i10 = iM419210;
                    i12 = i14;
                    i11 = iM47898;
                    f2 = f;
                    i13 = iM47897;
                } else {
                    i14 = -1;
                }
                iM47897 = -1;
                if (c17921.m41927()) {
                    c17921.m41928();
                    c17921.m41928();
                }
                i15 = i9;
                if (c17921.m41927()) {
                    c17921.m41926(65);
                }
                zM41928 = c17921.m41927();
                if (zM41928) {
                    m38890(c17921);
                }
                zM41929 = c17921.m41927();
                if (zM41929) {
                    m38890(c17921);
                }
                if (zM41928) {
                    c17921.m41925();
                } else {
                    c17921.m41925();
                }
                c17921.m41925();
                if (c17921.m41927()) {
                    c17921.m41925();
                    c17921.m41928();
                    c17921.m41928();
                    c17921.m41928();
                    c17921.m41928();
                    iM419210 = c17921.m41928();
                    c17921.m41928();
                } else {
                    iM419210 = i15;
                }
                i10 = iM419210;
                i12 = i14;
                i11 = iM47898;
                f2 = f;
                i13 = iM47897;
            } else {
                i10 = i9;
                f2 = 1.0f;
                i11 = -1;
                i12 = -1;
                i13 = -1;
            }
            return new C10866(iM41926, iM41927, iM419211, iM419212, i26, i27, f2, i3, i4, z, zM41927, iM419216, iM419217, i5, z2, i11, i12, i13, i10);
        }
        iM41929 = c17921.m41928() + 4;
        i5 = iM41929;
        z2 = false;
        c17921.m41928();
        c17921.m41925();
        int iM4192110 = c17921.m41928() + 1;
        int iM4192111 = c17921.m41928() + 1;
        zM41927 = c17921.m41927();
        i6 = 2 - (zM41927 ? 1 : 0);
        int i28 = iM4192111 * i6;
        if (!zM41927) {
            c17921.m41925();
        }
        c17921.m41925();
        i7 = iM4192110 * 16;
        i8 = i28 * 16;
        if (c17921.m41927()) {
            int iM419226 = c17921.m41928();
            int iM419227 = c17921.m41928();
            int iM419228 = c17921.m41928();
            int iM419229 = c17921.m41928();
            if (iM41928 == 0) {
                i18 = 1;
            } else {
                if (iM41928 == 3) {
                    i16 = 1;
                } else {
                    i16 = 2;
                }
                if (iM41928 == 1) {
                    i17 = 2;
                } else {
                    i17 = 1;
                }
                i6 *= i17;
                i18 = i16;
            }
            i7 -= (iM419226 + iM419227) * i18;
            i8 -= (iM419228 + iM419229) * i6;
        } else {
            iM419217 = iM419217;
        }
        int i29 = i7;
        int i210 = i8;
        if (iM41926 != 44) {
        }
        iM47898 = -1;
        f = 1.0f;
        if (c17921.m41927()) {
            if (c17921.m41927()) {
                iM41923 = c17921.m41923(8);
                if (iM41923 == 255) {
                    iM41924 = c17921.m41923(16);
                    iM41925 = c17921.m41923(16);
                    if (iM41924 != 0) {
                        f = iM41924 / iM41925;
                    }
                } else if (iM41923 < 17) {
                    f = f50736[iM41923];
                } else {
                    C8083.m21451(iM41923, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (c17921.m41927()) {
                c17921.m41925();
            }
            if (c17921.m41927()) {
                c17921.m41926(3);
                if (c17921.m41927()) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                if (c17921.m41927()) {
                    int iM4192210 = c17921.m41923(8);
                    int iM4192211 = c17921.m41923(8);
                    c17921.m41926(8);
                    iM47898 = C21054.m47898(iM4192210);
                    iM47897 = C21054.m47897(iM4192211);
                }
                if (c17921.m41927()) {
                    c17921.m41928();
                    c17921.m41928();
                }
                i15 = i9;
                if (c17921.m41927()) {
                    c17921.m41926(65);
                }
                zM41928 = c17921.m41927();
                if (zM41928) {
                    m38890(c17921);
                }
                zM41929 = c17921.m41927();
                if (zM41929) {
                    m38890(c17921);
                }
                if (zM41928) {
                    c17921.m41925();
                } else {
                    c17921.m41925();
                }
                c17921.m41925();
                if (c17921.m41927()) {
                    c17921.m41925();
                    c17921.m41928();
                    c17921.m41928();
                    c17921.m41928();
                    c17921.m41928();
                    iM419210 = c17921.m41928();
                    c17921.m41928();
                } else {
                    iM419210 = i15;
                }
                i10 = iM419210;
                i12 = i14;
                i11 = iM47898;
                f2 = f;
                i13 = iM47897;
            } else {
                i14 = -1;
            }
            iM47897 = -1;
            if (c17921.m41927()) {
                c17921.m41928();
                c17921.m41928();
            }
            i15 = i9;
            if (c17921.m41927()) {
                c17921.m41926(65);
            }
            zM41928 = c17921.m41927();
            if (zM41928) {
                m38890(c17921);
            }
            zM41929 = c17921.m41927();
            if (zM41929) {
                m38890(c17921);
            }
            if (zM41928) {
                c17921.m41925();
            } else {
                c17921.m41925();
            }
            c17921.m41925();
            if (c17921.m41927()) {
                c17921.m41925();
                c17921.m41928();
                c17921.m41928();
                c17921.m41928();
                c17921.m41928();
                iM419210 = c17921.m41928();
                c17921.m41928();
            } else {
                iM419210 = i15;
            }
            i10 = iM419210;
            i12 = i14;
            i11 = iM47898;
            f2 = f;
            i13 = iM47897;
        } else {
            i10 = i9;
            f2 = 1.0f;
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new C10866(iM41926, iM41927, iM419211, iM419212, i29, i210, f2, i3, i4, z, zM41927, iM419216, iM419217, i5, z2, i11, i12, i13, i10);
    }

    /* JADX WARN: Code duplicated, block: B:309:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:312:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:468:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7131 m38889(int i, int i2, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        int i3;
        C13480 c13480;
        boolean zM41927;
        int iM41923;
        int i4;
        int iM41924;
        int i5;
        boolean[][] zArr;
        int i6;
        int i7;
        boolean[][] zArr2;
        int i8;
        int[] iArr3;
        boolean z;
        int[] iArr4;
        boolean zM41928;
        int i9;
        int i10;
        int i11;
        boolean zM41929;
        boolean zM419210;
        int iM41928;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        C17921 c17921 = new C17921(bArr, i, i2);
        m38884(c17921);
        c17921.m41926(4);
        boolean zM419211 = c17921.m41927();
        boolean zM419212 = c17921.m41927();
        int iM41925 = c17921.m41923(6);
        int i15 = iM41925 + 1;
        int iM41926 = c17921.m41923(3);
        c17921.m41926(17);
        C2898 c2898M38883 = m38883(c17921, true, iM41926, (C2898) null);
        for (int i16 = c17921.m41927() ? 0 : iM41926; i16 <= iM41926; i16++) {
            c17921.m41928();
            c17921.m41928();
            c17921.m41928();
        }
        int iM41927 = c17921.m41923(6);
        int iM41929 = c17921.m41928() + 1;
        C12775 c12775 = new C12775(AbstractC14545.of((Object) c2898M38883), new int[1]);
        boolean z4 = i15 >= 2 && iM41929 >= 2;
        boolean z5 = zM419211 && zM419212;
        int i17 = iM41927 + 1;
        boolean z6 = i17 >= i15;
        if (!z4 || !z5 || !z6) {
            return new C7131(null, c12775, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iM41929, i17);
        int[] iArr6 = new int[iM41929];
        int[] iArr7 = new int[iM41929];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i18 = 1; i18 < iM41929; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iM41927; i20++) {
                if (c17921.m41927()) {
                    iArr5[i18][i19] = i20;
                    iArr7[i18] = i20;
                    i19++;
                }
                iArr6[i18] = i19;
            }
        }
        if (c17921.m41927()) {
            c17921.m41926(64);
            if (c17921.m41927()) {
                c17921.m41928();
            }
            int iM419210 = c17921.m41928();
            for (int i21 = 0; i21 < iM419210; i21++) {
                c17921.m41928();
                if (i21 == 0 || c17921.m41927()) {
                    boolean zM419213 = c17921.m41927();
                    boolean zM419214 = c17921.m41927();
                    z3 = zM419213;
                    z2 = zM419214;
                    if (zM419213 || zM419214) {
                        zM41928 = c17921.m41927();
                        if (zM41928) {
                            c17921.m41926(19);
                        }
                        c17921.m41926(8);
                        if (zM41928) {
                            c17921.m41926(4);
                        }
                        c17921.m41926(15);
                        i10 = zM419213;
                        i9 = zM419214;
                    }
                    i11 = 0;
                    while (i11 <= iM41926) {
                        zM41929 = c17921.m41927();
                        if (!zM41929) {
                            zM41929 = c17921.m41927();
                        }
                        if (zM41929) {
                            c17921.m41928();
                            zM419210 = false;
                        } else {
                            zM419210 = c17921.m41927();
                        }
                        if (zM419210) {
                            iM41928 = 0;
                        } else {
                            iM41928 = c17921.m41928();
                        }
                        int[] iArr8 = iArr7;
                        i12 = i10 + i9;
                        int[][] iArr9 = iArr5;
                        i13 = 0;
                        while (i13 < i12) {
                            int i22 = i12;
                            for (i14 = 0; i14 <= iM41928; i14++) {
                                c17921.m41928();
                                c17921.m41928();
                                if (zM41928) {
                                    c17921.m41928();
                                    c17921.m41928();
                                }
                                c17921.m41925();
                            }
                            i13++;
                            i12 = i22;
                        }
                        i11++;
                        iM419210 = iM419210;
                        iArr7 = iArr8;
                        iArr5 = iArr9;
                    }
                } else {
                    z3 = false;
                    z2 = false;
                }
                zM41928 = false;
                i10 = z3;
                i9 = z2;
                i11 = 0;
                while (i11 <= iM41926) {
                    zM41929 = c17921.m41927();
                    if (!zM41929) {
                        zM41929 = c17921.m41927();
                    }
                    if (zM41929) {
                        c17921.m41928();
                        zM419210 = false;
                    } else {
                        zM419210 = c17921.m41927();
                    }
                    if (zM419210) {
                        iM41928 = c17921.m41928();
                    } else {
                        iM41928 = 0;
                    }
                    int[] iArr10 = iArr7;
                    i12 = i10 + i9;
                    int[][] iArr11 = iArr5;
                    i13 = 0;
                    while (i13 < i12) {
                        int i23 = i12;
                        while (i14 <= iM41928) {
                            c17921.m41928();
                            c17921.m41928();
                            if (zM41928) {
                                c17921.m41928();
                                c17921.m41928();
                            }
                            c17921.m41925();
                        }
                        i13++;
                        i12 = i23;
                    }
                    i11++;
                    iM419210 = iM419210;
                    iArr7 = iArr10;
                    iArr5 = iArr11;
                }
            }
        }
        int[][] iArr12 = iArr5;
        int[] iArr13 = iArr7;
        if (!c17921.m41927()) {
            return new C7131(null, c12775, null, null);
        }
        c17921.m41920();
        C2898 c2898M38884 = m38883(c17921, false, iM41926, c2898M38883);
        boolean zM419215 = c17921.m41927();
        boolean[] zArr3 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean zM419216 = c17921.m41927();
            zArr3[i25] = zM419216;
            if (zM419216) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr3[1]) {
            return new C7131(null, c12775, null, null);
        }
        int[] iArr14 = new int[i24];
        for (int i26 = 0; i26 < i24 - (zM419215 ? 1 : 0); i26++) {
            iArr14[i26] = c17921.m41923(3);
        }
        int[] iArr15 = new int[i24 + 1];
        if (zM419215) {
            int i27 = 1;
            while (i27 < i24) {
                int[] iArr16 = iArr6;
                for (int i28 = 0; i28 < i27; i28++) {
                    iArr15[i27] = iArr14[i28] + 1 + iArr15[i27];
                }
                i27++;
                iArr6 = iArr16;
            }
            iArr = iArr6;
            iArr15[i24] = 6;
        } else {
            iArr = iArr6;
        }
        int[][] iArr17 = (int[][]) Array.newInstance((Class<?>) cls, i15, i24);
        int[] iArr18 = new int[i15];
        iArr18[0] = 0;
        boolean zM419217 = c17921.m41927();
        int i29 = 1;
        while (i29 < i15) {
            if (zM419217) {
                iArr18[i29] = c17921.m41923(6);
            } else {
                iArr18[i29] = i29;
            }
            if (zM419215) {
                iArr4 = iArr14;
                int i30 = 0;
                while (i30 < i24) {
                    int i31 = i30 + 1;
                    iArr17[i29][i30] = (iArr18[i29] & ((1 << iArr15[i31]) - 1)) >> iArr15[i30];
                    i30 = i31;
                }
            } else {
                int i32 = 0;
                while (i32 < i24) {
                    iArr17[i29][i32] = c17921.m41923(iArr14[i32] + 1);
                    i32++;
                    iArr14 = iArr14;
                }
                iArr4 = iArr14;
            }
            i29++;
            zM419217 = zM419217;
            iArr14 = iArr4;
        }
        int[] iArr19 = new int[i17];
        int i33 = 1;
        for (int i34 = 0; i34 < i15; i34++) {
            iArr19[iArr18[i34]] = -1;
            int i35 = 0;
            for (int i36 = 0; i36 < 16; i36++) {
                if (zArr3[i36]) {
                    if (i36 == 1) {
                        iArr19[iArr18[i34]] = iArr17[i34][i35];
                    }
                    i35++;
                }
            }
            if (i34 > 0) {
                int i37 = 0;
                while (true) {
                    if (i37 >= i34) {
                        z = true;
                        break;
                    }
                    if (iArr19[iArr18[i34]] == iArr19[iArr18[i37]]) {
                        z = false;
                        break;
                    }
                    i37++;
                }
                if (z) {
                    i33++;
                }
            }
        }
        int iM419211 = c17921.m41923(4);
        if (i33 < 2 || iM419211 == 0) {
            return new C7131(null, c12775, null, null);
        }
        int[] iArr20 = new int[i33];
        for (int i38 = 0; i38 < i33; i38++) {
            iArr20[i38] = c17921.m41923(iM419211);
        }
        int[] iArr21 = new int[i17];
        for (int i39 = 0; i39 < i15; i39++) {
            iArr21[Math.min(iArr18[i39], iM41927)] = i39;
        }
        C1846 c1846 = new C1846();
        int i40 = 0;
        while (i40 <= iM41927) {
            int iMin = Math.min(iArr19[i40], i33 - 1);
            c1846.m16264(new C19832(iArr21[i40], iMin >= 0 ? iArr20[iMin] : -1));
            i40++;
            iArr19 = iArr19;
        }
        AbstractC14545 abstractC14545M6131 = c1846.m6131();
        if (((C19832) abstractC14545M6131.get(0)).f64068 == -1) {
            return new C7131(null, c12775, null, null);
        }
        int i41 = 1;
        while (true) {
            if (i41 > iM41927) {
                i41 = -1;
                break;
            }
            if (((C19832) abstractC14545M6131.get(i41)).f64068 != -1) {
                break;
            }
            i41++;
        }
        if (i41 == -1) {
            return new C7131(null, c12775, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        for (int i42 = 1; i42 < i15; i42++) {
            for (int i43 = 0; i43 < i42; i43++) {
                boolean[] zArr6 = zArr4[i42];
                boolean[] zArr7 = zArr5[i42];
                boolean zM419218 = c17921.m41927();
                zArr7[i43] = zM419218;
                zArr6[i43] = zM419218;
            }
        }
        for (int i44 = 1; i44 < i15; i44++) {
            for (int i45 = 0; i45 < iM41925; i45++) {
                for (int i46 = 0; i46 < i44; i46++) {
                    boolean[] zArr8 = zArr5[i44];
                    if (zArr8[i46] && zArr5[i46][i45]) {
                        zArr8[i45] = true;
                        break;
                    }
                }
            }
        }
        int[] iArr22 = new int[i17];
        for (int i47 = 0; i47 < i15; i47++) {
            int i48 = 0;
            for (int i49 = 0; i49 < i47; i49++) {
                i48 += zArr4[i47][i49] ? 1 : 0;
            }
            iArr22[iArr18[i47]] = i48;
        }
        int i50 = 0;
        for (int i51 = 0; i51 < i15; i51++) {
            if (iArr22[iArr18[i51]] == 0) {
                i50++;
            }
        }
        if (i50 > 1) {
            return new C7131(null, c12775, null, null);
        }
        int[] iArr23 = new int[i15];
        int[] iArr24 = new int[iM41929];
        if (c17921.m41927()) {
            int i52 = 0;
            while (true) {
                iArr2 = iArr18;
                if (i52 >= i15) {
                    break;
                }
                iArr23[i52] = c17921.m41923(3);
                i52++;
                iArr18 = iArr2;
            }
            i3 = iM41926;
        } else {
            iArr2 = iArr18;
            i3 = iM41926;
            Arrays.fill(iArr23, 0, i15, i3);
        }
        int i53 = 0;
        while (i53 < iM41929) {
            boolean[][] zArr9 = zArr5;
            int i54 = i41;
            int[] iArr25 = iArr22;
            int iMax = 0;
            for (int i55 = 0; i55 < iArr[i53]; i55++) {
                iMax = Math.max(iMax, iArr23[((C19832) abstractC14545M6131.get(iArr12[i53][i55])).f64067]);
            }
            iArr24[i53] = iMax + 1;
            i53++;
            zArr5 = zArr9;
            i41 = i54;
            iArr22 = iArr25;
        }
        boolean[][] zArr10 = zArr5;
        int i56 = i41;
        int[] iArr26 = iArr22;
        if (c17921.m41927()) {
            int i57 = 0;
            while (i57 < iM41925) {
                int i58 = i57 + 1;
                for (int i59 = i58; i59 < i15; i59++) {
                    if (zArr4[i59][i57]) {
                        c17921.m41926(3);
                    }
                }
                i57 = i58;
            }
        }
        c17921.m41925();
        int iM419212 = c17921.m41928() + 1;
        C1846 c1847 = new C1846();
        c1847.m16264(c2898M38883);
        if (iM419212 > 1) {
            C2898 c2898M38885 = c2898M38884;
            c1847.m16264(c2898M38885);
            for (int i60 = 2; i60 < iM419212; i60++) {
                c2898M38885 = m38883(c17921, c17921.m41927(), i3, c2898M38885);
                c1847.m16264(c2898M38885);
            }
        }
        AbstractC14545 abstractC14545M6132 = c1847.m6131();
        int iM419213 = c17921.m41928() + iM41929;
        if (iM419213 > iM41929) {
            return new C7131(null, c12775, null, null);
        }
        int iM419214 = c17921.m41923(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM419213, i17);
        int[] iArr27 = new int[iM419213];
        int[] iArr28 = new int[iM419213];
        int i61 = 0;
        int i62 = 0;
        while (i61 < iM41929) {
            iArr27[i61] = i62;
            iArr28[i61] = iArr13[i61];
            if (iM419214 == 0) {
                i8 = iM41929;
                zArr2 = zArr4;
                iArr3 = iArr24;
                i7 = i15;
                Arrays.fill(zArr11[i61], 0, iArr[i61], true);
                iArr27[i61] = iArr[i61];
            } else {
                i7 = i15;
                zArr2 = zArr4;
                i8 = iM41929;
                iArr3 = iArr24;
                if (iM419214 == 1) {
                    int i63 = iArr13[i61];
                    for (int i64 = 0; i64 < iArr[i61]; i64++) {
                        zArr11[i61][i64] = iArr12[i61][i64] == i63;
                    }
                    iArr27[i61] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr27[0] = 1;
                }
                i62 = 0;
                i61++;
                iM41929 = i8;
                zArr4 = zArr2;
                iArr24 = iArr3;
                i15 = i7;
            }
            i62 = 0;
            i61++;
            iM41929 = i8;
            zArr4 = zArr2;
            iArr24 = iArr3;
            i15 = i7;
        }
        int i65 = i15;
        boolean[][] zArr12 = zArr4;
        int i66 = iM41929;
        int[] iArr29 = iArr24;
        int i67 = 1;
        int[] iArr30 = new int[i17];
        int i68 = 2;
        int[] iArr31 = new int[2];
        iArr31[1] = i17;
        iArr31[i62] = iM419213;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr31);
        int i69 = 0;
        while (i67 < iM419213) {
            if (iM419214 == i68) {
                for (int i70 = 0; i70 < iArr[i67]; i70++) {
                    zArr11[i67][i70] = c17921.m41927();
                    int i71 = iArr27[i67];
                    boolean z7 = zArr11[i67][i70];
                    iArr27[i67] = i71 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr28[i67] = iArr12[i67][i70];
                    }
                }
            }
            if (i69 == 0 && iArr12[i67][0] == 0 && zArr11[i67][0]) {
                int i72 = 1;
                while (i72 < iArr[i67]) {
                    int i73 = i56;
                    if (iArr12[i67][i72] == i73 && zArr11[i67][i73]) {
                        i69 = i67;
                    }
                    i72++;
                    i56 = i73;
                }
            }
            int i74 = i56;
            int i75 = 0;
            while (i75 < iArr[i67]) {
                if (iM419212 > 1) {
                    zArr13[i67][i75] = zArr11[i67][i75];
                    zArr = zArr11;
                    int i76 = iM419214;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM43937 = C19072.m43937(iM419212);
                    if (zArr13[i67][i75]) {
                        i5 = iM419212;
                    } else {
                        int i77 = ((C19832) abstractC14545M6131.get(iArr12[i67][i75])).f64067;
                        i5 = iM419212;
                        int i78 = 0;
                        while (true) {
                            if (i78 < i75) {
                                i6 = i76;
                                if (zArr10[i77][((C19832) abstractC14545M6131.get(iArr12[i67][i78])).f64067]) {
                                    zArr13[i67][i75] = true;
                                    break;
                                }
                                i78++;
                                i76 = i6;
                            }
                        }
                        if (!zArr13[i67][i75]) {
                            if (i69 <= 0 && i67 == i69) {
                                iArr30[i75] = c17921.m41923(iM43937);
                            } else {
                                c17921.m41926(iM43937);
                            }
                        }
                    }
                    i6 = i76;
                    if (!zArr13[i67][i75]) {
                        if (i69 <= 0) {
                            c17921.m41926(iM43937);
                        } else {
                            c17921.m41926(iM43937);
                        }
                    }
                } else {
                    i5 = iM419212;
                    zArr = zArr11;
                    i6 = iM419214;
                }
                i75++;
                zArr11 = zArr;
                iM419212 = i5;
                iM419214 = i6;
            }
            int i79 = iM419212;
            boolean[][] zArr14 = zArr11;
            int i80 = iM419214;
            if (iArr27[i67] == 1 && iArr26[iArr28[i67]] > 0) {
                c17921.m41925();
            }
            i67++;
            i68 = 2;
            zArr11 = zArr14;
            iM419212 = i79;
            iM419214 = i80;
            i56 = i74;
        }
        if (i69 == 0) {
            return new C7131(null, c12775, null, null);
        }
        int iM419215 = c17921.m41928();
        int i81 = iM419215 + 1;
        C1846 c1846M34729 = AbstractC14545.m34729(i81);
        int[] iArr32 = new int[i65];
        int i82 = 0;
        while (i82 < i81) {
            int iM419216 = c17921.m41923(16);
            int iM419217 = c17921.m41923(16);
            if (c17921.m41927()) {
                iM41923 = c17921.m41923(2);
                if (iM41923 == 3) {
                    c17921.m41925();
                }
                int iM419218 = c17921.m41923(4);
                iM41924 = c17921.m41923(4);
                i4 = iM419218;
            } else {
                iM41923 = 0;
                i4 = 0;
                iM41924 = 0;
            }
            if (c17921.m41927()) {
                int iM419219 = c17921.m41928();
                int iM419220 = c17921.m41928();
                int iM419221 = c17921.m41928();
                int iM419222 = c17921.m41928();
                iM419216 -= (iM419219 + iM419220) * ((iM41923 == 1 || iM41923 == 2) ? 2 : 1);
                iM419217 -= (iM419221 + iM419222) * (iM41923 == 1 ? 2 : 1);
            }
            c1846M34729.m16264(new C12070(iM41923, i4, iM41924, iM419216, iM419217));
            i82++;
            abstractC14545M6131 = abstractC14545M6131;
        }
        AbstractC14545 abstractC14545 = abstractC14545M6131;
        if (i81 <= 1 || !c17921.m41927()) {
            for (int i83 = 1; i83 < i65; i83++) {
                iArr32[i83] = Math.min(i83, iM419215);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM43938 = C19072.m43937(i81);
            for (int i84 = 1; i84 < i65; i84++) {
                iArr32[i84] = c17921.m41923(iM43938);
            }
        }
        C9954 c9954 = new C9954(c1846M34729.m6131(), iArr32);
        c17921.m41926(2);
        for (int i85 = 1; i85 < i65; i85++) {
            if (iArr26[iArr2[i85]] == 0) {
                c17921.m41925();
            }
        }
        for (int i86 = 1; i86 < iM419213; i86++) {
            boolean zM419219 = c17921.m41927();
            int i87 = 0;
            while (i87 < iArr29[i86]) {
                if (i87 <= 0 || !zM419219) {
                    zM41927 = i87 == 0;
                } else {
                    zM41927 = c17921.m41927();
                }
                if (zM41927) {
                    for (int i88 = 0; i88 < iArr[i86]; i88++) {
                        if (zArr13[i86][i88]) {
                            c17921.m41928();
                        }
                    }
                    c17921.m41928();
                    c17921.m41928();
                }
                i87++;
            }
        }
        int iM419223 = c17921.m41928() + 2;
        if (c17921.m41927()) {
            c17921.m41926(iM419223);
        } else {
            for (int i89 = 1; i89 < i65; i89++) {
                for (int i90 = 0; i90 < i89; i90++) {
                    if (zArr12[i89][i90]) {
                        c17921.m41926(iM419223);
                    }
                }
            }
        }
        int iM419224 = c17921.m41928();
        for (int i91 = 1; i91 <= iM419224; i91++) {
            c17921.m41926(8);
        }
        if (c17921.m41927()) {
            c17921.m41920();
            if (!c17921.m41927() ? c17921.m41927() : true) {
                c17921.m41925();
            }
            boolean zM419220 = c17921.m41927();
            boolean zM419221 = c17921.m41927();
            if (zM419220 || zM419221) {
                for (int i92 = 0; i92 < i66; i92++) {
                    for (int i93 = 0; i93 < iArr29[i92]; i93++) {
                        boolean zM419222 = zM419220 ? c17921.m41927() : false;
                        boolean zM419223 = zM419221 ? c17921.m41927() : false;
                        if (zM419222) {
                            c17921.m41926(32);
                        }
                        if (zM419223) {
                            c17921.m41926(18);
                        }
                    }
                }
            }
            boolean zM419224 = c17921.m41927();
            int iM419225 = zM419224 ? c17921.m41923(4) + 1 : i65;
            C1846 c1846M347210 = AbstractC14545.m34729(iM419225);
            int[] iArr33 = new int[i65];
            for (int i94 = 0; i94 < iM419225; i94++) {
                c17921.m41926(3);
                int i95 = c17921.m41927() ? 1 : 2;
                int iM47898 = C21054.m47898(c17921.m41923(8));
                int iM47897 = C21054.m47897(c17921.m41923(8));
                c17921.m41926(8);
                c1846M347210.m16264(new C22653(iM47898, i95, iM47897));
            }
            if (zM419224 && iM419225 > 1) {
                for (int i96 = 0; i96 < i65; i96++) {
                    iArr33[i96] = c17921.m41923(4);
                }
            }
            c13480 = new C13480(c1846M347210.m6131(), iArr33);
        } else {
            c13480 = null;
        }
        return new C7131(abstractC14545, new C12775(abstractC14545M6132, iArr30), c9954, c13480);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4309 m38884(C17921 c17921) {
        c17921.m41925();
        return new C4309(c17921.m41923(6), c17921.m41923(6), c17921.m41923(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:204:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11365 m38886(byte[] bArr, int i, int i2, C7131 c7131) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM41928;
        int i9;
        int iM41929;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM47897;
        int iM47898;
        int i14;
        C13480 c13480;
        int i15;
        C9954 c9954;
        C4309 c4309M38884 = m38884(new C17921(bArr, i, i2));
        C17921 c17921 = new C17921(bArr, i + 2, i2);
        c17921.m41926(4);
        int iM41923 = c17921.m41923(3);
        int i16 = c4309M38884.f13891;
        boolean z = i16 != 0 && iM41923 == 7;
        if (c7131 != null) {
            AbstractC14545 abstractC14545 = c7131.f21883;
            if (abstractC14545.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((C19832) abstractC14545.get(Math.min(i16, abstractC14545.size() - 1))).f64067;
            }
        } else {
            i3 = 0;
        }
        C2898 c2898M38883 = null;
        if (!z) {
            c17921.m41925();
            c2898M38883 = m38883(c17921, true, iM41923, (C2898) null);
        } else if (c7131 != null) {
            C12775 c12775 = c7131.f21884;
            int[] iArr = c12775.f38383;
            AbstractC14545 abstractC14546 = c12775.f38384;
            int i17 = iArr[i3];
            if (abstractC14546.size() > i17) {
                c2898M38883 = (C2898) abstractC14546.get(i17);
            }
        }
        c17921.m41928();
        if (z) {
            int iM41924 = c17921.m41927() ? c17921.m41923(8) : -1;
            if (c7131 == null || (c9954 = c7131.f21885) == null) {
                i8 = 0;
                iM41928 = 0;
                iM41929 = 0;
                i7 = 0;
                i9 = 0;
                i6 = 0;
            } else {
                AbstractC14545 abstractC14547 = c9954.f30059;
                if (iM41924 == -1) {
                    iM41924 = c9954.f30058[i3];
                }
                if (iM41924 == -1 || abstractC14547.size() <= iM41924) {
                    i8 = 0;
                    iM41928 = 0;
                    iM41929 = 0;
                    i7 = 0;
                    i9 = 0;
                    i6 = 0;
                } else {
                    C12070 c12070 = (C12070) abstractC14547.get(iM41924);
                    int i18 = c12070.f36097;
                    int i19 = c12070.f36098;
                    int i20 = c12070.f36099;
                    int i21 = c12070.f36096;
                    i9 = i19;
                    i8 = i20;
                    i6 = i8;
                    iM41929 = c12070.f36095;
                    iM41928 = i21;
                    i7 = i9;
                }
            }
        } else {
            int iM419210 = c17921.m41928();
            if (iM419210 == 3) {
                c17921.m41925();
            }
            int iM419211 = c17921.m41928();
            int iM419212 = c17921.m41928();
            if (c17921.m41927()) {
                int iM419213 = c17921.m41928();
                int iM419214 = c17921.m41928();
                int iM419215 = c17921.m41928();
                int iM419216 = c17921.m41928();
                i4 = iM419211 - ((iM419213 + iM419214) * ((iM419210 == 1 || iM419210 == 2) ? 2 : 1));
                i5 = iM419212 - ((iM419215 + iM419216) * (iM419210 == 1 ? 2 : 1));
            } else {
                i4 = iM419211;
                i5 = iM419212;
            }
            i6 = iM419212;
            i7 = i4;
            i8 = i5;
            iM41928 = c17921.m41928();
            i9 = iM419211;
            iM41929 = c17921.m41928();
        }
        int iM419217 = c17921.m41928();
        if (z) {
            i10 = -1;
        } else {
            int iMax = -1;
            for (int i22 = c17921.m41927() ? 0 : iM41923; i22 <= iM41923; i22++) {
                c17921.m41928();
                iMax = Math.max(c17921.m41928(), iMax);
                c17921.m41928();
            }
            i10 = iMax;
        }
        c17921.m41928();
        c17921.m41928();
        c17921.m41928();
        c17921.m41928();
        c17921.m41928();
        c17921.m41928();
        if (c17921.m41927()) {
            if (z ? c17921.m41927() : false) {
                c17921.m41926(6);
            } else if (c17921.m41927()) {
                int i23 = 0;
                int i24 = 4;
                int i25 = 6;
                while (i23 < i24) {
                    int i26 = 0;
                    while (i26 < i25) {
                        if (c17921.m41927()) {
                            int iMin = Math.min(64, 1 << ((i23 << 1) + 4));
                            if (i23 > 1) {
                                c17921.m41929();
                            }
                            for (int i27 = 0; i27 < iMin; i27++) {
                                c17921.m41929();
                            }
                            i15 = 3;
                        } else {
                            c17921.m41928();
                            i15 = 3;
                        }
                        i26 += i23 == i15 ? 3 : 1;
                        i25 = 6;
                        i6 = i6;
                    }
                    i23++;
                    i24 = 4;
                    i25 = 6;
                    i6 = i6;
                }
            }
        }
        int i28 = i6;
        c17921.m41926(2);
        if (c17921.m41927()) {
            c17921.m41926(8);
            c17921.m41928();
            c17921.m41928();
            c17921.m41925();
        }
        int iM419218 = c17921.m41928();
        int i29 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i30 = -1;
        int i31 = i9;
        int i32 = -1;
        while (i29 < iM419218) {
            if (i29 == 0 || !c17921.m41927()) {
                int iM419219 = c17921.m41928();
                int iM419220 = c17921.m41928();
                int[] iArr3 = new int[iM419219];
                int i33 = 0;
                while (i33 < iM419219) {
                    iArr3[i33] = (i33 > 0 ? iArr3[i33 - 1] : 0) - (c17921.m41928() + 1);
                    c17921.m41925();
                    i33++;
                }
                int[] iArr4 = new int[iM419220];
                int i34 = 0;
                while (i34 < iM419220) {
                    iArr4[i34] = c17921.m41928() + 1 + (i34 > 0 ? iArr4[i34 - 1] : 0);
                    c17921.m41925();
                    i34++;
                }
                i30 = iM419219;
                i32 = iM419220;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i35 = i30 + i32;
                int iM48904 = C21639.m48904(c17921.m41927() ? 1 : 0, 2, 1, c17921.m41928() + 1);
                int i36 = i35 + 1;
                boolean[] zArr = new boolean[i36];
                for (int i37 = 0; i37 <= i35; i37++) {
                    if (c17921.m41927()) {
                        zArr[i37] = true;
                    } else {
                        zArr[i37] = c17921.m41927();
                    }
                }
                int[] iArr5 = new int[i36];
                int[] iArr6 = new int[i36];
                int i38 = 0;
                for (int i39 = i32 - 1; i39 >= 0; i39--) {
                    int i40 = iArrCopyOf[i39] + iM48904;
                    if (i40 < 0 && zArr[i30 + i39]) {
                        iArr5[i38] = i40;
                        i38++;
                    }
                }
                if (iM48904 < 0 && zArr[i35]) {
                    iArr5[i38] = iM48904;
                    i38++;
                }
                int i41 = i38;
                for (int i42 = 0; i42 < i30; i42++) {
                    int i43 = iArr2[i42] + iM48904;
                    if (i43 < 0 && zArr[i42]) {
                        iArr5[i41] = i43;
                        i41++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i41);
                int i44 = 0;
                for (int i45 = i30 - 1; i45 >= 0; i45--) {
                    int i46 = iArr2[i45] + iM48904;
                    if (i46 > 0 && zArr[i45]) {
                        iArr6[i44] = i46;
                        i44++;
                    }
                }
                if (iM48904 > 0 && zArr[i35]) {
                    iArr6[i44] = iM48904;
                    i44++;
                }
                int i47 = i44;
                for (int i48 = 0; i48 < i32; i48++) {
                    int i49 = iArrCopyOf[i48] + iM48904;
                    if (i49 > 0 && zArr[i30 + i48]) {
                        iArr6[i47] = i49;
                        i47++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i47);
                i32 = i47;
                iArr2 = iArrCopyOf2;
                i30 = i41;
            }
            i29++;
            iM419218 = iM419218;
            i7 = i7;
            iM41928 = iM41928;
            iM41929 = iM41929;
            c2898M38883 = c2898M38883;
            i8 = i8;
            iM41923 = iM41923;
        }
        int i50 = iM41923;
        C2898 c2898 = c2898M38883;
        int i51 = iM41928;
        int i52 = iM41929;
        int i53 = i7;
        int i54 = i8;
        if (c17921.m41927()) {
            int iM419221 = c17921.m41928();
            for (int i55 = 0; i55 < iM419221; i55++) {
                c17921.m41926(iM419217 + 5);
            }
        }
        c17921.m41926(2);
        float f = 1.0f;
        if (c17921.m41927()) {
            if (c17921.m41927()) {
                int iM41925 = c17921.m41923(8);
                if (iM41925 == 255) {
                    int iM41926 = c17921.m41923(16);
                    int iM41927 = c17921.m41923(16);
                    if (iM41926 != 0 && iM41927 != 0) {
                        f = iM41926 / iM41927;
                    }
                } else if (iM41925 < 17) {
                    f = f50736[iM41925];
                } else {
                    C8083.m21451(iM41925, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (c17921.m41927()) {
                c17921.m41925();
            }
            if (c17921.m41927()) {
                c17921.m41926(3);
                i14 = c17921.m41927() ? 1 : 2;
                if (c17921.m41927()) {
                    int iM419222 = c17921.m41923(8);
                    int iM419223 = c17921.m41923(8);
                    c17921.m41926(8);
                    iM47898 = C21054.m47898(iM419222);
                    iM47897 = C21054.m47897(iM419223);
                } else {
                    iM47898 = -1;
                    iM47897 = -1;
                }
            } else if (c7131 == null || (c13480 = c7131.f21886) == null) {
                iM47898 = -1;
                iM47897 = -1;
                i14 = -1;
            } else {
                AbstractC14545 abstractC14548 = c13480.f40263;
                int i56 = c13480.f40262[i3];
                if (abstractC14548.size() > i56) {
                    C22653 c22653 = (C22653) abstractC14548.get(i56);
                    iM47898 = c22653.f73164;
                    int i57 = c22653.f73163;
                    iM47897 = c22653.f73165;
                    i14 = i57;
                } else {
                    iM47898 = -1;
                    iM47897 = -1;
                    i14 = -1;
                }
            }
            if (c17921.m41927()) {
                c17921.m41928();
                c17921.m41928();
            }
            c17921.m41925();
            i12 = c17921.m41927() ? i54 * 2 : i54;
            int i58 = iM47898;
            i13 = i14;
            i11 = i58;
        } else {
            i11 = -1;
            i12 = i54;
            f = 1.0f;
            i13 = -1;
            iM47897 = -1;
        }
        return new C11365(i50, c2898, i51, i52, i53, i12, i31, i28, f, i10, i11, i13, iM47897);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5720 m38885(int i, int i2, byte[] bArr) {
        byte b;
        int iMax;
        int iMax2;
        int i3 = i + 2;
        do {
            i2--;
            b = bArr[i2];
            if (b != 0) {
                break;
            }
        } while (i2 > i3);
        if (b == 0 || i2 <= i3) {
            return null;
        }
        C17921 c17921 = new C17921(bArr, i3, i2 + 1);
        while (c17921.m41922(16)) {
            int iM41923 = c17921.m41923(8);
            int i4 = 0;
            while (iM41923 == 255) {
                i4 += 255;
                iM41923 = c17921.m41923(8);
            }
            int i5 = i4 + iM41923;
            int iM41924 = c17921.m41923(8);
            int i6 = 0;
            while (iM41924 == 255) {
                i6 += 255;
                iM41924 = c17921.m41923(8);
            }
            int i7 = i6 + iM41924;
            if (i7 == 0 || !c17921.m41922(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iM41928 = c17921.m41928();
                boolean zM41927 = c17921.m41927();
                int iM41929 = zM41927 ? c17921.m41928() : 0;
                int iM419210 = c17921.m41928();
                int iM419211 = -1;
                for (int i8 = 0; i8 <= iM419210; i8++) {
                    iM419211 = c17921.m41928();
                    c17921.m41928();
                    int iM41925 = c17921.m41923(6);
                    if (iM41925 == 63) {
                        return null;
                    }
                    if (iM41925 == 0) {
                        iMax = Math.max(0, iM41928 - 30);
                    } else {
                        iMax = Math.max(0, (iM41925 + iM41928) - 31);
                    }
                    c17921.m41923(iMax);
                    if (zM41927) {
                        int iM41926 = c17921.m41923(6);
                        if (iM41926 == 63) {
                            return null;
                        }
                        if (iM41926 == 0) {
                            iMax2 = Math.max(0, iM41929 - 30);
                        } else {
                            iMax2 = Math.max(0, (iM41926 + iM41929) - 31);
                        }
                        c17921.m41923(iMax2);
                    }
                    if (c17921.m41927()) {
                        c17921.m41926(10);
                    }
                }
                return new C5720(iM419211);
            }
            c17921.m41926(i7 * 8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38879(int i, int i2, byte[] bArr, boolean[] zArr) {
        int i3 = i2 - i;
        C22632.m50634(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m38887(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m38887(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m38887(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & UTF8.S_ERR) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m38887(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38887(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38882(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int iM38879 = m38879(i3, bArr.length, bArr, zArr);
                    if (iM38879 != bArr.length) {
                        c1846.m16264(Integer.valueOf(iM38879));
                    }
                    i3 = iM38879 + 3;
                }
                AbstractC14545 abstractC14545M6131 = c1846.m6131();
                for (int i4 = 0; i4 < abstractC14545M6131.size(); i4++) {
                    if (((Integer) abstractC14545M6131.get(i4)).intValue() + 3 < length) {
                        C17921 c17921 = new C17921(bArr, ((Integer) abstractC14545M6131.get(i4)).intValue() + 3, length);
                        C4309 c4309M38884 = m38884(c17921);
                        if (c4309M38884.f13892 == 33 && c4309M38884.f13891 == 0) {
                            c17921.m41926(4);
                            int iM41923 = c17921.m41923(3);
                            c17921.m41925();
                            C2898 c2898M38883 = m38883(c17921, true, iM41923, (C2898) null);
                            return C17839.m41769(c2898M38883.f9240, c2898M38883.f9241, c2898M38883.f9239, c2898M38883.f9236, c2898M38883.f9238, c2898M38883.f9237);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2898 m38883(C17921 c17921, boolean z, int i, C2898 c2898) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean zM41927;
        int iM41923;
        int i5;
        int iM41924;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            iM41924 = c17921.m41923(2);
            zM41927 = c17921.m41927();
            iM41923 = c17921.m41923(5);
            i5 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (c17921.m41927()) {
                    i5 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = c17921.m41923(8);
            }
        } else {
            if (c2898 != null) {
                int i9 = c2898.f9240;
                zM41927 = c2898.f9238;
                iM41923 = c2898.f9241;
                i5 = c2898.f9239;
                iArr2 = c2898.f9236;
                iM41924 = i9;
            } else {
                iArr = iArr2;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                z2 = false;
            }
            int iM41925 = c17921.m41923(8);
            i6 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                if (c17921.m41927()) {
                    i6 += 88;
                }
                if (c17921.m41927()) {
                    i6 += 8;
                }
            }
            c17921.m41926(i6);
            if (i > 0) {
                c17921.m41926((8 - i) * 2);
            }
            return new C2898(i2, i3, i4, iArr, z2, iM41925);
        }
        i2 = iM41924;
        iArr = iArr2;
        z2 = zM41927;
        i3 = iM41923;
        i4 = i5;
        int iM41926 = c17921.m41923(8);
        i6 = 0;
        while (i10 < i) {
            if (c17921.m41927()) {
                i6 += 88;
            }
            if (c17921.m41927()) {
                i6 += 8;
            }
        }
        c17921.m41926(i6);
        if (i > 0) {
            c17921.m41926((8 - i) * 2);
        }
        return new C2898(i2, i3, i4, iArr, z2, iM41926);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38890(C17921 c17921) {
        int iM41928 = c17921.m41928() + 1;
        c17921.m41926(8);
        for (int i = 0; i < iM41928; i++) {
            c17921.m41928();
            c17921.m41928();
            c17921.m41925();
        }
        c17921.m41926(20);
    }
}
