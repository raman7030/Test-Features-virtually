package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۘᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC6297 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21050 f15914;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC6297(C21050 c21050) {
        this.f15914 = c21050;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C21050 c21050 = this.f15914;
        c21050.f66075.removeOnAttachStateChangeListener(this);
        c21050.f66084 = null;
        c21050.f66087.post(new RunnableC25152(1, c21050));
    }
}
