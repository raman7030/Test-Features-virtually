package l;

/* JADX INFO: renamed from: l.ۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U50M */
/* JADX INFO: loaded from: classes3.dex */
public final class C6588 extends AbstractViewOnTouchListenerC13909 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC9411 f20296;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6588(ViewOnClickListenerC9411 viewOnClickListenerC9411) {
        super(viewOnClickListenerC9411);
        this.f20296 = viewOnClickListenerC9411;
    }

    @Override // l.AbstractViewOnTouchListenerC13909
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9825 mo11585() {
        AbstractC20700 abstractC20700 = this.f20296.f28556;
        if (abstractC20700 != null) {
            return abstractC20700.mo29128();
        }
        return null;
    }

    @Override // l.AbstractViewOnTouchListenerC13909
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11586() {
        InterfaceC9825 interfaceC9825Mo11585;
        ViewOnClickListenerC9411 viewOnClickListenerC9411 = this.f20296;
        InterfaceC4471 interfaceC4471 = viewOnClickListenerC9411.f28553;
        return interfaceC4471 != null && interfaceC4471.mo3362(viewOnClickListenerC9411.f28554) && (interfaceC9825Mo11585 = mo11585()) != null && interfaceC9825Mo11585.isShowing();
    }
}
