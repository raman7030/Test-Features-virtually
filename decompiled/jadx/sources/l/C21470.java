package l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: l.᩸ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21470 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m48618(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C11233.m27805(activity, "activity");
        C11233.m27805(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
