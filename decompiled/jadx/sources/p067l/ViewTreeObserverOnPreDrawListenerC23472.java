package p067l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩹ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC23472 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f74784;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Runnable f74785;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ BooleanSupplier f74786;

    /* JADX INFO: renamed from: ᩸ */
    public final C5367 f74787;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14084 f74788;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewTreeObserverOnPreDrawListenerC23472(C14084 c14084, BooleanSupplier booleanSupplier, int i, Runnable runnable) {
        this.f74788 = c14084;
        this.f74786 = booleanSupplier;
        this.f74784 = i;
        this.f74785 = runnable;
        this.f74787 = new C5367(c14084);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.f74786.getAsBoolean()) {
            m52212();
            return true;
        }
        if (!this.f74787.m11628(this.f74784)) {
            return false;
        }
        m52212();
        Runnable runnable = this.f74785;
        if (runnable != null) {
            runnable.run();
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m52212();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52212() {
        C14084 c14084 = this.f74788;
        c14084.f39912.getViewTreeObserver().removeOnPreDrawListener(this);
        c14084.f39912.removeOnAttachStateChangeListener(this);
    }
}
