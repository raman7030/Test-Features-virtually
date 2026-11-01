package p067l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۡ᩷ */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1294 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnKeyListenerC0979 f30570;

    public ViewTreeObserverOnGlobalLayoutListenerC1294(ViewOnKeyListenerC0979 viewOnKeyListenerC0979) {
        this.f30570 = viewOnKeyListenerC0979;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnKeyListenerC0979 viewOnKeyListenerC0979 = this.f30570;
        C0848 c0848 = viewOnKeyListenerC0979.f11400;
        if (!viewOnKeyListenerC0979.isShowing() || c0848.m25848()) {
            return;
        }
        View view = viewOnKeyListenerC0979.f11409;
        if (view == null || !view.isShown()) {
            viewOnKeyListenerC0979.dismiss();
        } else {
            c0848.show();
        }
    }
}
