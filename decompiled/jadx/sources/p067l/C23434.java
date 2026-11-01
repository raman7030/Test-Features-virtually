package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.umeng.commonsdk.stateless.C0791b;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;

/* JADX INFO: renamed from: l.᩹۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAZO */
/* JADX INFO: loaded from: classes.dex */
public final class C23434 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f74658 = {8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 26624, 10240, 10240, 10240, 10240, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 8192, 18432, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 33792, 33793, 33794, 33795, 33796, 33797, 33798, 33799, 33800, 33801, 4096, 4096, 4096, 4096, 4096, 4096, 4096, 33034, 33035, 33036, 33037, 33038, 33039, 272, 273, 274, C0791b.f3325g, 276, 277, 278, 279, 280, 281, 282, 283, 284, WhirlpoolDigest.REDUCTION_POLYNOMIAL, 286, 287, 288, 289, 290, 291, 4096, 4096, 4096, 4096, 69632, 4096, 33290, 33291, 33292, 33293, 33294, 33295, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543, 544, 545, 546, 547, 4096, 4096, 4096, 4096, 8192};

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52138(int i) {
        return (i & C0184a.f879g) == 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m52140(int i) {
        return ((57 - i) | (i + (-48))) >= 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m52142(int i) {
        return ((i + (-65)) | (90 - i)) >= 0 ? i + 32 : i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52139(int i, int i2) {
        return (((i & C0184a.f879g) == 0 ? f74658[i] : 0) & i2) != 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m52141(int i) {
        return f74658[i & 127] & 63;
    }
}
