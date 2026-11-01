package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.ۖ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5009 {

    /* JADX INFO: renamed from: ֫ */
    public int f11449;

    /* JADX INFO: renamed from: ۧ */
    public final Paint f11450 = new Paint(1);

    /* JADX INFO: renamed from: ܽ */
    public int f11451;

    /* JADX INFO: renamed from: ᩳ */
    public long f11452;

    /* JADX INFO: renamed from: ֫ */
    public final void m10642(int i) {
        this.f11449 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10644() {
        this.f11451 = 1;
        this.f11452 = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m10646() {
        int i = this.f11451;
        if (i == 1 || i == 2) {
            this.f11451 = 3;
            this.f11452 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10641() {
        this.f11451 = 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m10645() {
        return this.f11451 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10643(Canvas canvas, int i, float f, float f2) {
        int i2 = this.f11451;
        Paint paint = this.f11450;
        if (i2 == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f11452;
            if (jCurrentTimeMillis >= 100) {
                this.f11451 = 2;
            } else {
                int i3 = i / 2;
                paint.setColor(this.f11449);
                canvas.drawCircle(f, f2, (int) (((i - i3) * (jCurrentTimeMillis / 100.0f)) + i3), paint);
                return true;
            }
        }
        int i4 = this.f11451;
        if (i4 == 2) {
            paint.setColor(this.f11449);
            canvas.drawCircle(f, f2, i, paint);
            return false;
        }
        if (i4 != 3) {
            return false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f11452;
        if (jCurrentTimeMillis2 >= 400) {
            this.f11451 = 0;
            return true;
        }
        float f3 = jCurrentTimeMillis2 / 400.0f;
        int i5 = (int) (i - ((i - ((i * 3) / 4)) * f3));
        int i6 = this.f11449;
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
