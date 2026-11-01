package p067l;

/* JADX INFO: renamed from: l.֡ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8D1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2932 extends C10309 {

    /* JADX INFO: renamed from: ۡ */
    public boolean f5090;

    /* JADX INFO: renamed from: ۢ */
    public AbstractC25081 f5091;

    /* JADX INFO: renamed from: ܺ */
    public boolean f5092;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f5093;

    public C2932() {
        super("Input");
        this.f5093 = false;
        this.f5092 = false;
        this.f5090 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4803(C22559 c22559) {
        m51435(c22559, new C21039(this, false));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4806(C22559 c22559) {
        m51435(c22559, new C21039(this, true));
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m4808(int i) {
        double[] dArrM40212 = m40212();
        boolean z = this.f5092;
        this.f5092 = false;
        if (this.f5090) {
            if (dArrM40212[i] >= 0.01d) {
                this.f5090 = false;
                return true;
            }
        } else if (dArrM40212[i] < 0.01d) {
            this.f5090 = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m4804() {
        return this.f5090;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m4805() {
        if (this.f5093) {
            AbstractC25081 abstractC25081M51438 = this.f5091;
            if (abstractC25081M51438 == null) {
                abstractC25081M51438 = m51438();
            }
            abstractC25081M51438.mo15941(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4802(C2932 c2932, boolean z) {
        if (z) {
            AbstractC25081 abstractC25081M51438 = c2932.f5091;
            if (abstractC25081M51438 == null) {
                abstractC25081M51438 = c2932.m51438();
            }
            abstractC25081M51438.mo15941(true);
            c2932.f5092 = true;
        }
        c2932.m23928(z ? 1.0d : 0.0d);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4807(AbstractC25081 abstractC25081) {
        this.f5091 = abstractC25081;
        this.f5093 = true;
        abstractC25081.mo15941(false);
    }
}
