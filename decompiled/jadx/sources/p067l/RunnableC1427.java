package p067l;

import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۨܺ */
/* JADX INFO: compiled from: 44YF */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1427 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractViewOnTouchListenerC1532 f38185;

    public RunnableC1427(AbstractViewOnTouchListenerC1532 abstractViewOnTouchListenerC1532) {
        this.f38185 = abstractViewOnTouchListenerC1532;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.f38185.f44536.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
