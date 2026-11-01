package p067l;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩶ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21432 extends C23463 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C5338 f67618;

    public C21432(C5338 c5338) {
        this.f67618 = c5338;
    }

    @Override // p067l.C23463, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C13045.m29867(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC15395.f43984;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C13045.m29862((Object) fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC15395) fragmentFindFragmentByTag).m35072(this.f67618.f12569);
        }
    }

    @Override // p067l.C23463, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C13045.m29867(activity, "activity");
        this.f67618.m11552();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C13045.m29867(activity, "activity");
        C22773.m50955(activity, new C23443(this.f67618));
    }

    @Override // p067l.C23463, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C13045.m29867(activity, "activity");
        this.f67618.m11556();
    }
}
