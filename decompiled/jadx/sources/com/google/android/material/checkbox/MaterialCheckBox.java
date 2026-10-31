package com.google.android.material.checkbox;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.alipay.sdk.m.y.l;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.AbstractC18364;
import l.C16323;
import l.C17931;
import l.C18637;
import l.C19343;
import l.C20754;
import l.C21187;
import l.C21311;
import l.C22733;
import l.C3820;
import l.C4554;
import l.C6642;
import l.C8184;
import l.C9045;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends C4554 {
    public static final int[][] CHECKBOX_STATES;
    public static final int[] ERROR_STATE_SET;

    @SuppressLint({"DiscouragedApi"})
    public static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    public boolean broadcasting;
    public Drawable buttonDrawable;
    public Drawable buttonIconDrawable;
    public ColorStateList buttonIconTintList;
    public PorterDuff.Mode buttonIconTintMode;
    public ColorStateList buttonTintList;
    public boolean centerIfNoTextEnabled;
    public int checkedState;
    public int[] currentStateChecked;
    public CharSequence customStateDescription;
    public CharSequence errorAccessibilityLabel;
    public boolean errorShown;
    public ColorStateList materialThemeColorsTintList;
    public CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    public final LinkedHashSet onCheckedStateChangedListeners;
    public final LinkedHashSet onErrorChangedListeners;
    public final C21187 transitionToUnchecked;
    public final AbstractC18364 transitionToUncheckedCallback;
    public boolean useMaterialThemeColors;
    public boolean usingMaterialButtonDrawable;
    public static final int DEF_STYLE_RES = C18637.f58031;
    public static final int[] INDETERMINATE_STATE_SET = {C17931.f55739};

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(MaterialCheckBox materialCheckBox, int i);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(MaterialCheckBox materialCheckBox, boolean z);
    }

    private void updateIconTintIfNeeded() {
    }

    static {
        int i = C17931.f55841;
        ERROR_STATE_SET = new int[]{i};
        CHECKBOX_STATES = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        FRAMEWORK_BUTTON_DRAWABLE_RES_ID = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f54926);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.onErrorChangedListeners = new LinkedHashSet();
        this.onCheckedStateChangedListeners = new LinkedHashSet();
        this.transitionToUnchecked = C21187.m48133(getContext(), C6642.f20440);
        this.transitionToUncheckedCallback = new AbstractC18364() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // l.AbstractC18364
            public void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);
                MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                ColorStateList colorStateList = materialCheckBox.buttonTintList;
                if (colorStateList != null) {
                    C8184.m21683(drawable, colorStateList.getColorForState(materialCheckBox.currentStateChecked, MaterialCheckBox.this.buttonTintList.getDefaultColor()));
                }
            }

            @Override // l.AbstractC18364
            public void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                ColorStateList colorStateList = MaterialCheckBox.this.buttonTintList;
                if (colorStateList != null) {
                    C8184.m21676(drawable, colorStateList);
                }
            }
        };
        Context context2 = getContext();
        this.buttonDrawable = C16323.m38469((CompoundButton) this);
        this.buttonTintList = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C22733 c22733ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C19343.f61275, i, i2, new int[0]);
        this.buttonIconDrawable = c22733ObtainTintedStyledAttributes.m50815(C19343.f61635);
        if (this.buttonDrawable != null && ThemeEnforcement.isMaterial3Theme(context2) && isButtonDrawableLegacy(c22733ObtainTintedStyledAttributes)) {
            super.setButtonDrawable((Drawable) null);
            this.buttonDrawable = C21311.m48345(context2, C6642.f20483);
            this.usingMaterialButtonDrawable = true;
            if (this.buttonIconDrawable == null) {
                this.buttonIconDrawable = C21311.m48345(context2, C6642.f20512);
            }
        }
        this.buttonIconTintList = MaterialResources.getColorStateList(context2, c22733ObtainTintedStyledAttributes, C19343.f62061);
        this.buttonIconTintMode = ViewUtils.parseTintMode(c22733ObtainTintedStyledAttributes.m50809(C19343.f62169, -1), PorterDuff.Mode.SRC_IN);
        this.useMaterialThemeColors = c22733ObtainTintedStyledAttributes.m50801(C19343.f61528, false);
        this.centerIfNoTextEnabled = c22733ObtainTintedStyledAttributes.m50801(C19343.f61901, true);
        this.errorShown = c22733ObtainTintedStyledAttributes.m50801(C19343.f62381, false);
        this.errorAccessibilityLabel = c22733ObtainTintedStyledAttributes.m50817(C19343.f61316);
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f62593)) {
            setCheckedState(c22733ObtainTintedStyledAttributes.m50809(C19343.f62593, 0));
        }
        c22733ObtainTintedStyledAttributes.m50813();
        refreshButtonDrawable();
    }

    private /* synthetic */ void lambda$new$0() {
        this.buttonIconDrawable.jumpToCurrentState();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableM38469;
        if (this.centerIfNoTextEnabled && TextUtils.isEmpty(getText()) && (drawableM38469 = C16323.m38469((CompoundButton) this)) != null) {
            int width = ((getWidth() - drawableM38469.getIntrinsicWidth()) / 2) * (ViewUtils.isLayoutRtl(this) ? -1 : 1);
            int iSave = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
            if (getBackground() != null) {
                Rect bounds = drawableM38469.getBounds();
                C8184.m21675(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && this.buttonTintList == null && this.buttonIconTintList == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, INDETERMINATE_STATE_SET);
        }
        if (isErrorShown()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, ERROR_STATE_SET);
        }
        this.currentStateChecked = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        updateIconTintIfNeeded();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        updateIconTintIfNeeded();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.checkedState == 1;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.errorAccessibilityLabel));
        }
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.checkedState != i) {
            this.checkedState = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            setDefaultStateDescription();
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            LinkedHashSet linkedHashSet = this.onCheckedStateChangedListeners;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((OnCheckedStateChangedListener) it.next()).onCheckedStateChangedListener(this, this.checkedState);
                }
            }
            if (this.checkedState != 2 && (onCheckedChangeListener = this.onCheckedChangeListener) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.broadcasting = false;
        }
    }

    public int getCheckedState() {
        return this.checkedState;
    }

    public void addOnCheckedStateChangedListener(OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.add(onCheckedStateChangedListener);
    }

    public void removeOnCheckedStateChangedListener(OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.remove(onCheckedStateChangedListener);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.onCheckedStateChangedListeners.clear();
    }

    public void setErrorShown(boolean z) {
        if (this.errorShown == z) {
            return;
        }
        this.errorShown = z;
        refreshDrawableState();
        Iterator it = this.onErrorChangedListeners.iterator();
        while (it.hasNext()) {
            ((OnErrorChangedListener) it.next()).onErrorChanged(this, this.errorShown);
        }
    }

    public boolean isErrorShown() {
        return this.errorShown;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.errorAccessibilityLabel = charSequence;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.errorAccessibilityLabel;
    }

    public void addOnErrorChangedListener(OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.add(onErrorChangedListener);
    }

    public void removeOnErrorChangedListener(OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.remove(onErrorChangedListener);
    }

    public void clearOnErrorChangedListeners() {
        this.onErrorChangedListeners.clear();
    }

    @Override // l.C4554, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C21311.m48345(getContext(), i));
    }

    @Override // l.C4554, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.buttonDrawable = drawable;
        this.usingMaterialButtonDrawable = false;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.buttonDrawable;
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.buttonTintList == colorStateList) {
            return;
        }
        this.buttonTintList = colorStateList;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.buttonTintList;
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        refreshButtonDrawable();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(C21311.m48345(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.buttonIconDrawable = drawable;
        refreshButtonDrawable();
    }

    public Drawable getButtonIconDrawable() {
        return this.buttonIconDrawable;
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.buttonIconTintList == colorStateList) {
            return;
        }
        this.buttonIconTintList = colorStateList;
        refreshButtonDrawable();
    }

    public ColorStateList getButtonIconTintList() {
        return this.buttonIconTintList;
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.buttonIconTintMode == mode) {
            return;
        }
        this.buttonIconTintMode = mode;
        refreshButtonDrawable();
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.buttonIconTintMode;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            C16323.m38470(this, getMaterialThemeColorsTintList());
        } else {
            C16323.m38470(this, (ColorStateList) null);
        }
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.centerIfNoTextEnabled = z;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.centerIfNoTextEnabled;
    }

    private void refreshButtonDrawable() {
        this.buttonDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonDrawable, this.buttonTintList, C16323.m38468(this));
        this.buttonIconDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonIconDrawable, this.buttonIconTintList, this.buttonIconTintMode);
        setUpDefaultButtonDrawableAnimationIfNeeded();
        updateButtonTints();
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.buttonDrawable, this.buttonIconDrawable));
        refreshDrawableState();
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
        C21187 c21187;
        if (this.usingMaterialButtonDrawable) {
            C21187 c21188 = this.transitionToUnchecked;
            if (c21188 != null) {
                c21188.m48136(this.transitionToUncheckedCallback);
                this.transitionToUnchecked.m48135(this.transitionToUncheckedCallback);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.buttonDrawable;
                if (!(drawable instanceof AnimatedStateListDrawable) || (c21187 = this.transitionToUnchecked) == null) {
                    return;
                }
                ((AnimatedStateListDrawable) drawable).addTransition(C20754.f66840, C20754.f67095, c21187, false);
                ((AnimatedStateListDrawable) this.buttonDrawable).addTransition(C20754.f66892, C20754.f67095, this.transitionToUnchecked, false);
            }
        }
    }

    private void updateButtonTints() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.buttonDrawable;
        if (drawable != null && (colorStateList2 = this.buttonTintList) != null) {
            C8184.m21676(drawable, colorStateList2);
        }
        Drawable drawable2 = this.buttonIconDrawable;
        if (drawable2 == null || (colorStateList = this.buttonIconTintList) == null) {
            return;
        }
        C8184.m21676(drawable2, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.customStateDescription = charSequence;
        if (charSequence == null) {
            setDefaultStateDescription();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    private void setDefaultStateDescription() {
        if (Build.VERSION.SDK_INT < 30 || this.customStateDescription != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private String getButtonStateDescription() {
        int i = this.checkedState;
        if (i == 1) {
            return getResources().getString(C3820.f12151);
        }
        if (i == 0) {
            return getResources().getString(C3820.f12070);
        }
        return getResources().getString(C3820.f12108);
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.buttonTintList;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    private boolean isButtonDrawableLegacy(C22733 c22733) {
        return c22733.m50806(C19343.f61381, 0) == FRAMEWORK_BUTTON_DRAWABLE_RES_ID && c22733.m50806(C19343.f60945, 0) == 0;
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int[][] iArr = CHECKBOX_STATES;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, C17931.f55500);
            int color2 = MaterialColors.getColor(this, C17931.f55741);
            int color3 = MaterialColors.getColor(this, C17931.f55377);
            int color4 = MaterialColors.getColor(this, C17931.f55479);
            iArr2[0] = MaterialColors.layer(color3, color2, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[2] = MaterialColors.layer(color3, color4, 0.54f);
            iArr2[3] = MaterialColors.layer(color3, color4, 0.38f);
            iArr2[4] = MaterialColors.layer(color3, color4, 0.38f);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checkedState = getCheckedState();
        return savedState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.checkedState);
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int checkedState;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.checkedState = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.checkedState));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            return C9045.m23341(sb, getCheckedStateString(), l.d);
        }

        private String getCheckedStateString() {
            int i = this.checkedState;
            if (i != 1) {
                return i != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }
    }
}
