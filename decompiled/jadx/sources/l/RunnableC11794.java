package l;

import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YF */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11794 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC13909 f35183;

    public RunnableC11794(AbstractViewOnTouchListenerC13909 abstractViewOnTouchListenerC13909) {
        this.f35183 = abstractViewOnTouchListenerC13909;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.f35183.f41455.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
