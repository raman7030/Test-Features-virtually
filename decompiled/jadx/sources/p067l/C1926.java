package p067l;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: l.᩸᩹ */
/* JADX INFO: compiled from: X4NC */
/* JADX INFO: loaded from: classes.dex */
public final class C1926 {
    /* JADX INFO: renamed from: ֫ */
    public static String m51599(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m51598(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m51597(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m51600(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }
}
