package p067l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: l.ܺܺ */
/* JADX INFO: compiled from: Z20Z */
/* JADX INFO: loaded from: classes4.dex */
public class C1637 extends ToggleButton implements InterfaceC13859 {

    /* JADX INFO: renamed from: ᩶ */
    public final C0937 f52606;

    /* JADX INFO: renamed from: ᩸ */
    public C1208 f52607;

    /* JADX INFO: renamed from: ᩹ */
    public final C1943 f52608;

    public C1637(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public C1637(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1480.m33375(getContext(), this);
        C1943 c1943 = new C1943(this);
        this.f52608 = c1943;
        c1943.m52166(attributeSet, i);
        C0937 c0937 = new C0937(this);
        this.f52606 = c0937;
        c0937.m8494(attributeSet, i);
        if (this.f52607 == null) {
            this.f52607 = new C1208(this);
        }
        this.f52607.m21799(attributeSet, i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1943 c1943 = this.f52608;
        if (c1943 != null) {
            c1943.m52163(i);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1943 c1943 = this.f52608;
        if (c1943 != null) {
            c1943.m52170();
        }
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1943 c1943 = this.f52608;
        if (c1943 != null) {
            c1943.m52162();
        }
        C0937 c0937 = this.f52606;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f52607 == null) {
            this.f52607 = new C1208(this);
        }
        super.setFilters(this.f52607.m21802(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f52607 == null) {
            this.f52607 = new C1208(this);
        }
        this.f52607.m21800(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.f52606;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.f52606;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // p067l.InterfaceC13859
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0937 c0937 = this.f52606;
        c0937.m8492(colorStateList);
        c0937.m8487();
    }

    @Override // p067l.InterfaceC13859
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0937 c0937 = this.f52606;
        c0937.m8493(mode);
        c0937.m8487();
    }
}
