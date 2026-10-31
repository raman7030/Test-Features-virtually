package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.۬ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4IH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13213 extends AbstractC4747 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Paint f39559;

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo26204(Canvas canvas, Paint paint, int i, int i2);

    @Override // l.AbstractC4747
    /* JADX INFO: renamed from: ֫ */
    public final void mo13892(Canvas canvas, int i, int i2) {
        if (this.f39559 == null) {
            Paint paint = new Paint();
            this.f39559 = paint;
            paint.setAntiAlias(true);
            this.f39559.setColor(-16777216);
            this.f39559.setStyle(Paint.Style.FILL);
        }
        this.f39559.setAlpha(this.f15057);
        Paint paint2 = this.f39559;
        ColorFilter colorFilter = this.f15058;
        if (colorFilter == null) {
            colorFilter = this.f15054;
        }
        paint2.setColorFilter(colorFilter);
        mo26204(canvas, this.f39559, i, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15057;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f15058;
    }
}
