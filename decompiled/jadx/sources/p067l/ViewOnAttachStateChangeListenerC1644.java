package p067l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܺ᩷ */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC1644 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnKeyListenerC0979 f52992;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC1644(ViewOnKeyListenerC0979 viewOnKeyListenerC0979) {
        this.f52992 = viewOnKeyListenerC0979;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewOnKeyListenerC0979 viewOnKeyListenerC0979 = this.f52992;
        ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0979.f11407;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewOnKeyListenerC0979.f11407 = view.getViewTreeObserver();
            }
            viewOnKeyListenerC0979.f11407.removeGlobalOnLayoutListener(viewOnKeyListenerC0979.f11401);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
