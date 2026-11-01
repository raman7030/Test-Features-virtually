package p067l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۚ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S952 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7691 extends Drawable {

    /* JADX INFO: renamed from: ֫ */
    public float f20163;

    /* JADX INFO: renamed from: ۖ */
    public float f20164;

    /* JADX INFO: renamed from: ۡ */
    public float f20167;

    /* JADX INFO: renamed from: ۢ */
    public int f20168;

    /* JADX INFO: renamed from: ܳ */
    public float f20170;

    /* JADX INFO: renamed from: ᩴ */
    public float f20175;

    /* JADX INFO: renamed from: ᩵ */
    public float f20176;

    /* JADX INFO: renamed from: ᩷ */
    public int f20177;

    /* JADX INFO: renamed from: ᩳ */
    public final Paint f20174 = new Paint(1);

    /* JADX INFO: renamed from: ܿ */
    public final Path f20173 = new Path();

    /* JADX INFO: renamed from: ܺ */
    public float f20171 = 0.5f;

    /* JADX INFO: renamed from: ۘ */
    public int f20165 = 48;

    /* JADX INFO: renamed from: ܽ */
    public final RectF f20172 = new RectF();

    /* JADX INFO: renamed from: ۜ */
    public final RectF f20166 = new RectF();

    /* JADX INFO: renamed from: ᩻ */
    public final RectF f20178 = new RectF();

    /* JADX INFO: renamed from: ۧ */
    public final RectF f20169 = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f;
        float f2;
        float f3;
        C13045.m29867(rect, "padding");
        float f4 = this.f20163;
        float f5 = this.f20170;
        float f6 = f4 + f5;
        float f7 = f5 + this.f20176;
        int i = this.f20165;
        if (i == 3) {
            f = f6;
            f6 = this.f20175 + f6;
        } else {
            if (i != 5) {
                if (i == 48) {
                    f3 = f7;
                    f7 = this.f20164 + f7;
                } else {
                    if (i != 80) {
                        return false;
                    }
                    f3 = this.f20164 + f7;
                }
                f2 = f3;
                f = f6;
            } else {
                f = this.f20175 + f6;
            }
            rect.set((int) f6, (int) f7, (int) f, (int) f2);
            return true;
        }
        f2 = f7;
        rect.set((int) f6, (int) f7, (int) f, (int) f2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C13045.m29867(canvas, "canvas");
        Rect bounds = getBounds();
        int i = this.f20165;
        float f = bounds.left;
        if (i == 3) {
            f += this.f20175;
        }
        RectF rectF = this.f20172;
        rectF.left = f;
        float f2 = bounds.top + (i == 48 ? this.f20164 : this.f20167);
        rectF.top = f2;
        float f3 = 2;
        float f4 = this.f20170 * f3;
        rectF.bottom = f4 + f2;
        float f5 = this.f20167;
        rectF.left = f + f5;
        rectF.right = f4 + f + f5;
        Rect bounds2 = getBounds();
        float f6 = bounds2.right;
        if (i == 5) {
            f6 -= this.f20175;
        }
        RectF rectF2 = this.f20166;
        rectF2.right = f6;
        float f7 = bounds2.top + (i == 48 ? this.f20164 : this.f20167);
        rectF2.top = f7;
        float f8 = this.f20170 * f3;
        rectF2.bottom = f8 + f7;
        float f9 = this.f20167;
        rectF2.left = (f6 - f8) - f9;
        rectF2.right = f6 - f9;
        Rect bounds3 = getBounds();
        float f10 = bounds3.right;
        if (i == 5) {
            f10 -= this.f20175;
        }
        RectF rectF3 = this.f20178;
        rectF3.right = f10;
        float f11 = bounds3.bottom;
        if (i == 80) {
            f11 -= this.f20164;
        }
        float f12 = this.f20170 * f3;
        float f13 = this.f20167;
        rectF3.left = (f10 - f12) - f13;
        rectF3.right = f10 - f13;
        rectF3.top = (f11 - f12) - f13;
        rectF3.bottom = f11 - f13;
        Rect bounds4 = getBounds();
        float f14 = bounds4.left;
        if (i == 3) {
            f14 += this.f20175;
        }
        RectF rectF4 = this.f20169;
        rectF4.left = f14;
        float f15 = bounds4.bottom;
        if (i == 80) {
            f15 -= this.f20164;
        }
        float f16 = this.f20170 * f3;
        float f17 = this.f20167;
        rectF4.left = f14 + f17;
        rectF4.right = f16 + f14 + f17;
        rectF4.top = (f15 - f16) - f17;
        rectF4.bottom = f15 - f17;
        Path path = this.f20173;
        path.reset();
        path.moveTo(rectF.left, rectF.bottom - this.f20170);
        path.arcTo(rectF, 180.0f, 90.0f);
        if (i == 48) {
            path.lineTo(((getBounds().width() * this.f20171) + getBounds().left) - (this.f20175 / f3), getBounds().top + this.f20164);
            path.lineTo((getBounds().width() * this.f20171) + getBounds().left, getBounds().top);
            path.lineTo((this.f20175 / f3) + (getBounds().width() * this.f20171) + getBounds().left, getBounds().top + this.f20164);
        }
        path.lineTo(rectF2.left + this.f20170, rectF2.top);
        path.arcTo(rectF2, 270.0f, 90.0f);
        if (i == 5) {
            path.lineTo(rectF2.right, ((getBounds().height() * this.f20171) + getBounds().top) - (this.f20164 / f3));
            path.lineTo(getBounds().right - this.f20167, (getBounds().height() * this.f20171) + getBounds().top);
            path.lineTo(rectF3.right, (this.f20164 / f3) + (getBounds().height() * this.f20171) + getBounds().top);
        }
        path.lineTo(rectF3.right, rectF3.top + this.f20170);
        path.arcTo(rectF3, 0.0f, 90.0f);
        if (i == 80) {
            path.lineTo((this.f20175 / f3) + (getBounds().right - (getBounds().width() * this.f20171)), rectF3.bottom);
            path.lineTo(getBounds().right - (getBounds().width() * this.f20171), getBounds().bottom - this.f20167);
            path.lineTo((getBounds().right - (getBounds().width() * this.f20171)) - (this.f20175 / f3), rectF3.bottom);
        }
        path.lineTo(rectF4.right - this.f20170, rectF4.bottom);
        path.arcTo(rectF4, 90.0f, 90.0f);
        if (i == 3) {
            path.lineTo(rectF4.left, (this.f20164 / f3) + (rectF4.bottom - (getBounds().height() * this.f20171)));
            path.lineTo(getBounds().left, rectF4.bottom - (getBounds().height() * this.f20171));
            path.lineTo(rectF.left, (rectF4.bottom - (getBounds().height() * this.f20171)) - (this.f20164 / f3));
        }
        path.close();
        int i2 = this.f20177;
        Paint paint = this.f20174;
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
        paint.setColor(this.f20168);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f20167 / 2.0f);
        canvas.drawPath(path, paint);
    }

    public C7691() {
        float fM29939 = C13076.m29939(6.0f);
        this.f20175 = fM29939;
        this.f20164 = fM29939;
        this.f20170 = C13076.m29939(4.0f);
        this.f20167 = C13076.m29939(1.0f);
        float fM299310 = C13076.m29939(4.0f);
        float fM299311 = C13076.m29939(2.0f);
        this.f20163 = fM299310;
        this.f20176 = fM299311;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f20174.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20174.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17811(float f) {
        this.f20171 = f;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17812() {
        this.f20168 = -986896;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17810() {
        this.f20177 = -12566464;
    }
}
