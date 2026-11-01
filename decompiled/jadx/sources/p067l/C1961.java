package p067l;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: l.᩹᩹ */
/* JADX INFO: compiled from: X4NC */
/* JADX INFO: loaded from: classes.dex */
public final class C1961 {
    /* JADX INFO: renamed from: ۧ */
    public static AppOpsManager m52897(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m52895(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52896(Context context) {
        return context.getOpPackageName();
    }
}
