package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.᩹֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3NK */
/* JADX INFO: loaded from: classes.dex */
public final class C23228 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m51776(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51775(byte b, byte b2, char[] cArr, int i) throws C4293 {
        if (b < -62 || m51776(b2)) {
            throw C4293.m8709();
        }
        cArr[i] = (char) (((b & C0684bo.f2505j) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51774(byte b, byte b2, byte b3, char[] cArr, int i) throws C4293 {
        if (m51776(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m51776(b3)))) {
            throw C4293.m8709();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51773(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C4293 {
        if (!m51776(b2)) {
            if ((((b2 + KeyFactorySpi.Ed25519_type) + (b << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) >> 30) == 0 && !m51776(b3) && !m51776(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw C4293.m8709();
    }
}
