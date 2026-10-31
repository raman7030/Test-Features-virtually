package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBD8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19884 extends C18947 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f64253;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f64254;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4546 f64255;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4546[] f64256;

    public C19884(C20630 c20630) {
        ArrayList arrayListM47190 = c20630.m47190();
        int iM47186 = c20630.m47186();
        this.f64253 = iM47186;
        C4546 c4546 = new C4546(iM47186);
        this.f64255 = c4546;
        this.f64256 = new C4546[arrayListM47190.size()];
        this.f64254 = new HashMap();
        c4546.mo20349();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45714(int i, C4546 c4546) {
        C4546[] c4546Arr = this.f64256;
        try {
            C4546 c4547 = c4546Arr[i];
            if (c4547 == null) {
                m43734();
                try {
                    c4546Arr[i] = c4546;
                    return true;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("bogus index");
                }
            }
            C4546 c4546M13351 = c4547.m13351();
            c4546M13351.m13355(c4546);
            if (c4547.equals(c4546M13351)) {
                return false;
            }
            c4546M13351.mo20349();
            m43734();
            try {
                c4546Arr[i] = c4546M13351;
                return true;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("bogus index");
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45713(AbstractC14278 abstractC14278, C21480 c21480) {
        m43734();
        this.f64254.put(abstractC14278, c21480);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4546 m45712(int i) {
        try {
            C4546 c4546 = this.f64256[i];
            return c4546 != null ? c4546 : this.f64255;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4546 m45715(int i) {
        try {
            C4546 c4546 = this.f64256[i];
            return c4546 != null ? c4546.m13351() : new C4546(this.f64253);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }
}
