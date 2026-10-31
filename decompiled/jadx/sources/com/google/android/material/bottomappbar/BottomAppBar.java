package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.AbstractC7152;
import l.C14077;
import l.C14699;
import l.C16519;
import l.C17648;
import l.C17931;
import l.C18333;
import l.C18637;
import l.C19343;
import l.C21610;
import l.C23575;
import l.C8184;
import l.C8788;
import l.C9762;
import l.InterfaceC10551;
import l.RunnableC1000;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar extends C9762 implements InterfaceC10551 {
    public static final int FAB_ALIGNMENT_ANIM_DURATION_DEFAULT = 300;
    public static final float FAB_ALIGNMENT_ANIM_EASING_MIDPOINT = 0.2f;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    public static final int NO_FAB_END_MARGIN = -1;
    public static final int NO_MENU_RES_ID = 0;
    public int animatingModeChangeCounter;
    public ArrayList animationListeners;
    public Behavior behavior;
    public int bottomInset;
    public int fabAlignmentMode;
    public int fabAlignmentModeEndMargin;
    public int fabAnchorMode;
    public AnimatorListenerAdapter fabAnimationListener;
    public int fabAnimationMode;
    public boolean fabAttached;
    public final int fabOffsetEndMode;
    public TransformationCallback fabTransformationCallback;
    public boolean hideOnScroll;
    public int leftInset;
    public final MaterialShapeDrawable materialShapeDrawable;
    public int menuAlignmentMode;
    public boolean menuAnimatingWithFabAlignmentMode;
    public Animator menuAnimator;
    public Animator modeAnimator;
    public Integer navigationIconTint;
    public final boolean paddingBottomSystemWindowInsets;
    public final boolean paddingLeftSystemWindowInsets;
    public final boolean paddingRightSystemWindowInsets;
    public int pendingMenuResId;
    public final boolean removeEmbeddedFabElevation;
    public int rightInset;
    public static final int DEF_STYLE_RES = C18637.f58433;
    public static final int FAB_ALIGNMENT_ANIM_DURATION_ATTR = C17931.f54897;
    public static final int FAB_ALIGNMENT_ANIM_EASING_ATTR = C17931.f55271;

    public interface AnimationListener {
        void onAnimationEnd(BottomAppBar bottomAppBar);

        void onAnimationStart(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuAlignmentMode {
    }

    @Override // l.C9762
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // l.C9762
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f55537);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.materialShapeDrawable = materialShapeDrawable;
        this.animatingModeChangeCounter = 0;
        this.pendingMenuResId = 0;
        this.menuAnimatingWithFabAlignmentMode = false;
        this.fabAttached = true;
        this.fabAnimationListener = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (BottomAppBar.this.menuAnimatingWithFabAlignmentMode) {
                    return;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.maybeAnimateMenuView(bottomAppBar.fabAlignmentMode, BottomAppBar.this.fabAttached);
            }
        };
        this.fabTransformationCallback = new TransformationCallback() { // from class: com.google.android.material.bottomappbar.BottomAppBar.2
            @Override // com.google.android.material.animation.TransformationCallback
            public void onScaleChanged(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.materialShapeDrawable.setInterpolation((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.fabAnchorMode == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }

            @Override // com.google.android.material.animation.TransformationCallback
            public void onTranslationChanged(FloatingActionButton floatingActionButton) {
                if (BottomAppBar.this.fabAnchorMode != 1) {
                    return;
                }
                float translationX = floatingActionButton.getTranslationX();
                if (BottomAppBar.this.getTopEdgeTreatment().getHorizontalOffset() != translationX) {
                    BottomAppBar.this.getTopEdgeTreatment().setHorizontalOffset(translationX);
                    BottomAppBar.this.materialShapeDrawable.invalidateSelf();
                }
                float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
                if (BottomAppBar.this.getTopEdgeTreatment().getCradleVerticalOffset() != fMax) {
                    BottomAppBar.this.getTopEdgeTreatment().setCradleVerticalOffset(fMax);
                    BottomAppBar.this.materialShapeDrawable.invalidateSelf();
                }
                BottomAppBar.this.materialShapeDrawable.setInterpolation(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
            }
        };
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C19343.f61061, i, i2, new int[0]);
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C19343.f61751);
        if (typedArrayObtainStyledAttributes.hasValue(C19343.f62156)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(C19343.f62156, -1));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f61591, 0);
        float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f61379, 0);
        float dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f60986, 0);
        float dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f61676, 0);
        this.fabAlignmentMode = typedArrayObtainStyledAttributes.getInt(C19343.f61273, 0);
        this.fabAnimationMode = typedArrayObtainStyledAttributes.getInt(C19343.f61857, 0);
        this.fabAnchorMode = typedArrayObtainStyledAttributes.getInt(C19343.f62550, 1);
        this.removeEmbeddedFabElevation = typedArrayObtainStyledAttributes.getBoolean(C19343.f62422, true);
        this.menuAlignmentMode = typedArrayObtainStyledAttributes.getInt(C19343.f62210, 0);
        this.hideOnScroll = typedArrayObtainStyledAttributes.getBoolean(C19343.f62102, false);
        this.paddingBottomSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f61942, false);
        this.paddingLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f62634, false);
        this.paddingRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C19343.f61357, false);
        this.fabAlignmentModeEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f61698, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C19343.f61804, true);
        typedArrayObtainStyledAttributes.recycle();
        this.fabOffsetEndMode = getResources().getDimensionPixelOffset(C23575.f75828);
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setTopEdge(new BottomAppBarTopEdgeTreatment(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).build());
        if (z) {
            materialShapeDrawable.setShadowCompatibilityMode(2);
        } else {
            materialShapeDrawable.setShadowCompatibilityMode(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
        materialShapeDrawable.initializeElevationOverlay(context2);
        setElevation(dimensionPixelSize);
        C8184.m21676(materialShapeDrawable, colorStateList);
        int i3 = C17648.f53953;
        setBackground(materialShapeDrawable);
        ViewUtils.doOnApplyWindowInsets(this, attributeSet, i, i2, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.3
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public C21610 onApplyWindowInsets(View view, C21610 c21610, ViewUtils.RelativePadding relativePadding) {
                boolean z2;
                if (BottomAppBar.this.paddingBottomSystemWindowInsets) {
                    BottomAppBar.this.bottomInset = c21610.m48835();
                }
                boolean z3 = false;
                if (BottomAppBar.this.paddingLeftSystemWindowInsets) {
                    z2 = BottomAppBar.this.leftInset != c21610.m48824();
                    BottomAppBar.this.leftInset = c21610.m48824();
                } else {
                    z2 = false;
                }
                if (BottomAppBar.this.paddingRightSystemWindowInsets) {
                    boolean z4 = BottomAppBar.this.rightInset != c21610.m48834();
                    BottomAppBar.this.rightInset = c21610.m48834();
                    z3 = z4;
                }
                if (!z2 && !z3) {
                    return c21610;
                }
                BottomAppBar.this.cancelAnimations();
                BottomAppBar.this.setCutoutStateAndTranslateFab();
                BottomAppBar.this.setActionMenuViewPosition();
                return c21610;
            }
        });
    }

    @Override // l.C9762
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.navigationIconTint = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public int getFabAlignmentMode() {
        return this.fabAlignmentMode;
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.pendingMenuResId = i2;
        this.menuAnimatingWithFabAlignmentMode = true;
        maybeAnimateMenuView(i, this.fabAttached);
        maybeAnimateModeChange(i);
        this.fabAlignmentMode = i;
    }

    public int getFabAnchorMode() {
        return this.fabAnchorMode;
    }

    public void setFabAnchorMode(int i) {
        this.fabAnchorMode = i;
        setCutoutStateAndTranslateFab();
        View viewFindDependentView = findDependentView();
        if (viewFindDependentView != null) {
            updateFabAnchorGravity(this, viewFindDependentView);
            viewFindDependentView.requestLayout();
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public static void updateFabAnchorGravity(BottomAppBar bottomAppBar, View view) {
        C14077 c14077 = (C14077) view.getLayoutParams();
        c14077.f42508 = 17;
        int i = bottomAppBar.fabAnchorMode;
        if (i == 1) {
            c14077.f42508 = 17 | 48;
        }
        if (i == 0) {
            c14077.f42508 |= 80;
        }
    }

    public int getFabAnimationMode() {
        return this.fabAnimationMode;
    }

    public void setFabAnimationMode(int i) {
        this.fabAnimationMode = i;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.menuAlignmentMode != i) {
            this.menuAlignmentMode = i;
            C8788 actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                translateActionMenuView(actionMenuView, this.fabAlignmentMode, isFabVisibleOrWillBeShown());
            }
        }
    }

    public int getMenuAlignmentMode() {
        return this.menuAlignmentMode;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C8184.m21676(this.materialShapeDrawable, colorStateList);
    }

    public ColorStateList getBackgroundTint() {
        return this.materialShapeDrawable.getTintList();
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().getFabCradleMargin();
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().setFabCradleMargin(f);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().getFabCradleRoundedCornerRadius();
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().setFabCradleRoundedCornerRadius(f);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().getCradleVerticalOffset();
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().setCradleVerticalOffset(f);
            this.materialShapeDrawable.invalidateSelf();
            setCutoutStateAndTranslateFab();
        }
    }

    public int getFabAlignmentModeEndMargin() {
        return this.fabAlignmentModeEndMargin;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.fabAlignmentModeEndMargin != i) {
            this.fabAlignmentModeEndMargin = i;
            setCutoutStateAndTranslateFab();
        }
    }

    public boolean getHideOnScroll() {
        return this.hideOnScroll;
    }

    public void setHideOnScroll(boolean z) {
        this.hideOnScroll = z;
    }

    public void performHide() {
        performHide(true);
    }

    public void performHide(boolean z) {
        getBehavior().slideDown(this, z);
    }

    public void performShow() {
        performShow(true);
    }

    public void performShow(boolean z) {
        getBehavior().slideUp(this, z);
    }

    public boolean isScrolledDown() {
        return getBehavior().isScrolledDown();
    }

    public boolean isScrolledUp() {
        return getBehavior().isScrolledUp();
    }

    public void addOnScrollStateChangedListener(HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().addOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void removeOnScrollStateChangedListener(HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().removeOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        getBehavior().clearOnScrollStateChangedListeners();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.materialShapeDrawable.setElevation(f);
        getBehavior().setAdditionalHiddenOffsetY(this, this.materialShapeDrawable.getShadowRadius() - this.materialShapeDrawable.getShadowOffsetY());
    }

    public void replaceMenu(int i) {
        if (i != 0) {
            this.pendingMenuResId = 0;
            getMenu().clear();
            inflateMenu(i);
        }
    }

    public void addAnimationListener(AnimationListener animationListener) {
        if (this.animationListeners == null) {
            this.animationListeners = new ArrayList();
        }
        this.animationListeners.add(animationListener);
    }

    public void removeAnimationListener(AnimationListener animationListener) {
        ArrayList arrayList = this.animationListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        ArrayList arrayList;
        int i = this.animatingModeChangeCounter;
        this.animatingModeChangeCounter = i + 1;
        if (i != 0 || (arrayList = this.animationListeners) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AnimationListener) it.next()).onAnimationStart(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        ArrayList arrayList;
        int i = this.animatingModeChangeCounter - 1;
        this.animatingModeChangeCounter = i;
        if (i != 0 || (arrayList = this.animationListeners) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AnimationListener) it.next()).onAnimationEnd(this);
        }
    }

    public boolean setFabDiameter(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().getFabDiameter()) {
            return false;
        }
        getTopEdgeTreatment().setFabDiameter(f);
        this.materialShapeDrawable.invalidateSelf();
        return true;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().getFabCornerRadius()) {
            getTopEdgeTreatment().setFabCornerSize(f);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    private void maybeAnimateModeChange(int i) {
        if (this.fabAlignmentMode != i) {
            int i2 = C17648.f53953;
            if (isLaidOut()) {
                Animator animator = this.modeAnimator;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.fabAnimationMode == 1) {
                    createFabTranslationXAnimation(i, arrayList);
                } else {
                    createFabDefaultXAnimation(i, arrayList);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), FAB_ALIGNMENT_ANIM_EASING_ATTR, AnimationUtils.LINEAR_INTERPOLATOR));
                this.modeAnimator = animatorSet;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator2) {
                        BottomAppBar.this.dispatchAnimationStart();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        BottomAppBar.this.dispatchAnimationEnd();
                        BottomAppBar.this.modeAnimator = null;
                    }
                });
                this.modeAnimator.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton findDependentFab() {
        View viewFindDependentView = findDependentView();
        if (viewFindDependentView instanceof FloatingActionButton) {
            return (FloatingActionButton) viewFindDependentView;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View findDependentView() {
        if (!(getParent() instanceof C18333)) {
            return null;
        }
        for (View view : ((C18333) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    private boolean isFabVisibleOrWillBeShown() {
        FloatingActionButton floatingActionButtonFindDependentFab = findDependentFab();
        return floatingActionButtonFindDependentFab != null && floatingActionButtonFindDependentFab.isOrWillBeShown();
    }

    public void createFabDefaultXAnimation(final int i, List list) {
        FloatingActionButton floatingActionButtonFindDependentFab = findDependentFab();
        if (floatingActionButtonFindDependentFab == null || floatingActionButtonFindDependentFab.isOrWillBeHidden()) {
            return;
        }
        dispatchAnimationStart();
        floatingActionButtonFindDependentFab.hide(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5
            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
            public void onHidden(FloatingActionButton floatingActionButton) {
                floatingActionButton.setTranslationX(BottomAppBar.this.getFabTranslationX(i));
                floatingActionButton.show(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5.1
                    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                    public void onShown(FloatingActionButton floatingActionButton2) {
                        BottomAppBar.this.dispatchAnimationEnd();
                    }
                });
            }
        });
    }

    private void createFabTranslationXAnimation(int i, List list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(findDependentFab(), "translationX", getFabTranslationX(i));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.resolveThemeDuration(getContext(), FAB_ALIGNMENT_ANIM_DURATION_ATTR, 300);
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
        if (drawable == null || this.navigationIconTint == null) {
            return drawable;
        }
        Drawable drawableM21684 = C8184.m21684(drawable.mutate());
        C8184.m21683(drawableM21684, this.navigationIconTint.intValue());
        return drawableM21684;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeAnimateMenuView(int i, boolean z) {
        int i2 = C17648.f53953;
        if (!isLaidOut()) {
            this.menuAnimatingWithFabAlignmentMode = false;
            replaceMenu(this.pendingMenuResId);
            return;
        }
        Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!isFabVisibleOrWillBeShown()) {
            i = 0;
            z = false;
        }
        createMenuViewTranslationAnimation(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.menuAnimator = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                BottomAppBar.this.dispatchAnimationStart();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                BottomAppBar.this.dispatchAnimationEnd();
                BottomAppBar.this.menuAnimatingWithFabAlignmentMode = false;
                BottomAppBar.this.menuAnimator = null;
            }
        });
        this.menuAnimator.start();
    }

    private void createMenuViewTranslationAnimation(final int i, final boolean z, List list) {
        final C8788 actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - getActionMenuViewTranslationX(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(objectAnimatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
                public boolean cancelled;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.cancelled = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.cancelled) {
                        return;
                    }
                    boolean z2 = BottomAppBar.this.pendingMenuResId != 0;
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    bottomAppBar.replaceMenu(bottomAppBar.pendingMenuResId);
                    BottomAppBar.this.translateActionMenuView(actionMenuView, i, z, z2);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
            list.add(animatorSet);
        }
    }

    private float getFabTranslationY() {
        if (this.fabAnchorMode == 1) {
            return -getTopEdgeTreatment().getCradleVerticalOffset();
        }
        View viewFindDependentView = findDependentView();
        return viewFindDependentView != null ? (-((getMeasuredHeight() + getBottomInset()) - viewFindDependentView.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX(int i) {
        int measuredWidth;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        if (i != 1) {
            return 0.0f;
        }
        View viewFindDependentView = findDependentView();
        int i2 = zIsLayoutRtl ? this.leftInset : this.rightInset;
        if (this.fabAlignmentModeEndMargin != -1 && viewFindDependentView != null) {
            measuredWidth = (viewFindDependentView.getMeasuredWidth() / 2) + this.fabAlignmentModeEndMargin;
        } else {
            measuredWidth = this.fabOffsetEndMode;
        }
        return ((getMeasuredWidth() / 2) - (measuredWidth + i2)) * (zIsLayoutRtl ? -1 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return getFabTranslationX(this.fabAlignmentMode);
    }

    private C8788 getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C8788) {
                return (C8788) childAt;
            }
        }
        return null;
    }

    private void translateActionMenuView(C8788 c8788, int i, boolean z) {
        translateActionMenuView(c8788, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void translateActionMenuView(final C8788 c8788, final int i, final boolean z, boolean z2) {
        Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomappbar.BottomAppBar.8
            @Override // java.lang.Runnable
            public void run() {
                C8788 c8789 = c8788;
                c8789.setTranslationX(BottomAppBar.this.getActionMenuViewTranslationX(c8789, i, z));
            }
        };
        if (z2) {
            c8788.post(runnable);
        } else {
            runnable.run();
        }
    }

    public int getActionMenuViewTranslationX(C8788 c8788, int i, boolean z) {
        int dimensionPixelOffset = 0;
        if (this.menuAlignmentMode != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int measuredWidth = zIsLayoutRtl ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof C14699) && (((C14699) childAt.getLayoutParams()).f39731 & 8388615) == 8388611) {
                if (zIsLayoutRtl) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        int right = zIsLayoutRtl ? c8788.getRight() : c8788.getLeft();
        int i3 = zIsLayoutRtl ? this.rightInset : -this.leftInset;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(C23575.f76125);
            if (!zIsLayoutRtl) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i3) + dimensionPixelOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAnimations() {
        Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.modeAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    @Override // l.C9762, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            cancelAnimations();
            setCutoutStateAndTranslateFab();
            View viewFindDependentView = findDependentView();
            if (viewFindDependentView != null) {
                int i5 = C17648.f53953;
                if (viewFindDependentView.isLaidOut()) {
                    viewFindDependentView.post(new RunnableC1000(4, viewFindDependentView));
                }
            }
        }
        setActionMenuViewPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.materialShapeDrawable.getShapeAppearanceModel().getTopEdge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCutoutStateAndTranslateFab() {
        getTopEdgeTreatment().setHorizontalOffset(getFabTranslationX());
        this.materialShapeDrawable.setInterpolation((this.fabAttached && isFabVisibleOrWillBeShown() && this.fabAnchorMode == 1) ? 1.0f : 0.0f);
        View viewFindDependentView = findDependentView();
        if (viewFindDependentView != null) {
            viewFindDependentView.setTranslationY(getFabTranslationY());
            viewFindDependentView.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionMenuViewPosition() {
        C8788 actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.menuAnimator != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!isFabVisibleOrWillBeShown()) {
            translateActionMenuView(actionMenuView, 0, false);
        } else {
            translateActionMenuView(actionMenuView, this.fabAlignmentMode, this.fabAttached);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFabAnimationListeners(FloatingActionButton floatingActionButton) {
        floatingActionButton.addOnHideAnimationListener(this.fabAnimationListener);
        floatingActionButton.addOnShowAnimationListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BottomAppBar.this.fabAnimationListener.onAnimationStart(animator);
                FloatingActionButton floatingActionButtonFindDependentFab = BottomAppBar.this.findDependentFab();
                if (floatingActionButtonFindDependentFab != null) {
                    floatingActionButtonFindDependentFab.setTranslationX(BottomAppBar.this.getFabTranslationX());
                }
            }
        });
        floatingActionButton.addTransformationCallback(this.fabTransformationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.bottomInset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.rightInset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.leftInset;
    }

    @Override // l.InterfaceC10551
    public Behavior getBehavior() {
        if (this.behavior == null) {
            this.behavior = new Behavior();
        }
        return this.behavior;
    }

    @Override // l.C9762, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.materialShapeDrawable);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public class Behavior extends HideBottomViewOnScrollBehavior {
        public final Rect fabContentRect;
        public final View.OnLayoutChangeListener fabLayoutListener;
        public int originalBottomMargin;
        public WeakReference viewRef;

        public Behavior() {
            this.fabLayoutListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.viewRef.get();
                    if (bottomAppBar == null || (!(view instanceof FloatingActionButton) && !(view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(Behavior.this.fabContentRect);
                        int iHeight = Behavior.this.fabContentRect.height();
                        bottomAppBar.setFabDiameter(iHeight);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(Behavior.this.fabContentRect)));
                        height = iHeight;
                    }
                    C14077 c14077 = (C14077) view.getLayoutParams();
                    if (Behavior.this.originalBottomMargin == 0) {
                        if (bottomAppBar.fabAnchorMode == 1) {
                            ((ViewGroup.MarginLayoutParams) c14077).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C23575.f75686) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) c14077).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) c14077).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.isLayoutRtl(view)) {
                            ((ViewGroup.MarginLayoutParams) c14077).leftMargin += bottomAppBar.fabOffsetEndMode;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c14077).rightMargin += bottomAppBar.fabOffsetEndMode;
                        }
                    }
                    bottomAppBar.setCutoutStateAndTranslateFab();
                }
            };
            this.fabContentRect = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.fabLayoutListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.viewRef.get();
                    if (bottomAppBar == null || (!(view instanceof FloatingActionButton) && !(view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(Behavior.this.fabContentRect);
                        int iHeight = Behavior.this.fabContentRect.height();
                        bottomAppBar.setFabDiameter(iHeight);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(Behavior.this.fabContentRect)));
                        height = iHeight;
                    }
                    C14077 c14077 = (C14077) view.getLayoutParams();
                    if (Behavior.this.originalBottomMargin == 0) {
                        if (bottomAppBar.fabAnchorMode == 1) {
                            ((ViewGroup.MarginLayoutParams) c14077).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C23575.f75686) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) c14077).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) c14077).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.isLayoutRtl(view)) {
                            ((ViewGroup.MarginLayoutParams) c14077).leftMargin += bottomAppBar.fabOffsetEndMode;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c14077).rightMargin += bottomAppBar.fabOffsetEndMode;
                        }
                    }
                    bottomAppBar.setCutoutStateAndTranslateFab();
                }
            };
            this.fabContentRect = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, l.AbstractC6317
        public boolean onLayoutChild(C18333 c18333, BottomAppBar bottomAppBar, int i) {
            this.viewRef = new WeakReference(bottomAppBar);
            View viewFindDependentView = bottomAppBar.findDependentView();
            if (viewFindDependentView != null) {
                int i2 = C17648.f53953;
                if (!viewFindDependentView.isLaidOut()) {
                    BottomAppBar.updateFabAnchorGravity(bottomAppBar, viewFindDependentView);
                    this.originalBottomMargin = ((ViewGroup.MarginLayoutParams) ((C14077) viewFindDependentView.getLayoutParams())).bottomMargin;
                    if (viewFindDependentView instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewFindDependentView;
                        if (bottomAppBar.fabAnchorMode == 0 && bottomAppBar.removeEmbeddedFabElevation) {
                            C17648.m41301(floatingActionButton, 0.0f);
                            floatingActionButton.setCompatElevation(0.0f);
                        }
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(C16519.f50789);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(C16519.f50773);
                        }
                        bottomAppBar.addFabAnimationListeners(floatingActionButton);
                    }
                    viewFindDependentView.addOnLayoutChangeListener(this.fabLayoutListener);
                    bottomAppBar.setCutoutStateAndTranslateFab();
                }
            }
            c18333.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(c18333, (View) bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, l.AbstractC6317
        public boolean onStartNestedScroll(C18333 c18333, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(c18333, (View) bottomAppBar, view, view2, i, i2);
        }
    }

    @Override // l.C9762, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.fabAlignmentMode = this.fabAlignmentMode;
        savedState.fabAttached = this.fabAttached;
        return savedState;
    }

    @Override // l.C9762, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.fabAlignmentMode = savedState.fabAlignmentMode;
        this.fabAttached = savedState.fabAttached;
    }

    public class SavedState extends AbstractC7152 {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.bottomappbar.BottomAppBar.SavedState.1
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
        public int fabAlignmentMode;
        public boolean fabAttached;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.fabAlignmentMode = parcel.readInt();
            this.fabAttached = parcel.readInt() != 0;
        }

        @Override // l.AbstractC7152, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.fabAlignmentMode);
            parcel.writeInt(this.fabAttached ? 1 : 0);
        }
    }
}
