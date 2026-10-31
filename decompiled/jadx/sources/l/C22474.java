package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: l.᩹ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C942 */
/* JADX INFO: loaded from: classes.dex */
public final class C22474 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50422(Context context, String str) {
        Intent intent;
        if (C3424.m10402()) {
            intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.setPackage("com.miui.securitycenter");
            intent.putExtra("extra_pkgname", str);
        } else if (C3424.m10401()) {
            intent = new Intent();
            intent.putExtra("packageName", context.getPackageName());
            intent.setClassName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity");
            if (context.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
                intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
            }
        } else if (C3424.m10403()) {
            intent = new Intent();
            intent.putExtra("packagename", context.getPackageName());
            intent.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
            if (context.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
                intent.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"));
            }
        } else if (C3424.m10398()) {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        } else if (!C3424.m10400() || Build.VERSION.SDK_INT >= 24) {
            intent = null;
        } else {
            intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.putExtra("packageName", context.getPackageName());
            intent.setComponent(new ComponentName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity"));
        }
        if (intent != null) {
            try {
                context.startActivity(intent);
                return;
            } catch (Exception unused) {
            }
        }
        ((InterfaceC13223) context).mo10220(str);
    }
}
