package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.List;
import l.AbstractC6317;
import l.C14077;
import l.C16519;
import l.C17648;
import l.C17931;
import l.C18333;
import l.C18637;
import l.C19343;
import l.C19370;
import l.InterfaceC10551;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements InterfaceC10551 {
    public static final int ANIM_STATE_HIDING = 1;
    public static final int ANIM_STATE_NONE = 0;
    public static final int ANIM_STATE_SHOWING = 2;
    public static final int DEF_STYLE_RES = C18637.f58295;
    public static final int EXTEND = 3;
    public static final int EXTEND_STRATEGY_AUTO = 0;
    public static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    public static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    public static final Property HEIGHT;
    public static final int HIDE = 1;
    public static final Property PADDING_END;
    public static final Property PADDING_START;
    public static final int SHOW = 0;
    public static final int SHRINK = 2;
    public static final Property WIDTH;
    public int animState;
    public boolean animateShowBeforeLayout;
    public final AbstractC6317 behavior;
    public final AnimatorTracker changeVisibilityTracker;
    public final int collapsedSize;
    public final MotionStrategy extendStrategy;
    public final int extendStrategyType;
    public int extendedPaddingEnd;
    public int extendedPaddingStart;
    public final MotionStrategy hideStrategy;
    public boolean isExtended;
    public boolean isTransforming;
    public int originalHeight;
    public ColorStateList originalTextCsl;
    public int originalWidth;
    public final MotionStrategy showStrategy;
    public final MotionStrategy shrinkStrategy;

    /* JADX INFO: loaded from: classes.dex */
    public abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        WIDTH = new Property(cls, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
            @Override // android.util.Property
            public void set(View view, Float f) {
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
            }

            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(view.getLayoutParams().width);
            }
        };
        HEIGHT = new Property(cls, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.7
            @Override // android.util.Property
            public void set(View view, Float f) {
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
            }

            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(view.getLayoutParams().height);
            }
        };
        PADDING_START = new Property(cls, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.8
            @Override // android.util.Property
            public void set(View view, Float f) {
                int iIntValue = f.intValue();
                int paddingTop = view.getPaddingTop();
                int i = C17648.f53953;
                view.setPaddingRelative(iIntValue, paddingTop, view.getPaddingEnd(), view.getPaddingBottom());
            }

            @Override // android.util.Property
            public Float get(View view) {
                int i = C17648.f53953;
                return Float.valueOf(view.getPaddingStart());
            }
        };
        PADDING_END = new Property(cls, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.9
            @Override // android.util.Property
            public void set(View view, Float f) {
                int i = C17648.f53953;
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
            }

            @Override // android.util.Property
            public Float get(View view) {
                int i = C17648.f53953;
                return Float.valueOf(view.getPaddingEnd());
            }
        };
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f55502);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.animState = 0;
        AnimatorTracker animatorTracker = new AnimatorTracker();
        this.changeVisibilityTracker = animatorTracker;
        ShowStrategy showStrategy = new ShowStrategy(animatorTracker);
        this.showStrategy = showStrategy;
        HideStrategy hideStrategy = new HideStrategy(animatorTracker);
        this.hideStrategy = hideStrategy;
        this.isExtended = true;
        this.isTransforming = false;
        this.animateShowBeforeLayout = false;
        Context context2 = getContext();
        this.behavior = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C19343.f62421, i, i2, new int[0]);
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C19343.f61250);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C19343.f60878);
        MotionSpec motionSpecCreateFromAttribute3 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C19343.f62262);
        MotionSpec motionSpecCreateFromAttribute4 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C19343.f60931);
        this.collapsedSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f61038, -1);
        int i3 = typedArrayObtainStyledAttributes.getInt(C19343.f62315, 1);
        this.extendStrategyType = i3;
        int i4 = C17648.f53953;
        this.extendedPaddingStart = getPaddingStart();
        this.extendedPaddingEnd = getPaddingEnd();
        AnimatorTracker animatorTracker2 = new AnimatorTracker();
        ChangeSizeStrategy changeSizeStrategy = new ChangeSizeStrategy(animatorTracker2, getSizeFromExtendStrategyType(i3), true);
        this.extendStrategy = changeSizeStrategy;
        ChangeSizeStrategy changeSizeStrategy2 = new ChangeSizeStrategy(animatorTracker2, new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(getWidth(), getHeight());
            }
        }, false);
        this.shrinkStrategy = changeSizeStrategy2;
        showStrategy.setMotionSpec(motionSpecCreateFromAttribute);
        hideStrategy.setMotionSpec(motionSpecCreateFromAttribute2);
        changeSizeStrategy.setMotionSpec(motionSpecCreateFromAttribute3);
        changeSizeStrategy2.setMotionSpec(motionSpecCreateFromAttribute4);
        typedArrayObtainStyledAttributes.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context2, attributeSet, i, i2, ShapeAppearanceModel.PILL).build());
        saveOriginalTextCsl();
    }

    private Size getSizeFromExtendStrategyType(int i) {
        final Size size = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.2
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.extendedPaddingStart + ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return ExtendedFloatingActionButton.this.getMeasuredHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.extendedPaddingStart;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(-2, -2);
            }
        };
        final Size size2 = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.3
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return size.getWidth();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.width == -2) {
                    return size.getWidth();
                }
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (ExtendedFloatingActionButton.this.originalHeight != -1) {
                    if (ExtendedFloatingActionButton.this.originalHeight != 0 && ExtendedFloatingActionButton.this.originalHeight != -2) {
                        return ExtendedFloatingActionButton.this.originalHeight;
                    }
                    return size.getHeight();
                }
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return size.getHeight();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.height == -2) {
                    return size.getHeight();
                }
                return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.extendedPaddingStart;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.originalHeight == 0 ? -2 : ExtendedFloatingActionButton.this.originalHeight);
            }
        };
        Size size3 = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                if (ExtendedFloatingActionButton.this.originalWidth != -1) {
                    if (ExtendedFloatingActionButton.this.originalWidth != 0 && ExtendedFloatingActionButton.this.originalWidth != -2) {
                        return ExtendedFloatingActionButton.this.originalWidth;
                    }
                    return size.getWidth();
                }
                return size2.getWidth();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                if (ExtendedFloatingActionButton.this.originalHeight != -1) {
                    if (ExtendedFloatingActionButton.this.originalHeight != 0 && ExtendedFloatingActionButton.this.originalHeight != -2) {
                        return ExtendedFloatingActionButton.this.originalHeight;
                    }
                    return size.getHeight();
                }
                return size2.getHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.extendedPaddingStart;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.originalWidth == 0 ? -2 : ExtendedFloatingActionButton.this.originalWidth, ExtendedFloatingActionButton.this.originalHeight != 0 ? ExtendedFloatingActionButton.this.originalHeight : -2);
            }
        };
        if (i != 1) {
            return i != 2 ? size3 : size2;
        }
        return size;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        saveOriginalTextCsl();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        saveOriginalTextCsl();
    }

    private void saveOriginalTextCsl() {
        this.originalTextCsl = getTextColors();
    }

    public void silentlyUpdateTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isExtended && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.isExtended = false;
            this.shrinkStrategy.performNow();
        }
    }

    @Override // l.InterfaceC10551
    public AbstractC6317 getBehavior() {
        return this.behavior;
    }

    public void setExtended(boolean z) {
        if (this.isExtended == z) {
            return;
        }
        MotionStrategy motionStrategy = z ? this.extendStrategy : this.shrinkStrategy;
        if (motionStrategy.shouldCancel()) {
            return;
        }
        motionStrategy.performNow();
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.animateShowBeforeLayout = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = i;
        this.extendedPaddingEnd = i3;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        int i5 = C17648.f53953;
        this.extendedPaddingStart = getPaddingStart();
        this.extendedPaddingEnd = getPaddingEnd();
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.showStrategy.addAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        this.showStrategy.removeAnimationListener(animatorListener);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.hideStrategy.addAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        this.hideStrategy.removeAnimationListener(animatorListener);
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.addAnimationListener(animatorListener);
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.removeAnimationListener(animatorListener);
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.extendStrategy.addAnimationListener(animatorListener);
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        this.extendStrategy.removeAnimationListener(animatorListener);
    }

    public void hide() {
        performMotion(1, null);
    }

    public void hide(OnChangedCallback onChangedCallback) {
        performMotion(1, onChangedCallback);
    }

    public void show() {
        performMotion(0, null);
    }

    public void show(OnChangedCallback onChangedCallback) {
        performMotion(0, onChangedCallback);
    }

    public void extend() {
        performMotion(3, null);
    }

    public void extend(OnChangedCallback onChangedCallback) {
        performMotion(3, onChangedCallback);
    }

    public void shrink() {
        performMotion(2, null);
    }

    public void shrink(OnChangedCallback onChangedCallback) {
        performMotion(2, onChangedCallback);
    }

    public MotionSpec getShowMotionSpec() {
        return this.showStrategy.getMotionSpec();
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        this.showStrategy.setMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public MotionSpec getHideMotionSpec() {
        return this.hideStrategy.getMotionSpec();
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        this.hideStrategy.setMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public MotionSpec getExtendMotionSpec() {
        return this.extendStrategy.getMotionSpec();
    }

    public void setExtendMotionSpec(MotionSpec motionSpec) {
        this.extendStrategy.setMotionSpec(motionSpec);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public MotionSpec getShrinkMotionSpec() {
        return this.shrinkStrategy.getMotionSpec();
    }

    public void setShrinkMotionSpec(MotionSpec motionSpec) {
        this.shrinkStrategy.setMotionSpec(motionSpec);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performMotion(int i, final OnChangedCallback onChangedCallback) {
        final MotionStrategy motionStrategy;
        if (i == 0) {
            motionStrategy = this.showStrategy;
        } else if (i == 1) {
            motionStrategy = this.hideStrategy;
        } else if (i == 2) {
            motionStrategy = this.shrinkStrategy;
        } else {
            if (i != 3) {
                throw new IllegalStateException(C19370.m44628(i, "Unknown strategy type: "));
            }
            motionStrategy = this.extendStrategy;
        }
        if (motionStrategy.shouldCancel()) {
            return;
        }
        if (!shouldAnimateVisibilityChange()) {
            motionStrategy.performNow();
            motionStrategy.onChange(onChangedCallback);
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.originalWidth = layoutParams.width;
                this.originalHeight = layoutParams.height;
            } else {
                this.originalWidth = getWidth();
                this.originalHeight = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetCreateAnimator = motionStrategy.createAnimator();
        animatorSetCreateAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
            public boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                motionStrategy.onAnimationStart(animator);
                this.cancelled = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.cancelled = true;
                motionStrategy.onAnimationCancel();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                motionStrategy.onAnimationEnd();
                if (this.cancelled) {
                    return;
                }
                motionStrategy.onChange(onChangedCallback);
            }
        });
        Iterator it = motionStrategy.getListeners().iterator();
        while (it.hasNext()) {
            animatorSetCreateAnimator.addListener((Animator.AnimatorListener) it.next());
        }
        animatorSetCreateAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeShown() {
        if (getVisibility() != 0) {
            return this.animState == 2;
        }
        return this.animState != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeHidden() {
        if (getVisibility() == 0) {
            return this.animState == 1;
        }
        return this.animState != 2;
    }

    private boolean shouldAnimateVisibilityChange() {
        int i = C17648.f53953;
        return (isLaidOut() || (!isOrWillBeShown() && this.animateShowBeforeLayout)) && !isInEditMode();
    }

    public int getCollapsedSize() {
        int i = this.collapsedSize;
        if (i >= 0) {
            return i;
        }
        int i2 = C17648.f53953;
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ExtendedFloatingActionButtonBehavior extends AbstractC6317 {
        public static final boolean AUTO_HIDE_DEFAULT = false;
        public static final boolean AUTO_SHRINK_DEFAULT = true;
        public boolean autoHideEnabled;
        public boolean autoShrinkEnabled;
        public OnChangedCallback internalAutoHideCallback;
        public OnChangedCallback internalAutoShrinkCallback;
        public Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
            this.autoHideEnabled = false;
            this.autoShrinkEnabled = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19343.f61568);
            this.autoHideEnabled = typedArrayObtainStyledAttributes.getBoolean(C19343.f61515, false);
            this.autoShrinkEnabled = typedArrayObtainStyledAttributes.getBoolean(C19343.f62047, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void setAutoHideEnabled(boolean z) {
            this.autoHideEnabled = z;
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        public void setAutoShrinkEnabled(boolean z) {
            this.autoShrinkEnabled = z;
        }

        public boolean isAutoShrinkEnabled() {
            return this.autoShrinkEnabled;
        }

        @Override // l.AbstractC6317
        public boolean getInsetDodgeRect(C18333 c18333, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(c18333, (View) extendedFloatingActionButton, rect);
        }

        @Override // l.AbstractC6317
        public void onAttachedToLayoutParams(C14077 c14077) {
            if (c14077.f42515 == 0) {
                c14077.f42515 = 80;
            }
        }

        @Override // l.AbstractC6317
        public boolean onDependentViewChanged(C18333 c18333, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(c18333, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton);
            return false;
        }

        public static boolean isBottomSheet(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C14077) {
                return ((C14077) layoutParams).m33687() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void setInternalAutoHideCallback(OnChangedCallback onChangedCallback) {
            this.internalAutoHideCallback = onChangedCallback;
        }

        public void setInternalAutoShrinkCallback(OnChangedCallback onChangedCallback) {
            this.internalAutoShrinkCallback = onChangedCallback;
        }

        private boolean shouldUpdateVisibility(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.autoHideEnabled || this.autoShrinkEnabled) && ((C14077) extendedFloatingActionButton.getLayoutParams()).m33685() == view.getId();
        }

        private boolean updateFabVisibilityForAppBarLayout(C18333 c18333, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(c18333, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        private boolean updateFabVisibilityForBottomSheet(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((C14077) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        public void shrinkOrHide(ExtendedFloatingActionButton extendedFloatingActionButton) {
            OnChangedCallback onChangedCallback;
            boolean z = this.autoShrinkEnabled;
            if (z) {
                onChangedCallback = this.internalAutoShrinkCallback;
            } else {
                onChangedCallback = this.internalAutoHideCallback;
            }
            extendedFloatingActionButton.performMotion(z ? 2 : 1, onChangedCallback);
        }

        public void extendOrShow(ExtendedFloatingActionButton extendedFloatingActionButton) {
            OnChangedCallback onChangedCallback;
            boolean z = this.autoShrinkEnabled;
            if (z) {
                onChangedCallback = this.internalAutoShrinkCallback;
            } else {
                onChangedCallback = this.internalAutoHideCallback;
            }
            extendedFloatingActionButton.performMotion(z ? 3 : 0, onChangedCallback);
        }

        @Override // l.AbstractC6317
        public boolean onLayoutChild(C18333 c18333, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List dependencies = c18333.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) dependencies.get(i2);
                if (view instanceof AppBarLayout) {
                    if (updateFabVisibilityForAppBarLayout(c18333, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            c18333.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ChangeSizeStrategy extends BaseMotionStrategy {
        public final boolean extending;
        public final Size size;

        public ChangeSizeStrategy(AnimatorTracker animatorTracker, Size size, boolean z) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.size = size;
            this.extending = z;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.isExtended = this.extending;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.extending) {
                ExtendedFloatingActionButton.this.originalWidth = layoutParams.width;
                ExtendedFloatingActionButton.this.originalHeight = layoutParams.height;
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int paddingStart = this.size.getPaddingStart();
            int paddingTop = ExtendedFloatingActionButton.this.getPaddingTop();
            int paddingEnd = this.size.getPaddingEnd();
            int paddingBottom = ExtendedFloatingActionButton.this.getPaddingBottom();
            int i = C17648.f53953;
            extendedFloatingActionButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            if (this.extending) {
                onChangedCallback.onExtended(ExtendedFloatingActionButton.this);
            } else {
                onChangedCallback.onShrunken(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            if (this.extending) {
                return C16519.f50775;
            }
            return C16519.f50761;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public AnimatorSet createAnimator() {
            MotionSpec currentMotionSpec = getCurrentMotionSpec();
            if (currentMotionSpec.hasPropertyValues("width")) {
                PropertyValuesHolder[] propertyValues = currentMotionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.size.getWidth());
                currentMotionSpec.setPropertyValues("width", propertyValues);
            }
            if (currentMotionSpec.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = currentMotionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.size.getHeight());
                currentMotionSpec.setPropertyValues("height", propertyValues2);
            }
            if (currentMotionSpec.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = currentMotionSpec.getPropertyValues("paddingStart");
                PropertyValuesHolder propertyValuesHolder = propertyValues3[0];
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                int i = C17648.f53953;
                propertyValuesHolder.setFloatValues(extendedFloatingActionButton.getPaddingStart(), this.size.getPaddingStart());
                currentMotionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (currentMotionSpec.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = currentMotionSpec.getPropertyValues("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = propertyValues4[0];
                ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                int i2 = C17648.f53953;
                propertyValuesHolder2.setFloatValues(extendedFloatingActionButton2.getPaddingEnd(), this.size.getPaddingEnd());
                currentMotionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (currentMotionSpec.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = currentMotionSpec.getPropertyValues("labelOpacity");
                boolean z = this.extending;
                propertyValues5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                currentMotionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.createAnimator(currentMotionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.isExtended = this.extending;
            ExtendedFloatingActionButton.this.isTransforming = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.isTransforming = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return this.extending == ExtendedFloatingActionButton.this.isExtended || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return C16519.f50771;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.animState = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.animState = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.isOrWillBeShown();
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class HideStrategy extends BaseMotionStrategy {
        public boolean isCancelled;

        public HideStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.isOrWillBeHidden();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return C16519.f50774;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.isCancelled = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.animState = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
            super.onAnimationCancel();
            this.isCancelled = true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.animState = 0;
            if (this.isCancelled) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }
    }
}
