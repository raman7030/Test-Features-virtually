package l;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.ۖ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2778 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f8655;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Paint f8656 = new Paint(1);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f8657;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f8658;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8579(int i) {
        this.f8655 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8581() {
        this.f8657 = 1;
        this.f8658 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m8583() {
        int i = this.f8657;
        if (i == 1 || i == 2) {
            this.f8657 = 3;
            this.f8658 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8578() {
        this.f8657 = 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m8582() {
        return this.f8657 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8580(Canvas canvas, int i, float f, float f2) {
        int i2 = this.f8657;
        Paint paint = this.f8656;
        if (i2 == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f8658;
            if (jCurrentTimeMillis >= 100) {
                this.f8657 = 2;
            } else {
                int i3 = i / 2;
                paint.setColor(this.f8655);
                canvas.drawCircle(f, f2, (int) (((i - i3) * (jCurrentTimeMillis / 100.0f)) + i3), paint);
                return true;
            }
        }
        int i4 = this.f8657;
        if (i4 == 2) {
            paint.setColor(this.f8655);
            canvas.drawCircle(f, f2, i, paint);
            return false;
        }
        if (i4 != 3) {
            return false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f8658;
        if (jCurrentTimeMillis2 >= 400) {
            this.f8657 = 0;
            return true;
        }
        float f3 = jCurrentTimeMillis2 / 400.0f;
        int i5 = (int) (i - ((i - ((i * 3) / 4)) * f3));
        int i6 = this.f8655;
        float f4 = i6 >>> 24;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        paint.setColor((((int) ((1.0f - ((float) Math.sin(f3 * 1.5707964f))) * f4)) << 24) | (i6 & 16777215));
        canvas.drawCircle(f, f2, i5, paint);
        return true;
    }
}
