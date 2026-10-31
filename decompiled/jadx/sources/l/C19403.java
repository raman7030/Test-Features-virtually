package l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: l.᩵ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19403 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f62774;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18697 f62775;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f62776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Resources f62777;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ValueAnimator f62778;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f62779;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final LinearInterpolator f62772 = new LinearInterpolator();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C8791 f62771 = new C8791();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f62773 = {-16777216};

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C19403(Context context) {
        context.getClass();
        this.f62777 = context.getResources();
        C18697 c18697 = new C18697();
        this.f62775 = c18697;
        c18697.f59126 = f62773;
        c18697.m43312(0);
        c18697.f59114 = 2.5f;
        c18697.f59120.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C2469(this, c18697));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f62772);
        valueAnimatorOfFloat.addListener(new C3880(this, c18697));
        this.f62778 = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44679() {
        float f = this.f62777.getDisplayMetrics().density;
        float f2 = 2.5f * f;
        C18697 c18697 = this.f62775;
        c18697.f59114 = f2;
        c18697.f59120.setStrokeWidth(f2);
        c18697.f59110 = 7.5f * f;
        c18697.m43312(0);
        c18697.f59118 = (int) (10.0f * f);
        c18697.f59121 = (int) (f * 5.0f);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44684(float f) {
        this.f62775.f59111 = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f62774, bounds.exactCenterX(), bounds.exactCenterY());
        C18697 c18697 = this.f62775;
        Paint paint = c18697.f59120;
        RectF rectF = c18697.f59119;
        float f = c18697.f59110;
        float fMin = (c18697.f59114 / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c18697.f59118 * c18697.f59122) / 2.0f, c18697.f59114 / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c18697.f59125;
        float f3 = c18697.f59111;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c18697.f59115 + f3) * 360.0f) - f4;
        paint.setColor(c18697.f59116);
        paint.setAlpha(c18697.f59109);
        float f6 = c18697.f59114 / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c18697.f59127);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = c18697.f59123;
        if (c18697.f59124) {
            Path path = c18697.f59117;
            if (path == null) {
                Path path2 = new Path();
                c18697.f59117 = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c18697.f59118 * c18697.f59122) / 2.0f;
            c18697.f59117.moveTo(0.0f, 0.0f);
            c18697.f59117.lineTo(c18697.f59118 * c18697.f59122, 0.0f);
            Path path3 = c18697.f59117;
            float f9 = c18697.f59118;
            float f10 = c18697.f59122;
            path3.lineTo((f9 * f10) / 2.0f, c18697.f59121 * f10);
            c18697.f59117.offset((rectF.centerX() + fMin2) - f8, (c18697.f59114 / 2.0f) + rectF.centerY());
            c18697.f59117.close();
            paint2.setColor(c18697.f59116);
            paint2.setAlpha(c18697.f59109);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c18697.f59117, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f62775.f59109 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f62775.f59109;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f62775.f59120.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f62778.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f62778.cancel();
        C18697 c18697 = this.f62775;
        float f = c18697.f59125;
        c18697.f59108 = f;
        float f2 = c18697.f59115;
        c18697.f59107 = f2;
        c18697.f59112 = c18697.f59111;
        if (f2 != f) {
            this.f62779 = true;
            this.f62778.setDuration(666L);
            this.f62778.start();
            return;
        }
        c18697.m43312(0);
        c18697.f59108 = 0.0f;
        c18697.f59107 = 0.0f;
        c18697.f59112 = 0.0f;
        c18697.f59125 = 0.0f;
        c18697.f59115 = 0.0f;
        c18697.f59111 = 0.0f;
        this.f62778.setDuration(1332L);
        this.f62778.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f62778.cancel();
        this.f62774 = 0.0f;
        C18697 c18697 = this.f62775;
        if (c18697.f59124) {
            c18697.f59124 = false;
        }
        c18697.m43312(0);
        c18697.f59108 = 0.0f;
        c18697.f59107 = 0.0f;
        c18697.f59112 = 0.0f;
        c18697.f59125 = 0.0f;
        c18697.f59115 = 0.0f;
        c18697.f59111 = 0.0f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44681(float f, C18697 c18697, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f62779) {
            m44678(f, c18697);
            float fFloor = (float) (Math.floor(c18697.f59112 / 0.8f) + 1.0d);
            float f2 = c18697.f59108;
            float f3 = c18697.f59107;
            c18697.f59125 = (((f3 - 0.01f) - f2) * f) + f2;
            c18697.f59115 = f3;
            float f4 = c18697.f59112;
            c18697.f59111 = C20382.m46695(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = c18697.f59112;
            C8791 c8791 = f62771;
            if (f < 0.5f) {
                interpolation = c18697.f59108;
                interpolation2 = (c8791.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = c18697.f59108 + 0.79f;
                interpolation = f6 - (((1.0f - c8791.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f62776) * 216.0f;
            c18697.f59125 = interpolation;
            c18697.f59115 = interpolation2;
            c18697.f59111 = f7;
            this.f62774 = f8;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44683(int... iArr) {
        C18697 c18697 = this.f62775;
        c18697.f59126 = iArr;
        c18697.m43312(0);
        c18697.m43312(0);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44685(float f) {
        C18697 c18697 = this.f62775;
        c18697.f59125 = 0.0f;
        c18697.f59115 = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44678(float f, C18697 c18697) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c18697.f59126;
            int i2 = c18697.f59113;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            i = ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f2))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f2))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f2))) << 8) | (i8 + ((int) (f2 * ((i4 & 255) - i8))));
        } else {
            i = c18697.f59126[c18697.f59113];
        }
        c18697.f59116 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44682(boolean z) {
        C18697 c18697 = this.f62775;
        if (c18697.f59124 != z) {
            c18697.f59124 = z;
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44680(float f) {
        C18697 c18697 = this.f62775;
        if (f != c18697.f59122) {
            c18697.f59122 = f;
        }
        invalidateSelf();
    }
}
