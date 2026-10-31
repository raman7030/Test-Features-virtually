package l;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ᩴ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC19051 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewTreeObserver f60012;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f60013;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f60014;

    public ViewTreeObserverOnPreDrawListenerC19051(ViewTreeObserver viewTreeObserver, DialogInterfaceC0206 dialogInterfaceC0206, C13132 c13132) {
        this.f60012 = viewTreeObserver;
        this.f60013 = dialogInterfaceC0206;
        this.f60014 = c13132;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.f60012;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f60013;
        if (dialogInterfaceC0206 == null) {
            return true;
        }
        AbstractC22723 itemAnimator = this.f60014.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m50785(new C4234(dialogInterfaceC0206));
            return true;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC21400(3, dialogInterfaceC0206));
        return true;
    }
}
