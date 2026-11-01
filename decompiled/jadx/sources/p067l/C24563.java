package p067l;

/* JADX INFO: renamed from: l.᩻֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes.dex */
public final class C24563 extends AbstractC0868 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ViewOnClickListenerC20541 f77774;

    /* JADX INFO: renamed from: ᩳ */
    public final C10748 f77775;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24563(ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        super(true);
        this.f77774 = viewOnClickListenerC20541;
        this.f77775 = C10748.m24759();
    }

    @Override // p067l.AbstractC0868
    /* JADX INFO: renamed from: ۧ */
    public final void mo3603() {
        if (this.f77775.m24763()) {
            return;
        }
        ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f77774;
        C16407 c16407 = viewOnClickListenerC20541.f63497;
        if (c16407 == null) {
            C13045.m29866("bottomSlideLayout");
            throw null;
        }
        if (!c16407.m37272()) {
            C7654 c7654 = viewOnClickListenerC20541.f63485;
            if (c7654 == null) {
                C13045.m29866("bottomDrawer");
                throw null;
            }
            if (c7654.m17720()) {
                return;
            }
            C16407 c16408 = viewOnClickListenerC20541.f63497;
            if (c16408 != null) {
                c16408.m37269();
                return;
            } else {
                C13045.m29866("bottomSlideLayout");
                throw null;
            }
        }
        viewOnClickListenerC20541.m46414();
    }
}
