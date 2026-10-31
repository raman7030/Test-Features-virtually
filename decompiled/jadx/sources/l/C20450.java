package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: l.᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20450 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46848(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C21861.m49248(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46846(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C21861.m49249((AppOpsManager) C21861.m49247(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46847(Context context, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManagerM50555 = C22566.m50555(context);
            int iM50553 = C22566.m50553(appOpsManagerM50555, str, Binder.getCallingUid(), str2);
            return iM50553 != 0 ? iM50553 : C22566.m50553(appOpsManagerM50555, str, i, C22566.m50554(context));
        }
        return m46846(context, str, str2);
    }
}
