package p067l;

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
public abstract class AbstractC6880 extends Drawable {

    /* JADX INFO: renamed from: ۗ */
    public ColorStateList f17884;

    /* JADX INFO: renamed from: ۙ */
    public PorterDuffColorFilter f17885;

    /* JADX INFO: renamed from: ᩹ */
    public ColorFilter f17889;

    /* JADX INFO: renamed from: ᩸ */
    public int f17888 = 255;

    /* JADX INFO: renamed from: ۬ */
    public PorterDuff.Mode f17886 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᩶ */
    public C21633 f17887 = new C21633(this);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15772(Canvas canvas, int i, int i2);

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f17888 != i) {
            this.f17888 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17889 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f17884 = colorStateList;
        if (m15771()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f17886 = mode;
        if (m15771()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f17884;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return m15771();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m15771() {
        ColorStateList colorStateList = this.f17884;
        if (colorStateList == null || this.f17886 == null) {
            boolean z = this.f17885 != null;
            this.f17885 = null;
            return z;
        }
        this.f17885 = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f17886);
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
        mo15772(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f17887;
    }
}
