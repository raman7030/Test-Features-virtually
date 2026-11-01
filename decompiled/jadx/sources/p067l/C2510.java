package p067l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.p066io.UncheckedIOException;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.֡ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2510 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean f4056;

    /* JADX INFO: renamed from: ۗ */
    public volatile C13713 f4057;

    /* JADX INFO: renamed from: ۙ */
    public final int f4058;

    /* JADX INFO: renamed from: ۛ */
    public C5904 f4059;

    /* JADX INFO: renamed from: ۟ */
    public boolean f4060;

    /* JADX INFO: renamed from: ۤ */
    public C7479 f4061;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C24913 f4062;

    /* JADX INFO: renamed from: ۨ */
    public C16865 f4063;

    /* JADX INFO: renamed from: ۫ */
    public C19986 f4064;

    /* JADX INFO: renamed from: ۬ */
    public volatile Throwable f4065;

    /* JADX INFO: renamed from: ܰ */
    public final ReentrantLock f4066 = new ReentrantLock();

    /* JADX INFO: renamed from: ܽ֫ */
    public final InterfaceC22232 f4067;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f4068;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C22902 f4069;

    /* JADX INFO: renamed from: ᩶ */
    public volatile C7245 f4070;

    /* JADX INFO: renamed from: ᩸ */
    public char[] f4071;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f4072;

    /* JADX INFO: renamed from: ᩺ */
    public C19946 f4073;

    /* JADX INFO: renamed from: ֫ */
    public static C2510 m3635(C24913 c24913, InterfaceC22232 interfaceC22232, Charset charset) {
        C22902 c22902M54756 = c24913.m54756();
        try {
            long jM6171 = c22902M54756.f72073.m6171() / 32;
            int i = 32768;
            while (i > 1024 && i > jM6171) {
                i /= 2;
            }
            C12826.requireNonNull(interfaceC22232);
            C8820 c8820Identity = interfaceC22232.identity();
            C12826.requireNonNull(charset);
            return new C2510(c24913, interfaceC22232, new C7245(EnumC2550.LOADING, EnumC20657.NONE, c8820Identity, charset.name(), i, 0L, 0L, new byte[32], 0, false));
        } finally {
            c22902M54756.m51159();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2510 m3634(C24913 c24913, InterfaceC22232 interfaceC22232) {
        return new C2510(c24913, interfaceC22232, null);
    }

    public C2510(C24913 c24913, InterfaceC22232 interfaceC22232, C7245 c7245) {
        C12826.requireNonNull(c24913);
        this.f4062 = c24913;
        C12826.requireNonNull(interfaceC22232);
        this.f4067 = interfaceC22232;
        this.f4058 = Integer.MAX_VALUE;
        this.f4056 = c7245 == null;
        this.f4069 = c24913.m54756();
        try {
            c24913.m54741(this, c7245);
        } catch (Error | RuntimeException e) {
            this.f4069.m51159();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final C7245 m3647() {
        return this.f4070;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Throwable m3650() {
        return this.f4065;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m3648() {
        return this.f4072;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C19946 m3651() {
        return m3644(this.f4070.m16589());
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0149 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ۘ۬ᩳ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ᩵ۗᩳ -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #15 {IOException -> 0x01c9, UncheckedIOException -> 0x01c7, Error -> 0x019f, ۘ۬ᩳ -> 0x01aa, RuntimeException -> 0x01a1, ᩵ۗᩳ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0173 A[Catch: all -> 0x017c, TRY_LEAVE, TryCatch #16 {all -> 0x017c, blocks: (B:105:0x0169, B:107:0x016d, B:109:0x0173), top: B:204:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x01db A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #18 {all -> 0x01df, blocks: (B:147:0x01d1, B:149:0x01d5, B:151:0x01db), top: B:207:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x00ff A[EDGE_INSN: B:209:0x00ff->B:81:0x00ff BREAK  A[LOOP:0: B:53:0x00b5->B:213:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[LOOP:0: B:53:0x00b5->B:213:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ۘ۬ᩳ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ᩵ۗᩳ -> 0x01e6, TRY_LEAVE, TryCatch #15 {IOException -> 0x01c9, UncheckedIOException -> 0x01c7, Error -> 0x019f, ۘ۬ᩳ -> 0x01aa, RuntimeException -> 0x01a1, ᩵ۗᩳ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #6 {all -> 0x00ca, blocks: (B:56:0x00bb, B:58:0x00bf, B:60:0x00c5), top: B:194:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ۘ۬ᩳ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ᩵ۗᩳ -> 0x01e6, TRY_ENTER, TRY_LEAVE, TryCatch #15 {IOException -> 0x01c9, UncheckedIOException -> 0x01c7, Error -> 0x019f, ۘ۬ᩳ -> 0x01aa, RuntimeException -> 0x01a1, ᩵ۗᩳ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3 A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #5 {all -> 0x00e8, blocks: (B:67:0x00d9, B:69:0x00dd, B:71:0x00e3), top: B:192:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4 A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ۘ۬ᩳ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ᩵ۗᩳ -> 0x01e6, TRY_ENTER, TryCatch #15 {IOException -> 0x01c9, UncheckedIOException -> 0x01c7, Error -> 0x019f, ۘ۬ᩳ -> 0x01aa, RuntimeException -> 0x01a1, ᩵ۗᩳ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0110 A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #11 {all -> 0x0115, blocks: (B:83:0x0106, B:85:0x010a, B:87:0x0110), top: B:196:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x011c A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ۘ۬ᩳ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ᩵ۗᩳ -> 0x01e6, TRY_ENTER, TryCatch #15 {IOException -> 0x01c9, UncheckedIOException -> 0x01c7, Error -> 0x019f, ۘ۬ᩳ -> 0x01aa, RuntimeException -> 0x01a1, ᩵ۗᩳ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x012d A[Catch: all -> 0x019d, Error -> 0x019f, RuntimeException -> 0x01a1, ۘ۬ᩳ -> 0x01aa, UncheckedIOException -> 0x01c7, IOException -> 0x01c9, ᩵ۗᩳ -> 0x01e6, TRY_LEAVE, TryCatch #15 {IOException -> 0x01c9, UncheckedIOException -> 0x01c7, Error -> 0x019f, ۘ۬ᩳ -> 0x01aa, RuntimeException -> 0x01a1, ᩵ۗᩳ -> 0x01e6, blocks: (B:13:0x001f, B:15:0x0023, B:17:0x0027, B:20:0x002f, B:22:0x0033, B:24:0x003a, B:27:0x0041, B:29:0x0048, B:32:0x004f, B:52:0x007e, B:54:0x00b7, B:65:0x00d1, B:79:0x00f4, B:81:0x00ff, B:92:0x011c, B:94:0x012d, B:104:0x0149), top: B:206:0x001f, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x013e A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #3 {all -> 0x0142, blocks: (B:95:0x0134, B:97:0x0138, B:99:0x013e), top: B:190:0x0134 }] */
    /* JADX INFO: renamed from: ֫ */
    public final C19946 m3644(int i) {
        int iM16589;
        int iMin;
        byte[] bArrM16592;
        int i2;
        boolean z;
        byte[] bArr;
        int i3;
        boolean z2;
        int iM3633;
        if (i < 1 || i > 65536) {
            throw new IllegalArgumentException("Invalid preferred load batch size");
        }
        this.f4062.m54739(this);
        ReentrantLock reentrantLock = this.f4066;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (this.f4073 != null) {
            this.f4066.unlock();
            throw new IllegalStateException("Previous text batch is not published");
        }
        try {
            try {
                if (this.f4060 || this.f4072 || !m3642()) {
                    try {
                        if (this.f4072 || !m3642()) {
                            m3639();
                        }
                    } finally {
                        this.f4066.unlock();
                    }
                } else if (this.f4068) {
                    iM16589 = this.f4070.m16589();
                    m3640(Math.max(iM16589, (((int) Math.min(i, this.f4069.f72073.m6171() / 16)) / iM16589) * iM16589));
                    iMin = Math.min(this.f4071.length, Math.max(iM16589, (i / iM16589) * iM16589));
                    bArrM16592 = this.f4070.m16592();
                    i2 = 0;
                    z = false;
                    while (i2 < iMin) {
                        if (!this.f4072) {
                            iM3633 = m3633(i2, iM16589);
                            if (!this.f4072) {
                                if (iM3633 < iM16589) {
                                    z = true;
                                }
                                if (iM3633 > 0) {
                                    bArrM16592 = this.f4064.m45355(bArrM16592, i2, iM3633, this.f4071);
                                    i2 += iM3633;
                                }
                                if (z) {
                                    break;
                                    break;
                                }
                            } else if (this.f4072) {
                                m3639();
                            } else {
                                m3639();
                            }
                        } else if (this.f4072) {
                            m3639();
                        } else {
                            m3639();
                        }
                    }
                    bArr = bArrM16592;
                    i3 = i2;
                    z2 = z;
                    if (this.f4072) {
                        if (this.f4072) {
                            m3639();
                        } else {
                            m3639();
                        }
                    } else {
                        if (this.f4070.m16601() > C14849.FOREVER_NS - ((long) i3)) {
                            C19946 c19946 = new C19946(this, i3, this.f4070.m16590(i3, this.f4057.m31179(), bArr, this.f4059.m13258(), this.f4059.m13259(), z2));
                            this.f4073 = c19946;
                            if (this.f4072) {
                                m3639();
                            } else {
                                m3639();
                            }
                            return c19946;
                        }
                        m3637(EnumC2550.LIMIT_EXCEEDED, EnumC20657.COORDINATE_LIMIT, (Throwable) null);
                        if (this.f4072) {
                            m3639();
                        } else {
                            m3639();
                        }
                    }
                } else {
                    m3638();
                    if (this.f4072 || !m3642()) {
                        try {
                            if (this.f4072 || !m3642()) {
                                m3639();
                            }
                        } finally {
                            this.f4066.unlock();
                        }
                    } else {
                        m3643();
                        if (this.f4072 || !m3642()) {
                            try {
                                if (this.f4072 || !m3642()) {
                                    m3639();
                                }
                            } finally {
                                this.f4066.unlock();
                            }
                        } else {
                            this.f4068 = true;
                            iM16589 = this.f4070.m16589();
                            m3640(Math.max(iM16589, (((int) Math.min(i, this.f4069.f72073.m6171() / 16)) / iM16589) * iM16589));
                            iMin = Math.min(this.f4071.length, Math.max(iM16589, (i / iM16589) * iM16589));
                            bArrM16592 = this.f4070.m16592();
                            i2 = 0;
                            z = false;
                            while (i2 < iMin) {
                                if (!this.f4072) {
                                    try {
                                        if (this.f4072 || !m3642()) {
                                            m3639();
                                        }
                                    } finally {
                                        this.f4066.unlock();
                                    }
                                } else {
                                    iM3633 = m3633(i2, iM16589);
                                    if (!this.f4072) {
                                        try {
                                            if (this.f4072 || !m3642()) {
                                                m3639();
                                            }
                                        } finally {
                                            this.f4066.unlock();
                                        }
                                    } else {
                                        if (iM3633 < iM16589) {
                                            z = true;
                                        }
                                        if (iM3633 > 0) {
                                            bArrM16592 = this.f4064.m45355(bArrM16592, i2, iM3633, this.f4071);
                                            i2 += iM3633;
                                        }
                                        if (z) {
                                            break;
                                        }
                                    }
                                }
                            }
                            bArr = bArrM16592;
                            i3 = i2;
                            z2 = z;
                            if (this.f4072) {
                                try {
                                    if (this.f4072 || !m3642()) {
                                        m3639();
                                    }
                                } finally {
                                    this.f4066.unlock();
                                }
                            } else {
                                if (this.f4070.m16601() > C14849.FOREVER_NS - ((long) i3)) {
                                    C19946 c19947 = new C19946(this, i3, this.f4070.m16590(i3, this.f4057.m31179(), bArr, this.f4059.m13258(), this.f4059.m13259(), z2));
                                    this.f4073 = c19947;
                                    try {
                                        if (this.f4072 || !m3642()) {
                                            m3639();
                                        }
                                        return c19947;
                                    } finally {
                                        this.f4066.unlock();
                                    }
                                }
                                m3637(EnumC2550.LIMIT_EXCEEDED, EnumC20657.COORDINATE_LIMIT, (Throwable) null);
                                try {
                                    if (this.f4072 || !m3642()) {
                                        m3639();
                                    }
                                } finally {
                                    this.f4066.unlock();
                                }
                            }
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                try {
                    if (this.f4072 || !m3642()) {
                        m3639();
                    }
                    throw th;
                } finally {
                    this.f4066.unlock();
                }
            }
        } catch (IOException e) {
            e = e;
            m3637(EnumC2550.FAILED, EnumC20657.IO, e);
            try {
                if (this.f4072 || !m3642()) {
                    m3639();
                }
                return null;
            } finally {
                this.f4066.unlock();
            }
        } catch (UncheckedIOException e2) {
            e = e2;
            m3637(EnumC2550.FAILED, EnumC20657.IO, e);
            if (this.f4072) {
                m3639();
            } else {
                m3639();
            }
            return null;
        } catch (Error e3) {
            e = e3;
            m3637(EnumC2550.FAILED, EnumC20657.IO, e);
            throw e;
        } catch (C6138 e4) {
            m3637(EnumC2550.LIMIT_EXCEEDED, EnumC20657.CACHE_LIMIT, e4);
            try {
                if (this.f4072 || !m3642()) {
                    m3639();
                }
                return null;
            } finally {
                this.f4066.unlock();
            }
        } catch (RuntimeException e5) {
            e = e5;
            m3637(EnumC2550.FAILED, EnumC20657.IO, e);
            throw e;
        } catch (C20617 e6) {
            m3637(EnumC2550.FAILED, e6.f63683, e6);
            try {
                if (this.f4072 || !m3642()) {
                    m3639();
                }
                return null;
            } finally {
                this.f4066.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7245 m3636(C2510 c2510, C19946 c19946, InterfaceC3221 interfaceC3221) {
        if (interfaceC3221 != null) {
            interfaceC3221.mo5558(c2510.f4062);
        }
        c2510.f4062.m54739(c2510);
        ReentrantLock reentrantLock = c2510.f4066;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (c2510.f4073 != c19946 || c19946.f60549 != c2510) {
            c2510.f4066.unlock();
            throw new IllegalStateException("Text batch is not pending");
        }
        try {
            try {
                try {
                    if (!c2510.f4060 && !c2510.f4072 && c2510.m3642()) {
                        if (!(interfaceC3221 == null ? c2510.f4062.m54747(c2510, c2510.f4071, c19946.f60548, c19946.f60547, c2510.f4058) : interfaceC3221.mo5559(c2510.f4062, c2510, c2510.f4071, c19946.f60548, c19946.f60547, c2510.f4058)) && !c2510.f4072 && c2510.m3642()) {
                            c2510.m3637(EnumC2550.LIMIT_EXCEEDED, EnumC20657.COORDINATE_LIMIT, (Throwable) null);
                        }
                        c19946.f60549 = null;
                        if (c2510.f4073 == c19946) {
                            c2510.f4073 = null;
                        }
                        try {
                            if (c2510.f4072 || !c2510.m3642()) {
                                c2510.m3639();
                            }
                            return c2510.f4070;
                        } finally {
                            c2510.f4066.unlock();
                        }
                    }
                    C7245 c7245 = c2510.f4070;
                    c19946.f60549 = null;
                    if (c2510.f4073 == c19946) {
                        c2510.f4073 = null;
                    }
                    try {
                        if (c2510.f4072 || !c2510.m3642()) {
                            c2510.m3639();
                        }
                        return c7245;
                    } finally {
                        c2510.f4066.unlock();
                    }
                } catch (Throwable th) {
                    c19946.f60549 = null;
                    if (c2510.f4073 == c19946) {
                        c2510.f4073 = null;
                    }
                    try {
                        if (c2510.f4072 || !c2510.m3642()) {
                            c2510.m3639();
                        }
                        throw th;
                    } finally {
                        c2510.f4066.unlock();
                    }
                }
            } catch (C6138 e) {
                c2510.m3637(EnumC2550.LIMIT_EXCEEDED, EnumC20657.CACHE_LIMIT, e);
                c19946.f60549 = null;
                if (c2510.f4073 == c19946) {
                    c2510.f4073 = null;
                }
                try {
                    if (c2510.f4072 || !c2510.m3642()) {
                        c2510.m3639();
                    }
                } finally {
                    c2510.f4066.unlock();
                }
            } catch (RuntimeException e2) {
                e = e2;
                c2510.m3637(EnumC2550.FAILED, EnumC20657.IO, e);
                throw e;
            }
        } catch (UncheckedIOException e3) {
            c2510.m3637(EnumC2550.FAILED, EnumC20657.IO, e3);
            c19946.f60549 = null;
            if (c2510.f4073 == c19946) {
                c2510.f4073 = null;
            }
            try {
                if (c2510.f4072 || !c2510.m3642()) {
                    c2510.m3639();
                }
            } finally {
                c2510.f4066.unlock();
            }
        } catch (Error e4) {
            e = e4;
            c2510.m3637(EnumC2550.FAILED, EnumC20657.IO, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    private boolean m3642() {
        return this.f4070.m16597() == EnumC2550.LOADING;
    }

    /* JADX INFO: renamed from: ۖ */
    private void m3638() throws C20617 {
        if (this.f4056 && !this.f4070.m16593().m20382()) {
            throw new C20617(EnumC20657.SOURCE_UNAVAILABLE, "Text source cannot be reopened");
        }
        this.f4061 = this.f4069.f72073.m6162(m3641(this.f4070.m16589()));
        this.f4071 = new char[this.f4070.m16589()];
        this.f4064 = new C19986(this.f4070.m16589());
        if (this.f4072) {
            return;
        }
        this.f4057 = C13713.m31173(this.f4067.mo15961(), Charset.forName(this.f4070.m16598()), this.f4069.f72073);
        if (this.f4072) {
            return;
        }
        this.f4059 = new C5904(this.f4057);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m3640(int i) {
        if (i <= this.f4071.length) {
            return;
        }
        try {
            C7479 c7479M6162 = this.f4069.f72073.m6162(m3641(i));
            try {
                this.f4061.close();
                this.f4061 = c7479M6162;
                this.f4071 = new char[i];
            } catch (Error | RuntimeException e) {
                c7479M6162.close();
                throw e;
            }
        } catch (C6138 unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private long m3641(int i) {
        return ((long) ((((this.f4070.m16589() * 2) + 59) & (-8)) + 256)) + 512 + (((((long) i) * 2) + 23) & (-8));
    }

    /* JADX INFO: renamed from: ֫ */
    private int m3633(int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2 && !this.f4072) {
            int iMin = Math.min(1024, i2 - i3);
            int i4 = this.f4059.read(this.f4071, i + i3, iMin);
            if (i4 > 0) {
                i3 += i4;
            }
            if (i4 < iMin) {
                break;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m3643() throws IOException {
        byte[] bArrM45355 = new byte[32];
        long jM16601 = this.f4070.m16601();
        long length = 0;
        while (length < jM16601) {
            if (this.f4072) {
                return;
            }
            int iM3633 = m3633(0, this.f4071.length);
            if (this.f4072) {
                return;
            }
            char[] cArr = this.f4071;
            if (iM3633 == cArr.length) {
                bArrM45355 = this.f4064.m45355(bArrM45355, 0, iM3633, cArr);
                length += (long) this.f4071.length;
            } else {
                throw new C20617(EnumC20657.PREFIX_MISMATCH, "Text source prefix is truncated");
            }
        }
        if (!Arrays.equals(bArrM45355, this.f4070.m16592()) || this.f4059.m13258() != this.f4070.m16596() || this.f4059.m13259() != this.f4070.m16602()) {
            throw new C20617(EnumC20657.PREFIX_MISMATCH, "Text source prefix does not match checkpoint");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m3637(EnumC2550 enumC2550, EnumC20657 enumC20657, Throwable th) {
        if (th != null) {
            this.f4065 = th;
        }
        C24913 c24913 = this.f4062;
        if (this.f4072) {
            enumC2550 = EnumC2550.CANCELED;
        }
        if (this.f4072) {
            enumC20657 = EnumC20657.NONE;
        }
        c24913.m54740(this, enumC2550, enumC20657);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3645() {
        if (this.f4063 == null) {
            this.f4063 = this.f4069.m51146();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3646(boolean z) {
        C16865 c16865 = this.f4063;
        if (c16865 == null) {
            return;
        }
        if (!z) {
            c16865.flush();
            return;
        }
        this.f4063 = null;
        if (c16865 != null) {
            c16865.close();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m3649() {
        this.f4062.m54740(this, EnumC2550.CANCELED, EnumC20657.NONE);
        this.f4072 = true;
        C13713 c13713 = this.f4057;
        if (c13713 != null) {
            try {
                c13713.m31180();
            } catch (IOException e) {
                this.f4065 = e;
            }
        }
        if (this.f4066.isHeldByCurrentThread() || !this.f4066.tryLock()) {
            return;
        }
        try {
            m3639();
        } finally {
            this.f4066.unlock();
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private void m3639() {
        if (this.f4060) {
            return;
        }
        this.f4060 = true;
        C19946 c19946 = this.f4073;
        if (c19946 != null) {
            c19946.f60549 = null;
            this.f4073 = null;
        }
        try {
            try {
                C13713 c13713 = this.f4057;
                this.f4057 = null;
                if (c13713 != null) {
                    c13713.close();
                }
                this.f4059 = null;
                this.f4071 = null;
                this.f4064 = null;
                try {
                    try {
                        C16865 c16865 = this.f4063;
                        this.f4063 = null;
                        if (c16865 != null) {
                            c16865.close();
                        }
                        try {
                            C7479 c7479 = this.f4061;
                            if (c7479 != null) {
                                c7479.close();
                            }
                        } finally {
                            this.f4061 = null;
                            this.f4069.m51159();
                        }
                    } catch (IOException e) {
                        if (this.f4065 == null) {
                            this.f4065 = e;
                        } else if (this.f4065 != e) {
                            this.f4065.addSuppressed(e);
                        }
                        try {
                            C7479 c74710 = this.f4061;
                            if (c74710 != null) {
                                c74710.close();
                            }
                        } finally {
                            this.f4061 = null;
                            this.f4069.m51159();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        C7479 c74711 = this.f4061;
                        if (c74711 != null) {
                            c74711.close();
                        }
                        throw th;
                    } finally {
                        this.f4061 = null;
                        this.f4069.m51159();
                    }
                }
            } catch (Throwable th2) {
                this.f4059 = null;
                this.f4071 = null;
                this.f4064 = null;
                try {
                    try {
                        C16865 c16866 = this.f4063;
                        this.f4063 = null;
                        if (c16866 != null) {
                            c16866.close();
                        }
                        try {
                            C7479 c74712 = this.f4061;
                            if (c74712 != null) {
                                c74712.close();
                            }
                            throw th2;
                        } finally {
                            this.f4061 = null;
                            this.f4069.m51159();
                        }
                    } catch (Throwable th3) {
                        try {
                            C7479 c74713 = this.f4061;
                            if (c74713 != null) {
                                c74713.close();
                            }
                            throw th3;
                        } finally {
                            this.f4061 = null;
                            this.f4069.m51159();
                        }
                    }
                } catch (IOException e2) {
                    if (this.f4065 == null) {
                        this.f4065 = e2;
                    } else if (this.f4065 != e2) {
                        this.f4065.addSuppressed(e2);
                    }
                    try {
                        C7479 c74714 = this.f4061;
                        if (c74714 != null) {
                            c74714.close();
                        }
                    } finally {
                        this.f4061 = null;
                        this.f4069.m51159();
                    }
                }
            }
        } catch (IOException e3) {
            this.f4065 = e3;
            this.f4059 = null;
            this.f4071 = null;
            this.f4064 = null;
            try {
                try {
                    C16865 c16867 = this.f4063;
                    this.f4063 = null;
                    if (c16867 != null) {
                        c16867.close();
                    }
                    try {
                        C7479 c74715 = this.f4061;
                        if (c74715 != null) {
                            c74715.close();
                        }
                    } finally {
                        this.f4061 = null;
                        this.f4069.m51159();
                    }
                } catch (IOException e4) {
                    if (this.f4065 == null) {
                        this.f4065 = e4;
                    } else if (this.f4065 != e4) {
                        this.f4065.addSuppressed(e4);
                    }
                    try {
                        C7479 c74716 = this.f4061;
                        if (c74716 != null) {
                            c74716.close();
                        }
                    } finally {
                        this.f4061 = null;
                        this.f4069.m51159();
                    }
                }
            } catch (Throwable th4) {
                try {
                    C7479 c74717 = this.f4061;
                    if (c74717 != null) {
                        c74717.close();
                    }
                    throw th4;
                } finally {
                    this.f4061 = null;
                    this.f4069.m51159();
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m3649();
    }
}
