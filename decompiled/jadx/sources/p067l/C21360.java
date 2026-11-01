package p067l;

/* JADX INFO: renamed from: l.᩶ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21360 extends C7278 {

    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ C6607 f67339;

    /* JADX INFO: renamed from: ۚ */
    public int f67340;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21360(C4150 c4150, C6607 c6607) {
        super(c4150);
        this.f67339 = c6607;
    }

    @Override // p067l.AbstractC11527
    /* JADX INFO: renamed from: ֫ */
    public final void mo26576(C10856 c10856, int i, int i2) {
        this.f67339.m15087();
        int i3 = this.f67340 + 1;
        this.f67340 = i3;
        if (i3 > 256) {
            throw C13983.m31774(EnumC20808.LIMIT, "Parser nesting limit exceeded");
        }
        super.mo26576(c10856, i, i2);
    }

    @Override // p067l.AbstractC11527
    /* JADX INFO: renamed from: ֫ */
    public final void mo26577(C10856 c10856, int i, int i2, int i3) {
        this.f67339.m15087();
        int i4 = this.f67340 + 1;
        this.f67340 = i4;
        if (i4 > 256) {
            throw C13983.m31774(EnumC20808.LIMIT, "Parser nesting limit exceeded");
        }
        super.mo26577(c10856, 24, 12, i3);
    }

    @Override // p067l.AbstractC11527
    /* JADX INFO: renamed from: ܺ */
    public final void mo26585() {
        super.mo26585();
        this.f67340--;
    }

    @Override // p067l.AbstractC11527
    /* JADX INFO: renamed from: ۧ */
    public final void mo26584(C10856 c10856) {
        super.mo26584(c10856);
        this.f67340--;
    }
}
