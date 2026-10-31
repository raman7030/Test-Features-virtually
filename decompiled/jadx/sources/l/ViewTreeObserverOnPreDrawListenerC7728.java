package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC7728 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18333 f23917;

    public ViewTreeObserverOnPreDrawListenerC7728(C18333 c18333) {
        this.f23917 = c18333;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f23917.onChildViewsChanged(0);
        return true;
    }
}
