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
import p067l.C1059;
import p067l.C1134;
import p067l.C1217;
import p067l.C1248;
import p067l.C1555;
import p067l.C1658;
import p067l.C1717;
import p067l.C17397;
import p067l.C1781;
import p067l.C22093;
import p067l.C24774;
import p067l.C6483;
import p067l.C8681;
import p067l.InterfaceC2029;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC2029 {
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public final C1658 accessibilityDelegate;
    public FrameLayout actionArea;
    public boolean checkable;
    public Drawable emptyDrawable;
    public boolean hasIconTintList;
    public int iconSize;
    public ColorStateList iconTintList;
    public boolean isBold;
    public C1134 itemData;
    public boolean needsEmptyIcon;
    public final CheckedTextView textView;

    @Override // p067l.InterfaceC2029
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
        C1658 c1658 = new C1658() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // p067l.C1658
            public void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
                super.onInitializeAccessibilityNodeInfo(view, c1555);
                c1555.m36441(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = c1658;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C17397.f51953, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C24774.f78588));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C22093.f69680);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1717.m43555(checkedTextView, c1658);
    }

    @Override // p067l.InterfaceC2029
    public void initialize(C1134 c1134, int i) {
        this.itemData = c1134;
        if (c1134.getItemId() > 0) {
            setId(c1134.getItemId());
        }
        setVisibility(c1134.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            StateListDrawable stateListDrawableCreateDefaultBackground = createDefaultBackground();
            int i2 = C1717.f57146;
            setBackground(stateListDrawableCreateDefaultBackground);
        }
        setCheckable(c1134.isCheckable());
        setChecked(c1134.isChecked());
        setEnabled(c1134.isEnabled());
        setTitle(c1134.getTitle());
        setIcon(c1134.getIcon());
        setActionView(c1134.getActionView());
        setContentDescription(c1134.getContentDescription());
        C1781.m45965(this, c1134.getTooltipText());
        adjustAppearance();
    }

    public void initialize(C1134 c1134, boolean z) {
        this.isBold = z;
        initialize(c1134, 0);
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                C1217 c1217 = (C1217) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1217).width = -1;
                this.actionArea.setLayoutParams(c1217);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            C1217 c1218 = (C1217) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1218).width = -2;
            this.actionArea.setLayoutParams(c1218);
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
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(C22093.f69867)).inflate();
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
        if (!getContext().getTheme().resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    @Override // p067l.InterfaceC2029
    public C1134 getItemData() {
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
                drawable = C1248.m23653(drawable).mutate();
                C1248.m23645(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable drawableM14961 = C1059.m14961(getResources(), C8681.f23387, getContext().getTheme());
                this.emptyDrawable = drawableM14961;
                if (drawableM14961 != null) {
                    int i2 = this.iconSize;
                    drawableM14961.setBounds(0, 0, i2, i2);
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
        C1134 c1134 = this.itemData;
        if (c1134 != null && c1134.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        C1134 c1134 = this.itemData;
        if (c1134 != null) {
            setIcon(c1134.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        C6483.m14861(this.textView, i);
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
