package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import l.C19444;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialElevationScale extends MaterialVisibility {
    public static final float DEFAULT_SCALE = 0.85f;
    public final boolean growing;

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

    public MaterialElevationScale(boolean z) {
        super(createPrimaryAnimatorProvider(z), createSecondaryAnimatorProvider());
        this.growing = z;
    }

    public boolean isGrowing() {
        return this.growing;
    }

    public static ScaleProvider createPrimaryAnimatorProvider(boolean z) {
        ScaleProvider scaleProvider = new ScaleProvider(z);
        scaleProvider.setOutgoingEndScale(0.85f);
        scaleProvider.setIncomingStartScale(0.85f);
        return scaleProvider;
    }

    public static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeProvider();
    }
}
