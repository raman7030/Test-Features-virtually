package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ExpandCollapseAnimationHelper {
    public ValueAnimator.AnimatorUpdateListener additionalUpdateListener;
    public final View collapsedView;
    public int collapsedViewOffsetY;
    public long duration;
    public final View expandedView;
    public int expandedViewOffsetY;
    public final List listeners = new ArrayList();
    public final List endAnchoredViews = new ArrayList();

    public ExpandCollapseAnimationHelper(View view, View view2) {
        this.collapsedView = view;
        this.expandedView = view2;
    }

    public Animator getExpandAnimator() {
        AnimatorSet animatorSet = getAnimatorSet(true);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ExpandCollapseAnimationHelper.this.expandedView.setVisibility(0);
            }
        });
        addListeners(animatorSet, this.listeners);
        return animatorSet;
    }

    public Animator getCollapseAnimator() {
        AnimatorSet animatorSet = getAnimatorSet(false);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ExpandCollapseAnimationHelper.this.expandedView.setVisibility(8);
            }
        });
        addListeners(animatorSet, this.listeners);
        return animatorSet;
    }

    public ExpandCollapseAnimationHelper setDuration(long j) {
        this.duration = j;
        return this;
    }

    public ExpandCollapseAnimationHelper addListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.listeners.add(animatorListenerAdapter);
        return this;
    }

    public ExpandCollapseAnimationHelper addEndAnchoredViews(View... viewArr) {
        Collections.addAll(this.endAnchoredViews, viewArr);
        return this;
    }

    public ExpandCollapseAnimationHelper addEndAnchoredViews(Collection collection) {
        this.endAnchoredViews.addAll(collection);
        return this;
    }

    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.additionalUpdateListener = animatorUpdateListener;
        return this;
    }

    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int i) {
        this.collapsedViewOffsetY = i;
        return this;
    }

    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int i) {
        this.expandedViewOffsetY = i;
        return this;
    }

    private AnimatorSet getAnimatorSet(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getExpandCollapseAnimator(z), getExpandedViewChildrenAlphaAnimator(z), getEndAnchoredViewsTranslateAnimator(z));
        return animatorSet;
    }

    private Animator getExpandCollapseAnimator(boolean z) {
        Rect rectCalculateRectFromBounds = ViewUtils.calculateRectFromBounds(this.collapsedView, this.collapsedViewOffsetY);
        Rect rectCalculateRectFromBounds2 = ViewUtils.calculateRectFromBounds(this.expandedView, this.expandedViewOffsetY);
        final Rect rect = new Rect(rectCalculateRectFromBounds);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect), rectCalculateRectFromBounds, rectCalculateRectFromBounds2);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$getExpandCollapseAnimator$0(rect, valueAnimator);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.additionalUpdateListener;
        if (animatorUpdateListener != null) {
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        }
        valueAnimatorOfObject.setDuration(this.duration);
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return valueAnimatorOfObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getExpandCollapseAnimator$0(Rect rect, ValueAnimator valueAnimator) {
        ViewUtils.setBoundsFromRect(this.expandedView, rect);
    }

    private Animator getExpandedViewChildrenAlphaAnimator(boolean z) {
        List children = ViewUtils.getChildren(this.expandedView);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(children));
        valueAnimatorOfFloat.setDuration(this.duration);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.LINEAR_INTERPOLATOR));
        return valueAnimatorOfFloat;
    }

    private Animator getEndAnchoredViewsTranslateAnimator(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.collapsedView.getRight() - this.expandedView.getRight()) + (this.expandedView.getLeft() - this.collapsedView.getLeft()), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(this.endAnchoredViews));
        valueAnimatorOfFloat.setDuration(this.duration);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return valueAnimatorOfFloat;
    }

    private void addListeners(Animator animator, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            animator.addListener((AnimatorListenerAdapter) it.next());
        }
    }
}
