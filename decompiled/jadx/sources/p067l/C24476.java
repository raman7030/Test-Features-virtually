package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ANL */
/* JADX INFO: loaded from: classes.dex */
public final class C24476 extends AbstractC0868 implements InterfaceC12762 {

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9724 f77479;

    @Override // p067l.InterfaceC12762
    /* JADX INFO: renamed from: ֫ */
    public final void mo29303(View view) {
        C13045.m29867(view, "panel");
    }

    @Override // p067l.InterfaceC12762
    /* JADX INFO: renamed from: ۧ */
    public final void mo29304(View view) {
        C13045.m29867(view, "panel");
        m4607(true);
    }

    @Override // p067l.InterfaceC12762
    /* JADX INFO: renamed from: ܽ */
    public final void mo29305(View view) {
        C13045.m29867(view, "panel");
        m4607(false);
    }

    public C24476(AbstractC9724 abstractC9724) {
        super(true);
        this.f77479 = abstractC9724;
        ((C16113) abstractC9724.requireView()).m36674(this);
    }

    @Override // p067l.AbstractC0868
    /* JADX INFO: renamed from: ۧ */
    public final void mo3603() {
        ((C16113) this.f77479.requireView()).m36671();
    }
}
