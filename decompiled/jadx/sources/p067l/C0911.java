package p067l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: l.֨᩹ */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes2.dex */
public final class C0911 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ֫ */
    public Object f7810;

    /* JADX INFO: renamed from: ۧ */
    public Activity f7811;

    /* JADX INFO: renamed from: ᩳ */
    public final int f7815;

    /* JADX INFO: renamed from: ܿ */
    public boolean f7814 = false;

    /* JADX INFO: renamed from: ܽ */
    public boolean f7813 = false;

    /* JADX INFO: renamed from: ܳ */
    public boolean f7812 = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public C0911(Activity activity) {
        this.f7811 = activity;
        this.f7815 = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f7811 == activity) {
            this.f7814 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f7813 || this.f7812 || this.f7814 || !C1261.m24106(this.f7810, this.f7815, activity)) {
            return;
        }
        this.f7812 = true;
        this.f7810 = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f7811 == activity) {
            this.f7811 = null;
            this.f7813 = true;
        }
    }
}
