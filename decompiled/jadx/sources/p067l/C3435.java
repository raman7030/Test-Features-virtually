package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.֨۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3435 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!"bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START".equals(action)) {
            if (!"bin.mt.plus.FTP_SERVER_FAILED_TO_START".equals(action)) {
                if (C22882.f72022 && "bin.mt.remote.RemoteServerService.ACTION_STOPPED".equals(action)) {
                    C22882.f72022 = false;
                    C7050.m16213(new RunnableC7459(0), 500L);
                } else if (C22882.f72020 && "bin.mt.plus.FTP_SERVER_STOPPED".equals(action)) {
                    C22882.f72020 = false;
                    C7050.m16213(new RunnableC17202(1), 500L);
                }
            } else {
                String stringExtra = intent.getStringExtra("msg");
                if (!TextUtils.isEmpty(stringExtra)) {
                    C22682.m50795((CharSequence) stringExtra);
                }
                C22882.f72020 = false;
            }
        } else {
            String stringExtra2 = intent.getStringExtra("msg");
            if (!TextUtils.isEmpty(stringExtra2)) {
                C22682.m50795((CharSequence) stringExtra2);
            }
            C22882.f72022 = false;
        }
        C22882.m51113();
    }
}
