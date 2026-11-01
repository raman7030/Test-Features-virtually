package com.alipay.sdk.p010m.p044q0;

import com.umeng.analytics.pro.C0698cb;
import java.io.UnsupportedEncodingException;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;
import p067l.C9417;

/* JADX INFO: renamed from: com.alipay.sdk.m.q0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0192b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ boolean f896a = true;

    /* JADX INFO: renamed from: com.alipay.sdk.m.q0.b$a */
    /* JADX INFO: compiled from: N673 */
    public abstract class a {

        /* JADX INFO: renamed from: a */
        public byte[] f897a;

        /* JADX INFO: renamed from: b */
        public int f898b;
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.q0.b$b */
    /* JADX INFO: compiled from: N673 */
    public class b extends a {

        /* JADX INFO: renamed from: f */
        public static final int[] f899f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g */
        public static final int[] f900g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: c */
        public int f901c;

        /* JADX INFO: renamed from: d */
        public int f902d;

        /* JADX INFO: renamed from: e */
        public final int[] f903e;

        public b(int i, byte[] bArr) {
            this.f897a = bArr;
            this.f903e = (i & 8) == 0 ? f899f : f900g;
            this.f901c = 0;
            this.f902d = 0;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
        /* JADX INFO: renamed from: a */
        public boolean m936a(byte[] bArr, int i, int i2, boolean z) {
            int i3 = this.f901c;
            if (i3 == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.f902d;
            byte[] bArr2 = this.f897a;
            int[] iArr = this.f903e;
            int i6 = i5;
            int i7 = 0;
            int i8 = i3;
            int i9 = i;
            while (i9 < i4) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i4 || (i6 = (iArr[bArr[i9] & 255] << 18) | (iArr[bArr[i9 + 1] & 255] << 12) | (iArr[bArr[i9 + 2] & 255] << 6) | iArr[bArr[i9 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i7 + 2] = (byte) i6;
                        bArr2[i7 + 1] = (byte) (i6 >> 8);
                        bArr2[i7] = (byte) (i6 >> 16);
                        i7 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                }
                int i11 = i9 + 1;
                int i12 = iArr[bArr[i9] & 255];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    if (i8 == 5 && i12 != -1) {
                                        this.f901c = 6;
                                        return false;
                                    }
                                } else if (i12 == -2) {
                                    i8++;
                                } else if (i12 != -1) {
                                    this.f901c = 6;
                                    return false;
                                }
                            } else if (i12 >= 0) {
                                i6 = (i6 << 6) | i12;
                                bArr2[i7 + 2] = (byte) i6;
                                bArr2[i7 + 1] = (byte) (i6 >> 8);
                                bArr2[i7] = (byte) (i6 >> 16);
                                i7 += 3;
                                i8 = 0;
                            } else if (i12 == -2) {
                                bArr2[i7 + 1] = (byte) (i6 >> 2);
                                bArr2[i7] = (byte) (i6 >> 10);
                                i7 += 2;
                                i8 = 5;
                            } else if (i12 != -1) {
                                this.f901c = 6;
                                return false;
                            }
                        } else if (i12 >= 0) {
                            i6 = (i6 << 6) | i12;
                            i8++;
                        } else if (i12 == -2) {
                            bArr2[i7] = (byte) (i6 >> 4);
                            i8 = 4;
                            i7++;
                        } else if (i12 != -1) {
                            this.f901c = 6;
                            return false;
                        }
                    } else if (i12 >= 0) {
                        i6 = (i6 << 6) | i12;
                        i8++;
                    } else if (i12 != -1) {
                        this.f901c = 6;
                        return false;
                    }
                } else if (i12 >= 0) {
                    i8++;
                    i6 = i12;
                } else if (i12 != -1) {
                    this.f901c = 6;
                    return false;
                }
                i9 = i11;
            }
            if (!z) {
                this.f901c = i8;
                this.f902d = i6;
                this.f898b = i7;
                return true;
            }
            if (i8 == 1) {
                this.f901c = 6;
                return false;
            }
            if (i8 == 2) {
                bArr2[i7] = (byte) (i6 >> 4);
                i7++;
            } else if (i8 == 3) {
                int i13 = i7 + 1;
                bArr2[i7] = (byte) (i6 >> 10);
                i7 += 2;
                bArr2[i13] = (byte) (i6 >> 2);
            } else if (i8 == 4) {
                this.f901c = 6;
                return false;
            }
            this.f901c = i8;
            this.f898b = i7;
            return true;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.q0.b$c */
    /* JADX INFO: compiled from: N673 */
    public class c extends a {

        /* JADX INFO: renamed from: j */
        public static final byte[] f904j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, UTF8.S_P4A, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, KeyFactorySpi.x25519_type, KeyFactorySpi.x448_type, KeyFactorySpi.Ed25519_type, KeyFactorySpi.Ed448_type, 114, 115, 116, 117, 118, 119, 120, 121, 122, UTF8.S_P3A, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k */
        public static final byte[] f905k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, UTF8.S_P4A, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, KeyFactorySpi.x25519_type, KeyFactorySpi.x448_type, KeyFactorySpi.Ed25519_type, KeyFactorySpi.Ed448_type, 114, 115, 116, 117, 118, 119, 120, 121, 122, UTF8.S_P3A, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: l */
        public static final /* synthetic */ boolean f906l = true;

        /* JADX INFO: renamed from: c */
        public final byte[] f907c;

        /* JADX INFO: renamed from: d */
        public int f908d;

        /* JADX INFO: renamed from: e */
        public int f909e;

        /* JADX INFO: renamed from: f */
        public final boolean f910f;

        /* JADX INFO: renamed from: g */
        public final boolean f911g;

        /* JADX INFO: renamed from: h */
        public final boolean f912h;

        /* JADX INFO: renamed from: i */
        public final byte[] f913i;

        public c(int i, byte[] bArr) {
            this.f897a = bArr;
            this.f910f = (i & 1) == 0;
            boolean z = (i & 2) == 0;
            this.f911g = z;
            this.f912h = (i & 4) != 0;
            this.f913i = (i & 8) == 0 ? f904j : f905k;
            this.f907c = new byte[2];
            this.f908d = 0;
            this.f909e = z ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX INFO: renamed from: a */
        public boolean m937a(byte[] bArr, int i, int i2, boolean z) {
            int i3;
            int i4;
            int i5;
            int i6;
            byte b;
            int i7;
            byte b2;
            byte b3;
            int i8;
            int i9;
            byte[] bArr2 = this.f913i;
            byte[] bArr3 = this.f897a;
            int i10 = this.f909e;
            int i11 = i2 + i;
            int i12 = this.f908d;
            int i13 = 0;
            if (i12 != 1) {
                if (i12 == 2 && (i9 = i + 1) <= i11) {
                    byte[] bArr4 = this.f907c;
                    i4 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i] & 255);
                    this.f908d = 0;
                    i3 = i9;
                } else {
                    i4 = -1;
                    i3 = i;
                }
            } else if (i + 2 <= i11) {
                i3 = i + 2;
                i4 = (bArr[i + 1] & 255) | ((this.f907c[0] & 255) << 16) | ((bArr[i] & 255) << 8);
                this.f908d = 0;
            } else {
                i4 = -1;
                i3 = i;
            }
            if (i4 != -1) {
                bArr3[0] = bArr2[(i4 >> 18) & 63];
                bArr3[1] = bArr2[(i4 >> 12) & 63];
                bArr3[2] = bArr2[(i4 >> 6) & 63];
                bArr3[3] = bArr2[i4 & 63];
                i10--;
                if (i10 == 0) {
                    if (this.f912h) {
                        bArr3[4] = C0698cb.f2569k;
                        i8 = 5;
                    } else {
                        i8 = 4;
                    }
                    i5 = i8 + 1;
                    bArr3[i8] = 10;
                    i10 = 19;
                } else {
                    i5 = 4;
                }
            } else {
                i5 = 0;
            }
            while (true) {
                int i14 = i3 + 3;
                if (i14 > i11) {
                    break;
                }
                int i15 = ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8) | (bArr[i3 + 2] & 255);
                bArr3[i5] = bArr2[(i15 >> 18) & 63];
                bArr3[i5 + 1] = bArr2[(i15 >> 12) & 63];
                bArr3[i5 + 2] = bArr2[(i15 >> 6) & 63];
                bArr3[i5 + 3] = bArr2[i15 & 63];
                int i16 = i5 + 4;
                i10--;
                if (i10 == 0) {
                    if (this.f912h) {
                        bArr3[i16] = C0698cb.f2569k;
                        i16 = i5 + 5;
                    }
                    bArr3[i16] = 10;
                    i5 = i16 + 1;
                    i10 = 19;
                } else {
                    i5 = i16;
                }
                i3 = i14;
            }
            if (z) {
                int i17 = this.f908d;
                int i18 = i3 - i17;
                if (i18 == i11 - 1) {
                    if (i17 > 0) {
                        b3 = this.f907c[0];
                        i13 = 1;
                    } else {
                        byte b4 = bArr[i3];
                        i3++;
                        b3 = b4;
                    }
                    int i19 = (b3 & 255) << 4;
                    this.f908d = i17 - i13;
                    bArr3[i5] = bArr2[(i19 >> 6) & 63];
                    int i20 = i5 + 2;
                    bArr3[i5 + 1] = bArr2[i19 & 63];
                    if (this.f910f) {
                        bArr3[i20] = Base32Encoder.DEFAULT_PADDING;
                        i20 = i5 + 4;
                        bArr3[i5 + 3] = Base32Encoder.DEFAULT_PADDING;
                    }
                    if (this.f911g) {
                        if (this.f912h) {
                            bArr3[i20] = C0698cb.f2569k;
                            i20++;
                        }
                        i6 = i20 + 1;
                        bArr3[i20] = 10;
                        i5 = i6;
                    } else {
                        i5 = i20;
                    }
                } else if (i18 == i11 - 2) {
                    if (i17 > 1) {
                        b = this.f907c[0];
                        i13 = 1;
                    } else {
                        byte b5 = bArr[i3];
                        i3++;
                        b = b5;
                    }
                    int i21 = (b & 255) << 10;
                    if (i17 > 0) {
                        i7 = i13 + 1;
                        b2 = this.f907c[i13];
                    } else {
                        i7 = i13;
                        b2 = bArr[i3];
                        i3++;
                    }
                    int i22 = i21 | ((b2 & 255) << 2);
                    this.f908d = i17 - i7;
                    bArr3[i5] = bArr2[(i22 >> 12) & 63];
                    bArr3[i5 + 1] = bArr2[(i22 >> 6) & 63];
                    int i23 = i5 + 3;
                    bArr3[i5 + 2] = bArr2[i22 & 63];
                    if (this.f910f) {
                        bArr3[i23] = Base32Encoder.DEFAULT_PADDING;
                        i23 = i5 + 4;
                    }
                    if (this.f911g) {
                        if (this.f912h) {
                            bArr3[i23] = C0698cb.f2569k;
                            i23++;
                        }
                        i6 = i23 + 1;
                        bArr3[i23] = 10;
                        i5 = i6;
                    } else {
                        i5 = i23;
                    }
                } else if (this.f911g && i5 > 0 && i10 != 19) {
                    if (this.f912h) {
                        bArr3[i5] = C0698cb.f2569k;
                        i5++;
                    }
                    i6 = i5 + 1;
                    bArr3[i5] = 10;
                    i5 = i6;
                }
                boolean z2 = f906l;
                if (!z2 && this.f908d != 0) {
                    throw new AssertionError();
                }
                if (!z2 && i3 != i11) {
                    throw new AssertionError();
                }
            } else if (i3 == i11 - 1) {
                byte[] bArr5 = this.f907c;
                int i24 = this.f908d;
                this.f908d = i24 + 1;
                bArr5[i24] = bArr[i3];
            } else if (i3 == i11 - 2) {
                byte[] bArr6 = this.f907c;
                int i25 = this.f908d;
                int i26 = i25 + 1;
                this.f908d = i26;
                bArr6[i25] = bArr[i3];
                this.f908d = i25 + 2;
                bArr6[i26] = bArr[i3 + 1];
            }
            this.f898b = i5;
            this.f909e = i10;
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m931a(byte[] bArr, int i) {
        return m932a(bArr, 0, bArr.length, i);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m933b(byte[] bArr, int i) {
        return m934b(bArr, 0, bArr.length, i);
    }

    /* JADX INFO: renamed from: c */
    public static String m935c(byte[] bArr, int i) {
        try {
            return new String(m933b(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m932a(byte[] bArr, int i, int i2, int i3) {
        b bVar = new b(i3, new byte[(i2 * 3) / 4]);
        if (!bVar.m936a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i4 = bVar.f898b;
        byte[] bArr2 = bVar.f897a;
        if (i4 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr2, 0, bArr3, 0, i4);
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m934b(byte[] bArr, int i, int i2, int i3) {
        c cVar = new c(i3, null);
        int iM21912 = (i2 / 3) * 4;
        if (!cVar.f910f) {
            int i4 = i2 % 3;
            if (i4 == 1) {
                iM21912 += 2;
            } else if (i4 == 2) {
                iM21912 += 3;
            }
        } else if (i2 % 3 > 0) {
            iM21912 += 4;
        }
        if (cVar.f911g && i2 > 0) {
            iM21912 += C9417.m21912(i2, 1, 57, 1) * (cVar.f912h ? 2 : 1);
        }
        cVar.f897a = new byte[iM21912];
        cVar.m937a(bArr, i, i2, true);
        if (f896a || cVar.f898b == iM21912) {
            return cVar.f897a;
        }
        throw new AssertionError();
    }
}
