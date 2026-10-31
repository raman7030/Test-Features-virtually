package l;

/* JADX INFO: renamed from: l.ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3828 extends AbstractViewOnTouchListenerC13909 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3122 f12246;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21467 f12247;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3828(C3122 c3122, C3122 c3123, C21467 c21467) {
        super(c3123);
        this.f12246 = c3122;
        this.f12247 = c21467;
    }

    @Override // l.AbstractViewOnTouchListenerC13909
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9825 mo11585() {
        return this.f12247;
    }

    @Override // l.AbstractViewOnTouchListenerC13909
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo11586() {
        C3122 c3122 = this.f12246;
        if (c3122.m9500().isShowing()) {
            return true;
        }
        c3122.m9501();
        return true;
    }
}
