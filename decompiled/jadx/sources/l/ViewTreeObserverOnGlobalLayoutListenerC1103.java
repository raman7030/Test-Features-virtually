package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.֨ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1103 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f4009;

    public ViewTreeObserverOnGlobalLayoutListenerC1103(C12392 c12392) {
        this.f4009 = c12392;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C22810 c22810 = this.f4009.f37181;
        if (c22810 != null) {
            c22810.f73648.invalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        C12392 c12392 = this.f4009;
        C22810 c22810 = c12392.f37181;
        if (c22810 != null) {
            c22810.f73648.invalidate();
        }
        c12392.m30443();
    }
}
