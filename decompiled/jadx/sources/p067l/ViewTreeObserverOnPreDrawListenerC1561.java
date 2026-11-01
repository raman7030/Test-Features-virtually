package p067l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܳۨ */
/* JADX INFO: compiled from: U5XN */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC1561 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩶ */
    public ViewTreeObserver f47492;

    /* JADX INFO: renamed from: ᩸ */
    public final Runnable f47493;

    /* JADX INFO: renamed from: ᩹ */
    public final View f47494;

    public ViewTreeObserverOnPreDrawListenerC1561(View view, Runnable runnable) {
        this.f47494 = view;
        this.f47492 = view.getViewTreeObserver();
        this.f47493 = runnable;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36732(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC1561 viewTreeObserverOnPreDrawListenerC1561 = new ViewTreeObserverOnPreDrawListenerC1561(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1561);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1561);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f47492.isAlive();
        View view = this.f47494;
        if (zIsAlive) {
            this.f47492.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f47493.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f47492.isAlive();
        View view2 = this.f47494;
        if (zIsAlive) {
            this.f47492.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f47492 = view.getViewTreeObserver();
    }
}
