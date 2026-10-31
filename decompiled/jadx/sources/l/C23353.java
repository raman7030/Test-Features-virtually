package l;

/* JADX INFO: renamed from: l.᩻֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23353 extends AbstractC0525 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f75028;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8817 f75029;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23353(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        super(true);
        this.f75028 = viewOnClickListenerC19121;
        this.f75029 = C8817.m22789();
    }

    @Override // l.AbstractC0525
    /* JADX INFO: renamed from: ۧ */
    public final void mo1201() {
        if (this.f75029.m22793()) {
            return;
        }
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f75028;
        C14771 c14771 = viewOnClickListenerC19121.f60265;
        if (c14771 == null) {
            C11233.m27804("bottomSlideLayout");
            throw null;
        }
        if (!c14771.m35125()) {
            C5561 c5561 = viewOnClickListenerC19121.f60253;
            if (c5561 == null) {
                C11233.m27804("bottomDrawer");
                throw null;
            }
            if (c5561.m15805()) {
                return;
            }
            C14771 c14772 = viewOnClickListenerC19121.f60265;
            if (c14772 != null) {
                c14772.m35122();
                return;
            } else {
                C11233.m27804("bottomSlideLayout");
                throw null;
            }
        }
        viewOnClickListenerC19121.m44120();
    }
}
