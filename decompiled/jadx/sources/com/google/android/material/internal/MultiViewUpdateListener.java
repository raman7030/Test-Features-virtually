package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    public final Listener listener;
    public final View[] views;

    public interface Listener {
        void onAnimationUpdate(ValueAnimator valueAnimator, View view);
    }

    public MultiViewUpdateListener(Listener listener, View... viewArr) {
        this.listener = listener;
        this.views = viewArr;
    }

    public MultiViewUpdateListener(Listener listener, Collection collection) {
        this.listener = listener;
        this.views = (View[]) collection.toArray(new View[0]);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.views) {
            this.listener.onAnimationUpdate(valueAnimator, view);
        }
    }

    public static MultiViewUpdateListener alphaListener(View... viewArr) {
        return new MultiViewUpdateListener(new MultiViewUpdateListener$$ExternalSyntheticLambda3(), viewArr);
    }

    public static MultiViewUpdateListener alphaListener(Collection collection) {
        return new MultiViewUpdateListener(new MultiViewUpdateListener$$ExternalSyntheticLambda3(), collection);
    }

    public static void setAlpha(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static MultiViewUpdateListener scaleListener(View... viewArr) {
        return new MultiViewUpdateListener(new MultiViewUpdateListener$$ExternalSyntheticLambda1(), viewArr);
    }

    public static MultiViewUpdateListener scaleListener(Collection collection) {
        return new MultiViewUpdateListener(new MultiViewUpdateListener$$ExternalSyntheticLambda1(), collection);
    }

    public static void setScale(ValueAnimator valueAnimator, View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    public static MultiViewUpdateListener translationXListener(View... viewArr) {
        return new MultiViewUpdateListener(new MultiViewUpdateListener$$ExternalSyntheticLambda0(), viewArr);
    }

    public static MultiViewUpdateListener translationXListener(Collection collection) {
        return new MultiViewUpdateListener(new MultiViewUpdateListener$$ExternalSyntheticLambda0(), collection);
    }

    public static void setTranslationX(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static MultiViewUpdateListener translationYListener(View... viewArr) {
        return new MultiViewUpdateListener(new MultiViewUpdateListener$$ExternalSyntheticLambda2(), viewArr);
    }

    public static MultiViewUpdateListener translationYListener(Collection collection) {
        return new MultiViewUpdateListener(new MultiViewUpdateListener$$ExternalSyntheticLambda2(), collection);
    }

    public static void setTranslationY(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
