package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ᩳۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18000 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("bin.mt.mcp.ACTION_FAILED_TO_START".equals(action)) {
            C17294.f52990 = false;
            String stringExtra = intent.getStringExtra(d.O);
            if (!TextUtils.isEmpty(stringExtra)) {
                C21374.m48459((CharSequence) stringExtra);
            }
        } else if (C17294.f52990 && "bin.mt.mcp.ACTION_STARTED".equals(action) && ServiceC19288.m44489() && ServiceC19288.m44480() == C21404.m48499()) {
            C17294.f52990 = false;
        } else if (C17294.f52990 && "bin.mt.mcp.ACTION_STOPPED".equals(action)) {
            C17294.f52990 = false;
            C4925.m14316(new RunnableC16588(), 500L);
        } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action) || "android.net.wifi.WIFI_AP_STATE_CHANGED".equals(action) || "android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C4925.m14316(new RunnableC3950(0), 500L);
        }
        C17294.m40612();
        C17294.m40613();
    }
}
