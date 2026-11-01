package p067l;

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
public final class C2485 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f3998;

    /* JADX INFO: renamed from: ۧ */
    public final ConnectivityManager f4000;

    /* JADX INFO: renamed from: ܳ */
    public final ConnectivityManager.NetworkCallback f4001;

    /* JADX INFO: renamed from: ܽ */
    public final ContextWrapper f4002;

    /* JADX INFO: renamed from: ᩷ */
    public final BroadcastReceiver f4005;

    /* JADX INFO: renamed from: ᩻ */
    public final Runnable f4006;

    /* JADX INFO: renamed from: ܿ */
    public final Handler f4003 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۜ */
    public final RunnableC22041 f3999 = new RunnableC22041(7, this);

    /* JADX INFO: renamed from: ᩳ */
    public final RunnableC9941 f4004 = new RunnableC9941(3, this);

    /* JADX INFO: renamed from: ۧ */
    public static void m3591(C2485 c2485) {
        RunnableC22041 runnableC22041 = c2485.f3999;
        Handler handler = c2485.f4003;
        boolean z = c2485.f3998;
        if (z) {
            return;
        }
        if (!z) {
            c2485.f4006.run();
        }
        handler.removeCallbacks(runnableC22041);
        handler.postDelayed(runnableC22041, 500L);
    }

    public C2485(ContextWrapper contextWrapper, Runnable runnable) {
        C19921 c19921 = new C19921(this);
        this.f4001 = c19921;
        C20592 c20592 = new C20592(this);
        this.f4005 = c20592;
        this.f4002 = contextWrapper;
        this.f4006 = runnable;
        ConnectivityManager connectivityManager = (ConnectivityManager) contextWrapper.getSystemService("connectivity");
        this.f4000 = connectivityManager;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), c19921);
        IntentFilter intentFilter = new IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.TETHER_STATE_CHANGED");
        contextWrapper.registerReceiver(c20592, intentFilter);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3590(C2485 c2485) {
        if (c2485.f3998) {
            return;
        }
        c2485.f4006.run();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3594() {
        if (this.f3998) {
            return;
        }
        this.f3998 = true;
        this.f4000.unregisterNetworkCallback(this.f4001);
        this.f4002.unregisterReceiver(this.f4005);
        this.f4003.removeCallbacksAndMessages(null);
    }
}
