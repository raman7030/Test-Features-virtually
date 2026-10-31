package l;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: l.᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NC */
/* JADX INFO: loaded from: classes.dex */
public final class C21861 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49248(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m49247(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49246(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m49249(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }
}
