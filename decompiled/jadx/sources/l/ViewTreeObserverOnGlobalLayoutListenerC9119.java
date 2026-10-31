package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC9119 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC2769 f27630;

    public ViewTreeObserverOnGlobalLayoutListenerC9119(ViewOnKeyListenerC2769 viewOnKeyListenerC2769) {
        this.f27630 = viewOnKeyListenerC2769;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnKeyListenerC2769 viewOnKeyListenerC2769 = this.f27630;
        C0113 c0113 = viewOnKeyListenerC2769.f8606;
        if (!viewOnKeyListenerC2769.isShowing() || c0113.m23839()) {
            return;
        }
        View view = viewOnKeyListenerC2769.f8615;
        if (view == null || !view.isShown()) {
            viewOnKeyListenerC2769.dismiss();
        } else {
            c0113.show();
        }
    }
}
