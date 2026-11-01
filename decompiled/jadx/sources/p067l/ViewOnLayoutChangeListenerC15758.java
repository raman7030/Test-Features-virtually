package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ALU */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC15758 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC9724 f45629;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C13045.m29860(view);
        view.removeOnLayoutChangeListener(this);
        AbstractC9724 abstractC9724 = this.f45629;
        AbstractC0868 abstractC0868 = abstractC9724.f26861;
        C13045.m29861(abstractC0868);
        abstractC0868.m4607(((C16113) abstractC9724.requireView()).m36681() && ((C16113) abstractC9724.requireView()).m36683());
    }

    public ViewOnLayoutChangeListenerC15758(AbstractC9724 abstractC9724) {
        this.f45629 = abstractC9724;
    }
}
