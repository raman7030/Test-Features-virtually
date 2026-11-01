package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ᩳۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19476 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("bin.mt.mcp.ACTION_FAILED_TO_START".equals(action)) {
            C18805.f56172 = false;
            String stringExtra = intent.getStringExtra(C0708d.f2599O);
            if (!TextUtils.isEmpty(stringExtra)) {
                C22682.m50795((CharSequence) stringExtra);
            }
        } else if (C18805.f56172 && "bin.mt.mcp.ACTION_STARTED".equals(action) && ServiceC20700.m46783() && ServiceC20700.m46774() == C22711.m50835()) {
            C18805.f56172 = false;
        } else if (C18805.f56172 && "bin.mt.mcp.ACTION_STOPPED".equals(action)) {
            C18805.f56172 = false;
            C7050.m16213(new RunnableC18134(), 500L);
        } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action) || "android.net.wifi.WIFI_AP_STATE_CHANGED".equals(action) || "android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C7050.m16213(new RunnableC6123(0), 500L);
        }
        C18805.m42863();
        C18805.m42864();
    }
}
