package l;

/* JADX INFO: renamed from: l.ܶᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBC9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15396 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8342 f47141;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22453 f47142;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f47143;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f47144;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13985 f47145;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f47146;

    public C15396(C22453 c22453, int i, int i2, C8342 c8342) {
        if (c22453 == null) {
            throw new NullPointerException("cf == null");
        }
        if (c8342 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iM27753 = c22453.m50388().m27753(i2);
        this.f47142 = c22453;
        this.f47144 = i;
        this.f47143 = i2;
        this.f47141 = c8342;
        this.f47145 = new C13985(iM27753);
        this.f47146 = -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36434() {
        m36433();
        return this.f47146;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13985 m36435() {
        m36433();
        return this.f47145;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m36433() {
        if (this.f47146 < 0) {
            C13985 c13985 = this.f47145;
            int size = c13985.size();
            int iMo9828 = this.f47143 + 2;
            C22453 c22453 = this.f47142;
            c22453.getClass();
            for (int i = 0; i < size; i++) {
                try {
                    AbstractC23822 abstractC23822M21940 = this.f47141.m21940(c22453, this.f47144, iMo9828);
                    iMo9828 += abstractC23822M21940.mo9828();
                    c13985.m40989(i, abstractC23822M21940);
                } catch (C23158 e) {
                    e.m21602("...while parsing attributes[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C23158 c23158 = new C23158(null, e2);
                    c23158.m21602("...while parsing attributes[" + i + "]");
                    throw c23158;
                }
            }
            this.f47146 = iMo9828;
        }
    }
}
