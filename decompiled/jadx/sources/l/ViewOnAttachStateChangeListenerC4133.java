package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۘᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC4133 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19656 f13100;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC4133(C19656 c19656) {
        this.f13100 = c19656;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C19656 c19656 = this.f13100;
        c19656.f63452.removeOnAttachStateChangeListener(this);
        c19656.f63461 = null;
        c19656.f63464.post(new RunnableC23972(1, c19656));
    }
}
