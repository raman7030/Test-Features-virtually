package l;

/* JADX INFO: renamed from: l.ۚۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5106 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C19883 f16011;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22040 f16012;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f16013;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 f16014;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16828 f16015;

    public RunnableC5106(C16828 c16828, InterfaceC17889 interfaceC17889, int i, C19883 c19883, C22040 c22040) {
        this.f16015 = c16828;
        this.f16014 = interfaceC17889;
        this.f16013 = i;
        this.f16011 = c19883;
        this.f16012 = c22040;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            final C11813 c11813Mo9350 = C20844.f67485.mo9350((AbstractC16891) null, this.f16014, this.f16013);
            C4925.m14315(new Runnable() { // from class: l.֡ۘܳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC5106.m14653(this.f1378, c11813Mo9350);
                }
            });
        } catch (RuntimeException unused) {
            C19924.m45868(this.f16015, this.f16012);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14653(RunnableC5106 runnableC5106, C11813 c11813) {
        C16828 c16828 = runnableC5106.f16015;
        C22040 c22040 = runnableC5106.f16012;
        C10402 c10402M45866 = C19924.m45866(c16828, c22040, runnableC5106.f16011, c11813);
        if (c10402M45866 == null || !c22040.m49585().equals(c10402M45866.getTag())) {
            return;
        }
        c10402M45866.m26232(c11813);
        c10402M45866.setTag(null);
    }
}
