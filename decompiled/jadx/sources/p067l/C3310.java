package p067l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4748 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3310 implements AutoCloseable {

    /* JADX INFO: renamed from: ۬ */
    public static final Pattern f6468 = Pattern.compile("(?i)^bytes\\s+0-0/(\\d+)$");

    /* JADX INFO: renamed from: ۗ */
    public boolean f6469;

    /* JADX INFO: renamed from: ۙ */
    public final ThreadPoolExecutor f6470;

    /* JADX INFO: renamed from: ᩶ */
    public C20746 f6471;

    /* JADX INFO: renamed from: ᩸ */
    public C20746 f6472;

    /* JADX INFO: renamed from: ᩹ */
    public final HashMap f6473;

    /* JADX INFO: renamed from: ܽ */
    private synchronized void m5765() {
        if (this.f6469 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("HTTP range probe was canceled");
        }
    }

    public C3310() {
        ThreadPoolExecutor threadPoolExecutorM29024 = C12601.m29024();
        this.f6473 = new HashMap();
        this.f6470 = threadPoolExecutorM29024;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2639 m5766(Uri uri, InterfaceC16716 interfaceC16716) throws IOException {
        EnumC7334 enumC7334;
        C2639 c2639M5764;
        String strM50054 = C22224.m50054(uri, interfaceC16716);
        synchronized (this) {
            C20075 c20075 = (C20075) C15525.computeIfAbsent(this.f6473, strM50054, new C4652());
            while (true) {
                EnumC7334 enumC7335 = c20075.f61014;
                enumC7334 = EnumC7334.PROBING;
                if (enumC7335 != enumC7334 || this.f6469) {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP range probe");
                }
            }
            m5765();
            C2639 c2639 = c20075.f61013;
            if (c2639 != null) {
                return c2639;
            }
            IOException iOException = c20075.f61012;
            if (iOException != null) {
                throw iOException;
            }
            c20075.f61014 = enumC7334;
            try {
                c2639M5764 = m5764(uri, interfaceC16716);
                e = null;
            } catch (IOException e) {
                e = e;
                c2639M5764 = null;
            }
            synchronized (this) {
                if (this.f6469) {
                    notifyAll();
                    throw new InterruptedIOException("HTTP range probe was canceled");
                }
                if (e == null) {
                    c20075.f61013 = c2639M5764;
                    c20075.f61014 = c2639M5764.f4409 ? EnumC7334.SUPPORTED : EnumC7334.UNSUPPORTED;
                } else if (Thread.currentThread().isInterrupted()) {
                    c20075.f61014 = EnumC7334.UNKNOWN;
                } else {
                    c20075.f61012 = e;
                    c20075.f61014 = EnumC7334.ERROR;
                }
                notifyAll();
            }
            if (e == null) {
                return c2639M5764;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C2639 m5764(final Uri uri, InterfaceC16716 interfaceC16716) throws IOException {
        final C20746 c20746;
        C2639 c2639;
        synchronized (this) {
            while (true) {
                C20746 c20747 = this.f6471;
                int i = (c20747 == null ? 0 : 1) + (this.f6472 == null ? 0 : 1);
                if ((c20747 == null && i < 2) || this.f6469) {
                    break;
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP range open");
                }
            }
            m5765();
            c20746 = new C20746(interfaceC16716.mo8449());
            this.f6471 = c20746;
        }
        try {
            this.f6470.execute(new Runnable() { // from class: l.ۘ۠ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C3310.m5762(this.f14829, c20746, uri);
                }
            });
            synchronized (this) {
                while (!c20746.f64021 && !this.f6469) {
                    try {
                        wait();
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        c20746.f64018 = true;
                        if (this.f6471 == c20746 && this.f6472 == null) {
                            this.f6471 = null;
                            this.f6472 = c20746;
                            notifyAll();
                        }
                        throw new InterruptedIOException("Interrupted while opening HTTP range probe");
                    }
                }
                m5765();
                if (c20746.f64020) {
                    Thread.currentThread().interrupt();
                }
                Throwable th = c20746.f64019;
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                Throwable th2 = c20746.f64019;
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                Throwable th3 = c20746.f64019;
                if (th3 instanceof Error) {
                    throw ((Error) th3);
                }
                c2639 = c20746.f64023;
            }
            return c2639;
        } catch (RuntimeException e) {
            IOException iOException = new IOException("Unable to schedule HTTP range probe", e);
            m5763(c20746, iOException);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5763(C20746 c20746, IOException iOException) {
        synchronized (this) {
            if (this.f6471 == c20746) {
                this.f6471 = null;
            }
            c20746.f64019 = iOException;
            c20746.f64021 = true;
            notifyAll();
        }
        try {
            c20746.f64022.close();
        } catch (Throwable th) {
            iOException.addSuppressed(th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5762(C3310 c3310, C20746 c20746, Uri uri) {
        C20746 c20747;
        C20746 c20748;
        C20746 c20749;
        C20746 c207410;
        try {
            c3310.m5765();
            C2639 c2639M5761 = m5761(c20746.f64022, uri);
            try {
                c20746.f64022.close();
                boolean zInterrupted = Thread.interrupted();
                synchronized (c3310) {
                    if (c3310.f6471 == c20746) {
                        c3310.f6471 = null;
                    }
                    if (c3310.f6472 == c20746) {
                        c3310.f6472 = null;
                    }
                    if (c3310.f6472 == null && (c207410 = c3310.f6471) != null && c207410.f64018) {
                        c3310.f6472 = c3310.f6471;
                        c3310.f6471 = null;
                    }
                    c20746.f64023 = c2639M5761;
                    c20746.f64019 = null;
                    c20746.f64020 = zInterrupted;
                    c20746.f64021 = true;
                    c3310.notifyAll();
                }
            } catch (Throwable unused) {
                boolean zInterrupted2 = Thread.interrupted();
                synchronized (c3310) {
                    if (c3310.f6471 == c20746) {
                        c3310.f6471 = null;
                    }
                    if (c3310.f6472 == c20746) {
                        c3310.f6472 = null;
                    }
                    if (c3310.f6472 == null && (c20749 = c3310.f6471) != null && c20749.f64018) {
                        c3310.f6472 = c3310.f6471;
                        c3310.f6471 = null;
                    }
                    c20746.f64023 = c2639M5761;
                    c20746.f64019 = null;
                    c20746.f64020 = zInterrupted2;
                    c20746.f64021 = true;
                    c3310.notifyAll();
                }
            }
        } catch (Throwable th) {
            try {
                c20746.f64022.close();
                boolean zInterrupted3 = Thread.interrupted();
                synchronized (c3310) {
                    if (c3310.f6471 == c20746) {
                        c3310.f6471 = null;
                    }
                    if (c3310.f6472 == c20746) {
                        c3310.f6472 = null;
                    }
                    if (c3310.f6472 == null && (c20748 = c3310.f6471) != null && c20748.f64018) {
                        c3310.f6472 = c3310.f6471;
                        c3310.f6471 = null;
                    }
                    c20746.f64023 = null;
                    c20746.f64019 = th;
                    c20746.f64020 = zInterrupted3;
                    c20746.f64021 = true;
                    c3310.notifyAll();
                }
            } catch (Throwable unused2) {
                boolean zInterrupted4 = Thread.interrupted();
                synchronized (c3310) {
                    if (c3310.f6471 == c20746) {
                        c3310.f6471 = null;
                    }
                    if (c3310.f6472 == c20746) {
                        c3310.f6472 = null;
                    }
                    if (c3310.f6472 == null && (c20747 = c3310.f6471) != null && c20747.f64018) {
                        c3310.f6472 = c3310.f6471;
                        c3310.f6471 = null;
                    }
                    c20746.f64023 = null;
                    c20746.f64019 = th;
                    c20746.f64020 = zInterrupted4;
                    c20746.f64021 = true;
                    c3310.notifyAll();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX INFO: renamed from: ֫ */
    public static C2639 m5761(InterfaceC22753 interfaceC22753, Uri uri) throws C24959 {
        long j;
        try {
            C6659 c6659 = new C6659();
            c6659.m15164(uri);
            c6659.m15169(0L);
            c6659.m15163(1L);
            long jMo4020 = interfaceC22753.mo4020(c6659.m15161());
            Map mapMo8131 = interfaceC22753.mo8131();
            long jM5759 = (interfaceC22753 instanceof InterfaceC22278 ? ((InterfaceC22278) interfaceC22753).mo21671() : -1) == 206 ? m5759(m5760("Content-Range", mapMo8131)) : -1L;
            if (jM5759 != -1) {
                return new C2639(jM5759, true);
            }
            String strM5760 = m5760("Content-Length", mapMo8131);
            if (strM5760 != null) {
                try {
                    j = Long.parseLong(strM5760);
                    if (j < 0) {
                        j = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                j = -1;
            }
            if (j != -1 || jMo4020 <= 1) {
                jMo4020 = j;
            }
            return new C2639(jMo4020, false);
        } catch (C24959 e) {
            if (e.f79694 == 416) {
                return new C2639(-1L, false);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m5759(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = f6468.matcher(str.trim());
        if (!matcher.matches()) {
            return -1L;
        }
        try {
            long j = Long.parseLong(matcher.group(1));
            if (j > 0) {
                return j;
            }
            return -1L;
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m5760(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).equalsIgnoreCase(str) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f6469 = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5767() {
        synchronized (this) {
            this.f6469 = true;
            notifyAll();
        }
    }
}
