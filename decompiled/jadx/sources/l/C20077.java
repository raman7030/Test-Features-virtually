package l;

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
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4G5 */
/* JADX INFO: loaded from: classes5.dex */
public class C20077 extends Button implements InterfaceC12091 {
    public C7376 mAppCompatEmojiTextHelper;
    public final C22193 mBackgroundTintHelper;
    public final C1916 mTextHelper;

    public C20077(Context context) {
        this(context, null);
    }

    public C20077(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20077(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10034.m25207(context);
        C12855.m31289(getContext(), this);
        C22193 c22193 = new C22193(this);
        this.mBackgroundTintHelper = c22193;
        c22193.m49839(attributeSet, i);
        C1916 c1916 = new C1916(this);
        this.mTextHelper = c1916;
        c1916.m6321(attributeSet, i);
        c1916.m6314();
        m46269().m19826(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49836(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49843();
        }
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

    @Override // android.widget.TextView, android.view.View
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6318(context, i);
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
        C1916 c1916 = this.mTextHelper;
        if (c1916 == null || C22461.f72739) {
            return;
        }
        c1916.m6327();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C22461.f72739) {
            super.setTextSize(i, f);
            return;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6316(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1916 c1916 = this.mTextHelper;
        if (c1916 == null || C22461.f72739 || !c1916.m6326()) {
            return;
        }
        this.mTextHelper.m6327();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C22461.f72739) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6315(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C22461.f72739) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6317(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C22461.f72739) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6324(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (C22461.f72739) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            return c1916.m6333();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C22461.f72739) {
            return super.getAutoSizeStepGranularity();
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            return c1916.m6330();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C22461.f72739) {
            return super.getAutoSizeMinTextSize();
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            return c1916.m6331();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C22461.f72739) {
            return super.getAutoSizeMaxTextSize();
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            return c1916.m6329();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C22461.f72739) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1916 c1916 = this.mTextHelper;
        return c1916 != null ? c1916.m6328() : new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6323(z);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4330.m12987(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4330.m12986(super.getCustomSelectionActionModeCallback());
    }

    @Override // l.InterfaceC12091
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m6319(colorStateList);
        this.mTextHelper.m6314();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m6325();
    }

    @Override // l.InterfaceC12091
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m6320(mode);
        this.mTextHelper.m6314();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m6332();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m46269().m19829(inputFilterArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7376 m46269() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C7376(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m46269().m19827(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m46269().m19830(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m46269().m19828();
    }
}
