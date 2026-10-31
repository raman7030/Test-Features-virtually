package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC21500 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12327 f69155;

    public ViewOnAttachStateChangeListenerC21500(C12327 c12327) {
        this.f69155 = c12327;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f69155.m29898(0L);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f69155.m29914();
    }
}
