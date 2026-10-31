package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C14615;
import l.C15813;
import l.C17648;
import l.C19343;
import l.C19370;
import l.C20754;
import l.C21311;
import l.C22733;
import l.C23020;
import l.C23575;
import l.C3820;
import l.C4330;
import l.C8184;
import l.InterfaceC6087;

/* JADX INFO: loaded from: classes.dex */
public class EndCompoundLayout extends LinearLayout {
    public final AccessibilityManager accessibilityManager;
    public EditText editText;
    public final TextWatcher editTextWatcher;
    public final LinkedHashSet endIconChangedListeners;
    public final EndIconDelegates endIconDelegates;
    public final FrameLayout endIconFrame;
    public int endIconMinSize;
    public int endIconMode;
    public View.OnLongClickListener endIconOnLongClickListener;
    public ImageView.ScaleType endIconScaleType;
    public ColorStateList endIconTintList;
    public PorterDuff.Mode endIconTintMode;
    public final CheckableImageButton endIconView;
    public View.OnLongClickListener errorIconOnLongClickListener;
    public ColorStateList errorIconTintList;
    public PorterDuff.Mode errorIconTintMode;
    public final CheckableImageButton errorIconView;
    public boolean hintExpanded;
    public final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
    public CharSequence suffixText;
    public final TextView suffixTextView;
    public final TextInputLayout textInputLayout;
    public InterfaceC6087 touchExplorationStateChangeListener;

    public EndCompoundLayout(TextInputLayout textInputLayout, C22733 c22733) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet();
        this.editTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i, i2, i3);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.editText == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.removeTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                    if (EndCompoundLayout.this.editText.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                        EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.editText = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.addTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                }
                EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.this.editText);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
            }
        };
        this.onEditTextAttachedListener = onEditTextAttachedListener;
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonCreateIconView = createIconView(this, layoutInflaterFrom, C20754.f67192);
        this.errorIconView = checkableImageButtonCreateIconView;
        CheckableImageButton checkableImageButtonCreateIconView2 = createIconView(frameLayout, layoutInflaterFrom, C20754.f67084);
        this.endIconView = checkableImageButtonCreateIconView2;
        this.endIconDelegates = new EndIconDelegates(this, c22733);
        C14615 c14615 = new C14615(getContext());
        this.suffixTextView = c14615;
        initErrorIconView(c22733);
        initEndIconView(c22733);
        initSuffixTextView(c22733);
        frameLayout.addView(checkableImageButtonCreateIconView2);
        addView(c14615);
        addView(frameLayout);
        addView(checkableImageButtonCreateIconView);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
            }
        });
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C15813.f48879, viewGroup, false);
        checkableImageButton.setId(i);
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void initErrorIconView(C22733 c22733) {
        if (c22733.m50802(C19343.f62312)) {
            this.errorIconTintList = MaterialResources.getColorStateList(getContext(), c22733, C19343.f62312);
        }
        if (c22733.m50802(C19343.f60875)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(c22733.m50809(C19343.f60875, -1), null);
        }
        if (c22733.m50802(C19343.f62259)) {
            setErrorIconDrawable(c22733.m50815(C19343.f62259));
        }
        this.errorIconView.setContentDescription(getResources().getText(C3820.f12073));
        CheckableImageButton checkableImageButton = this.errorIconView;
        int i = C17648.f53953;
        checkableImageButton.setImportantForAccessibility(2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initEndIconView(C22733 c22733) {
        if (!c22733.m50802(C19343.f61725)) {
            if (c22733.m50802(C19343.f61565)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), c22733, C19343.f61565);
            }
            if (c22733.m50802(C19343.f61512)) {
                this.endIconTintMode = ViewUtils.parseTintMode(c22733.m50809(C19343.f61512, -1), null);
            }
        }
        if (c22733.m50802(C19343.f61353)) {
            setEndIconMode(c22733.m50809(C19343.f61353, 0));
            if (c22733.m50802(C19343.f62152)) {
                setEndIconContentDescription(c22733.m50817(C19343.f62152));
            }
            setEndIconCheckable(c22733.m50801(C19343.f62206, true));
        } else if (c22733.m50802(C19343.f61725)) {
            if (c22733.m50802(C19343.f62577)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), c22733, C19343.f62577);
            }
            if (c22733.m50802(C19343.f61884)) {
                this.endIconTintMode = ViewUtils.parseTintMode(c22733.m50809(C19343.f61884, -1), null);
            }
            setEndIconMode(c22733.m50801(C19343.f61725, false) ? 1 : 0);
            setEndIconContentDescription(c22733.m50817(C19343.f61618));
        }
        setEndIconMinSize(c22733.m50803(C19343.f62630, getResources().getDimensionPixelSize(C23575.f76094)));
        if (c22733.m50802(C19343.f62418)) {
            setEndIconScaleType(IconHelper.convertScaleType(c22733.m50809(C19343.f62418, -1)));
        }
    }

    private void initSuffixTextView(C22733 c22733) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(C20754.f67004);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        TextView textView = this.suffixTextView;
        int i = C17648.f53953;
        textView.setAccessibilityLiveRegion(1);
        setSuffixTextAppearance(c22733.m50806(C19343.f62314, 0));
        if (c22733.m50802(C19343.f60877)) {
            setSuffixTextColor(c22733.m50804(C19343.f60877));
        }
        setSuffixText(c22733.m50817(C19343.f62261));
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C21311.m48345(getContext(), i) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    public void setEndIconMode(int i) {
        if (this.endIconMode == i) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i2 = this.endIconMode;
        this.endIconMode = i;
        dispatchOnEndIconChanged(i2);
        setEndIconVisible(i != 0);
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            setUpDelegate(endIconDelegate);
            setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
            EditText editText = this.editText;
            if (editText != null) {
                endIconDelegate.onEditTextAttached(editText);
                setOnFocusChangeListenersIfNeeded(endIconDelegate);
            }
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshIconState(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
    }

    public void refreshIconState(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean zIsChecked;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z3 = true;
        if (!endIconDelegate.isIconCheckable() || (zIsChecked = this.endIconView.isChecked()) == endIconDelegate.isIconChecked()) {
            z2 = false;
        } else {
            this.endIconView.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!endIconDelegate.isIconActivable() || (zIsActivated = this.endIconView.isActivated()) == endIconDelegate.isIconActivated()) {
            z3 = z2;
        } else {
            setEndIconActivated(!zIsActivated);
        }
        if (z || z3) {
            refreshEndIconDrawableState();
        }
    }

    private void setUpDelegate(EndIconDelegate endIconDelegate) {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(EndIconDelegate endIconDelegate) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null) {
            return;
        }
        int i = C17648.f53953;
        if (isAttachedToWindow()) {
            C23020.m51159(this.accessibilityManager, this.touchExplorationStateChangeListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        InterfaceC6087 interfaceC6087 = this.touchExplorationStateChangeListener;
        if (interfaceC6087 == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        C23020.m51160(accessibilityManager, interfaceC6087);
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        int i = this.endIconDelegates.customEndIconDrawableId;
        return i == 0 ? endIconDelegate.getIconDrawableResId() : i;
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    public void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    public void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    public void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconChecked() {
        return hasEndIcon() && this.endIconView.isChecked();
    }

    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C21311.m48345(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    public void setEndIconMinSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.endIconMinSize) {
            this.endIconMinSize = i;
            IconHelper.setIconMinSize(this.endIconView, i);
            IconHelper.setIconMinSize(this.errorIconView, i);
        }
    }

    public int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    public void addOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    public void removeOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    public boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    public void setSuffixTextAppearance(int i) {
        C4330.m12997(this.suffixTextView, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C21311.m48345(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    public void togglePasswordVisibilityToggle(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateSuffixTextVisibility();
    }

    public void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().onSuffixVisibilityChanged(i == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    public void updateSuffixTextViewPadding() {
        int paddingEnd;
        if (this.textInputLayout.editText == null) {
            return;
        }
        if (isEndIconVisible() || isErrorIconVisible()) {
            paddingEnd = 0;
        } else {
            EditText editText = this.textInputLayout.editText;
            int i = C17648.f53953;
            paddingEnd = editText.getPaddingEnd();
        }
        TextView textView = this.suffixTextView;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C23575.f76128);
        int paddingTop = this.textInputLayout.editText.getPaddingTop();
        int paddingBottom = this.textInputLayout.editText.getPaddingBottom();
        int i2 = C17648.f53953;
        textView.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public int getSuffixTextEndOffset() {
        int measuredWidth = (isEndIconVisible() || isErrorIconVisible()) ? this.endIconView.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.endIconView.getLayoutParams()).getMarginStart() : 0;
        int i = C17648.f53953;
        return this.suffixTextView.getPaddingEnd() + getPaddingEnd() + measuredWidth;
    }

    public CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    public boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    private void updateErrorIconVisibility() {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        this.textInputLayout.updateDummyDrawables();
    }

    private void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        setVisibility((isEndIconVisible() || isErrorIconVisible() || ((this.suffixText == null || this.hintExpanded) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void dispatchOnEndIconChanged(int i) {
        Iterator it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            ((TextInputLayout.OnEndIconChangedListener) it.next()).onEndIconChanged(this.textInputLayout, i);
        }
    }

    private void tintEndIconOnError(boolean z) {
        if (z && getEndIconDrawable() != null) {
            Drawable drawableMutate = C8184.m21684(getEndIconDrawable()).mutate();
            C8184.m21683(drawableMutate, this.textInputLayout.getErrorCurrentTextColors());
            this.endIconView.setImageDrawable(drawableMutate);
            return;
        }
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
    }

    public class EndIconDelegates {
        public final int customEndIconDrawableId;
        public final SparseArray delegates = new SparseArray();
        public final EndCompoundLayout endLayout;
        public final int passwordIconDrawableId;

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, C22733 c22733) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = c22733.m50806(C19343.f61938, 0);
            this.passwordIconDrawableId = c22733.m50806(C19343.f61300, 0);
        }

        public EndIconDelegate get(int i) {
            EndIconDelegate endIconDelegate = (EndIconDelegate) this.delegates.get(i);
            if (endIconDelegate != null) {
                return endIconDelegate;
            }
            EndIconDelegate endIconDelegateCreate = create(i);
            this.delegates.append(i, endIconDelegateCreate);
            return endIconDelegateCreate;
        }

        private EndIconDelegate create(int i) {
            if (i == -1) {
                return new CustomEndIconDelegate(this.endLayout);
            }
            if (i == 0) {
                return new NoEndIconDelegate(this.endLayout);
            }
            if (i == 1) {
                return new PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
            }
            if (i == 2) {
                return new ClearTextEndIconDelegate(this.endLayout);
            }
            if (i == 3) {
                return new DropdownMenuEndIconDelegate(this.endLayout);
            }
            throw new IllegalArgumentException(C19370.m44628(i, "Invalid end icon mode: "));
        }
    }
}
