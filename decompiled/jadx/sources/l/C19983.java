package l;

/* JADX INFO: renamed from: l.᩶ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19983 extends C5166 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4460 f64699;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f64700;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19983(C1875 c1875, C4460 c4460) {
        super(c1875);
        this.f64699 = c4460;
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ֫ */
    public final void mo24562(C8931 c8931, int i, int i2) {
        this.f64699.m13206();
        int i3 = this.f64700 + 1;
        this.f64700 = i3;
        if (i3 > 256) {
            throw C12221.m29712(EnumC19402.LIMIT, "Parser nesting limit exceeded");
        }
        super.mo24562(c8931, i, i2);
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ֫ */
    public final void mo24563(C8931 c8931, int i, int i2, int i3) {
        this.f64699.m13206();
        int i4 = this.f64700 + 1;
        this.f64700 = i4;
        if (i4 > 256) {
            throw C12221.m29712(EnumC19402.LIMIT, "Parser nesting limit exceeded");
        }
        super.mo24563(c8931, 24, 12, i3);
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ܺ */
    public final void mo24571() {
        super.mo24571();
        this.f64700--;
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ۧ */
    public final void mo24570(C8931 c8931) {
        super.mo24570(c8931);
        this.f64700--;
    }
}
