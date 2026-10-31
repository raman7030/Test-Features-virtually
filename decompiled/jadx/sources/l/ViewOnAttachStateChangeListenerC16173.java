package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC16173 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC2769 f49826;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC16173(ViewOnKeyListenerC2769 viewOnKeyListenerC2769) {
        this.f49826 = viewOnKeyListenerC2769;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewOnKeyListenerC2769 viewOnKeyListenerC2769 = this.f49826;
        ViewTreeObserver viewTreeObserver = viewOnKeyListenerC2769.f8613;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewOnKeyListenerC2769.f8613 = view.getViewTreeObserver();
            }
            viewOnKeyListenerC2769.f8613.removeGlobalOnLayoutListener(viewOnKeyListenerC2769.f8607);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
