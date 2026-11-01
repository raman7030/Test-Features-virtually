package p067l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۛ۬ */
/* JADX INFO: compiled from: G4XY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1143 extends C1353 {

    /* JADX INFO: renamed from: ۤ */
    public static Method f21440;

    public C1143(Drawable drawable) {
        super(drawable);
        if (f21440 == null) {
            try {
                f21440 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    public C1143(C1423 c1423, Resources resources) {
        this.f33995 = c1423;
        Drawable.ConstantState constantState = c1423.f37930;
        if (constantState != null) {
            mo28083(constantState.newDrawable(resources));
        }
        if (f21440 == null) {
            try {
                f21440 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f33994.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f33994.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f33994.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f33994.getDirtyBounds();
    }

    @Override // p067l.C1353, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (mo18854()) {
            super.setTintList(colorStateList);
        } else {
            this.f33994.setTintList(colorStateList);
        }
    }

    @Override // p067l.C1353, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (mo18854()) {
            super.setTint(i);
        } else {
            this.f33994.setTint(i);
        }
    }

    @Override // p067l.C1353, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (mo18854()) {
            super.setTintMode(mode);
        } else {
            this.f33994.setTintMode(mode);
        }
    }

    @Override // p067l.C1353, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p067l.C1353
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo18854() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f33994;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f33994;
        if (drawable == null || (method = f21440) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
