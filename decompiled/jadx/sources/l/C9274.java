package l;

/* JADX INFO: renamed from: l.ۢ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9274 extends AbstractC9707 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f28082;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9274(C22406 c22406) {
        super(c22406);
        this.f28082 = c22406;
    }

    @Override // l.AbstractC9707
    /* JADX INFO: renamed from: ֫ */
    public final C19585 mo22279(C19585 c19585) {
        if (!c19585.m45024() || c19585.m45023(EnumC18879.NON_STATIC)) {
            return c19585;
        }
        return C19585.m45021(new C1781(this.f28082, c19585.f63278, false));
    }

    @Override // l.AbstractC9707
    /* JADX INFO: renamed from: ֫ */
    public final C19585 mo22280(C19585 c19585, C19585 c19586) {
        boolean zM45024 = c19585.m45024();
        AbstractC5698 abstractC5698 = c19585.f63278;
        if (!zM45024 || !abstractC5698.mo15572() || (c19586.m45024() && !c19586.m45023(EnumC18879.STATIC))) {
            boolean zM45025 = c19586.m45024();
            AbstractC5698 abstractC5699 = c19586.f63278;
            if (!zM45025 || abstractC5699.mo15572() || (c19585.m45024() && !c19585.m45023(EnumC18879.NON_STATIC))) {
                boolean zM45026 = c19585.m45024();
                C22406 c22406 = this.f28082;
                if (zM45026 && c19586.m45024()) {
                    return C19585.m45021(c22406.m50319(abstractC5698, abstractC5699));
                }
                if (c19585.m45024() || c19586.m45024()) {
                    if (!c19585.m45024()) {
                        abstractC5698 = abstractC5699;
                    }
                    return C19585.m45021(new C1781(c22406, abstractC5698, true));
                }
                if (!c19585.m45022() || c19586.m45022()) {
                }
            }
            return c19586;
        }
        return c19585;
    }
}
