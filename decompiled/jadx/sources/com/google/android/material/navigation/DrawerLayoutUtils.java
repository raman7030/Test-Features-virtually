package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import l.C13064;
import l.C7191;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayoutUtils {
    public static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int DEFAULT_SCRIM_ALPHA = Color.alpha(DEFAULT_SCRIM_COLOR);

    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(final C13064 c13064) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.DrawerLayoutUtils$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0(c13064, valueAnimator);
            }
        };
    }

    public static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(C13064 c13064, ValueAnimator valueAnimator) {
        c13064.m31660(C7191.m19276(DEFAULT_SCRIM_COLOR, AnimationUtils.lerp(DEFAULT_SCRIM_ALPHA, 0, valueAnimator.getAnimatedFraction())));
    }

    public static Animator.AnimatorListener getScrimCloseAnimatorListener(final C13064 c13064, final View view) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                c13064.m31649(view, false);
                c13064.m31660(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
            }
        };
    }
}
