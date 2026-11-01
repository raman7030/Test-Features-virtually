package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۡ */
/* JADX INFO: compiled from: 15T9 */
/* JADX INFO: loaded from: classes5.dex */
public class C1872 extends RadioButton implements InterfaceC14529, InterfaceC13859 {
    public C1208 mAppCompatEmojiTextHelper;
    public final C1943 mBackgroundTintHelper;
    public final C1453 mCompoundButtonHelper;
    public final C0937 mTextHelper;

    public C1872(Context context) {
        this(context, null);
    }

    public C1872(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1872(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1340.m27224(context);
        C1480.m33375(getContext(), this);
        C1453 c1453 = new C1453(this);
        this.mCompoundButtonHelper = c1453;
        c1453.m31928(attributeSet, i);
        C1943 c1943 = new C1943(this);
        this.mBackgroundTintHelper = c1943;
        c1943.m52166(attributeSet, i);
        C0937 c0937 = new C0937(this);
        this.mTextHelper = c0937;
        c0937.m8494(attributeSet, i);
        m49759().m21799(attributeSet, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private C1208 m49759() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C1208(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1453 c1453 = this.mCompoundButtonHelper;
        if (c1453 != null) {
            c1453.m31931();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C22622.m50680(getContext(), i));
    }

    @Override // p067l.InterfaceC14529
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1453 c1453 = this.mCompoundButtonHelper;
        if (c1453 != null) {
            c1453.m31926(colorStateList);
        }
    }

    @Override // p067l.InterfaceC14529
    public ColorStateList getSupportButtonTintList() {
        C1453 c1453 = this.mCompoundButtonHelper;
        if (c1453 != null) {
            return c1453.m31929();
        }
        return null;
    }

    @Override // p067l.InterfaceC14529
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1453 c1453 = this.mCompoundButtonHelper;
        if (c1453 != null) {
            c1453.m31927(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1453 c1453 = this.mCompoundButtonHelper;
        if (c1453 != null) {
            return c1453.m31930();
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52168(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            return c1943.m52167();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52165(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            return c1943.m52169();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52170();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52163(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52162();
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m49759().m21802(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m49759().m21800(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m49759().m21803(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m49759().m21801();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m8498();
    }

    @Override // p067l.InterfaceC13859
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m8492(colorStateList);
        this.mTextHelper.m8487();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m8505();
    }

    @Override // p067l.InterfaceC13859
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m8493(mode);
        this.mTextHelper.m8487();
    }
}
