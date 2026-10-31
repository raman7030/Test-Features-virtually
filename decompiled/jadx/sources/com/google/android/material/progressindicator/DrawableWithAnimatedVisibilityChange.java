package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.AbstractC18364;

/* JADX INFO: loaded from: classes.dex */
public abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable {
    public static final boolean DEFAULT_DRAWABLE_RESTART = false;
    public static final int GROW_DURATION = 500;
    public static final Property GROW_FRACTION = new Property(Float.class, "growFraction") { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
        @Override // android.util.Property
        public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.getGrowFraction());
        }

        @Override // android.util.Property
        public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f) {
            drawableWithAnimatedVisibilityChange.setGrowFraction(f.floatValue());
        }
    };
    public List animationCallbacks;
    public final BaseProgressIndicatorSpec baseSpec;
    public final Context context;
    public float growFraction;
    public ValueAnimator hideAnimator;
    public boolean ignoreCallbacks;
    public AbstractC18364 internalAnimationCallback;
    public float mockGrowFraction;
    public boolean mockHideAnimationRunning;
    public boolean mockShowAnimationRunning;
    public ValueAnimator showAnimator;
    public int totalAlpha;
    public final Paint paint = new Paint();
    public AnimatorDurationScaleProvider animatorDurationScaleProvider = new AnimatorDurationScaleProvider();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public DrawableWithAnimatedVisibilityChange(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.context = context;
        this.baseSpec = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    private void maybeInitializeAnimators() {
        if (this.showAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) GROW_FRACTION, 0.0f, 1.0f);
            this.showAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.showAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setShowAnimator(this.showAnimator);
        }
        if (this.hideAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) GROW_FRACTION, 1.0f, 0.0f);
            this.hideAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.hideAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setHideAnimator(this.hideAnimator);
        }
    }

    public void registerAnimationCallback(AbstractC18364 abstractC18364) {
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new ArrayList();
        }
        if (this.animationCallbacks.contains(abstractC18364)) {
            return;
        }
        this.animationCallbacks.add(abstractC18364);
    }

    public boolean unregisterAnimationCallback(AbstractC18364 abstractC18364) {
        List list = this.animationCallbacks;
        if (list == null || !list.contains(abstractC18364)) {
            return false;
        }
        this.animationCallbacks.remove(abstractC18364);
        if (!this.animationCallbacks.isEmpty()) {
            return true;
        }
        this.animationCallbacks = null;
        return true;
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    public void setInternalAnimationCallback(AbstractC18364 abstractC18364) {
        this.internalAnimationCallback = abstractC18364;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        AbstractC18364 abstractC18364 = this.internalAnimationCallback;
        if (abstractC18364 != null) {
            abstractC18364.onAnimationStart(this);
        }
        List list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC18364) it.next()).onAnimationStart(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        AbstractC18364 abstractC18364 = this.internalAnimationCallback;
        if (abstractC18364 != null) {
            abstractC18364.onAnimationEnd(this);
        }
        List list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC18364) it.next()).onAnimationEnd(this);
        }
    }

    public void start() {
        setVisibleInternal(true, true, false);
    }

    public void stop() {
        setVisibleInternal(false, true, false);
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.showAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockShowAnimationRunning;
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.hideAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockHideAnimationRunning;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, true);
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
        return setVisibleInternal(z, z2, z3 && this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) > 0.0f);
    }

    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        maybeInitializeAnimators();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.showAnimator : this.hideAnimator;
        ValueAnimator valueAnimator2 = z ? this.hideAnimator : this.showAnimator;
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                cancelAnimatorsWithoutCallbacks(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                endAnimatorsWithoutCallbacks(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(z, false);
        if (!(z ? this.baseSpec.isShowAnimationEnabled() : this.baseSpec.isHideAnimationEnabled())) {
            endAnimatorsWithoutCallbacks(valueAnimator);
            return z4;
        }
        if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z4;
        }
        valueAnimator.resume();
        return z4;
    }

    private void cancelAnimatorsWithoutCallbacks(ValueAnimator... valueAnimatorArr) {
        boolean z = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.ignoreCallbacks = z;
    }

    private void endAnimatorsWithoutCallbacks(ValueAnimator... valueAnimatorArr) {
        boolean z = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.ignoreCallbacks = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.totalAlpha = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.totalAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private void setShowAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.showAnimator = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DrawableWithAnimatedVisibilityChange.this.dispatchAnimationStart();
            }
        });
    }

    public ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    private void setHideAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.hideAnimator = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                DrawableWithAnimatedVisibilityChange.this.dispatchAnimationEnd();
            }
        });
    }

    public float getGrowFraction() {
        if (!this.baseSpec.isShowAnimationEnabled() && !this.baseSpec.isHideAnimationEnabled()) {
            return 1.0f;
        }
        if (this.mockHideAnimationRunning || this.mockShowAnimationRunning) {
            return this.mockGrowFraction;
        }
        return this.growFraction;
    }

    public void setGrowFraction(float f) {
        if (this.growFraction != f) {
            this.growFraction = f;
            invalidateSelf();
        }
    }

    public void setMockShowAnimationRunning(boolean z, float f) {
        this.mockShowAnimationRunning = z;
        this.mockGrowFraction = f;
    }

    public void setMockHideAnimationRunning(boolean z, float f) {
        this.mockHideAnimationRunning = z;
        this.mockGrowFraction = f;
    }
}
