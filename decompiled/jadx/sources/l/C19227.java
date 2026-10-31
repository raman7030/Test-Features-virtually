package l;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: renamed from: l.᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4M5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19227 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Intent m44368(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (C12171.m29635(context, str2) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(C4860.m14172("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ComponentName m44367(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
