package p067l;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: l.᩶᩹ */
/* JADX INFO: compiled from: X4NC */
/* JADX INFO: loaded from: classes4.dex */
public final class C1856 {
    /* JADX INFO: renamed from: ֫ */
    public static String m49171(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1926.m51599(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m49169(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1926.m51600((AppOpsManager) C1926.m51598(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m49170(Context context, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManagerM52897 = C1961.m52897(context);
            int iM52895 = C1961.m52895(appOpsManagerM52897, str, Binder.getCallingUid(), str2);
            return iM52895 != 0 ? iM52895 : C1961.m52895(appOpsManagerM52897, str, i, C1961.m52896(context));
        }
        return m49169(context, str, str2);
    }
}
