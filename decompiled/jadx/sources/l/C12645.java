package l;

/* JADX INFO: renamed from: l.۫᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M60I */
/* JADX INFO: loaded from: classes4.dex */
public final class C12645 extends C15688 {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38088 = 0;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C15538 f38089;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C3545 f38090;

    @Override // l.C15688
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28850() {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12645(C3545 c3545) {
        String strM10810 = c3545.m10810();
        String parent = c3545.getParent();
        super(strM10810, parent != null ? "/".concat(parent) : "/", null, c3545.getSize(), c3545.getTime(), !c3545.isDirectory());
        this.f38090 = c3545;
        C15538 c15538M10780 = c3545.m10780();
        this.f38089 = c15538M10780;
        if (c15538M10780 == null || !c15538M10780.m36639()) {
            return;
        }
        m36964(c15538M10780.m36637());
    }

    @Override // l.C15688, l.InterfaceC17889
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo25860() {
        return this.f38090.m10808();
    }

    @Override // l.C15688, l.InterfaceC17889
    /* JADX INFO: renamed from: ֨ۧ */
    public final C16477 mo24428() {
        C15538 c15538 = this.f38089;
        if (c15538 == null || !c15538.m36640()) {
            return null;
        }
        return new C16477(c15538.m36638(), (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3545 m30924() {
        return this.f38090;
    }
}
