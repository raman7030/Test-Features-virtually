package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.AbstractC6317;
import l.AbstractC7152;
import l.C11003;
import l.C13847;
import l.C14077;
import l.C14369;
import l.C16445;
import l.C17648;
import l.C17931;
import l.C1814;
import l.C18333;
import l.C18637;
import l.C19343;
import l.C21311;
import l.C21610;
import l.C23575;
import l.C8184;
import l.C9465;
import l.InterfaceC10551;
import l.InterfaceC16610;
import l.InterfaceC22795;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements InterfaceC10551 {
    public static final int DEF_STYLE_RES = C18637.f58347;
    public static final int INVALID_SCROLL_RANGE = -1;
    public static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    public static final int PENDING_ACTION_COLLAPSED = 2;
    public static final int PENDING_ACTION_EXPANDED = 1;
    public static final int PENDING_ACTION_FORCE = 8;
    public static final int PENDING_ACTION_NONE = 0;
    public final float appBarElevation;
    public Behavior behavior;
    public int currentOffset;
    public int downPreScrollRange;
    public int downScrollRange;
    public final boolean hasLiftOnScrollColor;
    public boolean haveChildWithInterpolator;
    public C21610 lastInsets;
    public boolean liftOnScroll;
    public ValueAnimator liftOnScrollColorAnimator;
    public final long liftOnScrollColorDuration;
    public final TimeInterpolator liftOnScrollColorInterpolator;
    public ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    public final List liftOnScrollListeners;
    public WeakReference liftOnScrollTargetView;
    public int liftOnScrollTargetViewId;
    public boolean liftable;
    public boolean liftableOverride;
    public boolean lifted;
    public List listeners;
    public int pendingAction;
    public Drawable statusBarForeground;
    public Integer statusBarForegroundOriginalColor;
    public int[] tmpStatesArray;
    public int totalScrollRange;

    public interface BaseOnOffsetChangedListener {
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    public abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(AppBarLayout appBarLayout, View view, float f);
    }

    public interface LiftOnScrollListener {
        void onUpdate(float f, int i);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f55006);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.liftOnScrollListeners = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i3 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            ViewUtilsLollipop.setBoundsViewOutlineProvider(this);
        }
        ViewUtilsLollipop.setStateListAnimatorFromAttrs(this, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C19343.f61654, i, i2, new int[0]);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19343.f62026);
        int i4 = C17648.f53953;
        setBackground(drawable);
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C19343.f61229);
        this.hasLiftOnScrollColor = colorStateList != null;
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            if (colorStateList != null) {
                initializeLiftOnScrollWithColor(materialShapeDrawable, colorStateListOrNull, colorStateList);
            } else {
                initializeLiftOnScrollWithElevation(context2, materialShapeDrawable);
            }
        }
        this.liftOnScrollColorDuration = MotionUtils.resolveThemeDuration(context2, C17931.f54794, getResources().getInteger(C9465.f28748));
        this.liftOnScrollColorInterpolator = MotionUtils.resolveThemeInterpolator(context2, C17931.f54864, AnimationUtils.LINEAR_INTERPOLATOR);
        if (typedArrayObtainStyledAttributes.hasValue(C19343.f62294)) {
            setExpanded(typedArrayObtainStyledAttributes.getBoolean(C19343.f62294, false), false, false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C19343.f62241)) {
            ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f62241, 0));
        }
        if (i3 >= 26) {
            if (typedArrayObtainStyledAttributes.hasValue(C19343.f61017)) {
                setKeyboardNavigationCluster(typedArrayObtainStyledAttributes.getBoolean(C19343.f61017, false));
            }
            if (typedArrayObtainStyledAttributes.hasValue(C19343.f61123)) {
                setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes.getBoolean(C19343.f61123, false));
            }
        }
        this.appBarElevation = getResources().getDimension(C23575.f76097);
        this.liftOnScroll = typedArrayObtainStyledAttributes.getBoolean(C19343.f60857, false);
        this.liftOnScrollTargetViewId = typedArrayObtainStyledAttributes.getResourceId(C19343.f60910, -1);
        setStatusBarForeground(typedArrayObtainStyledAttributes.getDrawable(C19343.f61441));
        typedArrayObtainStyledAttributes.recycle();
        C17648.m41310(this, new InterfaceC16610() { // from class: com.google.android.material.appbar.AppBarLayout.1
            @Override // l.InterfaceC16610
            public C21610 onApplyWindowInsets(View view, C21610 c21610) {
                return AppBarLayout.this.onWindowInsetChanged(c21610);
            }
        });
    }

    private void initializeLiftOnScrollWithColor(final MaterialShapeDrawable materialShapeDrawable, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), C17931.f55377);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$initializeLiftOnScrollWithColor$0(colorStateList, colorStateList2, materialShapeDrawable, colorOrNull, valueAnimator);
            }
        };
        int i = C17648.f53953;
        setBackground(materialShapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithColor$0(ColorStateList colorStateList, ColorStateList colorStateList2, MaterialShapeDrawable materialShapeDrawable, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int iLayer = MaterialColors.layer(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(iLayer));
        if (this.statusBarForeground != null && (num2 = this.statusBarForegroundOriginalColor) != null && num2.equals(num)) {
            C8184.m21683(this.statusBarForeground, iLayer);
        }
        if (this.liftOnScrollListeners.isEmpty()) {
            return;
        }
        for (LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
            if (materialShapeDrawable.getFillColor() != null) {
                liftOnScrollListener.onUpdate(0.0f, iLayer);
            }
        }
    }

    private void initializeLiftOnScrollWithElevation(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$initializeLiftOnScrollWithElevation$1(materialShapeDrawable, valueAnimator);
            }
        };
        int i = C17648.f53953;
        setBackground(materialShapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(fFloatValue);
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(fFloatValue);
        }
        Iterator it = this.liftOnScrollListeners.iterator();
        while (it.hasNext()) {
            ((LiftOnScrollListener) it.next()).onUpdate(fFloatValue, materialShapeDrawable.getResolvedTintColor());
        }
    }

    public void addOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void removeOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    public boolean removeLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.statusBarForeground = drawable != null ? drawable.mutate() : null;
            this.statusBarForegroundOriginalColor = extractStatusBarForegroundColor();
            Drawable drawable3 = this.statusBarForeground;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                Drawable drawable4 = this.statusBarForeground;
                int i = C17648.f53953;
                C8184.m21681(drawable4, getLayoutDirection());
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            int i2 = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C21311.m48345(getContext(), i));
    }

    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    private Integer extractStatusBarForegroundColor() {
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) drawable).getResolvedTintColor());
        }
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            int i3 = C17648.f53953;
            if (getFitsSystemWindows() && shouldOffsetFirstChild()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C1814.m6036(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        invalidateScrollRanges();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = C17648.f53953;
        boolean z2 = true;
        if (getFitsSystemWindows() && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C17648.m41332(topInset, getChildAt(childCount));
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            if (((LayoutParams) getChildAt(i6).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.liftableOverride) {
            return;
        }
        if (!this.liftOnScroll && !hasCollapsibleChild()) {
            z2 = false;
        }
        setLiftableState(z2);
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void invalidateScrollRanges() {
        Behavior behavior = this.behavior;
        BaseBehavior.SavedState savedStateSaveScrollState = (behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : behavior.saveScrollState(AbstractC7152.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (savedStateSaveScrollState != null) {
            this.behavior.restoreScrollState(savedStateSaveScrollState, false);
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // l.InterfaceC10551
    public AbstractC6317 getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setExpanded(boolean z) {
        int i = C17648.f53953;
        setExpanded(z, isLaidOut());
    }

    public void setExpanded(boolean z, boolean z2) {
        setExpanded(z, z2, true);
    }

    private void setExpanded(boolean z, boolean z2, boolean z3) {
        this.pendingAction = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public final int getTotalScrollRange() {
        int i = this.totalScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.scrollFlags;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    int i4 = C17648.f53953;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                if ((i3 & 2) != 0) {
                    int i5 = C17648.f53953;
                    minimumHeight = topInset - childAt.getMinimumHeight();
                    break;
                }
                minimumHeight = topInset;
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.totalScrollRange = iMax;
        return iMax;
    }

    public boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.downPreScrollRange;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.scrollFlags;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i3 & 8) != 0) {
                        int i5 = C17648.f53953;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            int i6 = C17648.f53953;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0) {
                            int i7 = C17648.f53953;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        int i8 = C17648.f53953;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.downPreScrollRange = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.downScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i3 = layoutParams.scrollFlags;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    int i4 = C17648.f53953;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.downScrollRange = iMax;
        return iMax;
    }

    public void onOffsetChanged(int i) {
        this.currentOffset = i;
        if (!willNotDraw()) {
            int i2 = C17648.f53953;
            postInvalidateOnAnimation();
        }
        List list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = (BaseOnOffsetChangedListener) this.listeners.get(i3);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i);
                }
            }
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int i = C17648.f53953;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.liftable;
        int i2 = C17931.f54987;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.lifted) ? C17931.f54919 : -C17931.f54919;
        int i3 = C17931.f55498;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.lifted) ? C17931.f55157 : -C17931.f55157;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    public boolean setLiftable(boolean z) {
        this.liftableOverride = true;
        return setLiftableState(z);
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.liftableOverride = z;
    }

    private boolean setLiftableState(boolean z) {
        if (this.liftable == z) {
            return false;
        }
        this.liftable = z;
        refreshDrawableState();
        return true;
    }

    public boolean setLifted(boolean z) {
        return setLiftedState(z, true);
    }

    public boolean isLifted() {
        return this.lifted;
    }

    public boolean setLiftedState(boolean z) {
        return setLiftedState(z, !this.liftableOverride);
    }

    public boolean setLiftedState(boolean z, boolean z2) {
        if (!z2 || this.lifted == z) {
            return false;
        }
        this.lifted = z;
        refreshDrawableState();
        if (!isLiftOnScrollCompatibleBackground()) {
            return true;
        }
        if (this.hasLiftOnScrollColor) {
            startLiftOnScrollColorAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.liftOnScroll) {
            return true;
        }
        startLiftOnScrollColorAnimation(z ? 0.0f : this.appBarElevation, z ? this.appBarElevation : 0.0f);
        return true;
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    private void startLiftOnScrollColorAnimation(float f, float f2) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.liftOnScrollColorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    public void setLiftOnScroll(boolean z) {
        this.liftOnScroll = z;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.liftOnScrollTargetViewId = i;
        clearLiftOnScrollTargetView();
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    public boolean shouldLift(View view) {
        View viewFindLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (viewFindLiftOnScrollTargetView != null) {
            view = viewFindLiftOnScrollTargetView;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    private View findLiftOnScrollTargetView(View view) {
        int i;
        if (this.liftOnScrollTargetView == null && (i = this.liftOnScrollTargetViewId) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (viewFindViewById != null) {
                this.liftOnScrollTargetView = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f);
    }

    public int getPendingAction() {
        return this.pendingAction;
    }

    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    public final int getTopInset() {
        C21610 c21610 = this.lastInsets;
        if (c21610 != null) {
            return c21610.m48826();
        }
        return 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                int i = C17648.f53953;
                if (!childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public C21610 onWindowInsetChanged(C21610 c21610) {
        int i = C17648.f53953;
        C21610 c21611 = getFitsSystemWindows() ? c21610 : null;
        if (!C11003.equals(this.lastInsets, c21611)) {
            this.lastInsets = c21611;
            updateWillNotDraw();
            requestLayout();
        }
        return c21610;
    }

    public class LayoutParams extends LinearLayout.LayoutParams {
        public static final int COLLAPSIBLE_FLAGS = 10;
        public static final int FLAG_QUICK_RETURN = 5;
        public static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        public ChildScrollEffect scrollEffect;
        public int scrollFlags;
        public Interpolator scrollInterpolator;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19343.f61335);
            this.scrollFlags = typedArrayObtainStyledAttributes.getInt(C19343.f61547, 0);
            setScrollEffect(typedArrayObtainStyledAttributes.getInt(C19343.f62400, 0));
            if (typedArrayObtainStyledAttributes.hasValue(C19343.f61494)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(C19343.f61494, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }

        public void setScrollFlags(int i) {
            this.scrollFlags = i;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        private ChildScrollEffect createScrollEffectFromInt(int i) {
            if (i != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        public ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public void setScrollEffect(ChildScrollEffect childScrollEffect) {
            this.scrollEffect = childScrollEffect;
        }

        public void setScrollEffect(int i) {
            this.scrollEffect = createScrollEffectFromInt(i);
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        public boolean isCollapsible() {
            int i = this.scrollFlags;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Behavior extends BaseBehavior {

        /* JADX INFO: loaded from: classes.dex */
        public abstract class DragCallback extends BaseBehavior.BaseDragCallback {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, l.AbstractC6317
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(c18333, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(C18333 c18333, AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(c18333, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(C18333 c18333, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(c18333, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(C18333 c18333, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(c18333, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(C18333 c18333, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(c18333, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(C18333 c18333, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(c18333, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(C18333 c18333, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(c18333, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(C18333 c18333, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(c18333, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(C18333 c18333, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(c18333, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, l.AbstractC6317
        public /* bridge */ /* synthetic */ boolean onTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
            return super.onTouchEvent(c18333, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class BaseBehavior extends HeaderBehavior {
        public static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        public WeakReference lastNestedScrollingChildRef;
        public int lastStartedType;
        public ValueAnimator offsetAnimator;
        public int offsetDelta;
        public BaseDragCallback onDragCallback;
        public SavedState savedState;

        /* JADX INFO: loaded from: classes.dex */
        public abstract class BaseDragCallback {
            public abstract boolean canDrag(AppBarLayout appBarLayout);
        }

        public static boolean checkFlag(int i, int i2) {
            return (i & i2) == i2;
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // l.AbstractC6317
        public boolean onStartNestedScroll(C18333 c18333, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (appBarLayout.isLiftOnScroll() || canScrollChildren(c18333, appBarLayout, view));
            if (z && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i2;
            return z;
        }

        private boolean canScrollChildren(C18333 c18333, AppBarLayout appBarLayout, View view) {
            return appBarLayout.hasScrollableChildren() && c18333.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        @Override // l.AbstractC6317
        public void onNestedPreScroll(C18333 c18333, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int downNestedPreScrollRange;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i5 = -appBarLayout.getTotalScrollRange();
                    i4 = i5;
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i4 != downNestedPreScrollRange) {
                    iArr[1] = scroll(c18333, appBarLayout, i2, i4, downNestedPreScrollRange);
                }
            }
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
            }
        }

        @Override // l.AbstractC6317
        public void onNestedScroll(C18333 c18333, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = scroll(c18333, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                addAccessibilityDelegateIfNeeded(c18333, appBarLayout);
            }
        }

        @Override // l.AbstractC6317
        public void onStopNestedScroll(C18333 c18333, AppBarLayout appBarLayout, View view, int i) {
            if (this.lastStartedType == 0 || i == 1) {
                snapToChildIfNeeded(c18333, appBarLayout);
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference(view);
        }

        public void setDragCallback(BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        private void animateOffsetTo(C18333 c18333, AppBarLayout appBarLayout, int i, float f) {
            int height;
            int iAbs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
            float fAbs = Math.abs(f);
            if (fAbs > 0.0f) {
                height = Math.round((iAbs / fAbs) * 1000.0f) * 3;
            } else {
                height = (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            animateOffsetWithDuration(c18333, appBarLayout, i, height);
        }

        private void animateOffsetWithDuration(final C18333 c18333, final AppBarLayout appBarLayout, int i, int i2) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.offsetAnimator.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        BaseBehavior.this.setHeaderTopBottomOffset(c18333, appBarLayout, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i2, 600));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i);
            this.offsetAnimator.start();
        }

        private int getChildIndexOnOffset(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private void snapToChildIfNeeded(C18333 c18333, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - paddingTop;
            int childIndexOnOffset = getChildIndexOnOffset(appBarLayout, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = appBarLayout.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int topInset = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (childIndexOnOffset == 0) {
                        int i = C17648.f53953;
                        if (appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        int i2 = C17648.f53953;
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (checkFlag(scrollFlags, 5)) {
                        int i3 = C17648.f53953;
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (topBottomOffsetForScrollingSibling < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        topInset += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    animateOffsetTo(c18333, appBarLayout, C1814.m6036(calculateSnapOffset(topBottomOffsetForScrollingSibling, minimumHeight, topInset) + paddingTop, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private int calculateSnapOffset(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        @Override // l.AbstractC6317
        public boolean onMeasureChild(C18333 c18333, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((C14077) appBarLayout.getLayoutParams())).height == -2) {
                c18333.onMeasureChild(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.onMeasureChild(c18333, (View) appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, l.AbstractC6317
        public boolean onLayoutChild(C18333 c18333, AppBarLayout appBarLayout, int i) {
            int iRound;
            boolean zOnLayoutChild = super.onLayoutChild(c18333, (View) appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            animateOffsetTo(c18333, appBarLayout, i2, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(c18333, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            animateOffsetTo(c18333, appBarLayout, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(c18333, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(c18333, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                setHeaderTopBottomOffset(c18333, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.firstVisibleChildIndex);
                int i3 = -childAt.getBottom();
                if (this.savedState.firstVisibleChildAtMinimumHeight) {
                    int i4 = C17648.f53953;
                    iRound = childAt.getMinimumHeight() + appBarLayout.getTopInset();
                } else {
                    iRound = Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown);
                }
                setHeaderTopBottomOffset(c18333, appBarLayout, iRound + i3);
            }
            appBarLayout.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(C1814.m6036(getTopAndBottomOffset(), -appBarLayout.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(c18333, appBarLayout, getTopAndBottomOffset(), 0, true);
            appBarLayout.onOffsetChanged(getTopAndBottomOffset());
            addAccessibilityDelegateIfNeeded(c18333, appBarLayout);
            return zOnLayoutChild;
        }

        private void addAccessibilityDelegateIfNeeded(final C18333 c18333, final AppBarLayout appBarLayout) {
            if (C17648.m41319(c18333)) {
                return;
            }
            C17648.m41309(c18333, new C16445() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                @Override // l.C16445
                public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
                    View childWithScrollingBehavior;
                    super.onInitializeAccessibilityNodeInfo(view, c14369);
                    c14369.m34281((CharSequence) ScrollView.class.getName());
                    if (appBarLayout.getTotalScrollRange() == 0 || (childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(c18333)) == null || !BaseBehavior.this.childrenHaveScrollFlags(appBarLayout)) {
                        return;
                    }
                    if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != (-appBarLayout.getTotalScrollRange())) {
                        c14369.m34283(C13847.f41296);
                        c14369.m34313(true);
                    }
                    if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                        if (childWithScrollingBehavior.canScrollVertically(-1)) {
                            if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                c14369.m34283(C13847.f41299);
                                c14369.m34313(true);
                                return;
                            }
                            return;
                        }
                        c14369.m34283(C13847.f41299);
                        c14369.m34313(true);
                    }
                }

                @Override // l.C16445
                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    if (i == 4096) {
                        appBarLayout.setExpanded(false);
                        return true;
                    }
                    if (i == 8192) {
                        if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                            View childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(c18333);
                            if (childWithScrollingBehavior.canScrollVertically(-1)) {
                                int i2 = -appBarLayout.getDownNestedPreScrollRange();
                                if (i2 != 0) {
                                    BaseBehavior.this.onNestedPreScroll(c18333, appBarLayout, childWithScrollingBehavior, 0, i2, new int[]{0, 0}, 1);
                                    return true;
                                }
                            } else {
                                appBarLayout.setExpanded(true);
                                return true;
                            }
                        }
                        return false;
                    }
                    return super.performAccessibilityAction(view, i, bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View getChildWithScrollingBehavior(C18333 c18333) {
            int childCount = c18333.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c18333.getChildAt(i);
                if (((C14077) childAt.getLayoutParams()).m33687() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(AppBarLayout appBarLayout) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(appBarLayout);
            }
            WeakReference weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public void onFlingFinished(C18333 c18333, AppBarLayout appBarLayout) {
            snapToChildIfNeeded(c18333, appBarLayout);
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.setLiftedState(appBarLayout.shouldLift(findFirstScrollingChild(c18333)));
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getMaxDragOffset(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getScrollRangeForDragFling(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int setHeaderTopBottomOffset(C18333 c18333, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i4 = 0;
            if (i2 != 0 && topBottomOffsetForScrollingSibling >= i2 && topBottomOffsetForScrollingSibling <= i3) {
                int iM6036 = C1814.m6036(i, i2, i3);
                if (topBottomOffsetForScrollingSibling != iM6036) {
                    int iInterpolateOffset = appBarLayout.hasChildWithInterpolator() ? interpolateOffset(appBarLayout, iM6036) : iM6036;
                    boolean topAndBottomOffset = setTopAndBottomOffset(iInterpolateOffset);
                    int i5 = topBottomOffsetForScrollingSibling - iM6036;
                    this.offsetDelta = iM6036 - iInterpolateOffset;
                    if (topAndBottomOffset) {
                        while (i4 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) appBarLayout.getChildAt(i4).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(appBarLayout, appBarLayout.getChildAt(i4), getTopAndBottomOffset());
                            }
                            i4++;
                        }
                    }
                    if (!topAndBottomOffset && appBarLayout.hasChildWithInterpolator()) {
                        c18333.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.onOffsetChanged(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(c18333, appBarLayout, iM6036, iM6036 < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i4 = i5;
                }
            } else {
                this.offsetDelta = 0;
            }
            addAccessibilityDelegateIfNeeded(c18333, appBarLayout);
            return i4;
        }

        public boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        private int interpolateOffset(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (scrollInterpolator == null) {
                        break;
                    }
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            int i3 = C17648.f53953;
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    int i4 = C17648.f53953;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f = topInset;
                    return (childAt.getTop() + Math.round(scrollInterpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(i);
                }
            }
            return i;
        }

        private void updateAppBarLayoutDrawableState(C18333 c18333, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View appBarChildOnOffset = getAppBarChildOnOffset(appBarLayout, i);
            boolean zShouldLift = false;
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int i3 = C17648.f53953;
                    int minimumHeight = appBarChildOnOffset.getMinimumHeight();
                    if (i2 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i) < (appBarChildOnOffset.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i) >= (appBarChildOnOffset.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zShouldLift = true;
                    }
                }
            }
            if (appBarLayout.isLiftOnScroll()) {
                zShouldLift = appBarLayout.shouldLift(findFirstScrollingChild(c18333));
            }
            boolean liftedState = appBarLayout.setLiftedState(zShouldLift);
            if (z || (liftedState && shouldJumpElevationState(c18333, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (Build.VERSION.SDK_INT >= 23 && appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private boolean shouldJumpElevationState(C18333 c18333, AppBarLayout appBarLayout) {
            List dependents = c18333.getDependents(appBarLayout);
            int size = dependents.size();
            for (int i = 0; i < size; i++) {
                AbstractC6317 abstractC6317M33687 = ((C14077) ((View) dependents.get(i)).getLayoutParams()).m33687();
                if (abstractC6317M33687 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) abstractC6317M33687).getOverlayTop() != 0;
                }
            }
            return false;
        }

        public static View getAppBarChildOnOffset(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private View findFirstScrollingChild(C18333 c18333) {
            int childCount = c18333.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c18333.getChildAt(i);
                if ((childAt instanceof InterfaceC22795) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        @Override // l.AbstractC6317
        public Parcelable onSaveInstanceState(C18333 c18333, AppBarLayout appBarLayout) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(c18333, (View) appBarLayout);
            SavedState savedStateSaveScrollState = saveScrollState(parcelableOnSaveInstanceState, appBarLayout);
            return savedStateSaveScrollState == null ? parcelableOnSaveInstanceState : savedStateSaveScrollState;
        }

        @Override // l.AbstractC6317
        public void onRestoreInstanceState(C18333 c18333, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                restoreScrollState((SavedState) parcelable, true);
                super.onRestoreInstanceState(c18333, (View) appBarLayout, this.savedState.getSuperState());
            } else {
                super.onRestoreInstanceState(c18333, (View) appBarLayout, parcelable);
                this.savedState = null;
            }
        }

        public SavedState saveScrollState(Parcelable parcelable, AppBarLayout appBarLayout) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC7152.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = topAndBottomOffset == 0;
                    savedState.fullyExpanded = z;
                    savedState.fullyScrolled = !z && (-topAndBottomOffset) >= appBarLayout.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i;
                    int i2 = C17648.f53953;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void restoreScrollState(SavedState savedState, boolean z) {
            if (this.savedState == null || z) {
                this.savedState = savedState;
            }
        }

        /* JADX INFO: loaded from: classes.dex */
        public class SavedState extends AbstractC7152 {
            public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
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
            public boolean firstVisibleChildAtMinimumHeight;
            public int firstVisibleChildIndex;
            public float firstVisibleChildPercentageShown;
            public boolean fullyExpanded;
            public boolean fullyScrolled;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // l.AbstractC7152, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, l.AbstractC6317
        public /* bridge */ /* synthetic */ boolean onLayoutChild(C18333 c18333, View view, int i) {
            return super.onLayoutChild(c18333, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, l.AbstractC6317
        public /* bridge */ /* synthetic */ boolean onMeasureChild(C18333 c18333, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(c18333, view, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19343.f62072);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f62180, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // l.AbstractC6317
        public boolean layoutDependsOn(C18333 c18333, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // l.AbstractC6317
        public boolean onDependentViewChanged(C18333 c18333, View view, View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // l.AbstractC6317
        public void onDependentViewRemoved(C18333 c18333, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C17648.m41309(c18333, (C16445) null);
            }
        }

        @Override // l.AbstractC6317
        public boolean onRequestChildRectangleOnScreen(C18333 c18333, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutFindFirstDependency = findFirstDependency(c18333.getDependencies(view));
            if (appBarLayoutFindFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, c18333.getWidth(), c18333.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutFindFirstDependency.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        private void offsetChildAsNeeded(View view, View view2) {
            AbstractC6317 abstractC6317M33687 = ((C14077) view2.getLayoutParams()).m33687();
            if (abstractC6317M33687 instanceof BaseBehavior) {
                C17648.m41332((((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC6317M33687).offsetDelta) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2), view);
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float getOverlapRatioForOffset(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        public static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            AbstractC6317 abstractC6317M33687 = ((C14077) appBarLayout.getLayoutParams()).m33687();
            if (abstractC6317M33687 instanceof BaseBehavior) {
                return ((BaseBehavior) abstractC6317M33687).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public AppBarLayout findFirstDependency(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.getScrollRange(view);
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }
    }

    public class CompressChildScrollEffect extends ChildScrollEffect {
        public static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        public final Rect relativeRect = new Rect();
        public final Rect ghostRect = new Rect();

        public static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(AppBarLayout appBarLayout, View view, float f) {
            updateRelativeRect(this.relativeRect, appBarLayout, view);
            float fAbs = this.relativeRect.top - Math.abs(f);
            if (fAbs <= 0.0f) {
                float fM6035 = 1.0f - C1814.m6035(Math.abs(fAbs / this.relativeRect.height()), 0.0f, 1.0f);
                float fHeight = (-fAbs) - ((this.relativeRect.height() * 0.3f) * (1.0f - (fM6035 * fM6035)));
                view.setTranslationY(fHeight);
                view.getDrawingRect(this.ghostRect);
                this.ghostRect.offset(0, (int) (-fHeight));
                if (fHeight >= this.ghostRect.height()) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
                Rect rect = this.ghostRect;
                int i = C17648.f53953;
                view.setClipBounds(rect);
                return;
            }
            int i2 = C17648.f53953;
            view.setClipBounds(null);
            view.setTranslationY(0.0f);
            view.setVisibility(0);
        }
    }
}
