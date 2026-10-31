package l;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: renamed from: l.ۛۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 763R */
/* JADX INFO: loaded from: classes2.dex */
public final class C5947 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16676(Activity activity, EnumC22901 enumC22901) {
        C11233.m27805(enumC22901, "event");
        if (activity instanceof InterfaceC9476) {
            ((InterfaceC9476) activity).getLifecycle().m47438(enumC22901);
        } else if (activity instanceof InterfaceC23586) {
            AbstractC7379 lifecycle = ((InterfaceC23586) activity).getLifecycle();
            if (lifecycle instanceof C20765) {
                ((C20765) lifecycle).m47438(enumC22901);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16675(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C22880.f73798.getClass();
            C11592.m28483(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC13707(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
