package p067l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۤ۬ */
/* JADX INFO: compiled from: U4XY */
/* JADX INFO: loaded from: classes3.dex */
public class C1353 extends Drawable implements Drawable.Callback, InterfaceC1458, InterfaceC1493 {

    /* JADX INFO: renamed from: ۫ */
    public static final PorterDuff.Mode f33992 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۗ */
    public boolean f33993;

    /* JADX INFO: renamed from: ۙ */
    public Drawable f33994;

    /* JADX INFO: renamed from: ۬ */
    public C1423 f33995 = m28081();

    /* JADX INFO: renamed from: ᩶ */
    public PorterDuff.Mode f33996;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f33997;

    /* JADX INFO: renamed from: ᩹ */
    public int f33998;

    /* JADX INFO: renamed from: ۧ */
    public boolean mo18854() {
        throw null;
    }

    public C1353(Drawable drawable) {
        mo28083(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f33994.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f33994.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f33994;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f33994.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C1423 c1423 = this.f33995;
        return changingConfigurations | (c1423 != null ? c1423.getChangingConfigurations() : 0) | this.f33994.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f33994.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f33994.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f33994.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33994.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C1423 c1423;
        ColorStateList colorStateList = (!mo18854() || (c1423 = this.f33995) == null) ? null : c1423.f37931;
        return (colorStateList != null && colorStateList.isStateful()) || this.f33994.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m28080(iArr) || this.f33994.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f33994.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f33994.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f33994.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f33994.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f33994.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f33994.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f33994.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f33994.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f33994.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f33994.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f33994.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f33994.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return C1248.m23650(this.f33994, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return C1248.m23656(this.f33994);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C1423 c1423 = this.f33995;
        if (c1423 == null || c1423.f37930 == null) {
            return null;
        }
        c1423.f37929 = getChangingConfigurations();
        return this.f33995;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f33993 && super.mutate() == this) {
            this.f33995 = m28081();
            Drawable drawable = this.f33994;
            if (drawable != null) {
                drawable.mutate();
            }
            C1423 c1423 = this.f33995;
            if (c1423 != null) {
                Drawable drawable2 = this.f33994;
                c1423.f37930 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f33993 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    private C1423 m28081() {
        C1423 c1423 = this.f33995;
        C1423 c1424 = new C1423();
        c1424.f37931 = null;
        c1424.f37932 = f33992;
        if (c1423 != null) {
            c1424.f37929 = c1423.f37929;
            c1424.f37930 = c1423.f37930;
            c1424.f37931 = c1423.f37931;
            c1424.f37932 = c1423.f37932;
        }
        return c1424;
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
        return this.f33994.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f33995.f37931 = colorStateList;
        m28080(this.f33994.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f33995.f37932 = mode;
        m28080(this.f33994.getState());
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m28080(int[] iArr) {
        if (mo18854()) {
            C1423 c1423 = this.f33995;
            ColorStateList colorStateList = c1423.f37931;
            PorterDuff.Mode mode = c1423.f37932;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f33997 || colorForState != this.f33998 || mode != this.f33996) {
                    setColorFilter(colorForState, mode);
                    this.f33998 = colorForState;
                    this.f33996 = mode;
                    this.f33997 = true;
                    return true;
                }
            } else {
                this.f33997 = false;
                clearColorFilter();
                return false;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC1458
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo28082() {
        return this.f33994;
    }

    @Override // p067l.InterfaceC1458
    /* JADX INFO: renamed from: ֫ */
    public final void mo28083(Drawable drawable) {
        Drawable drawable2 = this.f33994;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f33994 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C1423 c1423 = this.f33995;
            if (c1423 != null) {
                c1423.f37930 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
