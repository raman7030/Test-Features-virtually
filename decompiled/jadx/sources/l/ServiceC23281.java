package l;

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
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;

/* JADX INFO: renamed from: l.᩺᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1RW */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC23281 extends Service {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f74755;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f74756;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74757;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BinderC11993 f74758 = new BinderC11993(this);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f74759 = new C6348(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MTerm", getString(R.string.MT_Protector), 3));
        }
        m51603();
        C2234.m7411(this).m7414(this.f74759, new IntentFilter("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m51603();
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
        BinderC11993 binderC11993 = this.f74758;
        switch (b) {
            case 0:
                binderC11993.m29313(false);
                return 2;
            case 1:
                stopSelf();
                return 2;
            case 2:
                binderC11993.m29319(false);
                return 2;
            default:
                return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        BinderC11993 binderC11993 = this.f74758;
        binderC11993.m29306();
        binderC11993.m29319(false);
        stopForeground(true);
        C2234.m7411(this).m7413(this.f74759);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51598() {
        C2234.m7411(C4925.m14335()).m7416(new Intent("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m51603() {
        Intent intentAddFlags = new Intent(this, (Class<?>) ViewOnLayoutChangeListenerC7738.class).addFlags(268435456);
        C21093 c21093 = new C21093(this, "MTerm");
        c21093.m47994(C19883.f64222.f64248.m28877());
        c21093.m48000();
        c21093.m47996(getString(R.string.MT_Protector));
        Resources resources = getResources();
        BinderC11993 binderC11993 = this.f74758;
        c21093.m47995((CharSequence) resources.getQuantityString(R.plurals.MT_Protector, binderC11993.f35907.size(), Integer.valueOf(binderC11993.f35907.size())));
        c21093.m47993(PendingIntent.getActivity(this, 0, intentAddFlags, 67108864));
        c21093.m48001();
        c21093.m47998(false);
        c21093.m47992(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC23281.class).setAction("bin.mt.term.TerminalService.ACTION_EXIT"), 67108864));
        ServiceC23281 serviceC23281 = binderC11993.f35906;
        if (serviceC23281.f74756 != null || serviceC23281.f74755 != null) {
            c21093.m47992(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC23281.class).setAction("bin.mt.term.TerminalService.ACTION_RELEASE_LOCK"), 67108864));
        } else {
            c21093.m47992(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC23281.class).setAction("bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK"), 67108864));
        }
        startForeground(b.d, c21093.m47991());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m51603();
        return this.f74758;
    }
}
