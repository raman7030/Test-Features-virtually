package p067l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ᩴۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1767 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C0997 f62177;

    public ViewTreeObserverOnGlobalLayoutListenerC1767(C0997 c0997) {
        this.f62177 = c0997;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C0997 c0997 = this.f62177;
        if (!c0997.m11543().isShowing()) {
            c0997.m11544();
        }
        ViewTreeObserver viewTreeObserver = c0997.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
