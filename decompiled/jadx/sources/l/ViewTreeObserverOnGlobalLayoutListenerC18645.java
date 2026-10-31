package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC18645 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3122 f58954;

    public ViewTreeObserverOnGlobalLayoutListenerC18645(C3122 c3122) {
        this.f58954 = c3122;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C3122 c3122 = this.f58954;
        if (!c3122.m9500().isShowing()) {
            c3122.m9501();
        }
        ViewTreeObserver viewTreeObserver = c3122.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
