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
import l.AbstractC20121;
import l.AbstractC7152;
import l.C0881;
import l.C11003;
import l.C13064;
import l.C15180;
import l.C17648;
import l.C17931;
import l.C18637;
import l.C19343;
import l.C20118;
import l.C21610;
import l.C22733;
import l.C23575;
import l.C3060;
import l.C4736;
import l.C5882;
import l.C7790;
import l.InterfaceC19994;
import l.InterfaceC8126;
import l.RunnableC7994;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    public static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    public final InterfaceC8126 backDrawerListener;
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
    public static final int DEF_STYLE_RES = C18637.f58943;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f54795);
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
        this.backDrawerListener = new AbstractC20121() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // l.AbstractC20121, l.InterfaceC8126
            public void onDrawerOpened(View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                    C11003.requireNonNull(materialBackOrchestrator);
                    view.post(new RunnableC7994(3, materialBackOrchestrator));
                }
            }

            @Override // l.AbstractC20121, l.InterfaceC8126
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
        C22733 c22733ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C19343.f60871, i, i4, new int[0]);
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61243)) {
            Drawable drawableM50815 = c22733ObtainTintedStyledAttributes.m50815(C19343.f61243);
            int i5 = C17648.f53953;
            setBackground(drawableM50815);
        }
        int iM50803 = c22733ObtainTintedStyledAttributes.m50803(C19343.f61190, 0);
        this.drawerLayoutCornerSize = iM50803;
        this.drawerLayoutCornerSizeBackAnimationEnabled = iM50803 == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(C23575.f76232);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i4).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            int i6 = C17648.f53953;
            setBackground(materialShapeDrawable);
        }
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61084)) {
            setElevation(c22733ObtainTintedStyledAttributes.m50803(C19343.f61084, 0));
        }
        setFitsSystemWindows(c22733ObtainTintedStyledAttributes.m50801(C19343.f60924, false));
        this.maxWidth = c22733ObtainTintedStyledAttributes.m50803(C19343.f61987, 0);
        ColorStateList colorStateListM50804 = c22733ObtainTintedStyledAttributes.m50802(C19343.f62248) ? c22733ObtainTintedStyledAttributes.m50804(C19343.f62248) : null;
        int iM50806 = c22733ObtainTintedStyledAttributes.m50802(C19343.f61236) ? c22733ObtainTintedStyledAttributes.m50806(C19343.f61236, 0) : 0;
        if (iM50806 == 0 && colorStateListM50804 == null) {
            colorStateListM50804 = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f62573)) {
            colorStateListCreateDefaultColorStateList = c22733ObtainTintedStyledAttributes.m50804(C19343.f62573);
        } else {
            colorStateListCreateDefaultColorStateList = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int iM50807 = c22733ObtainTintedStyledAttributes.m50802(C19343.f61342) ? c22733ObtainTintedStyledAttributes.m50806(C19343.f61342, 0) : 0;
        boolean zM50801 = c22733ObtainTintedStyledAttributes.m50801(C19343.f62407, true);
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61721)) {
            setItemIconSize(c22733ObtainTintedStyledAttributes.m50803(C19343.f61721, 0));
        }
        ColorStateList colorStateListM50805 = c22733ObtainTintedStyledAttributes.m50802(C19343.f61554) ? c22733ObtainTintedStyledAttributes.m50804(C19343.f61554) : null;
        if (iM50807 == 0 && colorStateListM50805 == null) {
            colorStateListM50805 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableM50816 = c22733ObtainTintedStyledAttributes.m50815(C19343.f61774);
        if (drawableM50816 == null && hasShapeAppearance(c22733ObtainTintedStyledAttributes)) {
            drawableM50816 = createDefaultItemBackground(c22733ObtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, c22733ObtainTintedStyledAttributes, C19343.f61402);
            if (colorStateList != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(c22733ObtainTintedStyledAttributes, null)));
            }
        }
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61614)) {
            i2 = 0;
            setItemHorizontalPadding(c22733ObtainTintedStyledAttributes.m50803(C19343.f61614, 0));
        } else {
            i2 = 0;
        }
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61501)) {
            setItemVerticalPadding(c22733ObtainTintedStyledAttributes.m50803(C19343.f61501, i2));
        }
        setDividerInsetStart(c22733ObtainTintedStyledAttributes.m50803(C19343.f62361, i2));
        setDividerInsetEnd(c22733ObtainTintedStyledAttributes.m50803(C19343.f62520, i2));
        setSubheaderInsetStart(c22733ObtainTintedStyledAttributes.m50803(C19343.f60864, i2));
        setSubheaderInsetEnd(c22733ObtainTintedStyledAttributes.m50803(C19343.f62301, i2));
        setTopInsetScrimEnabled(c22733ObtainTintedStyledAttributes.m50801(C19343.f60917, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(c22733ObtainTintedStyledAttributes.m50801(C19343.f62467, this.bottomInsetScrimEnabled));
        int iM50804 = c22733ObtainTintedStyledAttributes.m50803(C19343.f61296, i2);
        setItemMaxLines(c22733ObtainTintedStyledAttributes.m50809(C19343.f61880, 1));
        navigationMenu.setCallback(new InterfaceC19994() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // l.InterfaceC19994
            public void onMenuModeChange(C3060 c3060) {
            }

            @Override // l.InterfaceC19994
            public boolean onMenuItemSelected(C3060 c3060, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (iM50806 != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(iM50806);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateListM50804);
        navigationMenuPresenter.setItemIconTintList(colorStateListCreateDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (iM50807 != 0) {
            navigationMenuPresenter.setItemTextAppearance(iM50807);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(zM50801);
        navigationMenuPresenter.setItemTextColor(colorStateListM50805);
        navigationMenuPresenter.setItemBackground(drawableM50816);
        navigationMenuPresenter.setItemIconPadding(iM50804);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f62033)) {
            i3 = 0;
            inflateMenu(c22733ObtainTintedStyledAttributes.m50806(C19343.f62033, 0));
        } else {
            i3 = 0;
        }
        if (c22733ObtainTintedStyledAttributes.m50802(C19343.f61827)) {
            inflateHeaderView(c22733ObtainTintedStyledAttributes.m50806(C19343.f61827, i3));
        }
        c22733ObtainTintedStyledAttributes.m50813();
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
        if ((getParent() instanceof C13064) && (getLayoutParams() instanceof C15180)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                int i3 = ((C15180) getLayoutParams()).f46371;
                int i4 = C17648.f53953;
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

    private boolean hasShapeAppearance(C22733 c22733) {
        return c22733.m50802(C19343.f60971) || c22733.m50802(C19343.f61661);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof C13064) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            C13064 c13064 = (C13064) parent;
            c13064.m31659(this.backDrawerListener);
            c13064.m31651(this.backDrawerListener);
            if (C13064.m31638(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof C13064) {
            ((C13064) parent).m31659(this.backDrawerListener);
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

    private Drawable createDefaultItemBackground(C22733 c22733) {
        return createDefaultItemDrawable(c22733, MaterialResources.getColorStateList(getContext(), c22733, C19343.f62087));
    }

    private Drawable createDefaultItemDrawable(C22733 c22733, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), c22733.m50806(C19343.f60971, 0), c22733.m50806(C19343.f61661, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, c22733.m50803(C19343.f61927, 0), c22733.m50803(C19343.f62619, 0), c22733.m50803(C19343.f62141, 0), c22733.m50803(C19343.f62195, 0));
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
        this.shapeableDelegate.maybeClip(canvas, new C4736(3, this));
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(C21610 c21610) {
        this.presenter.dispatchApplyWindowInsets(c21610);
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
        setItemBackground(C0881.m3234(getContext(), i));
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
            this.presenter.setCheckedItem((C5882) menuItemFindItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((C5882) menuItemFindItem);
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
    public void startBackProgress(C20118 c20118) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(c20118);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(C20118 c20118) {
        this.sideContainerBackHelper.updateBackProgress(c20118, ((C15180) requireDrawerLayoutParent().second).f46371);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(c20118.m46371()));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair pairRequireDrawerLayoutParent = requireDrawerLayoutParent();
        C13064 c13064 = (C13064) pairRequireDrawerLayoutParent.first;
        C20118 c20118OnHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (c20118OnHandleBackInvoked != null && Build.VERSION.SDK_INT >= 34) {
            this.sideContainerBackHelper.finishBackProgress(c20118OnHandleBackInvoked, ((C15180) pairRequireDrawerLayoutParent.second).f46371, DrawerLayoutUtils.getScrimCloseAnimatorListener(c13064, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(c13064));
            return;
        }
        c13064.m31649((View) this, true);
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
        if ((parent instanceof C13064) && (layoutParams instanceof C15180)) {
            return new Pair((C13064) parent, (C15180) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new C7790(getContext());
        }
        return this.menuInflater;
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM3233 = C0881.m3233(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM3233.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM3233.getColorForState(iArr, defaultColor), i2, defaultColor});
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

    public class SavedState extends AbstractC7152 {
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

        @Override // l.AbstractC7152, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }
}
