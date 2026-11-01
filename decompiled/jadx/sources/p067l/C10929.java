package p067l;

import android.util.Base64;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۡܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10929 {

    /* JADX INFO: renamed from: ֫ */
    public String f30292;

    /* JADX INFO: renamed from: ۜ */
    public String f30293;

    /* JADX INFO: renamed from: ۧ */
    public int f30294;

    /* JADX INFO: renamed from: ܳ */
    public int f30295;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f30296;

    /* JADX INFO: renamed from: ܿ */
    public float f30297;

    /* JADX INFO: renamed from: ᩳ */
    public double f30298;

    /* JADX INFO: renamed from: ᩻ */
    public long f30299;

    public /* synthetic */ C10929(int i) {
        this();
    }

    public C10929() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m25193() {
        switch (this.f30294) {
            case 32:
            case 48:
                return this.f30293;
            case 64:
                return C17633.m40158(this.f30296);
            case 80:
                return Base64.encodeToString(this.f30296, 2);
            case 96:
                return Integer.toString(this.f30295);
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                return Integer.toString(this.f30295, 16);
            case 128:
                return Long.toString(this.f30299);
            case 144:
                return Long.toString(this.f30299, 16);
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                return Float.toString(this.f30297);
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                return Double.toString(this.f30298);
            case 192:
                return "true";
            case 208:
                return "false";
            default:
                return null;
        }
    }
}
