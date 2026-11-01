package p067l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: l.ۙᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G54L */
/* JADX INFO: loaded from: classes2.dex */
public final class C6964 {
    /* JADX INFO: renamed from: ֫ */
    public static void m15959(Context context) throws Throwable {
        int i;
        String strM12434 = C5623.m12434("ro.miui.ui.version.name");
        if (strM12434 != null) {
            try {
                i = Integer.parseInt(strM12434.substring(1));
            } catch (Exception e) {
                C6112.m13907(e);
                i = -1;
            }
        } else {
            i = -1;
        }
        if (i == 5) {
            String packageName = context.getPackageName();
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", packageName, null));
            intent.setFlags(268435456);
            if (!m15960(context, intent)) {
                throw new RuntimeException("intent is not available!");
            }
            context.startActivity(intent);
            return;
        }
        if (i == 6) {
            Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent2.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent2.putExtra("extra_pkgname", context.getPackageName());
            intent2.setFlags(268435456);
            if (!m15960(context, intent2)) {
                throw new RuntimeException("intent is not available!");
            }
            context.startActivity(intent2);
            return;
        }
        if (i == 7) {
            Intent intent3 = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent3.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent3.putExtra("extra_pkgname", context.getPackageName());
            intent3.setFlags(268435456);
            if (!m15960(context, intent3)) {
                throw new RuntimeException("intent is not available!");
            }
            context.startActivity(intent3);
            return;
        }
        if (i != 8) {
            throw new IllegalStateException(C20778.m46922(i, "Unsupported MIUI version: "));
        }
        Intent intent4 = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent4.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
        intent4.putExtra("extra_pkgname", context.getPackageName());
        intent4.setFlags(268435456);
        if (m15960(context, intent4)) {
            context.startActivity(intent4);
            return;
        }
        Intent intent5 = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent5.setPackage("com.miui.securitycenter");
        intent5.putExtra("extra_pkgname", context.getPackageName());
        intent5.setFlags(268435456);
        if (!m15960(context, intent5)) {
            throw new RuntimeException("intent is not available!");
        }
        context.startActivity(intent5);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15960(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
