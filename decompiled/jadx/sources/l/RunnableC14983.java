package l;

/* JADX INFO: renamed from: l.ܶۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14983 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22040 f45675;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f45676;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16828 f45677;

    public RunnableC14983(C16828 c16828, AbstractC15440 abstractC15440, C22040 c22040) {
        this.f45677 = c16828;
        this.f45676 = abstractC15440;
        this.f45675 = c22040;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C0872 c0872;
        C22040 c22040 = this.f45675;
        C16828 c16828 = this.f45677;
        AbstractC15440 abstractC15440 = this.f45676;
        try {
            C9555 c9555 = abstractC15440.mo23120() ? new C9555(abstractC15440) : null;
            if (c9555 == null) {
                C19883 c19883 = C19883.f64236;
                c0872 = new C0872(c19883, c19883.f64250);
            } else {
                C20844 c20844 = C20844.f67485;
                C19883 c19883Mo11258 = c20844.mo11258(c9555);
                int iMo9351 = c20844.mo9351(c9555);
                if (iMo9351 != 0) {
                    c0872 = new C0872(c9555, c19883Mo11258, iMo9351);
                } else {
                    c0872 = new C0872(c19883Mo11258, c19883Mo11258.f64250);
                }
            }
            if (c0872.m3214()) {
                if (C19924.m45870(c16828, c22040)) {
                    C21335.f68758.submit(new RunnableC5106(this.f45677, c0872.f3429, c0872.f3431, c0872.f3432, c22040));
                    return;
                }
                return;
            }
            C4925.m14315(new Runnable() { // from class: l.۠ۘܳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC14983.m35478(this.f24545, c0872);
                }
            });
        } catch (RuntimeException unused) {
            C19924.m45868(c16828, c22040);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35478(RunnableC14983 runnableC14983, C0872 c0872) {
        C16828 c16828 = runnableC14983.f45677;
        C22040 c22040 = runnableC14983.f45675;
        C10402 c10402M45866 = C19924.m45866(c16828, c22040, c0872.f3432, c0872.f3430);
        if (c10402M45866 == null || !c22040.m49585().equals(c10402M45866.getTag())) {
            return;
        }
        c10402M45866.m26232(c0872.f3430);
        c10402M45866.setTag(null);
    }
}
