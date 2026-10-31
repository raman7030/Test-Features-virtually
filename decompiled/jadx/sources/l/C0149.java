package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.֡ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0149 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f1281;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile C11936 f1282;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1283;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C3720 f1284;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f1285;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C5377 f1286;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C23721 f1287;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15253 f1288;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18537 f1289;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile Throwable f1290;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f1291 = new ReentrantLock();

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20900 f1292;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f1293;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C21605 f1294;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C5131 f1295;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f1296;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f1297;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C18495 f1298;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0149 m1233(C23721 c23721, InterfaceC20900 interfaceC20900, Charset charset) {
        C21605 c21605M52353 = c23721.m52353();
        try {
            long jM3930 = c21605M52353.f69370.m3930() / 32;
            int i = 32768;
            while (i > 1024 && i > jM3930) {
                i /= 2;
            }
            C11003.requireNonNull(interfaceC20900);
            C6788 c6788Identity = interfaceC20900.identity();
            C11003.requireNonNull(charset);
            return new C0149(c23721, interfaceC20900, new C5131(EnumC0191.LOADING, EnumC19243.NONE, c6788Identity, charset.name(), i, 0L, 0L, new byte[32], 0, false));
        } finally {
            c21605M52353.m48812();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0149 m1232(C23721 c23721, InterfaceC20900 interfaceC20900) {
        return new C0149(c23721, interfaceC20900, null);
    }

    public C0149(C23721 c23721, InterfaceC20900 interfaceC20900, C5131 c5131) {
        C11003.requireNonNull(c23721);
        this.f1287 = c23721;
        C11003.requireNonNull(interfaceC20900);
        this.f1292 = interfaceC20900;
        this.f1283 = Integer.MAX_VALUE;
        this.f1281 = c5131 == null;
        this.f1294 = c23721.m52353();
        try {
            c23721.m52338(this, c5131);
        } catch (Error | RuntimeException e) {
            this.f1294.m48812();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5131 m1245() {
        return this.f1295;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Throwable m1248() {
        return this.f1290;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m1246() {
        return this.f1297;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18495 m1249() {
        return m1242(this.f1295.m14681());
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18495 m1242(int i) {
        int iM14681;
        int iMin;
        byte[] bArrM14684;
        int i2;
        boolean z;
        byte[] bArr;
        int i3;
        boolean z2;
        int iM1231;
        if (i < 1 || i > 65536) {
            throw new IllegalArgumentException("Invalid preferred load batch size");
        }
        this.f1287.m52336(this);
        ReentrantLock reentrantLock = this.f1291;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (this.f1298 != null) {
            this.f1291.unlock();
            throw new IllegalStateException("Previous text batch is not published");
        }
        try {
            try {
                if (this.f1285 || this.f1297 || !m1240()) {
                    try {
                        if (this.f1297 || !m1240()) {
                            m1237();
                        }
                    } finally {
                        this.f1291.unlock();
                    }
                } else if (this.f1293) {
                    iM14681 = this.f1295.m14681();
                    m1238(Math.max(iM14681, (((int) Math.min(i, this.f1294.f69370.m3930() / 16)) / iM14681) * iM14681));
                    iMin = Math.min(this.f1296.length, Math.max(iM14681, (i / iM14681) * iM14681));
                    bArrM14684 = this.f1295.m14684();
                    i2 = 0;
                    z = false;
                    while (i2 < iMin) {
                        if (!this.f1297) {
                            iM1231 = m1231(i2, iM14681);
                            if (!this.f1297) {
                                if (iM1231 < iM14681) {
                                    z = true;
                                }
                                if (iM1231 > 0) {
                                    bArrM14684 = this.f1289.m43077(bArrM14684, i2, iM1231, this.f1296);
                                    i2 += iM1231;
                                }
                                if (z) {
                                    break;
                                    break;
                                }
                            } else if (this.f1297) {
                                m1237();
                            } else {
                                m1237();
                            }
                        } else if (this.f1297) {
                            m1237();
                        } else {
                            m1237();
                        }
                    }
                    bArr = bArrM14684;
                    i3 = i2;
                    z2 = z;
                    if (this.f1297) {
                        if (this.f1297) {
                            m1237();
                        } else {
                            m1237();
                        }
                    } else {
                        if (this.f1295.m14693() > C13132.FOREVER_NS - ((long) i3)) {
                            C18495 c18495 = new C18495(this, i3, this.f1295.m14682(i3, this.f1282.m29126(), bArr, this.f1284.m11311(), this.f1284.m11312(), z2));
                            this.f1298 = c18495;
                            if (this.f1297) {
                                m1237();
                            } else {
                                m1237();
                            }
                            return c18495;
                        }
                        m1235(EnumC0191.LIMIT_EXCEEDED, EnumC19243.COORDINATE_LIMIT, (Throwable) null);
                        if (this.f1297) {
                            m1237();
                        } else {
                            m1237();
                        }
                    }
                } else {
                    m1236();
                    if (this.f1297 || !m1240()) {
                        try {
                            if (this.f1297 || !m1240()) {
                                m1237();
                            }
                        } finally {
                            this.f1291.unlock();
                        }
                    } else {
                        m1241();
                        if (this.f1297 || !m1240()) {
                            try {
                                if (this.f1297 || !m1240()) {
                                    m1237();
                                }
                            } finally {
                                this.f1291.unlock();
                            }
                        } else {
                            this.f1293 = true;
                            iM14681 = this.f1295.m14681();
                            m1238(Math.max(iM14681, (((int) Math.min(i, this.f1294.f69370.m3930() / 16)) / iM14681) * iM14681));
                            iMin = Math.min(this.f1296.length, Math.max(iM14681, (i / iM14681) * iM14681));
                            bArrM14684 = this.f1295.m14684();
                            i2 = 0;
                            z = false;
                            while (i2 < iMin) {
                                if (!this.f1297) {
                                    try {
                                        if (this.f1297 || !m1240()) {
                                            m1237();
                                        }
                                    } finally {
                                        this.f1291.unlock();
                                    }
                                } else {
                                    iM1231 = m1231(i2, iM14681);
                                    if (!this.f1297) {
                                        try {
                                            if (this.f1297 || !m1240()) {
                                                m1237();
                                            }
                                        } finally {
                                            this.f1291.unlock();
                                        }
                                    } else {
                                        if (iM1231 < iM14681) {
                                            z = true;
                                        }
                                        if (iM1231 > 0) {
                                            bArrM14684 = this.f1289.m43077(bArrM14684, i2, iM1231, this.f1296);
                                            i2 += iM1231;
                                        }
                                        if (z) {
                                            break;
                                        }
                                    }
                                }
                            }
                            bArr = bArrM14684;
                            i3 = i2;
                            z2 = z;
                            if (this.f1297) {
                                try {
                                    if (this.f1297 || !m1240()) {
                                        m1237();
                                    }
                                } finally {
                                    this.f1291.unlock();
                                }
                            } else {
                                if (this.f1295.m14693() > C13132.FOREVER_NS - ((long) i3)) {
                                    C18495 c18496 = new C18495(this, i3, this.f1295.m14682(i3, this.f1282.m29126(), bArr, this.f1284.m11311(), this.f1284.m11312(), z2));
                                    this.f1298 = c18496;
                                    try {
                                        if (this.f1297 || !m1240()) {
                                            m1237();
                                        }
                                        return c18496;
                                    } finally {
                                        this.f1291.unlock();
                                    }
                                }
                                m1235(EnumC0191.LIMIT_EXCEEDED, EnumC19243.COORDINATE_LIMIT, (Throwable) null);
                                try {
                                    if (this.f1297 || !m1240()) {
                                        m1237();
                                    }
                                } finally {
                                    this.f1291.unlock();
                                }
                            }
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                try {
                    if (this.f1297 || !m1240()) {
                        m1237();
                    }
                    throw th;
                } finally {
                    this.f1291.unlock();
                }
            }
        } catch (IOException e) {
            e = e;
            m1235(EnumC0191.FAILED, EnumC19243.IO, e);
            try {
                if (this.f1297 || !m1240()) {
                    m1237();
                }
                return null;
            } finally {
                this.f1291.unlock();
            }
        } catch (UncheckedIOException e2) {
            e = e2;
            m1235(EnumC0191.FAILED, EnumC19243.IO, e);
            if (this.f1297) {
                m1237();
            } else {
                m1237();
            }
            return null;
        } catch (Error e3) {
            e = e3;
            m1235(EnumC0191.FAILED, EnumC19243.IO, e);
            throw e;
        } catch (C3966 e4) {
            m1235(EnumC0191.LIMIT_EXCEEDED, EnumC19243.CACHE_LIMIT, e4);
            try {
                if (this.f1297 || !m1240()) {
                    m1237();
                }
                return null;
            } finally {
                this.f1291.unlock();
            }
        } catch (RuntimeException e5) {
            e = e5;
            m1235(EnumC0191.FAILED, EnumC19243.IO, e);
            throw e;
        } catch (C19201 e6) {
            m1235(EnumC0191.FAILED, e6.f60453, e6);
            try {
                if (this.f1297 || !m1240()) {
                    m1237();
                }
                return null;
            } finally {
                this.f1291.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5131 m1234(C0149 c0149, C18495 c18495, InterfaceC0897 interfaceC0897) {
        if (interfaceC0897 != null) {
            interfaceC0897.mo3244(c0149.f1287);
        }
        c0149.f1287.m52336(c0149);
        ReentrantLock reentrantLock = c0149.f1291;
        if (reentrantLock.isHeldByCurrentThread() || !reentrantLock.tryLock()) {
            throw new IllegalStateException("Text load operation is already running");
        }
        if (c0149.f1298 != c18495 || c18495.f57330 != c0149) {
            c0149.f1291.unlock();
            throw new IllegalStateException("Text batch is not pending");
        }
        try {
            try {
                try {
                    if (!c0149.f1285 && !c0149.f1297 && c0149.m1240()) {
                        if (!(interfaceC0897 == null ? c0149.f1287.m52344(c0149, c0149.f1296, c18495.f57329, c18495.f57328, c0149.f1283) : interfaceC0897.mo3245(c0149.f1287, c0149, c0149.f1296, c18495.f57329, c18495.f57328, c0149.f1283)) && !c0149.f1297 && c0149.m1240()) {
                            c0149.m1235(EnumC0191.LIMIT_EXCEEDED, EnumC19243.COORDINATE_LIMIT, (Throwable) null);
                        }
                        c18495.f57330 = null;
                        if (c0149.f1298 == c18495) {
                            c0149.f1298 = null;
                        }
                        try {
                            if (c0149.f1297 || !c0149.m1240()) {
                                c0149.m1237();
                            }
                            return c0149.f1295;
                        } finally {
                            c0149.f1291.unlock();
                        }
                    }
                    C5131 c5131 = c0149.f1295;
                    c18495.f57330 = null;
                    if (c0149.f1298 == c18495) {
                        c0149.f1298 = null;
                    }
                    try {
                        if (c0149.f1297 || !c0149.m1240()) {
                            c0149.m1237();
                        }
                        return c5131;
                    } finally {
                        c0149.f1291.unlock();
                    }
                } catch (Throwable th) {
                    c18495.f57330 = null;
                    if (c0149.f1298 == c18495) {
                        c0149.f1298 = null;
                    }
                    try {
                        if (c0149.f1297 || !c0149.m1240()) {
                            c0149.m1237();
                        }
                        throw th;
                    } finally {
                        c0149.f1291.unlock();
                    }
                }
            } catch (C3966 e) {
                c0149.m1235(EnumC0191.LIMIT_EXCEEDED, EnumC19243.CACHE_LIMIT, e);
                c18495.f57330 = null;
                if (c0149.f1298 == c18495) {
                    c0149.f1298 = null;
                }
                try {
                    if (c0149.f1297 || !c0149.m1240()) {
                        c0149.m1237();
                    }
                } finally {
                    c0149.f1291.unlock();
                }
            } catch (RuntimeException e2) {
                e = e2;
                c0149.m1235(EnumC0191.FAILED, EnumC19243.IO, e);
                throw e;
            }
        } catch (UncheckedIOException e3) {
            c0149.m1235(EnumC0191.FAILED, EnumC19243.IO, e3);
            c18495.f57330 = null;
            if (c0149.f1298 == c18495) {
                c0149.f1298 = null;
            }
            try {
                if (c0149.f1297 || !c0149.m1240()) {
                    c0149.m1237();
                }
            } finally {
                c0149.f1291.unlock();
            }
        } catch (Error e4) {
            e = e4;
            c0149.m1235(EnumC0191.FAILED, EnumC19243.IO, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m1240() {
        return this.f1295.m14689() == EnumC0191.LOADING;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m1236() throws C19201 {
        if (this.f1281 && !this.f1295.m14685().m18434()) {
            throw new C19201(EnumC19243.SOURCE_UNAVAILABLE, "Text source cannot be reopened");
        }
        this.f1286 = this.f1294.f69370.m3921(m1239(this.f1295.m14681()));
        this.f1296 = new char[this.f1295.m14681()];
        this.f1289 = new C18537(this.f1295.m14681());
        if (this.f1297) {
            return;
        }
        this.f1282 = C11936.m29120(this.f1292.mo14081(), Charset.forName(this.f1295.m14690()), this.f1294.f69370);
        if (this.f1297) {
            return;
        }
        this.f1284 = new C3720(this.f1282);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m1238(int i) {
        if (i <= this.f1296.length) {
            return;
        }
        try {
            C5377 c5377M3921 = this.f1294.f69370.m3921(m1239(i));
            try {
                this.f1286.close();
                this.f1286 = c5377M3921;
                this.f1296 = new char[i];
            } catch (Error | RuntimeException e) {
                c5377M3921.close();
                throw e;
            }
        } catch (C3966 unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private long m1239(int i) {
        return ((long) ((((this.f1295.m14681() * 2) + 59) & (-8)) + 256)) + 512 + (((((long) i) * 2) + 23) & (-8));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m1231(int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2 && !this.f1297) {
            int iMin = Math.min(1024, i2 - i3);
            int i4 = this.f1284.read(this.f1296, i + i3, iMin);
            if (i4 > 0) {
                i3 += i4;
            }
            if (i4 < iMin) {
                break;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m1241() throws IOException {
        byte[] bArrM43077 = new byte[32];
        long jM14693 = this.f1295.m14693();
        long length = 0;
        while (length < jM14693) {
            if (this.f1297) {
                return;
            }
            int iM1231 = m1231(0, this.f1296.length);
            if (this.f1297) {
                return;
            }
            char[] cArr = this.f1296;
            if (iM1231 == cArr.length) {
                bArrM43077 = this.f1289.m43077(bArrM43077, 0, iM1231, cArr);
                length += (long) this.f1296.length;
            } else {
                throw new C19201(EnumC19243.PREFIX_MISMATCH, "Text source prefix is truncated");
            }
        }
        if (!Arrays.equals(bArrM43077, this.f1295.m14684()) || this.f1284.m11311() != this.f1295.m14688() || this.f1284.m11312() != this.f1295.m14694()) {
            throw new C19201(EnumC19243.PREFIX_MISMATCH, "Text source prefix does not match checkpoint");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1235(EnumC0191 enumC0191, EnumC19243 enumC19243, Throwable th) {
        if (th != null) {
            this.f1290 = th;
        }
        C23721 c23721 = this.f1287;
        if (this.f1297) {
            enumC0191 = EnumC0191.CANCELED;
        }
        if (this.f1297) {
            enumC19243 = EnumC19243.NONE;
        }
        c23721.m52337(this, enumC0191, enumC19243);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1243() {
        if (this.f1288 == null) {
            this.f1288 = this.f1294.m48799();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1244(boolean z) {
        C15253 c15253 = this.f1288;
        if (c15253 == null) {
            return;
        }
        if (!z) {
            c15253.flush();
            return;
        }
        this.f1288 = null;
        if (c15253 != null) {
            c15253.close();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1247() {
        this.f1287.m52337(this, EnumC0191.CANCELED, EnumC19243.NONE);
        this.f1297 = true;
        C11936 c11936 = this.f1282;
        if (c11936 != null) {
            try {
                c11936.m29127();
            } catch (IOException e) {
                this.f1290 = e;
            }
        }
        if (this.f1291.isHeldByCurrentThread() || !this.f1291.tryLock()) {
            return;
        }
        try {
            m1237();
        } finally {
            this.f1291.unlock();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m1237() {
        if (this.f1285) {
            return;
        }
        this.f1285 = true;
        C18495 c18495 = this.f1298;
        if (c18495 != null) {
            c18495.f57330 = null;
            this.f1298 = null;
        }
        try {
            try {
                C11936 c11936 = this.f1282;
                this.f1282 = null;
                if (c11936 != null) {
                    c11936.close();
                }
                this.f1284 = null;
                this.f1296 = null;
                this.f1289 = null;
                try {
                    try {
                        C15253 c15253 = this.f1288;
                        this.f1288 = null;
                        if (c15253 != null) {
                            c15253.close();
                        }
                        try {
                            C5377 c5377 = this.f1286;
                            if (c5377 != null) {
                                c5377.close();
                            }
                        } finally {
                            this.f1286 = null;
                            this.f1294.m48812();
                        }
                    } catch (IOException e) {
                        if (this.f1290 == null) {
                            this.f1290 = e;
                        } else if (this.f1290 != e) {
                            this.f1290.addSuppressed(e);
                        }
                        try {
                            C5377 c5378 = this.f1286;
                            if (c5378 != null) {
                                c5378.close();
                            }
                        } finally {
                            this.f1286 = null;
                            this.f1294.m48812();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        C5377 c5379 = this.f1286;
                        if (c5379 != null) {
                            c5379.close();
                        }
                        throw th;
                    } finally {
                        this.f1286 = null;
                        this.f1294.m48812();
                    }
                }
            } catch (Throwable th2) {
                this.f1284 = null;
                this.f1296 = null;
                this.f1289 = null;
                try {
                    try {
                        C15253 c15254 = this.f1288;
                        this.f1288 = null;
                        if (c15254 != null) {
                            c15254.close();
                        }
                        try {
                            C5377 c53710 = this.f1286;
                            if (c53710 != null) {
                                c53710.close();
                            }
                            throw th2;
                        } finally {
                            this.f1286 = null;
                            this.f1294.m48812();
                        }
                    } catch (Throwable th3) {
                        try {
                            C5377 c53711 = this.f1286;
                            if (c53711 != null) {
                                c53711.close();
                            }
                            throw th3;
                        } finally {
                            this.f1286 = null;
                            this.f1294.m48812();
                        }
                    }
                } catch (IOException e2) {
                    if (this.f1290 == null) {
                        this.f1290 = e2;
                    } else if (this.f1290 != e2) {
                        this.f1290.addSuppressed(e2);
                    }
                    try {
                        C5377 c53712 = this.f1286;
                        if (c53712 != null) {
                            c53712.close();
                        }
                    } finally {
                        this.f1286 = null;
                        this.f1294.m48812();
                    }
                }
            }
        } catch (IOException e3) {
            this.f1290 = e3;
            this.f1284 = null;
            this.f1296 = null;
            this.f1289 = null;
            try {
                try {
                    C15253 c15255 = this.f1288;
                    this.f1288 = null;
                    if (c15255 != null) {
                        c15255.close();
                    }
                    try {
                        C5377 c53713 = this.f1286;
                        if (c53713 != null) {
                            c53713.close();
                        }
                    } finally {
                        this.f1286 = null;
                        this.f1294.m48812();
                    }
                } catch (IOException e4) {
                    if (this.f1290 == null) {
                        this.f1290 = e4;
                    } else if (this.f1290 != e4) {
                        this.f1290.addSuppressed(e4);
                    }
                    try {
                        C5377 c53714 = this.f1286;
                        if (c53714 != null) {
                            c53714.close();
                        }
                    } finally {
                        this.f1286 = null;
                        this.f1294.m48812();
                    }
                }
            } catch (Throwable th4) {
                try {
                    C5377 c53715 = this.f1286;
                    if (c53715 != null) {
                        c53715.close();
                    }
                    throw th4;
                } finally {
                    this.f1286 = null;
                    this.f1294.m48812();
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m1247();
    }
}
