package l;

/* JADX INFO: renamed from: l.֡ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8D1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0593 extends C8355 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f2316;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC23898 f2317;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f2318;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f2319;

    public C0593() {
        super("Input");
        this.f2319 = false;
        this.f2318 = false;
        this.f2316 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2448(C21245 c21245) {
        m49086(c21245, new C19645(this, false));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2451(C21245 c21245) {
        m49086(c21245, new C19645(this, true));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m2453(int i) {
        double[] dArrM38021 = m38021();
        boolean z = this.f2318;
        this.f2318 = false;
        if (this.f2316) {
            if (dArrM38021[i] >= 0.01d) {
                this.f2316 = false;
                return true;
            }
        } else if (dArrM38021[i] < 0.01d) {
            this.f2316 = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m2449() {
        return this.f2316;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m2450() {
        if (this.f2319) {
            AbstractC23898 abstractC23898M49089 = this.f2317;
            if (abstractC23898M49089 == null) {
                abstractC23898M49089 = m49089();
            }
            abstractC23898M49089.mo14061(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2447(C0593 c0593, boolean z) {
        if (z) {
            AbstractC23898 abstractC23898M49089 = c0593.f2317;
            if (abstractC23898M49089 == null) {
                abstractC23898M49089 = c0593.m49089();
            }
            abstractC23898M49089.mo14061(true);
            c0593.f2318 = true;
        }
        c0593.m21958(z ? 1.0d : 0.0d);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2452(AbstractC23898 abstractC23898) {
        this.f2317 = abstractC23898;
        this.f2319 = true;
        abstractC23898.mo14061(false);
    }
}
