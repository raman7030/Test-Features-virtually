package p067l;

/* JADX INFO: renamed from: l.ܶۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16608 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final C23315 f48788;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17043 f48789;

    /* JADX INFO: renamed from: ᩹ */
    public final C18362 f48790;

    public RunnableC16608(C18362 c18362, AbstractC17043 abstractC17043, C23315 c23315) {
        this.f48790 = c18362;
        this.f48789 = abstractC17043;
        this.f48788 = c23315;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C3197 c3197;
        C23315 c23315 = this.f48788;
        C18362 c18362 = this.f48790;
        AbstractC17043 abstractC17043 = this.f48789;
        try {
            C11450 c11450 = abstractC17043.mo25094() ? new C11450(abstractC17043) : null;
            if (c11450 == null) {
                C21265 c21265 = C21265.f66872;
                c3197 = new C3197(c21265, c21265.f66886);
            } else {
                C22179 c22179 = C22179.f70167;
                C21265 c21265Mo13204 = c22179.mo13204(c11450);
                int iMo11393 = c22179.mo11393(c11450);
                if (iMo11393 != 0) {
                    c3197 = new C3197(c11450, c21265Mo13204, iMo11393);
                } else {
                    c3197 = new C3197(c21265Mo13204, c21265Mo13204.f66886);
                }
            }
            if (c3197.m5528()) {
                if (C21304.m48183(c18362, c23315)) {
                    C22645.f71452.submit(new RunnableC7221(this.f48790, c3197.f6202, c3197.f6204, c3197.f6205, c23315));
                    return;
                }
                return;
            }
            C7050.m16212(new Runnable() { // from class: l.۠ۘܳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC16608.m37634(this.f27459, c3197);
                }
            });
        } catch (RuntimeException unused) {
            C21304.m48181(c18362, c23315);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37634(RunnableC16608 runnableC16608, C3197 c3197) {
        C18362 c18362 = runnableC16608.f48790;
        C23315 c23315 = runnableC16608.f48788;
        C12255 c12255M48179 = C21304.m48179(c18362, c23315, c3197.f6205, c3197.f6203);
        if (c12255M48179 == null || !c23315.m51921().equals(c12255M48179.getTag())) {
            return;
        }
        c12255M48179.m28261(c3197.f6203);
        c12255M48179.setTag(null);
    }
}
