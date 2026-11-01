package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import p067l.AbstractC21491;
import p067l.AbstractC9165;
import p067l.C0886;
import p067l.C0994;
import p067l.C1134;
import p067l.C1228;
import p067l.C12826;
import p067l.C14784;
import p067l.C16795;
import p067l.C1717;
import p067l.C1840;
import p067l.C1914;
import p067l.C19410;
import p067l.C1970;
import p067l.C20081;
import p067l.C20752;
import p067l.C24774;
import p067l.C6870;
import p067l.InterfaceC10091;
import p067l.InterfaceC1834;
import p067l.RunnableC9966;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    public static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    public final InterfaceC10091 backDrawerListener;
    public final MaterialBackOrchestrator backOrchestrator;
    public boolean bottomInsetScrimEnabled;
    public int drawerLayoutCornerSize;
    public final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    public final int drawerLayoutCornerSizeBackAnimationMax;
    public OnNavigationItemSelectedListener listener;
    public final int maxWidth;
    public final NavigationMenu menu;
    public MenuInflater menuInflater;
    public ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    public final NavigationMenuPresenter presenter;
    public final ShapeableDelegate shapeableDelegate;
    public final MaterialSideContainerBackHelper sideContainerBackHelper;
    public final int[] tmpLocation;
    public boolean topInsetScrimEnabled;
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int[] DISABLED_STATE_SET = {-16842910};
    public static final int DEF_STYLE_RES = C20081.f62166;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19410.f57992);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListCreateDefaultColorStateList;
        int i2;
        int i3;
        int i4 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i4), attributeSet, i);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.sideContainerBackHelper = new MaterialSideContainerBackHelper(this);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.backDrawerListener = new AbstractC21491() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // p067l.AbstractC21491, p067l.InterfaceC10091
            public void onDrawerOpened(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                    C12826.requireNonNull(materialBackOrchestrator);
                    view.post(new RunnableC9966(3, materialBackOrchestrator));
                }
            }

            @Override // p067l.AbstractC21491, p067l.InterfaceC10091
            public void onDrawerClosed(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    navigationView.backOrchestrator.stopListeningForBackCallbacks();
                    NavigationView.this.maybeClearCornerSizeAnimationForDrawerLayout();
                }
            }
        };
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        C1970 c1970ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C20752.f82341, i, i4, new int[0]);
        if (c1970ObtainTintedStyledAttributes.m53135(C20752.f82468)) {
            Drawable drawableM53148 = c1970ObtainTintedStyledAttributes.m53148(C20752.f82468);
            int i5 = C1717.f57146;
            setBackground(drawableM53148);
        }
        int iM53136 = c1970ObtainTintedStyledAttributes.m53136(C20752.f82450, 0);
        this.drawerLayoutCornerSize = iM53136;
        this.drawerLayoutCornerSizeBackAnimationEnabled = iM53136 == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(C24774.f78978);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i4).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            int i6 = C1717.f57146;
            setBackground(materialShapeDrawable);
        }
        if (c1970ObtainTintedStyledAttributes.m53135(C20752.f82414)) {
            setElevation(c1970ObtainTintedStyledAttributes.m53136(C20752.f82414, 0));
        }
        setFitsSystemWindows(c1970ObtainTintedStyledAttributes.m53134(C20752.f82359, false));
        this.maxWidth = c1970ObtainTintedStyledAttributes.m53136(C20752.f82722, 0);
        ColorStateList colorStateListM53137 = c1970ObtainTintedStyledAttributes.m53135(C20752.f82812) ? c1970ObtainTintedStyledAttributes.m53137(C20752.f82812) : null;
        int iM53139 = c1970ObtainTintedStyledAttributes.m53135(C20752.f82465) ? c1970ObtainTintedStyledAttributes.m53139(C20752.f82465, 0) : 0;
        if (iM53139 == 0 && colorStateListM53137 == null) {
            colorStateListM53137 = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        if (c1970ObtainTintedStyledAttributes.m53135(C20752.f82923)) {
            colorStateListCreateDefaultColorStateList = c1970ObtainTintedStyledAttributes.m53137(C20752.f82923);
        } else {
            colorStateListCreateDefaultColorStateList = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int iM531310 = c1970ObtainTintedStyledAttributes.m53135(C20752.f82501) ? c1970ObtainTintedStyledAttributes.m53139(C20752.f82501, 0) : 0;
        boolean zM53134 = c1970ObtainTintedStyledAttributes.m53134(C20752.f82866, true);
        if (c1970ObtainTintedStyledAttributes.m53135(C20752.f82631)) {
            setItemIconSize(c1970ObtainTintedStyledAttributes.m53136(C20752.f82631, 0));
        }
        ColorStateList colorStateListM53138 = c1970ObtainTintedStyledAttributes.m53135(C20752.f82573) ? c1970ObtainTintedStyledAttributes.m53137(C20752.f82573) : null;
        if (iM531310 == 0 && colorStateListM53138 == null) {
            colorStateListM53138 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableM53149 = c1970ObtainTintedStyledAttributes.m53148(C20752.f82649);
        if (drawableM53149 == null && hasShapeAppearance(c1970ObtainTintedStyledAttributes)) {
            drawableM53149 = createDefaultItemBackground(c1970ObtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, c1970ObtainTintedStyledAttributes, C20752.f82522);
            if (colorStateList != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(c1970ObtainTintedStyledAttributes, null)));
            }
        }
        if (c1970ObtainTintedStyledAttributes.m53135(C20752.f82594)) {
            i2 = 0;
            setItemHorizontalPadding(c1970ObtainTintedStyledAttributes.m53136(C20752.f82594, 0));
        } else {
            i2 = 0;
        }
        if (c1970ObtainTintedStyledAttributes.m53135(C20752.f82555)) {
            setItemVerticalPadding(c1970ObtainTintedStyledAttributes.m53136(C20752.f82555, i2));
        }
        setDividerInsetStart(c1970ObtainTintedStyledAttributes.m53136(C20752.f82851, i2));
        setDividerInsetEnd(c1970ObtainTintedStyledAttributes.m53136(C20752.f82905, i2));
        setSubheaderInsetStart(c1970ObtainTintedStyledAttributes.m53136(C20752.f82338, i2));
        setSubheaderInsetEnd(c1970ObtainTintedStyledAttributes.m53136(C20752.f82830, i2));
        setTopInsetScrimEnabled(c1970ObtainTintedStyledAttributes.m53134(C20752.f82356, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(c1970ObtainTintedStyledAttributes.m53134(C20752.f82887, this.bottomInsetScrimEnabled));
        int iM53137 = c1970ObtainTintedStyledAttributes.m53136(C20752.f82486, i2);
        setItemMaxLines(c1970ObtainTintedStyledAttributes.m53142(C20752.f82685, 1));
        navigationMenu.setCallback(new InterfaceC1834() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // p067l.InterfaceC1834
            public void onMenuModeChange(C0994 c0994) {
            }

            @Override // p067l.InterfaceC1834
            public boolean onMenuItemSelected(C0994 c0994, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (iM53139 != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(iM53139);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateListM53137);
        navigationMenuPresenter.setItemIconTintList(colorStateListCreateDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (iM531310 != 0) {
            navigationMenuPresenter.setItemTextAppearance(iM531310);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(zM53134);
        navigationMenuPresenter.setItemTextColor(colorStateListM53138);
        navigationMenuPresenter.setItemBackground(drawableM53149);
        navigationMenuPresenter.setItemIconPadding(iM53137);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        if (c1970ObtainTintedStyledAttributes.m53135(C20752.f82737)) {
            i3 = 0;
            inflateMenu(c1970ObtainTintedStyledAttributes.m53139(C20752.f82737, 0));
        } else {
            i3 = 0;
        }
        if (c1970ObtainTintedStyledAttributes.m53135(C20752.f82667)) {
            inflateHeaderView(c1970ObtainTintedStyledAttributes.m53139(C20752.f82667, i3));
        }
        c1970ObtainTintedStyledAttributes.m53146();
        setupInsetScrimsListener();
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i, int i2) {
        if ((getParent() instanceof C14784) && (getLayoutParams() instanceof C16795)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                int i3 = ((C16795) getLayoutParams()).f49496;
                int i4 = C1717.f57146;
                boolean z = Gravity.getAbsoluteGravity(i3, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel shapeAppearanceModelBuild = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
                this.shapeableDelegate.onShapeAppearanceChanged(this, shapeAppearanceModelBuild);
                this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i, i2));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private boolean hasShapeAppearance(C1970 c1970) {
        return c1970.m53135(C20752.f82375) || c1970.m53135(C20752.f82610);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof C14784) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            C14784 c14784 = (C14784) parent;
            c14784.m33746(this.backDrawerListener);
            c14784.m33738(this.backDrawerListener);
            if (C14784.m33725(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof C14784) {
            ((C14784) parent).m33746(this.backDrawerListener);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    private Drawable createDefaultItemBackground(C1970 c1970) {
        return createDefaultItemDrawable(c1970, MaterialResources.getColorStateList(getContext(), c1970, C20752.f82756));
    }

    private Drawable createDefaultItemDrawable(C1970 c1970, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), c1970.m53139(C20752.f82375, 0), c1970.m53139(C20752.f82610, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, c1970.m53136(C20752.f82701, 0), c1970.m53136(C20752.f82938, 0), c1970.m53136(C20752.f82775, 0), c1970.m53136(C20752.f82794, 0));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new C6870(3, this));
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(C1914 c1914) {
        this.presenter.dispatchApplyWindowInsets(c1914);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public Menu getMenu() {
        return this.menu;
    }

    public View inflateHeaderView(int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void addHeaderView(View view) {
        this.presenter.addHeaderView(view);
    }

    public void removeHeaderView(View view) {
        this.presenter.removeHeaderView(view);
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0886.m5548(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public void setItemHorizontalPadding(int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public void setItemVerticalPadding(int i) {
        this.presenter.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public void setItemIconPadding(int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((C1134) menuItemFindItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((C1134) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public void setItemTextAppearance(int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemIconSize(int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public void setDividerInsetStart(int i) {
        this.presenter.setDividerInsetStart(i);
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public void setDividerInsetEnd(int i) {
        this.presenter.setDividerInsetEnd(i);
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    public void setSubheaderInsetStart(int i) {
        this.presenter.setSubheaderInsetStart(i);
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public void setSubheaderInsetEnd(int i) {
        this.presenter.setSubheaderInsetEnd(i);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(C1840 c1840) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(c1840);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(C1840 c1840) {
        this.sideContainerBackHelper.updateBackProgress(c1840, ((C16795) requireDrawerLayoutParent().second).f49496);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(c1840.m48687()));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair pairRequireDrawerLayoutParent = requireDrawerLayoutParent();
        C14784 c14784 = (C14784) pairRequireDrawerLayoutParent.first;
        C1840 c1840OnHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (c1840OnHandleBackInvoked != null && Build.VERSION.SDK_INT >= 34) {
            this.sideContainerBackHelper.finishBackProgress(c1840OnHandleBackInvoked, ((C16795) pairRequireDrawerLayoutParent.second).f49496, DrawerLayoutUtils.getScrimCloseAnimatorListener(c14784, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(c14784));
            return;
        }
        c14784.m33736((View) this, true);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    private Pair requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof C14784) && (layoutParams instanceof C16795)) {
            return new Pair((C14784) parent, (C16795) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new C1228(getContext());
        }
        return this.menuInflater;
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM5547 = C0886.m5547(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM5547.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM5547.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            /* JADX WARN: Code duplicated, block: B:18:0x004f  */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                boolean z;
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z2 = true;
                boolean z3 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z3);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z3 && navigationView2.isTopInsetScrimEnabled());
                if (NavigationView.this.tmpLocation[0] != 0) {
                    if (NavigationView.this.getWidth() + NavigationView.this.tmpLocation[0] == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                NavigationView.this.setDrawLeftInsetForeground(z);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                    boolean z4 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
                    boolean z5 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView3 = NavigationView.this;
                    navigationView3.setDrawBottomInsetForeground(z4 && z5 && navigationView3.isBottomInsetScrimEnabled());
                    if (currentWindowBounds.width() != NavigationView.this.tmpLocation[0] && currentWindowBounds.width() - NavigationView.this.getWidth() != NavigationView.this.tmpLocation[0]) {
                        z2 = false;
                    }
                    NavigationView.this.setDrawRightInsetForeground(z2);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public class SavedState extends AbstractC9165 {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p067l.AbstractC9165, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }
}
