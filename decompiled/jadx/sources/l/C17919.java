package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.stateless.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import com.umeng.commonsdk.utils.c;
import java.io.IOException;
import java.lang.reflect.Array;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;
import org.bouncycastle.math.ec.rfc8032.Scalar448;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ᩳ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X7SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C17919 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f54713 = {619, c.e, 127, 481, 931, 816, 813, 233, 566, 247, 985, 724, 205, 454, 863, 491, 741, 242, 949, 214, 733, 859, 335, 708, 621, 574, 73, 654, 730, 472, 419, 436, 278, 496, 867, 210, 399, 680, 480, 51, 878, 465, 811, 169, 869, 675, 611, 697, 867, 561, 862, 687, 507, 283, 482, 129, 807, 591, 733, 623, 150, 238, 59, 379, 684, 877, 625, 169, 643, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 170, 607, 520, 932, 727, 476, 693, 425, 174, 647, 73, 122, 335, 530, 442, 853, 695, 249, 445, 515, 909, 545, 703, 919, 874, 474, 882, 500, 594, 612, 641, 801, 220, 162, 819, 984, 589, 513, 495, 799, 161, 604, 958, 533, 221, 400, 386, 867, 600, 782, 382, 596, 414, 171, 516, 375, 682, 485, 911, 276, 98, 553, 163, 354, 666, 933, 424, 341, 533, 870, 227, 730, 475, 186, 263, 647, 537, 686, 600, BERTags.FLAGS, 469, 68, UMWorkDispatch.MSG_DELAY_PROCESS, 919, 190, 373, 294, 822, 808, 206, 184, 943, 795, MLKEMEngine.KyberPolyBytes, 383, 461, 404, 758, 839, 887, 715, 67, 618, 276, 204, 918, 873, 777, 604, 560, 951, DHParameters.DEFAULT_MINIMUM_LENGTH, 578, 722, 79, 804, 96, 409, 713, 940, 652, 934, 970, Scalar448.TARGET_LENGTH, 318, 353, 859, 672, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 785, 645, 863, 803, 350, 139, 93, 354, 99, 820, 908, 609, 772, EnumC17734.f54268, 274, 580, 184, 79, 626, 630, 742, 653, 282, 762, 623, 680, 81, 927, 626, 789, q.h, 411, 521, 938, 300, 821, 78, 343, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 128, 250, 170, 774, 972, b.g, EnumC3478.f11008, 639, 495, 78, 352, 126, 857, 956, 358, 619, 580, 124, 737, 594, 701, 612, 669, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 134, 694, 363, 992, 809, 743, 168, 974, 944, 375, 748, 52, 600, 747, 642, 182, 862, 81, HRSS1373Polynomial.M, 805, 988, 739, SecP521R1Field.P16, 655, 814, 334, 249, 515, 897, 955, 664, 981, 649, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 974, 459, 893, 228, 433, 837, 553, 268, 926, 240, IShizukuService.Stub.TRANSACTION_attachUserService, 654, 459, 51, 686, 754, 806, 760, 493, 403, 415, 394, 687, 700, 946, 670, 656, 610, 738, 392, 760, 799, 887, 653, 978, 321, 576, 617, 626, 502, 894, 679, 243, 440, 680, 879, 194, 572, 640, 724, 926, 56, 204, 700, 707, 151, 457, 449, 797, 195, 791, 558, 945, 679, 297, 59, 87, 824, 713, 663, 412, 693, 342, 606, 134, 108, 571, 364, 631, 212, 174, 643, 304, 329, 343, 97, 430, 751, 497, 314, 983, 374, 822, 928, 140, 206, 73, 263, 980, 736, 876, 478, 430, 305, 170, 514, 364, 692, 829, 82, 855, 953, 676, 246, 369, 970, 294, 750, 807, 827, 150, 790, 288, 923, 804, 378, 215, 828, 592, 281, 565, 555, 710, 82, 896, 831, 547, 261, 524, 462, 293, 465, 502, 56, 661, 821, 976, 991, 658, 869, 905, 758, 745, 193, 768, 550, 608, 933, 378, 286, 215, 979, 792, 961, 61, 688, 793, 644, 986, 403, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 366, 905, 644, 372, 567, 466, 434, 645, 210, 389, 550, 919, 135, 780, 773, 635, 389, 707, 100, 626, 958, 165, 504, 920, PicnicEngine.MAX_AUX_BYTES, 193, 713, 857, 265, 203, 50, 668, 108, 645, 990, 626, 197, 510, 357, 358, 850, 858, 364, 936, 638};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f54714;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f54716;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f54717;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final byte[] f54718;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f54719;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f54720;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f54721;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f54723;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f54725;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f54727;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f54729;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2397 f54728 = new C2397();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f54724 = new int[256];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f54726 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f54715 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f54722 = f54713[0] - 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m41907() {
        int i = this.f54729;
        int i2 = i & 255;
        this.f54729 = this.f54717[i >>> 8];
        if (this.f54720) {
            int i3 = this.f54722 - 1;
            this.f54722 = i3;
            if (i3 == 0) {
                i2 ^= 1;
                int i4 = (this.f54715 + 1) % 512;
                this.f54715 = i4;
                this.f54722 = f54713[i4];
            }
        }
        this.f54721++;
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41909() {
        while (true) {
            int i = this.f54727;
            if (i < 1) {
                if (this.f54721 == this.f54725) {
                    return -1;
                }
                int iM41907 = m41907();
                int i2 = this.f54726;
                C2397 c2397 = this.f54728;
                if (iM41907 != i2) {
                    this.f54726 = iM41907;
                    this.f54727 = 1;
                    this.f54716 = 1;
                    c2397.m7772(iM41907);
                } else {
                    int i3 = this.f54716 + 1;
                    this.f54716 = i3;
                    if (i3 == 4) {
                        int iM41908 = m41907() + 1;
                        this.f54727 = iM41908;
                        this.f54716 = 0;
                        c2397.m7773(iM41907, iM41908);
                    } else {
                        this.f54727 = 1;
                        c2397.m7772(iM41907);
                    }
                }
            } else {
                this.f54727 = i - 1;
                return this.f54726;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41908() throws C23563 {
        C2397 c2397 = this.f54728;
        if (this.f54714 != c2397.m7771()) {
            throw new C23563("BZip2 block CRC error");
        }
        return c2397.m7771();
    }

    public C17919(C1691 c1691, int i) throws IOException {
        int i2;
        byte[] bArr = new byte[256];
        this.f54718 = bArr;
        int i3 = 1;
        this.f54723 = new byte[i];
        int i4 = 16;
        this.f54714 = (c1691.m5702(16) << 16) | c1691.m5702(16);
        this.f54720 = c1691.m5703();
        int iM5702 = c1691.m5702(24);
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 6, 258);
        int iM5703 = c1691.m5702(16);
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            if (((32768 >>> i5) & iM5703) != 0) {
                int i7 = i5 << 4;
                int i8 = 0;
                while (i8 < i4) {
                    if (c1691.m5703()) {
                        bArr[i6] = (byte) i7;
                        i6++;
                    }
                    i8++;
                    i7++;
                    i4 = 16;
                }
            }
            i5++;
            i4 = 16;
        }
        int i9 = i6 + 1;
        this.f54719 = i9;
        int iM5704 = c1691.m5702(3);
        int iM5705 = c1691.m5702(15);
        if (iM5704 < 2 || iM5704 > 6 || iM5705 < 1 || iM5705 > 18001) {
            throw new C23563("BZip2 block Huffman tables invalid");
        }
        C3808 c3808 = new C3808();
        byte[] bArr3 = new byte[iM5705];
        for (int i10 = 0; i10 < iM5705; i10++) {
            bArr3[i10] = c3808.m11490(c1691.m5704());
        }
        for (int i11 = 0; i11 < iM5704; i11++) {
            int iM5706 = c1691.m5702(5);
            for (int i12 = 0; i12 <= i9; i12++) {
                while (c1691.m5703()) {
                    iM5706 += c1691.m5703() ? -1 : 1;
                }
                bArr2[i11][i12] = (byte) iM5706;
            }
        }
        C6630 c6630 = new C6630(c1691, i6 + 2, bArr2, bArr3);
        byte[] bArr4 = this.f54723;
        byte[] bArr5 = this.f54718;
        int length = bArr4.length;
        int i13 = this.f54719;
        int[] iArr = this.f54724;
        C3808 c3809 = new C3808();
        int i14 = 0;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int iM18158 = c6630.m18158();
            if (iM18158 == 0) {
                i14 += i15;
                i2 = i15 << 1;
            } else {
                if (iM18158 == i3) {
                    i2 = i15 << 1;
                    i14 += i2;
                } else {
                    if (i14 > 0) {
                        if (i16 + i14 > length) {
                            throw new C23563("BZip2 block exceeds declared block size");
                        }
                        byte b = bArr5[i17];
                        int i18 = b & 255;
                        iArr[i18] = iArr[i18] + i14;
                        while (true) {
                            i14--;
                            if (i14 < 0) {
                                break;
                            }
                            bArr4[i16] = b;
                            i16++;
                        }
                        i14 = 0;
                        i15 = 1;
                    }
                    if (iM18158 == i13) {
                        this.f54725 = i16;
                        byte[] bArr6 = this.f54723;
                        int[] iArr2 = new int[i16];
                        int[] iArr3 = new int[256];
                        if (iM5702 < 0 || iM5702 >= i16) {
                            throw new C23563("BZip2 start pointer invalid");
                        }
                        System.arraycopy(this.f54724, 0, iArr3, 1, 255);
                        for (int i19 = 2; i19 <= 255; i19++) {
                            iArr3[i19] = iArr3[i19] + iArr3[i19 - 1];
                        }
                        for (int i20 = 0; i20 < this.f54725; i20++) {
                            int i21 = bArr6[i20] & 255;
                            int i22 = iArr3[i21];
                            iArr3[i21] = i22 + 1;
                            iArr2[i22] = (i20 << 8) + i21;
                        }
                        this.f54723 = null;
                        this.f54717 = iArr2;
                        this.f54729 = iArr2[iM5702];
                        return;
                    }
                    if (i16 >= length) {
                        throw new C23563("BZip2 block exceeds declared block size");
                    }
                    int iM11490 = c3809.m11490(iM18158 - 1) & 255;
                    byte b2 = bArr5[iM11490];
                    int i23 = b2 & 255;
                    iArr[i23] = iArr[i23] + 1;
                    bArr4[i16] = b2;
                    i17 = iM11490;
                    i16++;
                }
                i3 = 1;
            }
            i15 = i2;
            i3 = 1;
        }
    }
}
