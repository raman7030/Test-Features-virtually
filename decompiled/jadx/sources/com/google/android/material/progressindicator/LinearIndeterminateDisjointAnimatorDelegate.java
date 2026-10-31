package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.Iterator;
import l.AbstractC18364;
import l.C10876;
import l.C1814;

/* JADX INFO: loaded from: classes.dex */
public final class LinearIndeterminateDisjointAnimatorDelegate extends IndeterminateAnimatorDelegate {
    public static final int TOTAL_DURATION_IN_MS = 1800;
    public float animationFraction;
    public ObjectAnimator animator;
    public AbstractC18364 animatorCompleteCallback;
    public final BaseProgressIndicatorSpec baseSpec;
    public ObjectAnimator completeEndAnimator;
    public boolean dirtyColors;
    public int indicatorColorIndex;
    public final Interpolator[] interpolatorArray;
    public static final int[] DURATION_TO_MOVE_SEGMENT_ENDS = {533, 567, 850, 750};
    public static final int[] DELAY_TO_MOVE_SEGMENT_ENDS = {1267, 1000, 333, 0};
    public static final Property ANIMATION_FRACTION = new Property(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.3
        @Override // android.util.Property
        public Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f) {
            linearIndeterminateDisjointAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    };

    public LinearIndeterminateDisjointAnimatorDelegate(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.indicatorColorIndex = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = linearProgressIndicatorSpec;
        this.interpolatorArray = new Interpolator[]{AnimationUtils.loadInterpolator(context, C10876.f32676), AnimationUtils.loadInterpolator(context, C10876.f32687), AnimationUtils.loadInterpolator(context, C10876.f32708), AnimationUtils.loadInterpolator(context, C10876.f32690)};
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateDisjointAnimatorDelegate, Float>) ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex = (linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex + 1) % LinearIndeterminateDisjointAnimatorDelegate.this.baseSpec.indicatorColors.length;
                    LinearIndeterminateDisjointAnimatorDelegate.this.dirtyColors = true;
                }
            });
        }
        if (this.completeEndAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<LinearIndeterminateDisjointAnimatorDelegate, Float>) ANIMATION_FRACTION, 1.0f);
            this.completeEndAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.completeEndAnimator.setInterpolator(null);
            this.completeEndAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LinearIndeterminateDisjointAnimatorDelegate.this.cancelAnimatorImmediately();
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    AbstractC18364 abstractC18364 = linearIndeterminateDisjointAnimatorDelegate.animatorCompleteCallback;
                    if (abstractC18364 != null) {
                        abstractC18364.onAnimationEnd(linearIndeterminateDisjointAnimatorDelegate.drawable);
                    }
                }
            });
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.completeEndAnimator;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        cancelAnimatorImmediately();
        if (this.drawable.isVisible()) {
            this.completeEndAnimator.setFloatValues(this.animationFraction, 1.0f);
            this.completeEndAnimator.setDuration((long) ((1.0f - this.animationFraction) * 1800.0f));
            this.completeEndAnimator.start();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(AbstractC18364 abstractC18364) {
        this.animatorCompleteCallback = abstractC18364;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.animatorCompleteCallback = null;
    }

    private void updateSegmentPositions(int i) {
        for (int i2 = 0; i2 < this.activeIndicators.size(); i2++) {
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) this.activeIndicators.get(i2);
            int[] iArr = DELAY_TO_MOVE_SEGMENT_ENDS;
            int i3 = i2 * 2;
            int i4 = iArr[i3];
            int[] iArr2 = DURATION_TO_MOVE_SEGMENT_ENDS;
            activeIndicator.startFraction = C1814.m6035(this.interpolatorArray[i3].getInterpolation(getFractionInRange(i, i4, iArr2[i3])), 0.0f, 1.0f);
            int i5 = i3 + 1;
            activeIndicator.endFraction = C1814.m6035(this.interpolatorArray[i5].getInterpolation(getFractionInRange(i, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
        }
    }

    private void maybeUpdateSegmentColors() {
        if (this.dirtyColors) {
            Iterator it = this.activeIndicators.iterator();
            while (it.hasNext()) {
                ((DrawingDelegate.ActiveIndicator) it.next()).color = this.baseSpec.indicatorColors[this.indicatorColorIndex];
            }
            this.dirtyColors = false;
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void resetPropertiesForNewStart() {
        this.indicatorColorIndex = 0;
        Iterator it = this.activeIndicators.iterator();
        while (it.hasNext()) {
            ((DrawingDelegate.ActiveIndicator) it.next()).color = this.baseSpec.indicatorColors[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void setAnimationFraction(float f) {
        this.animationFraction = f;
        updateSegmentPositions((int) (f * 1800.0f));
        maybeUpdateSegmentColors();
        this.drawable.invalidateSelf();
    }
}
