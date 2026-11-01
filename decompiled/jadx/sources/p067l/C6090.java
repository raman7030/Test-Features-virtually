package p067l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۘۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes2.dex */
public final class C6090 implements Drawable.Callback {

    /* JADX INFO: renamed from: ᩶ */
    public final TextView f15304;

    /* JADX INFO: renamed from: ᩸ */
    public final RunnableC20172 f15305;

    /* JADX INFO: renamed from: ᩹ */
    public Rect f15306;

    public C6090(TextView textView, RunnableC20172 runnableC20172, Rect rect) {
        this.f15304 = textView;
        this.f15305 = runnableC20172;
        this.f15306 = new Rect(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        TextView textView = this.f15304;
        if (looperMyLooper != mainLooper) {
            textView.post(new RunnableC4749(this, drawable));
            return;
        }
        Rect bounds = drawable.getBounds();
        if (!this.f15306.equals(bounds)) {
            this.f15305.m45651();
            this.f15306 = new Rect(bounds);
        } else {
            textView.postInvalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f15304.postDelayed(runnable, j - SystemClock.uptimeMillis());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f15304.removeCallbacks(runnable);
    }
}
