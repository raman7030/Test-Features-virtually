package p067l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ܶۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C1592 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1907 f49343;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f49344;

    public C1592(C1907 c1907, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f49343 = c1907;
        this.f49344 = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f49343.f71790.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f49344);
        }
    }
}
