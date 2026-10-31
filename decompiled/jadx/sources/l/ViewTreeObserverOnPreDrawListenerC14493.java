package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5XN */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC14493 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f44391;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Runnable f44392;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View f44393;

    public ViewTreeObserverOnPreDrawListenerC14493(View view, Runnable runnable) {
        this.f44393 = view;
        this.f44391 = view.getViewTreeObserver();
        this.f44392 = runnable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34591(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC14493 viewTreeObserverOnPreDrawListenerC14493 = new ViewTreeObserverOnPreDrawListenerC14493(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC14493);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC14493);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f44391.isAlive();
        View view = this.f44393;
        if (zIsAlive) {
            this.f44391.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f44392.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f44391.isAlive();
        View view2 = this.f44393;
        if (zIsAlive) {
            this.f44391.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f44391 = view.getViewTreeObserver();
    }
}
