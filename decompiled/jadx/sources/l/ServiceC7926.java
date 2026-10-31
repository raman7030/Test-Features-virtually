package l;

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
import bin.mt.plus.R;
import java.io.IOException;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAMT */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC7926 extends Service implements Runnable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Object f24534 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24535 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ServiceC7926 f24536;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static volatile Thread f24537;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f24538;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ServerSocket f24543;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0123 f24544;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f24539 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4399 f24541 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f24542 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f24540 = null;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m21228() {
        boolean z;
        synchronized (f24534) {
            z = f24537 != null && f24537.isAlive();
        }
        return z;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m21226() {
        if (m21228()) {
            return;
        }
        Application applicationM14335 = C4925.m14335();
        C0881.m3232(applicationM14335, new Intent(applicationM14335, (Class<?>) ServiceC7926.class));
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_FTP_SERVER", getString(R.string.MT_Protector), 3));
        }
        startForeground(1004, m21221());
        this.f24544 = new C0123(this, new RunnableC2539(3, this));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Notification m21221() {
        Intent action = new Intent(this, (Class<?>) ServiceC7926.class).setAction("bin.mt.plus.FsService.ACTION_STOP");
        Intent intentPutExtra = new Intent(this, (Class<?>) ActivityC15465.class).putExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 1);
        C21093 c21093 = new C21093(this, "MT_FTP_SERVER");
        c21093.m48000();
        c21093.m47996(C4925.m14327(R.string.MT_Protector));
        c21093.m47995((CharSequence) m21224());
        c21093.m47993(PendingIntent.getActivity(this, 0, intentPutExtra, 201326592));
        c21093.m48001();
        c21093.m47998(false);
        c21093.m47992(android.R.drawable.ic_delete, getString(R.string.MT_Protector), PendingIntent.getService(this, 0, action, 67108864));
        return c21093.m47991();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1004, m21221());
        if (intent != null && "bin.mt.plus.FsService.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        synchronized (f24534) {
            Thread thread = f24537;
            if (thread != null && thread.isAlive()) {
                return 1;
            }
            RuntimeException runtimeException = null;
            f24537 = null;
            f24536 = null;
            this.f24539 = false;
            Thread thread2 = new Thread(this);
            f24537 = thread2;
            f24536 = this;
            try {
                thread2.start();
            } catch (RuntimeException e) {
                if (f24537 == thread2 && f24536 == this) {
                    f24537 = null;
                    f24536 = null;
                }
                runtimeException = e;
            }
            if (runtimeException == null) {
                return 1;
            }
            stopSelf();
            m21217(runtimeException.toString());
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C0870 c0870;
        this.f24544.m1193();
        this.f24539 = true;
        synchronized (f24534) {
            if (f24536 != this) {
                c0870 = C0870.m3195();
            } else {
                this.f24539 = true;
                c0870 = new C0870();
                c0870.f3425 = f24537;
                c0870.f3421 = this.f24543;
                this.f24543 = null;
                c0870.f3422 = this.f24541;
                this.f24541 = null;
            }
        }
        if (c0870.f3425 != null) {
            c0870.f3425.interrupt();
        }
        m21218(c0870);
        m21218(m21223());
        stopForeground(true);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C0870 m21223() {
        C0870 c0870;
        synchronized (f24534) {
            c0870 = new C0870();
            c0870.f3424 = this.f24538;
            this.f24538 = null;
            c0870.f3426 = this.f24540;
            this.f24540 = null;
        }
        return c0870;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21232() throws Throwable {
        Throwable th;
        Throwable th2;
        ServerSocket serverSocket = new ServerSocket();
        boolean z = true;
        try {
            serverSocket.setReuseAddress(true);
            serverSocket.bind(new InetSocketAddress(C14981.m35469()));
            synchronized (f24534) {
                try {
                    if (!m21220(Thread.currentThread()) || this.f24539) {
                        z = false;
                    } else {
                        this.f24543 = serverSocket;
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
        C0870 c0870M21216;
        Intent intent;
        Intent intent2;
        Thread threadCurrentThread = Thread.currentThread();
        boolean z3 = false;
        String string = null;
        try {
            z = true;
            if (m21222(threadCurrentThread)) {
                C0870 c0870M21217 = m21216(threadCurrentThread, true);
                m21218(c0870M21217);
                if (!c0870M21217.f3420) {
                    return;
                }
                stopSelf();
                if (!c0870M21217.f3423) {
                    return;
                } else {
                    intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                }
            } else {
                try {
                    try {
                        C9255.m23767();
                        if (m21222(threadCurrentThread)) {
                            C0870 c0870M21218 = m21216(threadCurrentThread, true);
                            m21218(c0870M21218);
                            if (!c0870M21218.f3420) {
                                return;
                            }
                            stopSelf();
                            if (!c0870M21218.f3423) {
                                return;
                            } else {
                                intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                            }
                        } else {
                            try {
                                if (!m21232()) {
                                    C0870 c0870M21219 = m21216(threadCurrentThread, true);
                                    m21218(c0870M21219);
                                    if (!c0870M21219.f3420) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c0870M21219.f3423) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                } else if (m21222(threadCurrentThread) || !m21227(threadCurrentThread) || !m21229(threadCurrentThread)) {
                                    C0870 c0870M212110 = m21216(threadCurrentThread, true);
                                    m21218(c0870M212110);
                                    if (!c0870M212110.f3420) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c0870M212110.f3423) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                } else {
                                    if (!m21222(threadCurrentThread)) {
                                        C4925.m14312(new Intent("bin.mt.plus.FTP_SERVER_STARTED"));
                                        while (!m21222(threadCurrentThread)) {
                                            try {
                                                m21225(threadCurrentThread);
                                                try {
                                                    Thread.sleep(1000L);
                                                } catch (InterruptedException unused) {
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                z2 = false;
                                                if (z) {
                                                    m21230();
                                                }
                                                c0870M21216 = m21216(threadCurrentThread, false);
                                                m21218(c0870M21216);
                                                if (c0870M21216.f3420) {
                                                    stopSelf();
                                                    if (!z2) {
                                                        if (z) {
                                                            C4925.m14312(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                        } else {
                                                            C4925.m14312(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                        }
                                                    } else if (z) {
                                                        C4925.m14312(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                    } else {
                                                        C4925.m14312(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        m21230();
                                        C0870 c0870M212111 = m21216(threadCurrentThread, true);
                                        m21218(c0870M212111);
                                        if (c0870M212111.f3420) {
                                            stopSelf();
                                            intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                            C4925.m14312(intent);
                                            return;
                                        }
                                        return;
                                    }
                                    C0870 c0870M212112 = m21216(threadCurrentThread, true);
                                    m21218(c0870M212112);
                                    if (!c0870M212112.f3420) {
                                        return;
                                    }
                                    stopSelf();
                                    if (!c0870M212112.f3423) {
                                        return;
                                    } else {
                                        intent2 = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                    }
                                }
                            } catch (IOException e) {
                                if (m21222(threadCurrentThread)) {
                                    z3 = true;
                                    z = false;
                                } else {
                                    string = e instanceof BindException ? C4925.m14306(R.string.MT_Protector, Integer.valueOf(C14981.m35469())) : e.toString();
                                }
                                C0870 c0870M212113 = m21216(threadCurrentThread, z3);
                                m21218(c0870M212113);
                                if (c0870M212113.f3420) {
                                    stopSelf();
                                    if (!z || c0870M212113.f3423) {
                                        if (!c0870M212113.f3423) {
                                            return;
                                        } else {
                                            intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                        }
                                    }
                                    m21217(string);
                                    return;
                                }
                                return;
                            }
                        }
                    } catch (IOException e2) {
                        if (m21222(threadCurrentThread)) {
                            z3 = true;
                            z = false;
                        } else {
                            string = e2.toString();
                        }
                        C0870 c0870M212114 = m21216(threadCurrentThread, z3);
                        m21218(c0870M212114);
                        if (c0870M212114.f3420) {
                            stopSelf();
                            if (!z || c0870M212114.f3423) {
                                if (!c0870M212114.f3423) {
                                    return;
                                } else {
                                    intent = new Intent("bin.mt.plus.FTP_SERVER_STOPPED");
                                }
                            }
                            m21217(string);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    z2 = true;
                    if (z) {
                        m21230();
                    }
                    c0870M21216 = m21216(threadCurrentThread, false);
                    m21218(c0870M21216);
                    if (c0870M21216.f3420) {
                        stopSelf();
                        if (!z2 && !c0870M21216.f3423) {
                            m21217((String) null);
                        } else if (z || c0870M21216.f3423) {
                            C4925.m14312(new Intent("bin.mt.plus.FTP_SERVER_STOPPED"));
                        }
                    }
                    throw th;
                }
            }
            C4925.m14312(intent2);
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0870 m21216(Thread thread, boolean z) {
        C0870 c0870;
        synchronized (f24534) {
            boolean zM21220 = m21220(thread);
            c0870 = new C0870();
            c0870.f3420 = zM21220;
            c0870.f3423 = z || this.f24539;
            c0870.f3421 = this.f24543;
            this.f24543 = null;
            c0870.f3422 = this.f24541;
            this.f24541 = null;
            c0870.f3424 = this.f24538;
            this.f24538 = null;
            c0870.f3426 = this.f24540;
            this.f24540 = null;
            if (zM21220) {
                f24537 = null;
                f24536 = null;
                this.f24539 = false;
            }
        }
        return c0870;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m21225(Thread thread) {
        C4399 c4399;
        ServerSocket serverSocket;
        synchronized (f24534) {
            if (m21220(thread) && !this.f24539) {
                C4399 c43910 = this.f24541;
                C4399 c43911 = null;
                if (c43910 == null || c43910.isAlive()) {
                    c4399 = null;
                } else {
                    c4399 = this.f24541;
                    this.f24541 = null;
                }
                if (c4399 != null) {
                    try {
                        c4399.join();
                    } catch (InterruptedException unused) {
                    }
                }
                synchronized (f24534) {
                    if (m21220(thread) && !this.f24539 && this.f24541 == null && (serverSocket = this.f24543) != null) {
                        c43911 = new C4399();
                        c43911.f14087 = serverSocket;
                        c43911.f14086 = this;
                        this.f24541 = c43911;
                    }
                }
                if (c43911 != null) {
                    c43911.start();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m21222(Thread thread) {
        boolean z;
        synchronized (f24534) {
            z = !m21220(thread) || this.f24539;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m21220(Thread thread) {
        return thread == f24537 && f24536 == this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21217(String str) {
        Intent intent = new Intent("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
        intent.putExtra("msg", str);
        C4925.m14312(intent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21218(C0870 c0870) {
        if (c0870.f3422 != null) {
            C4399 c4399 = c0870.f3422;
            c4399.getClass();
            try {
                c4399.f14087.close();
            } catch (Exception unused) {
            }
        }
        ServerSocket serverSocket = c0870.f3421;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused2) {
            }
        }
        if (c0870.f3426 != null && c0870.f3426.isHeld()) {
            c0870.f3426.release();
        }
        if (c0870.f3424 == null || !c0870.f3424.isHeld()) {
            return;
        }
        c0870.f3424.release();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m21230() {
        synchronized (this) {
            for (C19922 c19922 : this.f24542) {
                if (c19922 != null) {
                    c19922.m45841();
                    c19922.m45853();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m21229(Thread thread) {
        Object obj = f24534;
        synchronized (obj) {
            if (m21220(thread) && !this.f24539) {
                if (this.f24538 != null) {
                    return true;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":FTPServer");
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire();
                synchronized (obj) {
                    if (m21220(thread) && !this.f24539 && this.f24538 == null) {
                        this.f24538 = wakeLockNewWakeLock;
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m21227(Thread thread) {
        Object obj = f24534;
        synchronized (obj) {
            if (m21220(thread) && !this.f24539) {
                if (this.f24540 != null) {
                    return true;
                }
                WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":FTPServer");
                wifiLockCreateWifiLock.setReferenceCounted(false);
                wifiLockCreateWifiLock.acquire();
                synchronized (obj) {
                    if (m21220(thread) && !this.f24539 && this.f24540 == null) {
                        this.f24540 = wifiLockCreateWifiLock;
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m21224() {
        String strM31298 = C12865.m31298();
        if (strM31298 == null) {
            return C4925.m14327(R.string.MT_Protector);
        }
        StringBuilder sbM9834 = C3200.m9834("ftp://", strM31298, ":");
        sbM9834.append(C14981.m35469());
        return sbM9834.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21231(C19922 c19922) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (C19922 c19923 : this.f24542) {
                if (!c19923.isAlive()) {
                    try {
                        c19923.join();
                        arrayList.add(c19923);
                        c19923.m45853();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f24542.remove((C19922) it.next());
            }
            this.f24542.add(c19922);
        }
    }
}
