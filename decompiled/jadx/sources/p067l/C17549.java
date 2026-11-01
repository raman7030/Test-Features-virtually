package p067l;

/* JADX INFO: renamed from: l.ܺܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C17549 extends C3567 {

    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ C4810 f52446;

    /* JADX INFO: renamed from: ۚ */
    public int f52447;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17549(C4150 c4150, C4810 c4810) {
        super(c4150);
        this.f52446 = c4810;
    }

    @Override // p067l.AbstractC11527
    /* JADX INFO: renamed from: ܺ */
    public final void mo26585() {
        super.mo26585();
        this.f52447--;
    }

    @Override // p067l.AbstractC11527
    /* JADX INFO: renamed from: ۧ */
    public final void mo26584(C10856 c10856) {
        super.mo26584(c10856);
        this.f52447--;
    }

    @Override // p067l.AbstractC11527
    /* JADX INFO: renamed from: ֫ */
    public final void mo26576(C10856 c10856, int i, int i2) {
        this.f52446.m10153();
        int i3 = this.f52447 + 1;
        this.f52447 = i3;
        if (i3 <= 256) {
            super.mo26576(c10856, i, i2);
            return;
        }
        throw C7492.m17268(EnumC2797.LIMIT, "Parser nesting limit exceeded");
    }

    @Override // p067l.AbstractC11527
    /* JADX INFO: renamed from: ֫ */
    public final void mo26577(C10856 c10856, int i, int i2, int i3) {
        this.f52446.m10153();
        int i4 = this.f52447 + 1;
        this.f52447 = i4;
        if (i4 <= 256) {
            super.mo26577(c10856, i, i2, 0);
            return;
        }
        throw C7492.m17268(EnumC2797.LIMIT, "Parser nesting limit exceeded");
    }
}
