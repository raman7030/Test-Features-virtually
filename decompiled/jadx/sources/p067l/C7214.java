package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.analytics.pro.C0713i;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۚۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97YD */
/* JADX INFO: loaded from: classes2.dex */
public final class C7214 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f18829;

    /* JADX INFO: renamed from: ۧ */
    public int[] f18830;

    /* JADX INFO: renamed from: ܳ */
    public int[] f18831;

    /* JADX INFO: renamed from: ܽ */
    public int[] f18832;

    /* JADX INFO: renamed from: ܿ */
    public int[] f18833;

    /* JADX INFO: renamed from: ᩳ */
    public int[] f18834;

    /* JADX INFO: renamed from: ܺ */
    public static final int[] f18826 = {96, 7, 256, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 0, 8, 48, 0, 9, 192, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, 9, DHParameters.DEFAULT_MINIMUM_LENGTH, 0, 8, 0, 0, 8, 128, 0, 8, 64, 0, 9, BERTags.FLAGS, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, 9, 144, 83, 7, 59, 0, 8, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 0, 8, 56, 0, 9, 208, 81, 7, 17, 0, 8, IShizukuService.Stub.TRANSACTION_isHidden, 0, 8, 40, 0, 9, PicnicEngine.MAX_AUX_BYTES, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, 9, 240, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, 9, 200, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, 9, 168, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, 9, 232, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, 9, 152, 84, 7, 83, 0, 8, 124, 0, 8, 60, 0, 9, 216, 82, 7, 23, 0, 8, 108, 0, 8, 44, 0, 9, 184, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, 9, 248, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, 9, 196, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, 9, 164, 0, 8, 2, 0, 8, 130, 0, 8, 66, 0, 9, 228, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, 9, 148, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, 9, 212, 82, 7, 19, 0, 8, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 0, 8, 42, 0, 9, 180, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, 9, 244, 80, 7, 5, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, 9, 204, 81, 7, 15, 0, 8, IShizukuService.Stub.TRANSACTION_attachUserService, 0, 8, 38, 0, 9, 172, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, 9, 236, 80, 7, 9, 0, 8, 94, 0, 8, 30, 0, 9, 156, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, 9, 220, 82, 7, 27, 0, 8, UMErrorCode.E_UM_BE_JSON_FAILED, 0, 8, 46, 0, 9, 188, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, 9, 252, 96, 7, 256, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 0, 8, 49, 0, 9, 194, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, 9, 162, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, 9, 226, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, 9, 146, 83, 7, 59, 0, 8, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 0, 8, 57, 0, 9, 210, 81, 7, 17, 0, 8, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 0, 8, 41, 0, 9, 178, 0, 8, 9, 0, 8, 137, 0, 8, 73, 0, 9, 242, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 0, 8, 53, 0, 9, 202, 81, 7, 13, 0, 8, 101, 0, 8, 37, 0, 9, 170, 0, 8, 5, 0, 8, 133, 0, 8, 69, 0, 9, 234, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, 9, EnumC19222.f57460, 84, 7, 83, 0, 8, C0254q.f1218h, 0, 8, 61, 0, 9, 218, 82, 7, 23, 0, 8, 109, 0, 8, 45, 0, 9, 186, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, 9, 250, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, 9, 198, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, 9, 166, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, 9, 230, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, 9, 150, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, 9, 214, 82, 7, 19, 0, 8, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 0, 8, 43, 0, 9, 182, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, 9, 246, 80, 7, 5, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, 9, 206, 81, 7, 15, 0, 8, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 0, 8, 39, 0, 9, 174, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, 9, 238, 80, 7, 9, 0, 8, 95, 0, 8, 31, 0, 9, 158, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, 9, 222, 82, 7, 27, 0, 8, UMErrorCode.E_UM_BE_CREATE_FAILED, 0, 8, 47, 0, 9, 190, 0, 8, 15, 0, 8, 143, 0, 8, 79, 0, 9, Scalar25519.TARGET_LENGTH, 96, 7, 256, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 0, 8, 48, 0, 9, 193, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, 9, 161, 0, 8, 0, 0, 8, 128, 0, 8, 64, 0, 9, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, 9, 145, 83, 7, 59, 0, 8, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 0, 8, 56, 0, 9, 209, 81, 7, 17, 0, 8, IShizukuService.Stub.TRANSACTION_isHidden, 0, 8, 40, 0, 9, 177, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, 9, 241, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, 9, 201, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, 9, 169, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, 9, 233, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, 9, 153, 84, 7, 83, 0, 8, 124, 0, 8, 60, 0, 9, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 82, 7, 23, 0, 8, 108, 0, 8, 44, 0, 9, 185, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, 9, 249, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, 9, 197, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, 9, 165, 0, 8, 2, 0, 
    8, 130, 0, 8, 66, 0, 9, 229, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, 9, 149, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, 9, 213, 82, 7, 19, 0, 8, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 0, 8, 42, 0, 9, 181, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, 9, 245, 80, 7, 5, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, 9, 205, 81, 7, 15, 0, 8, IShizukuService.Stub.TRANSACTION_attachUserService, 0, 8, 38, 0, 9, 173, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, 9, 237, 80, 7, 9, 0, 8, 94, 0, 8, 30, 0, 9, 157, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, 9, 221, 82, 7, 27, 0, 8, UMErrorCode.E_UM_BE_JSON_FAILED, 0, 8, 46, 0, 9, 189, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, 9, 253, 96, 7, 256, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 0, 8, 49, 0, 9, 195, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, 9, 163, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, 9, 227, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, 9, 147, 83, 7, 59, 0, 8, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 0, 8, 57, 0, 9, Primes.SMALL_FACTOR_LIMIT, 81, 7, 17, 0, 8, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 0, 8, 41, 0, 9, 179, 0, 8, 9, 0, 8, 137, 0, 8, 73, 0, 9, 243, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 0, 8, 53, 0, 9, 203, 81, 7, 13, 0, 8, 101, 0, 8, 37, 0, 9, 171, 0, 8, 5, 0, 8, 133, 0, 8, 69, 0, 9, 235, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, 9, 155, 84, 7, 83, 0, 8, C0254q.f1218h, 0, 8, 61, 0, 9, 219, 82, 7, 23, 0, 8, 109, 0, 8, 45, 0, 9, 187, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, 9, 251, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, 9, 199, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, 9, 167, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, 9, 231, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, 9, 151, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, 9, 215, 82, 7, 19, 0, 8, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 0, 8, 43, 0, 9, 183, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, 9, 247, 80, 7, 5, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, 9, 207, 81, 7, 15, 0, 8, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 0, 8, 39, 0, 9, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, 9, 239, 80, 7, 9, 0, 8, 95, 0, 8, 31, 0, 9, 159, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, 9, 223, 82, 7, 27, 0, 8, UMErrorCode.E_UM_BE_CREATE_FAILED, 0, 8, 47, 0, 9, 191, 0, 8, 15, 0, 8, 143, 0, 8, 79, 0, 9, 255};

    /* JADX INFO: renamed from: ۡ */
    public static final int[] f18824 = {80, 5, 1, 87, 5, 257, 83, 5, 17, 91, 5, C0719o.a.f2895a, 81, 5, 5, 89, 5, 1025, 85, 5, 65, 93, 5, 16385, 80, 5, 3, 88, 5, 513, 84, 5, 33, 92, 5, C0719o.a.f2911q, 82, 5, 9, 90, 5, C0713i.f2746a, 86, 5, 129, 192, 5, UMModuleRegister.SHARE_EVENT_VALUE_LOW, 80, 5, 2, 87, 5, 385, 83, 5, 25, 91, 5, 6145, 81, 5, 7, 89, 5, 1537, 85, 5, 97, 93, 5, UMModuleRegister.SHARE_EVENT_VALUE_LOW, 80, 5, 4, 88, 5, 769, 84, 5, 49, 92, 5, 12289, 82, 5, 13, 90, 5, 3073, 86, 5, 193, 192, 5, UMModuleRegister.SHARE_EVENT_VALUE_LOW};

    /* JADX INFO: renamed from: ᩷ */
    public static final int[] f18827 = {3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};

    /* JADX INFO: renamed from: ۢ */
    public static final int[] f18825 = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED, UMErrorCode.E_UM_BE_DEFLATE_FAILED};

    /* JADX INFO: renamed from: ۜ */
    public static final int[] f18823 = {1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, C0713i.f2746a, 3073, C0719o.a.f2895a, 6145, C0719o.a.f2911q, 12289, 16385, UMModuleRegister.SHARE_EVENT_VALUE_LOW};

    /* JADX INFO: renamed from: ᩻ */
    public static final int[] f18828 = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* JADX WARN: Code duplicated, block: B:67:0x00ec A[EDGE_INSN: B:67:0x00ec->B:68:0x00ee BREAK  A[LOOP:9: B:61:0x00d7->B:66:0x00e8], PHI: r8 r14
      0x00ec: PHI (r8v34 int) = (r8v7 int), (r8v7 int), (r8v40 int) binds: [B:57:0x00d0, B:59:0x00d3, B:128:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r14v8 int) = (r14v7 int), (r14v7 int), (r14v17 int) binds: [B:57:0x00d0, B:59:0x00d3, B:128:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    private int m16554(int[] iArr, int i, int i2, int i3, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8) {
        int[] iArr9;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = i2;
        do {
            iArr9 = this.f18829;
            int i10 = iArr[i + i8];
            iArr9[i10] = iArr9[i10] + 1;
            i8++;
            i4 = -1;
            i9--;
        } while (i9 != 0);
        if (iArr9[0] == i2) {
            iArr4[0] = -1;
            iArr5[0] = 0;
            return 0;
        }
        int i11 = iArr5[0];
        int i12 = 1;
        while (i12 <= 15 && this.f18829[i12] == 0) {
            i12++;
        }
        if (i11 < i12) {
            i11 = i12;
        }
        int i13 = 15;
        while (i13 != 0 && this.f18829[i13] == 0) {
            i13--;
        }
        int i14 = i11 > i13 ? i13 : i11;
        iArr5[0] = i14;
        int i15 = 1 << i12;
        int i16 = i12;
        while (i16 < i13) {
            int i17 = i15 - this.f18829[i16];
            if (i17 < 0) {
                return -3;
            }
            i16++;
            i15 = i17 << 1;
        }
        int[] iArr10 = this.f18829;
        int i18 = iArr10[i13];
        int i19 = i15 - i18;
        if (i19 < 0) {
            return -3;
        }
        iArr10[i13] = i18 + i19;
        this.f18831[1] = 0;
        int i20 = 2;
        int i21 = 0;
        int i22 = 1;
        int i23 = i13;
        while (true) {
            i23 += i4;
            if (i23 == 0) {
                break;
            }
            int[] iArr11 = this.f18831;
            i21 += this.f18829[i22];
            iArr11[i20] = i21;
            i20++;
            i22++;
            i4 = -1;
        }
        int i24 = 0;
        int i25 = 0;
        while (true) {
            int i26 = iArr[i + i24];
            if (i26 != 0) {
                int[] iArr12 = this.f18831;
                int i27 = iArr12[i26];
                iArr12[i26] = i27 + 1;
                iArr8[i27] = i25;
            }
            i24++;
            i25++;
            if (i25 >= i2) {
                break;
            }
            i3 = i3;
        }
        int[] iArr13 = this.f18831;
        int i28 = iArr13[i13];
        iArr13[0] = 0;
        int i29 = -i14;
        this.f18834[0] = 0;
        int i30 = 0;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (i12 <= i13) {
            int i35 = this.f18829[i12];
            while (true) {
                int i36 = i35 - 1;
                if (i35 != 0) {
                    while (true) {
                        int i37 = i29 + i14;
                        if (i12 > i37) {
                            int i38 = i31 + 1;
                            int i39 = i13 - i37;
                            if (i39 > i14) {
                                i39 = i14;
                            }
                            int i40 = i12 - i37;
                            int i41 = i13;
                            int i42 = 1 << i40;
                            if (i42 <= i35) {
                                i7 = i35;
                                break;
                            }
                            int i43 = i42 - i35;
                            if (i40 >= i39) {
                                i7 = i35;
                                break;
                            }
                            int i44 = i12;
                            while (true) {
                                i40++;
                                if (i40 >= i39) {
                                    i7 = i35;
                                    break;
                                }
                                int i45 = i43 << 1;
                                i7 = i35;
                                i44++;
                                int i46 = this.f18829[i44];
                                if (i45 <= i46) {
                                    break;
                                }
                                i43 = i45 - i46;
                                i35 = i7;
                            }
                            int i47 = 1 << i40;
                            i33 = iArr7[0];
                            int i48 = i19;
                            if (i33 + i47 > 1440) {
                                return -3;
                            }
                            int[] iArr14 = this.f18834;
                            iArr14[i38] = i33;
                            iArr7[0] = iArr7[0] + i47;
                            if (i38 != 0) {
                                this.f18831[i38] = i30;
                                int[] iArr15 = this.f18832;
                                iArr15[0] = (byte) i40;
                                iArr15[1] = (byte) i14;
                                int i49 = i30 >>> (i37 - i14);
                                iArr15[2] = (i33 - iArr14[i31]) - i49;
                                System.arraycopy(iArr15, 0, iArr6, (iArr14[i31] + i49) * 3, 3);
                            } else {
                                iArr4[0] = i33;
                            }
                            i35 = i7;
                            i31 = i38;
                            i34 = i47;
                            i29 = i37;
                            i19 = i48;
                            i13 = i41;
                        }
                    }
                    int i50 = i13;
                    int i51 = i19;
                    int[] iArr16 = this.f18832;
                    int i52 = i12 - i29;
                    iArr16[1] = (byte) i52;
                    if (i32 >= i28) {
                        iArr16[0] = 192;
                        i6 = 1;
                    } else {
                        int i53 = iArr8[i32];
                        if (i53 < i3) {
                            iArr16[0] = (byte) (i53 < 256 ? 0 : 96);
                            i5 = i32 + 1;
                            iArr16[2] = iArr8[i32];
                        } else {
                            iArr16[0] = (byte) (iArr3[i53 - i3] + 80);
                            i5 = i32 + 1;
                            iArr16[2] = iArr2[iArr8[i32] - i3];
                        }
                        i32 = i5;
                        i6 = 1;
                    }
                    int i54 = i6 << i52;
                    int i55 = i30 >>> i29;
                    while (i55 < i34) {
                        System.arraycopy(this.f18832, 0, iArr6, (i33 + i55) * 3, 3);
                        i55 += i54;
                        i30 = i30;
                    }
                    int i56 = 1 << (i12 - 1);
                    int i57 = i30;
                    while ((i57 & i56) != 0) {
                        i57 ^= i56;
                        i56 >>>= 1;
                    }
                    int i58 = i56 ^ i57;
                    while ((((1 << i29) - 1) & i58) != this.f18831[i31]) {
                        i31--;
                        i29 -= i14;
                    }
                    i30 = i58;
                    i35 = i36;
                    i19 = i51;
                    i13 = i50;
                    i3 = i3;
                }
            }
            i12++;
            i3 = i3;
        }
        return (i19 == 0 || i13 == 1) ? 0 : -5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16557(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, C16601 c16601) {
        m16555(19);
        int[] iArr5 = this.f18830;
        iArr5[0] = 0;
        int iM16554 = m16554(iArr, 0, 19, 19, null, null, iArr3, iArr2, iArr4, iArr5, this.f18833);
        if (iM16554 == -3) {
            c16601.f66995 = "oversubscribed dynamic bit lengths tree";
            return iM16554;
        }
        if (iM16554 != -5 && iArr2[0] != 0) {
            return iM16554;
        }
        c16601.f66995 = "incomplete dynamic bit lengths tree";
        return -3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16556(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, C16601 c16601) {
        m16555(288);
        int[] iArr7 = this.f18830;
        iArr7[0] = 0;
        int iM16554 = m16554(iArr, 0, i, 257, f18827, f18825, iArr4, iArr2, iArr6, iArr7, this.f18833);
        if (iM16554 != 0 || iArr2[0] == 0) {
            if (iM16554 == -3) {
                c16601.f66995 = "oversubscribed literal/length tree";
                return iM16554;
            }
            if (iM16554 == -4) {
                return iM16554;
            }
            c16601.f66995 = "incomplete literal/length tree";
            return -3;
        }
        m16555(288);
        int iM16555 = m16554(iArr, i, i2, 0, f18823, f18828, iArr5, iArr3, iArr6, this.f18830, this.f18833);
        if (iM16555 == 0 && (iArr3[0] != 0 || i <= 257)) {
            return 0;
        }
        if (iM16555 == -3) {
            c16601.f66995 = "oversubscribed distance tree";
            return iM16555;
        }
        if (iM16555 == -5) {
            c16601.f66995 = "incomplete distance tree";
            return -3;
        }
        if (iM16555 == -4) {
            return iM16555;
        }
        c16601.f66995 = "empty distance tree with lengths";
        return -3;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16555(int i) {
        if (this.f18830 == null) {
            this.f18830 = new int[1];
            this.f18833 = new int[i];
            this.f18829 = new int[16];
            this.f18832 = new int[3];
            this.f18834 = new int[15];
            this.f18831 = new int[16];
        }
        if (this.f18833.length < i) {
            this.f18833 = new int[i];
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f18833[i2] = 0;
        }
        for (int i3 = 0; i3 < 16; i3++) {
            this.f18829[i3] = 0;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            this.f18832[i4] = 0;
        }
        System.arraycopy(this.f18829, 0, this.f18834, 0, 15);
        System.arraycopy(this.f18829, 0, this.f18831, 0, 16);
    }
}
