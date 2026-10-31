package l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۫ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R98O */
/* JADX INFO: loaded from: classes3.dex */
public final class C12351 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f37004;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f37005;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f37006;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Rect f37007;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f37008;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f37009;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ColorFilter f37010;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Paint f37011;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f37012;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f37013;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f37014;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f37015;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f37016;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public C12351(Context context, int i) {
        Paint paint = new Paint(1);
        this.f37011 = paint;
        this.f37012 = 255;
        Resources.Theme theme = context.getTheme();
        Resources resources = context.getResources();
        this.f37005 = i;
        float f = resources.getDisplayMetrics().density;
        this.f37006 = f;
        if (i == 0) {
            this.f37008 = C21238.m48207(theme, R.attr.textColorPrimary).getDefaultColor();
            this.f37015 = (int) ((f * 2.0f) + 0.5f);
        } else if (i == 1) {
            this.f37008 = C4369.m13089(resources, bin.mt.plus.R.color.MT_Protector, theme);
            this.f37015 = 0;
        } else {
            throw new IllegalArgumentException();
        }
        this.f37009 = C21943.f70257;
        this.f37016 = this.f37008;
        if (i == 0) {
            int i2 = (int) ((4.0f * f) + 0.5f);
            int i3 = (int) ((f * 10.0f) + 0.5f);
            this.f37007 = new Rect(i2, i3, i2, i3);
            paint.setStyle(Paint.Style.FILL);
            this.f37013 = 0.0f;
            this.f37014 = 0.0f;
            return;
        }
        int i4 = (int) ((5.0f * f) + 0.5f);
        this.f37007 = new Rect(i4, i4, i4, i4);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = 2.0f * f;
        this.f37013 = f2;
        this.f37014 = f * 4.0f;
        paint.setStrokeWidth(f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        int i = this.f37016;
        int iAlpha = (Color.alpha(i) * this.f37012) / 255;
        Paint paint = this.f37011;
        paint.setColor((i & 16777215) | (iAlpha << 24));
        paint.setColorFilter(this.f37010);
        if (this.f37005 == 0) {
            float f = bounds.bottom;
            float f2 = this.f37006;
            float f3 = f - (7.0f * f2);
            if (this.f37004) {
                f2 *= 2.0f;
            }
            canvas.drawRect(bounds.left, f3, bounds.right, f3 + f2, paint);
            return;
        }
        float f4 = bounds.left;
        float f5 = this.f37013;
        float f6 = bounds.top + f5;
        float f7 = bounds.right - f5;
        float f8 = bounds.bottom - f5;
        float f9 = this.f37014;
        canvas.drawRoundRect(f4 + f5, f6, f7, f8, f9, f9, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.set(this.f37007);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = true;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == -16842910) {
                z = false;
            } else if (i == 16842908 || i == 16842919) {
                z2 = true;
            }
        }
        boolean z3 = z && z2;
        int i2 = z3 ? this.f37009 : this.f37008;
        if (this.f37016 == i2 && this.f37004 == z3) {
            return false;
        }
        this.f37016 = i2;
        this.f37004 = z3;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f37012 == i) {
            return;
        }
        this.f37012 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f37010 == colorFilter) {
            return;
        }
        this.f37010 = colorFilter;
        invalidateSelf();
    }
}
