package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15115 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21467 f46223;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f46224;

    public C15115(C21467 c21467, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f46223 = c21467;
        this.f46224 = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f46223.f69092.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f46224);
        }
    }
}
