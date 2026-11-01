package p067l;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: renamed from: l.ۛۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 763R */
/* JADX INFO: loaded from: classes2.dex */
public final class C8020 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m18602(Activity activity, EnumC24133 enumC24133) {
        C13045.m29867(enumC24133, "event");
        if (activity instanceof InterfaceC11374) {
            ((InterfaceC11374) activity).getLifecycle().m49766(enumC24133);
        } else if (activity instanceof InterfaceC24784) {
            AbstractC9381 lifecycle = ((InterfaceC24784) activity).getLifecycle();
            if (lifecycle instanceof C22103) {
                ((C22103) lifecycle).m49766(enumC24133);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18601(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C24113.f76529.getClass();
            C13385.m30529(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC15395(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
