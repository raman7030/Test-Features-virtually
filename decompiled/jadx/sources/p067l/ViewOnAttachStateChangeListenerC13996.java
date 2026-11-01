package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1GH */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC13996 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ View f39500;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC13996(View view) {
        this.f39500 = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f39500;
        view2.removeOnAttachStateChangeListener(this);
        C1717.m43585(view2);
    }
}
