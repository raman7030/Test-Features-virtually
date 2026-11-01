package p067l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.umeng.analytics.pro.C0708d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.᩶֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21223 implements InterfaceC11953 {

    /* JADX INFO: renamed from: ۡ */
    public static volatile C16527 f66725;

    /* JADX INFO: renamed from: ۢ */
    public static final ServiceConnection f66726;

    /* JADX INFO: renamed from: ᩷ */
    public static final C13705 f66727;

    /* JADX INFO: renamed from: ܳ */
    public volatile boolean f66731;

    /* JADX INFO: renamed from: ܽ */
    public volatile InterfaceC23234 f66732;

    /* JADX INFO: renamed from: ܿ */
    public int f66733;

    /* JADX INFO: renamed from: ۜ */
    public static final Object f66724 = new Object();

    /* JADX INFO: renamed from: ᩻ */
    public static final ArrayList f66728 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final CountDownLatch f66730 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f66729 = true;

    /* JADX INFO: renamed from: ᩳ */
    public int f66734 = 0;

    /* JADX INFO: renamed from: ܺ */
    private synchronized void m47941() {
        this.f66734 = 0;
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ֫ */
    public final C13964 mo27362(String str) {
        return mo27363(str, false);
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ֫ */
    public final C13964 mo27363(String str, boolean z) {
        return mo27361(z ? 0L : 8000L, str);
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo27366() {
        return mo27364() && getUid() == 0;
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo27367() {
        return mo27364() && getUid() == 2000;
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo27365() {
        if (!mo27364()) {
            return false;
        }
        int uid = getUid();
        return uid == 0 || uid == 2000;
    }

    static {
        C13705 c13705 = new C13705(new ComponentName("bin.mt.plus", BinderC17197.class.getName()));
        c13705.m31158();
        c13705.m31159();
        f66727 = c13705;
        f66726 = new ServiceConnectionC9822();
    }

    public C21223() {
    }

    public C21223(boolean z, boolean z2) throws Throwable {
        boolean zM27132;
        if (C12799.m29346()) {
            C4081.f8987.execute(new RunnableC4458(0));
            throw new IOException("Shizuku can not init in main thread");
        }
        if (m47945()) {
            C21306.m48191("Shizuku reuse shared service, uid=" + this.f66733);
            return;
        }
        if (z2) {
            zM27132 = C11835.m27132(true, null);
        } else {
            zM27132 = C11835.m27132(false, null);
        }
        if (!zM27132) {
            throw new IOException("Shizuku permission denied");
        }
        try {
            if (m47945()) {
                C21306.m48191("Shizuku reuse shared service after permission, uid=" + this.f66733);
                return;
            }
            synchronized (f66724) {
                ArrayList arrayList = f66728;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            C24433.m53909(f66727, f66726);
            this.f66731 = true;
            m47932(z);
            if (this.f66732 == null) {
                throw new IOException("Shizuku service unavailable");
            }
            this.f66733 = ((C16527) this.f66732).f48568.mo21447();
            C21306.m48191("Shizuku init success, uid=" + this.f66733);
        } catch (IOException e) {
            e = e;
            m47939(true);
            C21306.m48188("Shizuku init error", e);
            throw e;
        } catch (Error e2) {
            e = e2;
            m47939(true);
            C21306.m48188("Shizuku init error", e);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            m47939(true);
            C21306.m48188("Shizuku init error", e);
            throw e;
        } catch (Exception e4) {
            m47939(true);
            C21306.m48188("Shizuku init error", e4);
            throw new IOException(e4);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m47940() {
        try {
            C21223 c21223 = new C21223(false, true);
            if (C11164.m25766(c21223)) {
                return;
            }
            c21223.m47939(false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47929(final C15856 c15856) throws IOException {
        if (C12799.m29346()) {
            C4081.f8987.execute(new Runnable() { // from class: l.֨֨ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C21223.m47929(c15856);
                    } catch (IOException e) {
                        C21306.m48188("Shizuku prewarm error", e);
                    }
                }
            });
            return;
        }
        if (f66725 != null) {
            return;
        }
        if (!C11835.m27132(true, c15856)) {
            throw new IOException("Shizuku permission denied");
        }
        if (f66725 != null) {
            return;
        }
        C24433.m53909(f66727, f66726);
        try {
            if (m47942()) {
            } else {
                throw new IOException("Shizuku prewarm timeout");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Shizuku prewarm interrupted", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47928(C14853 c14853) {
        RunnableC24165 runnableC24165;
        try {
            C21306.m48191("Shell.create shizuku (try again)");
            boolean z = true;
            C21223 c21223 = new C21223(true, true);
            if (!C11164.m25766(c21223)) {
                z = false;
                c21223.m47939(false);
            }
            if (z) {
                C7050.m16212(new RunnableC17202(0));
            }
            runnableC24165 = new RunnableC24165(3, c14853);
        } catch (Throwable th) {
            try {
                C21306.m48188("Shell.error", th);
                runnableC24165 = new RunnableC24165(3, c14853);
            } catch (Throwable th2) {
                C7050.m16212(new RunnableC24165(3, c14853));
                throw th2;
            }
        }
        C7050.m16212(runnableC24165);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47932(boolean z) throws IOException {
        CountDownLatch countDownLatch = this.f66730;
        if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
            return;
        }
        C21306.m48191("Shizuku bind callback timeout");
        long jMax = Math.max(0L, 10000L) + m47937();
        boolean z2 = false;
        while (true) {
            long jM47937 = jMax - m47937();
            if (jM47937 <= 0) {
                if (z2) {
                    C21306.m48191("Shizuku callback still pending, request connected callback again");
                    C24433.m53909(f66727, f66726);
                    this.f66731 = true;
                    long jMax2 = Math.max(0L, 10000L) + m47937();
                    while (m47933(this)) {
                        long jM47938 = jMax2 - m47937();
                        if (jM47938 <= 0) {
                            break;
                        } else if (countDownLatch.await(Math.min(Math.max(1L, 200L), jM47938), TimeUnit.MILLISECONDS)) {
                            return;
                        }
                    }
                }
                C21306.m48191("Shizuku timeout");
                if (z) {
                    C7050.m16212(new RunnableC20552());
                }
                throw new IOException("Shizuku timeout");
            }
            if (countDownLatch.await(Math.min(Math.max(1L, 200L), jM47937), TimeUnit.MILLISECONDS)) {
                return;
            }
            if (!z2 && m47933(this)) {
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m47933(C21223 c21223) {
        try {
            return C24433.m53904(f66727) >= 0;
        } catch (RuntimeException e) {
            C21306.m48188("Shizuku peek user service error", e);
            return false;
        }
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ֫ */
    public final C13964 mo27361(long j, String str) {
        long j2;
        InterfaceC23234 interfaceC23234 = this.f66732;
        if (interfaceC23234 != null) {
            final C5799 c5799 = new C5799(interfaceC23234, str, j);
            Future futureSubmit = C4081.f8987.submit(new Callable() { // from class: l.ᩴ֨ۢ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return (C22564) c5799.get();
                }
            });
            if (j <= 0) {
                j2 = 0;
            } else {
                try {
                    long jMax = Math.max(300L, Math.min(1500L, j / 4));
                    j2 = C14849.FOREVER_NS;
                    if (j < C14849.FOREVER_NS - jMax) {
                        j2 = j + jMax;
                    }
                } catch (InterruptedException e) {
                    futureSubmit.cancel(true);
                    Thread.currentThread().interrupt();
                    return new C13964(e.toString(), new String[0]);
                } catch (ExecutionException e2) {
                    throw new RuntimeException(e2);
                } catch (TimeoutException unused) {
                    futureSubmit.cancel(true);
                    m47939(true);
                    return new C13964("Binder response timeout", new String[0]);
                }
            }
            return m47925((C22564) (j2 > 0 ? futureSubmit.get(j2, TimeUnit.MILLISECONDS) : futureSubmit.get()));
        }
        return new C13964("Closed", new String[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22564 m47927(InterfaceC23234 interfaceC23234, String str, long j) {
        try {
            return m47926(((C16527) interfaceC23234).f48568.mo21448(j > 2147483647L ? Integer.MAX_VALUE : (int) j, "sh", str + "\nexit\n"));
        } catch (RemoteException e) {
            return new C22564(2, new C13964(e.toString(), new String[0]), true);
        } catch (IOException e2) {
            return new C22564(2, new C13964(e2.toString(), new String[0]), true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C13964 m47925(C22564 c22564) {
        if (c22564.f71158) {
            m47939(true);
            return c22564.f71156;
        }
        if (c22564.f71157 != 1) {
            m47941();
            return c22564.f71156;
        }
        synchronized (this) {
            int i = this.f66734 + 1;
            this.f66734 = i;
            if (i >= 3) {
                m47939(true);
            }
        }
        return c22564.f71156;
    }

    /* JADX INFO: renamed from: ۡ */
    public static long m47937() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22564 m47926(Bundle bundle) throws IOException {
        if (bundle == null) {
            return new C22564(2, new C13964("Empty result", new String[0]), false);
        }
        return new C22564(bundle.getInt(C0172c.f705a, 2), new C13964(m47924(C0708d.f2599O, "error_gzip", bundle), m47924("output", "output_gzip", bundle).split("\n")), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m47924(String str, String str2, Bundle bundle) throws IOException {
        byte[] byteArray = bundle.getByteArray(str2);
        if (byteArray == null) {
            String string = bundle.getString(str);
            return string != null ? string : "";
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = gZIPInputStream.read(bArr);
                        if (i != -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            String string2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            byteArrayOutputStream.close();
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return string2;
                        }
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                gZIPInputStream.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // p067l.InterfaceC11953
    public final int getUid() {
        return this.f66733;
    }

    @Override // p067l.InterfaceC11953
    public final void close() {
        m47939(false);
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27364() {
        return this.f66729 && this.f66732 != null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m47945() {
        C16527 c16527 = f66725;
        if (c16527 == null) {
            return false;
        }
        try {
            this.f66733 = c16527.f48568.mo21447();
            this.f66732 = c16527;
            this.f66731 = true;
            synchronized (f66724) {
                ArrayList arrayList = f66728;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            this.f66730.countDown();
            return true;
        } catch (RemoteException unused) {
            m47943();
            return false;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public static boolean m47938() {
        C16527 c16527 = f66725;
        if (c16527 == null) {
            return false;
        }
        try {
            c16527.f48568.mo21447();
            return true;
        } catch (RemoteException unused) {
            m47943();
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public static boolean m47942() throws InterruptedException {
        long jM47937 = m47937() + 5000;
        while (f66725 == null) {
            long jM47938 = jM47937 - m47937();
            if (jM47938 > 0) {
                Thread.sleep(Math.min(200L, jM47938));
            } else {
                try {
                    C13705 c13705 = f66727;
                    if (C24433.m53904(c13705) >= 0) {
                        C21306.m48191("Shizuku shared callback still pending, request connected callback again");
                        C24433.m53909(c13705, f66726);
                        long jM47939 = m47937() + 10000;
                        while (C24433.m53904(f66727) >= 0) {
                            try {
                                if (f66725 != null) {
                                    return true;
                                }
                                long jM479310 = jM47939 - m47937();
                                if (jM479310 <= 0) {
                                    break;
                                }
                                Thread.sleep(Math.min(200L, jM479310));
                            } catch (RuntimeException e) {
                                C21306.m48188("Shizuku peek shared user service error", e);
                            }
                        }
                        if (f66725 != null) {
                            return true;
                        }
                    }
                    return false;
                } catch (RuntimeException e2) {
                    C21306.m48188("Shizuku peek shared user service error", e2);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000d  */
    /* JADX INFO: renamed from: ۧ */
    private synchronized void m47939(boolean z) {
        boolean z2;
        if (z) {
            try {
                if (this.f66731) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z2 = false;
        }
        this.f66729 = false;
        m47935();
        this.f66731 = false;
        this.f66732 = null;
        if (z2) {
            try {
                C24433.m53916(f66727);
            } catch (RuntimeException unused) {
            }
            m47943();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47930(C16527 c16527) {
        f66725 = c16527;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m47943() {
        f66725 = null;
        for (C21223 c21223 : m47934()) {
            if (c21223.f66729) {
                c21223.f66731 = false;
                c21223.f66732 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private void m47935() {
        synchronized (f66724) {
            f66728.remove(this);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public static C21223[] m47934() {
        C21223[] c21223Arr;
        synchronized (f66724) {
            c21223Arr = (C21223[]) f66728.toArray(new C21223[0]);
        }
        return c21223Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47931(C21223 c21223, C16527 c16527) {
        if (c21223.f66729) {
            c21223.f66732 = c16527;
            c21223.f66731 = true;
            c21223.f66730.countDown();
        }
    }
}
