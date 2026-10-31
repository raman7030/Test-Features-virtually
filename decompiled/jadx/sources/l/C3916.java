package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۘۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes2.dex */
public final class C3916 implements Drawable.Callback {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f12496;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC18733 f12497;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Rect f12498;

    public C3916(TextView textView, RunnableC18733 runnableC18733, Rect rect) {
        this.f12496 = textView;
        this.f12497 = runnableC18733;
        this.f12498 = new Rect(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        TextView textView = this.f12496;
        if (looperMyLooper != mainLooper) {
            textView.post(new RunnableC2505(this, drawable));
            return;
        }
        Rect bounds = drawable.getBounds();
        if (!this.f12498.equals(bounds)) {
            this.f12497.m43384();
            this.f12498 = new Rect(bounds);
        } else {
            textView.postInvalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f12496.postDelayed(runnable, j - SystemClock.uptimeMillis());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f12496.removeCallbacks(runnable);
    }
}
