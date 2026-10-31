package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import l.C17931;
import l.C19370;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialSharedAxis extends MaterialVisibility {
    public static final int DEFAULT_THEMED_DURATION_ATTR = C17931.f55544;
    public static final int DEFAULT_THEMED_EASING_ATTR = C17931.f55271;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public final int axis;
    public final boolean forward;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }

    public MaterialSharedAxis(int i, boolean z) {
        super(createPrimaryAnimatorProvider(i, z), createSecondaryAnimatorProvider());
        this.axis = i;
        this.forward = z;
    }

    public int getAxis() {
        return this.axis;
    }

    public boolean isForward() {
        return this.forward;
    }

    public static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i, boolean z) {
        if (i == 0) {
            return new SlideDistanceProvider(z ? 8388613 : 8388611);
        }
        if (i == 1) {
            return new SlideDistanceProvider(z ? 80 : 48);
        }
        if (i == 2) {
            return new ScaleProvider(z);
        }
        throw new IllegalArgumentException(C19370.m44628(i, "Invalid axis: "));
    }

    public static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }
}
