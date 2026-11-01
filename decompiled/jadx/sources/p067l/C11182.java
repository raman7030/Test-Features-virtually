package p067l;

/* JADX INFO: renamed from: l.ۢ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11182 extends AbstractC11594 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23663 f31030;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11182(C23663 c23663) {
        super(c23663);
        this.f31030 = c23663;
    }

    @Override // p067l.AbstractC11594
    /* JADX INFO: renamed from: ֫ */
    public final C20982 mo24248(C20982 c20982) {
        if (!c20982.m47319() || c20982.m47318(EnumC20311.NON_STATIC)) {
            return c20982;
        }
        return C20982.m47316(new C4061(this.f31030, c20982.f65895, false));
    }

    @Override // p067l.AbstractC11594
    /* JADX INFO: renamed from: ֫ */
    public final C20982 mo24249(C20982 c20982, C20982 c20983) {
        boolean zM47319 = c20982.m47319();
        AbstractC7783 abstractC7783 = c20982.f65895;
        if (!zM47319 || !abstractC7783.mo17483() || (c20983.m47319() && !c20983.m47318(EnumC20311.STATIC))) {
            boolean zM473110 = c20983.m47319();
            AbstractC7783 abstractC7784 = c20983.f65895;
            if (!zM473110 || abstractC7784.mo17483() || (c20982.m47319() && !c20982.m47318(EnumC20311.NON_STATIC))) {
                boolean zM473111 = c20982.m47319();
                C23663 c23663 = this.f31030;
                if (zM473111 && c20983.m47319()) {
                    return C20982.m47316(c23663.m52659(abstractC7783, abstractC7784));
                }
                if (c20982.m47319() || c20983.m47319()) {
                    if (!c20982.m47319()) {
                        abstractC7783 = abstractC7784;
                    }
                    return C20982.m47316(new C4061(c23663, abstractC7783, true));
                }
                if (!c20982.m47317() || c20983.m47317()) {
                }
            }
            return c20983;
        }
        return c20982;
    }
}
