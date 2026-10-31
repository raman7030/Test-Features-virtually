package l;

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
public final class C22235 implements Closeable {

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f72139 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C20032.m46177("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C1938 f72140;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f72142;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f72145;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f72146;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C6007 f72147;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f72148;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C1938 f72149;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC0362 f72153;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f72154;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f72155;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C21530 f72156;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7418 f72157;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f72158;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f72161;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f72162;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final Socket f72163;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f72144 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f72143 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f72150 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f72141 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f72151 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f72160 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f72152 = 0;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f72159 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m49910(AbstractRunnableC15091 abstractRunnableC15091) {
        if (!this.f72154) {
            this.f72155.execute(abstractRunnableC15091);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m49922() {
        return this.f72149.m6395();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C10241 m49923(int i) {
        return (C10241) this.f72144.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C10241 m49934(int i) {
        C10241 c10241;
        c10241 = (C10241) this.f72144.remove(Integer.valueOf(i));
        notifyAll();
        return c10241;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m49936(long j) {
        if (this.f72154) {
            return false;
        }
        return this.f72151 >= this.f72141 || j < this.f72152;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49939(long j) {
        long j2 = this.f72159 + j;
        this.f72159 = j2;
        if (j2 >= this.f72140.m6393() / 2) {
            m49926(0, this.f72159);
            this.f72159 = 0L;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49913(C22235 c22235) {
        c22235.f72160++;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49917(C22235 c22235) {
        c22235.f72150++;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49918(C22235 c22235) {
        c22235.f72143++;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49920(C22235 c22235) {
        c22235.f72151++;
    }

    public C22235(C3891 c3891) {
        C1938 c1938 = new C1938();
        this.f72140 = c1938;
        C1938 c1939 = new C1938();
        this.f72149 = c1939;
        this.f72142 = new LinkedHashSet();
        this.f72157 = InterfaceC7418.f22794;
        this.f72158 = true;
        this.f72153 = c3891.f12447;
        this.f72145 = 3;
        c1938.m6391(7, 16777216);
        String str = c3891.f12446;
        this.f72148 = str;
        Locale locale = Locale.US;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C20032.m46177("OkHttp " + str + " Writer", false));
        this.f72146 = scheduledThreadPoolExecutor;
        if (c3891.f12449 != 0) {
            C18708 c18708 = new C18708(this);
            long j = c3891.f12449;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c18708, j, j, TimeUnit.MILLISECONDS);
        }
        this.f72155 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C20032.m46177("OkHttp " + str + " Push Observer", true));
        c1939.m6391(7, 65535);
        c1939.m6391(5, 16384);
        this.f72161 = (long) c1939.m6393();
        this.f72163 = c3891.f12450;
        this.f72147 = new C6007(c3891.f12451);
        this.f72156 = new C21530(this, new C4596(c3891.f12448));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10241 m49924(ArrayList arrayList, boolean z) {
        int i;
        C10241 c10241;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.f72147) {
            synchronized (this) {
                try {
                    if (this.f72145 > 1073741823) {
                        m49932(EnumC13499.REFUSED_STREAM);
                    }
                    if (this.f72154) {
                        throw new C22672();
                    }
                    i = this.f72145;
                    this.f72145 = i + 2;
                    c10241 = new C10241(i, this, z3, false, null);
                    z2 = !z || this.f72161 == 0 || c10241.f30866 == 0;
                    if (c10241.m25941()) {
                        this.f72144.put(Integer.valueOf(i), c10241);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f72147.m16820(arrayList, i, z3);
        }
        if (z2) {
            this.f72147.flush();
        }
        return c10241;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49929(int i, boolean z, C12521 c12521, long j) {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f72147.m16819(z, i, c12521, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f72161;
                        if (j2 <= 0) {
                            if (!this.f72144.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j2), this.f72147.m16822());
                j3 = iMin;
                this.f72161 -= j3;
            }
            j -= j3;
            this.f72147.m16819(z && j == 0, i, c12521, iMin);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49935(int i, EnumC13499 enumC13499) {
        try {
            this.f72146.execute(new C23646(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, enumC13499));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49926(int i, long j) {
        try {
            this.f72146.execute(new C6713(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49925(int i, int i2, boolean z) {
        try {
            try {
                this.f72147.m16813(i, i2, z);
            } catch (IOException unused) {
                EnumC13499 enumC13499 = EnumC13499.PROTOCOL_ERROR;
                m49933(enumC13499, enumC13499);
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49932(EnumC13499 enumC13499) {
        synchronized (this.f72147) {
            synchronized (this) {
                if (this.f72154) {
                    return;
                }
                this.f72154 = true;
                this.f72147.m16816(this.f72162, enumC13499, C20032.f64884);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m49933(EnumC13499.NO_ERROR, EnumC13499.CANCEL);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49933(EnumC13499 enumC13499, EnumC13499 enumC134910) throws IOException {
        C10241[] c10241Arr = null;
        try {
            m49932(enumC13499);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f72144.isEmpty()) {
                c10241Arr = (C10241[]) this.f72144.values().toArray(new C10241[this.f72144.size()]);
                this.f72144.clear();
            }
        }
        if (c10241Arr != null) {
            for (C10241 c10241 : c10241Arr) {
                try {
                    c10241.m25937(enumC134910);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f72147.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f72163.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f72146.shutdown();
        this.f72155.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49911(C22235 c22235) {
        try {
            EnumC13499 enumC13499 = EnumC13499.PROTOCOL_ERROR;
            c22235.m49933(enumC13499, enumC13499);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49938() {
        C6007 c6007 = this.f72147;
        c6007.m16811();
        C1938 c1938 = this.f72140;
        c6007.m16821(c1938);
        int iM6393 = c1938.m6393();
        if (iM6393 != 65535) {
            c6007.m16814(0, iM6393 - 65535);
        }
        new Thread(this.f72156).start();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49937() {
        synchronized (this) {
            long j = this.f72151;
            long j2 = this.f72141;
            if (j < j2) {
                return;
            }
            this.f72141 = j2 + 1;
            this.f72152 = System.nanoTime() + 1000000000;
            try {
                this.f72146.execute(new C20825(this, this.f72148));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49930(ArrayList arrayList, int i) {
        synchronized (this) {
            if (this.f72142.contains(Integer.valueOf(i))) {
                m49935(i, EnumC13499.PROTOCOL_ERROR);
                return;
            }
            this.f72142.add(Integer.valueOf(i));
            try {
                m49910(new C9536(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, arrayList));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49931(ArrayList arrayList, int i, boolean z) {
        try {
            m49910(new C8830(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, arrayList, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49927(int i, InterfaceC6171 interfaceC6171, int i2, boolean z) throws IOException {
        C12521 c12521 = new C12521();
        long j = i2;
        interfaceC6171.mo12313(j);
        interfaceC6171.mo4334(c12521, j);
        if (c12521.size() != j) {
            throw new IOException(c12521.size() + " != " + i2);
        }
        m49910(new C15884(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, c12521, i2, z));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49928(int i, EnumC13499 enumC13499) {
        m49910(new C2480(this, new Object[]{this.f72148, Integer.valueOf(i)}, i, enumC13499));
    }
}
