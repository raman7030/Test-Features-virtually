package org.bouncycastle.pqc.crypto.hqc;

import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: loaded from: classes2.dex */
public class HQCParameters implements KEMParameters {
    public static final int GF_MUL_ORDER = 255;
    public static final int PARAM_M = 8;
    public static final HQCParameters hqc128 = new HQCParameters("hqc-128", 17669, 46, MLKEMEngine.KyberPolyBytes, 16, 31, 15, 66, 75, 4, 243079, 2241, 2321, new int[]{89, 69, 153, 116, PicnicEngine.MAX_AUX_BYTES, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, UMErrorCode.E_UM_BE_CREATE_FAILED, 75, 73, 233, 242, 233, 65, 210, 21, 139, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 173, 67, 118, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 210, 174, UMErrorCode.E_UM_BE_JSON_FAILED, 74, 69, 228, 82, 255, 181, 1});
    public static final HQCParameters hqc192 = new HQCParameters("hqc-192", 35851, 56, 640, 24, 33, 16, 100, 114, 5, 119800, 4514, 4602, new int[]{45, 216, 239, 24, 253, IShizukuService.Stub.TRANSACTION_isHidden, 27, 40, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 50, 163, 210, 227, 134, BERTags.FLAGS, 158, 119, 13, 158, 1, 238, 164, 82, 43, 15, 232, 246, 142, 50, 189, 29, 232, 1});
    public static final HQCParameters hqc256 = new HQCParameters("hqc-256", 57637, 90, 640, 32, 59, 29, 131, 149, 5, 74517, 7237, 7333, new int[]{49, 167, 49, 39, 200, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 124, 91, 240, 63, 148, 71, 150, 123, 87, 101, 32, 215, 159, 71, 201, 115, 97, 210, 186, 183, 141, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 123, 12, 31, 243, 180, 219, 152, 239, 99, 141, 4, 246, 191, 144, 8, 232, 47, 27, 141, 178, 130, 64, 124, 47, 39, 188, 216, 48, 199, 187, 1});
    public final HQCEngine hqcEngine;

    /* JADX INFO: renamed from: n */
    public final int f81629n;

    /* JADX INFO: renamed from: n1 */
    public final int f81630n1;

    /* JADX INFO: renamed from: n2 */
    public final int f81631n2;
    public final String name;
    public final int publicKeyBytes;
    public final int secretKeyBytes;

    public HQCParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        this.name = str;
        this.f81629n = i;
        this.f81630n1 = i2;
        this.f81631n2 = i3;
        this.publicKeyBytes = i11;
        this.secretKeyBytes = i12;
        this.hqcEngine = new HQCEngine(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, iArr);
    }

    public HQCEngine getEngine() {
        return this.hqcEngine;
    }

    public int getN1N2_BYTES() {
        return ((this.f81630n1 * this.f81631n2) + 7) / 8;
    }

    public int getN_BYTES() {
        return (this.f81629n + 7) / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getSALT_SIZE_BYTES() {
        return 16;
    }

    public int getSHA512_BYTES() {
        return 64;
    }

    public int getSecretKeyBytes() {
        return this.secretKeyBytes;
    }

    public int getSessionKeySize() {
        return 256;
    }
}
