package com.google.android.material.progressindicator;

import java.util.ArrayList;
import java.util.List;
import l.AbstractC18364;

/* JADX INFO: loaded from: classes.dex */
public abstract class IndeterminateAnimatorDelegate {
    public final List activeIndicators = new ArrayList();
    public IndeterminateDrawable drawable;

    public abstract void cancelAnimatorImmediately();

    public float getFractionInRange(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(AbstractC18364 abstractC18364);

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    public abstract void resetPropertiesForNewStart();

    public abstract void setAnimationFraction(float f);

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();

    public IndeterminateAnimatorDelegate(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.activeIndicators.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    public void registerDrawable(IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }
}
