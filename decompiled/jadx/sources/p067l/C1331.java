package p067l;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: renamed from: l.ۢ᩹ */
/* JADX INFO: compiled from: U5Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1331 {
    /* JADX INFO: renamed from: ֫ */
    public static void m26942(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26944(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26943(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }
}
