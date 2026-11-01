package org.bouncycastle.pqc.crypto.falcon;

import com.google.android.material.color.ColorResourcesTableCreator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;
import p067l.C10050;
import p067l.C14849;
import p067l.C22934;
import p067l.C6316;

/* JADX INFO: loaded from: classes2.dex */
public class FalconKeyGen {
    public static final int DEPTH_INT_FG = 4;
    public static final short[] REV10 = {0, ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, 256, 768, 128, 640, 384, 896, 64, 576, 320, 832, 192, 704, 448, 960, 32, 544, ColorResourcesTableCreator.PackageChunk.HEADER_SIZE, 800, 160, 672, 416, 928, 96, 608, 352, 864, 224, 736, 480, 992, 16, 528, 272, 784, 144, 656, 400, 912, 80, 592, 336, 848, 208, 720, 464, 976, 48, 560, 304, 816, 176, 688, 432, 944, 112, 624, 368, 880, 240, 752, 496, 1008, 8, 520, 264, 776, 136, 648, 392, 904, 72, 584, 328, 840, 200, 712, 456, 968, 40, 552, 296, 808, 168, 680, 424, 936, 104, 616, 360, 872, 232, 744, 488, 1000, 24, 536, 280, 792, 152, 664, 408, 920, 88, 600, 344, 856, 216, 728, 472, 984, 56, 568, 312, 824, 184, 696, 440, 952, 120, 632, 376, 888, 248, 760, 504, 1016, 4, 516, 260, 772, 132, 644, 388, 900, 68, 580, 324, 836, 196, 708, 452, 964, 36, 548, 292, 804, 164, 676, 420, 932, 100, 612, 356, 868, 228, 740, 484, 996, 20, 532, 276, 788, 148, 660, 404, 916, 84, 596, 340, 852, 212, 724, 468, 980, 52, 564, 308, 820, 180, 692, 436, 948, 116, 628, 372, 884, 244, 756, 500, 1012, 12, 524, 268, 780, 140, 652, 396, 908, 76, 588, 332, 844, 204, 716, 460, 972, 44, 556, 300, 812, 172, 684, 428, 940, 108, 620, 364, 876, 236, 748, 492, 1004, 28, 540, 284, 796, 156, 668, 412, 924, 92, 604, 348, 860, 220, 732, 476, 988, 60, 572, 316, 828, 188, 700, 444, 956, 124, 636, 380, 892, 252, 764, 508, 1020, 2, ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC, 258, 770, 130, 642, 386, 898, 66, 578, 322, 834, 194, 706, 450, 962, 34, 546, 290, 802, 162, 674, 418, 930, 98, 610, 354, 866, 226, 738, 482, 994, 18, 530, 274, 786, 146, 658, 402, 914, 82, 594, 338, 850, 210, 722, 466, 978, 50, 562, 306, 818, 178, 690, 434, 946, 114, 626, 370, 882, 242, 754, 498, 1010, 10, 522, 266, 778, 138, 650, 394, 906, 74, 586, 330, 842, 202, 714, 458, 970, 42, 554, 298, 810, 170, 682, 426, 938, 106, 618, 362, 874, 234, 746, 490, 1002, 26, 538, 282, 794, 154, 666, 410, 922, 90, 602, 346, 858, 218, 730, 474, 986, 58, 570, 314, 826, 186, 698, 442, 954, 122, 634, 378, 890, 250, 762, 506, 1018, 6, 518, 262, 774, 134, 646, 390, 902, 70, 582, 326, 838, 198, 710, 454, 966, 38, 550, 294, 806, 166, 678, 422, 934, 102, 614, 358, 870, 230, 742, 486, 998, 22, 534, 278, 790, 150, 662, 406, 918, 86, 598, 342, 854, 214, 726, 470, 982, 54, 566, 310, 822, 182, 694, 438, 950, 118, 630, 374, 886, 246, 758, 502, 1014, 14, 526, 270, 782, 142, 654, 398, 910, 78, 590, 334, 846, 206, 718, 462, 974, 46, 558, 302, 814, 174, 686, 430, 942, 110, 622, 366, 878, 238, 750, 494, 1006, 30, 542, 286, 798, 158, 670, 414, 926, 94, 606, 350, 862, 222, 734, 478, 990, 62, 574, 318, 830, 190, 702, 446, 958, 126, 638, 382, 894, 254, 766, 510, 1022, 1, ColorResourcesTableCreator.HEADER_TYPE_TYPE, 257, 769, 129, 641, 385, 897, 65, 577, 321, 833, 193, 705, 449, 961, 33, 545, 289, 801, 161, 673, 417, 929, 97, 609, 353, 865, 225, 737, 481, 993, 17, 529, 273, 785, 145, 657, 401, 913, 81, 593, 337, 849, 209, 721, 465, 977, 49, 561, 305, 817, 177, 689, 433, 945, 113, 625, 369, 881, 241, 753, 497, 1009, 9, 521, 265, 777, 137, 649, 393, 905, 73, 585, 329, 841, 201, 713, 457, 969, 41, 553, 297, 809, 169, 681, 425, 937, 105, 617, 361, 873, 233, 745, 489, 1001, 25, 537, 281, 793, 153, 665, 409, 921, 89, 601, 345, 857, 217, 729, 473, 985, 57, 569, 313, 825, 185, 697, 441, 953, 121, 633, 377, 889, 249, 761, 505, 1017, 5, 517, 261, 773, 133, 645, 389, 901, 69, 581, 325, 837, 197, 709, 453, 965, 37, 549, 293, 805, 165, 677, 421, 933, 101, 613, 357, 869, 229, 741, 485, 997, 21, 533, 277, 789, 149, 661, 405, 917, 85, 597, 341, 853, 213, 725, 469, 981, 53, 565, 309, 821, 181, 693, 437, 949, 117, 629, 373, 885, 245, 757, 501, 1013, 13, 525, 269, 781, 141, 653, 397, 909, 77, 589, 333, 845, 205, 717, 461, 973, 45, 557, 301, 813, 173, 685, 429, 941, 109, 621, 365, 877, 237, 749, 493, 1005, 29, 541, 285, 797, 157, 669, 413, 925, 93, 605, 349, 861, 221, 733, 477, 989, 61, 573, 317, 829, 189, 701, 445, 957, 125, 637, 381, 893, 253, 765, 509, 1021, 3, 515, 259, 771, 131, 643, 387, 899, 67, 579, 323, 835, 195, 707, 451, 963, 35, 547, 291, 803, 163, 675, 419, 931, 99, 611, 355, 867, 227, 739, 483, 995, 19, 531, 275, 787, 147, 659, 403, 915, 83, 595, 339, 851, 211, 723, 467, 979, 51, 563, 307, 819, 179, 691, 435, 947, 115, 627, 371, 883, 243, 755, 499, 1011, 11, 523, 267, 779, 139, 651, 395, 907, 75, 587, 331, 843, 203, 715, 459, 971, 43, 555, 299, 811, 171, 683, 427, 939, 107, 619, 363, 875, 235, 747, 491, 1003, 27, 539, 283, 795, 155, 667, 411, 923, 91, 603, 347, 859, 219, 731, 475, 987, 59, 571, 315, 827, 187, 699, 443, 955, 123, 635, 379, 891, 251, 763, 507, 1019, 7, 519, 263, 775, 135, 647, 391, 903, 71, 583, 327, 839, 199, 711, 455, 967, 39, 551, 295, 807, 167, 679, 423, 935, 103, 615, 359, 871, 231, 743, 487, 999, 23, 535, 279, 791, 151, 663, 407, 919, 87, 599, 343, 855, 215, 727, 471, 983, 55, 567, 311, 823, 183, 695, 439, 951, 119, 631, 375, 887, 247, 759, 503, 1015, 15, 527, 271, 783, 143, 655, 399, 911, 79, 591, 335, 847, 207, 719, 463, 975, 47, 559, 303, 815, 175, 687, 431, 943, 111, 623, 367, 879, 239, 751, 495, 1007, 31, 543, 287, 799, 159, 671, 415, 927, 
    95, 607, 351, 863, 223, 735, 479, 991, 63, 575, 319, 831, 191, 703, 447, 959, 127, 639, 383, 895, 255, 767, 511, 1023};
    public static final long[] gauss_1024_12289 = {1283868770400643928L, 6416574995475331444L, 4078260278032692663L, 2353523259288686585L, 1227179971273316331L, 575931623374121527L, 242543240509105209L, 91437049221049666L, 30799446349977173L, 9255276791179340L, 2478152334826140L, 590642893610164L, 125206034929641L, 23590435911403L, 3948334035941L, 586753615614L, 77391054539L, 9056793210L, 940121950, 86539696, 7062824, 510971, 32764, 1862, 94, 4, 0};
    public static final int[] MAX_BL_SMALL = {1, 1, 2, 2, 4, 7, 14, 27, 53, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 209};
    public static final int[] MAX_BL_LARGE = {2, 2, 5, 7, 12, 21, 40, 78, 157, 308};
    public static final int[] bitlength_avg = {4, 11, 24, 50, IShizukuService.Stub.TRANSACTION_attachUserService, 202, 401, 794, 1577, 3138, 6308};
    public static final int[] bitlength_std = {0, 1, 1, 1, 1, 2, 4, 5, 8, 13, 25};

    public static long get_rng_u64(SHAKEDigest sHAKEDigest) {
        byte[] bArr = new byte[8];
        sHAKEDigest.doOutput(bArr, 0, 8);
        return Pack.littleEndianToLong(bArr, 0);
    }

    public static void keygen(SHAKEDigest sHAKEDigest, byte[] bArr, byte[] bArr2, byte[] bArr3, short[] sArr, int i) {
        int i2;
        int i3;
        byte b;
        int iMkn = mkn(i);
        short[] sArr2 = sArr;
        while (true) {
            double[] dArr = new double[iMkn * 3];
            poly_small_mkgauss(sHAKEDigest, bArr, i);
            poly_small_mkgauss(sHAKEDigest, bArr2, i);
            int i4 = 1 << (FalconCodec.max_fg_bits[i] - 1);
            for (int i5 = 0; i5 < iMkn; i5++) {
                byte b2 = bArr[i5];
                if (b2 >= i4 || b2 <= (i3 = -i4) || (b = bArr2[i5]) >= i4 || b <= i3) {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                int iPoly_small_sqnorm = poly_small_sqnorm(bArr, i);
                int iPoly_small_sqnorm2 = poly_small_sqnorm(bArr2, i);
                if ((((long) ((-((iPoly_small_sqnorm | iPoly_small_sqnorm2) >>> 31)) | (iPoly_small_sqnorm + iPoly_small_sqnorm2))) & 4294967295L) >= 16823) {
                    continue;
                } else {
                    int i6 = iMkn + iMkn;
                    poly_small_to_fp(dArr, 0, bArr, i);
                    poly_small_to_fp(dArr, iMkn, bArr2, i);
                    FalconFFT.FFT(dArr, 0, i);
                    FalconFFT.FFT(dArr, iMkn, i);
                    FalconFFT.poly_invnorm2_fft(dArr, i6, dArr, 0, dArr, iMkn, i);
                    FalconFFT.poly_adj_fft(dArr, 0, i);
                    FalconFFT.poly_adj_fft(dArr, iMkn, i);
                    FalconFFT.poly_mulconst(dArr, 0, 12289.0d, i);
                    FalconFFT.poly_mulconst(dArr, iMkn, 12289.0d, i);
                    FalconFFT.poly_mul_autoadj_fft(dArr, 0, dArr, i6, i);
                    FalconFFT.poly_mul_autoadj_fft(dArr, iMkn, dArr, i6, i);
                    FalconFFT.iFFT(dArr, 0, i);
                    FalconFFT.iFFT(dArr, iMkn, i);
                    double d = 0.0d;
                    for (int i7 = 0; i7 < iMkn; i7++) {
                        double d2 = dArr[i7];
                        double d3 = dArr[iMkn + i7];
                        d += (d3 * d3) + (d2 * d2);
                    }
                    if (d >= 16822.4121d) {
                        continue;
                    } else {
                        short[] sArr3 = new short[iMkn * 2];
                        if (sArr2 == null) {
                            sArr2 = sArr3;
                            i2 = iMkn;
                        } else {
                            i2 = 0;
                        }
                        if (FalconVrfy.compute_public(sArr2, 0, bArr, bArr2, i, sArr3, i2) != 0) {
                            if (solve_NTRU(i, bArr3, bArr, bArr2, (1 << (FalconCodec.max_FG_bits[i] - 1)) - 1, new int[i > 2 ? iMkn * 28 : iMkn * 84]) != 0) {
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    public static void make_fg(int[] iArr, int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        int iMkn = mkn(i2);
        int i5 = i + iMkn;
        int i6 = FalconSmallPrimeList.PRIMES[0].f81602p;
        for (int i7 = 0; i7 < iMkn; i7++) {
            iArr[i + i7] = modp_set(bArr[i7], i6);
            iArr[i5 + i7] = modp_set(bArr2[i7], i6);
        }
        if (i3 != 0 || i4 == 0) {
            int i8 = 0;
            while (i8 < i3) {
                int i9 = i8 + 1;
                make_fg_step(iArr, i, i2 - i8, i8, i8 != 0 ? 1 : 0, (i9 < i3 || i4 != 0) ? 1 : 0);
                i8 = i9;
            }
            return;
        }
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i10 = falconSmallPrimeArr[0].f81602p;
        int iModp_ninv31 = modp_ninv31(i10);
        int i11 = i5 + iMkn;
        modp_mkgm2(iArr, i11, iArr, i11 + iMkn, i2, falconSmallPrimeArr[0].f81601g, i10, iModp_ninv31);
        modp_NTT2(iArr, i, iArr, i11, i2, i10, iModp_ninv31);
        modp_NTT2(iArr, i5, iArr, i11, i2, i10, iModp_ninv31);
    }

    public static void make_fg_step(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = 1 << i2;
        int i9 = i8 >> 1;
        int[] iArr2 = MAX_BL_SMALL;
        int i10 = iArr2[i3];
        int i11 = iArr2[i3 + 1];
        int i12 = i9 * i11;
        int i13 = i + i12;
        int i14 = i13 + i12;
        int i15 = i8 * i10;
        int i16 = i14 + i15;
        int i17 = i16 + i15;
        int i18 = i17 + i8;
        int i19 = i18 + i8;
        System.arraycopy(iArr, i, iArr, i14, i8 * 2 * i10);
        int i20 = 0;
        while (i20 < i10) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i21 = falconSmallPrimeArr[i20].f81602p;
            int iModp_ninv31 = modp_ninv31(i21);
            int iModp_R2 = modp_R2(i21, iModp_ninv31);
            int i22 = i13;
            int i23 = i20;
            modp_mkgm2(iArr, i17, iArr, i18, i2, falconSmallPrimeArr[i20].f81601g, i21, iModp_ninv31);
            int i24 = i14 + i23;
            int i25 = 0;
            int i26 = i24;
            while (i25 < i8) {
                iArr[i19 + i25] = iArr[i26];
                i25++;
                i26 += i10;
            }
            if (i4 == 0) {
                modp_NTT2(iArr, i19, iArr, i17, i2, i21, iModp_ninv31);
            }
            int i27 = i + i23;
            int i28 = 0;
            int i29 = i27;
            while (i28 < i9) {
                int i30 = i19 + (i28 << 1);
                iArr[i29] = modp_montymul(modp_montymul(iArr[i30], iArr[i30 + 1], i21, iModp_ninv31), iModp_R2, i21, iModp_ninv31);
                i28++;
                i29 += i11;
            }
            if (i4 != 0) {
                i6 = iModp_ninv31;
                modp_iNTT2_ext(iArr, i24, i10, iArr, i18, i2, i21, iModp_ninv31);
            } else {
                i6 = iModp_ninv31;
            }
            int i31 = i16 + i23;
            int i32 = 0;
            int i33 = i31;
            while (i32 < i8) {
                iArr[i19 + i32] = iArr[i33];
                i32++;
                i33 += i10;
            }
            if (i4 == 0) {
                modp_NTT2(iArr, i19, iArr, i17, i2, i21, i6);
            }
            int i34 = i22 + i23;
            int i35 = 0;
            int i36 = i34;
            while (i35 < i9) {
                int i37 = i19 + (i35 << 1);
                int i38 = i6;
                iArr[i36] = modp_montymul(modp_montymul(iArr[i37], iArr[i37 + 1], r6, i38), iModp_R2, r6, i38);
                i35++;
                i36 += i11;
            }
            int i39 = i6;
            if (i4 != 0) {
                i7 = i39;
                modp_iNTT2_ext(iArr, i31, i10, iArr, i18, i2, r6, i7);
            } else {
                i7 = i39;
            }
            if (i5 == 0) {
                int i40 = i2 - 1;
                int i41 = i7;
                modp_iNTT2_ext(iArr, i27, i11, iArr, i18, i40, r6, i41);
                modp_iNTT2_ext(iArr, i34, i11, iArr, i18, i40, r6, i41);
            }
            i20 = i23 + 1;
            i13 = i22;
        }
        int i42 = i13;
        zint_rebuild_CRT(iArr, i14, i10, i10, i8, 1, iArr, i17);
        zint_rebuild_CRT(iArr, i16, i10, i10, i8, 1, iArr, i17);
        for (int i43 = i10; i43 < i11; i43++) {
            FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
            int i44 = falconSmallPrimeArr2[i43].f81602p;
            int iModp_ninv32 = modp_ninv31(i44);
            int iModp_R3 = modp_R2(i44, iModp_ninv32);
            int iModp_Rx = modp_Rx(i10, i44, iModp_ninv32, iModp_R3);
            modp_mkgm2(iArr, i17, iArr, i18, i2, falconSmallPrimeArr2[i43].f81601g, i44, iModp_ninv32);
            int i45 = i14;
            int i46 = 0;
            while (i46 < i8) {
                iArr[i19 + i46] = zint_mod_small_signed(iArr, i45, i10, i44, iModp_ninv32, iModp_R3, iModp_Rx);
                i46++;
                i45 += i10;
            }
            modp_NTT2(iArr, i19, iArr, i17, i2, i44, iModp_ninv32);
            int i47 = i + i43;
            int i48 = 0;
            int i49 = i47;
            while (i48 < i9) {
                int i50 = i19 + (i48 << 1);
                iArr[i49] = modp_montymul(modp_montymul(iArr[i50], iArr[i50 + 1], i44, iModp_ninv32), iModp_R3, i44, iModp_ninv32);
                i48++;
                i49 += i11;
            }
            int i51 = iModp_R3;
            int i52 = iModp_ninv32;
            int i53 = i44;
            int i54 = i16;
            int i55 = 0;
            while (i55 < i8) {
                int i56 = i51;
                iArr[i19 + i55] = zint_mod_small_signed(iArr, i54, i10, i53, i52, i56, iModp_Rx);
                i55++;
                i54 += i10;
                i51 = i56;
                i52 = i52;
                i53 = i53;
            }
            int i57 = i51;
            int i58 = i52;
            int i59 = i53;
            modp_NTT2(iArr, i19, iArr, i17, i2, i59, i58);
            int i60 = i42 + i43;
            int i61 = 0;
            int i62 = i60;
            while (i61 < i9) {
                int i63 = i19 + (i61 << 1);
                iArr[i62] = modp_montymul(modp_montymul(iArr[i63], iArr[i63 + 1], i59, i58), i57, i59, i58);
                i61++;
                i62 += i11;
            }
            if (i5 == 0) {
                int i64 = i2 - 1;
                modp_iNTT2_ext(iArr, i47, i11, iArr, i18, i64, i59, i58);
                modp_iNTT2_ext(iArr, i60, i11, iArr, i18, i64, i59, i58);
            }
        }
    }

    public static int mkgauss(SHAKEDigest sHAKEDigest, int i) {
        int i2 = 1 << (10 - i);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = get_rng_u64(sHAKEDigest);
            int i5 = (int) (j >>> 63);
            int i6 = (int) (((j & C14849.FOREVER_NS) - gauss_1024_12289[0]) >>> 63);
            long j2 = C14849.FOREVER_NS & get_rng_u64(sHAKEDigest);
            int i7 = 1;
            int i8 = 0;
            while (true) {
                long[] jArr = gauss_1024_12289;
                if (i7 < jArr.length) {
                    int i9 = ((int) ((j2 - jArr[i7]) >>> 63)) ^ 1;
                    i8 |= (-((i6 ^ 1) & i9)) & i7;
                    i6 |= i9;
                    i7++;
                }
            }
            i3 += ((-i5) ^ i8) + i5;
        }
        return i3;
    }

    public static int mkn(int i) {
        return 1 << i;
    }

    public static void modp_NTT2(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5) {
        modp_NTT2_ext(iArr, i, 1, iArr2, i2, i3, i4, i5);
    }

    public static void modp_NTT2_ext(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6) {
        if (i4 == 0) {
            return;
        }
        int iMkn = mkn(i4);
        int i7 = 1;
        int i8 = iMkn;
        while (i7 < iMkn) {
            int i9 = i8 >> 1;
            int i10 = 0;
            int i11 = 0;
            while (i10 < i7) {
                int i12 = iArr2[i3 + i7 + i10];
                int i13 = (i11 * i2) + i;
                int i14 = (i9 * i2) + i13;
                int i15 = 0;
                while (i15 < i9) {
                    int i16 = iArr[i13];
                    int iModp_montymul = modp_montymul(iArr[i14], i12, i5, i6);
                    iArr[i13] = modp_add(i16, iModp_montymul, i5);
                    iArr[i14] = modp_sub(i16, iModp_montymul, i5);
                    i15++;
                    i13 += i2;
                    i14 += i2;
                }
                i10++;
                i11 += i8;
            }
            i7 <<= 1;
            i8 = i9;
        }
    }

    public static int modp_R(int i) {
        return Integer.MIN_VALUE - i;
    }

    public static int modp_R2(int i, int i2) {
        int iModp_R = modp_R(i);
        int iModp_add = modp_add(iModp_R, iModp_R, i);
        int iModp_montymul = modp_montymul(iModp_add, iModp_add, i, i2);
        int iModp_montymul2 = modp_montymul(iModp_montymul, iModp_montymul, i, i2);
        int iModp_montymul3 = modp_montymul(iModp_montymul2, iModp_montymul2, i, i2);
        int iModp_montymul4 = modp_montymul(iModp_montymul3, iModp_montymul3, i, i2);
        int iModp_montymul5 = modp_montymul(iModp_montymul4, iModp_montymul4, i, i2);
        return (iModp_montymul5 + (i & (-(iModp_montymul5 & 1)))) >>> 1;
    }

    public static int modp_Rx(int i, int i2, int i3, int i4) {
        int i5 = i - 1;
        int iModp_R = modp_R(i2);
        int i6 = 0;
        while (true) {
            int i7 = 1 << i6;
            if (i7 > i5) {
                return iModp_R;
            }
            if ((i7 & i5) != 0) {
                iModp_R = modp_montymul(iModp_R, i4, i2, i3);
            }
            i4 = modp_montymul(i4, i4, i2, i3);
            i6++;
        }
    }

    public static int modp_add(int i, int i2, int i3) {
        int i4 = (i + i2) - i3;
        return i4 + ((-(i4 >>> 31)) & i3);
    }

    public static int modp_div(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3 - 2;
        for (int i7 = 30; i7 >= 0; i7--) {
            int iModp_montymul = modp_montymul(i5, i5, i3, i4);
            i5 = iModp_montymul ^ ((-(1 & (i6 >>> i7))) & (modp_montymul(iModp_montymul, i2, i3, i4) ^ iModp_montymul));
        }
        return modp_montymul(i, modp_montymul(i5, 1, i3, i4), i3, i4);
    }

    public static void modp_iNTT2(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5) {
        modp_iNTT2_ext(iArr, i, 1, iArr2, i2, i3, i4, i5);
    }

    public static void modp_iNTT2_ext(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6) {
        int i7;
        if (i4 == 0) {
            return;
        }
        int iMkn = mkn(i4);
        int i8 = 1;
        int i9 = iMkn;
        while (true) {
            i7 = 0;
            if (i9 <= 1) {
                break;
            }
            i9 >>= 1;
            int i10 = i8 << 1;
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                int i13 = iArr2[i3 + i9 + i11];
                int i14 = (i12 * i2) + i;
                int i15 = (i8 * i2) + i14;
                int i16 = 0;
                while (i16 < i8) {
                    int i17 = iArr[i14];
                    int i18 = iArr[i15];
                    iArr[i14] = modp_add(i17, i18, i5);
                    iArr[i15] = modp_montymul(modp_sub(i17, i18, i5), i13, i5, i6);
                    i16++;
                    i14 += i2;
                    i15 += i2;
                }
                i11++;
                i12 += i10;
            }
            i8 = i10;
        }
        int i19 = 1 << (31 - i4);
        int i20 = i;
        while (i7 < iMkn) {
            iArr[i20] = modp_montymul(iArr[i20], i19, i5, i6);
            i7++;
            i20 += i2;
        }
    }

    public static void modp_mkgm2(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6) {
        int iMkn = mkn(i3);
        int iModp_R2 = modp_R2(i5, i6);
        int iModp_montymul = modp_montymul(i4, iModp_R2, i5, i6);
        for (int i7 = i3; i7 < 10; i7++) {
            iModp_montymul = modp_montymul(iModp_montymul, iModp_montymul, i5, i6);
        }
        int iModp_div = modp_div(iModp_R2, iModp_montymul, i5, i6, modp_R(i5));
        int i8 = 10 - i3;
        int iModp_R = modp_R(i5);
        int iModp_montymul2 = iModp_R;
        for (int i9 = 0; i9 < iMkn; i9++) {
            short s = REV10[i9 << i8];
            iArr[i + s] = iModp_R;
            iArr2[s + i2] = iModp_montymul2;
            iModp_R = modp_montymul(iModp_R, iModp_montymul, i5, i6);
            iModp_montymul2 = modp_montymul(iModp_montymul2, iModp_div, i5, i6);
        }
    }

    public static int modp_montymul(int i, int i2, int i3, int i4) {
        long unsignedLong = toUnsignedLong(i) * toUnsignedLong(i2);
        int i5 = ((int) (((((((long) i4) * unsignedLong) & 2147483647L) * ((long) i3)) + unsignedLong) >>> 31)) - i3;
        return i5 + ((-(i5 >>> 31)) & i3);
    }

    public static int modp_ninv31(int i) {
        int i2 = 2 - i;
        int iM51252 = C22934.m51252(i, i2, 2, i2);
        int iM51253 = C22934.m51252(i, iM51252, 2, iM51252);
        int iM51254 = C22934.m51252(i, iM51253, 2, iM51253);
        return (-C22934.m51252(i, iM51254, 2, iM51254)) & Integer.MAX_VALUE;
    }

    public static int modp_norm(int i, int i2) {
        return i - (i2 & (((i - ((i2 + 1) >>> 1)) >>> 31) - 1));
    }

    public static void modp_poly_rec_res(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = 1 << (i2 - 1);
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = (i7 << 1) + i;
            iArr[i + i7] = modp_montymul(modp_montymul(iArr[i8], iArr[i8 + 1], i3, i4), i5, i3, i4);
        }
    }

    public static int modp_set(int i, int i2) {
        return i + (i2 & (-(i >>> 31)));
    }

    public static int modp_sub(int i, int i2, int i3) {
        int i4 = i - i2;
        return i4 + ((-(i4 >>> 31)) & i3);
    }

    public static void poly_big_to_fp(double[] dArr, int[] iArr, int i, int i2, int i3, int i4) {
        int iMkn = mkn(i4);
        if (i2 == 0) {
            for (int i5 = 0; i5 < iMkn; i5++) {
                dArr[i5] = 0.0d;
            }
            return;
        }
        double d = 0.0d;
        int i6 = 0;
        int i7 = i;
        while (i6 < iMkn) {
            int i8 = -(iArr[(i7 + i2) - 1] >>> 30);
            int i9 = i8 >>> 1;
            int i10 = i8 & 1;
            double d2 = 1.0d;
            int i11 = 0;
            while (i11 < i2) {
                int i12 = (iArr[i7 + i11] ^ i9) + i10;
                i10 = i12 >>> 31;
                int i13 = i12 & Integer.MAX_VALUE;
                d += ((double) (i13 - ((i13 << 1) & i8))) * d2;
                i11++;
                d2 *= 2.147483648E9d;
            }
            dArr[i6] = d;
            i6++;
            i7 += i3;
            d = 0.0d;
        }
    }

    public static int poly_big_to_small(byte[] bArr, int i, int[] iArr, int i2, int i3, int i4) {
        int iMkn = mkn(i4);
        for (int i5 = 0; i5 < iMkn; i5++) {
            int iZint_one_to_plain = zint_one_to_plain(iArr, i2 + i5);
            if (iZint_one_to_plain < (-i3) || iZint_one_to_plain > i3) {
                return 0;
            }
            bArr[i + i5] = (byte) iZint_one_to_plain;
        }
        return 1;
    }

    public static void poly_small_mkgauss(SHAKEDigest sHAKEDigest, byte[] bArr, int i) {
        int iMkgauss;
        int iMkn = mkn(i);
        int i2 = 0;
        for (int i3 = 0; i3 < iMkn; i3++) {
            while (true) {
                iMkgauss = mkgauss(sHAKEDigest, i);
                if (iMkgauss >= -127 && iMkgauss <= 127) {
                    if (i3 == iMkn - 1) {
                        if (((iMkgauss & 1) ^ i2) != 0) {
                            break;
                        }
                    } else {
                        i2 ^= iMkgauss & 1;
                        break;
                    }
                }
            }
            bArr[i3] = (byte) iMkgauss;
        }
    }

    public static int poly_small_sqnorm(byte[] bArr, int i) {
        int iMkn = mkn(i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iMkn; i4++) {
            byte b = bArr[i4];
            i2 += b * b;
            i3 |= i2;
        }
        return (-(i3 >>> 31)) | i2;
    }

    public static void poly_small_to_fp(double[] dArr, int i, byte[] bArr, int i2) {
        int iMkn = mkn(i2);
        for (int i3 = 0; i3 < iMkn; i3++) {
            dArr[i + i3] = bArr[i3];
        }
    }

    public static void poly_sub_scaled(int[] iArr, int i, int i2, int i3, int[] iArr2, int i4, int i5, int i6, int[] iArr3, int i7, int i8, int i9) {
        int iMkn = mkn(i9);
        for (int i10 = 0; i10 < iMkn; i10++) {
            int i11 = -iArr3[i10];
            int i12 = (i10 * i3) + i;
            int i13 = i4;
            for (int i14 = 0; i14 < iMkn; i14++) {
                zint_add_scaled_mul_small(iArr, i12, i2, iArr2, i13, i5, i11, i7, i8);
                if (i10 + i14 == iMkn - 1) {
                    i11 = -i11;
                    i12 = i;
                } else {
                    i12 += i3;
                }
                i13 += i6;
            }
        }
    }

    public static void poly_sub_scaled_ntt(int[] iArr, int i, int i2, int i3, int[] iArr2, int i4, int i5, int i6, int[] iArr3, int i7, int i8, int i9, int[] iArr4, int i10) {
        int iMkn = mkn(i9);
        int i11 = i5 + 1;
        int iMkn2 = i10 + mkn(i9);
        int iMkn3 = iMkn2 + mkn(i9);
        int i12 = (iMkn * i11) + iMkn3;
        int i13 = 0;
        while (i13 < i11) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i14 = falconSmallPrimeArr[i13].f81602p;
            int iModp_ninv31 = modp_ninv31(i14);
            int iModp_R2 = modp_R2(i14, iModp_ninv31);
            int iModp_Rx = modp_Rx(i5, i14, iModp_ninv31, iModp_R2);
            modp_mkgm2(iArr4, i10, iArr4, iMkn2, i9, falconSmallPrimeArr[i13].f81601g, i14, iModp_ninv31);
            for (int i15 = 0; i15 < iMkn; i15++) {
                iArr4[i12 + i15] = modp_set(iArr3[i15], i14);
            }
            int i16 = i13;
            int i17 = i11;
            int i18 = iMkn;
            modp_NTT2(iArr4, i12, iArr4, i10, i9, i14, iModp_ninv31);
            int i19 = iMkn3 + i16;
            int i20 = i4;
            int i21 = i19;
            int i22 = 0;
            while (i22 < i18) {
                iArr4[i21] = zint_mod_small_signed(iArr2, i20, i5, i14, iModp_ninv31, iModp_R2, iModp_Rx);
                i22++;
                i20 += i6;
                i21 += i17;
            }
            iMkn = i18;
            modp_NTT2_ext(iArr4, i19, i17, iArr4, i10, i9, i14, iModp_ninv31);
            int i23 = 0;
            int i24 = i19;
            while (i23 < iMkn) {
                iArr4[i24] = modp_montymul(modp_montymul(iArr4[i12 + i23], iArr4[i24], i14, iModp_ninv31), iModp_R2, i14, iModp_ninv31);
                i23++;
                i24 += i17;
            }
            modp_iNTT2_ext(iArr4, i19, i17, iArr4, iMkn2, i9, i14, iModp_ninv31);
            i13 = i16 + 1;
            i11 = i17;
        }
        int i25 = i11;
        int i26 = iMkn;
        zint_rebuild_CRT(iArr4, iMkn3, i25, i25, iMkn, 1, iArr4, i12);
        int i27 = i;
        int i28 = 0;
        while (i28 < i26) {
            zint_sub_scaled(iArr, i27, i2, iArr4, iMkn3, i25, i7, i8);
            i28++;
            i27 += i3;
            iMkn3 += i25;
        }
    }

    public static int solve_NTRU(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int[] iArr) {
        int iMkn = mkn(i);
        if (solve_NTRU_deepest(i, bArr2, bArr3, iArr) == 0) {
            return 0;
        }
        if (i > 2) {
            int i3 = i;
            while (true) {
                int i4 = i3 - 1;
                if (i3 <= 2) {
                    if (solve_NTRU_binary_depth1(i, bArr2, bArr3, iArr) != 0 && solve_NTRU_binary_depth0(i, bArr2, bArr3, iArr) != 0) {
                        break;
                    }
                    return 0;
                }
                if (solve_NTRU_intermediate(i, bArr2, bArr3, i4, iArr) == 0) {
                    return 0;
                }
                i3 = i4;
            }
        } else {
            int i5 = i;
            while (true) {
                int i6 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                if (solve_NTRU_intermediate(i, bArr2, bArr3, i6, iArr) == 0) {
                    return 0;
                }
                i5 = i6;
            }
        }
        byte[] bArr4 = new byte[iMkn];
        if (poly_big_to_small(bArr, 0, iArr, 0, i2, i) == 0 || poly_big_to_small(bArr4, 0, iArr, iMkn, i2, i) == 0) {
            return 0;
        }
        int i7 = iMkn + iMkn;
        int i8 = i7 + iMkn;
        int i9 = i8 + iMkn;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i10 = falconSmallPrimeArr[0].f81602p;
        int iModp_ninv31 = modp_ninv31(i10);
        modp_mkgm2(iArr, i9, iArr, 0, i, falconSmallPrimeArr[0].f81601g, i10, iModp_ninv31);
        for (int i11 = 0; i11 < iMkn; i11++) {
            iArr[i11] = modp_set(bArr4[i11], i10);
        }
        for (int i12 = 0; i12 < iMkn; i12++) {
            iArr[iMkn + i12] = modp_set(bArr2[i12], i10);
            iArr[i7 + i12] = modp_set(bArr3[i12], i10);
            iArr[i8 + i12] = modp_set(bArr[i12], i10);
        }
        modp_NTT2(iArr, iMkn, iArr, i9, i, i10, iModp_ninv31);
        modp_NTT2(iArr, i7, iArr, i9, i, i10, iModp_ninv31);
        modp_NTT2(iArr, i8, iArr, i9, i, i10, iModp_ninv31);
        modp_NTT2(iArr, 0, iArr, i9, i, i10, iModp_ninv31);
        int iModp_montymul = modp_montymul(12289, 1, i10, iModp_ninv31);
        for (int i13 = 0; i13 < iMkn; i13++) {
            if (modp_sub(modp_montymul(iArr[iMkn + i13], iArr[i13], i10, iModp_ninv31), modp_montymul(iArr[i7 + i13], iArr[i8 + i13], i10, iModp_ninv31), i10) != iModp_montymul) {
                return 0;
            }
        }
        return 1;
    }

    public static int solve_NTRU_binary_depth0(int i, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i2 = 1 << i;
        int i3 = i2 >> 1;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i4 = falconSmallPrimeArr[0].f81602p;
        int iModp_ninv31 = modp_ninv31(i4);
        int iModp_R2 = modp_R2(i4, iModp_ninv31);
        int i5 = i3 + i3;
        int i6 = i5 + i2;
        int i7 = i6 + i2;
        int i8 = i7 + i2;
        modp_mkgm2(iArr, i7, iArr, i8, i, falconSmallPrimeArr[0].f81601g, i4, iModp_ninv31);
        for (int i9 = 0; i9 < i3; i9++) {
            iArr[i9] = modp_set(zint_one_to_plain(iArr, i9), i4);
            int i10 = i3 + i9;
            iArr[i10] = modp_set(zint_one_to_plain(iArr, i10), i4);
        }
        int i11 = i - 1;
        modp_NTT2(iArr, 0, iArr, i7, i11, i4, iModp_ninv31);
        modp_NTT2(iArr, i3, iArr, i7, i11, i4, iModp_ninv31);
        for (int i12 = 0; i12 < i2; i12++) {
            iArr[i5 + i12] = modp_set(bArr[i12], i4);
            iArr[i6 + i12] = modp_set(bArr2[i12], i4);
        }
        modp_NTT2(iArr, i5, iArr, i7, i, i4, iModp_ninv31);
        modp_NTT2(iArr, i6, iArr, i7, i, i4, iModp_ninv31);
        int i13 = 0;
        while (i13 < i2) {
            int i14 = i5 + i13;
            int i15 = iArr[i14];
            int i16 = i14 + 1;
            int i17 = iArr[i16];
            int i18 = i6 + i13;
            int i19 = iArr[i18];
            int i20 = i18 + 1;
            int i21 = iArr[i20];
            int i22 = i13 >> 1;
            int i23 = i2;
            int iModp_montymul = modp_montymul(iArr[i22], iModp_R2, i4, iModp_ninv31);
            int i24 = i3;
            int iModp_montymul2 = modp_montymul(iArr[i3 + i22], iModp_R2, i4, iModp_ninv31);
            iArr[i14] = modp_montymul(i21, iModp_montymul, i4, iModp_ninv31);
            iArr[i16] = modp_montymul(i19, iModp_montymul, i4, iModp_ninv31);
            iArr[i18] = modp_montymul(i17, iModp_montymul2, i4, iModp_ninv31);
            iArr[i20] = modp_montymul(i15, iModp_montymul2, i4, iModp_ninv31);
            i13 += 2;
            i2 = i23;
            i3 = i24;
        }
        int i25 = i2;
        int i26 = i3;
        modp_iNTT2(iArr, i5, iArr, i8, i, i4, iModp_ninv31);
        modp_iNTT2(iArr, i6, iArr, i8, i, i4, iModp_ninv31);
        int i27 = i25 + i25;
        System.arraycopy(iArr, i5, iArr, 0, i25 * 2);
        int i28 = i27 + i25;
        int i29 = i28 + i25;
        int i30 = i29 + i25;
        int i31 = i30 + i25;
        modp_mkgm2(iArr, i27, iArr, i28, i, FalconSmallPrimeList.PRIMES[0].f81601g, i4, iModp_ninv31);
        modp_NTT2(iArr, 0, iArr, i27, i, i4, iModp_ninv31);
        modp_NTT2(iArr, i25, iArr, i27, i, i4, iModp_ninv31);
        int iModp_set = modp_set(bArr[0], i4);
        iArr[i31] = iModp_set;
        iArr[i30] = iModp_set;
        for (int i32 = 1; i32 < i25; i32++) {
            iArr[i30 + i32] = modp_set(bArr[i32], i4);
            iArr[(i31 + i25) - i32] = modp_set(-bArr[i32], i4);
        }
        modp_NTT2(iArr, i30, iArr, i27, i, i4, iModp_ninv31);
        modp_NTT2(iArr, i31, iArr, i27, i, i4, iModp_ninv31);
        for (int i33 = 0; i33 < i25; i33++) {
            int iModp_montymul3 = modp_montymul(iArr[i31 + i33], iModp_R2, i4, iModp_ninv31);
            iArr[i28 + i33] = modp_montymul(iModp_montymul3, iArr[i33], i4, iModp_ninv31);
            iArr[i29 + i33] = modp_montymul(iModp_montymul3, iArr[i30 + i33], i4, iModp_ninv31);
        }
        int iModp_set2 = modp_set(bArr2[0], i4);
        iArr[i31] = iModp_set2;
        iArr[i30] = iModp_set2;
        for (int i34 = 1; i34 < i25; i34++) {
            iArr[i30 + i34] = modp_set(bArr2[i34], i4);
            iArr[(i31 + i25) - i34] = modp_set(-bArr2[i34], i4);
        }
        modp_NTT2(iArr, i30, iArr, i27, i, i4, iModp_ninv31);
        modp_NTT2(iArr, i31, iArr, i27, i, i4, iModp_ninv31);
        for (int i35 = 0; i35 < i25; i35++) {
            int iModp_montymul4 = modp_montymul(iArr[i31 + i35], iModp_R2, i4, iModp_ninv31);
            int i36 = i28 + i35;
            iArr[i36] = modp_add(iArr[i36], modp_montymul(iModp_montymul4, iArr[i25 + i35], i4, iModp_ninv31), i4);
            int i37 = i29 + i35;
            iArr[i37] = modp_add(iArr[i37], modp_montymul(iModp_montymul4, iArr[i30 + i35], i4, iModp_ninv31), i4);
        }
        modp_mkgm2(iArr, i27, iArr, i30, i, FalconSmallPrimeList.PRIMES[0].f81601g, i4, iModp_ninv31);
        modp_iNTT2(iArr, i28, iArr, i30, i, i4, iModp_ninv31);
        modp_iNTT2(iArr, i29, iArr, i30, i, i4, iModp_ninv31);
        for (int i38 = 0; i38 < i25; i38++) {
            int i39 = i28 + i38;
            iArr[i27 + i38] = modp_norm(iArr[i39], i4);
            iArr[i39] = modp_norm(iArr[i29 + i38], i4);
        }
        double[] dArr = new double[i25 * 3];
        for (int i40 = 0; i40 < i25; i40++) {
            dArr[i27 + i40] = iArr[i28 + i40];
        }
        FalconFFT.FFT(dArr, i27, i);
        System.arraycopy(dArr, i27, dArr, i25, i26);
        int i41 = i26 + i25;
        for (int i42 = 0; i42 < i25; i42++) {
            dArr[i41 + i42] = iArr[i27 + i42];
        }
        FalconFFT.FFT(dArr, i41, i);
        FalconFFT.poly_div_autoadj_fft(dArr, i41, dArr, i25, i);
        FalconFFT.iFFT(dArr, i41, i);
        for (int i43 = 0; i43 < i25; i43++) {
            iArr[i27 + i43] = modp_set((int) FPREngine.fpr_rint(dArr[i41 + i43]), i4);
        }
        modp_mkgm2(iArr, i28, iArr, i29, i, FalconSmallPrimeList.PRIMES[0].f81601g, i4, iModp_ninv31);
        for (int i44 = 0; i44 < i25; i44++) {
            iArr[i30 + i44] = modp_set(bArr[i44], i4);
            iArr[i31 + i44] = modp_set(bArr2[i44], i4);
        }
        modp_NTT2(iArr, i27, iArr, i28, i, i4, iModp_ninv31);
        modp_NTT2(iArr, i30, iArr, i28, i, i4, iModp_ninv31);
        modp_NTT2(iArr, i31, iArr, i28, i, i4, iModp_ninv31);
        for (int i45 = 0; i45 < i25; i45++) {
            int iModp_montymul5 = modp_montymul(iArr[i27 + i45], iModp_R2, i4, iModp_ninv31);
            iArr[i45] = modp_sub(iArr[i45], modp_montymul(iModp_montymul5, iArr[i30 + i45], i4, iModp_ninv31), i4);
            int i46 = i25 + i45;
            iArr[i46] = modp_sub(iArr[i46], modp_montymul(iModp_montymul5, iArr[i31 + i45], i4, iModp_ninv31), i4);
        }
        modp_iNTT2(iArr, 0, iArr, i29, i, i4, iModp_ninv31);
        modp_iNTT2(iArr, i25, iArr, i29, i, i4, iModp_ninv31);
        for (int i47 = 0; i47 < i25; i47++) {
            iArr[i47] = modp_norm(iArr[i47], i4);
            int i48 = i25 + i47;
            iArr[i48] = modp_norm(iArr[i48], i4);
        }
        return 1;
    }

    public static int solve_NTRU_binary_depth1(int i, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i2;
        int i3 = 1 << i;
        int i4 = i - 1;
        int i5 = 1 << i4;
        int i6 = i5 >> 1;
        int[] iArr2 = MAX_BL_SMALL;
        int i7 = iArr2[1];
        int i8 = iArr2[2];
        int i9 = MAX_BL_LARGE[1];
        int i10 = i8 * i6;
        int i11 = i10 + i10;
        int i12 = i9 * i5;
        int i13 = i11 + i12;
        int i14 = 0;
        while (i14 < i9) {
            int i15 = FalconSmallPrimeList.PRIMES[i14].f81602p;
            int iModp_ninv31 = modp_ninv31(i15);
            int iModp_R2 = modp_R2(i15, iModp_ninv31);
            int iModp_Rx = modp_Rx(i8, i15, iModp_ninv31, iModp_R2);
            int i16 = i11 + i14;
            int i17 = i13 + i14;
            int i18 = 0;
            int i19 = i10;
            int i20 = i19;
            int i21 = 0;
            while (i21 < i6) {
                int i22 = iModp_R2;
                int i23 = iModp_ninv31;
                int i24 = i15;
                iArr[i16] = zint_mod_small_signed(iArr, i18, i8, i24, i23, i22, iModp_Rx);
                iArr[i17] = zint_mod_small_signed(iArr, i20, i8, i24, i23, i22, iModp_Rx);
                i21++;
                i18 += i8;
                i20 += i8;
                i16 += i9;
                i17 += i9;
                i11 = i11;
                i12 = i12;
                i13 = i13;
                iModp_R2 = i22;
                iModp_ninv31 = i23;
                i15 = i24;
                i14 = i14;
                i6 = i6;
                i4 = i4;
                i3 = i3;
            }
            i14++;
            i10 = i19;
            i6 = i6;
            i4 = i4;
            i3 = i3;
        }
        int i25 = i3;
        int i26 = i4;
        int i27 = i6;
        int i28 = i12;
        System.arraycopy(iArr, i11, iArr, 0, i28);
        System.arraycopy(iArr, i13, iArr, i28, i28);
        int i29 = i28 + i28;
        int i30 = i7 * i5;
        int i31 = i29 + i30;
        int i32 = i31 + i30;
        int i33 = 0;
        while (i33 < i9) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i34 = falconSmallPrimeArr[i33].f81602p;
            int iModp_ninv32 = modp_ninv31(i34);
            int i35 = i32 + i25;
            int i36 = i35 + i5;
            int i37 = i36 + i25;
            int i38 = i30;
            int iModp_R3 = modp_R2(i34, iModp_ninv32);
            int i39 = iModp_ninv32;
            int i40 = i34;
            int i41 = i29;
            int i42 = i33;
            modp_mkgm2(iArr, i32, iArr, i35, i, falconSmallPrimeArr[i33].f81601g, i34, i39);
            int i43 = i25;
            for (int i44 = 0; i44 < i43; i44++) {
                iArr[i36 + i44] = modp_set(bArr[i44], i40);
                iArr[i37 + i44] = modp_set(bArr2[i44], i40);
            }
            modp_NTT2(iArr, i36, iArr, i32, i, i40, i39);
            modp_NTT2(iArr, i37, iArr, i32, i, i40, i39);
            int i45 = i;
            int i46 = i26;
            while (i45 > i46) {
                int i47 = i45;
                modp_poly_rec_res(iArr, i36, i45, i40, i39, iModp_R3);
                modp_poly_rec_res(iArr, i37, i47, i40, i39, iModp_R3);
                i45 = i47 - 1;
            }
            int i48 = i32 + i5;
            System.arraycopy(iArr, i35, iArr, i48, i5);
            int i49 = i48 + i5;
            System.arraycopy(iArr, i36, iArr, i49, i5);
            int i50 = i49 + i5;
            System.arraycopy(iArr, i37, iArr, i50, i5);
            int i51 = i50 + i5;
            int i52 = i51 + i27;
            int i53 = i28 + i42;
            int i54 = 0;
            int i55 = i42;
            int i56 = i53;
            int i57 = i27;
            while (i54 < i57) {
                iArr[i51 + i54] = iArr[i55];
                iArr[i52 + i54] = iArr[i56];
                i54++;
                i55 += i9;
                i56 += i9;
            }
            int i58 = i - 2;
            int i59 = i28;
            int i60 = i57;
            modp_NTT2(iArr, i51, iArr, i32, i58, i40, i39);
            modp_NTT2(iArr, i52, iArr, i32, i58, i40, i39);
            int i61 = 0;
            int i62 = i42;
            int i63 = i53;
            while (i61 < i60) {
                int i64 = i61 << 1;
                int i65 = i49 + i64;
                int i66 = iArr[i65];
                int i67 = iArr[i65 + 1];
                int i68 = i64 + i50;
                int i69 = iArr[i68];
                int i70 = iArr[i68 + 1];
                int i71 = i43;
                int i72 = iArr[i51 + i61];
                int i73 = i51;
                int i74 = i40;
                int i75 = i60;
                int i76 = i39;
                int i77 = iModp_R3;
                int iModp_montymul = modp_montymul(i72, i77, i74, i76);
                int i78 = i50;
                int iModp_montymul2 = modp_montymul(iArr[i52 + i61], i77, i74, i76);
                iArr[i62] = modp_montymul(i70, iModp_montymul, i74, i76);
                iArr[i62 + i9] = modp_montymul(i69, iModp_montymul, i74, i76);
                iArr[i63] = modp_montymul(i67, iModp_montymul2, i74, i76);
                iArr[i63 + i9] = modp_montymul(i66, iModp_montymul2, i74, i76);
                i61++;
                int i79 = i9 << 1;
                i62 += i79;
                i63 += i79;
                i39 = i76;
                i60 = i75;
                i43 = i71;
                i50 = i78;
                i40 = i74;
                i51 = i73;
                iModp_R3 = i77;
                i5 = i5;
            }
            int i80 = i43;
            int i81 = i5;
            int i82 = i50;
            int i83 = i40;
            int i84 = i60;
            int i85 = i39;
            modp_iNTT2_ext(iArr, i42, i9, iArr, i48, i46, i83, i85);
            modp_iNTT2_ext(iArr, i53, i9, iArr, i48, i46, i83, i85);
            if (i42 < i7) {
                modp_iNTT2(iArr, i49, iArr, i48, i46, i83, i85);
                modp_iNTT2(iArr, i82, iArr, i48, i46, i83, i85);
                int i86 = i41 + i42;
                int i87 = i31 + i42;
                int i88 = 0;
                i2 = i81;
                while (i88 < i2) {
                    iArr[i86] = iArr[i49 + i88];
                    iArr[i87] = iArr[i82 + i88];
                    i88++;
                    i86 += i7;
                    i87 += i7;
                }
            } else {
                i2 = i81;
            }
            i33 = i42 + 1;
            i25 = i80;
            i27 = i84;
            i30 = i38;
            i29 = i41;
            i5 = i2;
            i28 = i59;
            i26 = i46;
        }
        int i89 = i29;
        int i90 = i26;
        int i91 = i28;
        int i92 = i5;
        int i93 = i92 << 1;
        zint_rebuild_CRT(iArr, 0, i9, i9, i93, 1, iArr, i32);
        zint_rebuild_CRT(iArr, i89, i7, i7, i93, 1, iArr, i32);
        double[] dArr = new double[i92];
        double[] dArr2 = new double[i92];
        poly_big_to_fp(dArr, iArr, 0, i9, i9, i90);
        poly_big_to_fp(dArr2, iArr, i91, i9, i9, i90);
        System.arraycopy(iArr, i89, iArr, 0, i7 * 2 * i92);
        double[] dArr3 = new double[i92];
        double[] dArr4 = new double[i92];
        poly_big_to_fp(dArr3, iArr, 0, i7, i7, i90);
        poly_big_to_fp(dArr4, iArr, i30, i7, i7, i90);
        FalconFFT.FFT(dArr, 0, i90);
        FalconFFT.FFT(dArr2, 0, i90);
        FalconFFT.FFT(dArr3, 0, i90);
        FalconFFT.FFT(dArr4, 0, i90);
        double[] dArr5 = new double[i92];
        double[] dArr6 = new double[i27];
        FalconFFT.poly_add_muladj_fft(dArr5, dArr, dArr2, dArr3, dArr4, i90);
        FalconFFT.poly_invnorm2_fft(dArr6, 0, dArr3, 0, dArr4, 0, i90);
        FalconFFT.poly_mul_autoadj_fft(dArr5, 0, dArr6, 0, i90);
        FalconFFT.iFFT(dArr5, 0, i90);
        for (int i94 = 0; i94 < i92; i94++) {
            double d = dArr5[i94];
            if (d >= 9.223372036854776E18d || -9.223372036854776E18d >= d) {
                return 0;
            }
            dArr5[i94] = FPREngine.fpr_rint(d);
        }
        FalconFFT.FFT(dArr5, 0, i90);
        FalconFFT.poly_mul_fft(dArr3, 0, dArr5, 0, i90);
        FalconFFT.poly_mul_fft(dArr4, 0, dArr5, 0, i90);
        FalconFFT.poly_sub(dArr, 0, dArr3, 0, i90);
        FalconFFT.poly_sub(dArr2, 0, dArr4, 0, i90);
        FalconFFT.iFFT(dArr, 0, i90);
        FalconFFT.iFFT(dArr2, 0, i90);
        for (int i95 = 0; i95 < i92; i95++) {
            iArr[i95] = (int) FPREngine.fpr_rint(dArr[i95]);
            iArr[i92 + i95] = (int) FPREngine.fpr_rint(dArr2[i95]);
        }
        return 1;
    }

    public static int solve_NTRU_deepest(int i, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i2 = MAX_BL_SMALL[i];
        int i3 = i2 + i2;
        int i4 = i3 + i2;
        int i5 = i4 + i2;
        make_fg(iArr, i3, bArr, bArr2, i, i, 0);
        zint_rebuild_CRT(iArr, i3, i2, i2, 2, 0, iArr, i5);
        return (zint_bezout(iArr, i2, iArr, 0, iArr, i3, iArr, i4, i2, iArr, i5) != 0 && zint_mul_small(iArr, 0, i2, 12289) == 0 && zint_mul_small(iArr, i2, i2, 12289) == 0) ? 1 : 0;
    }

    public static int solve_NTRU_intermediate(int i, byte[] bArr, byte[] bArr2, int i2, int[] iArr) {
        double d;
        int[] iArr2;
        int i3;
        int i4;
        int i5;
        int[] iArr3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr4 = iArr;
        int i11 = i - i2;
        int i12 = 1 << i11;
        int i13 = i12 >> 1;
        int[] iArr5 = MAX_BL_SMALL;
        int i14 = iArr5[i2];
        int i15 = iArr5[i2 + 1];
        int i16 = MAX_BL_LARGE[i2];
        int i17 = i15 * i13;
        int i18 = i17 + i17;
        int i19 = i11;
        make_fg(iArr, i18, bArr, bArr2, i, i2, 1);
        int i20 = i12 * i16;
        int i21 = i20 + i20;
        int i22 = i12 * i14;
        System.arraycopy(iArr4, i18, iArr4, i21, i22 + i22);
        int i23 = i21 + i22;
        int i24 = i23 + i22;
        System.arraycopy(iArr4, 0, iArr4, i24, i17 + i17);
        int i25 = i17 + i24;
        int i26 = 0;
        while (i26 < i16) {
            int i27 = FalconSmallPrimeList.PRIMES[i26].f81602p;
            int iModp_ninv31 = modp_ninv31(i27);
            int iModp_R2 = modp_R2(i27, iModp_ninv31);
            int iModp_Rx = modp_Rx(i15, i27, iModp_ninv31, iModp_R2);
            int i28 = 0;
            int i29 = i20 + i26;
            int i30 = i26;
            int i31 = i25;
            int i32 = i24;
            while (i28 < i13) {
                int i33 = iModp_R2;
                int i34 = iModp_ninv31;
                int i35 = i27;
                iArr4[i30] = zint_mod_small_signed(iArr, i32, i15, i27, i34, i33, iModp_Rx);
                iArr4[i29] = zint_mod_small_signed(iArr, i31, i15, i35, i34, i33, iModp_Rx);
                i28++;
                i32 += i15;
                i31 += i15;
                i30 += i16;
                i29 += i16;
                iModp_R2 = i33;
                iModp_ninv31 = i34;
                i27 = i35;
                i26 = i26;
                i21 = i21;
            }
            i26++;
        }
        int i36 = i21;
        int i37 = 0;
        while (i37 < i16) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i38 = falconSmallPrimeArr[i37].f81602p;
            int iModp_ninv32 = modp_ninv31(i38);
            int iModp_R3 = modp_R2(i38, iModp_ninv32);
            if (i37 == i14) {
                i3 = i14;
                int i39 = i12;
                i4 = i24;
                zint_rebuild_CRT(iArr, i36, i14, i14, i12, 1, iArr, i4);
                zint_rebuild_CRT(iArr, i23, i3, i14, i39, 1, iArr, i4);
                i5 = i39;
            } else {
                i3 = i14;
                i4 = i24;
                i5 = i12;
            }
            int i40 = i4 + i5;
            int i41 = i40 + i5;
            int i42 = i41 + i5;
            modp_mkgm2(iArr, i4, iArr, i40, i19, falconSmallPrimeArr[i37].f81601g, i38, iModp_ninv32);
            if (i37 < i3) {
                int i43 = i36 + i37;
                int i44 = i23 + i37;
                int i45 = 0;
                int i46 = i44;
                int i47 = i43;
                while (i45 < i5) {
                    iArr[i41 + i45] = iArr[i47];
                    iArr[i42 + i45] = iArr[i46];
                    i45++;
                    i47 += i3;
                    i46 += i3;
                }
                int i48 = i3;
                int i49 = i19;
                iArr3 = iArr;
                modp_iNTT2_ext(iArr, i43, i48, iArr, i40, i49, i38, iModp_ninv32);
                modp_iNTT2_ext(iArr, i44, i48, iArr, i40, i49, i38, iModp_ninv32);
                i6 = i5;
                i7 = iModp_R3;
                i8 = iModp_ninv32;
                i9 = i38;
                i10 = i37;
            } else {
                iArr3 = iArr;
                int iModp_Rx2 = modp_Rx(i3, i38, iModp_ninv32, iModp_R3);
                int i50 = i23;
                int i51 = i36;
                int i52 = 0;
                while (i52 < i5) {
                    int i53 = i3;
                    int i54 = iModp_R3;
                    int i55 = i38;
                    iArr3[i41 + i52] = zint_mod_small_signed(iArr, i51, i3, i38, iModp_ninv32, i54, iModp_Rx2);
                    iArr3[i42 + i52] = zint_mod_small_signed(iArr, i50, i3, i55, iModp_ninv32, i54, iModp_Rx2);
                    i52++;
                    i51 += i53;
                    i50 += i53;
                    iModp_R3 = i54;
                    i5 = i5;
                    i38 = i55;
                    i37 = i37;
                }
                i6 = i5;
                i7 = iModp_R3;
                i8 = iModp_ninv32;
                i9 = i38;
                i10 = i37;
                int i56 = i4;
                int i57 = i19;
                modp_NTT2(iArr, i41, iArr, i56, i57, i38, i8);
                modp_NTT2(iArr, i42, iArr, i56, i57, i38, i8);
            }
            int i58 = i42 + i6;
            int i59 = i58 + i13;
            int i60 = i20 + i10;
            int i61 = 0;
            int i62 = i13;
            int i63 = i10;
            int i64 = i60;
            while (i61 < i62) {
                iArr3[i58 + i61] = iArr3[i63];
                iArr3[i59 + i61] = iArr3[i64];
                i61++;
                i63 += i16;
                i64 += i16;
            }
            int i65 = i19;
            int i66 = i65 - 1;
            int i67 = i4;
            int i68 = i9;
            int i69 = i8;
            modp_NTT2(iArr, i58, iArr, i67, i66, i68, i69);
            modp_NTT2(iArr, i59, iArr, i67, i66, i68, i69);
            int i70 = 0;
            int i71 = i10;
            int i72 = i60;
            while (i70 < i62) {
                int i73 = i70 << 1;
                int i74 = i41 + i73;
                int i75 = iArr3[i74];
                int i76 = iArr3[i74 + 1];
                int i77 = i42 + i73;
                int i78 = iArr3[i77];
                int i79 = iArr3[i77 + 1];
                int i80 = i3;
                int i81 = i6;
                int i82 = i9;
                int i83 = i8;
                int iModp_montymul = modp_montymul(iArr3[i58 + i70], i7, i82, i83);
                int i84 = i58;
                int iModp_montymul2 = modp_montymul(iArr3[i59 + i70], i7, i82, i83);
                iArr3[i71] = modp_montymul(i79, iModp_montymul, i82, i83);
                iArr3[i71 + i16] = modp_montymul(i78, iModp_montymul, i82, i83);
                iArr3[i72] = modp_montymul(i76, iModp_montymul2, i82, i83);
                iArr3[i72 + i16] = modp_montymul(i75, iModp_montymul2, i82, i83);
                i70++;
                int i85 = i16 << 1;
                i71 += i85;
                i72 += i85;
                i58 = i84;
                i8 = i83;
                i9 = i82;
                i6 = i81;
                i3 = i80;
            }
            int i86 = i3;
            int i87 = i6;
            int i88 = i9;
            int i89 = i8;
            i16 = i16;
            modp_iNTT2_ext(iArr, i10, i16, iArr, i40, i65, i88, i89);
            modp_iNTT2_ext(iArr, i60, i16, iArr, i40, i65, i88, i89);
            i13 = i62;
            i12 = i87;
            i14 = i86;
            i19 = i65;
            iArr4 = iArr3;
            i24 = i4;
            i37 = i10 + 1;
        }
        int i90 = i16;
        int i91 = i14;
        int i92 = i13;
        int i93 = i12;
        int i94 = i24;
        int i95 = i19;
        zint_rebuild_CRT(iArr, 0, i16, i90, i93, 1, iArr, i94);
        zint_rebuild_CRT(iArr, i20, i16, i90, i93, 1, iArr, i94);
        double[] dArr = new double[i93];
        double[] dArr2 = new double[i93];
        double[] dArr3 = new double[i93];
        double[] dArr4 = new double[i93];
        double[] dArr5 = new double[i92];
        int[] iArr6 = new int[i93];
        int iMin = Math.min(i91, 10);
        int i96 = i93;
        int i97 = i91;
        poly_big_to_fp(dArr3, iArr, (i36 + i91) - iMin, iMin, i91, i95);
        poly_big_to_fp(dArr4, iArr, (i23 + i97) - iMin, iMin, i97, i95);
        int i98 = (i97 - iMin) * 31;
        int i99 = i2;
        int i100 = bitlength_avg[i99];
        int i101 = bitlength_std[i99];
        int i102 = i100 - (i101 * 6);
        int i103 = (i101 * 6) + i100;
        FalconFFT.FFT(dArr3, 0, i95);
        FalconFFT.FFT(dArr4, 0, i95);
        FalconFFT.poly_invnorm2_fft(dArr5, 0, dArr3, 0, dArr4, 0, i95);
        FalconFFT.poly_adj_fft(dArr3, 0, i95);
        FalconFFT.poly_adj_fft(dArr4, 0, i95);
        int i104 = i90 * 31;
        int i105 = i104;
        int i106 = i104 - i102;
        int i107 = i90;
        while (true) {
            int iMin2 = Math.min(i107, 10);
            int i108 = i107;
            int i109 = i105;
            poly_big_to_fp(dArr, iArr, i107 - iMin2, iMin2, i90, i95);
            poly_big_to_fp(dArr2, iArr, (i20 + i108) - iMin2, iMin2, i90, i95);
            FalconFFT.FFT(dArr, 0, i95);
            FalconFFT.FFT(dArr2, 0, i95);
            FalconFFT.poly_mul_fft(dArr, 0, dArr3, 0, i95);
            FalconFFT.poly_mul_fft(dArr2, 0, dArr4, 0, i95);
            FalconFFT.poly_add(dArr2, 0, dArr, 0, i95);
            FalconFFT.poly_mul_autoadj_fft(dArr2, 0, dArr5, 0, i95);
            FalconFFT.iFFT(dArr2, 0, i95);
            int i110 = (i106 - ((i107 - iMin2) * 31)) + i98;
            if (i110 < 0) {
                i110 = -i110;
                d = 2.0d;
            } else {
                d = 0.5d;
            }
            double d2 = 1.0d;
            while (i110 != 0) {
                if ((i110 & 1) != 0) {
                    d2 *= d;
                }
                i110 >>= 1;
                d *= d;
            }
            for (int i111 = 0; i111 < i96; i111++) {
                double d3 = dArr2[i111] * d2;
                if (-2.147483647E9d >= d3 || d3 >= 2.147483647E9d) {
                    return 0;
                }
                iArr6[i111] = (int) FPREngine.fpr_rint(d3);
            }
            int i112 = i106 / 31;
            int i113 = i106 % 31;
            if (i99 <= 4) {
                iArr2 = iArr6;
                int i114 = i97;
                int i115 = i97;
                poly_sub_scaled_ntt(iArr, 0, i108, i90, iArr, i36, i114, i115, iArr2, i112, i113, i95, iArr, i94);
                poly_sub_scaled_ntt(iArr, i20, i108, i90, iArr, i23, i114, i115, iArr2, i112, i113, i95, iArr, i94);
            } else {
                iArr2 = iArr6;
                int i116 = i97;
                int i117 = i97;
                poly_sub_scaled(iArr, 0, i108, i90, iArr, i36, i116, i117, iArr2, i112, i113, i95);
                poly_sub_scaled(iArr, i20, i108, i90, iArr, i23, i116, i117, iArr2, i112, i113, i95);
            }
            int i118 = i106 + i103;
            int i119 = i118 + 10;
            if (i119 >= i109) {
                i119 = i109;
            } else if (i108 * 31 >= i118 + 41) {
                i108--;
            }
            int i120 = i108;
            if (i106 <= 0) {
                if (i120 < i97) {
                    int i121 = 0;
                    int i122 = 0;
                    while (i122 < i96) {
                        int i123 = i97;
                        int i124 = (-(iArr[(i121 + i120) - 1] >>> 30)) >>> 1;
                        for (int i125 = i120; i125 < i123; i125++) {
                            iArr[i121 + i125] = i124;
                        }
                        int i126 = (-(iArr[(i20 + i120) - 1] >>> 30)) >>> 1;
                        for (int i127 = i120; i127 < i123; i127++) {
                            iArr[i20 + i127] = i126;
                        }
                        i122++;
                        i121 += i90;
                        i20 += i90;
                        i97 = i123;
                    }
                }
                int i128 = i97;
                int i129 = 0;
                int i130 = 0;
                int i131 = 0;
                while (i130 < (i96 << 1)) {
                    System.arraycopy(iArr, i129, iArr, i131, i128);
                    i130++;
                    i131 += i128;
                    i129 += i90;
                }
                return 1;
            }
            int i132 = i97;
            i106 -= 25;
            if (i106 < 0) {
                i106 = 0;
            }
            iArr6 = iArr2;
            i96 = i96;
            dArr5 = dArr5;
            dArr4 = dArr4;
            i97 = i132;
            dArr3 = dArr3;
            dArr2 = dArr2;
            dArr = dArr;
            i99 = i2;
            i107 = i120;
            i105 = i119;
        }
    }

    public static long toUnsignedLong(int i) {
        return ((long) i) & 4294967295L;
    }

    public static void zint_add_mul_small(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i + i6;
            long unsignedLong = (toUnsignedLong(iArr2[i2 + i6]) * toUnsignedLong(i4)) + toUnsignedLong(iArr[i7]) + toUnsignedLong(i5);
            iArr[i7] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i5 = (int) (unsignedLong >>> 31);
        }
        iArr[i + i3] = i5;
    }

    public static void zint_add_scaled_mul_small(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7) {
        if (i4 == 0) {
            return;
        }
        int i8 = (-(iArr2[(i3 + i4) - 1] >>> 30)) >>> 1;
        int i9 = 0;
        int i10 = 0;
        int i11 = i6;
        while (i11 < i2) {
            int i12 = i11 - i6;
            int i13 = i12 < i4 ? iArr2[i3 + i12] : i8;
            int i14 = i + i11;
            long unsignedLong = (toUnsignedLong(i9 | ((i13 << i7) & Integer.MAX_VALUE)) * ((long) i5)) + toUnsignedLong(iArr[i14]) + ((long) i10);
            iArr[i14] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i10 = (int) (unsignedLong >>> 31);
            i11++;
            i9 = i13 >>> (31 - i7);
        }
    }

    public static int zint_bezout(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3, int[] iArr4, int i4, int i5, int[] iArr5, int i6) {
        int i7 = i5;
        int[] iArr6 = iArr5;
        if (i7 == 0) {
            return 0;
        }
        int i8 = i6 + i7;
        int i9 = i8 + i7;
        int i10 = i9 + i7;
        int iModp_ninv31 = modp_ninv31(iArr3[i3]);
        int iModp_ninv32 = modp_ninv31(iArr4[i4]);
        System.arraycopy(iArr3, i3, iArr6, i9, i7);
        System.arraycopy(iArr4, i4, iArr6, i10, i7);
        iArr[i] = 1;
        iArr2[i2] = 0;
        for (int i11 = 1; i11 < i7; i11++) {
            iArr[i + i11] = 0;
            iArr2[i2 + i11] = 0;
        }
        System.arraycopy(iArr4, i4, iArr6, i6, i7);
        System.arraycopy(iArr3, i3, iArr6, i8, i7);
        iArr6[i8] = iArr6[i8] - 1;
        int i12 = 30;
        int i13 = (i7 * 62) + 30;
        while (true) {
            int i14 = 31;
            if (i13 < i12) {
                break;
            }
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = i7;
            while (true) {
                int i22 = i21 - 1;
                if (i21 <= 0) {
                    break;
                }
                int i23 = iArr6[i9 + i22];
                int i24 = iArr6[i10 + i22];
                i18 ^= (i18 ^ i23) & i16;
                i17 ^= (i17 ^ i23) & i15;
                i20 ^= (i20 ^ i24) & i16;
                i19 ^= (i19 ^ i24) & i15;
                int i25 = ((((i23 | i24) + Integer.MAX_VALUE) >>> 31) - 1) & i16;
                i21 = i22;
                int i26 = i16;
                i16 = i25;
                i15 = i26;
            }
            int i27 = (i18 & i15) | i17;
            int i28 = ~i15;
            int i29 = i19 | (i20 & i15);
            long unsignedLong = (toUnsignedLong(i18 & i28) << 31) + toUnsignedLong(i27);
            long unsignedLong2 = (toUnsignedLong(i20 & i28) << 31) + toUnsignedLong(i29);
            int i30 = iArr6[i9];
            int i31 = iArr6[i10];
            int i32 = i13;
            long j = 0;
            long j2 = 0;
            long j3 = 1;
            long j4 = 1;
            int i33 = 0;
            while (i33 < i14) {
                long j5 = unsignedLong2 - unsignedLong;
                int i34 = i8;
                int i35 = (int) ((j5 ^ ((unsignedLong ^ unsignedLong2) & (unsignedLong ^ j5))) >>> 63);
                int i36 = (i30 >> i33) & 1;
                int i37 = (i31 >> i33) & 1 & i36;
                int i38 = i37 & i35;
                int i39 = (~i35) & i37;
                int i40 = (i36 ^ 1) | i38;
                int i41 = i30 - ((-i38) & i31);
                long j6 = unsignedLong - ((-toUnsignedLong(i38)) & unsignedLong2);
                long j7 = -i38;
                long j8 = j3 - (j2 & j7);
                long j9 = j - (j4 & j7);
                int i42 = i31 - ((-i39) & i41);
                long j10 = unsignedLong2 - (j6 & (-toUnsignedLong(i39)));
                long j11 = -i39;
                long j12 = j2 - (j8 & j11);
                long j13 = j4 - (j9 & j11);
                long j14 = i40;
                long j15 = j14 - 1;
                j3 = j8 + (j8 & j15);
                j = j9 + (j9 & j15);
                unsignedLong = j6 ^ ((-toUnsignedLong(i40)) & (j6 ^ (j6 >> 1)));
                i31 = i42 + ((-i40) & i42);
                long j16 = -j14;
                j2 = j12 + (j12 & j16);
                j4 = j13 + (j13 & j16);
                unsignedLong2 = j10 ^ (((j10 >> 1) ^ j10) & (toUnsignedLong(i40) - 1));
                i33++;
                i14 = 31;
                i30 = i41 + ((i40 - 1) & i41);
                i8 = i34;
            }
            int i43 = i8;
            int iZint_co_reduce = zint_co_reduce(iArr5, i9, iArr5, i10, i5, j3, j, j2, j4);
            long j17 = -(iZint_co_reduce & 1);
            long j18 = j3 - ((j3 + j3) & j17);
            long j19 = j - ((j + j) & j17);
            long j20 = -(iZint_co_reduce >>> 1);
            long j21 = j2 - ((j2 + j2) & j20);
            long j22 = j4 - ((j4 + j4) & j20);
            zint_co_reduce_mod(iArr, i, iArr5, i6, iArr4, i4, i5, iModp_ninv32, j18, j19, j21, j22);
            zint_co_reduce_mod(iArr2, i2, iArr5, i43, iArr3, i3, i5, iModp_ninv31, j18, j19, j21, j22);
            i13 = i32 - 30;
            i12 = 30;
            i7 = i5;
            iArr6 = iArr5;
            i10 = i10;
            i9 = i9;
            i8 = i43;
        }
        int i44 = i9;
        int i45 = iArr5[i44] ^ 1;
        for (int i46 = 1; i46 < i5; i46++) {
            i45 |= iArr5[i44 + i46];
        }
        return (1 - ((i45 | (-i45)) >>> 31)) & iArr3[i3] & iArr4[i4];
    }

    public static int zint_co_reduce(int[] iArr, int i, int[] iArr2, int i2, int i3, long j, long j2, long j3, long j4) {
        long j5 = 0;
        long j6 = 0;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i + i4;
            int i6 = i2 + i4;
            long j7 = iArr[i5];
            long j8 = iArr2[i6];
            long jM23418 = C10050.m23418(j8, j2, j7 * j, j5);
            int i7 = i4;
            long jM23419 = C10050.m23418(j8, j4, j7 * j3, j6);
            if (i7 > 0) {
                iArr[i5 - 1] = ((int) jM23418) & Integer.MAX_VALUE;
                iArr2[i6 - 1] = ((int) jM23419) & Integer.MAX_VALUE;
            }
            j5 = jM23418 >> 31;
            j6 = jM23419 >> 31;
            i4 = i7 + 1;
        }
        iArr[(i + i3) - 1] = (int) j5;
        iArr2[(i2 + i3) - 1] = (int) j6;
        int i8 = (int) (j5 >>> 63);
        int i9 = (int) (j6 >>> 63);
        zint_negate(iArr, i, i3, i8);
        zint_negate(iArr2, i2, i3, i9);
        return (i9 << 1) | i8;
    }

    public static void zint_co_reduce_mod(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3, int i4, int i5, long j, long j2, long j3, long j4) {
        long j5 = j;
        int i6 = iArr[i];
        int i7 = iArr2[i2];
        int iM14441 = C6316.m14441(i7, (int) j2, ((int) j5) * i6, i5) & Integer.MAX_VALUE;
        int iM14442 = C6316.m14441(i7, (int) j4, i6 * ((int) j3), i5) & Integer.MAX_VALUE;
        long j6 = 0;
        int i8 = 0;
        long j7 = 0;
        while (i8 < i4) {
            int i9 = i + i8;
            long j8 = j6;
            int i10 = i2 + i8;
            int i11 = iM14442;
            long j9 = iArr[i9];
            long j10 = iArr2[i10];
            int i12 = i3 + i8;
            long jM23418 = C10050.m23418(iArr3[i12], toUnsignedLong(iM14441), (j10 * j2) + (j9 * j5), j7);
            long jM23419 = C10050.m23418(iArr3[i12], toUnsignedLong(i11), (j9 * j3) + (j10 * j4), j8);
            if (i8 > 0) {
                iArr[i9 - 1] = ((int) jM23418) & Integer.MAX_VALUE;
                iArr2[i10 - 1] = ((int) jM23419) & Integer.MAX_VALUE;
            }
            j7 = jM23418 >> 31;
            j6 = jM23419 >> 31;
            i8++;
            iM14442 = i11;
            j5 = j;
        }
        long j11 = j7;
        iArr[(i + i4) - 1] = (int) j11;
        iArr2[(i2 + i4) - 1] = (int) j6;
        zint_finish_mod(iArr, i, i4, iArr3, i3, (int) (j11 >>> 63));
        zint_finish_mod(iArr2, i2, i4, iArr3, i3, (int) (j6 >>> 63));
    }

    public static void zint_finish_mod(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = ((iArr[i + i6] - iArr2[i3 + i6]) - i5) >>> 31;
        }
        int i7 = (-i4) >>> 1;
        int i8 = -((1 - i5) | i4);
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i + i9;
            int i11 = (iArr[i10] - ((iArr2[i3 + i9] ^ i7) & i8)) - i4;
            iArr[i10] = Integer.MAX_VALUE & i11;
            i4 = i11 >>> 31;
        }
    }

    public static int zint_mod_small_signed(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 0) {
            return 0;
        }
        return modp_sub(zint_mod_small_unsigned(iArr, i, i2, i3, i4, i5), (-(iArr[(i + i2) - 1] >>> 30)) & i6, i3);
    }

    public static int zint_mod_small_unsigned(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int iModp_add = 0;
        while (true) {
            int i6 = i2 - 1;
            if (i2 <= 0) {
                return iModp_add;
            }
            int iModp_montymul = modp_montymul(iModp_add, i5, i3, i4);
            int i7 = iArr[i + i6] - i3;
            iModp_add = modp_add(iModp_montymul, i7 + ((-(i7 >>> 31)) & i3), i3);
            i2 = i6;
        }
    }

    public static int zint_mul_small(int[] iArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i + i5;
            long unsignedLong = (toUnsignedLong(iArr[i6]) * toUnsignedLong(i3)) + ((long) i4);
            iArr[i6] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i4 = (int) (unsignedLong >> 31);
        }
        return i4;
    }

    public static void zint_negate(int[] iArr, int i, int i2, int i3) {
        int i4 = (-i3) >>> 1;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i + i5;
            int i7 = (iArr[i6] ^ i4) + i3;
            iArr[i6] = Integer.MAX_VALUE & i7;
            i3 = i7 >>> 31;
        }
    }

    public static void zint_norm_zero(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = i3;
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0) {
                zint_sub(iArr, i, iArr2, i2, i3, i4 >>> 31);
                return;
            }
            int i8 = iArr[i + i7];
            int i9 = iArr2[i2 + i7];
            int i10 = ((i5 << 30) | (i9 >>> 1)) - i8;
            i4 |= ((-(i10 >>> 31)) | ((-i10) >>> 31)) & ((i4 & 1) - 1);
            i6 = i7;
            i5 = i9 & 1;
        }
    }

    public static int zint_one_to_plain(int[] iArr, int i) {
        int i2 = iArr[i];
        return i2 | ((1073741824 & i2) << 1);
    }

    public static void zint_rebuild_CRT(int[] iArr, int i, int i2, int i3, int i4, int i5, int[] iArr2, int i6) {
        iArr2[i6] = FalconSmallPrimeList.PRIMES[0].f81602p;
        for (int i7 = 1; i7 < i2; i7++) {
            FalconSmallPrime falconSmallPrime = FalconSmallPrimeList.PRIMES[i7];
            int i8 = falconSmallPrime.f81602p;
            int i9 = falconSmallPrime.f81603s;
            int iModp_ninv31 = modp_ninv31(i8);
            int iModp_R2 = modp_R2(i8, iModp_ninv31);
            int i10 = i;
            int i11 = 0;
            while (i11 < i4) {
                int i12 = i10;
                int i13 = i11;
                zint_add_mul_small(iArr, i12, iArr2, i6, i7, modp_montymul(i9, modp_sub(iArr[i10 + i7], zint_mod_small_unsigned(iArr, i12, i7, i8, iModp_ninv31, iModp_R2), i8), i8, iModp_ninv31));
                i11 = i13 + 1;
                i10 += i3;
            }
            iArr2[i6 + i7] = zint_mul_small(iArr2, i6, i7, i8);
        }
        if (i5 != 0) {
            int i14 = i;
            int i15 = 0;
            while (i15 < i4) {
                zint_norm_zero(iArr, i14, iArr2, i6, i2);
                i15++;
                i14 += i3;
            }
        }
    }

    public static void zint_sub(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4) {
        int i5 = -i4;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = i + i7;
            int i9 = iArr[i8];
            int i10 = (i9 - iArr2[i2 + i7]) - i6;
            i6 = i10 >>> 31;
            iArr[i8] = i9 ^ (((i10 & Integer.MAX_VALUE) ^ i9) & i5);
        }
    }

    public static void zint_sub_scaled(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6) {
        if (i4 == 0) {
            return;
        }
        int i7 = (-(iArr2[(i3 + i4) - 1] >>> 30)) >>> 1;
        int i8 = 0;
        int i9 = 0;
        int i10 = i5;
        while (i10 < i2) {
            int i11 = i10 - i5;
            int i12 = i11 < i4 ? iArr2[i11 + i3] : i7;
            int i13 = i + i10;
            int i14 = (iArr[i13] - (i8 | ((i12 << i6) & Integer.MAX_VALUE))) - i9;
            iArr[i13] = i14 & Integer.MAX_VALUE;
            i9 = i14 >>> 31;
            i10++;
            i8 = i12 >>> (31 - i6);
        }
    }
}
