package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.d;
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
public final class C19839 implements InterfaceC10085 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static volatile C14898 f64088;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final ServiceConnection f64089;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C11928 f64090;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f64094;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC21955 f64095;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f64096;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Object f64087 = new Object();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final ArrayList f64091 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f64093 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f64092 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f64097 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private synchronized void m45630() {
        this.f64097 = 0;
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ֫ */
    public final C12201 mo25343(String str) {
        return mo25344(str, false);
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ֫ */
    public final C12201 mo25344(String str, boolean z) {
        return mo25342(z ? 0L : 8000L, str);
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo25347() {
        return mo25345() && getUid() == 0;
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo25348() {
        return mo25345() && getUid() == 2000;
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25346() {
        if (!mo25345()) {
            return false;
        }
        int uid = getUid();
        return uid == 0 || uid == 2000;
    }

    static {
        C11928 c11928 = new C11928(new ComponentName("bin.mt.plus", BinderC15603.class.getName()));
        c11928.m29105();
        c11928.m29106();
        f64090 = c11928;
        f64089 = new ServiceConnectionC7843();
    }

    public C19839() {
    }

    public C19839(boolean z, boolean z2) throws Throwable {
        boolean zM25115;
        if (C10975.m27284()) {
            C1802.f6208.execute(new RunnableC2199(0));
            throw new IOException("Shizuku can not init in main thread");
        }
        if (m45634()) {
            C19926.m45878("Shizuku reuse shared service, uid=" + this.f64096);
            return;
        }
        if (z2) {
            zM25115 = C9961.m25115(true, null);
        } else {
            zM25115 = C9961.m25115(false, null);
        }
        if (!zM25115) {
            throw new IOException("Shizuku permission denied");
        }
        try {
            if (m45634()) {
                C19926.m45878("Shizuku reuse shared service after permission, uid=" + this.f64096);
                return;
            }
            synchronized (f64087) {
                ArrayList arrayList = f64091;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            C23216.m51512(f64090, f64089);
            this.f64094 = true;
            m45621(z);
            if (this.f64095 == null) {
                throw new IOException("Shizuku service unavailable");
            }
            this.f64096 = ((C14898) this.f64095).f45453.mo19481();
            C19926.m45878("Shizuku init success, uid=" + this.f64096);
        } catch (IOException e) {
            e = e;
            m45628(true);
            C19926.m45875("Shizuku init error", e);
            throw e;
        } catch (Error e2) {
            e = e2;
            m45628(true);
            C19926.m45875("Shizuku init error", e);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            m45628(true);
            C19926.m45875("Shizuku init error", e);
            throw e;
        } catch (Exception e4) {
            m45628(true);
            C19926.m45875("Shizuku init error", e4);
            throw new IOException(e4);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m45629() {
        try {
            C19839 c19839 = new C19839(false, true);
            if (C9255.m23765(c19839)) {
                return;
            }
            c19839.m45628(false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45618(final C14192 c14192) throws IOException {
        if (C10975.m27284()) {
            C1802.f6208.execute(new Runnable() { // from class: l.֨֨ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C19839.m45618(c14192);
                    } catch (IOException e) {
                        C19926.m45875("Shizuku prewarm error", e);
                    }
                }
            });
            return;
        }
        if (f64088 != null) {
            return;
        }
        if (!C9961.m25115(true, c14192)) {
            throw new IOException("Shizuku permission denied");
        }
        if (f64088 != null) {
            return;
        }
        C23216.m51512(f64090, f64089);
        try {
            if (m45631()) {
            } else {
                throw new IOException("Shizuku prewarm timeout");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Shizuku prewarm interrupted", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45617(C13136 c13136) {
        RunnableC22934 runnableC22934;
        try {
            C19926.m45878("Shell.create shizuku (try again)");
            boolean z = true;
            C19839 c19839 = new C19839(true, true);
            if (!C9255.m23765(c19839)) {
                z = false;
                c19839.m45628(false);
            }
            if (z) {
                C4925.m14315(new RunnableC15608(0));
            }
            runnableC22934 = new RunnableC22934(3, c13136);
        } catch (Throwable th) {
            try {
                C19926.m45875("Shell.error", th);
                runnableC22934 = new RunnableC22934(3, c13136);
            } catch (Throwable th2) {
                C4925.m14315(new RunnableC22934(3, c13136));
                throw th2;
            }
        }
        C4925.m14315(runnableC22934);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45621(boolean z) throws IOException {
        CountDownLatch countDownLatch = this.f64093;
        if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
            return;
        }
        C19926.m45878("Shizuku bind callback timeout");
        long jMax = Math.max(0L, 10000L) + m45626();
        boolean z2 = false;
        while (true) {
            long jM45626 = jMax - m45626();
            if (jM45626 <= 0) {
                if (z2) {
                    C19926.m45878("Shizuku callback still pending, request connected callback again");
                    C23216.m51512(f64090, f64089);
                    this.f64094 = true;
                    long jMax2 = Math.max(0L, 10000L) + m45626();
                    while (m45622(this)) {
                        long jM45627 = jMax2 - m45626();
                        if (jM45627 <= 0) {
                            break;
                        } else if (countDownLatch.await(Math.min(Math.max(1L, 200L), jM45627), TimeUnit.MILLISECONDS)) {
                            return;
                        }
                    }
                }
                C19926.m45878("Shizuku timeout");
                if (z) {
                    C4925.m14315(new RunnableC19133());
                }
                throw new IOException("Shizuku timeout");
            }
            if (countDownLatch.await(Math.min(Math.max(1L, 200L), jM45626), TimeUnit.MILLISECONDS)) {
                return;
            }
            if (!z2 && m45622(this)) {
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m45622(C19839 c19839) {
        try {
            return C23216.m51507(f64090) >= 0;
        } catch (RuntimeException e) {
            C19926.m45875("Shizuku peek user service error", e);
            return false;
        }
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ֫ */
    public final C12201 mo25342(long j, String str) {
        long j2;
        InterfaceC21955 interfaceC21955 = this.f64095;
        if (interfaceC21955 != null) {
            final C3610 c3610 = new C3610(interfaceC21955, str, j);
            Future futureSubmit = C1802.f6208.submit(new Callable() { // from class: l.ᩴ֨ۢ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return (C21250) c3610.get();
                }
            });
            if (j <= 0) {
                j2 = 0;
            } else {
                try {
                    long jMax = Math.max(300L, Math.min(1500L, j / 4));
                    j2 = C13132.FOREVER_NS;
                    if (j < C13132.FOREVER_NS - jMax) {
                        j2 = j + jMax;
                    }
                } catch (InterruptedException e) {
                    futureSubmit.cancel(true);
                    Thread.currentThread().interrupt();
                    return new C12201(e.toString(), new String[0]);
                } catch (ExecutionException e2) {
                    throw new RuntimeException(e2);
                } catch (TimeoutException unused) {
                    futureSubmit.cancel(true);
                    m45628(true);
                    return new C12201("Binder response timeout", new String[0]);
                }
            }
            return m45614((C21250) (j2 > 0 ? futureSubmit.get(j2, TimeUnit.MILLISECONDS) : futureSubmit.get()));
        }
        return new C12201("Closed", new String[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21250 m45616(InterfaceC21955 interfaceC21955, String str, long j) {
        try {
            return m45615(((C14898) interfaceC21955).f45453.mo19482(j > 2147483647L ? Integer.MAX_VALUE : (int) j, "sh", str + "\nexit\n"));
        } catch (RemoteException e) {
            return new C21250(2, new C12201(e.toString(), new String[0]), true);
        } catch (IOException e2) {
            return new C21250(2, new C12201(e2.toString(), new String[0]), true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12201 m45614(C21250 c21250) {
        if (c21250.f68476) {
            m45628(true);
            return c21250.f68474;
        }
        if (c21250.f68475 != 1) {
            m45630();
            return c21250.f68474;
        }
        synchronized (this) {
            int i = this.f64097 + 1;
            this.f64097 = i;
            if (i >= 3) {
                m45628(true);
            }
        }
        return c21250.f68474;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static long m45626() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21250 m45615(Bundle bundle) throws IOException {
        if (bundle == null) {
            return new C21250(2, new C12201("Empty result", new String[0]), false);
        }
        return new C21250(bundle.getInt(c.a, 2), new C12201(m45613(d.O, "error_gzip", bundle), m45613("output", "output_gzip", bundle).split("\n")), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m45613(String str, String str2, Bundle bundle) throws IOException {
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

    @Override // l.InterfaceC10085
    public final int getUid() {
        return this.f64096;
    }

    @Override // l.InterfaceC10085
    public final void close() {
        m45628(false);
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25345() {
        return this.f64092 && this.f64095 != null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m45634() {
        C14898 c14898 = f64088;
        if (c14898 == null) {
            return false;
        }
        try {
            this.f64096 = c14898.f45453.mo19481();
            this.f64095 = c14898;
            this.f64094 = true;
            synchronized (f64087) {
                ArrayList arrayList = f64091;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            this.f64093.countDown();
            return true;
        } catch (RemoteException unused) {
            m45632();
            return false;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m45627() {
        C14898 c14898 = f64088;
        if (c14898 == null) {
            return false;
        }
        try {
            c14898.f45453.mo19481();
            return true;
        } catch (RemoteException unused) {
            m45632();
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m45631() throws InterruptedException {
        long jM45626 = m45626() + 5000;
        while (f64088 == null) {
            long jM45627 = jM45626 - m45626();
            if (jM45627 > 0) {
                Thread.sleep(Math.min(200L, jM45627));
            } else {
                try {
                    C11928 c11928 = f64090;
                    if (C23216.m51507(c11928) >= 0) {
                        C19926.m45878("Shizuku shared callback still pending, request connected callback again");
                        C23216.m51512(c11928, f64089);
                        long jM45628 = m45626() + 10000;
                        while (C23216.m51507(f64090) >= 0) {
                            try {
                                if (f64088 != null) {
                                    return true;
                                }
                                long jM45629 = jM45628 - m45626();
                                if (jM45629 <= 0) {
                                    break;
                                }
                                Thread.sleep(Math.min(200L, jM45629));
                            } catch (RuntimeException e) {
                                C19926.m45875("Shizuku peek shared user service error", e);
                            }
                        }
                        if (f64088 != null) {
                            return true;
                        }
                    }
                    return false;
                } catch (RuntimeException e2) {
                    C19926.m45875("Shizuku peek shared user service error", e2);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000d  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private synchronized void m45628(boolean z) {
        boolean z2;
        if (z) {
            try {
                if (this.f64094) {
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
        this.f64092 = false;
        m45624();
        this.f64094 = false;
        this.f64095 = null;
        if (z2) {
            try {
                C23216.m51519(f64090);
            } catch (RuntimeException unused) {
            }
            m45632();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45619(C14898 c14898) {
        f64088 = c14898;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m45632() {
        f64088 = null;
        for (C19839 c19839 : m45623()) {
            if (c19839.f64092) {
                c19839.f64094 = false;
                c19839.f64095 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m45624() {
        synchronized (f64087) {
            f64091.remove(this);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C19839[] m45623() {
        C19839[] c19839Arr;
        synchronized (f64087) {
            c19839Arr = (C19839[]) f64091.toArray(new C19839[0]);
        }
        return c19839Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45620(C19839 c19839, C14898 c14898) {
        if (c19839.f64092) {
            c19839.f64095 = c14898;
            c19839.f64094 = true;
            c19839.f64093.countDown();
        }
    }
}
