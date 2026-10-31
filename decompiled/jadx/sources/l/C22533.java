package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩹᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8FK */
/* JADX INFO: loaded from: classes.dex */
public final class C22533 extends Drawable {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f72914;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Paint f72912 = new Paint(1);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72913 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f72911 = 820965102;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public C22533() {
    }

    public C22533(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        int i = this.f72913;
        if (i != 2) {
            if (i == 3) {
                this.f72913 = 1;
                return;
            } else if (i != 4) {
                return;
            }
        }
        this.f72913 = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.f72913;
        Paint paint = this.f72912;
        if (i == 1) {
            paint.setColor(this.f72911);
            Rect bounds = getBounds();
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), Math.min(bounds.width(), bounds.height()) / 2, paint);
            return;
        }
        if (i == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f72914;
            if (jUptimeMillis < 0 || jUptimeMillis > 600) {
                this.f72913 = 0;
                return;
            }
            Rect bounds2 = getBounds();
            float f = jUptimeMillis >= 200 ? 1.0f - ((jUptimeMillis - 200) / 400.0f) : 1.0f;
            float fMin = ((0.05f * f) + 0.95f) * (Math.min(bounds2.width(), bounds2.height()) / 2);
            int i2 = this.f72911;
            paint.setColor((i2 & 16777215) | (((int) ((i2 >>> 24) * f)) << 24));
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), fMin, paint);
            invalidateSelf();
            return;
        }
        if (i == 3 || i == 4) {
            Rect bounds3 = getBounds();
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.f72914;
            if (jUptimeMillis2 >= 0 && jUptimeMillis2 <= 150) {
                float f2 = ((jUptimeMillis2 / 150.0f) * 0.5f) + 0.5f;
                float fMin2 = (Math.min(bounds3.width(), bounds3.height()) / 2) * f2;
                int i3 = this.f72911;
                paint.setColor((((int) ((i3 >>> 24) * f2)) << 24) | (i3 & 16777215));
                canvas.drawCircle(bounds3.centerX(), bounds3.centerY(), fMin2, paint);
                invalidateSelf();
                return;
            }
            if (this.f72913 == 3) {
                paint.setColor(this.f72911);
                canvas.drawCircle(bounds3.centerX(), bounds3.centerY(), Math.min(bounds3.width(), bounds3.height()) / 2, paint);
                this.f72913 = 1;
            } else {
                if (jUptimeMillis2 > 750) {
                    this.f72913 = 0;
                    return;
                }
                paint.setColor(this.f72911);
                canvas.drawCircle(bounds3.centerX(), bounds3.centerY(), Math.min(bounds3.width(), bounds3.height()) / 2, paint);
                this.f72913 = 2;
                this.f72914 = SystemClock.uptimeMillis();
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == -16842910) {
                this.f72913 = 0;
                invalidateSelf();
                return true;
            }
            if (i == 16842913) {
                this.f72913 = 1;
                invalidateSelf();
                return true;
            }
            if (i == 16842919) {
                z = true;
            }
        }
        if (z) {
            int i2 = this.f72913;
            if (i2 == 0 || i2 == 2) {
                this.f72913 = 3;
                this.f72914 = SystemClock.uptimeMillis();
                invalidateSelf();
                return true;
            }
        } else {
            int i3 = this.f72913;
            if (i3 == 1) {
                this.f72913 = 2;
                this.f72914 = SystemClock.uptimeMillis();
                invalidateSelf();
                return true;
            }
            if (i3 == 3) {
                this.f72913 = 4;
                invalidateSelf();
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f72911 = (i << 24) | (this.f72911 & 16777215);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f72912.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
