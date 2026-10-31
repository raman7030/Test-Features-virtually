package l;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.ۧܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11073 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27470(AssistActivity assistActivity) {
        boolean z;
        String packageName;
        try {
            z = assistActivity.getPackageManager().getActivityInfo(new ComponentName(assistActivity, (Class<?>) AssistActivity.class), 0).exported;
            C9145.m23518("openSDK_LOG.Activity", "activity exported: " + z);
        } catch (PackageManager.NameNotFoundException unused) {
            z = true;
        }
        if (!z) {
            return false;
        }
        ComponentName callingActivity = assistActivity.getCallingActivity();
        if (callingActivity == null || (packageName = callingActivity.getPackageName()) == null) {
            return true;
        }
        return !packageName.equals(assistActivity.getPackageName());
    }
}
