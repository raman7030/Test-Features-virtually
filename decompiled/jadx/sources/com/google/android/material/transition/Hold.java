package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import p067l.AbstractC4399;
import p067l.C20848;

/* JADX INFO: loaded from: classes.dex */
public final class Hold extends AbstractC4399 {
    @Override // p067l.AbstractC4399
    public Animator onAppear(ViewGroup viewGroup, View view, C20848 c20848, C20848 c20849) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // p067l.AbstractC4399
    public Animator onDisappear(ViewGroup viewGroup, View view, C20848 c20848, C20848 c20849) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
