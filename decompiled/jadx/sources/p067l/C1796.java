package p067l;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: renamed from: l.᩵ۙ */
/* JADX INFO: compiled from: J4M5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1796 {
    /* JADX INFO: renamed from: ֫ */
    public static Intent m46662(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (C1446.m31697(context, str2) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(C6988.m16053("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static ComponentName m46661(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
