package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import p067l.C10723;
import p067l.C1717;
import p067l.C1840;
import p067l.C24774;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper {
    public final float maxScaleXDistanceGrow;
    public final float maxScaleXDistanceShrink;
    public final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(C24774.f78636);
        this.maxScaleXDistanceGrow = resources.getDimension(C24774.f79202);
        this.maxScaleYDistance = resources.getDimension(C24774.f79109);
    }

    public void startBackProgress(C1840 c1840) {
        super.onStartBackProgress(c1840);
    }

    public void updateBackProgress(C1840 c1840, int i) {
        if (super.onUpdateBackProgress(c1840) == null) {
            return;
        }
        updateBackProgress(c1840.m48687(), c1840.m48688() == 0, i);
    }

    public void updateBackProgress(float f, boolean z, int i) {
        float width;
        float fInterpolateProgress = interpolateProgress(f);
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i, 3);
        boolean z2 = z == zCheckAbsoluteGravity;
        int width2 = this.view.getWidth();
        int height = this.view.getHeight();
        float f2 = width2;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.maxScaleXDistanceShrink / f2;
            float f5 = this.maxScaleXDistanceGrow / f2;
            float f6 = this.maxScaleYDistance / f3;
            View view = this.view;
            if (zCheckAbsoluteGravity) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z2) {
                f5 = -f4;
            }
            float fLerp = AnimationUtils.lerp(0.0f, f5, fInterpolateProgress);
            float f7 = fLerp + 1.0f;
            this.view.setScaleX(f7);
            float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f6, fInterpolateProgress);
            this.view.setScaleY(fLerp2);
            View view2 = this.view;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (zCheckAbsoluteGravity) {
                        width = childAt.getWidth() + (width2 - childAt.getRight());
                    } else {
                        width = -childAt.getLeft();
                    }
                    childAt.setPivotX(width);
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z2 ? 1.0f - fLerp : 1.0f;
                    float f9 = fLerp2 != 0.0f ? (f7 / fLerp2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }

    public void finishBackProgress(C1840 c1840, final int i, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z = c1840.m48688() == 0;
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i, 3);
        float scaleX = (this.view.getScaleX() * this.view.getWidth()) + getEdgeMargin(zCheckAbsoluteGravity);
        View view = this.view;
        Property property = View.TRANSLATION_X;
        if (zCheckAbsoluteGravity) {
            scaleX = -scaleX;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, scaleX);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C10723());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, c1840.m48687()));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z, i);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.view;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    private boolean checkAbsoluteGravity(int i, int i2) {
        View view = this.view;
        int i3 = C1717.f57146;
        return (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & i2) == i2;
    }

    private int getEdgeMargin(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }
}
