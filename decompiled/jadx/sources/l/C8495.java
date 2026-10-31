package l;

/* JADX INFO: renamed from: l.۠᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K78T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8495 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f25958;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f25959;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f25960;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14852 f25961;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f25962;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f25963;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f25965;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f25966;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f25967;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9209 f25968;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f25969;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f25970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14852 f25971;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Thread[] f25972;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f25973;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f25974;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f25975;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f25964 = new Object();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f25976 = -1;

    public C8495(C11691 c11691, C8751 c8751, C9209 c9209) {
        this.f25968 = c9209;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22186(C14852 c14852) throws Throwable {
        Thread[] threadArrM22180;
        synchronized (this.f25964) {
            if (!this.f25974 && !c14852.f45299 && !c14852.f45313.m43967()) {
                if (this.f25965 > 0) {
                    this.f25961 = c14852;
                    C14852 c14853 = this.f25971;
                    if ((c14853 != null) && c14853 != c14852) {
                        this.f25967 = true;
                        this.f25960 = true;
                        this.f25964.notifyAll();
                    }
                    return;
                }
                C14852 c14854 = this.f25971;
                if (c14854 != null) {
                    threadArrM22180 = null;
                    if (c14854 != c14852) {
                        this.f25961 = c14852;
                        this.f25967 = true;
                        this.f25960 = true;
                        this.f25964.notifyAll();
                    }
                } else {
                    threadArrM22180 = m22180(c14852);
                }
                m22175(threadArrM22180);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19785 m22185() {
        synchronized (this.f25964) {
            if (this.f25974) {
                return new C0733();
            }
            this.f25965++;
            boolean z = false;
            while (true) {
                int i = this.f25973;
                if (i <= 0 || this.f25969 >= i) {
                    break;
                }
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return new InterfaceC19785() { // from class: l.ۚ᩺᩻
                @Override // java.lang.AutoCloseable
                public final void close() throws Throwable {
                    C8495.m22167(this.f17515);
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22189(C14852 c14852) {
        synchronized (this.f25964) {
            m22181(c14852);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22190(C14852 c14852) {
        boolean z;
        synchronized (this.f25964) {
            m22181(c14852);
            z = false;
            while (this.f25971 == c14852) {
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m22181(C14852 c14852) {
        C14852 c14853 = this.f25971;
        if (c14853 == c14852 && c14853 != null) {
            this.f25967 = true;
            this.f25960 = true;
        }
        if (this.f25961 == c14852) {
            this.f25961 = null;
        }
        this.f25964.notifyAll();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22187(String str) {
        C14852 c14852;
        boolean z;
        synchronized (this.f25964) {
            C14852 c14853 = this.f25971;
            z = (c14853 != null && c14853.f45300.equals(str)) || ((c14852 = this.f25961) != null && c14852.f45300.equals(str));
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22188() {
        boolean z;
        synchronized (this.f25964) {
            this.f25974 = true;
            this.f25967 = true;
            this.f25960 = true;
            this.f25961 = null;
            this.f25965 = 0;
            this.f25964.notifyAll();
            z = false;
            while (true) {
                if (!(this.f25971 != null)) {
                    break;
                }
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private Thread[] m22180(final C14852 c14852) {
        if (this.f25974 || c14852.f45299 || c14852.f45313.m43967()) {
            return null;
        }
        final long j = this.f25966 + 1;
        this.f25966 = j;
        Thread[] threadArr = new Thread[2];
        this.f25971 = c14852;
        this.f25972 = threadArr;
        this.f25970 = j;
        this.f25967 = false;
        this.f25960 = false;
        this.f25963 = false;
        this.f25958 = false;
        this.f25959 = false;
        this.f25969 = 0;
        this.f25973 = 2;
        this.f25975 = 0;
        this.f25962 = 0;
        this.f25976 = -1;
        c14852.f45308.size();
        int i = 0;
        while (i < 2) {
            final int i2 = i;
            Runnable runnable = new Runnable() { // from class: l.֨᩺᩻
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C8495.m22168(this.f5143, c14852, j, i2);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m22175(Thread[] threadArr) throws Throwable {
        int i;
        Throwable th;
        C14852 c14852;
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
                    synchronized (this.f25964) {
                        if (this.f25972 == threadArr) {
                            throw th;
                        }
                        this.f25960 = true;
                        this.f25967 = true;
                        this.f25973 = i;
                        this.f25959 = true;
                        c14852 = null;
                        if (i == 0) {
                            C14852 c14853 = this.f25971;
                            this.f25971 = null;
                            this.f25972 = null;
                            this.f25967 = false;
                            this.f25960 = false;
                            this.f25963 = false;
                            this.f25958 = false;
                            this.f25959 = false;
                            this.f25973 = 0;
                            this.f25969 = 0;
                            this.f25975 = 0;
                            this.f25962 = 0;
                            this.f25976 = -1;
                            c14852 = c14853;
                        }
                        this.f25964.notifyAll();
                        if (c14852 != null) {
                            throw th;
                        }
                        C19793.m45508((C19793) this.f25968.f27895, c14852);
                        throw th;
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    th = e;
                    synchronized (this.f25964) {
                        if (this.f25972 == threadArr) {
                            throw th;
                        }
                        this.f25960 = true;
                        this.f25967 = true;
                        this.f25973 = i;
                        this.f25959 = true;
                        c14852 = null;
                        if (i == 0) {
                            C14852 c14854 = this.f25971;
                            this.f25971 = null;
                            this.f25972 = null;
                            this.f25967 = false;
                            this.f25960 = false;
                            this.f25963 = false;
                            this.f25958 = false;
                            this.f25959 = false;
                            this.f25973 = 0;
                            this.f25969 = 0;
                            this.f25975 = 0;
                            this.f25962 = 0;
                            this.f25976 = -1;
                            c14852 = c14854;
                        }
                        this.f25964.notifyAll();
                        if (c14852 != null) {
                            throw th;
                        }
                        C19793.m45508((C19793) this.f25968.f27895, c14852);
                        throw th;
                    }
                }
            }
            m22171(threadArr);
        } catch (Error | RuntimeException e3) {
            e = e3;
            i = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22171(Thread[] threadArr) {
        synchronized (this.f25964) {
            if (this.f25972 == threadArr) {
                this.f25959 = true;
                this.f25964.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22167(C8495 c8495) throws Throwable {
        Thread[] threadArrM22180;
        synchronized (c8495.f25964) {
            int i = c8495.f25965;
            if (i > 0) {
                c8495.f25965 = i - 1;
            }
            threadArrM22180 = null;
            if (c8495.f25965 == 0) {
                C14852 c14852 = c8495.f25961;
                if (c14852 != null) {
                    C14852 c14853 = c8495.f25971;
                    if (!(c14853 != null)) {
                        c8495.f25961 = null;
                        threadArrM22180 = c8495.m22180(c14852);
                    } else if (c14852 == c14853) {
                        c8495.f25961 = null;
                    } else {
                        c8495.f25967 = true;
                        c8495.f25960 = true;
                    }
                }
                c8495.f25964.notifyAll();
            }
        }
        c8495.m22175(threadArrM22180);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m22174(C14852 c14852, long j) {
        boolean zM22184;
        do {
            synchronized (this.f25964) {
                zM22184 = false;
                if (m22184(c14852, j)) {
                    boolean z = false;
                    while (this.f25965 > 0 && m22184(c14852, j)) {
                        if (!z) {
                            int i = this.f25969 + 1;
                            this.f25969 = i;
                            if (i == this.f25973 && !this.f25958) {
                                String str = c14852.f45300;
                                this.f25958 = true;
                            }
                            this.f25964.notifyAll();
                            z = true;
                        }
                        try {
                            this.f25964.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            this.f25967 = true;
                            this.f25960 = true;
                        }
                    }
                    if (z) {
                        int i2 = this.f25969 - 1;
                        this.f25969 = i2;
                        if (i2 < 0) {
                            this.f25969 = 0;
                        }
                        if (this.f25958 && this.f25969 == 0 && this.f25965 == 0 && m22184(c14852, j)) {
                            String str2 = c14852.f45300;
                            this.f25958 = false;
                        }
                        this.f25964.notifyAll();
                    }
                    zM22184 = m22184(c14852, j);
                }
            }
            if (!zM22184) {
                return;
            }
        } while (m22183(c14852, j));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m22184(C14852 c14852, long j) {
        return (this.f25971 != c14852 || this.f25970 != j || this.f25967 || this.f25974 || this.f25960) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22170(C14852 c14852, long j, boolean z) {
        synchronized (this.f25964) {
            if (this.f25971 == c14852 && this.f25970 == j) {
                this.f25963 = true;
                if (!z) {
                    this.f25960 = true;
                    this.f25975 = c14852.f45308.size();
                }
                this.f25964.notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m22176(C14852 c14852, long j) {
        boolean z;
        synchronized (this.f25964) {
            while (true) {
                z = true;
                if (this.f25971 != c14852 || this.f25970 != j || this.f25963 || this.f25967 || this.f25974) {
                    break;
                }
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f25967 = true;
                    this.f25960 = true;
                    if (this.f25963) {
                        z = false;
                    } else {
                        z = false;
                    }
                    return z;
                }
            }
            if (this.f25963 || this.f25971 != c14852 || this.f25970 != j || this.f25967 || this.f25974) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m22178(C14852 c14852, long j) {
        boolean z;
        synchronized (this.f25964) {
            while (true) {
                z = true;
                if (this.f25971 != c14852 || this.f25970 != j || this.f25959 || this.f25967 || this.f25974) {
                    break;
                }
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f25967 = true;
                    this.f25960 = true;
                    if (this.f25959) {
                        z = false;
                    } else {
                        z = false;
                    }
                    return z;
                }
            }
            if (this.f25959 || this.f25971 != c14852 || this.f25970 != j || this.f25967 || this.f25974) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22168(C8495 c8495, C14852 c14852, long j, int i) throws Throwable {
        boolean zM22176;
        try {
            if (!c8495.m22178(c14852, j)) {
                c8495.m22179(c14852, j);
                return;
            }
            if (i == 0) {
                zM22176 = false;
                try {
                    C19079 c19079 = c14852.f45313;
                    c19079.m43969();
                    if (!c19079.m43968() && !c19079.m43962(c14852.f45308) && !c19079.m43968()) {
                        zM22176 = true;
                    }
                    c8495.m22170(c14852, j, zM22176);
                } catch (Throwable th) {
                    c8495.m22170(c14852, j, false);
                    throw th;
                }
            } else {
                zM22176 = c8495.m22176(c14852, j);
            }
            if (zM22176) {
                c8495.m22174(c14852, j);
            }
            c8495.m22179(c14852, j);
        } catch (Throwable th2) {
            c8495.m22179(c14852, j);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m22183(C14852 c14852, long j) {
        int i;
        C12953 c12953 = new C12953();
        String str = null;
        C12918 c12918M35252 = null;
        while (true) {
            synchronized (this.f25964) {
                if (m22184(c14852, j)) {
                    if (this.f25965 > 0) {
                        i = -2;
                    } else if (this.f25975 < c14852.f45308.size()) {
                        int i2 = this.f25975;
                        this.f25975 = i2 + 1;
                        i = i2;
                    }
                }
                i = -1;
            }
            if (i == -2) {
                return true;
            }
            if (i != -1) {
                C17667 c17667 = (C17667) c14852.f45308.get(i);
                EnumC7084 enumC7084M43963 = c14852.f45313.m43963(c17667.f54033);
                if (enumC7084M43963 == EnumC7084.UNAVAILABLE) {
                    m22169(c14852, j);
                    return false;
                }
                if (enumC7084M43963 == EnumC7084.OFFSET || enumC7084M43963 == EnumC7084.FAILURE) {
                    m22173(c14852, j);
                } else {
                    if (!c17667.f54034.equals(str)) {
                        try {
                            c12918M35252 = c14852.m35252(c17667.f54034);
                            str = c17667.f54034;
                        } catch (C3059 unused) {
                            m22169(c14852, j);
                            return false;
                        }
                    }
                    try {
                        C7980 c7980M28577 = C11691.m28577(c14852, c17667, c12918M35252);
                        try {
                            C13533 c13533M31519 = c12953.m31519();
                            try {
                                C21652.m48913(c13533M31519, c7980M28577, new C22357());
                                c13533M31519.close();
                                if (m22177(c14852, j)) {
                                    C19079 c19079 = c14852.f45313;
                                    if (!c19079.m43968() && !c19079.m43965()) {
                                        if (!c19079.m43966(c17667.f54033, c12953) && !m22172(c14852, j, c17667)) {
                                            m22169(c14852, j);
                                        } else {
                                            m22173(c14852, j);
                                        }
                                    }
                                }
                                m22169(c14852, j);
                            } catch (Throwable th) {
                                try {
                                    c13533M31519.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            if (m22177(c14852, j)) {
                                C19079 c190710 = c14852.f45313;
                                if (!c190710.m43968() && !c190710.m43965()) {
                                    if (!c190710.m43961(c17667.f54033) && !m22172(c14852, j, c17667)) {
                                        m22169(c14852, j);
                                    } else {
                                        m22173(c14852, j);
                                    }
                                }
                                return false;
                            }
                            m22169(c14852, j);
                            return false;
                        }
                    } catch (C3059 unused3) {
                        m22169(c14852, j);
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m22172(C14852 c14852, long j, C17667 c17667) {
        if (m22177(c14852, j)) {
            EnumC7084 enumC7084M43963 = c14852.f45313.m43963(c17667.f54033);
            if (enumC7084M43963 == EnumC7084.UNAVAILABLE) {
                m22169(c14852, j);
                return false;
            }
            if (enumC7084M43963 == EnumC7084.OFFSET || enumC7084M43963 == EnumC7084.FAILURE) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m22177(C14852 c14852, long j) {
        boolean zM22184;
        synchronized (this.f25964) {
            zM22184 = m22184(c14852, j);
        }
        return zM22184;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22169(C14852 c14852, long j) {
        synchronized (this.f25964) {
            if (this.f25971 == c14852 && this.f25970 == j) {
                this.f25960 = true;
                this.f25967 = true;
                this.f25964.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m22173(C14852 c14852, long j) {
        int i;
        synchronized (this.f25964) {
            if (this.f25971 == c14852 && this.f25970 == j) {
                int i2 = this.f25962 + 1;
                this.f25962 = i2;
                int size = c14852.f45308.size();
                int i3 = this.f25976;
                if (size > 0 && (i = (int) ((((long) i2) * 100) / ((long) size))) != i3) {
                    i3 = i;
                }
                this.f25976 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m22179(C14852 c14852, long j) throws Throwable {
        int i;
        synchronized (this.f25964) {
            if (this.f25971 == c14852 && this.f25970 == j && (i = this.f25973) > 0) {
                boolean z = true;
                if (i > 1) {
                    this.f25973 = i - 1;
                    this.f25964.notifyAll();
                    return;
                }
                if (this.f25967 || this.f25960 || this.f25974 || this.f25975 < c14852.f45308.size()) {
                    z = false;
                }
                if (z && !c14852.f45313.m43968() && !c14852.f45313.m43965()) {
                    c14852.f45313.m43964(c14852.f45308);
                }
                String str = c14852.f45300;
                c14852.f45313.m43960();
                m22182(c14852, j);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m22182(C14852 c14852, long j) throws Throwable {
        Thread[] threadArrM22180;
        boolean z;
        C14852 c14853;
        synchronized (this.f25964) {
            threadArrM22180 = null;
            z = false;
            if (this.f25970 == j && this.f25971 == c14852) {
                this.f25971 = null;
                this.f25972 = null;
                this.f25967 = false;
                this.f25960 = false;
                this.f25963 = false;
                this.f25958 = false;
                this.f25959 = false;
                this.f25973 = 0;
                this.f25969 = 0;
                this.f25975 = 0;
                this.f25962 = 0;
                this.f25976 = -1;
                if (!this.f25974 && this.f25965 == 0 && (c14853 = this.f25961) != null) {
                    this.f25961 = null;
                    threadArrM22180 = m22180(c14853);
                }
                this.f25964.notifyAll();
                z = true;
            }
        }
        m22175(threadArrM22180);
        if (z) {
            C19793.m45508((C19793) this.f25968.f27895, c14852);
        }
    }
}
