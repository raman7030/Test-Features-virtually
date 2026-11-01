package p067l;

/* JADX INFO: renamed from: l.ۘۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1032 extends AbstractViewOnTouchListenerC1532 {

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C0997 f15054;

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ C1907 f15055;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1032(C0997 c0997, C0997 c0998, C1907 c1907) {
        super(c0998);
        this.f15054 = c0997;
        this.f15055 = c1907;
    }

    @Override // p067l.AbstractViewOnTouchListenerC1532
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1329 mo13521() {
        return this.f15055;
    }

    @Override // p067l.AbstractViewOnTouchListenerC1532
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo13522() {
        C0997 c0997 = this.f15054;
        if (c0997.m11543().isShowing()) {
            return true;
        }
        c0997.m11544();
        return true;
    }
}
