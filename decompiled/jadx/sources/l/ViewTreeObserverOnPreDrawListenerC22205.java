package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩹ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC22205 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72063;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f72064;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BooleanSupplier f72065;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3155 f72066;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12327 f72067;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewTreeObserverOnPreDrawListenerC22205(C12327 c12327, BooleanSupplier booleanSupplier, int i, Runnable runnable) {
        this.f72067 = c12327;
        this.f72065 = booleanSupplier;
        this.f72063 = i;
        this.f72064 = runnable;
        this.f72066 = new C3155(c12327);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.f72065.getAsBoolean()) {
            m49885();
            return true;
        }
        if (!this.f72066.m9584(this.f72063)) {
            return false;
        }
        m49885();
        Runnable runnable = this.f72064;
        if (runnable != null) {
            runnable.run();
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m49885();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49885() {
        C12327 c12327 = this.f72067;
        c12327.f36898.getViewTreeObserver().removeOnPreDrawListener(this);
        c12327.f36898.removeOnAttachStateChangeListener(this);
    }
}
