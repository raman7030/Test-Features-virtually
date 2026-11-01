package p067l;

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
public final class C20809 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: ۗ */
    public float f65385;

    /* JADX INFO: renamed from: ۙ */
    public final C20138 f65386;

    /* JADX INFO: renamed from: ۬ */
    public float f65387;

    /* JADX INFO: renamed from: ᩶ */
    public Resources f65388;

    /* JADX INFO: renamed from: ᩸ */
    public ValueAnimator f65389;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f65390;

    /* JADX INFO: renamed from: ۤ */
    public static final LinearInterpolator f65383 = new LinearInterpolator();

    /* JADX INFO: renamed from: ۛ */
    public static final C10723 f65382 = new C10723();

    /* JADX INFO: renamed from: ۫ */
    public static final int[] f65384 = {-16777216};

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C20809(Context context) {
        context.getClass();
        this.f65388 = context.getResources();
        C20138 c20138 = new C20138();
        this.f65386 = c20138;
        c20138.f62349 = f65384;
        c20138.m45578(0);
        c20138.f62337 = 2.5f;
        c20138.f62343.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C4715(this, c20138));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f65383);
        valueAnimatorOfFloat.addListener(new C6056(this, c20138));
        this.f65389 = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46973() {
        float f = this.f65388.getDisplayMetrics().density;
        float f2 = 2.5f * f;
        C20138 c20138 = this.f65386;
        c20138.f62337 = f2;
        c20138.f62343.setStrokeWidth(f2);
        c20138.f62333 = 7.5f * f;
        c20138.m45578(0);
        c20138.f62341 = (int) (10.0f * f);
        c20138.f62344 = (int) (f * 5.0f);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46978(float f) {
        this.f65386.f62334 = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f65385, bounds.exactCenterX(), bounds.exactCenterY());
        C20138 c20138 = this.f65386;
        Paint paint = c20138.f62343;
        RectF rectF = c20138.f62342;
        float f = c20138.f62333;
        float fMin = (c20138.f62337 / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c20138.f62341 * c20138.f62345) / 2.0f, c20138.f62337 / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c20138.f62348;
        float f3 = c20138.f62334;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c20138.f62338 + f3) * 360.0f) - f4;
        paint.setColor(c20138.f62339);
        paint.setAlpha(c20138.f62332);
        float f6 = c20138.f62337 / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c20138.f62350);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = c20138.f62346;
        if (c20138.f62347) {
            Path path = c20138.f62340;
            if (path == null) {
                Path path2 = new Path();
                c20138.f62340 = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c20138.f62341 * c20138.f62345) / 2.0f;
            c20138.f62340.moveTo(0.0f, 0.0f);
            c20138.f62340.lineTo(c20138.f62341 * c20138.f62345, 0.0f);
            Path path3 = c20138.f62340;
            float f9 = c20138.f62341;
            float f10 = c20138.f62345;
            path3.lineTo((f9 * f10) / 2.0f, c20138.f62344 * f10);
            c20138.f62340.offset((rectF.centerX() + fMin2) - f8, (c20138.f62337 / 2.0f) + rectF.centerY());
            c20138.f62340.close();
            paint2.setColor(c20138.f62339);
            paint2.setAlpha(c20138.f62332);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c20138.f62340, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f65386.f62332 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f65386.f62332;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f65386.f62343.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f65389.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f65389.cancel();
        C20138 c20138 = this.f65386;
        float f = c20138.f62348;
        c20138.f62331 = f;
        float f2 = c20138.f62338;
        c20138.f62330 = f2;
        c20138.f62335 = c20138.f62334;
        if (f2 != f) {
            this.f65390 = true;
            this.f65389.setDuration(666L);
            this.f65389.start();
            return;
        }
        c20138.m45578(0);
        c20138.f62331 = 0.0f;
        c20138.f62330 = 0.0f;
        c20138.f62335 = 0.0f;
        c20138.f62348 = 0.0f;
        c20138.f62338 = 0.0f;
        c20138.f62334 = 0.0f;
        this.f65389.setDuration(1332L);
        this.f65389.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f65389.cancel();
        this.f65385 = 0.0f;
        C20138 c20138 = this.f65386;
        if (c20138.f62347) {
            c20138.f62347 = false;
        }
        c20138.m45578(0);
        c20138.f62331 = 0.0f;
        c20138.f62330 = 0.0f;
        c20138.f62335 = 0.0f;
        c20138.f62348 = 0.0f;
        c20138.f62338 = 0.0f;
        c20138.f62334 = 0.0f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46975(float f, C20138 c20138, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f65390) {
            m46972(f, c20138);
            float fFloor = (float) (Math.floor(c20138.f62335 / 0.8f) + 1.0d);
            float f2 = c20138.f62331;
            float f3 = c20138.f62330;
            c20138.f62348 = (((f3 - 0.01f) - f2) * f) + f2;
            c20138.f62338 = f3;
            float f4 = c20138.f62335;
            c20138.f62334 = C21740.m49018(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = c20138.f62335;
            C10723 c10723 = f65382;
            if (f < 0.5f) {
                interpolation = c20138.f62331;
                interpolation2 = (c10723.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = c20138.f62331 + 0.79f;
                interpolation = f6 - (((1.0f - c10723.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f65387) * 216.0f;
            c20138.f62348 = interpolation;
            c20138.f62338 = interpolation2;
            c20138.f62334 = f7;
            this.f65385 = f8;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46977(int... iArr) {
        C20138 c20138 = this.f65386;
        c20138.f62349 = iArr;
        c20138.m45578(0);
        c20138.m45578(0);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46979(float f) {
        C20138 c20138 = this.f65386;
        c20138.f62348 = 0.0f;
        c20138.f62338 = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46972(float f, C20138 c20138) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c20138.f62349;
            int i2 = c20138.f62336;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            i = ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f2))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f2))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f2))) << 8) | (i8 + ((int) (f2 * ((i4 & 255) - i8))));
        } else {
            i = c20138.f62349[c20138.f62336];
        }
        c20138.f62339 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46976(boolean z) {
        C20138 c20138 = this.f65386;
        if (c20138.f62347 != z) {
            c20138.f62347 = z;
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46974(float f) {
        C20138 c20138 = this.f65386;
        if (f != c20138.f62345) {
            c20138.f62345 = f;
        }
        invalidateSelf();
    }
}
