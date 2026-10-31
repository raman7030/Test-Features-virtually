package l;

import android.util.Base64;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۡܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9007 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f27358;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f27359;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f27360;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f27361;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f27362;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f27363;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f27364;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f27365;

    public /* synthetic */ C9007(int i) {
        this();
    }

    public C9007() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m23249() {
        switch (this.f27360) {
            case 32:
            case 48:
                return this.f27359;
            case 64:
                return C16061.m37970(this.f27362);
            case 80:
                return Base64.encodeToString(this.f27362, 2);
            case 96:
                return Integer.toString(this.f27361);
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                return Integer.toString(this.f27361, 16);
            case 128:
                return Long.toString(this.f27365);
            case 144:
                return Long.toString(this.f27365, 16);
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                return Float.toString(this.f27363);
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                return Double.toString(this.f27364);
            case 192:
                return "true";
            case 208:
                return "false";
            default:
                return null;
        }
    }
}
