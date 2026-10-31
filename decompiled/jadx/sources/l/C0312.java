package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBD8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0312 extends C18947 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f1693;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f1694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4546 f1695;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4546[] f1696;

    public C0312(C13012 c13012) {
        C17246 c17246M31591 = c13012.m31591();
        int iM38023 = c17246M31591.m38023();
        int iM40536 = c17246M31591.m40536();
        this.f1693 = iM40536;
        C4546 c4546 = new C4546(iM40536);
        this.f1695 = c4546;
        this.f1696 = new C4546[iM38023];
        this.f1694 = new HashMap(c17246M31591.m40533());
        c4546.mo20349();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1726(int i, C4546 c4546) {
        C4546[] c4546Arr = this.f1696;
        try {
            C4546 c4547 = c4546Arr[i];
            if (c4547 == null) {
                m43734();
                try {
                    c4546Arr[i] = c4546;
                    return true;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("bogus label");
                }
            }
            C4546 c4546M13351 = c4547.m13351();
            if (c4547.size() != 0) {
                c4546M13351.m13355(c4546);
            } else {
                c4546M13351 = c4546.m13351();
            }
            if (c4547.equals(c4546M13351)) {
                return false;
            }
            c4546M13351.mo20349();
            m43734();
            try {
                c4546Arr[i] = c4546M13351;
                return true;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("bogus label");
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4546 m1723(C16540 c16540) {
        try {
            C4546 c4546 = this.f1696[c16540.mo2269()];
            return c4546 != null ? c4546 : this.f1695;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1725(AbstractC15834 abstractC15834, C21480 c21480) {
        m43734();
        this.f1694.put(abstractC15834, c21480);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m1724(AbstractC15834 abstractC15834) {
        return (C21480) this.f1694.get(abstractC15834);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m1727() {
        return this.f1694.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4546 m1722(int i) {
        try {
            C4546 c4546 = this.f1696[i];
            return c4546 != null ? c4546.m13351() : new C4546(this.f1693);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }
}
