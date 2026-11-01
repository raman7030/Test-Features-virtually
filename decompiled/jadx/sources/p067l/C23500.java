package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩹ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23500 implements Closeable {

    /* JADX INFO: renamed from: ܺ֫ */
    public static final ThreadPoolExecutor f74864 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C21407.m48493("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: ֫֫ */
    public C4210 f74865;

    /* JADX INFO: renamed from: ۙ */
    public final LinkedHashSet f74867;

    /* JADX INFO: renamed from: ۟ */
    public int f74870;

    /* JADX INFO: renamed from: ۡ֫ */
    public final ScheduledThreadPoolExecutor f74871;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C8077 f74872;

    /* JADX INFO: renamed from: ۤ */
    public final String f74873;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C4210 f74874;

    /* JADX INFO: renamed from: ܰ */
    public final AbstractC2712 f74878;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f74879;

    /* JADX INFO: renamed from: ܽ֫ */
    public final ThreadPoolExecutor f74880;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C22830 f74881;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final InterfaceC9418 f74882;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f74883;

    /* JADX INFO: renamed from: ᩹ */
    public long f74886;

    /* JADX INFO: renamed from: ᩺ */
    public int f74887;

    /* JADX INFO: renamed from: ᩻֫ */
    public final Socket f74888;

    /* JADX INFO: renamed from: ۜ֫ */
    public final LinkedHashMap f74869 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۛ */
    public long f74868 = 0;

    /* JADX INFO: renamed from: ۨ */
    public long f74875 = 0;

    /* JADX INFO: renamed from: ۗ */
    public long f74866 = 0;

    /* JADX INFO: renamed from: ۫ */
    public long f74876 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public long f74885 = 0;

    /* JADX INFO: renamed from: ۬ */
    public long f74877 = 0;

    /* JADX INFO: renamed from: ᩷֫ */
    public long f74884 = 0;

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m52238(AbstractRunnableC16711 abstractRunnableC16711) {
        if (!this.f74879) {
            this.f74880.execute(abstractRunnableC16711);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized int m52250() {
        return this.f74874.m8552();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C12101 m52251(int i) {
        return (C12101) this.f74869.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C12101 m52262(int i) {
        C12101 c12101;
        c12101 = (C12101) this.f74869.remove(Integer.valueOf(i));
        notifyAll();
        return c12101;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m52264(long j) {
        if (this.f74879) {
            return false;
        }
        return this.f74876 >= this.f74866 || j < this.f74877;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void m52267(long j) {
        long j2 = this.f74884 + j;
        this.f74884 = j2;
        if (j2 >= this.f74865.m8550() / 2) {
            m52254(0, this.f74884);
            this.f74884 = 0L;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public static /* synthetic */ void m52241(C23500 c23500) {
        c23500.f74885++;
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m52245(C23500 c23500) {
        c23500.f74875++;
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ void m52246(C23500 c23500) {
        c23500.f74868++;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static /* synthetic */ void m52248(C23500 c23500) {
        c23500.f74876++;
    }

    public C23500(C6066 c6066) {
        C4210 c4210 = new C4210();
        this.f74865 = c4210;
        C4210 c4211 = new C4210();
        this.f74874 = c4211;
        this.f74867 = new LinkedHashSet();
        this.f74882 = InterfaceC9418.f25707;
        this.f74883 = true;
        this.f74878 = c6066.f15255;
        this.f74870 = 3;
        c4210.m8548(7, 16777216);
        String str = c6066.f15254;
        this.f74873 = str;
        Locale locale = Locale.US;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C21407.m48493("OkHttp " + str + " Writer", false));
        this.f74871 = scheduledThreadPoolExecutor;
        if (c6066.f15257 != 0) {
            C20148 c20148 = new C20148(this);
            long j = c6066.f15257;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c20148, j, j, TimeUnit.MILLISECONDS);
        }
        this.f74880 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C21407.m48493("OkHttp " + str + " Push Observer", true));
        c4211.m8548(7, 65535);
        c4211.m8548(5, 16384);
        this.f74886 = (long) c4211.m8550();
        this.f74888 = c6066.f15258;
        this.f74872 = new C8077(c6066.f15259);
        this.f74881 = new C22830(this, new C6736(c6066.f15256));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12101 m52252(ArrayList arrayList, boolean z) {
        int i;
        C12101 c12101;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.f74872) {
            synchronized (this) {
                try {
                    if (this.f74870 > 1073741823) {
                        m52260(EnumC15197.REFUSED_STREAM);
                    }
                    if (this.f74879) {
                        throw new C23915();
                    }
                    i = this.f74870;
                    this.f74870 = i + 2;
                    c12101 = new C12101(i, this, z3, false, null);
                    z2 = !z || this.f74886 == 0 || c12101.f33827 == 0;
                    if (c12101.m27963()) {
                        this.f74869.put(Integer.valueOf(i), c12101);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f74872.m18747(arrayList, i, z3);
        }
        if (z2) {
            this.f74872.flush();
        }
        return c12101;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52257(int i, boolean z, C14268 c14268, long j) {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f74872.m18746(z, i, c14268, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f74886;
                        if (j2 <= 0) {
                            if (!this.f74869.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j2), this.f74872.m18749());
                j3 = iMin;
                this.f74886 -= j3;
            }
            j -= j3;
            this.f74872.m18746(z && j == 0, i, c14268, iMin);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52263(int i, EnumC15197 enumC15197) {
        try {
            this.f74871.execute(new C24841(this, new Object[]{this.f74873, Integer.valueOf(i)}, i, enumC15197));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52254(int i, long j) {
        try {
            this.f74871.execute(new C8748(this, new Object[]{this.f74873, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52253(int i, int i2, boolean z) {
        try {
            try {
                this.f74872.m18740(i, i2, z);
            } catch (IOException unused) {
                EnumC15197 enumC15197 = EnumC15197.PROTOCOL_ERROR;
                m52261(enumC15197, enumC15197);
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52260(EnumC15197 enumC15197) {
        synchronized (this.f74872) {
            synchronized (this) {
                if (this.f74879) {
                    return;
                }
                this.f74879 = true;
                this.f74872.m18743(this.f74887, enumC15197, C21407.f67526);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m52261(EnumC15197.NO_ERROR, EnumC15197.CANCEL);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52261(EnumC15197 enumC15197, EnumC15197 enumC15198) throws IOException {
        C12101[] c12101Arr = null;
        try {
            m52260(enumC15197);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f74869.isEmpty()) {
                c12101Arr = (C12101[]) this.f74869.values().toArray(new C12101[this.f74869.size()]);
                this.f74869.clear();
            }
        }
        if (c12101Arr != null) {
            for (C12101 c12101 : c12101Arr) {
                try {
                    c12101.m27959(enumC15198);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f74872.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f74888.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f74871.shutdown();
        this.f74880.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52239(C23500 c23500) {
        try {
            EnumC15197 enumC15197 = EnumC15197.PROTOCOL_ERROR;
            c23500.m52261(enumC15197, enumC15197);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m52266() {
        C8077 c8077 = this.f74872;
        c8077.m18738();
        C4210 c4210 = this.f74865;
        c8077.m18748(c4210);
        int iM8550 = c4210.m8550();
        if (iM8550 != 65535) {
            c8077.m18741(0, iM8550 - 65535);
        }
        new Thread(this.f74881).start();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m52265() {
        synchronized (this) {
            long j = this.f74876;
            long j2 = this.f74866;
            if (j < j2) {
                return;
            }
            this.f74866 = j2 + 1;
            this.f74877 = System.nanoTime() + 1000000000;
            try {
                this.f74871.execute(new C22160(this, this.f74873));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52258(ArrayList arrayList, int i) {
        synchronized (this) {
            if (this.f74867.contains(Integer.valueOf(i))) {
                m52263(i, EnumC15197.PROTOCOL_ERROR);
                return;
            }
            this.f74867.add(Integer.valueOf(i));
            try {
                m52238(new C11431(this, new Object[]{this.f74873, Integer.valueOf(i)}, i, arrayList));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52259(ArrayList arrayList, int i, boolean z) {
        try {
            m52238(new C10760(this, new Object[]{this.f74873, Integer.valueOf(i)}, i, arrayList, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52255(int i, InterfaceC8233 interfaceC8233, int i2, boolean z) throws IOException {
        C14268 c14268 = new C14268();
        long j = i2;
        interfaceC8233.mo14218(j);
        interfaceC8233.mo6580(c14268, j);
        if (c14268.size() != j) {
            throw new IOException(c14268.size() + " != " + i2);
        }
        m52238(new C17464(this, new Object[]{this.f74873, Integer.valueOf(i)}, i, c14268, i2, z));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52256(int i, EnumC15197 enumC15197) {
        m52238(new C4725(this, new Object[]{this.f74873, Integer.valueOf(i)}, i, enumC15197));
    }
}
