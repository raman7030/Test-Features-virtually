package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۚ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88T8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5602 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f17336 = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f17340 = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f17342 = {64, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 192, BERTags.FLAGS, 256, MLKEMEngine.KyberPolyBytes, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f17338 = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f17344 = {5, 8, 10, 12};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f17343 = {6, 9, 12, 15};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f17341 = {2, 4, 6, 8};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f17339 = {9, 11, 13, 16};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int[] f17337 = {5, 8, 10, 12};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8353 m15894(int i, String str, String str2, String str3, byte[] bArr) {
        C16302 c16302M15895 = m15895(bArr);
        c16302M15895.m38351(60);
        int i2 = f17336[c16302M15895.m38343(6)];
        int i3 = f17340[c16302M15895.m38343(4)];
        int iM38343 = c16302M15895.m38343(5);
        int i4 = iM38343 >= 29 ? -1 : (f17342[iM38343] * 1000) / 2;
        c16302M15895.m38351(10);
        int i5 = i2 + (c16302M15895.m38343(2) > 0 ? 1 : 0);
        C1297 c1297 = new C1297();
        c1297.m4469(str);
        c1297.m4462(str3);
        c1297.m4465("audio/vnd.dts");
        c1297.m4468(i4);
        c1297.m4472(i5);
        c1297.m4456(i3);
        c1297.m4447((C19643) null);
        c1297.m4471(str2);
        c1297.m4454(i);
        return c1297.m4440();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C0662 m15896(byte[] bArr) throws C9080 {
        int i;
        int i2;
        int iM38343;
        int iM38344;
        int i3;
        long jM11017;
        int i4;
        C16302 c16302M15895 = m15895(bArr);
        c16302M15895.m38351(40);
        int iM38345 = c16302M15895.m38343(2);
        if (c16302M15895.m38352()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        c16302M15895.m38351(i2);
        int iM38346 = c16302M15895.m38343(i) + 1;
        boolean zM38352 = c16302M15895.m38352();
        int i5 = 0;
        if (zM38352) {
            iM38343 = c16302M15895.m38343(2);
            int iM38347 = (c16302M15895.m38343(3) + 1) * 512;
            if (c16302M15895.m38352()) {
                c16302M15895.m38351(36);
            }
            int iM38348 = c16302M15895.m38343(3) + 1;
            int iM38349 = c16302M15895.m38343(3) + 1;
            if (iM38348 != 1 || iM38349 != 1) {
                throw C9080.m23441("Multiple audio presentations or assets not supported");
            }
            int i6 = iM38345 + 1;
            int iM383410 = c16302M15895.m38343(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (((iM383410 >> i7) & 1) == 1) {
                    c16302M15895.m38351(8);
                }
            }
            if (c16302M15895.m38352()) {
                c16302M15895.m38351(2);
                int iM383411 = (c16302M15895.m38343(2) + 1) << 2;
                int iM383412 = c16302M15895.m38343(2) + 1;
                while (i5 < iM383412) {
                    c16302M15895.m38351(iM383411);
                    i5++;
                }
            }
            i5 = iM38347;
        } else {
            iM38343 = -1;
        }
        c16302M15895.m38351(i);
        c16302M15895.m38351(12);
        if (zM38352) {
            if (c16302M15895.m38352()) {
                c16302M15895.m38351(4);
            }
            if (c16302M15895.m38352()) {
                c16302M15895.m38351(24);
            }
            if (c16302M15895.m38352()) {
                c16302M15895.m38347(c16302M15895.m38343(10) + 1);
            }
            c16302M15895.m38351(5);
            i3 = f17338[c16302M15895.m38343(4)];
            iM38344 = c16302M15895.m38343(8) + 1;
        } else {
            iM38344 = -1;
            i3 = SecP160R1Field.PInv;
        }
        if (zM38352) {
            if (iM38343 == 0) {
                i4 = 32000;
            } else if (iM38343 == 1) {
                i4 = 44100;
            } else {
                if (iM38343 != 2) {
                    throw C9080.m23440("Unsupported reference clock code in DTS HD header: " + iM38343, (Throwable) null);
                }
                i4 = 48000;
            }
            long j = i4;
            String str = C3603.f11424;
            jM11017 = C3603.m11017(i5, 1000000L, j, RoundingMode.DOWN);
        } else {
            jM11017 = -9223372036854775807L;
        }
        return new C0662(iM38344, i3, iM38346, jM11017, "audio/vnd.dts.hd;profile=lbr");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m15897(byte[] bArr) {
        C16302 c16302M15895 = m15895(bArr);
        c16302M15895.m38351(42);
        return c16302M15895.m38343(c16302M15895.m38352() ? 12 : 8) + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0662 m15893(byte[] bArr, AtomicInteger atomicInteger) throws C9080 {
        long jM11017;
        int iM38343;
        int i;
        int i2;
        C16302 c16302M15895 = m15895(bArr);
        int i3 = c16302M15895.m38343(32) == 1078008818 ? 1 : 0;
        int iM15892 = m15892(c16302M15895, f17344);
        int i4 = iM15892 + 1;
        if (i3 == 0) {
            jM11017 = -9223372036854775807L;
            iM38343 = SecP160R1Field.PInv;
        } else {
            if (!c16302M15895.m38352()) {
                throw C9080.m23441("Only supports full channel mask-based audio presentation");
            }
            int i5 = iM15892 - 1;
            if (((bArr[iM15892] & 255) | ((bArr[i5] << 8) & 65535)) == C3603.m11004(i5, bArr)) {
                int iM38344 = c16302M15895.m38343(2);
                if (iM38344 == 0) {
                    i = 512;
                } else if (iM38344 == 1) {
                    i = 480;
                } else {
                    if (iM38344 != 2) {
                        throw C9080.m23440("Unsupported base duration index in DTS UHD header: " + iM38344, (Throwable) null);
                    }
                    i = MLKEMEngine.KyberPolyBytes;
                }
                int iM38345 = (c16302M15895.m38343(3) + 1) * i;
                int iM38346 = c16302M15895.m38343(2);
                if (iM38346 == 0) {
                    i2 = 32000;
                } else if (iM38346 == 1) {
                    i2 = 44100;
                } else {
                    if (iM38346 != 2) {
                        throw C9080.m23440("Unsupported clock rate index in DTS UHD header: " + iM38346, (Throwable) null);
                    }
                    i2 = 48000;
                }
                if (c16302M15895.m38352()) {
                    c16302M15895.m38351(36);
                }
                iM38343 = (1 << c16302M15895.m38343(2)) * i2;
                jM11017 = C3603.m11017(iM38345, 1000000L, i2, RoundingMode.DOWN);
            } else {
                throw C9080.m23440("CRC check failed", (Throwable) null);
            }
        }
        int iM15893 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            iM15893 += m15892(c16302M15895, f17343);
        }
        if (i3 != 0) {
            atomicInteger.set(m15892(c16302M15895, f17341));
        }
        return new C0662(2, iM38343, iM15893 + (atomicInteger.get() != 0 ? m15892(c16302M15895, f17339) : 0) + i4, jM11017, "audio/vnd.dts.uhd;profile=p2");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m15898(byte[] bArr) {
        C16302 c16302M15895 = m15895(bArr);
        c16302M15895.m38351(32);
        return m15892(c16302M15895, f17337) + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15892(C16302 c16302, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c16302.m38352(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c16302.m38343(iArr[i]) + i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16302 m15895(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new C16302(bArr, bArr.length);
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
        C16302 c16302 = new C16302(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C16302 c16303 = new C16302(bArrCopyOf, bArrCopyOf.length);
            while (c16303.m38339() >= 16) {
                c16303.m38351(2);
                c16302.m38340(c16303.m38343(14));
            }
        }
        c16302.m38350(bArrCopyOf.length, bArrCopyOf);
        return c16302;
    }
}
