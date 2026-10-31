package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: U4XY */
/* JADX INFO: loaded from: classes3.dex */
public class C10301 extends Drawable implements Drawable.Callback, InterfaceC12417, InterfaceC13122 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f31029 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f31030;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable f31031;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11712 f31032 = m26057();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f31033;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f31034;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f31035;

    /* JADX INFO: renamed from: ۧ */
    public boolean mo16925() {
        throw null;
    }

    public C10301(Drawable drawable) {
        mo26059(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f31031.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f31031.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f31031;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f31031.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C11712 c11712 = this.f31032;
        return changingConfigurations | (c11712 != null ? c11712.getChangingConfigurations() : 0) | this.f31031.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f31031.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f31031.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f31031.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31031.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C11712 c11712;
        ColorStateList colorStateList = (!mo16925() || (c11712 = this.f31032) == null) ? null : c11712.f34931;
        return (colorStateList != null && colorStateList.isStateful()) || this.f31031.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m26056(iArr) || this.f31031.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f31031.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f31031.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f31031.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f31031.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f31031.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f31031.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f31031.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f31031.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f31031.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f31031.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f31031.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f31031.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return C8184.m21681(this.f31031, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return C8184.m21687(this.f31031);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C11712 c11712 = this.f31032;
        if (c11712 == null || c11712.f34930 == null) {
            return null;
        }
        c11712.f34929 = getChangingConfigurations();
        return this.f31032;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f31030 && super.mutate() == this) {
            this.f31032 = m26057();
            Drawable drawable = this.f31031;
            if (drawable != null) {
                drawable.mutate();
            }
            C11712 c11712 = this.f31032;
            if (c11712 != null) {
                Drawable drawable2 = this.f31031;
                c11712.f34930 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f31030 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C11712 m26057() {
        C11712 c11712 = this.f31032;
        C11712 c11713 = new C11712();
        c11713.f34931 = null;
        c11713.f34932 = f31029;
        if (c11712 != null) {
            c11713.f34929 = c11712.f34929;
            c11713.f34930 = c11712.f34930;
            c11713.f34931 = c11712.f34931;
            c11713.f34932 = c11712.f34932;
        }
        return c11713;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f31031.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f31032.f34931 = colorStateList;
        m26056(this.f31031.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f31032.f34932 = mode;
        m26056(this.f31031.getState());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m26056(int[] iArr) {
        if (mo16925()) {
            C11712 c11712 = this.f31032;
            ColorStateList colorStateList = c11712.f34931;
            PorterDuff.Mode mode = c11712.f34932;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f31034 || colorForState != this.f31035 || mode != this.f31033) {
                    setColorFilter(colorForState, mode);
                    this.f31035 = colorForState;
                    this.f31033 = mode;
                    this.f31034 = true;
                    return true;
                }
            } else {
                this.f31034 = false;
                clearColorFilter();
                return false;
            }
        }
        return false;
    }

    @Override // l.InterfaceC12417
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable mo26058() {
        return this.f31031;
    }

    @Override // l.InterfaceC12417
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26059(Drawable drawable) {
        Drawable drawable2 = this.f31031;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f31031 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C11712 c11712 = this.f31032;
            if (c11712 != null) {
                c11712.f34930 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
