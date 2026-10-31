package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۖۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2301 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float f7427;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f7428;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18529 f7429;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f7430 = System.currentTimeMillis();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f7431;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f7432;

    public RunnableC2301(ViewOnTouchListenerC18529 viewOnTouchListenerC18529, float f, float f2, float f3, float f4) {
        this.f7429 = viewOnTouchListenerC18529;
        this.f7431 = f3;
        this.f7432 = f4;
        this.f7427 = f;
        this.f7428 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f7429;
        ImageView imageViewM43073 = viewOnTouchListenerC18529.m43073();
        if (imageViewM43073 == null) {
            return;
        }
        float interpolation = ViewOnTouchListenerC18529.f57407.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f7430) * 1.0f) / 300));
        float f = this.f7427;
        viewOnTouchListenerC18529.m43062(C20382.m46695(this.f7428, f, interpolation, f) / viewOnTouchListenerC18529.m43075(), this.f7431, this.f7432);
        if (interpolation < 1.0f) {
            imageViewM43073.postOnAnimation(this);
        }
    }
}
