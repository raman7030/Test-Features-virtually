package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBD8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2665 extends C20376 {

    /* JADX INFO: renamed from: ۗ */
    public final int f4469;

    /* JADX INFO: renamed from: ۙ */
    public final HashMap f4470;

    /* JADX INFO: renamed from: ᩶ */
    public final C6689 f4471;

    /* JADX INFO: renamed from: ᩹ */
    public final C6689[] f4472;

    public C2665(C14735 c14735) {
        C18759 c18759M33676 = c14735.m33676();
        int iM40215 = c18759M33676.m40215();
        int iM42785 = c18759M33676.m42785();
        this.f4469 = iM42785;
        C6689 c6689 = new C6689(iM42785);
        this.f4471 = c6689;
        this.f4472 = new C6689[iM40215];
        this.f4470 = new HashMap(c18759M33676.m42782());
        c6689.mo22326();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m4124(int i, C6689 c6689) {
        C6689[] c6689Arr = this.f4472;
        try {
            C6689 c66810 = c6689Arr[i];
            if (c66810 == null) {
                m46001();
                try {
                    c6689Arr[i] = c6689;
                    return true;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("bogus label");
                }
            }
            C6689 c6689M15239 = c66810.m15239();
            if (c66810.size() != 0) {
                c6689M15239.m15243(c6689);
            } else {
                c6689M15239 = c6689.m15239();
            }
            if (c66810.equals(c6689M15239)) {
                return false;
            }
            c6689M15239.mo22326();
            m46001();
            try {
                c6689Arr[i] = c6689M15239;
                return true;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("bogus label");
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6689 m4121(C18088 c18088) {
        try {
            C6689 c6689 = this.f4472[c18088.mo4636()];
            return c6689 != null ? c6689 : this.f4471;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4123(AbstractC17417 abstractC17417, C22783 c22783) {
        m46001();
        this.f4470.put(abstractC17417, c22783);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22783 m4122(AbstractC17417 abstractC17417) {
        return (C22783) this.f4470.get(abstractC17417);
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m4125() {
        return this.f4470.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6689 m4120(int i) {
        try {
            C6689 c6689 = this.f4472[i];
            return c6689 != null ? c6689.m15239() : new C6689(this.f4469);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }
}
