package p067l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.֨ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3417 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14146 f6780;

    public ViewTreeObserverOnGlobalLayoutListenerC3417(C14146 c14146) {
        this.f6780 = c14146;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C24047 c24047 = this.f6780.f40198;
        if (c24047 != null) {
            c24047.f76378.invalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        C14146 c14146 = this.f6780;
        C24047 c24047 = c14146.f40198;
        if (c24047 != null) {
            c24047.f76378.invalidate();
        }
        c14146.m32507();
    }
}
