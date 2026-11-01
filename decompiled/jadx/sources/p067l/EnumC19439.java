package p067l;

import com.alipay.sdk.p010m.p050t0.C0215b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5JO */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC19439 {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(IShizukuService.Stub.TRANSACTION_attachUserService, "Failed to read from given input"),
    NOT_GIF_FILE(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, "Data is not in GIF format"),
    NO_SCRN_DSCR(IShizukuService.Stub.TRANSACTION_isHidden, "No screen descriptor detected"),
    NO_IMAG_DSCR(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, "No image descriptor detected"),
    NO_COLOR_MAP(IShizukuService.Stub.TRANSACTION_getFlagsForUid, "Neither global nor local color map found"),
    WRONG_RECORD(IShizukuService.Stub.TRANSACTION_updateFlagsForUid, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(UMErrorCode.E_UM_BE_JSON_FAILED, "Failed to close given input"),
    NOT_READABLE(UMErrorCode.E_UM_BE_CREATE_FAILED, "Given file was not opened for read"),
    IMAGE_DEFECT(UMErrorCode.E_UM_BE_DEFLATE_FAILED, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(UMErrorCode.E_UM_BE_RAW_OVERSIZE, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(C0215b.f1000c, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(C0215b.f1001d, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");


    /* JADX INFO: renamed from: ᩸ */
    public final String f59211;

    /* JADX INFO: renamed from: ᩹ */
    public int f59212;

    EnumC19439(int i, String str) {
        this.f59212 = i;
        this.f59211 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC19439 m44202(int i) {
        for (EnumC19439 enumC19439 : values()) {
            if (enumC19439.f59212 == i) {
                return enumC19439;
            }
        }
        EnumC19439 enumC194310 = UNKNOWN;
        enumC194310.f59212 = i;
        return enumC194310;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m44204() {
        return this.f59212;
    }

    /* JADX INFO: renamed from: ۧ */
    public String m44205() {
        Locale locale = Locale.ENGLISH;
        return "GifError " + this.f59212 + ": " + this.f59211;
    }
}
