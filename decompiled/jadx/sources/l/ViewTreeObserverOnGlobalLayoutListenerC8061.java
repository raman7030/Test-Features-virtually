package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC8061 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21467 f24864;

    public ViewTreeObserverOnGlobalLayoutListenerC8061(C21467 c21467) {
        this.f24864 = c21467;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C21467 c21467 = this.f24864;
        if (!c21467.m48614(c21467.f69092)) {
            c21467.dismiss();
        } else {
            c21467.m48615();
            c21467.show();
        }
    }
}
