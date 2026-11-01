package p067l;

/* JADX INFO: renamed from: l.ۡ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10511 extends AbstractC11594 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23663 f29082;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10511(C23663 c23663) {
        super(c23663);
        this.f29082 = c23663;
    }

    @Override // p067l.AbstractC11594
    /* JADX INFO: renamed from: ֫ */
    public final C20982 mo24248(C20982 c20982) {
        if (!c20982.m47319() || !c20982.m47318(EnumC20311.STATIC)) {
            return c20982;
        }
        return C20982.m47316(new C4061(this.f29082, c20982.f65895, false));
    }

    @Override // p067l.AbstractC11594
    /* JADX INFO: renamed from: ֫ */
    public final C20982 mo24249(C20982 c20982, C20982 c20983) {
        if (!c20982.m47319() || c20982.m47318(EnumC20311.NON_STATIC)) {
            if (!c20983.m47319() || c20983.m47318(EnumC20311.STATIC)) {
                if (c20982.m47319() || c20983.m47319()) {
                    return C20982.m47316(new C4061(this.f29082, c20982.m47319() ? c20982.f65895 : c20983.f65895, true));
                }
                if (!c20982.m47317() || c20983.m47317()) {
                }
            }
            return c20983;
        }
        return c20982;
    }
}
