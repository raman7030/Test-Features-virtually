package l;

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

/* JADX INFO: renamed from: l.ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X3ZE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9783 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ColorStateList f29576;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f29577;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f29579;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RectF f29580;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f29581;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Rect f29582;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ColorStateList f29585;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Paint f29586;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f29584 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f29583 = true;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f29578 = PorterDuff.Mode.SRC_IN;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C9783(float f, ColorStateList colorStateList) {
        this.f29577 = f;
        Paint paint = new Paint(5);
        this.f29586 = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f29576 = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f29576.getDefaultColor()));
        this.f29580 = new RectF();
        this.f29582 = new Rect();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24791(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f29576 = colorStateList;
        this.f29586.setColor(colorStateList.getColorForState(getState(), this.f29576.getDefaultColor()));
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24790(float f, boolean z, boolean z2) {
        if (f == this.f29581 && this.f29584 == z && this.f29583 == z2) {
            return;
        }
        this.f29581 = f;
        this.f29584 = z;
        this.f29583 = z2;
        m24787((Rect) null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m24792() {
        return this.f29581;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f29579;
        Paint paint = this.f29586;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f29579);
            z = true;
        }
        RectF rectF = this.f29580;
        float f = this.f29577;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24787(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.f29580;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.f29582;
        rect2.set(rect);
        if (this.f29584) {
            rect2.inset((int) Math.ceil(C9077.m23431(this.f29581, this.f29577, this.f29583)), (int) Math.ceil(C9077.m23432(this.f29581, this.f29577, this.f29583)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m24787(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f29582, this.f29577);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24789(float f) {
        if (f == this.f29577) {
            return;
        }
        this.f29577 = f;
        m24787((Rect) null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f29586.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29586.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m24793() {
        return this.f29577;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ColorStateList m24788() {
        return this.f29576;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f29585 = colorStateList;
        this.f29579 = m24786(colorStateList, this.f29578);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f29578 = mode;
        this.f29579 = m24786(this.f29585, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f29576;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f29586;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f29585;
        if (colorStateList2 == null || (mode = this.f29578) == null) {
            return z;
        }
        this.f29579 = m24786(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f29585;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f29576;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private PorterDuffColorFilter m24786(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
