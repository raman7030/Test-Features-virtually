package p067l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۘۜ */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC1029 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnKeyListenerC1099 f14685;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC1029(ViewOnKeyListenerC1099 viewOnKeyListenerC1099) {
        this.f14685 = viewOnKeyListenerC1099;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewOnKeyListenerC1099 viewOnKeyListenerC1099 = this.f14685;
        ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1099.f19031;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewOnKeyListenerC1099.f19031 = view.getViewTreeObserver();
            }
            viewOnKeyListenerC1099.f19031.removeGlobalOnLayoutListener(viewOnKeyListenerC1099.f19036);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
