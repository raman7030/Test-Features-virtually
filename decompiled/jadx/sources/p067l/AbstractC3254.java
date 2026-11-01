package p067l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.֨ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3254 extends AbstractC11527 {
    /* JADX INFO: renamed from: ܶ */
    public final boolean m5667() {
        int iMo8405 = this.f32157.mo8405(1);
        if (iMo8405 == 26 || iMo8405 == 30 || iMo8405 == 38 || iMo8405 == 45 || iMo8405 == 47) {
            return false;
        }
        switch (iMo8405) {
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return false;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m5666(C22031 c22031) {
        int size = c22031.m25011(C5937.class).size();
        if (size == 0) {
            if (c22031.f30091.getType() != 56) {
                return false;
            }
        } else {
            int type = ((C5937) c22031.m25013(C5937.class, size - 1)).f30091.getType();
            if (type != 47 && type != 26) {
                return false;
            }
        }
        return true;
    }
}
