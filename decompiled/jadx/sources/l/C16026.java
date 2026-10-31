package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: l.ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z20Z */
/* JADX INFO: loaded from: classes4.dex */
public class C16026 extends ToggleButton implements InterfaceC12091 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1916 f49442;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7376 f49443;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22193 f49444;

    public C16026(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public C16026(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C12855.m31289(getContext(), this);
        C22193 c22193 = new C22193(this);
        this.f49444 = c22193;
        c22193.m49839(attributeSet, i);
        C1916 c1916 = new C1916(this);
        this.f49442 = c1916;
        c1916.m6321(attributeSet, i);
        if (this.f49443 == null) {
            this.f49443 = new C7376(this);
        }
        this.f49443.m19826(attributeSet, i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C22193 c22193 = this.f49444;
        if (c22193 != null) {
            c22193.m49836(i);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C22193 c22193 = this.f49444;
        if (c22193 != null) {
            c22193.m49843();
        }
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C22193 c22193 = this.f49444;
        if (c22193 != null) {
            c22193.m49835();
        }
        C1916 c1916 = this.f49442;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f49443 == null) {
            this.f49443 = new C7376(this);
        }
        super.setFilters(this.f49443.m19829(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f49443 == null) {
            this.f49443 = new C7376(this);
        }
        this.f49443.m19827(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.f49442;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.f49442;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // l.InterfaceC12091
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1916 c1916 = this.f49442;
        c1916.m6319(colorStateList);
        c1916.m6314();
    }

    @Override // l.InterfaceC12091
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1916 c1916 = this.f49442;
        c1916.m6320(mode);
        c1916.m6314();
    }
}
