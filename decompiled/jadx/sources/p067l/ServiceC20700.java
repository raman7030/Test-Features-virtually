package p067l;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.net.BindException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩵ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceC20700 extends Service {

    /* JADX INFO: renamed from: ۛ */
    public static volatile boolean f63916;

    /* JADX INFO: renamed from: ۤ */
    public static volatile C16004 f63917;

    /* JADX INFO: renamed from: ۫ */
    public static ServiceC20700 f63918;

    /* JADX INFO: renamed from: ۬ */
    public static final /* synthetic */ int f63919 = 0;

    /* JADX INFO: renamed from: ۗ */
    public WifiManager.WifiLock f63920;

    /* JADX INFO: renamed from: ۙ */
    public PowerManager.WakeLock f63921;

    /* JADX INFO: renamed from: ᩶ */
    public ScheduledExecutorService f63922;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f63923;

    /* JADX INFO: renamed from: ᩹ */
    public C23469 f63924;

    /* JADX INFO: renamed from: ܺ */
    private synchronized void m46779() {
        ScheduledExecutorService scheduledExecutorService = this.f63922;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC8629());
            this.f63922 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new RunnableC22041(0, this), 0L, 30000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static boolean m46783() {
        C16004 c16004 = f63917;
        return (f63916 || c16004 == null || !c16004.m15674()) ? false : true;
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m46776() {
        if (m46783()) {
            Application applicationM16232 = C7050.m16232();
            applicationM16232.startService(new Intent(applicationM16232, (Class<?>) ServiceC20700.class).setAction("bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW"));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static int m46774() {
        C16004 c16004 = f63917;
        if (c16004 != null && c16004.m15674()) {
            return c16004.m36377();
        }
        return C22711.m50835();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        setTheme(C19552.m44401());
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_APK_MCP", getString(R.string.MT_Protector), 3));
        }
        startForeground(1008, m46778());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C16004 c16004;
        startForeground(1008, m46778());
        if (intent != null && "bin.mt.mcp.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        if (intent != null && "bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW".equals(intent.getAction())) {
            if (m46783()) {
                m46773();
                return 1;
            }
            stopSelf();
            return 2;
        }
        if (f63916) {
            f63918 = this;
            return 1;
        }
        if (m46783()) {
            try {
                m46784();
                m46773();
                m46779();
                C7050.m16209(new Intent("bin.mt.mcp.ACTION_STARTED"));
                return 1;
            } catch (Exception e) {
                m46781();
                m46771(e);
                stopSelf();
                return 2;
            }
        }
        C16004 c16005 = f63917;
        if (c16005 != null && !c16005.m15674() && (c16004 = f63917) != null && !f63916) {
            f63916 = true;
            new Thread(new RunnableC24722(0, c16004), "MT MCP Stop").start();
        }
        if (f63916) {
            f63918 = this;
            return 1;
        }
        try {
            AbstractC17043 abstractC17043M50831 = C22711.m50831();
            if (!abstractC17043M50831.mo25094()) {
                try {
                    abstractC17043M50831.m38666();
                    C17548.m39937();
                } catch (Exception unused) {
                }
            }
            C16004 c16006 = new C16004(C22711.m50835());
            f63917 = c16006;
            c16006.m15675();
            m46784();
            m46773();
            startForeground(1008, m46778());
            m46779();
            C7050.m16209(new Intent("bin.mt.mcp.ACTION_STARTED"));
            ExecutorService executorService = C4081.f8987;
            executorService.execute(new RunnableC7366(1));
            executorService.execute(new RunnableC10641(0));
            return 1;
        } catch (Exception e2) {
            m46781();
            m46771(e2);
            stopSelf();
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C21306.m48193("MT MCP service onDestroy");
        this.f63923 = true;
        if (f63918 == this) {
            f63918 = null;
        }
        m46781();
        stopForeground(true);
        if (!f63916) {
            C7050.m16209(new Intent("bin.mt.mcp.ACTION_STOPPED"));
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m46777() {
        f63917 = null;
        f63916 = false;
        ServiceC20700 serviceC20700 = f63918;
        f63918 = null;
        if (serviceC20700 != null && !serviceC20700.f63923) {
            serviceC20700.onStartCommand(null, 0, 0);
        } else {
            C7050.m16209(new Intent("bin.mt.mcp.ACTION_STOPPED"));
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m46781() {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.f63922;
            this.f63922 = null;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
        m46775();
        C16004 c16004 = f63917;
        if (c16004 != null && !f63916) {
            f63916 = true;
            new Thread(new RunnableC24722(0, c16004), "MT MCP Stop").start();
        }
        WifiManager.WifiLock wifiLock = this.f63920;
        if (wifiLock != null) {
            if (wifiLock.isHeld()) {
                this.f63920.release();
            }
            this.f63920 = null;
        }
        PowerManager.WakeLock wakeLock = this.f63921;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.f63921.release();
            }
            this.f63921 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46772(ServiceC20700 serviceC20700) {
        try {
            serviceC20700.m46782();
        } catch (Throwable th) {
            C21306.m48192("MT MCP health check failed", th);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m46782() throws Throwable {
        C20029 c20029M45386;
        HttpURLConnection httpURLConnection;
        String simpleName;
        C16004 c16004 = f63917;
        boolean z = c16004 != null;
        boolean z2 = z && c16004.m15676();
        boolean z3 = z && c16004.m15674();
        int iM36377 = z ? c16004.m36377() : -1;
        int iM15671 = z ? c16004.m15671() : -1;
        PowerManager.WakeLock wakeLock = this.f63921;
        boolean z4 = wakeLock != null && wakeLock.isHeld();
        WifiManager.WifiLock wifiLock = this.f63920;
        boolean z5 = wifiLock != null && wifiLock.isHeld();
        if (!z3 || iM15671 <= 0) {
            c20029M45386 = C20029.m45386();
        } else {
            long jNanoTime = System.nanoTime();
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(C0170a.f680s, "127.0.0.1", iM15671, "/mcp").openConnection(Proxy.NO_PROXY);
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(1000);
                        httpURLConnection.setReadTimeout(1000);
                        httpURLConnection.setUseCaches(false);
                        c20029M45386 = C20029.m45387(httpURLConnection.getResponseCode(), TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
                        httpURLConnection.disconnect();
                    } catch (IOException e) {
                        e = e;
                        httpURLConnection2 = httpURLConnection;
                        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                        String message = e.getMessage();
                        if (message == null || message.isEmpty()) {
                            simpleName = e.getClass().getSimpleName();
                        } else {
                            simpleName = e.getClass().getSimpleName() + ": " + message;
                        }
                        c20029M45386 = C20029.m45388(millis, simpleName);
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = null;
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
        C21306.m48193("MT MCP health state: pid=" + Process.myPid() + ", service=" + Integer.toHexString(System.identityHashCode(this)) + ", hasServer=" + z + ", wasStarted=" + z2 + ", alive=" + z3 + ", serverPort=" + iM36377 + ", listeningPort=" + iM15671 + ", configuredPort=" + C22711.m50835() + ", wakeLockHeld=" + z4 + ", wifiLockHeld=" + z5 + ", localHttpChecked=" + c20029M45386.f60862 + ", localHttpResponded=" + c20029M45386.f60866 + ", localHttpStatus=" + c20029M45386.f60865 + ", localHttpElapsedMs=" + c20029M45386.f60863 + ", localHttpError=" + c20029M45386.f60864);
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m46784() {
        PowerManager.WakeLock wakeLock = this.f63921;
        if (wakeLock == null || !wakeLock.isHeld()) {
            this.f63921 = null;
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":Mcp");
            this.f63921 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            this.f63921.acquire();
        }
        WifiManager.WifiLock wifiLock = this.f63920;
        if (wifiLock == null || !wifiLock.isHeld()) {
            this.f63920 = null;
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":Mcp");
            this.f63920 = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.setReferenceCounted(false);
            this.f63920.acquire();
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private void m46773() {
        if (!m46783() || !C22711.m50830()) {
            m46775();
            return;
        }
        try {
            if (!C23058.m51448(this)) {
                m46775();
                return;
            }
            if (this.f63924 == null) {
                C23469 c23469M52198 = C23469.m52198(this, "mcp");
                c23469M52198.setImageDrawable(C23845.m52913(getResources(), R.drawable.MT_Protector, getTheme()));
                c23469M52198.setOnClickListener(new View.OnClickListener() { // from class: l.ۢۛ᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = ServiceC20700.f63919;
                        if (C18805.m42856(C17127.m38753())) {
                            return;
                        }
                        Intent intent = new Intent("bin.mt.plus.ACTION_SHORTCUT");
                        ServiceC20700 serviceC20700 = this.f31499;
                        serviceC20700.startActivity(intent.setComponent(new ComponentName(serviceC20700.getPackageName(), "bin.mt.plus.ApkMcpActivity")).putExtra("operation", "tool-apk-mcp").addFlags(268435456));
                    }
                });
                this.f63924 = c23469M52198;
            }
            int iM50819 = C22711.m50819(getApplicationContext(), C22711.m50818(ApplicationC21448.f67649.getInt("amfbc", 0)));
            this.f63924.setBackgroundTintList(ColorStateList.valueOf(iM50819));
            this.f63924.setImageTintList(ColorStateList.valueOf(C9464.m21977(iM50819) > 220 ? -12895429 : -1));
            if (this.f63924.m52206()) {
                this.f63924.show();
            } else {
                this.f63924.m52205();
            }
        } catch (RuntimeException e) {
            C21306.m48192("Failed to show MT MCP floating window", e);
            m46775();
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private void m46775() {
        C23469 c23469 = this.f63924;
        if (c23469 == null) {
            return;
        }
        try {
            c23469.m52207();
            this.f63924 = null;
        } catch (RuntimeException e) {
            C21306.m48192("Failed to remove MT MCP floating window", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46771(Exception exc) {
        String string;
        Intent intent = new Intent("bin.mt.mcp.ACTION_FAILED_TO_START");
        if (exc instanceof BindException) {
            string = C7050.m16203(R.string.MT_Protector, Integer.valueOf(C22711.m50835()));
        } else {
            string = exc.getMessage() == null ? exc.toString() : exc.getMessage();
        }
        intent.putExtra(C0708d.f2599O, string);
        C7050.m16209(intent);
    }

    /* JADX INFO: renamed from: ܳ */
    private Notification m46778() {
        Intent intent = new Intent(this, (Class<?>) ActivityC10363.class);
        Intent action = new Intent(this, (Class<?>) ServiceC20700.class).setAction("bin.mt.mcp.ACTION_STOP");
        int iM46774 = m46774();
        ArrayList arrayListM42970 = C18882.m42970(iM46774);
        C1888 c1888 = new C1888(this, "MT_APK_MCP");
        c1888.m50330();
        c1888.m50326(getString(R.string.MT_Protector));
        c1888.m50325(arrayListM42970.isEmpty() ? C18882.m42971(iM46774) : (CharSequence) arrayListM42970.get(0));
        c1888.m50323(PendingIntent.getActivity(this, 0, intent, 201326592));
        c1888.m50331();
        c1888.m50328(false);
        c1888.m50322(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 1, action, 201326592));
        return c1888.m50321();
    }
}
