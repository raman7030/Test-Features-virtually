package l;

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
import bin.mt.plus.R;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AT */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC1618 extends Service {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static C22639 f5685;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5686 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f5687;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0123 f5688;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f5689;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f5690;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22639 f5691;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f5692;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19112 f5693;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m5485() {
        C22639 c22639 = f5685;
        return c22639 != null && c22639.m13798();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m5488() {
        C22639 c22639 = f5685;
        if (c22639 == null || !c22639.m13798()) {
            return null;
        }
        return c22639.m50646();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long m5490() {
        C22639 c22639 = f5685;
        if (c22639 == null || !c22639.m13798()) {
            return 0L;
        }
        return c22639.m50643();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static long m5493() {
        int i = C22639.f73109;
        return C23176.m51373();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5491() {
        C22639 c22639 = f5685;
        if (c22639 != null && c22639.m13798()) {
            return c22639.m50645();
        }
        C23882 c23882 = new C23882();
        ArrayList arrayList = new ArrayList();
        Iterator it = c23882.m52620().iterator();
        while (it.hasNext()) {
            arrayList.add(C23882.m52617((C14709) it.next()));
        }
        C23882.m52619(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5484(String str) {
        C22639 c22639 = f5685;
        if (c22639 != null && c22639.m13798()) {
            return c22639.m50647(str);
        }
        return new C23882().m52622(str);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f5692 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_WEB_MANAGER_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1007, m5487());
        this.f5688 = new C0123(this, new RunnableC3505(2, this));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Notification m5487() {
        C6981 c6981;
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC15465.class).putExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 0);
        Intent action = new Intent(this, (Class<?>) ServiceC1618.class).setAction("bin.mt.remote.RemoteServerService.ACTION_STOP");
        String strM5489 = m5489();
        String strM46305 = this.f5687;
        if (strM46305 != null) {
            if (strM46305.length() == 6) {
                StringBuilder sb = new StringBuilder();
                sb.append(strM46305.substring(0, 3));
                sb.append(" ");
                strM46305 = C20087.m46305(3, strM46305, sb);
            }
            String string = getString(R.string.MT_Protector, strM46305);
            c6981 = new C6981();
            c6981.m18871(strM5489 + "\n" + string);
        } else {
            c6981 = null;
        }
        C21093 c21093 = new C21093(this, "MT_WEB_MANAGER_SERVER");
        c21093.m48000();
        c21093.m47996(C4925.m14327(R.string.MT_Protector));
        c21093.m47995((CharSequence) strM5489);
        c21093.m47993(PendingIntent.getActivity(this, 1, intentPutExtra, 201326592));
        c21093.m48001();
        c21093.m47998(false);
        c21093.m47992(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 2, action, 201326592));
        if (c6981 != null) {
            c21093.m47997(c6981);
        }
        return c21093.m47991();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C19112 c19112;
        if (intent != null && "bin.mt.remote.RemoteServerService.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        C22639 c22639 = f5685;
        if (c22639 == null || !c22639.m13798()) {
            this.f5687 = null;
        }
        startForeground(1007, m5487());
        if (c22639 != null && c22639.m13798()) {
            if (c22639 == this.f5691 && (c19112 = this.f5693) != null) {
                c19112.m44057();
            }
            C4925.m14315(new RunnableC7117(this, c22639, c22639.m50646(), c22639.m50643()));
            return 1;
        }
        try {
            m5481();
            C19112 c19113 = new C19112(this);
            C22639 c226310 = new C22639(C3735.m11350(), new C7385(5, this), new C13466(c19113));
            this.f5693 = c19113;
            this.f5691 = c226310;
            f5685 = c226310;
            c226310.m13799();
            C4925.m14315(new RunnableC7117(this, c226310, c226310.m50646(), c226310.m50643()));
            m5492();
            m5486();
            c19113.m44057();
            C4925.m14312(new Intent("bin.mt.remote.RemoteServerService.ACTION_STARTED"));
            return 1;
        } catch (IOException | RuntimeException e) {
            Intent intent2 = new Intent("bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START");
            intent2.putExtra("msg", e instanceof BindException ? C4925.m14306(R.string.MT_Protector, Integer.valueOf(C3735.m11350())) : e.toString());
            C4925.m14312(intent2);
            m5481();
            stopSelf();
            return 2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5481() {
        this.f5687 = null;
        C19112 c19112 = this.f5693;
        if (c19112 != null) {
            c19112.m44059();
            this.f5693 = null;
        }
        this.f5691 = null;
        C22639 c22639 = f5685;
        f5685 = null;
        if (c22639 != null) {
            c22639.m50644();
            c22639.mo13801();
        }
        WifiManager.WifiLock wifiLock = this.f5689;
        if (wifiLock != null) {
            if (wifiLock.isHeld()) {
                this.f5689.release();
            }
            this.f5689 = null;
        }
        PowerManager.WakeLock wakeLock = this.f5690;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.f5690.release();
            }
            this.f5690 = null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f5692 = true;
        this.f5688.m1193();
        m5481();
        stopForeground(true);
        C4925.m14312(new Intent("bin.mt.remote.RemoteServerService.ACTION_STOPPED"));
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5483(ServiceC1618 serviceC1618, C22639 c22639, String str, long j) {
        if (!serviceC1618.f5692 && c22639 == f5685 && c22639.m13798()) {
            serviceC1618.f5687 = str;
            ((NotificationManager) serviceC1618.getSystemService("notification")).notify(1007, serviceC1618.m5487());
            C4925.m14312(new Intent("bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED").putExtra("expiresAt", j));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m5492() {
        if (this.f5690 == null) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":WebManager");
            this.f5690 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        }
        this.f5690.acquire();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m5486() {
        if (this.f5689 == null) {
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":WebManager");
            this.f5689 = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.setReferenceCounted(false);
        }
        this.f5689.acquire();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m5489() {
        String strM31298 = C12865.m31298();
        if (strM31298 == null) {
            return C4925.m14327(R.string.MT_Protector);
        }
        StringBuilder sbM9834 = C3200.m9834("http://", strM31298, ":");
        sbM9834.append(C3735.m11350());
        return sbM9834.toString();
    }
}
