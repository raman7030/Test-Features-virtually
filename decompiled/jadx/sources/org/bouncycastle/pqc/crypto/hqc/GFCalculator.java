package org.bouncycastle.pqc.crypto.hqc;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import l.EnumC17734;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: loaded from: classes2.dex */
public class GFCalculator {
    public static int[] exp = {1, 2, 4, 8, 16, 32, 64, 128, 29, 58, 116, 232, 205, 135, 19, 38, 76, 152, 45, 90, 180, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 234, 201, 143, 3, 6, 12, 24, 48, 96, 192, 157, 39, 78, 156, 37, 74, 148, 53, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 212, 181, 119, 238, 193, 159, 35, 70, 140, 5, 10, 20, 40, 80, DHParameters.DEFAULT_MINIMUM_LENGTH, 93, 186, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 210, 185, UMErrorCode.E_UM_BE_CREATE_FAILED, 222, 161, 95, 190, 97, 194, 153, 47, 94, 188, 101, 202, 137, 15, 30, 60, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 240, 253, 231, Primes.SMALL_FACTOR_LIMIT, 187, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 214, 177, 127, Scalar25519.TARGET_LENGTH, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 223, 163, 91, 182, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 226, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 67, 134, 17, 34, 68, 136, 13, 26, 52, IShizukuService.Stub.TRANSACTION_isHidden, 208, 189, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 206, 129, 31, 62, 124, 248, 237, 199, 147, 59, 118, 236, 197, 151, 51, IShizukuService.Stub.TRANSACTION_attachUserService, 204, 133, 23, 46, 92, 184, 109, 218, 169, 79, 158, 33, 66, 132, 21, 42, 84, 168, 77, EnumC17734.f54268, 41, 82, 164, 85, 170, 73, 146, 57, 114, 228, 213, 183, 115, 230, 209, 191, 99, 198, 145, 63, 126, 252, 229, 215, 179, 123, 246, 241, 255, 227, 219, 171, 75, 150, 49, 98, 196, 149, 55, UMErrorCode.E_UM_BE_JSON_FAILED, 220, 165, 87, 174, 65, 130, 25, 50, 100, 200, 141, 7, 14, 28, 56, UMErrorCode.E_UM_BE_DEFLATE_FAILED, BERTags.FLAGS, 221, 167, 83, 166, 81, 162, 89, 178, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 242, 249, 239, 195, 155, 43, 86, 172, 69, 138, 9, 18, 36, 72, 144, 61, 122, 244, 245, 247, 243, 251, 235, 203, 139, 11, 22, 44, 88, PicnicEngine.MAX_AUX_BYTES, q.h, 250, 233, 207, 131, 27, 54, 108, 216, 173, 71, 142, 1, 2, 4};
    public static int[] log = {0, 0, 1, 25, 2, 50, 26, 198, 3, 223, 51, 238, 27, IShizukuService.Stub.TRANSACTION_isHidden, 199, 75, 4, 100, BERTags.FLAGS, 14, 52, 141, 239, 129, 28, 193, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 248, 200, 8, 76, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 5, 138, 101, 47, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 36, 15, 33, 53, 147, 142, 218, 240, 18, 130, 69, 29, 181, 194, q.h, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 39, 249, 185, 201, EnumC17734.f54268, 9, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 77, 228, 114, 166, 6, 191, 139, 98, IShizukuService.Stub.TRANSACTION_attachUserService, 221, 48, 253, 226, 152, 37, 179, 16, 145, 34, 136, 54, 208, 148, 206, 143, 150, 219, 189, 241, 210, 19, 92, 131, 56, 70, 64, 30, 66, 182, 163, 195, 72, 126, UMErrorCode.E_UM_BE_JSON_FAILED, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 58, 40, 84, 250, 133, 186, 61, 202, 94, 155, 159, 10, 21, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 43, 78, 212, 229, 172, 115, 243, 167, 87, 7, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 192, 247, 140, 128, 99, 13, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 74, 222, 237, 49, 197, Scalar25519.TARGET_LENGTH, 24, 227, 165, 153, 119, 38, 184, 180, 124, 17, 68, 146, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 35, 32, 137, 46, 55, 63, 209, 91, 149, 188, 207, 205, 144, 135, 151, 178, 220, 252, 190, 97, 242, 86, Primes.SMALL_FACTOR_LIMIT, 171, 20, 42, 93, 158, 132, 60, 57, 83, 71, 109, 65, 162, 31, 45, 67, 216, 183, 123, 164, 118, 196, 23, 73, 236, 127, 12, UMErrorCode.E_UM_BE_CREATE_FAILED, 246, 108, 161, 59, 82, 41, 157, 85, 170, 251, 96, 134, 177, 187, 204, 62, 90, 203, 89, 95, PicnicEngine.MAX_AUX_BYTES, 156, 169, DHParameters.DEFAULT_MINIMUM_LENGTH, 81, 11, 245, 22, 235, 122, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 44, 215, 79, 174, 213, 233, 230, 231, 173, 232, 116, 214, 244, 234, 168, 80, 88, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS};

    public static int inverse(int i) {
        return exp[255 - log[i]] & Utils.toUnsigned16Bits((-i) >> 31);
    }

    public static int mod(int i) {
        int unsigned16Bits = Utils.toUnsigned16Bits(i - 255);
        return Utils.toUnsigned16Bits(unsigned16Bits + (Utils.toUnsigned8bits(-(unsigned16Bits >> 15)) & 255));
    }

    public static int mult(int i, int i2) {
        int unsigned16Bits = Utils.toUnsigned16Bits((-i) >> 31) & Utils.toUnsigned16Bits((-i2) >> 31);
        int[] iArr = exp;
        int[] iArr2 = log;
        return Utils.toUnsigned16Bits(iArr[mod(iArr2[i] + iArr2[i2])] & unsigned16Bits);
    }
}
