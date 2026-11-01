package p067l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۢ᩵ */
/* JADX INFO: compiled from: X3ZE */
/* JADX INFO: loaded from: classes3.dex */
public final class C1327 extends Drawable {

    /* JADX INFO: renamed from: ֫ */
    public ColorStateList f32528;

    /* JADX INFO: renamed from: ۜ */
    public float f32529;

    /* JADX INFO: renamed from: ۢ */
    public PorterDuffColorFilter f32531;

    /* JADX INFO: renamed from: ۧ */
    public final RectF f32532;

    /* JADX INFO: renamed from: ܳ */
    public float f32533;

    /* JADX INFO: renamed from: ܽ */
    public final Rect f32534;

    /* JADX INFO: renamed from: ᩷ */
    public ColorStateList f32537;

    /* JADX INFO: renamed from: ᩻ */
    public final Paint f32538;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f32536 = false;

    /* JADX INFO: renamed from: ܿ */
    public boolean f32535 = true;

    /* JADX INFO: renamed from: ۡ */
    public PorterDuff.Mode f32530 = PorterDuff.Mode.SRC_IN;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C1327(float f, ColorStateList colorStateList) {
        this.f32529 = f;
        Paint paint = new Paint(5);
        this.f32538 = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f32528 = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f32528.getDefaultColor()));
        this.f32532 = new RectF();
        this.f32534 = new Rect();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26805(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f32528 = colorStateList;
        this.f32538.setColor(colorStateList.getColorForState(getState(), this.f32528.getDefaultColor()));
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26804(float f, boolean z, boolean z2) {
        if (f == this.f32533 && this.f32536 == z && this.f32535 == z2) {
            return;
        }
        this.f32533 = f;
        this.f32536 = z;
        this.f32535 = z2;
        m26801((Rect) null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m26806() {
        return this.f32533;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f32531;
        Paint paint = this.f32538;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f32531);
            z = true;
        }
        RectF rectF = this.f32532;
        float f = this.f32529;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26801(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.f32532;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.f32534;
        rect2.set(rect);
        if (this.f32536) {
            rect2.inset((int) Math.ceil(C1292.m25377(this.f32533, this.f32529, this.f32535)), (int) Math.ceil(C1292.m25378(this.f32533, this.f32529, this.f32535)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m26801(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f32534, this.f32529);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26803(float f) {
        if (f == this.f32529) {
            return;
        }
        this.f32529 = f;
        m26801((Rect) null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f32538.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32538.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m26807() {
        return this.f32529;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ColorStateList m26802() {
        return this.f32528;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f32537 = colorStateList;
        this.f32531 = m26800(colorStateList, this.f32530);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f32530 = mode;
        this.f32531 = m26800(this.f32537, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f32528;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f32538;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f32537;
        if (colorStateList2 == null || (mode = this.f32530) == null) {
            return z;
        }
        this.f32531 = m26800(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f32537;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f32528;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    /* JADX INFO: renamed from: ֫ */
    private PorterDuffColorFilter m26800(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
