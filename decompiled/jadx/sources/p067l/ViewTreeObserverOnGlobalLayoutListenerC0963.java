package p067l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۖۢ */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0963 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1243 f10555;

    public ViewTreeObserverOnGlobalLayoutListenerC0963(C1243 c1243) {
        this.f10555 = c1243;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C1243 c1243 = this.f10555;
        if (c1243.m23415().f31105.isShowing()) {
            if (!c1243.isShown()) {
                c1243.m23415().dismiss();
            } else {
                c1243.m23415().show();
            }
        }
    }
}
