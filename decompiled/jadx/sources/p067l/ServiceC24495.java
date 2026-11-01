package p067l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p050t0.C0215b;

/* JADX INFO: renamed from: l.᩺᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1RW */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC24495 extends Service {

    /* JADX INFO: renamed from: ۗ */
    public WifiManager.WifiLock f77499;

    /* JADX INFO: renamed from: ۙ */
    public PowerManager.WakeLock f77500;

    /* JADX INFO: renamed from: ᩶ */
    public int f77501;

    /* JADX INFO: renamed from: ᩸ */
    public final BinderC13767 f77502 = new BinderC13767(this);

    /* JADX INFO: renamed from: ᩹ */
    public final BroadcastReceiver f77503 = new C8402(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MTerm", getString(R.string.MT_Protector), 3));
        }
        m53999();
        C4491.m9493(this).m9496(this.f77503, new IntentFilter("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m53999();
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        byte b = -1;
        switch (action.hashCode()) {
            case -2127222010:
                if (action.equals("bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK")) {
                    b = 0;
                }
                break;
            case -1989614832:
                if (action.equals("bin.mt.term.TerminalService.ACTION_EXIT")) {
                    b = 1;
                }
                break;
            case 435239541:
                if (action.equals("bin.mt.term.TerminalService.ACTION_RELEASE_LOCK")) {
                    b = 2;
                }
                break;
        }
        BinderC13767 binderC13767 = this.f77502;
        switch (b) {
            case 0:
                binderC13767.m31368(false);
                return 2;
            case 1:
                stopSelf();
                return 2;
            case 2:
                binderC13767.m31374(false);
                return 2;
            default:
                return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        BinderC13767 binderC13767 = this.f77502;
        binderC13767.m31361();
        binderC13767.m31374(false);
        stopForeground(true);
        C4491.m9493(this).m9495(this.f77503);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53994() {
        C4491.m9493(C7050.m16232()).m9498(new Intent("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m53999() {
        Intent intentAddFlags = new Intent(this, (Class<?>) ViewOnLayoutChangeListenerC9723.class).addFlags(268435456);
        C1888 c1888 = new C1888(this, "MTerm");
        c1888.m50324(C21265.f66858.f66884.m30926());
        c1888.m50330();
        c1888.m50326(getString(R.string.MT_Protector));
        Resources resources = getResources();
        BinderC13767 binderC13767 = this.f77502;
        c1888.m50325((CharSequence) resources.getQuantityString(R.plurals.MT_Protector, binderC13767.f38917.size(), Integer.valueOf(binderC13767.f38917.size())));
        c1888.m50323(PendingIntent.getActivity(this, 0, intentAddFlags, 67108864));
        c1888.m50331();
        c1888.m50328(false);
        c1888.m50322(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC24495.class).setAction("bin.mt.term.TerminalService.ACTION_EXIT"), 67108864));
        ServiceC24495 serviceC24495 = binderC13767.f38916;
        if (serviceC24495.f77500 != null || serviceC24495.f77499 != null) {
            c1888.m50322(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC24495.class).setAction("bin.mt.term.TerminalService.ACTION_RELEASE_LOCK"), 67108864));
        } else {
            c1888.m50322(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC24495.class).setAction("bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK"), 67108864));
        }
        startForeground(C0215b.f1001d, c1888.m50321());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m53999();
        return this.f77502;
    }
}
