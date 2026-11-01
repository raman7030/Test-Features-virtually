package p067l;

/* JADX INFO: renamed from: l.ܿۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18584 {

    /* JADX INFO: renamed from: ֫ */
    public int f55491;

    /* JADX INFO: renamed from: ۧ */
    public int f55492;

    /* JADX INFO: renamed from: ܳ */
    public int f55493;

    /* JADX INFO: renamed from: ܽ */
    public int f55494;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC8526[] f55495;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC8526 f55496;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f55497;

    public C18584(AbstractC8526 abstractC8526, boolean z) {
        this.f55495 = new AbstractC8526[abstractC8526.f22880];
        this.f55497 = z;
        m42291(abstractC8526);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42295() {
        C12550 c12550 = (C12550) this.f55496;
        int i = this.f55492;
        this.f55492 = i + 1;
        boolean z = this.f55497;
        this.f55495[i] = z ? c12550.f35270 : c12550.f35269;
        m42291(z ? c12550.f35269 : c12550.f35270);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42297() {
        int i = this.f55492;
        if (i == 0) {
            m42291((AbstractC8526) null);
            return;
        }
        int i2 = i - 1;
        this.f55492 = i2;
        AbstractC8526[] abstractC8526Arr = this.f55495;
        AbstractC8526 abstractC8526 = abstractC8526Arr[i2];
        abstractC8526Arr[i2] = null;
        m42291(abstractC8526);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42296(int i) {
        this.f55491 += i;
        int i2 = this.f55493 - i;
        this.f55493 = i2;
        if (i2 != 0) {
            return;
        }
        C24619 c24619 = (C24619) this.f55496;
        int i3 = this.f55494 + (this.f55497 ? -1 : 1);
        this.f55494 = i3;
        if (i3 < 0 || i3 == c24619.f22882) {
            m42297();
        } else {
            this.f55493 = c24619.f77931[i3] & Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42291(AbstractC8526 abstractC8526) {
        this.f55496 = abstractC8526;
        this.f55491 = 0;
        if (abstractC8526 instanceof C24619) {
            C24619 c24619 = (C24619) abstractC8526;
            int i = this.f55497 ? c24619.f22882 - 1 : 0;
            this.f55494 = i;
            this.f55493 = c24619.f77931[i] & Integer.MAX_VALUE;
        }
    }
}
