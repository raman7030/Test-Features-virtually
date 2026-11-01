package p067l;

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
public final class C7969 {

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f20950 = {1, 2, 3, 6};

    /* JADX INFO: renamed from: ᩳ */
    public static final int[] f20954 = {48000, 44100, 32000};

    /* JADX INFO: renamed from: ܿ */
    public static final int[] f20953 = {24000, 22050, 16000};

    /* JADX INFO: renamed from: ܽ */
    public static final int[] f20952 = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f20949 = {32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes, 448, 512, 576, 640};

    /* JADX INFO: renamed from: ܳ */
    public static final int[] f20951 = {69, 87, IShizukuService.Stub.TRANSACTION_isHidden, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: ֫ */
    public static C10307 m18439(C19203 c19203, String str, String str2, C21037 c21037) {
        C17861 c17861 = new C17861();
        c17861.m40557(c19203);
        int i = f20954[c17861.m40558(2)];
        c17861.m40566(8);
        int i2 = f20952[c17861.m40558(3)];
        if (c17861.m40558(1) != 0) {
            i2++;
        }
        int i3 = f20949[c17861.m40558(5)] * 1000;
        c17861.m40559();
        c19203.m43730(c17861.m40563());
        C3601 c3601 = new C3601();
        c3601.m6701(str);
        c3601.m6697("audio/ac3");
        c3601.m6704(i2);
        c3601.m6688(i);
        c3601.m6679(c21037);
        c3601.m6703(str2);
        c3601.m6700(i3);
        c3601.m6670(i3);
        return c3601.m6672();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX INFO: renamed from: ۧ */
    public static C10307 m18441(C19203 c19203, String str, String str2, C21037 c21037) {
        String str3;
        C17861 c17861 = new C17861();
        c17861.m40557(c19203);
        int iM40558 = c17861.m40558(13) * 1000;
        c17861.m40566(3);
        int i = f20954[c17861.m40558(2)];
        c17861.m40566(10);
        int i2 = f20952[c17861.m40558(3)];
        if (c17861.m40558(1) != 0) {
            i2++;
        }
        c17861.m40566(3);
        int iM40559 = c17861.m40558(4);
        c17861.m40566(1);
        if (iM40559 > 0) {
            c17861.m40566(6);
            if (c17861.m40558(1) != 0) {
                i2 += 2;
            }
            c17861.m40566(1);
        }
        if (c17861.m40554() > 7) {
            c17861.m40566(7);
            if (c17861.m40558(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        c17861.m40559();
        c19203.m43730(c17861.m40563());
        C3601 c3601 = new C3601();
        c3601.m6701(str);
        c3601.m6697(str3);
        c3601.m6704(i2);
        c3601.m6688(i);
        c3601.m6679(c21037);
        c3601.m6703(str2);
        c3601.m6670(iM40558);
        return c3601.m6672();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0193  */
    /* JADX WARN: Code duplicated, block: B:110:0x019b  */
    /* JADX WARN: Code duplicated, block: B:117:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01be  */
    /* JADX WARN: Code duplicated, block: B:182:0x01c1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static C11993 m18440(C17861 c17861) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM40558;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM40568 = c17861.m40568();
        c17861.m40566(40);
        boolean z = c17861.m40558(5) > 10;
        c17861.m40569(iM40568);
        int[] iArr = f20952;
        int[] iArr2 = f20954;
        int i15 = -1;
        if (z) {
            c17861.m40566(16);
            int iM40559 = c17861.m40558(2);
            if (iM40559 == 0) {
                i15 = 0;
            } else if (iM40559 == 1) {
                i15 = 1;
            } else if (iM40559 == 2) {
                i15 = 2;
            }
            c17861.m40566(3);
            int iM405510 = (c17861.m40558(11) + 1) * 2;
            int iM405511 = c17861.m40558(2);
            if (iM405511 == 3) {
                i8 = f20953[c17861.m40558(2)];
                i7 = 6;
                iM40558 = 3;
            } else {
                iM40558 = c17861.m40558(2);
                i7 = f20950[iM40558];
                i8 = iArr2[iM405511];
            }
            int i16 = i7 * 256;
            int i17 = (iM405510 * i8) / (i7 * 32);
            int iM405512 = c17861.m40558(3);
            boolean zM40567 = c17861.m40567();
            int i18 = iArr[iM405512] + (zM40567 ? 1 : 0);
            c17861.m40566(10);
            if (c17861.m40567()) {
                c17861.m40566(8);
            }
            if (iM405512 == 0) {
                c17861.m40566(5);
                if (c17861.m40567()) {
                    c17861.m40566(8);
                }
            }
            if (i15 == 1 && c17861.m40567()) {
                c17861.m40566(16);
            }
            if (c17861.m40567()) {
                if (iM405512 > 2) {
                    c17861.m40566(2);
                }
                if ((iM405512 & 1) == 0 || iM405512 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    c17861.m40566(6);
                }
                if ((iM405512 & 4) != 0) {
                    c17861.m40566(i10);
                }
                if (zM40567 && c17861.m40567()) {
                    c17861.m40566(5);
                }
                if (i15 == 0) {
                    if (c17861.m40567()) {
                        i11 = 6;
                        c17861.m40566(6);
                    } else {
                        i11 = 6;
                    }
                    if (iM405512 == 0 && c17861.m40567()) {
                        c17861.m40566(i11);
                    }
                    if (c17861.m40567()) {
                        c17861.m40566(i11);
                    }
                    int iM405513 = c17861.m40558(2);
                    if (iM405513 == 1) {
                        c17861.m40566(5);
                    } else if (iM405513 == 2) {
                        c17861.m40566(12);
                    } else {
                        if (iM405513 == 3) {
                            int iM405514 = c17861.m40558(5);
                            if (c17861.m40567()) {
                                c17861.m40566(5);
                                if (c17861.m40567()) {
                                    i13 = 4;
                                    c17861.m40566(4);
                                } else {
                                    i13 = 4;
                                }
                                if (c17861.m40567()) {
                                    c17861.m40566(i13);
                                }
                                if (c17861.m40567()) {
                                    c17861.m40566(i13);
                                }
                                if (c17861.m40567()) {
                                    c17861.m40566(i13);
                                }
                                if (c17861.m40567()) {
                                    c17861.m40566(i13);
                                }
                                if (c17861.m40567()) {
                                    c17861.m40566(i13);
                                }
                                if (c17861.m40567()) {
                                    c17861.m40566(i13);
                                }
                                if (c17861.m40567()) {
                                    if (c17861.m40567()) {
                                        c17861.m40566(i13);
                                    }
                                    if (c17861.m40567()) {
                                        c17861.m40566(i13);
                                    }
                                }
                            }
                            if (c17861.m40567()) {
                                c17861.m40566(5);
                                if (c17861.m40567()) {
                                    c17861.m40566(7);
                                    if (c17861.m40567()) {
                                        c17861.m40566(8);
                                    }
                                }
                            }
                            i12 = 2;
                            c17861.m40566((iM405514 + 2) * 8);
                            c17861.m40559();
                        }
                        if (iM405512 < i12) {
                            if (c17861.m40567()) {
                                c17861.m40566(14);
                            }
                            if (iM405512 == 0 && c17861.m40567()) {
                                c17861.m40566(14);
                            }
                        }
                        if (c17861.m40567()) {
                            if (iM40558 == 0) {
                                c17861.m40566(5);
                            } else {
                                for (i14 = 0; i14 < i7; i14++) {
                                    if (c17861.m40567()) {
                                        c17861.m40566(5);
                                    }
                                }
                            }
                        }
                    }
                    i12 = 2;
                    if (iM405512 < i12) {
                        if (c17861.m40567()) {
                            c17861.m40566(14);
                        }
                        if (iM405512 == 0) {
                            c17861.m40566(14);
                        }
                    }
                    if (c17861.m40567()) {
                        if (iM40558 == 0) {
                            c17861.m40566(5);
                        } else {
                            while (i14 < i7) {
                                if (c17861.m40567()) {
                                    c17861.m40566(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c17861.m40567()) {
                c17861.m40566(5);
                if (iM405512 == 2) {
                    c17861.m40566(4);
                }
                if (iM405512 >= 6) {
                    c17861.m40566(2);
                }
                if (c17861.m40567()) {
                    c17861.m40566(8);
                }
                if (iM405512 == 0 && c17861.m40567()) {
                    c17861.m40566(8);
                }
                if (iM405511 < 3) {
                    c17861.m40561();
                }
            }
            if (i15 == 0 && iM40558 != 3) {
                c17861.m40561();
            }
            if (i15 == 2 && (iM40558 == 3 || c17861.m40567())) {
                i9 = 6;
                c17861.m40566(6);
            } else {
                i9 = 6;
            }
            str = (c17861.m40567() && c17861.m40558(i9) == 1 && c17861.m40558(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i18;
            i3 = i8;
            i4 = iM405510;
            i6 = i16;
            i5 = i17;
        } else {
            c17861.m40566(32);
            int iM405515 = c17861.m40558(2);
            String str2 = iM405515 == 3 ? null : "audio/ac3";
            int iM405516 = c17861.m40558(6);
            int i19 = f20949[iM405516 / 2] * 1000;
            int iM18436 = m18436(iM405515, iM405516);
            c17861.m40566(8);
            int iM405517 = c17861.m40558(3);
            if ((iM405517 & 1) == 0 || iM405517 == 1) {
                i = 2;
            } else {
                i = 2;
                c17861.m40566(2);
            }
            if ((iM405517 & 4) != 0) {
                c17861.m40566(i);
            }
            if (iM405517 == i) {
                c17861.m40566(i);
            }
            i15 = iM405515 < 3 ? iArr2[iM405515] : -1;
            i2 = iArr[iM405517] + (c17861.m40567() ? 1 : 0);
            str = str2;
            i3 = i15;
            i4 = iM18436;
            i5 = i19;
            i6 = 1536;
        }
        return new C11993(str, i2, i3, i4, i6, i5);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18438(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m18436((b & 192) >> 6, b & 63);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18437(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f20950[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & UTF8.S_P3A) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18436(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f20954[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f20951[i3]) * 2;
        }
        int i5 = f20949[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
