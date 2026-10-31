package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import l.C17931;
import l.C19444;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialFadeThrough extends MaterialVisibility {
    public static final float DEFAULT_START_SCALE = 0.92f;
    public static final int DEFAULT_THEMED_DURATION_ATTR = C17931.f55544;
    public static final int DEFAULT_THEMED_EASING_ATTR = C17931.f55271;

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility, l.AbstractC16620
    public /* bridge */ /* synthetic */ boolean isSeekingSupported() {
        return super.isSeekingSupported();
    }

    @Override // com.google.android.material.transition.MaterialVisibility, l.AbstractC2136
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c19445) {
        return super.onAppear(viewGroup, view, c19444, c19445);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, l.AbstractC2136
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c19445) {
        return super.onDisappear(viewGroup, view, c19444, c19445);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }

    public MaterialFadeThrough() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    public static FadeThroughProvider createPrimaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    public static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(0.92f);
        return scaleProvider;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }
}
