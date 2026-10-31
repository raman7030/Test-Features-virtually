package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2438 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8082 f7765;

    public ViewTreeObserverOnGlobalLayoutListenerC2438(C8082 c8082) {
        this.f7765 = c8082;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C8082 c8082 = this.f7765;
        if (c8082.m21447().f28156.isShowing()) {
            if (!c8082.isShown()) {
                c8082.m21447().dismiss();
            } else {
                c8082.m21447().show();
            }
        }
    }
}
