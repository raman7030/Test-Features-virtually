package l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩺ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 763R */
/* JADX INFO: loaded from: classes.dex */
public final class C22880 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C11592 f73798 = new C11592();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m50976(Activity activity) {
        f73798.getClass();
        C11592.m28483(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C11233.m27805(activity, "activity");
        C11233.m27805(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        C11233.m27805(activity, "activity");
        int i = FragmentC13707.f40903;
        C5947.m16676(activity, EnumC22901.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        C11233.m27805(activity, "activity");
        int i = FragmentC13707.f40903;
        C5947.m16676(activity, EnumC22901.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C11233.m27805(activity, "activity");
        int i = FragmentC13707.f40903;
        C5947.m16676(activity, EnumC22901.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        C11233.m27805(activity, "activity");
        int i = FragmentC13707.f40903;
        C5947.m16676(activity, EnumC22901.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        C11233.m27805(activity, "activity");
        int i = FragmentC13707.f40903;
        C5947.m16676(activity, EnumC22901.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        C11233.m27805(activity, "activity");
        int i = FragmentC13707.f40903;
        C5947.m16676(activity, EnumC22901.ON_STOP);
    }
}
