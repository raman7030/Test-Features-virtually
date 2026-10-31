package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ܿ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17613 implements InterfaceC7505 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C5127 f53806;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Throwable f53807;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f53808;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C20177 f53809;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C3104 f53810;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f53811;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f53812;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f53813;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Thread f53814;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f53815;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f53816;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C7693 f53817;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final long f53818;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f53819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public RunnableC20394 f53820;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public RunnableC20394 f53821;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f53822;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f53823;

    public C17613(InterfaceC21449 interfaceC21449, C3104 c3104, long j, C20177 c20177) {
        C5127 c5127 = new C5127();
        this.f53815 = new Object();
        this.f53822 = new Object();
        if (j <= 0) {
            throw new IllegalArgumentException("MPEG-TS segment length must be positive");
        }
        int iMin = (int) ((Math.min(j, 524144) / 188) * 188);
        if (iMin < 940) {
            throw new IllegalArgumentException("MPEG-TS segment is too short to preview");
        }
        this.f53816 = interfaceC21449;
        this.f53810 = c3104;
        this.f53818 = j;
        this.f53819 = iMin;
        this.f53809 = c20177;
        this.f53806 = c5127;
    }

    @Override // l.InterfaceC7505
    public final long length() {
        m41175();
        return this.f53823;
    }

    @Override // l.InterfaceC7505
    /* JADX INFO: renamed from: ۧ */
    public final void mo8637(long j, byte[] bArr, int i, int i2) {
        m41175();
        synchronized (this.f53822) {
            m41176();
            if (j < 0 || i < 0 || i2 < 0 || i > bArr.length - i2 || j > ((long) this.f53823) - ((long) i2)) {
                throw new EOFException("MPEG-TS preview read exceeds clip length");
            }
            byte[] bArr2 = this.f53813;
            if (bArr2 == null) {
                throw new InterruptedIOException("MPEG-TS preview clip was closed");
            }
            System.arraycopy(bArr2, (int) j, bArr, i, i2);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0069 */
    /* JADX WARN: Code duplicated, block: B:106:? A[Catch: all -> 0x00a4, SYNTHETIC, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000a, B:9:0x000c, B:11:0x0010, B:12:0x0015, B:13:0x001a, B:23:0x0048, B:24:0x004a, B:29:0x0056, B:33:0x005a, B:68:0x0086, B:69:0x0088, B:75:0x0096, B:76:0x009d, B:79:0x00a0, B:82:0x00a3, B:14:0x001b, B:15:0x0024, B:25:0x004b, B:27:0x0053, B:28:0x0055, B:70:0x0089, B:72:0x0091, B:73:0x0093), top: B:89:0x0003, inners: #0, #13, #16 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0091 A[Catch: all -> 0x009e, TryCatch #16 {, blocks: (B:70:0x0089, B:72:0x0091, B:73:0x0093), top: B:96:0x0089, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0096 A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000a, B:9:0x000c, B:11:0x0010, B:12:0x0015, B:13:0x001a, B:23:0x0048, B:24:0x004a, B:29:0x0056, B:33:0x005a, B:68:0x0086, B:69:0x0088, B:75:0x0096, B:76:0x009d, B:79:0x00a0, B:82:0x00a3, B:14:0x001b, B:15:0x0024, B:25:0x004b, B:27:0x0053, B:28:0x0055, B:70:0x0089, B:72:0x0091, B:73:0x0093), top: B:89:0x0003, inners: #0, #13, #16 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r1 = r8.f53822;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r8.f53814 != java.lang.Thread.currentThread()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r8.f53814 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m41175() {
        Throwable th;
        C7546 c7546M41170;
        synchronized (this.f53815) {
            if (this.f53811) {
                m41176();
                return;
            }
            if (this.f53808) {
                m41172(this.f53807);
            }
            this.f53808 = true;
            synchronized (this.f53822) {
                m41176();
                this.f53814 = Thread.currentThread();
            }
            try {
                try {
                    m41176();
                    c7546M41170 = m41170();
                    try {
                        synchronized (this.f53822) {
                            try {
                                m41176();
                                this.f53813 = c7546M41170.f23313;
                                this.f53823 = c7546M41170.f23315;
                                this.f53817 = c7546M41170.f23316;
                                try {
                                    this.f53811 = true;
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (true) {
                                        break;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        try {
                            break;
                            throw th;
                        } catch (IOException e) {
                            e = e;
                            this.f53807 = e;
                            throw e;
                        } catch (Error e2) {
                            e = e2;
                            this.f53807 = e;
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            this.f53807 = e;
                            throw e;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        this = this;
                        this.f53807 = e;
                        throw e;
                    } catch (Error e5) {
                        e = e5;
                        this = this;
                        this.f53807 = e;
                        throw e;
                    } catch (RuntimeException e6) {
                        e = e6;
                        this = this;
                        this.f53807 = e;
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        synchronized (this.f53822) {
                            if (this.f53814 == Thread.currentThread()) {
                                this.f53814 = null;
                            }
                        }
                        if (c7546M41170 != null) {
                            throw th;
                        }
                        c7546M41170.f23316.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e7) {
                e = e7;
                this = this;
                this.f53807 = e;
                throw e;
            } catch (Error e8) {
                e = e8;
                this = this;
                this.f53807 = e;
                throw e;
            } catch (RuntimeException e9) {
                e = e9;
                this = this;
                this.f53807 = e;
                throw e;
            } catch (Throwable th6) {
                th = th6;
                c7546M41170 = null;
                synchronized (this.f53822) {
                    if (this.f53814 == Thread.currentThread()) {
                        this.f53814 = null;
                    }
                    if (c7546M41170 != null) {
                        throw th;
                    }
                    c7546M41170.f23316.close();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7546 m41170() throws IOException {
        C1594 c1594M5449 = C1594.m5449();
        int i = this.f53819;
        C7693 c7693M5453 = c1594M5449.m5453(i);
        if (c7693M5453 == null) {
            throw new IOException("MPEG-TS preview memory budget is exhausted");
        }
        try {
            byte[] bArr = new byte[i];
            C4515 c4515M9467 = this.f53810.m9467();
            long j = i;
            c4515M9467.m13280(j);
            RunnableC20394 runnableC20394M41171 = m41171(c4515M9467.m13278());
            Throwable th = null;
            try {
                try {
                    long jM46712 = runnableC20394M41171.m46712();
                    if (jM46712 != -1 && jM46712 < j) {
                        throw new EOFException("MPEG-TS preview source is shorter than expected");
                    }
                    C2091 c2091 = new C2091(this.f53816, bArr, this.f53819, this.f53818, new C13895(this));
                    C16184 c16184 = new C16184(c2091, 0L, this.f53818);
                    C11264 c11264 = new C11264();
                    C15729 c15729M14680 = this.f53806.m14680();
                    if (!c15729M14680.mo4841(c16184)) {
                        throw new IOException("MPEG-TS preview source could not be recognized");
                    }
                    if (m41169(c2091.m6870(), bArr) < 0) {
                        throw new IOException("MPEG-TS preview packet alignment is invalid");
                    }
                    c16184.mo22066();
                    c15729M14680.mo4840(c11264);
                    C23615 c23615 = new C23615();
                    while (!c11264.m27875()) {
                        m41176();
                        int iMo4837 = c15729M14680.mo4837(c16184, c23615);
                        if (iMo4837 == 1) {
                            throw new IOException("Unexpected seek while scanning MPEG-TS preview");
                        }
                        if (iMo4837 == -1) {
                            break;
                        }
                    }
                    if (!c11264.m27875()) {
                        throw new IOException("No decodable video keyframe found in MPEG-TS preview");
                    }
                    int iM41169 = m41169(c2091.m6870(), bArr);
                    int iM6870 = (((c2091.m6870() - iM41169) / 188) * 188) + iM41169;
                    if (iM6870 <= 0) {
                        throw new IOException("MPEG-TS preview does not contain a complete packet");
                    }
                    C7546 c7546 = new C7546(iM6870, c11264.m27876(), c7693M5453, bArr);
                    try {
                        try {
                            runnableC20394M41171.m46711();
                            m41174(runnableC20394M41171);
                            return c7546;
                        } catch (Throwable th2) {
                            m41174(runnableC20394M41171);
                            throw th2;
                        }
                    } catch (IOException | Error | RuntimeException e) {
                        throw e;
                    }
                } catch (Throwable th3) {
                    try {
                        try {
                            runnableC20394M41171.m46711();
                        } catch (Throwable th4) {
                            m41174(runnableC20394M41171);
                            throw th4;
                        }
                    } catch (IOException | Error | RuntimeException e2) {
                        if (0 != 0 && null != e2) {
                            th.addSuppressed(e2);
                        } else if (0 == 0) {
                            throw e2;
                        }
                    }
                    m41174(runnableC20394M41171);
                    throw th3;
                }
            } catch (IOException | Error | RuntimeException e3) {
                throw e3;
            }
        } catch (Throwable th5) {
            c7693M5453.close();
            throw th5;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0069 */
    /* JADX WARN: Code duplicated, block: B:55:0x0075 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #9 {all -> 0x007c, blocks: (B:55:0x0075, B:56:0x0079), top: B:88:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0079 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #9 {all -> 0x007c, blocks: (B:55:0x0075, B:56:0x0079), top: B:88:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0083 A[Catch: all -> 0x0087, TryCatch #4 {, blocks: (B:59:0x007f, B:61:0x0083, B:62:0x0085), top: B:77:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:67:0x008a  */
    /* JADX WARN: Code duplicated, block: B:77:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r7.f53812 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r7.f53820 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r1.m46713() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r7.f53820 = null;
        r7.f53821 = r1;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r2 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r1.m46709();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        throw new java.io.InterruptedIOException("MPEG-TS preview read was canceled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r1.m46708();
        r0 = r7.f53822;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private RunnableC20394 m41171(C3104 c3104) throws Throwable {
        boolean z;
        RunnableC20394 runnableC20394;
        Throwable th;
        boolean z2;
        boolean z3;
        RunnableC20394 runnableC20395 = new RunnableC20394(this.f53816, c3104, C10767.m26979());
        boolean z4 = false;
        try {
            synchronized (this.f53822) {
                try {
                    m41176();
                    this.f53820 = runnableC20395;
                    z = true;
                    try {
                        runnableC20395.m46710();
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = true;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z3 = false;
                }
            }
            try {
                break;
                throw th;
                synchronized (this.f53822) {
                    if (this.f53820 == runnableC20395) {
                        this.f53820 = null;
                    }
                }
                return runnableC20395;
            } catch (Throwable th4) {
                th = th4;
                z = z3;
                th = th;
                z2 = z4;
                runnableC20394 = runnableC20395;
                if (!z2) {
                    try {
                        if (z) {
                            runnableC20394.m46709();
                        } else {
                            runnableC20394.m46711();
                        }
                    } catch (Throwable unused) {
                    }
                    synchronized (this.f53822) {
                        if (this.f53820 == runnableC20394) {
                            this.f53820 = null;
                        }
                    }
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th5) {
            z = false;
            this = this;
            runnableC20394 = runnableC20395;
            th = th5;
            z2 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41174(RunnableC20394 runnableC20394) {
        synchronized (this.f53822) {
            if (this.f53821 == runnableC20394) {
                this.f53821 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0038  */
    /* JADX WARN: Code duplicated, block: B:41:0x004d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RunnableC20394 runnableC20394;
        RunnableC20394 runnableC20395;
        Thread thread;
        C7693 c7693;
        synchronized (this.f53822) {
            this.f53812 = true;
            runnableC20394 = this.f53820;
            runnableC20395 = this.f53821;
            thread = this.f53814;
        }
        if (runnableC20394 != null) {
            try {
                runnableC20394.m46709();
            } catch (Throwable th) {
                th = th;
            }
        }
        th = null;
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (runnableC20395 != null) {
            try {
                runnableC20395.m46711();
            } catch (Throwable th2) {
                th = th2;
                if (th != null) {
                    if (th != th) {
                        th.addSuppressed(th);
                    }
                }
                if (thread != Thread.currentThread()) {
                    synchronized (this.f53815) {
                    }
                }
                synchronized (this.f53822) {
                    this.f53813 = null;
                    c7693 = this.f53817;
                    this.f53817 = null;
                    if (c7693 != null) {
                        c7693.close();
                    }
                    m41172(th);
                }
            }
        }
        th = th;
        if (thread != Thread.currentThread()) {
            synchronized (this.f53815) {
            }
        }
        synchronized (this.f53822) {
            this.f53813 = null;
            c7693 = this.f53817;
            this.f53817 = null;
        }
        if (c7693 != null) {
            c7693.close();
        }
        m41172(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m41176() throws InterruptedIOException {
        if (this.f53812 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("MPEG-TS preview read was canceled");
        }
        this.f53809.getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41169(int i, byte[] bArr) {
        int iMin = Math.min(187, i - 940);
        for (int i2 = 0; i2 <= iMin; i2++) {
            for (int i3 = 0; i3 < 5; i3++) {
                if ((bArr[(i3 * 188) + i2] & 255) != 71) {
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41172(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th != null) {
            throw new IOException("MPEG-TS preview operation failed", th);
        }
    }
}
