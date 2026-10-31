package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۛۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68JR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5893 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f18095 = {1, 2, 3, 6};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f18099 = {48000, 44100, 32000};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f18098 = {24000, 22050, 16000};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f18097 = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f18094 = {32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes, 448, 512, 576, 640};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f18096 = {69, 87, IShizukuService.Stub.TRANSACTION_isHidden, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8353 m16513(C17714 c17714, String str, String str2, C19643 c19643) {
        C16302 c16302 = new C16302();
        c16302.m38342(c17714);
        int i = f18099[c16302.m38343(2)];
        c16302.m38351(8);
        int i2 = f18097[c16302.m38343(3)];
        if (c16302.m38343(1) != 0) {
            i2++;
        }
        int i3 = f18094[c16302.m38343(5)] * 1000;
        c16302.m38344();
        c17714.m41484(c16302.m38348());
        C1297 c1297 = new C1297();
        c1297.m4469(str);
        c1297.m4465("audio/ac3");
        c1297.m4472(i2);
        c1297.m4456(i);
        c1297.m4447(c19643);
        c1297.m4471(str2);
        c1297.m4468(i3);
        c1297.m4438(i3);
        return c1297.m4440();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8353 m16515(C17714 c17714, String str, String str2, C19643 c19643) {
        String str3;
        C16302 c16302 = new C16302();
        c16302.m38342(c17714);
        int iM38343 = c16302.m38343(13) * 1000;
        c16302.m38351(3);
        int i = f18099[c16302.m38343(2)];
        c16302.m38351(10);
        int i2 = f18097[c16302.m38343(3)];
        if (c16302.m38343(1) != 0) {
            i2++;
        }
        c16302.m38351(3);
        int iM38344 = c16302.m38343(4);
        c16302.m38351(1);
        if (iM38344 > 0) {
            c16302.m38351(6);
            if (c16302.m38343(1) != 0) {
                i2 += 2;
            }
            c16302.m38351(1);
        }
        if (c16302.m38339() > 7) {
            c16302.m38351(7);
            if (c16302.m38343(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        c16302.m38344();
        c17714.m41484(c16302.m38348());
        C1297 c1297 = new C1297();
        c1297.m4469(str);
        c1297.m4465(str3);
        c1297.m4472(i2);
        c1297.m4456(i);
        c1297.m4447(c19643);
        c1297.m4471(str2);
        c1297.m4438(iM38343);
        return c1297.m4440();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0193  */
    /* JADX WARN: Code duplicated, block: B:110:0x019b  */
    /* JADX WARN: Code duplicated, block: B:117:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01be  */
    /* JADX WARN: Code duplicated, block: B:182:0x01c1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10127 m16514(C16302 c16302) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM38343;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM38353 = c16302.m38353();
        c16302.m38351(40);
        boolean z = c16302.m38343(5) > 10;
        c16302.m38354(iM38353);
        int[] iArr = f18097;
        int[] iArr2 = f18099;
        int i15 = -1;
        if (z) {
            c16302.m38351(16);
            int iM38344 = c16302.m38343(2);
            if (iM38344 == 0) {
                i15 = 0;
            } else if (iM38344 == 1) {
                i15 = 1;
            } else if (iM38344 == 2) {
                i15 = 2;
            }
            c16302.m38351(3);
            int iM38345 = (c16302.m38343(11) + 1) * 2;
            int iM38346 = c16302.m38343(2);
            if (iM38346 == 3) {
                i8 = f18098[c16302.m38343(2)];
                i7 = 6;
                iM38343 = 3;
            } else {
                iM38343 = c16302.m38343(2);
                i7 = f18095[iM38343];
                i8 = iArr2[iM38346];
            }
            int i16 = i7 * 256;
            int i17 = (iM38345 * i8) / (i7 * 32);
            int iM38347 = c16302.m38343(3);
            boolean zM38352 = c16302.m38352();
            int i18 = iArr[iM38347] + (zM38352 ? 1 : 0);
            c16302.m38351(10);
            if (c16302.m38352()) {
                c16302.m38351(8);
            }
            if (iM38347 == 0) {
                c16302.m38351(5);
                if (c16302.m38352()) {
                    c16302.m38351(8);
                }
            }
            if (i15 == 1 && c16302.m38352()) {
                c16302.m38351(16);
            }
            if (c16302.m38352()) {
                if (iM38347 > 2) {
                    c16302.m38351(2);
                }
                if ((iM38347 & 1) == 0 || iM38347 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    c16302.m38351(6);
                }
                if ((iM38347 & 4) != 0) {
                    c16302.m38351(i10);
                }
                if (zM38352 && c16302.m38352()) {
                    c16302.m38351(5);
                }
                if (i15 == 0) {
                    if (c16302.m38352()) {
                        i11 = 6;
                        c16302.m38351(6);
                    } else {
                        i11 = 6;
                    }
                    if (iM38347 == 0 && c16302.m38352()) {
                        c16302.m38351(i11);
                    }
                    if (c16302.m38352()) {
                        c16302.m38351(i11);
                    }
                    int iM38348 = c16302.m38343(2);
                    if (iM38348 == 1) {
                        c16302.m38351(5);
                    } else if (iM38348 == 2) {
                        c16302.m38351(12);
                    } else {
                        if (iM38348 == 3) {
                            int iM38349 = c16302.m38343(5);
                            if (c16302.m38352()) {
                                c16302.m38351(5);
                                if (c16302.m38352()) {
                                    i13 = 4;
                                    c16302.m38351(4);
                                } else {
                                    i13 = 4;
                                }
                                if (c16302.m38352()) {
                                    c16302.m38351(i13);
                                }
                                if (c16302.m38352()) {
                                    c16302.m38351(i13);
                                }
                                if (c16302.m38352()) {
                                    c16302.m38351(i13);
                                }
                                if (c16302.m38352()) {
                                    c16302.m38351(i13);
                                }
                                if (c16302.m38352()) {
                                    c16302.m38351(i13);
                                }
                                if (c16302.m38352()) {
                                    c16302.m38351(i13);
                                }
                                if (c16302.m38352()) {
                                    if (c16302.m38352()) {
                                        c16302.m38351(i13);
                                    }
                                    if (c16302.m38352()) {
                                        c16302.m38351(i13);
                                    }
                                }
                            }
                            if (c16302.m38352()) {
                                c16302.m38351(5);
                                if (c16302.m38352()) {
                                    c16302.m38351(7);
                                    if (c16302.m38352()) {
                                        c16302.m38351(8);
                                    }
                                }
                            }
                            i12 = 2;
                            c16302.m38351((iM38349 + 2) * 8);
                            c16302.m38344();
                        }
                        if (iM38347 < i12) {
                            if (c16302.m38352()) {
                                c16302.m38351(14);
                            }
                            if (iM38347 == 0 && c16302.m38352()) {
                                c16302.m38351(14);
                            }
                        }
                        if (c16302.m38352()) {
                            if (iM38343 == 0) {
                                c16302.m38351(5);
                            } else {
                                for (i14 = 0; i14 < i7; i14++) {
                                    if (c16302.m38352()) {
                                        c16302.m38351(5);
                                    }
                                }
                            }
                        }
                    }
                    i12 = 2;
                    if (iM38347 < i12) {
                        if (c16302.m38352()) {
                            c16302.m38351(14);
                        }
                        if (iM38347 == 0) {
                            c16302.m38351(14);
                        }
                    }
                    if (c16302.m38352()) {
                        if (iM38343 == 0) {
                            c16302.m38351(5);
                        } else {
                            while (i14 < i7) {
                                if (c16302.m38352()) {
                                    c16302.m38351(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c16302.m38352()) {
                c16302.m38351(5);
                if (iM38347 == 2) {
                    c16302.m38351(4);
                }
                if (iM38347 >= 6) {
                    c16302.m38351(2);
                }
                if (c16302.m38352()) {
                    c16302.m38351(8);
                }
                if (iM38347 == 0 && c16302.m38352()) {
                    c16302.m38351(8);
                }
                if (iM38346 < 3) {
                    c16302.m38346();
                }
            }
            if (i15 == 0 && iM38343 != 3) {
                c16302.m38346();
            }
            if (i15 == 2 && (iM38343 == 3 || c16302.m38352())) {
                i9 = 6;
                c16302.m38351(6);
            } else {
                i9 = 6;
            }
            str = (c16302.m38352() && c16302.m38343(i9) == 1 && c16302.m38343(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i18;
            i3 = i8;
            i4 = iM38345;
            i6 = i16;
            i5 = i17;
        } else {
            c16302.m38351(32);
            int iM383410 = c16302.m38343(2);
            String str2 = iM383410 == 3 ? null : "audio/ac3";
            int iM383411 = c16302.m38343(6);
            int i19 = f18094[iM383411 / 2] * 1000;
            int iM16510 = m16510(iM383410, iM383411);
            c16302.m38351(8);
            int iM383412 = c16302.m38343(3);
            if ((iM383412 & 1) == 0 || iM383412 == 1) {
                i = 2;
            } else {
                i = 2;
                c16302.m38351(2);
            }
            if ((iM383412 & 4) != 0) {
                c16302.m38351(i);
            }
            if (iM383412 == i) {
                c16302.m38351(i);
            }
            i15 = iM383410 < 3 ? iArr2[iM383410] : -1;
            i2 = iArr[iM383412] + (c16302.m38352() ? 1 : 0);
            str = str2;
            i3 = i15;
            i4 = iM16510;
            i5 = i19;
            i6 = 1536;
        }
        return new C10127(str, i2, i3, i4, i6, i5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16512(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m16510((b & 192) >> 6, b & 63);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16511(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f18095[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & UTF8.S_P3A) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16510(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f18099[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f18096[i3]) * 2;
        }
        int i5 = f18094[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
