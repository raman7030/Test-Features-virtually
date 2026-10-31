package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TZ */
/* JADX INFO: loaded from: classes3.dex */
public class C4554 extends CheckBox implements InterfaceC12796, InterfaceC12091 {
    public C7376 mAppCompatEmojiTextHelper;
    public final C22193 mBackgroundTintHelper;
    public final C12315 mCompoundButtonHelper;
    public final C1916 mTextHelper;

    public C4554(Context context) {
        this(context, null);
    }

    public C4554(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4554(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10034.m25207(context);
        C12855.m31289(getContext(), this);
        C12315 c12315 = new C12315(this);
        this.mCompoundButtonHelper = c12315;
        c12315.m29868(attributeSet, i);
        C22193 c22193 = new C22193(this);
        this.mBackgroundTintHelper = c22193;
        c22193.m49839(attributeSet, i);
        C1916 c1916 = new C1916(this);
        this.mTextHelper = c1916;
        c1916.m6321(attributeSet, i);
        m13406().m19826(attributeSet, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7376 m13406() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C7376(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C12315 c12315 = this.mCompoundButtonHelper;
        if (c12315 != null) {
            c12315.m29871();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C21311.m48345(getContext(), i));
    }

    @Override // l.InterfaceC12796
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C12315 c12315 = this.mCompoundButtonHelper;
        if (c12315 != null) {
            c12315.m29866(colorStateList);
        }
    }

    @Override // l.InterfaceC12796
    public ColorStateList getSupportButtonTintList() {
        C12315 c12315 = this.mCompoundButtonHelper;
        if (c12315 != null) {
            return c12315.m29869();
        }
        return null;
    }

    @Override // l.InterfaceC12796
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C12315 c12315 = this.mCompoundButtonHelper;
        if (c12315 != null) {
            c12315.m29867(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C12315 c12315 = this.mCompoundButtonHelper;
        if (c12315 != null) {
            return c12315.m29870();
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49841(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            return c22193.m49840();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49838(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            return c22193.m49842();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49843();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49836(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49835();
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m13406().m19829(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m13406().m19827(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m13406().m19830(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m13406().m19828();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m6325();
    }

    @Override // l.InterfaceC12091
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m6319(colorStateList);
        this.mTextHelper.m6314();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m6332();
    }

    @Override // l.InterfaceC12091
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m6320(mode);
        this.mTextHelper.m6314();
    }
}
