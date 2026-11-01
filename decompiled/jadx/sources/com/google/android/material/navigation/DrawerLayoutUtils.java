package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import p067l.C1199;
import p067l.C14784;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayoutUtils {
    public static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int DEFAULT_SCRIM_ALPHA = Color.alpha(DEFAULT_SCRIM_COLOR);

    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(final C14784 c14784) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.DrawerLayoutUtils$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0(c14784, valueAnimator);
            }
        };
    }

    public static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(C14784 c14784, ValueAnimator valueAnimator) {
        c14784.m33747(C1199.m21223(DEFAULT_SCRIM_COLOR, AnimationUtils.lerp(DEFAULT_SCRIM_ALPHA, 0, valueAnimator.getAnimatedFraction())));
    }

    public static Animator.AnimatorListener getScrimCloseAnimatorListener(final C14784 c14784, final View view) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                c14784.m33736(view, false);
                c14784.m33747(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
            }
        };
    }
}
