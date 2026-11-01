package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ܿ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19108 implements InterfaceC9501 {

    /* JADX INFO: renamed from: ֫֫ */
    public final C7241 f57000;

    /* JADX INFO: renamed from: ۗ */
    public Throwable f57001;

    /* JADX INFO: renamed from: ۙ */
    public boolean f57002;

    /* JADX INFO: renamed from: ۛ */
    public final C21545 f57003;

    /* JADX INFO: renamed from: ۟ */
    public final C5318 f57004;

    /* JADX INFO: renamed from: ۤ */
    public boolean f57005;

    /* JADX INFO: renamed from: ۧ֫ */
    public volatile boolean f57006;

    /* JADX INFO: renamed from: ۨ */
    public byte[] f57007;

    /* JADX INFO: renamed from: ۫ */
    public Thread f57008;

    /* JADX INFO: renamed from: ۬ */
    public final Object f57009;

    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC22753 f57010;

    /* JADX INFO: renamed from: ܽ֫ */
    public C9680 f57011;

    /* JADX INFO: renamed from: ܿ֫ */
    public final long f57012;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int f57013;

    /* JADX INFO: renamed from: ᩶ */
    public RunnableC21751 f57014;

    /* JADX INFO: renamed from: ᩸ */
    public RunnableC21751 f57015;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f57016;

    /* JADX INFO: renamed from: ᩺ */
    public int f57017;

    public C19108(InterfaceC22753 interfaceC22753, C5318 c5318, long j, C21545 c21545) {
        C7241 c7241 = new C7241();
        this.f57009 = new Object();
        this.f57016 = new Object();
        if (j <= 0) {
            throw new IllegalArgumentException("MPEG-TS segment length must be positive");
        }
        int iMin = (int) ((Math.min(j, 524144) / 188) * 188);
        if (iMin < 940) {
            throw new IllegalArgumentException("MPEG-TS segment is too short to preview");
        }
        this.f57010 = interfaceC22753;
        this.f57004 = c5318;
        this.f57012 = j;
        this.f57013 = iMin;
        this.f57003 = c21545;
        this.f57000 = c7241;
    }

    @Override // p067l.InterfaceC9501
    public final long length() {
        m43421();
        return this.f57017;
    }

    @Override // p067l.InterfaceC9501
    /* JADX INFO: renamed from: ۧ */
    public final void mo10697(long j, byte[] bArr, int i, int i2) {
        m43421();
        synchronized (this.f57016) {
            m43422();
            if (j < 0 || i < 0 || i2 < 0 || i > bArr.length - i2 || j > ((long) this.f57017) - ((long) i2)) {
                throw new EOFException("MPEG-TS preview read exceeds clip length");
            }
            byte[] bArr2 = this.f57007;
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
    
        r1 = r8.f57016;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r8.f57008 != java.lang.Thread.currentThread()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r8.f57008 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m43421() {
        Throwable th;
        C9540 c9540M43416;
        synchronized (this.f57009) {
            if (this.f57005) {
                m43422();
                return;
            }
            if (this.f57002) {
                m43418(this.f57001);
            }
            this.f57002 = true;
            synchronized (this.f57016) {
                m43422();
                this.f57008 = Thread.currentThread();
            }
            try {
                try {
                    m43422();
                    c9540M43416 = m43416();
                    try {
                        synchronized (this.f57016) {
                            try {
                                m43422();
                                this.f57007 = c9540M43416.f26226;
                                this.f57017 = c9540M43416.f26228;
                                this.f57011 = c9540M43416.f26229;
                                try {
                                    this.f57005 = true;
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
                            this.f57001 = e;
                            throw e;
                        } catch (Error e2) {
                            e = e2;
                            this.f57001 = e;
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            this.f57001 = e;
                            throw e;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        this = this;
                        this.f57001 = e;
                        throw e;
                    } catch (Error e5) {
                        e = e5;
                        this = this;
                        this.f57001 = e;
                        throw e;
                    } catch (RuntimeException e6) {
                        e = e6;
                        this = this;
                        this.f57001 = e;
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        synchronized (this.f57016) {
                            if (this.f57008 == Thread.currentThread()) {
                                this.f57008 = null;
                            }
                        }
                        if (c9540M43416 != null) {
                            throw th;
                        }
                        c9540M43416.f26229.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e7) {
                e = e7;
                this = this;
                this.f57001 = e;
                throw e;
            } catch (Error e8) {
                e = e8;
                this = this;
                this.f57001 = e;
                throw e;
            } catch (RuntimeException e9) {
                e = e9;
                this = this;
                this.f57001 = e;
                throw e;
            } catch (Throwable th6) {
                th = th6;
                c9540M43416 = null;
                synchronized (this.f57016) {
                    if (this.f57008 == Thread.currentThread()) {
                        this.f57008 = null;
                    }
                    if (c9540M43416 != null) {
                        throw th;
                    }
                    c9540M43416.f26229.close();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C9540 m43416() throws IOException {
        C3883 c3883M7679 = C3883.m7679();
        int i = this.f57013;
        C9680 c9680M7683 = c3883M7679.m7683(i);
        if (c9680M7683 == null) {
            throw new IOException("MPEG-TS preview memory budget is exhausted");
        }
        try {
            byte[] bArr = new byte[i];
            C6659 c6659M11510 = this.f57004.m11510();
            long j = i;
            c6659M11510.m15163(j);
            RunnableC21751 runnableC21751M43417 = m43417(c6659M11510.m15161());
            Throwable th = null;
            try {
                try {
                    long jM49035 = runnableC21751M43417.m49035();
                    if (jM49035 != -1 && jM49035 < j) {
                        throw new EOFException("MPEG-TS preview source is shorter than expected");
                    }
                    C4356 c4356 = new C4356(this.f57010, bArr, this.f57013, this.f57012, new C15574(this));
                    C17750 c17750 = new C17750(c4356, 0L, this.f57012);
                    C13074 c13074 = new C13074();
                    C17317 c17317M16588 = this.f57000.m16588();
                    if (!c17317M16588.mo7079(c17750)) {
                        throw new IOException("MPEG-TS preview source could not be recognized");
                    }
                    if (m43415(c4356.m8996(), bArr) < 0) {
                        throw new IOException("MPEG-TS preview packet alignment is invalid");
                    }
                    c17750.mo24036();
                    c17317M16588.mo7078(c13074);
                    C24812 c24812 = new C24812();
                    while (!c13074.m29936()) {
                        m43422();
                        int iMo7075 = c17317M16588.mo7075(c17750, c24812);
                        if (iMo7075 == 1) {
                            throw new IOException("Unexpected seek while scanning MPEG-TS preview");
                        }
                        if (iMo7075 == -1) {
                            break;
                        }
                    }
                    if (!c13074.m29936()) {
                        throw new IOException("No decodable video keyframe found in MPEG-TS preview");
                    }
                    int iM43415 = m43415(c4356.m8996(), bArr);
                    int iM8996 = (((c4356.m8996() - iM43415) / 188) * 188) + iM43415;
                    if (iM8996 <= 0) {
                        throw new IOException("MPEG-TS preview does not contain a complete packet");
                    }
                    C9540 c9540 = new C9540(iM8996, c13074.m29937(), c9680M7683, bArr);
                    try {
                        try {
                            runnableC21751M43417.m49034();
                            m43420(runnableC21751M43417);
                            return c9540;
                        } catch (Throwable th2) {
                            m43420(runnableC21751M43417);
                            throw th2;
                        }
                    } catch (IOException | Error | RuntimeException e) {
                        throw e;
                    }
                } catch (Throwable th3) {
                    try {
                        try {
                            runnableC21751M43417.m49034();
                        } catch (Throwable th4) {
                            m43420(runnableC21751M43417);
                            throw th4;
                        }
                    } catch (IOException | Error | RuntimeException e2) {
                        if (0 != 0 && null != e2) {
                            th.addSuppressed(e2);
                        } else if (0 == 0) {
                            throw e2;
                        }
                    }
                    m43420(runnableC21751M43417);
                    throw th3;
                }
            } catch (IOException | Error | RuntimeException e3) {
                throw e3;
            }
        } catch (Throwable th5) {
            c9680M7683.close();
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
    
        if (r7.f57006 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r7.f57014 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r1.m49036() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r7.f57014 = null;
        r7.f57015 = r1;
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
    
        r1.m49032();
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
    
        r1.m49031();
        r0 = r7.f57016;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private RunnableC21751 m43417(C5318 c5318) throws Throwable {
        boolean z;
        RunnableC21751 runnableC21751;
        Throwable th;
        boolean z2;
        boolean z3;
        RunnableC21751 runnableC21752 = new RunnableC21751(this.f57010, c5318, C12601.m29024());
        boolean z4 = false;
        try {
            synchronized (this.f57016) {
                try {
                    m43422();
                    this.f57014 = runnableC21752;
                    z = true;
                    try {
                        runnableC21752.m49033();
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
                synchronized (this.f57016) {
                    if (this.f57014 == runnableC21752) {
                        this.f57014 = null;
                    }
                }
                return runnableC21752;
            } catch (Throwable th4) {
                th = th4;
                z = z3;
                th = th;
                z2 = z4;
                runnableC21751 = runnableC21752;
                if (!z2) {
                    try {
                        if (z) {
                            runnableC21751.m49032();
                        } else {
                            runnableC21751.m49034();
                        }
                    } catch (Throwable unused) {
                    }
                    synchronized (this.f57016) {
                        if (this.f57014 == runnableC21751) {
                            this.f57014 = null;
                        }
                    }
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th5) {
            z = false;
            this = this;
            runnableC21751 = runnableC21752;
            th = th5;
            z2 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43420(RunnableC21751 runnableC21751) {
        synchronized (this.f57016) {
            if (this.f57015 == runnableC21751) {
                this.f57015 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0038  */
    /* JADX WARN: Code duplicated, block: B:41:0x004d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RunnableC21751 runnableC21751;
        RunnableC21751 runnableC21752;
        Thread thread;
        C9680 c9680;
        synchronized (this.f57016) {
            this.f57006 = true;
            runnableC21751 = this.f57014;
            runnableC21752 = this.f57015;
            thread = this.f57008;
        }
        if (runnableC21751 != null) {
            try {
                runnableC21751.m49032();
            } catch (Throwable th) {
                th = th;
            }
        }
        th = null;
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (runnableC21752 != null) {
            try {
                runnableC21752.m49034();
            } catch (Throwable th2) {
                th = th2;
                if (th != null) {
                    if (th != th) {
                        th.addSuppressed(th);
                    }
                }
                if (thread != Thread.currentThread()) {
                    synchronized (this.f57009) {
                    }
                }
                synchronized (this.f57016) {
                    this.f57007 = null;
                    c9680 = this.f57011;
                    this.f57011 = null;
                    if (c9680 != null) {
                        c9680.close();
                    }
                    m43418(th);
                }
            }
        }
        th = th;
        if (thread != Thread.currentThread()) {
            synchronized (this.f57009) {
            }
        }
        synchronized (this.f57016) {
            this.f57007 = null;
            c9680 = this.f57011;
            this.f57011 = null;
        }
        if (c9680 != null) {
            c9680.close();
        }
        m43418(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m43422() throws InterruptedIOException {
        if (this.f57006 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("MPEG-TS preview read was canceled");
        }
        this.f57003.getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m43415(int i, byte[] bArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static void m43418(Throwable th) throws IOException {
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
