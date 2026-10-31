package l;

/* JADX INFO: renamed from: l.ۡ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8568 extends AbstractC9707 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f26166;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8568(C22406 c22406) {
        super(c22406);
        this.f26166 = c22406;
    }

    @Override // l.AbstractC9707
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19585 mo22279(C19585 c19585) {
        if (!c19585.m45024() || !c19585.m45023(EnumC18879.STATIC)) {
            return c19585;
        }
        return C19585.m45021(new C1781(this.f26166, c19585.f63278, false));
    }

    @Override // l.AbstractC9707
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19585 mo22280(C19585 c19585, C19585 c19586) {
        if (!c19585.m45024() || c19585.m45023(EnumC18879.NON_STATIC)) {
            if (!c19586.m45024() || c19586.m45023(EnumC18879.STATIC)) {
                if (c19585.m45024() || c19586.m45024()) {
                    return C19585.m45021(new C1781(this.f26166, c19585.m45024() ? c19585.f63278 : c19586.f63278, true));
                }
                if (!c19585.m45022() || c19586.m45022()) {
                }
            }
            return c19586;
        }
        return c19585;
    }
}
