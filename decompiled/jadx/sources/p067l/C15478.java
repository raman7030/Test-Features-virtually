package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.material.navigation.DrawerLayoutUtils;

/* JADX INFO: renamed from: l.ܰۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6JW */
/* JADX INFO: loaded from: classes3.dex */
public final class C15478 {

    /* JADX INFO: renamed from: ۧ */
    public final float f44194;

    /* JADX INFO: renamed from: ֫ */
    public final Paint f44193 = new Paint(1);

    /* JADX INFO: renamed from: ܽ */
    public final Path f44195 = new Path();

    public C15478(float f) {
        this.f44194 = f * 26.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35226(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float f7 = (f6 * f6) + (f5 * f5);
        float f8 = this.f44194;
        return f7 <= f8 * f8;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35225(Canvas canvas, float f, float f2) {
        Paint paint = this.f44193;
        paint.setColor(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
        float f3 = this.f44194;
        canvas.drawCircle(f, f2, f3, paint);
        Path path = this.f44195;
        path.rewind();
        float f4 = f - (0.24f * f3);
        float f5 = 0.43f * f3;
        path.moveTo(f4, f2 - f5);
        path.lineTo((f3 * 0.48f) + f, f2);
        path.lineTo(f4, f5 + f2);
        path.close();
        paint.setColor(-1);
        canvas.drawPath(path, paint);
    }
}
