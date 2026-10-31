package l;

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
public final class C0991 implements AutoCloseable {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f3693 = Pattern.compile("(?i)^bytes\\s+0-0/(\\d+)$");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f3694;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f3695;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19337 f3696;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19337 f3697;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f3698;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private synchronized void m3462() {
        if (this.f3694 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("HTTP range probe was canceled");
        }
    }

    public C0991() {
        ThreadPoolExecutor threadPoolExecutorM26979 = C10767.m26979();
        this.f3698 = new HashMap();
        this.f3695 = threadPoolExecutorM26979;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0285 m3463(Uri uri, InterfaceC15097 interfaceC15097) throws IOException {
        EnumC5225 enumC5225;
        C0285 c0285M3461;
        String strM47724 = C20892.m47724(uri, interfaceC15097);
        synchronized (this) {
            C18631 c18631 = (C18631) C13843.computeIfAbsent(this.f3698, strM47724, new C2403());
            while (true) {
                EnumC5225 enumC5226 = c18631.f57791;
                enumC5225 = EnumC5225.PROBING;
                if (enumC5226 != enumC5225 || this.f3694) {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP range probe");
                }
            }
            m3462();
            C0285 c0285 = c18631.f57790;
            if (c0285 != null) {
                return c0285;
            }
            IOException iOException = c18631.f57789;
            if (iOException != null) {
                throw iOException;
            }
            c18631.f57791 = enumC5225;
            try {
                c0285M3461 = m3461(uri, interfaceC15097);
                e = null;
            } catch (IOException e) {
                e = e;
                c0285M3461 = null;
            }
            synchronized (this) {
                if (this.f3694) {
                    notifyAll();
                    throw new InterruptedIOException("HTTP range probe was canceled");
                }
                if (e == null) {
                    c18631.f57790 = c0285M3461;
                    c18631.f57791 = c0285M3461.f1631 ? EnumC5225.SUPPORTED : EnumC5225.UNSUPPORTED;
                } else if (Thread.currentThread().isInterrupted()) {
                    c18631.f57791 = EnumC5225.UNKNOWN;
                } else {
                    c18631.f57789 = e;
                    c18631.f57791 = EnumC5225.ERROR;
                }
                notifyAll();
            }
            if (e == null) {
                return c0285M3461;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C0285 m3461(final Uri uri, InterfaceC15097 interfaceC15097) throws IOException {
        final C19337 c19337;
        C0285 c0285;
        synchronized (this) {
            while (true) {
                C19337 c19338 = this.f3696;
                int i = (c19338 == null ? 0 : 1) + (this.f3697 == null ? 0 : 1);
                if ((c19338 == null && i < 2) || this.f3694) {
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
            m3462();
            c19337 = new C19337(interfaceC15097.mo6247());
            this.f3696 = c19337;
        }
        try {
            this.f3695.execute(new Runnable() { // from class: l.ۘ۠ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C0991.m3459(this.f12021, c19337, uri);
                }
            });
            synchronized (this) {
                while (!c19337.f60789 && !this.f3694) {
                    try {
                        wait();
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        c19337.f60786 = true;
                        if (this.f3696 == c19337 && this.f3697 == null) {
                            this.f3696 = null;
                            this.f3697 = c19337;
                            notifyAll();
                        }
                        throw new InterruptedIOException("Interrupted while opening HTTP range probe");
                    }
                }
                m3462();
                if (c19337.f60788) {
                    Thread.currentThread().interrupt();
                }
                Throwable th = c19337.f60787;
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                Throwable th2 = c19337.f60787;
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                Throwable th3 = c19337.f60787;
                if (th3 instanceof Error) {
                    throw ((Error) th3);
                }
                c0285 = c19337.f60791;
            }
            return c0285;
        } catch (RuntimeException e) {
            IOException iOException = new IOException("Unable to schedule HTTP range probe", e);
            m3460(c19337, iOException);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3460(C19337 c19337, IOException iOException) {
        synchronized (this) {
            if (this.f3696 == c19337) {
                this.f3696 = null;
            }
            c19337.f60787 = iOException;
            c19337.f60789 = true;
            notifyAll();
        }
        try {
            c19337.f60790.close();
        } catch (Throwable th) {
            iOException.addSuppressed(th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3459(C0991 c0991, C19337 c19337, Uri uri) {
        C19337 c19338;
        C19337 c19339;
        C19337 c193310;
        C19337 c193311;
        try {
            c0991.m3462();
            C0285 c0285M3458 = m3458(c19337.f60790, uri);
            try {
                c19337.f60790.close();
                boolean zInterrupted = Thread.interrupted();
                synchronized (c0991) {
                    if (c0991.f3696 == c19337) {
                        c0991.f3696 = null;
                    }
                    if (c0991.f3697 == c19337) {
                        c0991.f3697 = null;
                    }
                    if (c0991.f3697 == null && (c193311 = c0991.f3696) != null && c193311.f60786) {
                        c0991.f3697 = c0991.f3696;
                        c0991.f3696 = null;
                    }
                    c19337.f60791 = c0285M3458;
                    c19337.f60787 = null;
                    c19337.f60788 = zInterrupted;
                    c19337.f60789 = true;
                    c0991.notifyAll();
                }
            } catch (Throwable unused) {
                boolean zInterrupted2 = Thread.interrupted();
                synchronized (c0991) {
                    if (c0991.f3696 == c19337) {
                        c0991.f3696 = null;
                    }
                    if (c0991.f3697 == c19337) {
                        c0991.f3697 = null;
                    }
                    if (c0991.f3697 == null && (c193310 = c0991.f3696) != null && c193310.f60786) {
                        c0991.f3697 = c0991.f3696;
                        c0991.f3696 = null;
                    }
                    c19337.f60791 = c0285M3458;
                    c19337.f60787 = null;
                    c19337.f60788 = zInterrupted2;
                    c19337.f60789 = true;
                    c0991.notifyAll();
                }
            }
        } catch (Throwable th) {
            try {
                c19337.f60790.close();
                boolean zInterrupted3 = Thread.interrupted();
                synchronized (c0991) {
                    if (c0991.f3696 == c19337) {
                        c0991.f3696 = null;
                    }
                    if (c0991.f3697 == c19337) {
                        c0991.f3697 = null;
                    }
                    if (c0991.f3697 == null && (c19339 = c0991.f3696) != null && c19339.f60786) {
                        c0991.f3697 = c0991.f3696;
                        c0991.f3696 = null;
                    }
                    c19337.f60791 = null;
                    c19337.f60787 = th;
                    c19337.f60788 = zInterrupted3;
                    c19337.f60789 = true;
                    c0991.notifyAll();
                }
            } catch (Throwable unused2) {
                boolean zInterrupted4 = Thread.interrupted();
                synchronized (c0991) {
                    if (c0991.f3696 == c19337) {
                        c0991.f3696 = null;
                    }
                    if (c0991.f3697 == c19337) {
                        c0991.f3697 = null;
                    }
                    if (c0991.f3697 == null && (c19338 = c0991.f3696) != null && c19338.f60786) {
                        c0991.f3697 = c0991.f3696;
                        c0991.f3696 = null;
                    }
                    c19337.f60791 = null;
                    c19337.f60787 = th;
                    c19337.f60788 = zInterrupted4;
                    c19337.f60789 = true;
                    c0991.notifyAll();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0285 m3458(InterfaceC21449 interfaceC21449, Uri uri) throws C23770 {
        long j;
        try {
            C4515 c4515 = new C4515();
            c4515.m13281(uri);
            c4515.m13286(0L);
            c4515.m13280(1L);
            long jMo1620 = interfaceC21449.mo1620(c4515.m13278());
            Map mapMo5936 = interfaceC21449.mo5936();
            long jM3456 = (interfaceC21449 instanceof InterfaceC20949 ? ((InterfaceC20949) interfaceC21449).mo19698() : -1) == 206 ? m3456(m3457("Content-Range", mapMo5936)) : -1L;
            if (jM3456 != -1) {
                return new C0285(jM3456, true);
            }
            String strM3457 = m3457("Content-Length", mapMo5936);
            if (strM3457 != null) {
                try {
                    j = Long.parseLong(strM3457);
                    if (j < 0) {
                        j = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                j = -1;
            }
            if (j != -1 || jMo1620 <= 1) {
                jMo1620 = j;
            }
            return new C0285(jMo1620, false);
        } catch (C23770 e) {
            if (e.f76941 == 416) {
                return new C0285(-1L, false);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m3456(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = f3693.matcher(str.trim());
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3457(String str, Map map) {
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
            this.f3694 = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3464() {
        synchronized (this) {
            this.f3694 = true;
            notifyAll();
        }
    }
}
