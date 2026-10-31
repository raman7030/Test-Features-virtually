package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.pqc.crypto.newhope.Params;

/* JADX INFO: renamed from: l.ۡ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8880 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f27031;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f27032;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27033;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f27034;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f27035;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22946() {
        int i;
        int i2;
        int i3;
        int i4 = this.f27031;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f27033;
            int i7 = this.f27034;
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
            int i8 = this.f27033;
            int i9 = this.f27035;
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
            int i10 = this.f27032;
            int i11 = this.f27034;
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
            int i12 = this.f27032;
            int i13 = this.f27035;
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
