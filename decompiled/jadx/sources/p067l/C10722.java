package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B4IO */
/* JADX INFO: loaded from: classes3.dex */
public class C10722 extends TextView {

    /* JADX INFO: renamed from: ᩸ */
    public C3345 f29699;

    public C10722(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24659(attributeSet, 0);
    }

    public C10722(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24659(attributeSet, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24659(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            Drawable drawableM24658 = m24658(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableLeft", 0));
            Drawable drawableM24659 = m24658(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableTop", 0));
            Drawable drawableM246510 = m24658(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableRight", 0));
            Drawable drawableM246511 = m24658(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableBottom", 0));
            Drawable drawableM246512 = m24658(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableStart", 0));
            Drawable drawableM246513 = m24658(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (drawableM246512 != null) {
                    drawableM24658 = drawableM246512;
                }
                if (drawableM246513 != null) {
                    drawableM246510 = drawableM246513;
                }
            } else {
                if (drawableM246512 != null) {
                    drawableM246510 = drawableM246512;
                }
                if (drawableM246513 != null) {
                    drawableM24658 = drawableM246513;
                }
                Drawable drawable = drawableM246510;
                drawableM246510 = drawableM24658;
                drawableM24658 = drawable;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM24658, drawableM24659, drawableM246510, drawableM246511);
            setBackground(m24658(attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, "background", 0)));
            C3345 c3345 = new C3345(this, attributeSet, i);
            this.f29699 = c3345;
            if (c3345.f6530 >= 0) {
                for (Drawable drawable2 : getCompoundDrawables()) {
                    C10051.m23422(drawable2, this.f29699.f6530);
                }
                for (Drawable drawable3 : getCompoundDrawablesRelative()) {
                    C10051.m23422(drawable3, this.f29699.f6530);
                }
                C10051.m23422(getBackground(), this.f29699.f6530);
            }
        }
        this.f29699 = new C3345();
    }

    /* JADX INFO: renamed from: ֫ */
    private Drawable m24658(int i) {
        if (i == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i);
        if (!isInEditMode() && C10051.f27811.contains(resourceTypeName)) {
            try {
                return new C4016(resources, i);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return resources.getDrawable(i, getContext().getTheme());
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesWithIntrinsicBounds(m24658(i), m24658(i2), m24658(i3), m24658(i4));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(m24658(i), m24658(i2), m24658(i3), m24658(i4));
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f29699.f6529) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new C2674(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2674)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2674 c2674 = (C2674) parcelable;
        super.onRestoreInstanceState(c2674.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        c2674.m4129(compoundDrawables[0], 0);
        c2674.m4129(compoundDrawables[1], 1);
        c2674.m4129(compoundDrawables[2], 2);
        c2674.m4129(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        c2674.m4129(compoundDrawablesRelative[0], 4);
        c2674.m4129(compoundDrawablesRelative[2], 5);
        c2674.m4129(getBackground(), 6);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setVisible(true, false);
            }
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            if (drawable2 != null) {
                drawable2.setVisible(true, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            if (drawable2 != null) {
                drawable2.setVisible(false, false);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackground(m24658(i));
    }
}
