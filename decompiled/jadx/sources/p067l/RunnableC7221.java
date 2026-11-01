package p067l;

/* JADX INFO: renamed from: l.ۚۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7221 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final C21265 f18845;

    /* JADX INFO: renamed from: ۙ */
    public final C23315 f18846;

    /* JADX INFO: renamed from: ᩶ */
    public final int f18847;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC19370 f18848;

    /* JADX INFO: renamed from: ᩹ */
    public final C18362 f18849;

    public RunnableC7221(C18362 c18362, InterfaceC19370 interfaceC19370, int i, C21265 c21265, C23315 c23315) {
        this.f18849 = c18362;
        this.f18848 = interfaceC19370;
        this.f18847 = i;
        this.f18845 = c21265;
        this.f18846 = c23315;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            final C13596 c13596Mo11392 = C22179.f70167.mo11392((AbstractC18422) null, this.f18848, this.f18847);
            C7050.m16212(new Runnable() { // from class: l.֡ۘܳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC7221.m16561(this.f4152, c13596Mo11392);
                }
            });
        } catch (RuntimeException unused) {
            C21304.m48181(this.f18849, this.f18846);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16561(RunnableC7221 runnableC7221, C13596 c13596) {
        C18362 c18362 = runnableC7221.f18849;
        C23315 c23315 = runnableC7221.f18846;
        C12255 c12255M48179 = C21304.m48179(c18362, c23315, runnableC7221.f18845, c13596);
        if (c12255M48179 == null || !c23315.m51921().equals(c12255M48179.getTag())) {
            return;
        }
        c12255M48179.m28261(c13596);
        c12255M48179.setTag(null);
    }
}
