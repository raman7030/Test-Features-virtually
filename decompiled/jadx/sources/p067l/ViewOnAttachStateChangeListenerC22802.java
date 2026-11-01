package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC22802 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14084 f71852;

    public ViewOnAttachStateChangeListenerC22802(C14084 c14084) {
        this.f71852 = c14084;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f71852.m31958(0L);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f71852.m31974();
    }
}
