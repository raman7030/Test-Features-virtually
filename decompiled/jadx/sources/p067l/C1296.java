package p067l;

import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.ۡ᩹ */
/* JADX INFO: compiled from: U5Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1296 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m25521(Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25522(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
