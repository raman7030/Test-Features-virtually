package p067l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۖۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4555 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final float f10213;

    /* JADX INFO: renamed from: ۙ */
    public final float f10214;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ ViewOnTouchListenerC19978 f10215;

    /* JADX INFO: renamed from: ᩶ */
    public final long f10216 = System.currentTimeMillis();

    /* JADX INFO: renamed from: ᩸ */
    public final float f10217;

    /* JADX INFO: renamed from: ᩹ */
    public final float f10218;

    public RunnableC4555(ViewOnTouchListenerC19978 viewOnTouchListenerC19978, float f, float f2, float f3, float f4) {
        this.f10215 = viewOnTouchListenerC19978;
        this.f10217 = f3;
        this.f10218 = f4;
        this.f10213 = f;
        this.f10214 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f10215;
        ImageView imageViewM45351 = viewOnTouchListenerC19978.m45351();
        if (imageViewM45351 == null) {
            return;
        }
        float interpolation = ViewOnTouchListenerC19978.f60628.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f10216) * 1.0f) / 300));
        float f = this.f10213;
        viewOnTouchListenerC19978.m45340(C21740.m49018(this.f10214, f, interpolation, f) / viewOnTouchListenerC19978.m45353(), this.f10217, this.f10218);
        if (interpolation < 1.0f) {
            imageViewM45351.postOnAnimation(this);
        }
    }
}
