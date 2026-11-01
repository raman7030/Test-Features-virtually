package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۤۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11971 {

    /* JADX INFO: renamed from: ֫ */
    public final int f33372;

    /* JADX INFO: renamed from: ۖ */
    public final int f33373;

    /* JADX INFO: renamed from: ۘ */
    public final int f33374;

    /* JADX INFO: renamed from: ۜ */
    public final int f33375;

    /* JADX INFO: renamed from: ۡ */
    public final int f33376;

    /* JADX INFO: renamed from: ۢ */
    public final int f33377;

    /* JADX INFO: renamed from: ۧ */
    public final int f33378;

    /* JADX INFO: renamed from: ܳ */
    public final int f33379;

    /* JADX INFO: renamed from: ܺ */
    public final int f33380;

    /* JADX INFO: renamed from: ܽ */
    public final byte[] f33381;

    /* JADX INFO: renamed from: ܿ */
    public final int f33382;

    /* JADX INFO: renamed from: ᩳ */
    public final int f33383;

    /* JADX INFO: renamed from: ᩷ */
    public final int f33384;

    /* JADX INFO: renamed from: ᩻ */
    public final int f33385;

    public C11971(byte[] bArr) throws IOException {
        if (!C15322.m34885(bArr)) {
            throw new IOException("Invalid TGA header");
        }
        this.f33381 = bArr;
        this.f33382 = bArr[0] & 255;
        this.f33376 = bArr[2] & 255;
        this.f33375 = C24040.m53282(3, bArr);
        this.f33385 = bArr[1] != 0 ? C24040.m53282(5, bArr) : 0;
        this.f33379 = bArr[7] & 255;
        short sM53282 = (short) C24040.m53282(8, bArr);
        this.f33373 = sM53282;
        short sM53283 = (short) C24040.m53282(10, bArr);
        this.f33374 = sM53283;
        int iM53282 = C24040.m53282(12, bArr);
        this.f33377 = iM53282;
        int iM53283 = C24040.m53282(14, bArr);
        this.f33384 = iM53283;
        int i = sM53282 + iM53282;
        this.f33380 = i;
        int i2 = sM53283 + iM53283;
        this.f33383 = i2;
        this.f33372 = bArr[16] & 255;
        this.f33378 = bArr[17] & 255;
        if (i <= 0 || i2 <= 0) {
            throw new IOException("Invalid TGA canvas dimensions");
        }
        if (((long) i) * ((long) i2) > 268435456 || ((long) iM53282) * ((long) iM53283) > 268435456) {
            throw new C7947("TGA dimensions exceed decode limits");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m27406(boolean z) {
        return (((long) this.f33385) * 4) + X931RNG.BLOCK64_RESEED_MAX + ((!z || this.f33376 < 9) ? 0L : ((long) this.f33384) * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27407(C11971 c11971) throws IOException {
        if (!Arrays.equals(this.f33381, c11971.f33381)) {
            throw new IOException("TGA header changed during decoding");
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public static boolean m27398(C11971 c11971) {
        return c11971.f33376 >= 9;
    }

    /* JADX INFO: renamed from: ۖ */
    public static boolean m27391(C11971 c11971) {
        int i = c11971.f33376;
        return i == 2 || i == 10;
    }

    /* JADX INFO: renamed from: ۡ */
    public static int m27393(C11971 c11971) {
        return (c11971.f33372 + 7) / 8;
    }

    /* JADX INFO: renamed from: ۢ */
    public static boolean m27394(C11971 c11971) {
        return (c11971.f33378 & 15) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m27390(C11971 c11971, int i) {
        return (c11971.f33378 & 16) == 0 ? i - c11971.f33373 : (c11971.f33377 - 1) - i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m27396(C11971 c11971, int i) {
        return (c11971.f33378 & 32) != 0 ? i - c11971.f33374 : (c11971.f33384 - 1) - i;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m27400(C11971 c11971, int i) {
        return (c11971.f33378 & 16) == 0 ? i + c11971.f33373 : (c11971.f33377 - 1) - i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m27403(C11971 c11971, int i) {
        return (c11971.f33378 & 32) != 0 ? i + c11971.f33374 : (c11971.f33384 - 1) - i;
    }
}
