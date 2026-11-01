package p067l;

import com.umeng.analytics.pro.C0684bo;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܽ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S8SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18058 {

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f53916 = {0, 0, 0, 1};

    /* JADX INFO: renamed from: ֫ */
    public static final float[] f53915 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: ᩳ */
    public static final Object f53918 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public static int[] f53917 = new int[10];

    /* JADX INFO: renamed from: ֫ */
    public static int m41106(int i, byte[] bArr) {
        int i2;
        synchronized (f53918) {
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
                    int[] iArr = f53917;
                    if (iArr.length <= i4) {
                        f53917 = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f53917[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f53917[i7] - i6;
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

    /* JADX INFO: renamed from: ֫ */
    public static int m41107(C10307 c10307) {
        if (C12826.equals(c10307.f28528, "video/avc")) {
            return 1;
        }
        return (C12826.equals(c10307.f28528, "video/hevc") || C11669.m26818(c10307.f28533, "video/hevc") != null) ? 2 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m41114(byte[] bArr, int i, C10307 c10307) {
        int i2;
        if (C12826.equals(c10307.f28528, "video/avc")) {
            byte b = bArr[4];
            if (((b & UTF8.S_P4B) >> 5) == 0 && ((i2 = b & C0684bo.f2505j) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (C12826.equals(c10307.f28528, "video/hevc")) {
            C6463 c6463M41110 = m41110(new C19400(bArr, 4, i + 4));
            int i3 = c6463M41110.f16707;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && c6463M41110.f16708 == c10307.f28530 - 1) {
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
    /* JADX INFO: renamed from: ܽ */
    public static C12695 m41117(int i, int i2, byte[] bArr) {
        int iM44177;
        boolean z;
        int i3;
        int i4;
        int iM44178;
        boolean z2;
        int i5;
        boolean zM44176;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM50228;
        float f;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM50227;
        int i15;
        boolean zM44177;
        boolean zM44178;
        int iM44179;
        int iM44172;
        int iM44173;
        int iM44174;
        int i16;
        int i17;
        int i18;
        C19400 c19400 = new C19400(bArr, i + 1, i2);
        int iM44175 = c19400.m44172(8);
        int iM44176 = c19400.m44172(8);
        int iM441710 = c19400.m44172(8);
        int iM441711 = c19400.m44177();
        if (iM44175 == 100 || iM44175 == 110 || iM44175 == 122 || iM44175 == 244 || iM44175 == 44 || iM44175 == 83 || iM44175 == 86 || iM44175 == 118 || iM44175 == 128 || iM44175 == 138) {
            iM44177 = c19400.m44177();
            boolean zM44179 = iM44177 == 3 ? c19400.m44176() : false;
            int iM441712 = c19400.m44177();
            int iM441713 = c19400.m44177();
            c19400.m44174();
            if (c19400.m44176()) {
                int i19 = iM44177 != 3 ? 8 : 12;
                int i20 = 0;
                while (i20 < i19) {
                    if (c19400.m44176()) {
                        int i21 = i20 < 6 ? 16 : 64;
                        int iM441714 = 8;
                        int i22 = 8;
                        for (int i23 = 0; i23 < i21; i23++) {
                            if (iM441714 != 0) {
                                iM441714 = ((c19400.m44178() + i22) + 256) % 256;
                            }
                            if (iM441714 != 0) {
                                i22 = iM441714;
                            }
                        }
                    }
                    i20++;
                }
            }
            z = zM44179;
            i3 = iM441712;
            i4 = iM441713;
        } else {
            i3 = 0;
            iM44177 = 1;
            i4 = 0;
            z = false;
        }
        int iM441715 = c19400.m44177() + 4;
        int iM441716 = c19400.m44177();
        if (iM441716 != 0) {
            if (iM441716 == 1) {
                boolean zM441710 = c19400.m44176();
                c19400.m44178();
                c19400.m44178();
                long jM44177 = c19400.m44177();
                i3 = i3;
                for (int i24 = 0; i24 < jM44177; i24++) {
                    c19400.m44177();
                }
                z2 = zM441710;
                i5 = 0;
            } else {
                iM44178 = 0;
            }
            c19400.m44177();
            c19400.m44174();
            int iM441717 = c19400.m44177() + 1;
            int iM441718 = c19400.m44177() + 1;
            zM44176 = c19400.m44176();
            i6 = 2 - (zM44176 ? 1 : 0);
            int i25 = iM441718 * i6;
            if (!zM44176) {
                c19400.m44174();
            }
            c19400.m44174();
            i7 = iM441717 * 16;
            i8 = i25 * 16;
            if (c19400.m44176()) {
                int iM441719 = c19400.m44177();
                int iM441720 = c19400.m44177();
                int iM441721 = c19400.m44177();
                int iM441722 = c19400.m44177();
                if (iM44177 == 0) {
                    i18 = 1;
                } else {
                    if (iM44177 == 3) {
                        i16 = 1;
                    } else {
                        i16 = 2;
                    }
                    if (iM44177 == 1) {
                        i17 = 2;
                    } else {
                        i17 = 1;
                    }
                    i6 *= i17;
                    i18 = i16;
                }
                i7 -= (iM441719 + iM441720) * i18;
                i8 -= (iM441721 + iM441722) * i6;
            } else {
                iM441716 = iM441716;
            }
            int i26 = i7;
            int i27 = i8;
            i9 = ((iM44175 != 44 || iM44175 == 86 || iM44175 == 100 || iM44175 == 110 || iM44175 == 122 || iM44175 == 244) && (iM44176 & 16) != 0) ? 0 : 16;
            iM50228 = -1;
            f = 1.0f;
            if (c19400.m44176()) {
                if (c19400.m44176()) {
                    iM44172 = c19400.m44172(8);
                    if (iM44172 == 255) {
                        iM44173 = c19400.m44172(16);
                        iM44174 = c19400.m44172(16);
                        if (iM44173 != 0 && iM44174 != 0) {
                            f = iM44173 / iM44174;
                        }
                    } else if (iM44172 < 17) {
                        f = f53915[iM44172];
                    } else {
                        C10050.m23419(iM44172, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (c19400.m44176()) {
                    c19400.m44174();
                }
                if (c19400.m44176()) {
                    c19400.m44175(3);
                    if (c19400.m44176()) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    if (c19400.m44176()) {
                        int iM441723 = c19400.m44172(8);
                        int iM441724 = c19400.m44172(8);
                        c19400.m44175(8);
                        iM50228 = C22378.m50228(iM441723);
                        iM50227 = C22378.m50227(iM441724);
                    }
                    if (c19400.m44176()) {
                        c19400.m44177();
                        c19400.m44177();
                    }
                    i15 = i9;
                    if (c19400.m44176()) {
                        c19400.m44175(65);
                    }
                    zM44177 = c19400.m44176();
                    if (zM44177) {
                        m41116(c19400);
                    }
                    zM44178 = c19400.m44176();
                    if (zM44178) {
                        m41116(c19400);
                    }
                    if (zM44177 || zM44178) {
                        c19400.m44174();
                    }
                    c19400.m44174();
                    if (c19400.m44176()) {
                        c19400.m44174();
                        c19400.m44177();
                        c19400.m44177();
                        c19400.m44177();
                        c19400.m44177();
                        iM44179 = c19400.m44177();
                        c19400.m44177();
                    } else {
                        iM44179 = i15;
                    }
                    i10 = iM44179;
                    i12 = i14;
                    i11 = iM50228;
                    f2 = f;
                    i13 = iM50227;
                } else {
                    i14 = -1;
                }
                iM50227 = -1;
                if (c19400.m44176()) {
                    c19400.m44177();
                    c19400.m44177();
                }
                i15 = i9;
                if (c19400.m44176()) {
                    c19400.m44175(65);
                }
                zM44177 = c19400.m44176();
                if (zM44177) {
                    m41116(c19400);
                }
                zM44178 = c19400.m44176();
                if (zM44178) {
                    m41116(c19400);
                }
                if (zM44177) {
                    c19400.m44174();
                } else {
                    c19400.m44174();
                }
                c19400.m44174();
                if (c19400.m44176()) {
                    c19400.m44174();
                    c19400.m44177();
                    c19400.m44177();
                    c19400.m44177();
                    c19400.m44177();
                    iM44179 = c19400.m44177();
                    c19400.m44177();
                } else {
                    iM44179 = i15;
                }
                i10 = iM44179;
                i12 = i14;
                i11 = iM50228;
                f2 = f;
                i13 = iM50227;
            } else {
                i10 = i9;
                f2 = 1.0f;
                i11 = -1;
                i12 = -1;
                i13 = -1;
            }
            return new C12695(iM44175, iM44176, iM441710, iM441711, i26, i27, f2, i3, i4, z, zM44176, iM441715, iM441716, i5, z2, i11, i12, i13, i10);
        }
        iM44178 = c19400.m44177() + 4;
        i5 = iM44178;
        z2 = false;
        c19400.m44177();
        c19400.m44174();
        int iM4417110 = c19400.m44177() + 1;
        int iM4417111 = c19400.m44177() + 1;
        zM44176 = c19400.m44176();
        i6 = 2 - (zM44176 ? 1 : 0);
        int i28 = iM4417111 * i6;
        if (!zM44176) {
            c19400.m44174();
        }
        c19400.m44174();
        i7 = iM4417110 * 16;
        i8 = i28 * 16;
        if (c19400.m44176()) {
            int iM4417112 = c19400.m44177();
            int iM441725 = c19400.m44177();
            int iM441726 = c19400.m44177();
            int iM441727 = c19400.m44177();
            if (iM44177 == 0) {
                i18 = 1;
            } else {
                if (iM44177 == 3) {
                    i16 = 1;
                } else {
                    i16 = 2;
                }
                if (iM44177 == 1) {
                    i17 = 2;
                } else {
                    i17 = 1;
                }
                i6 *= i17;
                i18 = i16;
            }
            i7 -= (iM4417112 + iM441725) * i18;
            i8 -= (iM441726 + iM441727) * i6;
        } else {
            iM441716 = iM441716;
        }
        int i29 = i7;
        int i210 = i8;
        if (iM44175 != 44) {
        }
        iM50228 = -1;
        f = 1.0f;
        if (c19400.m44176()) {
            if (c19400.m44176()) {
                iM44172 = c19400.m44172(8);
                if (iM44172 == 255) {
                    iM44173 = c19400.m44172(16);
                    iM44174 = c19400.m44172(16);
                    if (iM44173 != 0) {
                        f = iM44173 / iM44174;
                    }
                } else if (iM44172 < 17) {
                    f = f53915[iM44172];
                } else {
                    C10050.m23419(iM44172, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (c19400.m44176()) {
                c19400.m44174();
            }
            if (c19400.m44176()) {
                c19400.m44175(3);
                if (c19400.m44176()) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                if (c19400.m44176()) {
                    int iM441728 = c19400.m44172(8);
                    int iM441729 = c19400.m44172(8);
                    c19400.m44175(8);
                    iM50228 = C22378.m50228(iM441728);
                    iM50227 = C22378.m50227(iM441729);
                }
                if (c19400.m44176()) {
                    c19400.m44177();
                    c19400.m44177();
                }
                i15 = i9;
                if (c19400.m44176()) {
                    c19400.m44175(65);
                }
                zM44177 = c19400.m44176();
                if (zM44177) {
                    m41116(c19400);
                }
                zM44178 = c19400.m44176();
                if (zM44178) {
                    m41116(c19400);
                }
                if (zM44177) {
                    c19400.m44174();
                } else {
                    c19400.m44174();
                }
                c19400.m44174();
                if (c19400.m44176()) {
                    c19400.m44174();
                    c19400.m44177();
                    c19400.m44177();
                    c19400.m44177();
                    c19400.m44177();
                    iM44179 = c19400.m44177();
                    c19400.m44177();
                } else {
                    iM44179 = i15;
                }
                i10 = iM44179;
                i12 = i14;
                i11 = iM50228;
                f2 = f;
                i13 = iM50227;
            } else {
                i14 = -1;
            }
            iM50227 = -1;
            if (c19400.m44176()) {
                c19400.m44177();
                c19400.m44177();
            }
            i15 = i9;
            if (c19400.m44176()) {
                c19400.m44175(65);
            }
            zM44177 = c19400.m44176();
            if (zM44177) {
                m41116(c19400);
            }
            zM44178 = c19400.m44176();
            if (zM44178) {
                m41116(c19400);
            }
            if (zM44177) {
                c19400.m44174();
            } else {
                c19400.m44174();
            }
            c19400.m44174();
            if (c19400.m44176()) {
                c19400.m44174();
                c19400.m44177();
                c19400.m44177();
                c19400.m44177();
                c19400.m44177();
                iM44179 = c19400.m44177();
                c19400.m44177();
            } else {
                iM44179 = i15;
            }
            i10 = iM44179;
            i12 = i14;
            i11 = iM50228;
            f2 = f;
            i13 = iM50227;
        } else {
            i10 = i9;
            f2 = 1.0f;
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new C12695(iM44175, iM44176, iM441710, iM441711, i29, i210, f2, i3, i4, z, zM44176, iM441715, iM441716, i5, z2, i11, i12, i13, i10);
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
    /* JADX INFO: renamed from: ۧ */
    public static C9145 m41115(int i, int i2, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        int i3;
        C15179 c15179;
        boolean zM44176;
        int iM44172;
        int i4;
        int iM44173;
        int i5;
        boolean[][] zArr;
        int i6;
        int i7;
        boolean[][] zArr2;
        int i8;
        int[] iArr3;
        boolean z;
        int[] iArr4;
        boolean zM44177;
        int i9;
        int i10;
        int i11;
        boolean zM44178;
        boolean zM44179;
        int iM44177;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        C19400 c19400 = new C19400(bArr, i, i2);
        m41110(c19400);
        c19400.m44175(4);
        boolean zM441710 = c19400.m44176();
        boolean zM441711 = c19400.m44176();
        int iM44174 = c19400.m44172(6);
        int i15 = iM44174 + 1;
        int iM44175 = c19400.m44172(3);
        c19400.m44175(17);
        C5122 c5122M41109 = m41109(c19400, true, iM44175, (C5122) null);
        for (int i16 = c19400.m44176() ? 0 : iM44175; i16 <= iM44175; i16++) {
            c19400.m44177();
            c19400.m44177();
            c19400.m44177();
        }
        int iM44176 = c19400.m44172(6);
        int iM44178 = c19400.m44177() + 1;
        C14509 c14509 = new C14509(AbstractC16192.m36873of((Object) c5122M41109), new int[1]);
        boolean z4 = i15 >= 2 && iM44178 >= 2;
        boolean z5 = zM441710 && zM441711;
        int i17 = iM44176 + 1;
        boolean z6 = i17 >= i15;
        if (!z4 || !z5 || !z6) {
            return new C9145(null, c14509, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iM44178, i17);
        int[] iArr6 = new int[iM44178];
        int[] iArr7 = new int[iM44178];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i18 = 1; i18 < iM44178; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iM44176; i20++) {
                if (c19400.m44176()) {
                    iArr5[i18][i19] = i20;
                    iArr7[i18] = i20;
                    i19++;
                }
                iArr6[i18] = i19;
            }
        }
        if (c19400.m44176()) {
            c19400.m44175(64);
            if (c19400.m44176()) {
                c19400.m44177();
            }
            int iM44179 = c19400.m44177();
            for (int i21 = 0; i21 < iM44179; i21++) {
                c19400.m44177();
                if (i21 == 0 || c19400.m44176()) {
                    boolean zM441712 = c19400.m44176();
                    boolean zM441713 = c19400.m44176();
                    z3 = zM441712;
                    z2 = zM441713;
                    if (zM441712 || zM441713) {
                        zM44177 = c19400.m44176();
                        if (zM44177) {
                            c19400.m44175(19);
                        }
                        c19400.m44175(8);
                        if (zM44177) {
                            c19400.m44175(4);
                        }
                        c19400.m44175(15);
                        i10 = zM441712;
                        i9 = zM441713;
                    }
                    i11 = 0;
                    while (i11 <= iM44175) {
                        zM44178 = c19400.m44176();
                        if (!zM44178) {
                            zM44178 = c19400.m44176();
                        }
                        if (zM44178) {
                            c19400.m44177();
                            zM44179 = false;
                        } else {
                            zM44179 = c19400.m44176();
                        }
                        if (zM44179) {
                            iM44177 = 0;
                        } else {
                            iM44177 = c19400.m44177();
                        }
                        int[] iArr8 = iArr7;
                        i12 = i10 + i9;
                        int[][] iArr9 = iArr5;
                        i13 = 0;
                        while (i13 < i12) {
                            int i22 = i12;
                            for (i14 = 0; i14 <= iM44177; i14++) {
                                c19400.m44177();
                                c19400.m44177();
                                if (zM44177) {
                                    c19400.m44177();
                                    c19400.m44177();
                                }
                                c19400.m44174();
                            }
                            i13++;
                            i12 = i22;
                        }
                        i11++;
                        iM44179 = iM44179;
                        iArr7 = iArr8;
                        iArr5 = iArr9;
                    }
                } else {
                    z3 = false;
                    z2 = false;
                }
                zM44177 = false;
                i10 = z3;
                i9 = z2;
                i11 = 0;
                while (i11 <= iM44175) {
                    zM44178 = c19400.m44176();
                    if (!zM44178) {
                        zM44178 = c19400.m44176();
                    }
                    if (zM44178) {
                        c19400.m44177();
                        zM44179 = false;
                    } else {
                        zM44179 = c19400.m44176();
                    }
                    if (zM44179) {
                        iM44177 = c19400.m44177();
                    } else {
                        iM44177 = 0;
                    }
                    int[] iArr10 = iArr7;
                    i12 = i10 + i9;
                    int[][] iArr11 = iArr5;
                    i13 = 0;
                    while (i13 < i12) {
                        int i23 = i12;
                        while (i14 <= iM44177) {
                            c19400.m44177();
                            c19400.m44177();
                            if (zM44177) {
                                c19400.m44177();
                                c19400.m44177();
                            }
                            c19400.m44174();
                        }
                        i13++;
                        i12 = i23;
                    }
                    i11++;
                    iM44179 = iM44179;
                    iArr7 = iArr10;
                    iArr5 = iArr11;
                }
            }
        }
        int[][] iArr12 = iArr5;
        int[] iArr13 = iArr7;
        if (!c19400.m44176()) {
            return new C9145(null, c14509, null, null);
        }
        c19400.m44169();
        C5122 c5122M411010 = m41109(c19400, false, iM44175, c5122M41109);
        boolean zM441714 = c19400.m44176();
        boolean[] zArr3 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean zM441715 = c19400.m44176();
            zArr3[i25] = zM441715;
            if (zM441715) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr3[1]) {
            return new C9145(null, c14509, null, null);
        }
        int[] iArr14 = new int[i24];
        for (int i26 = 0; i26 < i24 - (zM441714 ? 1 : 0); i26++) {
            iArr14[i26] = c19400.m44172(3);
        }
        int[] iArr15 = new int[i24 + 1];
        if (zM441714) {
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
        boolean zM441716 = c19400.m44176();
        int i29 = 1;
        while (i29 < i15) {
            if (zM441716) {
                iArr18[i29] = c19400.m44172(6);
            } else {
                iArr18[i29] = i29;
            }
            if (zM441714) {
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
                    iArr17[i29][i32] = c19400.m44172(iArr14[i32] + 1);
                    i32++;
                    iArr14 = iArr14;
                }
                iArr4 = iArr14;
            }
            i29++;
            zM441716 = zM441716;
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
        int iM441710 = c19400.m44172(4);
        if (i33 < 2 || iM441710 == 0) {
            return new C9145(null, c14509, null, null);
        }
        int[] iArr20 = new int[i33];
        for (int i38 = 0; i38 < i33; i38++) {
            iArr20[i38] = c19400.m44172(iM441710);
        }
        int[] iArr21 = new int[i17];
        for (int i39 = 0; i39 < i15; i39++) {
            iArr21[Math.min(iArr18[i39], iM44176)] = i39;
        }
        C4123 c4123 = new C4123();
        int i40 = 0;
        while (i40 <= iM44176) {
            int iMin = Math.min(iArr19[i40], i33 - 1);
            c4123.m18184(new C21216(iArr21[i40], iMin >= 0 ? iArr20[iMin] : -1));
            i40++;
            iArr19 = iArr19;
        }
        AbstractC16192 abstractC16192M8329 = c4123.m8329();
        if (((C21216) abstractC16192M8329.get(0)).f66705 == -1) {
            return new C9145(null, c14509, null, null);
        }
        int i41 = 1;
        while (true) {
            if (i41 > iM44176) {
                i41 = -1;
                break;
            }
            if (((C21216) abstractC16192M8329.get(i41)).f66705 != -1) {
                break;
            }
            i41++;
        }
        if (i41 == -1) {
            return new C9145(null, c14509, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        for (int i42 = 1; i42 < i15; i42++) {
            for (int i43 = 0; i43 < i42; i43++) {
                boolean[] zArr6 = zArr4[i42];
                boolean[] zArr7 = zArr5[i42];
                boolean zM441717 = c19400.m44176();
                zArr7[i43] = zM441717;
                zArr6[i43] = zM441717;
            }
        }
        for (int i44 = 1; i44 < i15; i44++) {
            for (int i45 = 0; i45 < iM44174; i45++) {
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
            return new C9145(null, c14509, null, null);
        }
        int[] iArr23 = new int[i15];
        int[] iArr24 = new int[iM44178];
        if (c19400.m44176()) {
            int i52 = 0;
            while (true) {
                iArr2 = iArr18;
                if (i52 >= i15) {
                    break;
                }
                iArr23[i52] = c19400.m44172(3);
                i52++;
                iArr18 = iArr2;
            }
            i3 = iM44175;
        } else {
            iArr2 = iArr18;
            i3 = iM44175;
            Arrays.fill(iArr23, 0, i15, i3);
        }
        int i53 = 0;
        while (i53 < iM44178) {
            boolean[][] zArr9 = zArr5;
            int i54 = i41;
            int[] iArr25 = iArr22;
            int iMax = 0;
            for (int i55 = 0; i55 < iArr[i53]; i55++) {
                iMax = Math.max(iMax, iArr23[((C21216) abstractC16192M8329.get(iArr12[i53][i55])).f66704]);
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
        if (c19400.m44176()) {
            int i57 = 0;
            while (i57 < iM44174) {
                int i58 = i57 + 1;
                for (int i59 = i58; i59 < i15; i59++) {
                    if (zArr4[i59][i57]) {
                        c19400.m44175(3);
                    }
                }
                i57 = i58;
            }
        }
        c19400.m44174();
        int iM441711 = c19400.m44177() + 1;
        C4123 c4124 = new C4123();
        c4124.m18184(c5122M41109);
        if (iM441711 > 1) {
            C5122 c5122M411011 = c5122M411010;
            c4124.m18184(c5122M411011);
            for (int i60 = 2; i60 < iM441711; i60++) {
                c5122M411011 = m41109(c19400, c19400.m44176(), i3, c5122M411011);
                c4124.m18184(c5122M411011);
            }
        }
        AbstractC16192 abstractC16192M83210 = c4124.m8329();
        int iM441712 = c19400.m44177() + iM44178;
        if (iM441712 > iM44178) {
            return new C9145(null, c14509, null, null);
        }
        int iM441713 = c19400.m44172(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM441712, i17);
        int[] iArr27 = new int[iM441712];
        int[] iArr28 = new int[iM441712];
        int i61 = 0;
        int i62 = 0;
        while (i61 < iM44178) {
            iArr27[i61] = i62;
            iArr28[i61] = iArr13[i61];
            if (iM441713 == 0) {
                i8 = iM44178;
                zArr2 = zArr4;
                iArr3 = iArr24;
                i7 = i15;
                Arrays.fill(zArr11[i61], 0, iArr[i61], true);
                iArr27[i61] = iArr[i61];
            } else {
                i7 = i15;
                zArr2 = zArr4;
                i8 = iM44178;
                iArr3 = iArr24;
                if (iM441713 == 1) {
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
                iM44178 = i8;
                zArr4 = zArr2;
                iArr24 = iArr3;
                i15 = i7;
            }
            i62 = 0;
            i61++;
            iM44178 = i8;
            zArr4 = zArr2;
            iArr24 = iArr3;
            i15 = i7;
        }
        int i65 = i15;
        boolean[][] zArr12 = zArr4;
        int i66 = iM44178;
        int[] iArr29 = iArr24;
        int i67 = 1;
        int[] iArr30 = new int[i17];
        int i68 = 2;
        int[] iArr31 = new int[2];
        iArr31[1] = i17;
        iArr31[i62] = iM441712;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr31);
        int i69 = 0;
        while (i67 < iM441712) {
            if (iM441713 == i68) {
                for (int i70 = 0; i70 < iArr[i67]; i70++) {
                    zArr11[i67][i70] = c19400.m44176();
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
                if (iM441711 > 1) {
                    zArr13[i67][i75] = zArr11[i67][i75];
                    zArr = zArr11;
                    int i76 = iM441713;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM46231 = C20495.m46231(iM441711);
                    if (zArr13[i67][i75]) {
                        i5 = iM441711;
                    } else {
                        int i77 = ((C21216) abstractC16192M8329.get(iArr12[i67][i75])).f66704;
                        i5 = iM441711;
                        int i78 = 0;
                        while (true) {
                            if (i78 < i75) {
                                i6 = i76;
                                if (zArr10[i77][((C21216) abstractC16192M8329.get(iArr12[i67][i78])).f66704]) {
                                    zArr13[i67][i75] = true;
                                    break;
                                }
                                i78++;
                                i76 = i6;
                            }
                        }
                        if (!zArr13[i67][i75]) {
                            if (i69 <= 0 && i67 == i69) {
                                iArr30[i75] = c19400.m44172(iM46231);
                            } else {
                                c19400.m44175(iM46231);
                            }
                        }
                    }
                    i6 = i76;
                    if (!zArr13[i67][i75]) {
                        if (i69 <= 0) {
                            c19400.m44175(iM46231);
                        } else {
                            c19400.m44175(iM46231);
                        }
                    }
                } else {
                    i5 = iM441711;
                    zArr = zArr11;
                    i6 = iM441713;
                }
                i75++;
                zArr11 = zArr;
                iM441711 = i5;
                iM441713 = i6;
            }
            int i79 = iM441711;
            boolean[][] zArr14 = zArr11;
            int i80 = iM441713;
            if (iArr27[i67] == 1 && iArr26[iArr28[i67]] > 0) {
                c19400.m44174();
            }
            i67++;
            i68 = 2;
            zArr11 = zArr14;
            iM441711 = i79;
            iM441713 = i80;
            i56 = i74;
        }
        if (i69 == 0) {
            return new C9145(null, c14509, null, null);
        }
        int iM441714 = c19400.m44177();
        int i81 = iM441714 + 1;
        C4123 c4123M36878 = AbstractC16192.m36878(i81);
        int[] iArr32 = new int[i65];
        int i82 = 0;
        while (i82 < i81) {
            int iM441715 = c19400.m44172(16);
            int iM441716 = c19400.m44172(16);
            if (c19400.m44176()) {
                iM44172 = c19400.m44172(2);
                if (iM44172 == 3) {
                    c19400.m44174();
                }
                int iM441717 = c19400.m44172(4);
                iM44173 = c19400.m44172(4);
                i4 = iM441717;
            } else {
                iM44172 = 0;
                i4 = 0;
                iM44173 = 0;
            }
            if (c19400.m44176()) {
                int iM441718 = c19400.m44177();
                int iM441719 = c19400.m44177();
                int iM441720 = c19400.m44177();
                int iM441721 = c19400.m44177();
                iM441715 -= (iM441718 + iM441719) * ((iM44172 == 1 || iM44172 == 2) ? 2 : 1);
                iM441716 -= (iM441720 + iM441721) * (iM44172 == 1 ? 2 : 1);
            }
            c4123M36878.m18184(new C13839(iM44172, i4, iM44173, iM441715, iM441716));
            i82++;
            abstractC16192M8329 = abstractC16192M8329;
        }
        AbstractC16192 abstractC16192 = abstractC16192M8329;
        if (i81 <= 1 || !c19400.m44176()) {
            for (int i83 = 1; i83 < i65; i83++) {
                iArr32[i83] = Math.min(i83, iM441714);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM46232 = C20495.m46231(i81);
            for (int i84 = 1; i84 < i65; i84++) {
                iArr32[i84] = c19400.m44172(iM46232);
            }
        }
        C11828 c11828 = new C11828(c4123M36878.m8329(), iArr32);
        c19400.m44175(2);
        for (int i85 = 1; i85 < i65; i85++) {
            if (iArr26[iArr2[i85]] == 0) {
                c19400.m44174();
            }
        }
        for (int i86 = 1; i86 < iM441712; i86++) {
            boolean zM441718 = c19400.m44176();
            int i87 = 0;
            while (i87 < iArr29[i86]) {
                if (i87 <= 0 || !zM441718) {
                    zM44176 = i87 == 0;
                } else {
                    zM44176 = c19400.m44176();
                }
                if (zM44176) {
                    for (int i88 = 0; i88 < iArr[i86]; i88++) {
                        if (zArr13[i86][i88]) {
                            c19400.m44177();
                        }
                    }
                    c19400.m44177();
                    c19400.m44177();
                }
                i87++;
            }
        }
        int iM441722 = c19400.m44177() + 2;
        if (c19400.m44176()) {
            c19400.m44175(iM441722);
        } else {
            for (int i89 = 1; i89 < i65; i89++) {
                for (int i90 = 0; i90 < i89; i90++) {
                    if (zArr12[i89][i90]) {
                        c19400.m44175(iM441722);
                    }
                }
            }
        }
        int iM441723 = c19400.m44177();
        for (int i91 = 1; i91 <= iM441723; i91++) {
            c19400.m44175(8);
        }
        if (c19400.m44176()) {
            c19400.m44169();
            if (!c19400.m44176() ? c19400.m44176() : true) {
                c19400.m44174();
            }
            boolean zM441719 = c19400.m44176();
            boolean zM441720 = c19400.m44176();
            if (zM441719 || zM441720) {
                for (int i92 = 0; i92 < i66; i92++) {
                    for (int i93 = 0; i93 < iArr29[i92]; i93++) {
                        boolean zM441721 = zM441719 ? c19400.m44176() : false;
                        boolean zM441722 = zM441720 ? c19400.m44176() : false;
                        if (zM441721) {
                            c19400.m44175(32);
                        }
                        if (zM441722) {
                            c19400.m44175(18);
                        }
                    }
                }
            }
            boolean zM441723 = c19400.m44176();
            int iM441724 = zM441723 ? c19400.m44172(4) + 1 : i65;
            C4123 c4123M36879 = AbstractC16192.m36878(iM441724);
            int[] iArr33 = new int[i65];
            for (int i94 = 0; i94 < iM441724; i94++) {
                c19400.m44175(3);
                int i95 = c19400.m44176() ? 1 : 2;
                int iM50228 = C22378.m50228(c19400.m44172(8));
                int iM50227 = C22378.m50227(c19400.m44172(8));
                c19400.m44175(8);
                c4123M36879.m18184(new C23897(iM50228, i95, iM50227));
            }
            if (zM441723 && iM441724 > 1) {
                for (int i96 = 0; i96 < i65; i96++) {
                    iArr33[i96] = c19400.m44172(4);
                }
            }
            c15179 = new C15179(c4123M36879.m8329(), iArr33);
        } else {
            c15179 = null;
        }
        return new C9145(abstractC16192, new C14509(abstractC16192M83210, iArr30), c11828, c15179);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6463 m41110(C19400 c19400) {
        c19400.m44174();
        return new C6463(c19400.m44172(6), c19400.m44172(6), c19400.m44172(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:204:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX INFO: renamed from: ֫ */
    public static C13169 m41112(byte[] bArr, int i, int i2, C9145 c9145) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM44177;
        int i9;
        int iM44178;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM50227;
        int iM50228;
        int i14;
        C15179 c15179;
        int i15;
        C11828 c11828;
        C6463 c6463M41110 = m41110(new C19400(bArr, i, i2));
        C19400 c19400 = new C19400(bArr, i + 2, i2);
        c19400.m44175(4);
        int iM44172 = c19400.m44172(3);
        int i16 = c6463M41110.f16706;
        boolean z = i16 != 0 && iM44172 == 7;
        if (c9145 != null) {
            AbstractC16192 abstractC16192 = c9145.f24762;
            if (abstractC16192.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((C21216) abstractC16192.get(Math.min(i16, abstractC16192.size() - 1))).f66704;
            }
        } else {
            i3 = 0;
        }
        C5122 c5122M41109 = null;
        if (!z) {
            c19400.m44174();
            c5122M41109 = m41109(c19400, true, iM44172, (C5122) null);
        } else if (c9145 != null) {
            C14509 c14509 = c9145.f24763;
            int[] iArr = c14509.f41423;
            AbstractC16192 abstractC16193 = c14509.f41424;
            int i17 = iArr[i3];
            if (abstractC16193.size() > i17) {
                c5122M41109 = (C5122) abstractC16193.get(i17);
            }
        }
        c19400.m44177();
        if (z) {
            int iM44173 = c19400.m44176() ? c19400.m44172(8) : -1;
            if (c9145 == null || (c11828 = c9145.f24764) == null) {
                i8 = 0;
                iM44177 = 0;
                iM44178 = 0;
                i7 = 0;
                i9 = 0;
                i6 = 0;
            } else {
                AbstractC16192 abstractC16194 = c11828.f33016;
                if (iM44173 == -1) {
                    iM44173 = c11828.f33015[i3];
                }
                if (iM44173 == -1 || abstractC16194.size() <= iM44173) {
                    i8 = 0;
                    iM44177 = 0;
                    iM44178 = 0;
                    i7 = 0;
                    i9 = 0;
                    i6 = 0;
                } else {
                    C13839 c13839 = (C13839) abstractC16194.get(iM44173);
                    int i18 = c13839.f39108;
                    int i19 = c13839.f39109;
                    int i20 = c13839.f39110;
                    int i21 = c13839.f39107;
                    i9 = i19;
                    i8 = i20;
                    i6 = i8;
                    iM44178 = c13839.f39106;
                    iM44177 = i21;
                    i7 = i9;
                }
            }
        } else {
            int iM44179 = c19400.m44177();
            if (iM44179 == 3) {
                c19400.m44174();
            }
            int iM441710 = c19400.m44177();
            int iM441711 = c19400.m44177();
            if (c19400.m44176()) {
                int iM441712 = c19400.m44177();
                int iM441713 = c19400.m44177();
                int iM441714 = c19400.m44177();
                int iM441715 = c19400.m44177();
                i4 = iM441710 - ((iM441712 + iM441713) * ((iM44179 == 1 || iM44179 == 2) ? 2 : 1));
                i5 = iM441711 - ((iM441714 + iM441715) * (iM44179 == 1 ? 2 : 1));
            } else {
                i4 = iM441710;
                i5 = iM441711;
            }
            i6 = iM441711;
            i7 = i4;
            i8 = i5;
            iM44177 = c19400.m44177();
            i9 = iM441710;
            iM44178 = c19400.m44177();
        }
        int iM441716 = c19400.m44177();
        if (z) {
            i10 = -1;
        } else {
            int iMax = -1;
            for (int i22 = c19400.m44176() ? 0 : iM44172; i22 <= iM44172; i22++) {
                c19400.m44177();
                iMax = Math.max(c19400.m44177(), iMax);
                c19400.m44177();
            }
            i10 = iMax;
        }
        c19400.m44177();
        c19400.m44177();
        c19400.m44177();
        c19400.m44177();
        c19400.m44177();
        c19400.m44177();
        if (c19400.m44176()) {
            if (z ? c19400.m44176() : false) {
                c19400.m44175(6);
            } else if (c19400.m44176()) {
                int i23 = 0;
                int i24 = 4;
                int i25 = 6;
                while (i23 < i24) {
                    int i26 = 0;
                    while (i26 < i25) {
                        if (c19400.m44176()) {
                            int iMin = Math.min(64, 1 << ((i23 << 1) + 4));
                            if (i23 > 1) {
                                c19400.m44178();
                            }
                            for (int i27 = 0; i27 < iMin; i27++) {
                                c19400.m44178();
                            }
                            i15 = 3;
                        } else {
                            c19400.m44177();
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
        c19400.m44175(2);
        if (c19400.m44176()) {
            c19400.m44175(8);
            c19400.m44177();
            c19400.m44177();
            c19400.m44174();
        }
        int iM441717 = c19400.m44177();
        int i29 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i30 = -1;
        int i31 = i9;
        int i32 = -1;
        while (i29 < iM441717) {
            if (i29 == 0 || !c19400.m44176()) {
                int iM441718 = c19400.m44177();
                int iM441719 = c19400.m44177();
                int[] iArr3 = new int[iM441718];
                int i33 = 0;
                while (i33 < iM441718) {
                    iArr3[i33] = (i33 > 0 ? iArr3[i33 - 1] : 0) - (c19400.m44177() + 1);
                    c19400.m44174();
                    i33++;
                }
                int[] iArr4 = new int[iM441719];
                int i34 = 0;
                while (i34 < iM441719) {
                    iArr4[i34] = c19400.m44177() + 1 + (i34 > 0 ? iArr4[i34 - 1] : 0);
                    c19400.m44174();
                    i34++;
                }
                i30 = iM441718;
                i32 = iM441719;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i35 = i30 + i32;
                int iM51252 = C22934.m51252(c19400.m44176() ? 1 : 0, 2, 1, c19400.m44177() + 1);
                int i36 = i35 + 1;
                boolean[] zArr = new boolean[i36];
                for (int i37 = 0; i37 <= i35; i37++) {
                    if (c19400.m44176()) {
                        zArr[i37] = true;
                    } else {
                        zArr[i37] = c19400.m44176();
                    }
                }
                int[] iArr5 = new int[i36];
                int[] iArr6 = new int[i36];
                int i38 = 0;
                for (int i39 = i32 - 1; i39 >= 0; i39--) {
                    int i40 = iArrCopyOf[i39] + iM51252;
                    if (i40 < 0 && zArr[i30 + i39]) {
                        iArr5[i38] = i40;
                        i38++;
                    }
                }
                if (iM51252 < 0 && zArr[i35]) {
                    iArr5[i38] = iM51252;
                    i38++;
                }
                int i41 = i38;
                for (int i42 = 0; i42 < i30; i42++) {
                    int i43 = iArr2[i42] + iM51252;
                    if (i43 < 0 && zArr[i42]) {
                        iArr5[i41] = i43;
                        i41++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i41);
                int i44 = 0;
                for (int i45 = i30 - 1; i45 >= 0; i45--) {
                    int i46 = iArr2[i45] + iM51252;
                    if (i46 > 0 && zArr[i45]) {
                        iArr6[i44] = i46;
                        i44++;
                    }
                }
                if (iM51252 > 0 && zArr[i35]) {
                    iArr6[i44] = iM51252;
                    i44++;
                }
                int i47 = i44;
                for (int i48 = 0; i48 < i32; i48++) {
                    int i49 = iArrCopyOf[i48] + iM51252;
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
            iM441717 = iM441717;
            i7 = i7;
            iM44177 = iM44177;
            iM44178 = iM44178;
            c5122M41109 = c5122M41109;
            i8 = i8;
            iM44172 = iM44172;
        }
        int i50 = iM44172;
        C5122 c5122 = c5122M41109;
        int i51 = iM44177;
        int i52 = iM44178;
        int i53 = i7;
        int i54 = i8;
        if (c19400.m44176()) {
            int iM441720 = c19400.m44177();
            for (int i55 = 0; i55 < iM441720; i55++) {
                c19400.m44175(iM441716 + 5);
            }
        }
        c19400.m44175(2);
        float f = 1.0f;
        if (c19400.m44176()) {
            if (c19400.m44176()) {
                int iM44174 = c19400.m44172(8);
                if (iM44174 == 255) {
                    int iM44175 = c19400.m44172(16);
                    int iM44176 = c19400.m44172(16);
                    if (iM44175 != 0 && iM44176 != 0) {
                        f = iM44175 / iM44176;
                    }
                } else if (iM44174 < 17) {
                    f = f53915[iM44174];
                } else {
                    C10050.m23419(iM44174, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (c19400.m44176()) {
                c19400.m44174();
            }
            if (c19400.m44176()) {
                c19400.m44175(3);
                i14 = c19400.m44176() ? 1 : 2;
                if (c19400.m44176()) {
                    int iM441721 = c19400.m44172(8);
                    int iM441722 = c19400.m44172(8);
                    c19400.m44175(8);
                    iM50228 = C22378.m50228(iM441721);
                    iM50227 = C22378.m50227(iM441722);
                } else {
                    iM50228 = -1;
                    iM50227 = -1;
                }
            } else if (c9145 == null || (c15179 = c9145.f24765) == null) {
                iM50228 = -1;
                iM50227 = -1;
                i14 = -1;
            } else {
                AbstractC16192 abstractC16195 = c15179.f43333;
                int i56 = c15179.f43332[i3];
                if (abstractC16195.size() > i56) {
                    C23897 c23897 = (C23897) abstractC16195.get(i56);
                    iM50228 = c23897.f75890;
                    int i57 = c23897.f75889;
                    iM50227 = c23897.f75891;
                    i14 = i57;
                } else {
                    iM50228 = -1;
                    iM50227 = -1;
                    i14 = -1;
                }
            }
            if (c19400.m44176()) {
                c19400.m44177();
                c19400.m44177();
            }
            c19400.m44174();
            i12 = c19400.m44176() ? i54 * 2 : i54;
            int i58 = iM50228;
            i13 = i14;
            i11 = i58;
        } else {
            i11 = -1;
            i12 = i54;
            f = 1.0f;
            i13 = -1;
            iM50227 = -1;
        }
        return new C13169(i50, c5122, i51, i52, i53, i12, i31, i28, f, i10, i11, i13, iM50227);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7804 m41111(int i, int i2, byte[] bArr) {
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
        C19400 c19400 = new C19400(bArr, i3, i2 + 1);
        while (c19400.m44171(16)) {
            int iM44172 = c19400.m44172(8);
            int i4 = 0;
            while (iM44172 == 255) {
                i4 += 255;
                iM44172 = c19400.m44172(8);
            }
            int i5 = i4 + iM44172;
            int iM44173 = c19400.m44172(8);
            int i6 = 0;
            while (iM44173 == 255) {
                i6 += 255;
                iM44173 = c19400.m44172(8);
            }
            int i7 = i6 + iM44173;
            if (i7 == 0 || !c19400.m44171(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iM44177 = c19400.m44177();
                boolean zM44176 = c19400.m44176();
                int iM44178 = zM44176 ? c19400.m44177() : 0;
                int iM44179 = c19400.m44177();
                int iM441710 = -1;
                for (int i8 = 0; i8 <= iM44179; i8++) {
                    iM441710 = c19400.m44177();
                    c19400.m44177();
                    int iM44174 = c19400.m44172(6);
                    if (iM44174 == 63) {
                        return null;
                    }
                    if (iM44174 == 0) {
                        iMax = Math.max(0, iM44177 - 30);
                    } else {
                        iMax = Math.max(0, (iM44174 + iM44177) - 31);
                    }
                    c19400.m44172(iMax);
                    if (zM44176) {
                        int iM44175 = c19400.m44172(6);
                        if (iM44175 == 63) {
                            return null;
                        }
                        if (iM44175 == 0) {
                            iMax2 = Math.max(0, iM44178 - 30);
                        } else {
                            iMax2 = Math.max(0, (iM44175 + iM44178) - 31);
                        }
                        c19400.m44172(iMax2);
                    }
                    if (c19400.m44176()) {
                        c19400.m44175(10);
                    }
                }
                return new C7804(iM441710);
            }
            c19400.m44175(i7 * 8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m41105(int i, int i2, byte[] bArr, boolean[] zArr) {
        int i3 = i2 - i;
        C23877.m52960(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m41113(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m41113(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m41113(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & UTF8.S_ERR) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m41113(zArr);
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

    /* JADX INFO: renamed from: ֫ */
    public static void m41113(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m41108(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = AbstractC16192.f47662;
                C4123 c4123 = new C4123();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int iM41105 = m41105(i3, bArr.length, bArr, zArr);
                    if (iM41105 != bArr.length) {
                        c4123.m18184(Integer.valueOf(iM41105));
                    }
                    i3 = iM41105 + 3;
                }
                AbstractC16192 abstractC16192M8329 = c4123.m8329();
                for (int i4 = 0; i4 < abstractC16192M8329.size(); i4++) {
                    if (((Integer) abstractC16192M8329.get(i4)).intValue() + 3 < length) {
                        C19400 c19400 = new C19400(bArr, ((Integer) abstractC16192M8329.get(i4)).intValue() + 3, length);
                        C6463 c6463M41110 = m41110(c19400);
                        if (c6463M41110.f16707 == 33 && c6463M41110.f16706 == 0) {
                            c19400.m44175(4);
                            int iM44172 = c19400.m44172(3);
                            c19400.m44174();
                            C5122 c5122M41109 = m41109(c19400, true, iM44172, (C5122) null);
                            return C19322.m44015(c5122M41109.f12038, c5122M41109.f12039, c5122M41109.f12037, c5122M41109.f12034, c5122M41109.f12036, c5122M41109.f12035);
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
    /* JADX INFO: renamed from: ֫ */
    public static C5122 m41109(C19400 c19400, boolean z, int i, C5122 c5122) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean zM44176;
        int iM44172;
        int i5;
        int iM44173;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            iM44173 = c19400.m44172(2);
            zM44176 = c19400.m44176();
            iM44172 = c19400.m44172(5);
            i5 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (c19400.m44176()) {
                    i5 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = c19400.m44172(8);
            }
        } else {
            if (c5122 != null) {
                int i9 = c5122.f12038;
                zM44176 = c5122.f12036;
                iM44172 = c5122.f12039;
                i5 = c5122.f12037;
                iArr2 = c5122.f12034;
                iM44173 = i9;
            } else {
                iArr = iArr2;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                z2 = false;
            }
            int iM44174 = c19400.m44172(8);
            i6 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                if (c19400.m44176()) {
                    i6 += 88;
                }
                if (c19400.m44176()) {
                    i6 += 8;
                }
            }
            c19400.m44175(i6);
            if (i > 0) {
                c19400.m44175((8 - i) * 2);
            }
            return new C5122(i2, i3, i4, iArr, z2, iM44174);
        }
        i2 = iM44173;
        iArr = iArr2;
        z2 = zM44176;
        i3 = iM44172;
        i4 = i5;
        int iM44175 = c19400.m44172(8);
        i6 = 0;
        while (i10 < i) {
            if (c19400.m44176()) {
                i6 += 88;
            }
            if (c19400.m44176()) {
                i6 += 8;
            }
        }
        c19400.m44175(i6);
        if (i > 0) {
            c19400.m44175((8 - i) * 2);
        }
        return new C5122(i2, i3, i4, iArr, z2, iM44175);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41116(C19400 c19400) {
        int iM44177 = c19400.m44177() + 1;
        c19400.m44175(8);
        for (int i = 0; i < iM44177; i++) {
            c19400.m44177();
            c19400.m44177();
            c19400.m44174();
        }
        c19400.m44175(20);
    }
}
