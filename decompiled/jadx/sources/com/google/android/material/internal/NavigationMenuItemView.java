package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.C14369;
import l.C15813;
import l.C16445;
import l.C17648;
import l.C18934;
import l.C20754;
import l.C23575;
import l.C4330;
import l.C4369;
import l.C5882;
import l.C6642;
import l.C7560;
import l.C8184;
import l.InterfaceC23935;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC23935 {
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public final C16445 accessibilityDelegate;
    public FrameLayout actionArea;
    public boolean checkable;
    public Drawable emptyDrawable;
    public boolean hasIconTintList;
    public int iconSize;
    public ColorStateList iconTintList;
    public boolean isBold;
    public C5882 itemData;
    public boolean needsEmptyIcon;
    public final CheckedTextView textView;

    @Override // l.InterfaceC23935
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isBold = true;
        C16445 c16445 = new C16445() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // l.C16445
            public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
                super.onInitializeAccessibilityNodeInfo(view, c14369);
                c14369.m34308(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = c16445;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C15813.f48815, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C23575.f75842));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C20754.f66996);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C17648.m41309(checkedTextView, c16445);
    }

    @Override // l.InterfaceC23935
    public void initialize(C5882 c5882, int i) {
        this.itemData = c5882;
        if (c5882.getItemId() > 0) {
            setId(c5882.getItemId());
        }
        setVisibility(c5882.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            StateListDrawable stateListDrawableCreateDefaultBackground = createDefaultBackground();
            int i2 = C17648.f53953;
            setBackground(stateListDrawableCreateDefaultBackground);
        }
        setCheckable(c5882.isCheckable());
        setChecked(c5882.isChecked());
        setEnabled(c5882.isEnabled());
        setTitle(c5882.getTitle());
        setIcon(c5882.getIcon());
        setActionView(c5882.getActionView());
        setContentDescription(c5882.getContentDescription());
        C18934.m43699(this, c5882.getTooltipText());
        adjustAppearance();
    }

    public void initialize(C5882 c5882, boolean z) {
        this.isBold = z;
        initialize(c5882, 0);
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                C7560 c7560 = (C7560) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c7560).width = -1;
                this.actionArea.setLayoutParams(c7560);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            C7560 c7561 = (C7560) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c7561).width = -2;
            this.actionArea.setLayoutParams(c7561);
        }
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(C20754.f67183)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    @Override // l.InterfaceC23935
    public C5882 getItemData() {
        return this.itemData;
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.checkable != z) {
            this.checkable = z;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.textView.setChecked(z);
        CheckedTextView checkedTextView = this.textView;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.isBold) ? 1 : 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C8184.m21684(drawable).mutate();
                C8184.m21676(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable drawableM13097 = C4369.m13097(getResources(), C6642.f20511, getContext().getTheme());
                this.emptyDrawable = drawableM13097;
                if (drawableM13097 != null) {
                    int i2 = this.iconSize;
                    drawableM13097.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.emptyDrawable;
        }
        this.textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconSize(int i) {
        this.iconSize = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C5882 c5882 = this.itemData;
        if (c5882 != null && c5882.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        C5882 c5882 = this.itemData;
        if (c5882 != null) {
            setIcon(c5882.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        C4330.m12997(this.textView, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.needsEmptyIcon = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIconPadding(int i) {
        this.textView.setCompoundDrawablePadding(i);
    }

    public void setMaxLines(int i) {
        this.textView.setMaxLines(i);
    }
}
