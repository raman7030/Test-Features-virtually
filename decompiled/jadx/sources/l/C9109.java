package l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.ۡ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9O0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9109 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PackageInfo m23475(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
