package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۙܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96B4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4747 extends Drawable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ColorStateList f15053;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f15054;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ColorFilter f15058;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15057 = 255;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f15055 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20270 f15056 = new C20270(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo13892(Canvas canvas, int i, int i2);

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f15057 != i) {
            this.f15057 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15058 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f15053 = colorStateList;
        if (m13891()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f15055 = mode;
        if (m13891()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f15053;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return m13891();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m13891() {
        ColorStateList colorStateList = this.f15053;
        if (colorStateList == null || this.f15055 == null) {
            boolean z = this.f15054 != null;
            this.f15054 = null;
            return z;
        }
        this.f15054 = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f15055);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        mo13892(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f15056;
    }
}
