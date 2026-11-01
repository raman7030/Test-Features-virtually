package p067l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.۬ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4IH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14926 extends AbstractC6880 {

    /* JADX INFO: renamed from: ۫ */
    public Paint f42624;

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo28233(Canvas canvas, Paint paint, int i, int i2);

    @Override // p067l.AbstractC6880
    /* JADX INFO: renamed from: ֫ */
    public final void mo15772(Canvas canvas, int i, int i2) {
        if (this.f42624 == null) {
            Paint paint = new Paint();
            this.f42624 = paint;
            paint.setAntiAlias(true);
            this.f42624.setColor(-16777216);
            this.f42624.setStyle(Paint.Style.FILL);
        }
        this.f42624.setAlpha(this.f17888);
        Paint paint2 = this.f42624;
        ColorFilter colorFilter = this.f17889;
        if (colorFilter == null) {
            colorFilter = this.f17885;
        }
        paint2.setColorFilter(colorFilter);
        mo28233(canvas, this.f42624, i, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f17888;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f17889;
    }
}
