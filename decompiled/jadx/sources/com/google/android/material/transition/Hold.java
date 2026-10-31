package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import l.AbstractC2136;
import l.C19444;

/* JADX INFO: loaded from: classes.dex */
public final class Hold extends AbstractC2136 {
    @Override // l.AbstractC2136
    public Animator onAppear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c19445) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // l.AbstractC2136
    public Animator onDisappear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c19445) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
