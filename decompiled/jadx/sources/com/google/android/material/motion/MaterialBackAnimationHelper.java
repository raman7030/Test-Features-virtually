package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import p067l.C1240;
import p067l.C1840;
import p067l.C19410;

/* JADX INFO: loaded from: classes.dex */
public abstract class MaterialBackAnimationHelper {
    public static final int CANCEL_DURATION_DEFAULT = 100;
    public static final int HIDE_DURATION_MAX_DEFAULT = 300;
    public static final int HIDE_DURATION_MIN_DEFAULT = 150;
    public static final String TAG = "MaterialBackHelper";
    public C1840 backEvent;
    public final int cancelDuration;
    public final int hideDurationMax;
    public final int hideDurationMin;
    public final TimeInterpolator progressInterpolator;
    public final View view;

    public MaterialBackAnimationHelper(View view) {
        this.view = view;
        Context context = view.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, C19410.f58332, C1240.m23307(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, C19410.f57991, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, C19410.f59016, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, C19410.f58707, 100);
    }

    public float interpolateProgress(float f) {
        return this.progressInterpolator.getInterpolation(f);
    }

    public void onStartBackProgress(C1840 c1840) {
        this.backEvent = c1840;
    }

    public C1840 onUpdateBackProgress(C1840 c1840) {
        C1840 c1841 = this.backEvent;
        this.backEvent = c1840;
        return c1841;
    }

    public C1840 onHandleBackInvoked() {
        C1840 c1840 = this.backEvent;
        this.backEvent = null;
        return c1840;
    }

    public C1840 onCancelBackProgress() {
        C1840 c1840 = this.backEvent;
        this.backEvent = null;
        return c1840;
    }
}
