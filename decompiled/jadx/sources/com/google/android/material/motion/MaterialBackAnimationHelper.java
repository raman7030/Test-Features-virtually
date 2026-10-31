package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import l.C17931;
import l.C20118;
import l.C8020;

/* JADX INFO: loaded from: classes.dex */
public abstract class MaterialBackAnimationHelper {
    public static final int CANCEL_DURATION_DEFAULT = 100;
    public static final int HIDE_DURATION_MAX_DEFAULT = 300;
    public static final int HIDE_DURATION_MIN_DEFAULT = 150;
    public static final String TAG = "MaterialBackHelper";
    public C20118 backEvent;
    public final int cancelDuration;
    public final int hideDurationMax;
    public final int hideDurationMin;
    public final TimeInterpolator progressInterpolator;
    public final View view;

    public MaterialBackAnimationHelper(View view) {
        this.view = view;
        Context context = view.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, C17931.f55135, C8020.m21341(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, C17931.f54794, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, C17931.f55819, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, C17931.f55510, 100);
    }

    public float interpolateProgress(float f) {
        return this.progressInterpolator.getInterpolation(f);
    }

    public void onStartBackProgress(C20118 c20118) {
        this.backEvent = c20118;
    }

    public C20118 onUpdateBackProgress(C20118 c20118) {
        C20118 c20119 = this.backEvent;
        this.backEvent = c20118;
        return c20119;
    }

    public C20118 onHandleBackInvoked() {
        C20118 c20118 = this.backEvent;
        this.backEvent = null;
        return c20118;
    }

    public C20118 onCancelBackProgress() {
        C20118 c20118 = this.backEvent;
        this.backEvent = null;
        return c20118;
    }
}
