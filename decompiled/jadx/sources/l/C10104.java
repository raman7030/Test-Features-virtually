package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۤۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10104 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30413;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f30414;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f30415;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f30416;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f30417;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f30418;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30419;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f30420;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f30421;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f30422;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f30423;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f30424;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f30425;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f30426;

    public C10104(byte[] bArr) throws IOException {
        if (!C13630.m32770(bArr)) {
            throw new IOException("Invalid TGA header");
        }
        this.f30422 = bArr;
        this.f30423 = bArr[0] & 255;
        this.f30417 = bArr[2] & 255;
        this.f30416 = C22803.m50892(3, bArr);
        this.f30426 = bArr[1] != 0 ? C22803.m50892(5, bArr) : 0;
        this.f30420 = bArr[7] & 255;
        short sM50892 = (short) C22803.m50892(8, bArr);
        this.f30414 = sM50892;
        short sM50893 = (short) C22803.m50892(10, bArr);
        this.f30415 = sM50893;
        int iM50892 = C22803.m50892(12, bArr);
        this.f30418 = iM50892;
        int iM50893 = C22803.m50892(14, bArr);
        this.f30425 = iM50893;
        int i = sM50892 + iM50892;
        this.f30421 = i;
        int i2 = sM50893 + iM50893;
        this.f30424 = i2;
        this.f30413 = bArr[16] & 255;
        this.f30419 = bArr[17] & 255;
        if (i <= 0 || i2 <= 0) {
            throw new IOException("Invalid TGA canvas dimensions");
        }
        if (((long) i) * ((long) i2) > 268435456 || ((long) iM50892) * ((long) iM50893) > 268435456) {
            throw new C5870("TGA dimensions exceed decode limits");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m25387(boolean z) {
        return (((long) this.f30426) * 4) + X931RNG.BLOCK64_RESEED_MAX + ((!z || this.f30417 < 9) ? 0L : ((long) this.f30425) * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25388(C10104 c10104) throws IOException {
        if (!Arrays.equals(this.f30422, c10104.f30422)) {
            throw new IOException("TGA header changed during decoding");
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m25379(C10104 c10104) {
        return c10104.f30417 >= 9;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m25372(C10104 c10104) {
        int i = c10104.f30417;
        return i == 2 || i == 10;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int m25374(C10104 c10104) {
        return (c10104.f30413 + 7) / 8;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m25375(C10104 c10104) {
        return (c10104.f30419 & 15) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25371(C10104 c10104, int i) {
        return (c10104.f30419 & 16) == 0 ? i - c10104.f30414 : (c10104.f30418 - 1) - i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m25377(C10104 c10104, int i) {
        return (c10104.f30419 & 32) != 0 ? i - c10104.f30415 : (c10104.f30425 - 1) - i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m25381(C10104 c10104, int i) {
        return (c10104.f30419 & 16) == 0 ? i + c10104.f30414 : (c10104.f30418 - 1) - i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m25384(C10104 c10104, int i) {
        return (c10104.f30419 & 32) != 0 ? i + c10104.f30415 : (c10104.f30425 - 1) - i;
    }
}
