package p067l;

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
public final class C14107 extends Drawable {

    /* JADX INFO: renamed from: ֫ */
    public boolean f40016;

    /* JADX INFO: renamed from: ۖ */
    public final int f40017;

    /* JADX INFO: renamed from: ۜ */
    public final float f40018;

    /* JADX INFO: renamed from: ۡ */
    public final Rect f40019;

    /* JADX INFO: renamed from: ۢ */
    public final int f40020;

    /* JADX INFO: renamed from: ۧ */
    public final int f40021;

    /* JADX INFO: renamed from: ܳ */
    public ColorFilter f40022;

    /* JADX INFO: renamed from: ܺ */
    public final Paint f40023;

    /* JADX INFO: renamed from: ܽ */
    public int f40024;

    /* JADX INFO: renamed from: ܿ */
    public final float f40025;

    /* JADX INFO: renamed from: ᩳ */
    public final float f40026;

    /* JADX INFO: renamed from: ᩷ */
    public final int f40027;

    /* JADX INFO: renamed from: ᩻ */
    public int f40028;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public C14107(Context context, int i) {
        Paint paint = new Paint(1);
        this.f40023 = paint;
        this.f40024 = 255;
        Resources.Theme theme = context.getTheme();
        Resources resources = context.getResources();
        this.f40017 = i;
        float f = resources.getDisplayMetrics().density;
        this.f40018 = f;
        if (i == 0) {
            this.f40020 = C22553.m50538(theme, R.attr.textColorPrimary).getDefaultColor();
            this.f40027 = (int) ((f * 2.0f) + 0.5f);
        } else if (i == 1) {
            this.f40020 = C1059.m14953(resources, bin.p000mt.plus.R.color.MT_Protector, theme);
            this.f40027 = 0;
        } else {
            throw new IllegalArgumentException();
        }
        this.f40021 = C23223.f72969;
        this.f40028 = this.f40020;
        if (i == 0) {
            int i2 = (int) ((4.0f * f) + 0.5f);
            int i3 = (int) ((f * 10.0f) + 0.5f);
            this.f40019 = new Rect(i2, i3, i2, i3);
            paint.setStyle(Paint.Style.FILL);
            this.f40025 = 0.0f;
            this.f40026 = 0.0f;
            return;
        }
        int i4 = (int) ((5.0f * f) + 0.5f);
        this.f40019 = new Rect(i4, i4, i4, i4);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = 2.0f * f;
        this.f40025 = f2;
        this.f40026 = f * 4.0f;
        paint.setStrokeWidth(f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        int i = this.f40028;
        int iAlpha = (Color.alpha(i) * this.f40024) / 255;
        Paint paint = this.f40023;
        paint.setColor((i & 16777215) | (iAlpha << 24));
        paint.setColorFilter(this.f40022);
        if (this.f40017 == 0) {
            float f = bounds.bottom;
            float f2 = this.f40018;
            float f3 = f - (7.0f * f2);
            if (this.f40016) {
                f2 *= 2.0f;
            }
            canvas.drawRect(bounds.left, f3, bounds.right, f3 + f2, paint);
            return;
        }
        float f4 = bounds.left;
        float f5 = this.f40025;
        float f6 = bounds.top + f5;
        float f7 = bounds.right - f5;
        float f8 = bounds.bottom - f5;
        float f9 = this.f40026;
        canvas.drawRoundRect(f4 + f5, f6, f7, f8, f9, f9, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.set(this.f40019);
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
        int i2 = z3 ? this.f40021 : this.f40020;
        if (this.f40028 == i2 && this.f40016 == z3) {
            return false;
        }
        this.f40028 = i2;
        this.f40016 = z3;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f40024 == i) {
            return;
        }
        this.f40024 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f40022 == colorFilter) {
            return;
        }
        this.f40022 = colorFilter;
        invalidateSelf();
    }
}
