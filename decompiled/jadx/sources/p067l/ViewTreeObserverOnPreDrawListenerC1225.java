package p067l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.۟᩸ */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC1225 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1751 f26830;

    public ViewTreeObserverOnPreDrawListenerC1225(C1751 c1751) {
        this.f26830 = c1751;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f26830.onChildViewsChanged(0);
        return true;
    }
}
