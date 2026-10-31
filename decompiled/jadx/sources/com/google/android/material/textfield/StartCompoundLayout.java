package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import l.C14369;
import l.C14615;
import l.C15813;
import l.C17648;
import l.C19343;
import l.C20754;
import l.C22733;
import l.C23575;
import l.C4330;

/* JADX INFO: loaded from: classes.dex */
public class StartCompoundLayout extends LinearLayout {
    public boolean hintExpanded;
    public CharSequence prefixText;
    public final TextView prefixTextView;
    public int startIconMinSize;
    public View.OnLongClickListener startIconOnLongClickListener;
    public ImageView.ScaleType startIconScaleType;
    public ColorStateList startIconTintList;
    public PorterDuff.Mode startIconTintMode;
    public final CheckableImageButton startIconView;
    public final TextInputLayout textInputLayout;

    public StartCompoundLayout(TextInputLayout textInputLayout, C22733 c22733) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C15813.f48827, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        C14615 c14615 = new C14615(getContext());
        this.prefixTextView = c14615;
        initStartIconView(c22733);
        initPrefixTextView(c22733);
        addView(checkableImageButton);
        addView(c14615);
    }

    private void initStartIconView(C22733 c22733) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (c22733.m50802(C19343.f61037)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), c22733, C19343.f61037);
        }
        if (c22733.m50802(C19343.f61143)) {
            this.startIconTintMode = ViewUtils.parseTintMode(c22733.m50809(C19343.f61143, -1), null);
        }
        if (c22733.m50802(C19343.f61567)) {
            setStartIconDrawable(c22733.m50815(C19343.f61567));
            if (c22733.m50802(C19343.f62420)) {
                setStartIconContentDescription(c22733.m50817(C19343.f62420));
            }
            setStartIconCheckable(c22733.m50801(C19343.f61355, true));
        }
        setStartIconMinSize(c22733.m50803(C19343.f61514, getResources().getDimensionPixelSize(C23575.f76094)));
        if (c22733.m50802(C19343.f62046)) {
            setStartIconScaleType(IconHelper.convertScaleType(c22733.m50809(C19343.f62046, -1)));
        }
    }

    private void initPrefixTextView(C22733 c22733) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(C20754.f67038);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView = this.prefixTextView;
        int i = C17648.f53953;
        textView.setAccessibilityLiveRegion(1);
        setPrefixTextAppearance(c22733.m50806(C19343.f62208, 0));
        if (c22733.m50802(C19343.f62154)) {
            setPrefixTextColor(c22733.m50804(C19343.f62154));
        }
        setPrefixText(c22733.m50817(C19343.f62100));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePrefixTextViewPadding();
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public void setPrefixText(CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public void setPrefixTextAppearance(int i) {
        C4330.m12997(this.prefixTextView, i);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    public void setStartIconMinSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.startIconMinSize) {
            this.startIconMinSize = i;
            IconHelper.setIconMinSize(this.startIconView, i);
        }
    }

    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    public void setupAccessibilityNodeInfo(C14369 c14369) {
        if (this.prefixTextView.getVisibility() == 0) {
            c14369.m34304(this.prefixTextView);
            c14369.m34322(this.prefixTextView);
        } else {
            c14369.m34322(this.startIconView);
        }
    }

    public void updatePrefixTextViewPadding() {
        int paddingStart;
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        if (isStartIconVisible()) {
            paddingStart = 0;
        } else {
            int i = C17648.f53953;
            paddingStart = editText.getPaddingStart();
        }
        TextView textView = this.prefixTextView;
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C23575.f76128);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        int i2 = C17648.f53953;
        textView.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public int getPrefixTextStartOffset() {
        int marginEnd;
        if (isStartIconVisible()) {
            marginEnd = ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).getMarginEnd() + this.startIconView.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        int i = C17648.f53953;
        return this.prefixTextView.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateVisibility();
    }

    private void updateVisibility() {
        int i = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility((this.startIconView.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.prefixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }
}
