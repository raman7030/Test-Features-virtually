package l;

import android.content.BroadcastReceiver;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.֡ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6KF */
/* JADX INFO: loaded from: classes2.dex */
public final class C0123 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f1222;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConnectivityManager f1224;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ConnectivityManager.NetworkCallback f1225;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f1226;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f1229;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Runnable f1230;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Handler f1227 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final RunnableC20699 f1223 = new RunnableC20699(7, this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RunnableC7968 f1228 = new RunnableC7968(3, this);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1190(C0123 c0123) {
        RunnableC20699 runnableC20699 = c0123.f1223;
        Handler handler = c0123.f1227;
        boolean z = c0123.f1222;
        if (z) {
            return;
        }
        if (!z) {
            c0123.f1230.run();
        }
        handler.removeCallbacks(runnableC20699);
        handler.postDelayed(runnableC20699, 500L);
    }

    public C0123(ContextWrapper contextWrapper, Runnable runnable) {
        C18469 c18469 = new C18469(this);
        this.f1225 = c18469;
        C19175 c19175 = new C19175(this);
        this.f1229 = c19175;
        this.f1226 = contextWrapper;
        this.f1230 = runnable;
        ConnectivityManager connectivityManager = (ConnectivityManager) contextWrapper.getSystemService("connectivity");
        this.f1224 = connectivityManager;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), c18469);
        IntentFilter intentFilter = new IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.TETHER_STATE_CHANGED");
        contextWrapper.registerReceiver(c19175, intentFilter);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1189(C0123 c0123) {
        if (c0123.f1222) {
            return;
        }
        c0123.f1230.run();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1193() {
        if (this.f1222) {
            return;
        }
        this.f1222 = true;
        this.f1224.unregisterNetworkCallback(this.f1225);
        this.f1226.unregisterReceiver(this.f1229);
        this.f1227.removeCallbacksAndMessages(null);
    }
}
