package l;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6359 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f19683;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ValueAnimator f19684;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17376 f19685;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3537 f19686;

    public RunnableC6359(View view, C17376 c17376, C3537 c3537, ValueAnimator valueAnimator) {
        this.f19683 = view;
        this.f19685 = c17376;
        this.f19686 = c3537;
        this.f19684 = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23292.m51613(this.f19683, this.f19685, this.f19686);
        this.f19684.start();
    }
}
