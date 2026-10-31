package l;

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

/* JADX INFO: renamed from: l.ۛ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G4XY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6067 extends C10301 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Method f18584;

    public C6067(Drawable drawable) {
        super(drawable);
        if (f18584 == null) {
            try {
                f18584 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    public C6067(C11712 c11712, Resources resources) {
        this.f31032 = c11712;
        Drawable.ConstantState constantState = c11712.f34930;
        if (constantState != null) {
            mo26059(constantState.newDrawable(resources));
        }
        if (f18584 == null) {
            try {
                f18584 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f31031.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f31031.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f31031.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f31031.getDirtyBounds();
    }

    @Override // l.C10301, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (mo16925()) {
            super.setTintList(colorStateList);
        } else {
            this.f31031.setTintList(colorStateList);
        }
    }

    @Override // l.C10301, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (mo16925()) {
            super.setTint(i);
        } else {
            this.f31031.setTint(i);
        }
    }

    @Override // l.C10301, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (mo16925()) {
            super.setTintMode(mode);
        } else {
            this.f31031.setTintMode(mode);
        }
    }

    @Override // l.C10301, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // l.C10301
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo16925() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f31031;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f31031;
        if (drawable == null || (method = f18584) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
