package p067l;

import android.app.Application;
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
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAMT */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC9901 extends Service implements Runnable {

    /* JADX INFO: renamed from: ۛ */
    public static final Object f27448 = new Object();

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ int f27449 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static ServiceC9901 f27450;

    /* JADX INFO: renamed from: ᩺ */
    public static volatile Thread f27451;

    /* JADX INFO: renamed from: ۗ */
    public PowerManager.WakeLock f27452;

    /* JADX INFO: renamed from: ᩸ */
    public ServerSocket f27457;

    /* JADX INFO: renamed from: ᩹ */
    public C2485 f27458;

    /* JADX INFO: renamed from: ۙ */
    public volatile boolean f27453 = false;

    /* JADX INFO: renamed from: ۬ */
    public C6549 f27455 = null;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f27456 = new ArrayList();

    /* JADX INFO: renamed from: ۫ */
    public WifiManager.WifiLock f27454 = null;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m23194() {
        boolean z;
        synchronized (f27448) {
            z = f27451 != null && f27451.isAlive();
        }
        return z;
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m23192() {
        if (m23194()) {
            return;
        }
        Application applicationM16232 = C7050.m16232();
        C0886.m5546(applicationM16232, new Intent(applicationM16232, (Class<?>) ServiceC9901.class));
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_FTP_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1004, m23187());
        this.f27458 = new C2485(this, new RunnableC4782(3, this));
    }

    /* JADX INFO: renamed from: ۧ */
    private Notification m23187() {
        Intent action = new Intent(this, (Class<?>) ServiceC9901.class).setAction("bin.mt.plus.FsService.ACTION_STOP");
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC17067.class).putExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 1);
        C1888 c1888 = new C1888(this, "MT_FTP_SERVER");
        c1888.m50330();
        c1888.m50326(C7050.m16224(R.string.MT_Protector));
        c1888.m50325((CharSequence) m23190());
        c1888.m50323(PendingIntent.getActivity(this, 0, intentPutExtra, 201326592));
        c1888.m50331();
        c1888.m50328(false);
        c1888.m50322(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, action, 67108864));
        return c1888.m50321();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1004, m23187());
        if (intent != null && "bin.mt.plus.FsService.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        synchronized (f27448) {
            Thread thread = f27451;
            if (thread != null && thread.isAlive()) {
                return 1;
            }
            RuntimeException runtimeException = null;
            f27451 = null;
            f27450 = null;
            this.f27453 = false;
            Thread thread2 = new Thread(this);
            f27451 = thread2;
            f27450 = this;
            try {
                thread2.start();
            } catch (RuntimeException e) {
                if (f27451 == thread2 && f27450 == this) {
                    f27451 = null;
                    f27450 = null;
                }
                runtimeException = e;
            }
            if (runtimeException == null) {
                return 1;
            }
            stopSelf();
            m23183(runtimeException.toString());
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C3195 c3195;
        this.f27458.m3594();
        this.f27453 = true;
        synchronized (f27448) {
            if (f27450 != this) {
                c3195 = C3195.m5509();
            } else {
                this.f27453 = true;
                c3195 = new C3195();
                c3195.f6198 = f27451;
                c3195.f6194 = this.f27457;
                this.f27457 = null;
                c3195.f6195 = this.f27455;
                this.f27455 = null;
            }
        }
        if (c3195.f6198 != null) {
            c3195.f6198.interrupt();
        }
        m23184(c3195);
        m23184(m23189());
        stopForeground(true);
    }

    /* JADX INFO: renamed from: ܳ */
    private C3195 m23189() {
        C3195 c3195;
        synchronized (f27448) {
            c3195 = new C3195();
            c3195.f6197 = this.f27452;
            this.f27452 = null;
            c3195.f6199 = this.f27454;
            this.f27454 = null;
        }
        return c3195;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23198() throws Throwable {
        Throwable th;
        Throwable th2;
        ServerSocket serverSocket = new ServerSocket();
        boolean z = true;
        try {
            serverSocket.setReuseAddress(true);
            serverSocket.bind(new InetSocketAddress(C16606.m37625()));
            synchronized (f27448) {
                try {
                    if (!m23186(Thread.currentThread()) || this.f27453) {
                        z = false;
                    } else {
                        this.f27457 = serverSocket;
                    }
                    try {
                        if (!z) {
                            try {
                                serverSocket.close();
                            } catch (IOException unused) {
                            }
                        }
                        return z;
                    } catch (Throwable th3) {
                        th2 = th3;
                        while (true) {
                            try {
                                try {
                                    throw th2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (!z) {
                                        try {
                                            serverSocket.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                z = z;
                            }
                            th2 = th5;
                            z = z;
                        }
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    z = false;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            z = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:103:0x019c  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b4  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        boolean z2;
        C3195 c3195M23182;
        Intent intent;
        Intent intent2;
        Thread threadCurrentThread = Thread.currentThread();
        boolean z3 = false;
        String string = null;
        try {
            z = true;
            if (m23188(threadCurrentThread)) {
                C3195 c3195M23183 = m23182(threadCurrentThread, true);
                m23184(c3195M23183);
                if (!c3195M23183.f6193) {
                    return;
                }
                stopSelf();
                if (!c3195M23183.f6196) {
                    return;
                } else {
                    intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                }
            } else {
                try {
                    try {
                        C11164.m25768();
                        if (m23188(threadCurrentThread)) {
                            C3195 c3195M23184 = m23182(threadCurrentThread, true);
                            m23184(c3195M23184);
                            if (!c3195M23184.f6193) {
                                return;
                            }
                            stopSelf();
                            if (!c3195M23184.f6196) {
                                return;
                            } else {
                                intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                            }
                        } else {
                            try {
                                if (!m23198()) {
                                    C3195 c3195M23185 = m23182(threadCurrentThread, true);
                                    m23184(c3195M23185);
                                    if (!c3195M23185.f6193) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c3195M23185.f6196) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                } else if (m23188(threadCurrentThread) || !m23193(threadCurrentThread) || !m23195(threadCurrentThread)) {
                                    C3195 c3195M23186 = m23182(threadCurrentThread, true);
                                    m23184(c3195M23186);
                                    if (!c3195M23186.f6193) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c3195M23186.f6196) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                } else {
                                    if (!m23188(threadCurrentThread)) {
                                        C7050.m16209(new Intent("bin.mt.plus.FTP_SERVER_STARTED"));
                                        while (!m23188(threadCurrentThread)) {
                                            try {
                                                m23191(threadCurrentThread);
                                                try {
                                                    Thread.sleep(1000L);
                                                } catch (InterruptedException unused) {
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                z2 = false;
                                                if (z) {
                                                    m23196();
                                                }
                                                c3195M23182 = m23182(threadCurrentThread, false);
                                                m23184(c3195M23182);
                                                if (c3195M23182.f6193) {
                                                    stopSelf();
                                                    if (!z2) {
                                                        if (z) {
                                                            C7050.m16209(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                        } else {
                                                            C7050.m16209(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                        }
                                                    } else if (z) {
                                                        C7050.m16209(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                    } else {
                                                        C7050.m16209(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        m23196();
                                        C3195 c3195M23187 = m23182(threadCurrentThread, true);
                                        m23184(c3195M23187);
                                        if (c3195M23187.f6193) {
                                            stopSelf();
                                            intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                            C7050.m16209(intent);
                                            return;
                                        }
                                        return;
                                    }
                                    C3195 c3195M23188 = m23182(threadCurrentThread, true);
                                    m23184(c3195M23188);
                                    if (!c3195M23188.f6193) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c3195M23188.f6196) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                }
                            } catch (IOException e) {
                                if (m23188(threadCurrentThread)) {
                                    z3 = true;
                                    z = false;
                                } else {
                                    string = e instanceof BindException ? C7050.m16203(R.string.MT_Protector, Integer.valueOf(C16606.m37625())) : e.toString();
                                }
                                C3195 c3195M23189 = m23182(threadCurrentThread, z3);
                                m23184(c3195M23189);
                                if (c3195M23189.f6193) {
                                    stopSelf();
                                    if (!z || c3195M23189.f6196) {
                                        if (!c3195M23189.f6196) {
                                            return;
                                        } else {
                                            intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                        }
                                    }
                                    m23183(string);
                                    return;
                                }
                                return;
                            }
                        }
                    } catch (IOException e2) {
                        if (m23188(threadCurrentThread)) {
                            z3 = true;
                            z = false;
                        } else {
                            string = e2.toString();
                        }
                        C3195 c3195M231810 = m23182(threadCurrentThread, z3);
                        m23184(c3195M231810);
                        if (c3195M231810.f6193) {
                            stopSelf();
                            if (!z || c3195M231810.f6196) {
                                if (!c3195M231810.f6196) {
                                    return;
                                } else {
                                    intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                }
                            }
                            m23183(string);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    z2 = true;
                    if (z) {
                        m23196();
                    }
                    c3195M23182 = m23182(threadCurrentThread, false);
                    m23184(c3195M23182);
                    if (c3195M23182.f6193) {
                        stopSelf();
                        if (!z2 && !c3195M23182.f6196) {
                            m23183((String) null);
                        } else if (z || c3195M23182.f6196) {
                            C7050.m16209(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                        }
                    }
                    throw th;
                }
            }
            C7050.m16209(intent2);
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C3195 m23182(Thread thread, boolean z) {
        C3195 c3195;
        synchronized (f27448) {
            boolean zM23186 = m23186(thread);
            c3195 = new C3195();
            c3195.f6193 = zM23186;
            c3195.f6196 = z || this.f27453;
            c3195.f6194 = this.f27457;
            this.f27457 = null;
            c3195.f6195 = this.f27455;
            this.f27455 = null;
            c3195.f6197 = this.f27452;
            this.f27452 = null;
            c3195.f6199 = this.f27454;
            this.f27454 = null;
            if (zM23186) {
                f27451 = null;
                f27450 = null;
                this.f27453 = false;
            }
        }
        return c3195;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m23191(Thread thread) {
        C6549 c6549;
        ServerSocket serverSocket;
        synchronized (f27448) {
            if (m23186(thread) && !this.f27453) {
                C6549 c65410 = this.f27455;
                C6549 c65411 = null;
                if (c65410 == null || c65410.isAlive()) {
                    c6549 = null;
                } else {
                    c6549 = this.f27455;
                    this.f27455 = null;
                }
                if (c6549 != null) {
                    try {
                        c6549.join();
                    } catch (InterruptedException unused) {
                    }
                }
                synchronized (f27448) {
                    if (m23186(thread) && !this.f27453 && this.f27455 == null && (serverSocket = this.f27457) != null) {
                        c65411 = new C6549();
                        c65411.f16903 = serverSocket;
                        c65411.f16902 = this;
                        this.f27455 = c65411;
                    }
                }
                if (c65411 != null) {
                    c65411.start();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m23188(Thread thread) {
        boolean z;
        synchronized (f27448) {
            z = !m23186(thread) || this.f27453;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m23186(Thread thread) {
        return thread == f27451 && f27450 == this;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23183(String str) {
        Intent intent = new Intent("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
        intent.putExtra("msg", str);
        C7050.m16209(intent);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23184(C3195 c3195) {
        if (c3195.f6195 != null) {
            C6549 c6549 = c3195.f6195;
            c6549.getClass();
            try {
                c6549.f16903.close();
            } catch (Exception unused) {
            }
        }
        ServerSocket serverSocket = c3195.f6194;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused2) {
            }
        }
        if (c3195.f6199 != null && c3195.f6199.isHeld()) {
            c3195.f6199.release();
        }
        if (c3195.f6197 == null || !c3195.f6197.isHeld()) {
            return;
        }
        c3195.f6197.release();
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m23196() {
        synchronized (this) {
            for (C21302 c21302 : this.f27456) {
                if (c21302 != null) {
                    c21302.m48154();
                    c21302.m48166();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m23195(Thread thread) {
        Object obj = f27448;
        synchronized (obj) {
            if (m23186(thread) && !this.f27453) {
                if (this.f27452 != null) {
                    return true;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":FTPServer");
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire();
                synchronized (obj) {
                    if (m23186(thread) && !this.f27453 && this.f27452 == null) {
                        this.f27452 = wakeLockNewWakeLock;
                        return true;
                    }
                    if (wakeLockNewWakeLock.isHeld()) {
                        wakeLockNewWakeLock.release();
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m23193(Thread thread) {
        Object obj = f27448;
        synchronized (obj) {
            if (m23186(thread) && !this.f27453) {
                if (this.f27454 != null) {
                    return true;
                }
                WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":FTPServer");
                wifiLockCreateWifiLock.setReferenceCounted(false);
                wifiLockCreateWifiLock.acquire();
                synchronized (obj) {
                    if (m23186(thread) && !this.f27453 && this.f27454 == null) {
                        this.f27454 = wifiLockCreateWifiLock;
                        return true;
                    }
                    if (wifiLockCreateWifiLock.isHeld()) {
                        wifiLockCreateWifiLock.release();
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m23190() {
        String strM33384 = C14595.m33384();
        if (strM33384 == null) {
            return C7050.m16224(R.string.MT_Protector);
        }
        StringBuilder sbM11879 = C5410.m11879("ftp://", strM33384, ":");
        sbM11879.append(C16606.m37625());
        return sbM11879.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23197(C21302 c21302) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (C21302 c21303 : this.f27456) {
                if (!c21303.isAlive()) {
                    try {
                        c21303.join();
                        arrayList.add(c21303);
                        c21303.m48166();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f27456.remove((C21302) it.next());
            }
            this.f27456.add(c21302);
        }
    }
}
