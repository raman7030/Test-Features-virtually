package p067l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AT */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC3906 extends Service {

    /* JADX INFO: renamed from: ۛ */
    public static C23884 f8465;

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ int f8466 = 0;

    /* JADX INFO: renamed from: ۗ */
    public String f8467;

    /* JADX INFO: renamed from: ۙ */
    public C2485 f8468;

    /* JADX INFO: renamed from: ۫ */
    public WifiManager.WifiLock f8469;

    /* JADX INFO: renamed from: ۬ */
    public PowerManager.WakeLock f8470;

    /* JADX INFO: renamed from: ᩶ */
    public C23884 f8471;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f8472;

    /* JADX INFO: renamed from: ᩹ */
    public C20532 f8473;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m7715() {
        C23884 c23884 = f8465;
        return c23884 != null && c23884.m15674();
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m7718() {
        C23884 c23884 = f8465;
        if (c23884 == null || !c23884.m15674()) {
            return null;
        }
        return c23884.m52972();
    }

    /* JADX INFO: renamed from: ܿ */
    public static long m7720() {
        C23884 c23884 = f8465;
        if (c23884 == null || !c23884.m15674()) {
            return 0L;
        }
        return c23884.m52969();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static long m7723() {
        int i = C23884.f75835;
        return C24395.m53769();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static ArrayList m7721() {
        C23884 c23884 = f8465;
        if (c23884 != null && c23884.m15674()) {
            return c23884.m52971();
        }
        C25066 c25066 = new C25066();
        ArrayList arrayList = new ArrayList();
        Iterator it = c25066.m55029().iterator();
        while (it.hasNext()) {
            arrayList.add(C25066.m55026((C16348) it.next()));
        }
        C25066.m55028(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m7714(String str) {
        C23884 c23884 = f8465;
        if (c23884 != null && c23884.m15674()) {
            return c23884.m52973(str);
        }
        return new C25066().m55031(str);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f8472 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_WEB_MANAGER_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1007, m7717());
        this.f8468 = new C2485(this, new RunnableC5700(2, this));
    }

    /* JADX INFO: renamed from: ۧ */
    private Notification m7717() {
        C1188 c1188;
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC17067.class).putExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 0);
        Intent action = new Intent(this, (Class<?>) ServiceC3906.class).setAction("bin.mt.remote.RemoteServerService.ACTION_STOP");
        String strM7719 = m7719();
        String strM48621 = this.f8467;
        if (strM48621 != null) {
            if (strM48621.length() == 6) {
                StringBuilder sb = new StringBuilder();
                sb.append(strM48621.substring(0, 3));
                sb.append(" ");
                strM48621 = C21459.m48621(3, strM48621, sb);
            }
            String string = getString(R.string.MT_Protector, strM48621);
            c1188 = new C1188();
            c1188.m20825(strM7719 + "\n" + string);
        } else {
            c1188 = null;
        }
        C1888 c1888 = new C1888(this, "MT_WEB_MANAGER_SERVER");
        c1888.m50330();
        c1888.m50326(C7050.m16224(R.string.MT_Protector));
        c1888.m50325((CharSequence) strM7719);
        c1888.m50323(PendingIntent.getActivity(this, 1, intentPutExtra, 201326592));
        c1888.m50331();
        c1888.m50328(false);
        c1888.m50322(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 2, action, 201326592));
        if (c1188 != null) {
            c1888.m50327(c1188);
        }
        return c1888.m50321();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C20532 c20532;
        if (intent != null && "bin.mt.remote.RemoteServerService.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        C23884 c23884 = f8465;
        if (c23884 == null || !c23884.m15674()) {
            this.f8467 = null;
        }
        startForeground(1007, m7717());
        if (c23884 != null && c23884.m15674()) {
            if (c23884 == this.f8471 && (c20532 = this.f8473) != null) {
                c20532.m46351();
            }
            C7050.m16212(new RunnableC9132(this, c23884, c23884.m52972(), c23884.m52969()));
            return 1;
        }
        try {
            m7711();
            C20532 c20533 = new C20532(this);
            C23884 c23885 = new C23884(C5918.m13302(), new C9387(5, this), new C15166(c20533));
            this.f8473 = c20533;
            this.f8471 = c23885;
            f8465 = c23885;
            c23885.m15675();
            C7050.m16212(new RunnableC9132(this, c23885, c23885.m52972(), c23885.m52969()));
            m7722();
            m7716();
            c20533.m46351();
            C7050.m16209(new Intent("bin.mt.remote.RemoteServerService.ACTION_STARTED"));
            return 1;
        } catch (IOException | RuntimeException e) {
            Intent intent2 = new Intent("bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START");
            intent2.putExtra("msg", e instanceof BindException ? C7050.m16203(R.string.MT_Protector, Integer.valueOf(C5918.m13302())) : e.toString());
            C7050.m16209(intent2);
            m7711();
            stopSelf();
            return 2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7711() {
        this.f8467 = null;
        C20532 c20532 = this.f8473;
        if (c20532 != null) {
            c20532.m46353();
            this.f8473 = null;
        }
        this.f8471 = null;
        C23884 c23884 = f8465;
        f8465 = null;
        if (c23884 != null) {
            c23884.m52970();
            c23884.mo15677();
        }
        WifiManager.WifiLock wifiLock = this.f8469;
        if (wifiLock != null) {
            if (wifiLock.isHeld()) {
                this.f8469.release();
            }
            this.f8469 = null;
        }
        PowerManager.WakeLock wakeLock = this.f8470;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.f8470.release();
            }
            this.f8470 = null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f8472 = true;
        this.f8468.m3594();
        m7711();
        stopForeground(true);
        C7050.m16209(new Intent("bin.mt.remote.RemoteServerService.ACTION_STOPPED"));
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m7713(ServiceC3906 serviceC3906, C23884 c23884, String str, long j) {
        if (!serviceC3906.f8472 && c23884 == f8465 && c23884.m15674()) {
            serviceC3906.f8467 = str;
            ((NotificationManager) serviceC3906.getSystemService("notification")).notify(1007, serviceC3906.m7717());
            C7050.m16209(new Intent("bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED").putExtra("expiresAt", j));
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m7722() {
        if (this.f8470 == null) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":WebManager");
            this.f8470 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        }
        this.f8470.acquire();
    }

    /* JADX INFO: renamed from: ۢ */
    private void m7716() {
        if (this.f8469 == null) {
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":WebManager");
            this.f8469 = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.setReferenceCounted(false);
        }
        this.f8469.acquire();
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m7719() {
        String strM33384 = C14595.m33384();
        if (strM33384 == null) {
            return C7050.m16224(R.string.MT_Protector);
        }
        StringBuilder sbM11879 = C5410.m11879("http://", strM33384, ":");
        sbM11879.append(C5918.m13302());
        return sbM11879.toString();
    }
}
