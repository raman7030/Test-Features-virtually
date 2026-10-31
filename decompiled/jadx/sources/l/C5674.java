package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A3PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5674 extends Drawable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final float f17516 = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f17517;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Path f17518;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f17519;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f17520;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f17521;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f17522;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f17523;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f17524;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f17525;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f17526;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f17527;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Paint f17528;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C5674(Context context) {
        Paint paint = new Paint();
        this.f17528 = paint;
        this.f17518 = new Path();
        this.f17523 = false;
        this.f17525 = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C3390.f10717, R.attr.MT_Protector, R.style.MT_Protector);
        m15982(typedArrayObtainStyledAttributes.getColor(3, 0));
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f17522 = (float) (Math.cos(f17516) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f17519 != z) {
            this.f17519 = z;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f17524) {
            this.f17524 = fRound;
            invalidateSelf();
        }
        this.f17520 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f17526 = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f17517 = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f17521 = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15982(int i) {
        Paint paint = this.f17528;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15983(boolean z) {
        if (this.f17523 != z) {
            this.f17523 = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z = false;
        int i = this.f17525;
        if (i != 0 && (i == 1 || (i == 3 ? C8184.m21687(this) == 0 : C8184.m21687(this) == 1))) {
            z = true;
        }
        float f = this.f17517;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.f17527;
        float f3 = this.f17526;
        float fM15980 = m15980(f3, fSqrt, f2);
        float fM15981 = m15980(f3, this.f17521, this.f17527);
        float fRound = Math.round(m15980(0.0f, this.f17522, this.f17527));
        float fM15982 = m15980(0.0f, f17516, this.f17527);
        float fM15983 = m15980(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f17527);
        double d = fM15980;
        double d2 = fM15982;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(Math.sin(d2) * d);
        Path path = this.f17518;
        path.rewind();
        float f4 = this.f17524;
        Paint paint = this.f17528;
        float fM15984 = m15980(f4 + paint.getStrokeWidth(), -this.f17522, this.f17527);
        float f5 = (-fM15981) / 2.0f;
        path.moveTo(f5 + fRound, 0.0f);
        path.rLineTo(fM15981 - (fRound * 2.0f), 0.0f);
        path.moveTo(f5, fM15984);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f5, -fM15984);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f6 = this.f17524;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f6 + ((((int) (fHeight - (2.0f * f6))) / 4) * 2));
        if (this.f17519) {
            canvas.rotate(fM15983 * (this.f17523 ^ z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f17528;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17528.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f17520;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f17520;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15981(float f) {
        if (this.f17527 != f) {
            this.f17527 = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m15980(float f, float f2, float f3) {
        return C20382.m46695(f2, f, f3, f);
    }
}
