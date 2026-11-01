package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.᩹ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76BA */
/* JADX INFO: loaded from: classes.dex */
public final class C23308 {

    /* JADX INFO: renamed from: ֫ */
    public short[] f73348;

    /* JADX INFO: renamed from: ۧ */
    public int f73349;

    /* JADX INFO: renamed from: ܽ */
    public C22638 f73350;

    /* JADX INFO: renamed from: ۡ */
    public static final int[] f73341 = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};

    /* JADX INFO: renamed from: ۢ */
    public static final int[] f73342 = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* JADX INFO: renamed from: ᩷ */
    public static final int[] f73346 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 7};

    /* JADX INFO: renamed from: ۜ */
    public static final byte[] f73340 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, C0698cb.f2569k, 2, C0698cb.f2570l, 1, 15};

    /* JADX INFO: renamed from: ᩳ */
    public static final byte[] f73345 = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 0, 0, 16, 17, 18, 18, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29};

    /* JADX INFO: renamed from: ܿ */
    public static final byte[] f73344 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2569k, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, C0698cb.f2570l, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB};

    /* JADX INFO: renamed from: ᩻ */
    public static final int[] f73347 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 0};

    /* JADX INFO: renamed from: ܳ */
    public static final int[] f73343 = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, MLKEMEngine.KyberPolyBytes, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v21, types: [short] */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX INFO: renamed from: ֫ */
    public final void m51911(C17271 c17271) {
        int i;
        short[] sArr;
        short s;
        int i2;
        int i3;
        int i4;
        short[] sArr2 = this.f73348;
        C22638 c22638 = this.f73350;
        short[] sArr3 = c22638.f71425;
        int i5 = c22638.f71422;
        c17271.f51463 = 0;
        int i6 = 573;
        c17271.f51422 = 573;
        int i7 = -1;
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = i8 * 2;
            if (sArr2[i9] != 0) {
                int[] iArr = c17271.f51441;
                int i10 = c17271.f51463 + 1;
                c17271.f51463 = i10;
                iArr[i10] = i8;
                c17271.f51433[i8] = 0;
                i7 = i8;
            } else {
                sArr2[i9 + 1] = 0;
            }
        }
        while (true) {
            i = c17271.f51463;
            if (i >= 2) {
                break;
            }
            int[] iArr2 = c17271.f51441;
            int i11 = i + 1;
            c17271.f51463 = i11;
            if (i7 < 2) {
                i4 = i7 + 1;
                i3 = i4;
            } else {
                i3 = i7;
                i4 = 0;
            }
            iArr2[i11] = i4;
            int i12 = i4 * 2;
            sArr2[i12] = 1;
            c17271.f51433[i4] = 0;
            c17271.f51415--;
            if (sArr3 != null) {
                c17271.f51425 -= sArr3[i12 + 1];
            }
            i7 = i3;
        }
        this.f73349 = i7;
        for (int i13 = i / 2; i13 >= 1; i13--) {
            c17271.m39108(sArr2, i13);
        }
        while (true) {
            int[] iArr3 = c17271.f51441;
            int i14 = iArr3[1];
            int i15 = c17271.f51463;
            c17271.f51463 = i15 - 1;
            iArr3[1] = iArr3[i15];
            c17271.m39108(sArr2, 1);
            int[] iArr4 = c17271.f51441;
            int i16 = iArr4[1];
            int i17 = c17271.f51422;
            int i18 = i17 - 1;
            c17271.f51422 = i18;
            iArr4[i18] = i14;
            int i19 = i17 - 2;
            c17271.f51422 = i19;
            iArr4[i19] = i16;
            int i20 = i14 * 2;
            int i21 = i16 * 2;
            sArr2[i5 * 2] = (short) (sArr2[i20] + sArr2[i21]);
            byte[] bArr = c17271.f51433;
            bArr[i5] = (byte) (Math.max((int) bArr[i14], (int) bArr[i16]) + 1);
            short s2 = (short) i5;
            sArr2[i21 + 1] = s2;
            sArr2[i20 + 1] = s2;
            int i22 = i5 + 1;
            c17271.f51441[1] = i5;
            c17271.m39108(sArr2, 1);
            if (c17271.f51463 < 2) {
                break;
            } else {
                i5 = i22;
            }
        }
        int[] iArr5 = c17271.f51441;
        int i23 = c17271.f51422 - 1;
        c17271.f51422 = i23;
        iArr5[i23] = iArr5[1];
        short[] sArr4 = this.f73348;
        C22638 c22639 = this.f73350;
        short[] sArr5 = c22639.f71425;
        int[] iArr6 = c22639.f71424;
        int i24 = c22639.f71423;
        int i25 = c22639.f71426;
        for (int i26 = 0; i26 <= 15; i26++) {
            c17271.f51453[i26] = 0;
        }
        int[] iArr7 = c17271.f51441;
        int i27 = c17271.f51422;
        sArr4[(iArr7[i27] * 2) + 1] = 0;
        int i28 = i27 + 1;
        int i29 = 0;
        while (i28 < i6) {
            int i30 = c17271.f51441[i28];
            int i31 = i30 * 2;
            int i32 = i31 + 1;
            int i33 = sArr4[(sArr4[i32] * 2) + 1] + 1;
            if (i33 > i25) {
                i29++;
                i33 = i25;
            }
            sArr4[i32] = (short) i33;
            if (i30 > this.f73349) {
                i2 = i29;
            } else {
                short[] sArr6 = c17271.f51453;
                i2 = i29;
                sArr6[i33] = (short) (sArr6[i33] + 1);
                int i34 = i30 >= i24 ? iArr6[i30 - i24] : 0;
                short s3 = sArr4[i31];
                c17271.f51415 = C21466.m48630(i33, i34, s3, c17271.f51415);
                if (sArr5 != null) {
                    c17271.f51425 = C21466.m48630(sArr5[i32], i34, s3, c17271.f51425);
                }
            }
            i28++;
            i6 = 573;
            i29 = i2;
        }
        if (i29 != 0) {
            do {
                int i35 = i25 - 1;
                while (true) {
                    sArr = c17271.f51453;
                    s = sArr[i35];
                    if (s != 0) {
                        break;
                    } else {
                        i35--;
                    }
                }
                sArr[i35] = (short) (s - 1);
                int i36 = i35 + 1;
                sArr[i36] = (short) (sArr[i36] + 2);
                sArr[i25] = (short) (sArr[i25] - 1);
                i29 -= 2;
            } while (i29 > 0);
            while (i25 != 0) {
                short s4 = c17271.f51453[i25];
                while (s4 != 0) {
                    i28--;
                    int i37 = c17271.f51441[i28];
                    if (i37 <= this.f73349) {
                        int i38 = i37 * 2;
                        int i39 = i38 + 1;
                        short s5 = sArr4[i39];
                        if (s5 != i25) {
                            c17271.f51415 += (int) ((((long) i25) - ((long) s5)) * ((long) sArr4[i38]));
                            sArr4[i39] = (short) i25;
                        }
                        s4--;
                        i28 = i28;
                    }
                }
                i25--;
            }
        }
        short[] sArr7 = c17271.f51453;
        short[] sArr8 = c17271.f51454;
        sArr8[0] = 0;
        short s6 = 0;
        for (int i40 = 1; i40 <= 15; i40++) {
            s6 = (short) ((s6 + sArr7[i40 - 1]) << 1);
            sArr8[i40] = s6;
        }
        for (int i41 = 0; i41 <= i7; i41++) {
            int i42 = i41 * 2;
            short s7 = sArr2[i42 + 1];
            if (s7 != 0) {
                short s8 = sArr8[s7];
                sArr8[s7] = (short) (s8 + 1);
                int i43 = 0;
                do {
                    int i44 = i43 | (s8 & 1);
                    s8 >>>= 1;
                    i43 = i44 << 1;
                    s7--;
                } while (s7 > 0);
                sArr2[i42] = (short) (i43 >>> 1);
            }
        }
    }
}
