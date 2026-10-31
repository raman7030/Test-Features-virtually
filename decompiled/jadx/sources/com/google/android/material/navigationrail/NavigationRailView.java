package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import l.C11007;
import l.C17648;
import l.C17931;
import l.C18637;
import l.C19343;
import l.C21610;
import l.C22733;
import l.C23575;

/* JADX INFO: loaded from: classes.dex */
public class NavigationRailView extends NavigationBarView {
    public static final int DEFAULT_HEADER_GRAVITY = 49;
    public static final int DEFAULT_MENU_GRAVITY = 49;
    public static final int MAX_ITEM_COUNT = 7;
    public static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    public View headerView;
    public Boolean paddingBottomSystemWindowInsets;
    public Boolean paddingStartSystemWindowInsets;
    public Boolean paddingTopSystemWindowInsets;
    public final int topMargin;

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public NavigationRailView(Context context) {
        this(context, null);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f55718);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C18637.f58038);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.paddingStartSystemWindowInsets = null;
        this.topMargin = getResources().getDimensionPixelSize(C23575.f75887);
        Context context2 = getContext();
        C22733 c22733ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C19343.f61349, i, i2, new int[0]);
        int iM50806 = c22733ObtainTintedStyledAttributes.m50806(C19343.f62414, 0);
        if (iM50806 != 0) {
            addHeaderView(iM50806);
        }
        setMenuGravity(c22733ObtainTintedStyledAttributes.m50809(C19343.f61508, 49));
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61561)) {
            setItemMinimumHeight(c22733ObtainTintedStyledAttributes.m50803(C19343.f61561, -1));
        }
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61137)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(c22733ObtainTintedStyledAttributes.m50801(C19343.f61137, false));
        }
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f62040)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(c22733ObtainTintedStyledAttributes.m50801(C19343.f62040, false));
        }
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61031)) {
            this.paddingStartSystemWindowInsets = Boolean.valueOf(c22733ObtainTintedStyledAttributes.m50801(C19343.f61031, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C23575.f75761);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C23575.f76328);
        float fLerp = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context2) - 1.0f);
        float fLerp2 = AnimationUtils.lerp(getItemPaddingTop(), dimensionPixelOffset, fLerp);
        float fLerp3 = AnimationUtils.lerp(getItemPaddingBottom(), dimensionPixelOffset2, fLerp);
        setItemPaddingTop(Math.round(fLerp2));
        setItemPaddingBottom(Math.round(fLerp3));
        c22733ObtainTintedStyledAttributes.m50813();
        applyWindowInsets();
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public C21610 onApplyWindowInsets(View view, C21610 c21610, ViewUtils.RelativePadding relativePadding) {
                C11007 c11007M48815 = c21610.m48815(7);
                NavigationRailView navigationRailView = NavigationRailView.this;
                if (navigationRailView.shouldApplyWindowInsetPadding(navigationRailView.paddingTopSystemWindowInsets)) {
                    relativePadding.top += c11007M48815.f33111;
                }
                NavigationRailView navigationRailView2 = NavigationRailView.this;
                if (navigationRailView2.shouldApplyWindowInsetPadding(navigationRailView2.paddingBottomSystemWindowInsets)) {
                    relativePadding.bottom += c11007M48815.f33108;
                }
                NavigationRailView navigationRailView3 = NavigationRailView.this;
                if (navigationRailView3.shouldApplyWindowInsetPadding(navigationRailView3.paddingStartSystemWindowInsets)) {
                    relativePadding.start += ViewUtils.isLayoutRtl(view) ? c11007M48815.f33110 : c11007M48815.f33109;
                }
                relativePadding.applyToView(view);
                return c21610;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldApplyWindowInsetPadding(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = C17648.f53953;
        return getFitsSystemWindows();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMinWidthSpec = makeMinWidthSpec(i);
        super.onMeasure(iMakeMinWidthSpec, i2);
        if (isHeaderViewVisible()) {
            measureChild(getNavigationRailMenuView(), iMakeMinWidthSpec, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.headerView.getMeasuredHeight()) - this.topMargin, Integer.MIN_VALUE));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (isHeaderViewVisible()) {
            int bottom = this.headerView.getBottom() + this.topMargin;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.isTopGravity()) {
            i5 = this.topMargin;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    public void addHeaderView(int i) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    public void addHeaderView(View view) {
        removeHeaderView();
        this.headerView = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.topMargin;
        addView(view, 0, layoutParams);
    }

    public View getHeaderView() {
        return this.headerView;
    }

    public void removeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            removeView(view);
            this.headerView = null;
        }
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    public void setItemMinimumHeight(int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public NavigationRailMenuView createNavigationBarMenuView(Context context) {
        return new NavigationRailMenuView(context);
    }

    private int makeMinWidthSpec(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
    }

    private boolean isHeaderViewVisible() {
        View view = this.headerView;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }
}
