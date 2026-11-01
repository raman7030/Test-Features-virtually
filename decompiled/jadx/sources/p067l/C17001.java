package p067l;

/* JADX INFO: renamed from: l.ܶᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBC9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17001 {

    /* JADX INFO: renamed from: ֫ */
    public final C10297 f50271;

    /* JADX INFO: renamed from: ۧ */
    public final C23708 f50272;

    /* JADX INFO: renamed from: ܳ */
    public final int f50273;

    /* JADX INFO: renamed from: ܽ */
    public final int f50274;

    /* JADX INFO: renamed from: ܿ */
    public final C15660 f50275;

    /* JADX INFO: renamed from: ᩳ */
    public int f50276;

    public C17001(C23708 c23708, int i, int i2, C10297 c10297) {
        if (c23708 == null) {
            throw new NullPointerException("cf == null");
        }
        if (c10297 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iM29815 = c23708.m52729().m29815(i2);
        this.f50272 = c23708;
        this.f50274 = i;
        this.f50273 = i2;
        this.f50271 = c10297;
        this.f50275 = new C15660(iM29815);
        this.f50276 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38592() {
        m38591();
        return this.f50276;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15660 m38593() {
        m38591();
        return this.f50275;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m38591() {
        if (this.f50276 < 0) {
            C15660 c15660 = this.f50275;
            int size = c15660.size();
            int iMo11873 = this.f50273 + 2;
            C23708 c23708 = this.f50272;
            c23708.getClass();
            for (int i = 0; i < size; i++) {
                try {
                    AbstractC25009 abstractC25009M23910 = this.f50271.m23910(c23708, this.f50274, iMo11873);
                    iMo11873 += abstractC25009M23910.mo11873();
                    c15660.m43249(i, abstractC25009M23910);
                } catch (C24378 e) {
                    e.m23570("...while parsing attributes[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C24378 c24378 = new C24378(null, e2);
                    c24378.m23570("...while parsing attributes[" + i + "]");
                    throw c24378;
                }
            }
            this.f50276 = iMo11873;
        }
    }
}
