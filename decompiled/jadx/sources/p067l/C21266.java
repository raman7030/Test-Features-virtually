package p067l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBD8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21266 extends C20376 {

    /* JADX INFO: renamed from: ۗ */
    public final int f66889;

    /* JADX INFO: renamed from: ۙ */
    public final HashMap f66890;

    /* JADX INFO: renamed from: ᩶ */
    public final C6689 f66891;

    /* JADX INFO: renamed from: ᩹ */
    public final C6689[] f66892;

    public C21266(C21975 c21975) {
        ArrayList arrayListM49517 = c21975.m49517();
        int iM49513 = c21975.m49513();
        this.f66889 = iM49513;
        C6689 c6689 = new C6689(iM49513);
        this.f66891 = c6689;
        this.f66892 = new C6689[arrayListM49517.size()];
        this.f66890 = new HashMap();
        c6689.mo22326();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48025(int i, C6689 c6689) {
        C6689[] c6689Arr = this.f66892;
        try {
            C6689 c66810 = c6689Arr[i];
            if (c66810 == null) {
                m46001();
                try {
                    c6689Arr[i] = c6689;
                    return true;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("bogus index");
                }
            }
            C6689 c6689M15239 = c66810.m15239();
            c6689M15239.m15243(c6689);
            if (c66810.equals(c6689M15239)) {
                return false;
            }
            c6689M15239.mo22326();
            m46001();
            try {
                c6689Arr[i] = c6689M15239;
                return true;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("bogus index");
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48024(AbstractC15938 abstractC15938, C22783 c22783) {
        m46001();
        this.f66890.put(abstractC15938, c22783);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6689 m48023(int i) {
        try {
            C6689 c6689 = this.f66892[i];
            return c6689 != null ? c6689 : this.f66891;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C6689 m48026(int i) {
        try {
            C6689 c6689 = this.f66892[i];
            return c6689 != null ? c6689.m15239() : new C6689(this.f66889);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }
}
