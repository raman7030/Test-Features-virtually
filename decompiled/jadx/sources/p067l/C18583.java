package p067l;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܿۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47UH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18583 extends Drawable {

    /* JADX INFO: renamed from: ֡ */
    public final Path f55473;

    /* JADX INFO: renamed from: ֫ */
    public float f55474;

    /* JADX INFO: renamed from: ۖ */
    public final C1703[] f55475;

    /* JADX INFO: renamed from: ۘ */
    public float f55476;

    /* JADX INFO: renamed from: ۚ */
    public final float f55477;

    /* JADX INFO: renamed from: ۜ */
    public final C1703[] f55478;

    /* JADX INFO: renamed from: ۡ */
    public final Paint f55479;

    /* JADX INFO: renamed from: ۢ */
    public final int f55480;

    /* JADX INFO: renamed from: ۧ */
    public float f55481;

    /* JADX INFO: renamed from: ܳ */
    public int f55482;

    /* JADX INFO: renamed from: ܺ */
    public final C1703[] f55483;

    /* JADX INFO: renamed from: ܽ */
    public ValueAnimator f55484;

    /* JADX INFO: renamed from: ܿ */
    public int f55485;

    /* JADX INFO: renamed from: ᩳ */
    public Path f55486;

    /* JADX INFO: renamed from: ᩴ */
    public final Path f55487;

    /* JADX INFO: renamed from: ᩵ */
    public final Matrix f55488;

    /* JADX INFO: renamed from: ᩷ */
    public float f55489;

    /* JADX INFO: renamed from: ᩻ */
    public final Path f55490;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C18583(C1703[] c1703Arr, C1703[] c1703Arr2) {
        Path path = new Path();
        this.f55490 = path;
        this.f55488 = new Matrix();
        this.f55473 = new Path();
        this.f55487 = new Path();
        this.f55489 = 0.0f;
        this.f55474 = -1.0f;
        this.f55481 = -1.0f;
        this.f55485 = -16777216;
        this.f55482 = -16777216;
        this.f55476 = 0.0f;
        Paint paint = new Paint();
        this.f55479 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        if (!C1563.m36820(c1703Arr, c1703Arr2)) {
            throw new IllegalArgumentException();
        }
        this.f55483 = c1703Arr;
        this.f55475 = c1703Arr2;
        C1703[] c1703ArrM36823 = C1563.m36823(c1703Arr);
        this.f55478 = c1703ArrM36823;
        C1563.m36819(c1703ArrM36823, path);
        float f = 24;
        this.f55477 = f;
        this.f55480 = (int) ((f * C7050.m16235().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42285() {
        this.f55489 = 90.0f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42282(float f) {
        this.f55474 = 1.0f;
        this.f55481 = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m42289(int i) {
        if (this.f55476 == 1.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.f55484;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f55484.cancel();
        }
        if (i == 0) {
            m42286(1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f55484 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(i);
        this.f55484.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ᩳۖܽ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C18583 c18583 = this.f57536;
                c18583.getClass();
                c18583.m42286(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.f55484.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42281() {
        if (this.f55476 == 0.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.f55484;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f55484.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f55484 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300);
        this.f55484.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܽۖܽ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C18583 c18583 = this.f53508;
                c18583.getClass();
                c18583.m42286(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.f55484.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth <= 0 || iHeight <= 0) {
            return;
        }
        canvas.save();
        float f = iWidth;
        float f2 = this.f55477;
        float f3 = iHeight;
        float fMin = Math.min(f / f2, f3 / f2);
        float f4 = f / 2.0f;
        float f5 = f3 / 2.0f;
        float f6 = this.f55489;
        float f7 = f6 == 0.0f ? 0.0f : f6 + ((0.0f - f6) * this.f55476);
        int i = this.f55485;
        int i2 = this.f55482;
        Paint paint = this.f55479;
        if (i == i2) {
            paint.setColor(i);
        } else {
            paint.setColor(C1199.m21214(i, i2, this.f55476));
        }
        float f8 = this.f55474;
        float f9 = this.f55481;
        if (f8 != -1.0f && f9 != -1.0f) {
            paint.setAlpha((int) ((((f9 - f8) * this.f55476) + f8) * 255.0f));
        }
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        Path path = this.f55490;
        if (!zIsHardwareAccelerated) {
            canvas.translate(f4, f5);
            if (f7 != 0.0f) {
                canvas.rotate(f7);
            }
            canvas.scale(fMin, fMin);
            float f10 = (-f2) / 2.0f;
            canvas.translate(f10, f10);
            Path path2 = this.f55486;
            if (path2 != null) {
                canvas.clipPath(path2);
            }
            canvas.drawPath(path, paint);
        } else {
            float f11 = (-f2) / 2.0f;
            Matrix matrix = this.f55488;
            matrix.setTranslate(f11, f11);
            matrix.postScale(fMin, fMin);
            if (f7 != 0.0f) {
                matrix.postRotate(f7);
            }
            matrix.postTranslate(f4, f5);
            Path path3 = this.f55473;
            path3.reset();
            path.transform(matrix, path3);
            if (this.f55486 != null) {
                Path path4 = this.f55487;
                path4.reset();
                this.f55486.transform(matrix, path4);
                canvas.clipPath(path4);
            }
            canvas.drawPath(path3, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f55480;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f55480;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55479.setAlpha(i);
        this.f55481 = -1.0f;
        this.f55474 = -1.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55479.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42284(Path path) {
        this.f55486 = path;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42283(int i) {
        this.f55482 = i;
        this.f55485 = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42287(int i) {
        this.f55485 = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m42288(int i) {
        this.f55482 = i;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42286(float f) {
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        if (this.f55476 != fMax) {
            this.f55476 = fMax;
            C1703[] c1703Arr = this.f55478;
            int length = c1703Arr.length;
            C1703[] c1703Arr2 = this.f55483;
            if (length == c1703Arr2.length) {
                int length2 = c1703Arr2.length;
                C1703[] c1703Arr3 = this.f55475;
                if (length2 == c1703Arr3.length) {
                    if (!C1563.m36820(c1703Arr2, c1703Arr3)) {
                        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                    }
                    for (int i = 0; i < c1703Arr.length; i++) {
                        c1703Arr[i].m42937(c1703Arr2[i], c1703Arr3[i], fMax);
                    }
                    Path path = this.f55490;
                    path.reset();
                    C1563.m36819(c1703Arr, path);
                    invalidateSelf();
                    return;
                }
            }
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
    }

    public final void finalize() throws Throwable {
        ValueAnimator valueAnimator = this.f55484;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f55484.cancel();
        }
        super.finalize();
    }
}
