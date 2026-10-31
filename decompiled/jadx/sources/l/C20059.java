package l;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩶ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20059 extends C22196 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3125 f64977;

    public C20059(C3125 c3125) {
        this.f64977 = c3125;
    }

    @Override // l.C22196, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C11233.m27805(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC13707.f40903;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C11233.m27800((Object) fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC13707) fragmentFindFragmentByTag).m32958(this.f64977.f9766);
        }
    }

    @Override // l.C22196, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C11233.m27805(activity, "activity");
        this.f64977.m9509();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C11233.m27805(activity, "activity");
        C21470.m48618(activity, new C22175(this.f64977));
    }

    @Override // l.C22196, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C11233.m27805(activity, "activity");
        this.f64977.m9513();
    }
}
