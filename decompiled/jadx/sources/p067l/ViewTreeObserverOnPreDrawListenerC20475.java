package p067l;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ᩴ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC20475 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ViewTreeObserver f63241;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogInterfaceC2564 f63242;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14849 f63243;

    public ViewTreeObserverOnPreDrawListenerC20475(ViewTreeObserver viewTreeObserver, DialogInterfaceC2564 dialogInterfaceC2564, C14849 c14849) {
        this.f63241 = viewTreeObserver;
        this.f63242 = dialogInterfaceC2564;
        this.f63243 = c14849;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f63241;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f63242;
        if (dialogInterfaceC2564 == null) {
            return true;
        }
        AbstractC23964 itemAnimator = this.f63243.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m53111(new C6393(dialogInterfaceC2564));
            return true;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC22707(3, dialogInterfaceC2564));
        return true;
    }
}
