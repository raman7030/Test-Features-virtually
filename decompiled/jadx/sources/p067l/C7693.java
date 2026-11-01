package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.p080ec.custom.sec.SecP160R1Field;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۚ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88T8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7693 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f20180 = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: ܽ */
    public static final int[] f20184 = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: ᩳ */
    public static final int[] f20186 = {64, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 192, BERTags.FLAGS, 256, MLKEMEngine.KyberPolyBytes, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f20182 = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: ᩻ */
    public static final int[] f20188 = {5, 8, 10, 12};

    /* JADX INFO: renamed from: ᩷ */
    public static final int[] f20187 = {6, 9, 12, 15};

    /* JADX INFO: renamed from: ܿ */
    public static final int[] f20185 = {2, 4, 6, 8};

    /* JADX INFO: renamed from: ܳ */
    public static final int[] f20183 = {9, 11, 13, 16};

    /* JADX INFO: renamed from: ۜ */
    public static final int[] f20181 = {5, 8, 10, 12};

    /* JADX INFO: renamed from: ֫ */
    public static C10307 m17815(int i, String str, String str2, String str3, byte[] bArr) {
        C17861 c17861M17816 = m17816(bArr);
        c17861M17816.m40566(60);
        int i2 = f20180[c17861M17816.m40558(6)];
        int i3 = f20184[c17861M17816.m40558(4)];
        int iM40558 = c17861M17816.m40558(5);
        int i4 = iM40558 >= 29 ? -1 : (f20186[iM40558] * 1000) / 2;
        c17861M17816.m40566(10);
        int i5 = i2 + (c17861M17816.m40558(2) > 0 ? 1 : 0);
        C3601 c3601 = new C3601();
        c3601.m6701(str);
        c3601.m6694(str3);
        c3601.m6697("audio/vnd.dts");
        c3601.m6700(i4);
        c3601.m6704(i5);
        c3601.m6688(i3);
        c3601.m6679((C21037) null);
        c3601.m6703(str2);
        c3601.m6686(i);
        return c3601.m6672();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C2998 m17817(byte[] bArr) throws C10998 {
        int i;
        int i2;
        int iM40558;
        int iM40559;
        int i3;
        long jM12993;
        int i4;
        C17861 c17861M17816 = m17816(bArr);
        c17861M17816.m40566(40);
        int iM405510 = c17861M17816.m40558(2);
        if (c17861M17816.m40567()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        c17861M17816.m40566(i2);
        int iM405511 = c17861M17816.m40558(i) + 1;
        boolean zM40567 = c17861M17816.m40567();
        int i5 = 0;
        if (zM40567) {
            iM40558 = c17861M17816.m40558(2);
            int iM405512 = (c17861M17816.m40558(3) + 1) * 512;
            if (c17861M17816.m40567()) {
                c17861M17816.m40566(36);
            }
            int iM405513 = c17861M17816.m40558(3) + 1;
            int iM405514 = c17861M17816.m40558(3) + 1;
            if (iM405513 != 1 || iM405514 != 1) {
                throw C10998.m25388("Multiple audio presentations or assets not supported");
            }
            int i6 = iM405510 + 1;
            int iM405515 = c17861M17816.m40558(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (((iM405515 >> i7) & 1) == 1) {
                    c17861M17816.m40566(8);
                }
            }
            if (c17861M17816.m40567()) {
                c17861M17816.m40566(2);
                int iM405516 = (c17861M17816.m40558(2) + 1) << 2;
                int iM405517 = c17861M17816.m40558(2) + 1;
                while (i5 < iM405517) {
                    c17861M17816.m40566(iM405516);
                    i5++;
                }
            }
            i5 = iM405512;
        } else {
            iM40558 = -1;
        }
        c17861M17816.m40566(i);
        c17861M17816.m40566(12);
        if (zM40567) {
            if (c17861M17816.m40567()) {
                c17861M17816.m40566(4);
            }
            if (c17861M17816.m40567()) {
                c17861M17816.m40566(24);
            }
            if (c17861M17816.m40567()) {
                c17861M17816.m40562(c17861M17816.m40558(10) + 1);
            }
            c17861M17816.m40566(5);
            i3 = f20182[c17861M17816.m40558(4)];
            iM40559 = c17861M17816.m40558(8) + 1;
        } else {
            iM40559 = -1;
            i3 = SecP160R1Field.PInv;
        }
        if (zM40567) {
            if (iM40558 == 0) {
                i4 = 32000;
            } else if (iM40558 == 1) {
                i4 = 44100;
            } else {
                if (iM40558 != 2) {
                    throw C10998.m25387("Unsupported reference clock code in DTS HD header: " + iM40558, (Throwable) null);
                }
                i4 = 48000;
            }
            long j = i4;
            String str = C5792.f14228;
            jM12993 = C5792.m12993(i5, 1000000L, j, RoundingMode.DOWN);
        } else {
            jM12993 = -9223372036854775807L;
        }
        return new C2998(iM40559, i3, iM405511, jM12993, "audio/vnd.dts.hd;profile=lbr");
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m17818(byte[] bArr) {
        C17861 c17861M17816 = m17816(bArr);
        c17861M17816.m40566(42);
        return c17861M17816.m40558(c17861M17816.m40567() ? 12 : 8) + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2998 m17814(byte[] bArr, AtomicInteger atomicInteger) throws C10998 {
        long jM12993;
        int iM40558;
        int i;
        int i2;
        C17861 c17861M17816 = m17816(bArr);
        int i3 = c17861M17816.m40558(32) == 1078008818 ? 1 : 0;
        int iM17813 = m17813(c17861M17816, f20188);
        int i4 = iM17813 + 1;
        if (i3 == 0) {
            jM12993 = -9223372036854775807L;
            iM40558 = SecP160R1Field.PInv;
        } else {
            if (!c17861M17816.m40567()) {
                throw C10998.m25388("Only supports full channel mask-based audio presentation");
            }
            int i5 = iM17813 - 1;
            if (((bArr[iM17813] & 255) | ((bArr[i5] << 8) & 65535)) == C5792.m12980(i5, bArr)) {
                int iM40559 = c17861M17816.m40558(2);
                if (iM40559 == 0) {
                    i = 512;
                } else if (iM40559 == 1) {
                    i = 480;
                } else {
                    if (iM40559 != 2) {
                        throw C10998.m25387("Unsupported base duration index in DTS UHD header: " + iM40559, (Throwable) null);
                    }
                    i = MLKEMEngine.KyberPolyBytes;
                }
                int iM405510 = (c17861M17816.m40558(3) + 1) * i;
                int iM405511 = c17861M17816.m40558(2);
                if (iM405511 == 0) {
                    i2 = 32000;
                } else if (iM405511 == 1) {
                    i2 = 44100;
                } else {
                    if (iM405511 != 2) {
                        throw C10998.m25387("Unsupported clock rate index in DTS UHD header: " + iM405511, (Throwable) null);
                    }
                    i2 = 48000;
                }
                if (c17861M17816.m40567()) {
                    c17861M17816.m40566(36);
                }
                iM40558 = (1 << c17861M17816.m40558(2)) * i2;
                jM12993 = C5792.m12993(iM405510, 1000000L, i2, RoundingMode.DOWN);
            } else {
                throw C10998.m25387("CRC check failed", (Throwable) null);
            }
        }
        int iM17814 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            iM17814 += m17813(c17861M17816, f20187);
        }
        if (i3 != 0) {
            atomicInteger.set(m17813(c17861M17816, f20185));
        }
        return new C2998(2, iM40558, iM17814 + (atomicInteger.get() != 0 ? m17813(c17861M17816, f20183) : 0) + i4, jM12993, "audio/vnd.dts.uhd;profile=p2");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m17819(byte[] bArr) {
        C17861 c17861M17816 = m17816(bArr);
        c17861M17816.m40566(32);
        return m17813(c17861M17816, f20181) + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m17813(C17861 c17861, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c17861.m40567(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c17861.m40558(iArr[i]) + i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17861 m17816(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new C17861(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        C17861 c17861 = new C17861(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C17861 c17862 = new C17861(bArrCopyOf, bArrCopyOf.length);
            while (c17862.m40554() >= 16) {
                c17862.m40566(2);
                c17861.m40555(c17862.m40558(14));
            }
        }
        c17861.m40565(bArrCopyOf.length, bArrCopyOf);
        return c17861;
    }
}
