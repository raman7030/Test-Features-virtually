package p067l;

/* JADX INFO: renamed from: l.۠᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K78T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10443 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f28873;

    /* JADX INFO: renamed from: ֨ */
    public boolean f28874;

    /* JADX INFO: renamed from: ֫ */
    public boolean f28875;

    /* JADX INFO: renamed from: ۖ */
    public C16484 f28876;

    /* JADX INFO: renamed from: ۘ */
    public int f28877;

    /* JADX INFO: renamed from: ۚ */
    public boolean f28878;

    /* JADX INFO: renamed from: ۡ */
    public int f28880;

    /* JADX INFO: renamed from: ۢ */
    public long f28881;

    /* JADX INFO: renamed from: ۧ */
    public boolean f28882;

    /* JADX INFO: renamed from: ܳ */
    public final C11121 f28883;

    /* JADX INFO: renamed from: ܺ */
    public int f28884;

    /* JADX INFO: renamed from: ܽ */
    public long f28885;

    /* JADX INFO: renamed from: ܿ */
    public C16484 f28886;

    /* JADX INFO: renamed from: ᩳ */
    public Thread[] f28887;

    /* JADX INFO: renamed from: ᩴ */
    public int f28888;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f28889;

    /* JADX INFO: renamed from: ᩷ */
    public int f28890;

    /* JADX INFO: renamed from: ۜ */
    public final Object f28879 = new Object();

    /* JADX INFO: renamed from: ᩻ */
    public int f28891 = -1;

    public C10443(C13480 c13480, C10685 c10685, C11121 c11121) {
        this.f28883 = c11121;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24154(C16484 c16484) throws Throwable {
        Thread[] threadArrM24148;
        synchronized (this.f28879) {
            if (!this.f28889 && !c16484.f48415 && !c16484.f48429.m46261()) {
                if (this.f28880 > 0) {
                    this.f28876 = c16484;
                    C16484 c16485 = this.f28886;
                    if ((c16485 != null) && c16485 != c16484) {
                        this.f28882 = true;
                        this.f28875 = true;
                        this.f28879.notifyAll();
                    }
                    return;
                }
                C16484 c16486 = this.f28886;
                if (c16486 != null) {
                    threadArrM24148 = null;
                    if (c16486 != c16484) {
                        this.f28876 = c16484;
                        this.f28882 = true;
                        this.f28875 = true;
                        this.f28879.notifyAll();
                    }
                } else {
                    threadArrM24148 = m24148(c16484);
                }
                m24143(threadArrM24148);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21173 m24153() {
        synchronized (this.f28879) {
            if (this.f28889) {
                return new C3066();
            }
            this.f28880++;
            boolean z = false;
            while (true) {
                int i = this.f28888;
                if (i <= 0 || this.f28884 >= i) {
                    break;
                }
                try {
                    this.f28879.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return new InterfaceC21173() { // from class: l.ۚ᩺᩻
                @Override // java.lang.AutoCloseable
                public final void close() throws Throwable {
                    C10443.m24135(this.f20362);
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24157(C16484 c16484) {
        synchronized (this.f28879) {
            m24149(c16484);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24158(C16484 c16484) {
        boolean z;
        synchronized (this.f28879) {
            m24149(c16484);
            z = false;
            while (this.f28886 == c16484) {
                try {
                    this.f28879.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m24149(C16484 c16484) {
        C16484 c16485 = this.f28886;
        if (c16485 == c16484 && c16485 != null) {
            this.f28882 = true;
            this.f28875 = true;
        }
        if (this.f28876 == c16484) {
            this.f28876 = null;
        }
        this.f28879.notifyAll();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24155(String str) {
        C16484 c16484;
        boolean z;
        synchronized (this.f28879) {
            C16484 c16485 = this.f28886;
            z = (c16485 != null && c16485.f48416.equals(str)) || ((c16484 = this.f28876) != null && c16484.f48416.equals(str));
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24156() {
        boolean z;
        synchronized (this.f28879) {
            this.f28889 = true;
            this.f28882 = true;
            this.f28875 = true;
            this.f28876 = null;
            this.f28880 = 0;
            this.f28879.notifyAll();
            z = false;
            while (true) {
                if (!(this.f28886 != null)) {
                    break;
                }
                try {
                    this.f28879.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private Thread[] m24148(final C16484 c16484) {
        if (this.f28889 || c16484.f48415 || c16484.f48429.m46261()) {
            return null;
        }
        final long j = this.f28881 + 1;
        this.f28881 = j;
        Thread[] threadArr = new Thread[2];
        this.f28886 = c16484;
        this.f28887 = threadArr;
        this.f28885 = j;
        this.f28882 = false;
        this.f28875 = false;
        this.f28878 = false;
        this.f28873 = false;
        this.f28874 = false;
        this.f28884 = 0;
        this.f28888 = 2;
        this.f28890 = 0;
        this.f28877 = 0;
        this.f28891 = -1;
        c16484.f48424.size();
        int i = 0;
        while (i < 2) {
            final int i2 = i;
            Runnable runnable = new Runnable() { // from class: l.֨᩺᩻
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C10443.m24136(this.f7916, c16484, j, i2);
                }
            };
            StringBuilder sb = new StringBuilder("MT MCP Smali Cache #");
            int i3 = i + 1;
            sb.append(i3);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            threadArr[i] = thread;
            i = i3;
        }
        return threadArr;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0027 A[Catch: all -> 0x0063, TryCatch #0 {, blocks: (B:21:0x0023, B:23:0x0027, B:25:0x0033, B:26:0x004f, B:27:0x0054, B:30:0x0061), top: B:35:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0033 A[Catch: all -> 0x0063, TryCatch #0 {, blocks: (B:21:0x0023, B:23:0x0027, B:25:0x0033, B:26:0x004f, B:27:0x0054, B:30:0x0061), top: B:35:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[Catch: all -> 0x0063, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:21:0x0023, B:23:0x0027, B:25:0x0033, B:26:0x004f, B:27:0x0054, B:30:0x0061), top: B:35:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    private void m24143(Thread[] threadArr) throws Throwable {
        int i;
        Throwable th;
        C16484 c16484;
        if (threadArr == null) {
            return;
        }
        try {
            i = 0;
            for (Thread thread : threadArr) {
                try {
                    thread.start();
                    i++;
                } catch (Error e) {
                    e = e;
                    th = e;
                    synchronized (this.f28879) {
                        if (this.f28887 == threadArr) {
                            throw th;
                        }
                        this.f28875 = true;
                        this.f28882 = true;
                        this.f28888 = i;
                        this.f28874 = true;
                        c16484 = null;
                        if (i == 0) {
                            C16484 c16485 = this.f28886;
                            this.f28886 = null;
                            this.f28887 = null;
                            this.f28882 = false;
                            this.f28875 = false;
                            this.f28878 = false;
                            this.f28873 = false;
                            this.f28874 = false;
                            this.f28888 = 0;
                            this.f28884 = 0;
                            this.f28890 = 0;
                            this.f28877 = 0;
                            this.f28891 = -1;
                            c16484 = c16485;
                        }
                        this.f28879.notifyAll();
                        if (c16484 != null) {
                            throw th;
                        }
                        C21180.m47819((C21180) this.f28883.f30841, c16484);
                        throw th;
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    th = e;
                    synchronized (this.f28879) {
                        if (this.f28887 == threadArr) {
                            throw th;
                        }
                        this.f28875 = true;
                        this.f28882 = true;
                        this.f28888 = i;
                        this.f28874 = true;
                        c16484 = null;
                        if (i == 0) {
                            C16484 c16486 = this.f28886;
                            this.f28886 = null;
                            this.f28887 = null;
                            this.f28882 = false;
                            this.f28875 = false;
                            this.f28878 = false;
                            this.f28873 = false;
                            this.f28874 = false;
                            this.f28888 = 0;
                            this.f28884 = 0;
                            this.f28890 = 0;
                            this.f28877 = 0;
                            this.f28891 = -1;
                            c16484 = c16486;
                        }
                        this.f28879.notifyAll();
                        if (c16484 != null) {
                            throw th;
                        }
                        C21180.m47819((C21180) this.f28883.f30841, c16484);
                        throw th;
                    }
                }
            }
            m24139(threadArr);
        } catch (Error | RuntimeException e3) {
            e = e3;
            i = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24139(Thread[] threadArr) {
        synchronized (this.f28879) {
            if (this.f28887 == threadArr) {
                this.f28874 = true;
                this.f28879.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24135(C10443 c10443) throws Throwable {
        Thread[] threadArrM24148;
        synchronized (c10443.f28879) {
            int i = c10443.f28880;
            if (i > 0) {
                c10443.f28880 = i - 1;
            }
            threadArrM24148 = null;
            if (c10443.f28880 == 0) {
                C16484 c16484 = c10443.f28876;
                if (c16484 != null) {
                    C16484 c16485 = c10443.f28886;
                    if (!(c16485 != null)) {
                        c10443.f28876 = null;
                        threadArrM24148 = c10443.m24148(c16484);
                    } else if (c16484 == c16485) {
                        c10443.f28876 = null;
                    } else {
                        c10443.f28882 = true;
                        c10443.f28875 = true;
                    }
                }
                c10443.f28879.notifyAll();
            }
        }
        c10443.m24143(threadArrM24148);
    }

    /* JADX INFO: renamed from: ۢ */
    private void m24142(C16484 c16484, long j) {
        boolean zM24152;
        do {
            synchronized (this.f28879) {
                zM24152 = false;
                if (m24152(c16484, j)) {
                    boolean z = false;
                    while (this.f28880 > 0 && m24152(c16484, j)) {
                        if (!z) {
                            int i = this.f28884 + 1;
                            this.f28884 = i;
                            if (i == this.f28888 && !this.f28873) {
                                String str = c16484.f48416;
                                this.f28873 = true;
                            }
                            this.f28879.notifyAll();
                            z = true;
                        }
                        try {
                            this.f28879.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            this.f28882 = true;
                            this.f28875 = true;
                        }
                    }
                    if (z) {
                        int i2 = this.f28884 - 1;
                        this.f28884 = i2;
                        if (i2 < 0) {
                            this.f28884 = 0;
                        }
                        if (this.f28873 && this.f28884 == 0 && this.f28880 == 0 && m24152(c16484, j)) {
                            String str2 = c16484.f48416;
                            this.f28873 = false;
                        }
                        this.f28879.notifyAll();
                    }
                    zM24152 = m24152(c16484, j);
                }
            }
            if (!zM24152) {
                return;
            }
        } while (m24151(c16484, j));
    }

    /* JADX INFO: renamed from: ᩻ */
    private boolean m24152(C16484 c16484, long j) {
        return (this.f28886 != c16484 || this.f28885 != j || this.f28882 || this.f28889 || this.f28875) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24138(C16484 c16484, long j, boolean z) {
        synchronized (this.f28879) {
            if (this.f28886 == c16484 && this.f28885 == j) {
                this.f28878 = true;
                if (!z) {
                    this.f28875 = true;
                    this.f28890 = c16484.f48424.size();
                }
                this.f28879.notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX INFO: renamed from: ۧ */
    private boolean m24144(C16484 c16484, long j) {
        boolean z;
        synchronized (this.f28879) {
            while (true) {
                z = true;
                if (this.f28886 != c16484 || this.f28885 != j || this.f28878 || this.f28882 || this.f28889) {
                    break;
                }
                try {
                    this.f28879.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f28882 = true;
                    this.f28875 = true;
                    if (this.f28878) {
                        z = false;
                    } else {
                        z = false;
                    }
                    return z;
                }
            }
            if (this.f28878 || this.f28886 != c16484 || this.f28885 != j || this.f28882 || this.f28889) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX INFO: renamed from: ܽ */
    private boolean m24146(C16484 c16484, long j) {
        boolean z;
        synchronized (this.f28879) {
            while (true) {
                z = true;
                if (this.f28886 != c16484 || this.f28885 != j || this.f28874 || this.f28882 || this.f28889) {
                    break;
                }
                try {
                    this.f28879.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f28882 = true;
                    this.f28875 = true;
                    if (this.f28874) {
                        z = false;
                    } else {
                        z = false;
                    }
                    return z;
                }
            }
            if (this.f28874 || this.f28886 != c16484 || this.f28885 != j || this.f28882 || this.f28889) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24136(C10443 c10443, C16484 c16484, long j, int i) throws Throwable {
        boolean zM24144;
        try {
            if (!c10443.m24146(c16484, j)) {
                c10443.m24147(c16484, j);
                return;
            }
            if (i == 0) {
                zM24144 = false;
                try {
                    C20502 c20502 = c16484.f48429;
                    c20502.m46263();
                    if (!c20502.m46262() && !c20502.m46256(c16484.f48424) && !c20502.m46262()) {
                        zM24144 = true;
                    }
                    c10443.m24138(c16484, j, zM24144);
                } catch (Throwable th) {
                    c10443.m24138(c16484, j, false);
                    throw th;
                }
            } else {
                zM24144 = c10443.m24144(c16484, j);
            }
            if (zM24144) {
                c10443.m24142(c16484, j);
            }
            c10443.m24147(c16484, j);
        } catch (Throwable th2) {
            c10443.m24147(c16484, j);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m24151(C16484 c16484, long j) {
        int i;
        C14679 c14679 = new C14679();
        String str = null;
        C14645 c14645M37408 = null;
        while (true) {
            synchronized (this.f28879) {
                if (m24152(c16484, j)) {
                    if (this.f28880 > 0) {
                        i = -2;
                    } else if (this.f28890 < c16484.f48424.size()) {
                        int i2 = this.f28890;
                        this.f28890 = i2 + 1;
                        i = i2;
                    }
                }
                i = -1;
            }
            if (i == -2) {
                return true;
            }
            if (i != -1) {
                C19160 c19160 = (C19160) c16484.f48424.get(i);
                EnumC9102 enumC9102M46257 = c16484.f48429.m46257(c19160.f57226);
                if (enumC9102M46257 == EnumC9102.UNAVAILABLE) {
                    m24137(c16484, j);
                    return false;
                }
                if (enumC9102M46257 == EnumC9102.OFFSET || enumC9102M46257 == EnumC9102.FAILURE) {
                    m24141(c16484, j);
                } else {
                    if (!c19160.f57227.equals(str)) {
                        try {
                            c14645M37408 = c16484.m37408(c19160.f57227);
                            str = c19160.f57227;
                        } catch (C5276 unused) {
                            m24137(c16484, j);
                            return false;
                        }
                    }
                    try {
                        C9952 c9952M30625 = C13480.m30625(c16484, c19160, c14645M37408);
                        try {
                            C15230 c15230M33606 = c14679.m33606();
                            try {
                                C22946.m51262(c15230M33606, c9952M30625, new C23616());
                                c15230M33606.close();
                                if (m24145(c16484, j)) {
                                    C20502 c20502 = c16484.f48429;
                                    if (!c20502.m46262() && !c20502.m46259()) {
                                        if (!c20502.m46260(c19160.f57226, c14679) && !m24140(c16484, j, c19160)) {
                                            m24137(c16484, j);
                                        } else {
                                            m24141(c16484, j);
                                        }
                                    }
                                }
                                m24137(c16484, j);
                            } catch (Throwable th) {
                                try {
                                    c15230M33606.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            if (m24145(c16484, j)) {
                                C20502 c20503 = c16484.f48429;
                                if (!c20503.m46262() && !c20503.m46259()) {
                                    if (!c20503.m46255(c19160.f57226) && !m24140(c16484, j, c19160)) {
                                        m24137(c16484, j);
                                    } else {
                                        m24141(c16484, j);
                                    }
                                }
                                return false;
                            }
                            m24137(c16484, j);
                            return false;
                        }
                    } catch (C5276 unused3) {
                        m24137(c16484, j);
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m24140(C16484 c16484, long j, C19160 c19160) {
        if (m24145(c16484, j)) {
            EnumC9102 enumC9102M46257 = c16484.f48429.m46257(c19160.f57226);
            if (enumC9102M46257 == EnumC9102.UNAVAILABLE) {
                m24137(c16484, j);
                return false;
            }
            if (enumC9102M46257 == EnumC9102.OFFSET || enumC9102M46257 == EnumC9102.FAILURE) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    private boolean m24145(C16484 c16484, long j) {
        boolean zM24152;
        synchronized (this.f28879) {
            zM24152 = m24152(c16484, j);
        }
        return zM24152;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24137(C16484 c16484, long j) {
        synchronized (this.f28879) {
            if (this.f28886 == c16484 && this.f28885 == j) {
                this.f28875 = true;
                this.f28882 = true;
                this.f28879.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m24141(C16484 c16484, long j) {
        int i;
        synchronized (this.f28879) {
            if (this.f28886 == c16484 && this.f28885 == j) {
                int i2 = this.f28877 + 1;
                this.f28877 = i2;
                int size = c16484.f48424.size();
                int i3 = this.f28891;
                if (size > 0 && (i = (int) ((((long) i2) * 100) / ((long) size))) != i3) {
                    i3 = i;
                }
                this.f28891 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m24147(C16484 c16484, long j) throws Throwable {
        int i;
        synchronized (this.f28879) {
            if (this.f28886 == c16484 && this.f28885 == j && (i = this.f28888) > 0) {
                boolean z = true;
                if (i > 1) {
                    this.f28888 = i - 1;
                    this.f28879.notifyAll();
                    return;
                }
                if (this.f28882 || this.f28875 || this.f28889 || this.f28890 < c16484.f48424.size()) {
                    z = false;
                }
                if (z && !c16484.f48429.m46262() && !c16484.f48429.m46259()) {
                    c16484.f48429.m46258(c16484.f48424);
                }
                String str = c16484.f48416;
                c16484.f48429.m46254();
                m24150(c16484, j);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m24150(C16484 c16484, long j) throws Throwable {
        Thread[] threadArrM24148;
        boolean z;
        C16484 c16485;
        synchronized (this.f28879) {
            threadArrM24148 = null;
            z = false;
            if (this.f28885 == j && this.f28886 == c16484) {
                this.f28886 = null;
                this.f28887 = null;
                this.f28882 = false;
                this.f28875 = false;
                this.f28878 = false;
                this.f28873 = false;
                this.f28874 = false;
                this.f28888 = 0;
                this.f28884 = 0;
                this.f28890 = 0;
                this.f28877 = 0;
                this.f28891 = -1;
                if (!this.f28889 && this.f28880 == 0 && (c16485 = this.f28876) != null) {
                    this.f28876 = null;
                    threadArrM24148 = m24148(c16485);
                }
                this.f28879.notifyAll();
                z = true;
            }
        }
        m24143(threadArrM24148);
        if (z) {
            C21180.m47819((C21180) this.f28883.f30841, c16484);
        }
    }
}
