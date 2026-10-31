package l;

/* JADX INFO: renamed from: l.ܺܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C15973 extends C1261 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2569 f49288;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f49289;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15973(C1875 c1875, C2569 c2569) {
        super(c1875);
        this.f49288 = c2569;
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ܺ */
    public final void mo24571() {
        super.mo24571();
        this.f49289--;
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ۧ */
    public final void mo24570(C8931 c8931) {
        super.mo24570(c8931);
        this.f49289--;
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ֫ */
    public final void mo24562(C8931 c8931, int i, int i2) {
        this.f49288.m8120();
        int i3 = this.f49289 + 1;
        this.f49289 = i3;
        if (i3 <= 256) {
            super.mo24562(c8931, i, i2);
            return;
        }
        throw C5391.m15357(EnumC0451.LIMIT, "Parser nesting limit exceeded");
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ֫ */
    public final void mo24563(C8931 c8931, int i, int i2, int i3) {
        this.f49288.m8120();
        int i4 = this.f49289 + 1;
        this.f49289 = i4;
        if (i4 <= 256) {
            super.mo24563(c8931, i, i2, 0);
            return;
        }
        throw C5391.m15357(EnumC0451.LIMIT, "Parser nesting limit exceeded");
    }
}
