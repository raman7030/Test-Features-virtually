package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩻ */
/* JADX INFO: compiled from: A3PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1123 extends Drawable {

    /* JADX INFO: renamed from: ۖ */
    public static final float f20363 = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: ֫ */
    public float f20364;

    /* JADX INFO: renamed from: ۜ */
    public final Path f20365;

    /* JADX INFO: renamed from: ۡ */
    public boolean f20366;

    /* JADX INFO: renamed from: ۢ */
    public final int f20367;

    /* JADX INFO: renamed from: ۧ */
    public float f20368;

    /* JADX INFO: renamed from: ܳ */
    public float f20369;

    /* JADX INFO: renamed from: ܺ */
    public boolean f20370;

    /* JADX INFO: renamed from: ܽ */
    public float f20371;

    /* JADX INFO: renamed from: ܿ */
    public int f20372;

    /* JADX INFO: renamed from: ᩳ */
    public float f20373;

    /* JADX INFO: renamed from: ᩷ */
    public float f20374;

    /* JADX INFO: renamed from: ᩻ */
    public final Paint f20375;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C1123(Context context) {
        Paint paint = new Paint();
        this.f20375 = paint;
        this.f20365 = new Path();
        this.f20370 = false;
        this.f20372 = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C1010.f13524, R.attr.MT_Protector, R.style.MT_Protector);
        m17917(typedArrayObtainStyledAttributes.getColor(3, 0));
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f20369 = (float) (Math.cos(f20363) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f20366 != z) {
            this.f20366 = z;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f20371) {
            this.f20371 = fRound;
            invalidateSelf();
        }
        this.f20367 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f20373 = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f20364 = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f20368 = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17917(int i) {
        Paint paint = this.f20375;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17918(boolean z) {
        if (this.f20370 != z) {
            this.f20370 = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z = false;
        int i = this.f20372;
        if (i != 0 && (i == 1 || (i == 3 ? C1248.m23656(this) == 0 : C1248.m23656(this) == 1))) {
            z = true;
        }
        float f = this.f20364;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.f20374;
        float f3 = this.f20373;
        float fM17915 = m17915(f3, fSqrt, f2);
        float fM17916 = m17915(f3, this.f20368, this.f20374);
        float fRound = Math.round(m17915(0.0f, this.f20369, this.f20374));
        float fM17917 = m17915(0.0f, f20363, this.f20374);
        float fM17918 = m17915(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f20374);
        double d = fM17915;
        double d2 = fM17917;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(Math.sin(d2) * d);
        Path path = this.f20365;
        path.rewind();
        float f4 = this.f20371;
        Paint paint = this.f20375;
        float fM17919 = m17915(f4 + paint.getStrokeWidth(), -this.f20369, this.f20374);
        float f5 = (-fM17916) / 2.0f;
        path.moveTo(f5 + fRound, 0.0f);
        path.rLineTo(fM17916 - (fRound * 2.0f), 0.0f);
        path.moveTo(f5, fM17919);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f5, -fM17919);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f6 = this.f20371;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f6 + ((((int) (fHeight - (2.0f * f6))) / 4) * 2));
        if (this.f20366) {
            canvas.rotate(fM17918 * (this.f20370 ^ z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f20375;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20375.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f20367;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f20367;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17916(float f) {
        if (this.f20374 != f) {
            this.f20374 = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m17915(float f, float f2, float f3) {
        return C21740.m49018(f2, f, f3, f);
    }
}
