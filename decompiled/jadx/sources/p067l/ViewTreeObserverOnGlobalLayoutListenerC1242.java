package p067l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.۠ۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1242 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1907 f27777;

    public ViewTreeObserverOnGlobalLayoutListenerC1242(C1907 c1907) {
        this.f27777 = c1907;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C1907 c1907 = this.f27777;
        if (!c1907.m50951(c1907.f71790)) {
            c1907.dismiss();
        } else {
            c1907.m50952();
            c1907.show();
        }
    }
}
