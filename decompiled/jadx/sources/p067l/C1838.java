package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۢ */
/* JADX INFO: compiled from: X4G5 */
/* JADX INFO: loaded from: classes5.dex */
public class C1838 extends Button implements InterfaceC13859 {
    public C1208 mAppCompatEmojiTextHelper;
    public final C1943 mBackgroundTintHelper;
    public final C0937 mTextHelper;

    public C1838(Context context) {
        this(context, null);
    }

    public C1838(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1340.m27224(context);
        C1480.m33375(getContext(), this);
        C1943 c1943 = new C1943(this);
        this.mBackgroundTintHelper = c1943;
        c1943.m52166(attributeSet, i);
        C0937 c0937 = new C0937(this);
        this.mTextHelper = c0937;
        c0937.m8494(attributeSet, i);
        c0937.m8487();
        m48585().m21799(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52163(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52170();
        }
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

    @Override // android.widget.TextView, android.view.View
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8491(context, i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0937 c0937 = this.mTextHelper;
        if (c0937 == null || C1956.f75467) {
            return;
        }
        c0937.m8500();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C1956.f75467) {
            super.setTextSize(i, f);
            return;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8489(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0937 c0937 = this.mTextHelper;
        if (c0937 == null || C1956.f75467 || !c0937.m8499()) {
            return;
        }
        this.mTextHelper.m8500();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C1956.f75467) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8488(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C1956.f75467) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8490(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C1956.f75467) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8497(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (C1956.f75467) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            return c0937.m8506();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C1956.f75467) {
            return super.getAutoSizeStepGranularity();
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            return c0937.m8503();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C1956.f75467) {
            return super.getAutoSizeMinTextSize();
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            return c0937.m8504();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C1956.f75467) {
            return super.getAutoSizeMaxTextSize();
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            return c0937.m8502();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C1956.f75467) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0937 c0937 = this.mTextHelper;
        return c0937 != null ? c0937.m8501() : new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8496(z);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C6483.m14851(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C6483.m14850(super.getCustomSelectionActionModeCallback());
    }

    @Override // p067l.InterfaceC13859
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m8492(colorStateList);
        this.mTextHelper.m8487();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m8498();
    }

    @Override // p067l.InterfaceC13859
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m8493(mode);
        this.mTextHelper.m8487();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m8505();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m48585().m21802(inputFilterArr));
    }

    /* JADX INFO: renamed from: ֫ */
    private C1208 m48585() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C1208(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m48585().m21800(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m48585().m21803(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m48585().m21801();
    }
}
