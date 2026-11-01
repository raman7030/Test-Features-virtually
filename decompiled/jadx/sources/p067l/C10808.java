package p067l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.pqc.crypto.newhope.Params;

/* JADX INFO: renamed from: l.ۡ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10808 {

    /* JADX INFO: renamed from: ֫ */
    public int f29955;

    /* JADX INFO: renamed from: ۧ */
    public int f29956;

    /* JADX INFO: renamed from: ܽ */
    public int f29957;

    /* JADX INFO: renamed from: ܿ */
    public int f29958;

    /* JADX INFO: renamed from: ᩳ */
    public int f29959;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24917() {
        int i;
        int i2;
        int i3;
        int i4 = this.f29955;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f29957;
            int i7 = this.f29958;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) != 0) {
            int i8 = this.f29957;
            int i9 = this.f29959;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & Params.POLY_BYTES) != 0) {
            int i10 = this.f29956;
            int i11 = this.f29958;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & UMModuleRegister.SHARE_EVENT_VALUE_HIGH) != 0) {
            int i12 = this.f29956;
            int i13 = this.f29959;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
