package p067l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩺ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 763R */
/* JADX INFO: loaded from: classes.dex */
public final class C24113 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ֫ */
    public static final C13385 f76529 = new C13385();

    /* JADX INFO: renamed from: ֫ */
    public static final void m53366(Activity activity) {
        f76529.getClass();
        C13385.m30529(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C13045.m29867(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C13045.m29867(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C13045.m29867(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C13045.m29867(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C13045.m29867(activity, "activity");
        C13045.m29867(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C13045.m29867(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C13045.m29867(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        C13045.m29867(activity, "activity");
        int i = FragmentC15395.f43984;
        C8020.m18602(activity, EnumC24133.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        C13045.m29867(activity, "activity");
        int i = FragmentC15395.f43984;
        C8020.m18602(activity, EnumC24133.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C13045.m29867(activity, "activity");
        int i = FragmentC15395.f43984;
        C8020.m18602(activity, EnumC24133.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        C13045.m29867(activity, "activity");
        int i = FragmentC15395.f43984;
        C8020.m18602(activity, EnumC24133.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        C13045.m29867(activity, "activity");
        int i = FragmentC15395.f43984;
        C8020.m18602(activity, EnumC24133.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        C13045.m29867(activity, "activity");
        int i = FragmentC15395.f43984;
        C8020.m18602(activity, EnumC24133.ON_STOP);
    }
}
