package l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܽܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R704 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16747 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final ExecutorC8782 f51401 = new ExecutorC8782(Runtime.getRuntime().availableProcessors());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f51402;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile C10193 f51403;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14986 f51404;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f51406;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f51407;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C11604 f51409;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C7370 f51410;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f51412;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f51413;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f51415;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f51416;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14986 f51418;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC20445 f51419;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f51420;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC20445 f51421;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C5959 f51422;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12309 f51423;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22187 f51424;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23097 f51425;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ExecutorC1726 f51426;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f51427;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f51428;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20798 f51430;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51431;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Executor f51433;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51434;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f51405 = new Object();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f51432 = new ArrayDeque();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f51414 = new Object();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5980 f51411 = new C5980();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20632 f51417 = new C20632();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f51408 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f51429 = true;

    public C16747(ExecutorC1726 executorC1726, InterfaceC12309 interfaceC12309) {
        ExecutorC8782 executorC8782 = f51401;
        C11003.requireNonNull(executorC8782, "workerExecutor");
        this.f51433 = executorC8782;
        this.f51402 = executorC8782.f26755;
        this.f51426 = executorC1726;
        this.f51423 = interfaceC12309;
        this.f51427 = 4096;
        this.f51407 = 8000000L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39415(C23097 c23097, InterfaceC20445 interfaceC20445, C9302 c9302, int i) {
        m39396(c23097, interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length(), EnumC22892.FRESH, c9302, i, 0, 0, 0, -1, -1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39414(C23097 c23097, InterfaceC20445 interfaceC20445, int i, int i2, int i3, C9302 c9302, int i4) {
        C11003.requireNonNull(interfaceC20445, TextBundle.TEXT_ENTRY);
        int iMo26548 = interfaceC20445.mo26548();
        int length = interfaceC20445.length();
        long j = i2;
        long j2 = (((long) length) - ((long) i3)) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || j2 < 0 || j2 > 2147483647L || ((long) i) + j > j2) {
            throw new IndexOutOfBoundsException("Invalid syntax worker edit range");
        }
        m39396(c23097, interfaceC20445, iMo26548, length, EnumC22892.EDIT, c9302, i4, i, i2, i3, -1, -1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39420(C23097 c23097, InterfaceC20445 interfaceC20445, int i, int i2, int i3) {
        C11003.requireNonNull(c23097, "program");
        C11003.requireNonNull(interfaceC20445, TextBundle.TEXT_ENTRY);
        int iMo26548 = interfaceC20445.mo26548();
        int length = interfaceC20445.length();
        C11003.checkFromToIndex(i, i2, length);
        m39396(c23097, interfaceC20445, iMo26548, length, EnumC22892.WINDOW, null, i3, 0, 0, 0, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39413(C23097 c23097, InterfaceC20445 interfaceC20445, int i, int i2, int i3) {
        C14986 c14986;
        int iMo26548 = interfaceC20445.mo26548();
        long j = i2;
        long length = (((long) interfaceC20445.length()) - ((long) i3)) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || length < 0 || length > 2147483647L || ((long) i) + j > length) {
            throw new IndexOutOfBoundsException("Invalid syntax window edit range");
        }
        try {
            synchronized (this.f51405) {
                m39404();
                m39408();
                this.f51417.m47217();
                C5980 c5980 = this.f51411;
                C5959 c5959 = this.f51422;
                if (c5980.m16784() != (c5959 == null ? null : c5959.f18266)) {
                    c5980.m16783();
                    m39399();
                }
                m39407();
                m39399();
                if (this.f51434 && this.f51425 == c23097 && this.f51421 == interfaceC20445 && this.f51410 != null && (c14986 = this.f51418) != null && this.f51415 + 1 == iMo26548 && c14986.m35509() == length) {
                    this.f51418 = this.f51418.m35499(new C7931(i, i2 + i, i3));
                    this.f51415 = iMo26548;
                } else {
                    m39401();
                }
            }
            m39398();
        } catch (Throwable th) {
            m39398();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5959 m39421() {
        C5959 c5959;
        synchronized (this.f51405) {
            c5959 = this.f51422;
        }
        return c5959;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7370 m39423() {
        C7370 c7370;
        synchronized (this.f51405) {
            c7370 = this.f51410;
        }
        return c7370;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39412(InterfaceC20445 interfaceC20445, int i, int i2) {
        if (i < 0 || i >= i2 || i2 > interfaceC20445.length()) {
            return;
        }
        synchronized (this.f51405) {
            if (this.f51421 != interfaceC20445) {
                return;
            }
            this.f51419 = interfaceC20445;
            this.f51406 = interfaceC20445.mo26548();
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            this.f51408 = j;
            C11604 c11604 = this.f51409;
            if (c11604 == null) {
                C22187 c22187 = this.f51424;
                c11604 = c22187 == null ? null : c22187.f71979;
            }
            if (c11604 != null && C11604.m28489(c11604)) {
                c11604.f34598 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10193 m39419() {
        return this.f51403;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39395(final C16747 c16747, C11604 c11604, C13035 c13035) {
        synchronized (c16747.f51405) {
            C22187 c22187 = c16747.f51424;
            if (c22187 != null && c22187.f71979 == c11604 && !c11604.f34603 && c16747.f51413 == c11604.f34612 && C11604.m28489(c11604)) {
                if (c16747.f51403 != null) {
                    c16747.f51403.f30627 = true;
                }
                c16747.f51403 = new C10193(c11604, c13035);
                final long j = c11604.f34612;
                c16747.m39390(new Runnable() { // from class: l.᩵ۡܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16747.m39403(this.f62691, j);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39403(C16747 c16747, long j) {
        synchronized (c16747.f51405) {
            C10193 c10193 = c16747.f51403;
            if (c10193 != null && c10193.f30628 == j && c10193.m25591()) {
                C20777.m47495(((C10899) c16747.f51423).f32771, c10193);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m39409(InterfaceC20445 interfaceC20445) {
        long j;
        synchronized (this.f51405) {
            j = this.f51421 == interfaceC20445 ? this.f51413 : 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39411(long j) {
        if (j != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(500L) + System.nanoTime();
            synchronized (this.f51405) {
                while (this.f51413 == j && (this.f51409 != null || this.f51424 != null)) {
                    long jNanoTime = nanos - System.nanoTime();
                    if (jNanoTime <= 0) {
                        return;
                    } else {
                        TimeUnit.NANOSECONDS.timedWait(this.f51405, jNanoTime);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39417(C5959 c5959) {
        boolean z;
        synchronized (this.f51405) {
            z = this.f51422 == c5959 && this.f51413 == c5959.f18268 && m39397(c5959.f18269, c5959.f18270);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39418(C7370 c7370) {
        boolean z;
        synchronized (this.f51405) {
            z = this.f51410 == c7370 && this.f51413 == c7370.f22638 && m39397(c7370.f22637, c7370.f22639);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39416(C4548 c4548) {
        boolean z;
        synchronized (this.f51405) {
            z = c4548.f14507 == this.f51414 && this.f51413 == c4548.f14512 && m39397(c4548.f14510, c4548.f14511);
        }
        return z;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39422() {
        try {
            synchronized (this.f51405) {
                m39404();
                m39408();
                this.f51411.m16785();
                this.f51417.m47217();
                C15650 c15650 = null;
                this.f51430 = null;
                C5980 c5980 = this.f51411;
                C5959 c5959 = this.f51422;
                if (c5959 != null) {
                    c15650 = c5959.f18266;
                }
                if (c5980.m16784() != c15650) {
                    c5980.m16783();
                    m39399();
                }
                m39407();
                m39399();
                m39401();
            }
            m39398();
        } catch (Throwable th) {
            m39398();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39410() {
        try {
            synchronized (this.f51405) {
                m39404();
                m39408();
                this.f51411.m16783();
                this.f51417.m47214();
                this.f51425 = null;
                this.f51421 = null;
                this.f51419 = null;
                this.f51408 = -1L;
                this.f51434 = false;
                this.f51430 = null;
                this.f51422 = null;
                this.f51410 = null;
                m39399();
                m39401();
            }
            m39398();
        } catch (Throwable th) {
            m39398();
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x019a */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m39396(C23097 c23097, InterfaceC20445 interfaceC20445, int i, int i2, EnumC22892 enumC22892, C9302 c9302, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean zM39405;
        C14986 c14986;
        C14986 c14987;
        C11003.requireNonNull(c23097, "program");
        C11003.requireNonNull(interfaceC20445, TextBundle.TEXT_ENTRY);
        if (enumC22892 != EnumC22892.WINDOW && c9302 != null && c9302.m23880() != i2) {
            throw new IllegalArgumentException("Display syntax base length mismatch");
        }
        synchronized (this.f51405) {
            try {
                C10193 c10193 = this.f51403;
                boolean z = this.f51421 != interfaceC20445;
                C23097 c23098 = this.f51425;
                boolean z2 = (c23098 == c23097 && !z && (c23098 == null || this.f51434 == enumC22892.m50980())) ? false : true;
                m39404();
                m39408();
                if (z2) {
                    this.f51411.m16783();
                    this.f51417.m47214();
                    if (this.f51419 != interfaceC20445) {
                        this.f51419 = null;
                        this.f51408 = -1L;
                    }
                    this.f51425 = c23097;
                    this.f51421 = interfaceC20445;
                    this.f51434 = enumC22892.m50980();
                    this.f51422 = null;
                    this.f51410 = null;
                    m39399();
                    m39401();
                } else if (enumC22892.m50980()) {
                    this.f51417.m47217();
                } else {
                    this.f51411.m16785();
                }
                boolean z3 = z2;
                long j = (((long) i2) - ((long) i6)) + ((long) i5);
                if (enumC22892 == EnumC22892.EDIT && this.f51431 && this.f51422 != null && (c14987 = this.f51404) != null && this.f51416 + 1 == i && c14987.m35509() == j) {
                    this.f51404 = this.f51404.m35499(new C7931(i4, i5 + i4, i6));
                    this.f51416 = i;
                } else {
                    m39399();
                }
                if (!enumC22892.m50980() || (c14986 = this.f51418) == null || this.f51415 != i || c14986.m35509() != i2) {
                    m39401();
                }
                C5959 c5959 = this.f51431 ? this.f51422 : null;
                C20798 c20798 = this.f51430;
                if (c20798 == null || c20798.f67334 != c23097 || c20798.f67336 != interfaceC20445 || c20798.f67333 != i || c20798.f67335 != i2) {
                    this.f51430 = new C20798(c23097, interfaceC20445, i, i2, this.f51402);
                }
                C11604 c11604 = new C11604(this.f51413, this.f51430, enumC22892, c5959, enumC22892.m50980() ? this.f51418 : this.f51404, c9302, i3, i7, i8, this.f51418 == null ? null : this.f51410);
                this.f51409 = c11604;
                if (this.f51419 == interfaceC20445 && this.f51406 == i) {
                    long j2 = this.f51408;
                    if (j2 != -1) {
                        c11604.f34598 = j2;
                    }
                }
                if (!z3 && c10193 != null && enumC22892.m50980() && c10193.f30625 == this.f51430) {
                    C13035 c13035 = c10193.f30626;
                    if (c13035.f39036 < i8 && c13035.f39035 > i7) {
                        this.f51403 = new C10193(this.f51409, c13035);
                    }
                }
                zM39405 = m39405();
            } catch (Throwable th) {
                throw th;
            }
        }
        m39398();
        if (zM39405) {
            m39400();
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x037e */
    /* JADX WARN: Code duplicated, block: B:203:0x03a2 A[Catch: all -> 0x0407, TryCatch #22 {, blocks: (B:196:0x038a, B:198:0x038e, B:200:0x0398, B:201:0x039b, B:203:0x03a2, B:204:0x03a7, B:206:0x03b1, B:208:0x03b5, B:209:0x03ba, B:210:0x03be), top: B:393:0x038a }] */
    /* JADX WARN: Code duplicated, block: B:213:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:215:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:219:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:221:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:258:0x043b A[Catch: all -> 0x0446, TryCatch #21 {, blocks: (B:256:0x0437, B:258:0x043b, B:259:0x043d, B:260:0x0444), top: B:391:0x0437, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x0456 A[Catch: all -> 0x051e, TryCatch #34 {all -> 0x051e, blocks: (B:254:0x0434, B:255:0x0436, B:261:0x0445, B:264:0x0448, B:269:0x0452, B:271:0x0456, B:273:0x045a, B:275:0x0465, B:279:0x0471, B:280:0x0473, B:329:0x051d, B:256:0x0437, B:258:0x043b, B:259:0x043d, B:260:0x0444, B:281:0x0474, B:283:0x0478, B:285:0x047c, B:286:0x0483, B:288:0x048c, B:289:0x0498), top: B:407:0x0036, inners: #21, #31 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x0478 A[Catch: all -> 0x051b, TryCatch #31 {, blocks: (B:281:0x0474, B:283:0x0478, B:285:0x047c, B:286:0x0483, B:288:0x048c, B:289:0x0498), top: B:403:0x0474, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x047c A[Catch: all -> 0x051b, TryCatch #31 {, blocks: (B:281:0x0474, B:283:0x0478, B:285:0x047c, B:286:0x0483, B:288:0x048c, B:289:0x0498), top: B:403:0x0474, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x048c A[Catch: all -> 0x051b, TryCatch #31 {, blocks: (B:281:0x0474, B:283:0x0478, B:285:0x047c, B:286:0x0483, B:288:0x048c, B:289:0x0498), top: B:403:0x0474, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x04a0 A[Catch: all -> 0x0518, TryCatch #26 {, blocks: (B:292:0x049c, B:294:0x04a0, B:296:0x04aa, B:297:0x04ac, B:299:0x04b3, B:300:0x04b8, B:302:0x04c2, B:304:0x04c6, B:305:0x04cb, B:306:0x04cf), top: B:397:0x049c }] */
    /* JADX WARN: Code duplicated, block: B:299:0x04b3 A[Catch: all -> 0x0518, TryCatch #26 {, blocks: (B:292:0x049c, B:294:0x04a0, B:296:0x04aa, B:297:0x04ac, B:299:0x04b3, B:300:0x04b8, B:302:0x04c2, B:304:0x04c6, B:305:0x04cb, B:306:0x04cf), top: B:397:0x049c }] */
    /* JADX WARN: Code duplicated, block: B:302:0x04c2 A[Catch: all -> 0x0518, TryCatch #26 {, blocks: (B:292:0x049c, B:294:0x04a0, B:296:0x04aa, B:297:0x04ac, B:299:0x04b3, B:300:0x04b8, B:302:0x04c2, B:304:0x04c6, B:305:0x04cb, B:306:0x04cf), top: B:397:0x049c }] */
    /* JADX WARN: Code duplicated, block: B:309:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:311:0x04da  */
    /* JADX WARN: Code duplicated, block: B:313:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:315:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:317:0x0506  */
    /* JADX WARN: Code duplicated, block: B:336:0x052a A[Catch: all -> 0x05a2, TryCatch #1 {, blocks: (B:334:0x0526, B:336:0x052a, B:338:0x0534, B:339:0x0536, B:341:0x053d, B:342:0x0542, B:344:0x054c, B:346:0x0550, B:347:0x0555, B:348:0x0559), top: B:374:0x0526 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x053d A[Catch: all -> 0x05a2, TryCatch #1 {, blocks: (B:334:0x0526, B:336:0x052a, B:338:0x0534, B:339:0x0536, B:341:0x053d, B:342:0x0542, B:344:0x054c, B:346:0x0550, B:347:0x0555, B:348:0x0559), top: B:374:0x0526 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x054c A[Catch: all -> 0x05a2, TryCatch #1 {, blocks: (B:334:0x0526, B:336:0x052a, B:338:0x0534, B:339:0x0536, B:341:0x053d, B:342:0x0542, B:344:0x054c, B:346:0x0550, B:347:0x0555, B:348:0x0559), top: B:374:0x0526 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x055f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0564  */
    /* JADX WARN: Code duplicated, block: B:355:0x0574  */
    /* JADX WARN: Code duplicated, block: B:357:0x0582  */
    /* JADX WARN: Code duplicated, block: B:359:0x0590  */
    /* JADX WARN: Code duplicated, block: B:374:0x0526 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0437 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x038a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x049c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x0474 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x035f, code lost:
    
        r3 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [l.ۛۡܿ] */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v6, types: [l.ۛۡܿ] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, l.ܽܺܿ] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l.᩹ۡܿ] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, l.᩹ۡܿ] */
    /* JADX WARN: Type inference failed for: r5v12, types: [l.᩹ۡܿ] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, l.᩹ۡܿ] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [l.۟ۡܿ] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [l.۟ۡܿ] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0243 -> B:123:0x0247). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m39392(final C16747 c16747) {
        C22187 c22187;
        ?? r16;
        ?? r8;
        ?? r9;
        C22187 c22188;
        ?? r17;
        ?? r5;
        ?? r4;
        boolean zM39405;
        boolean z;
        C22187 c22189;
        C22187 c221810;
        C22187 c221811;
        C22187 c221812;
        C22187 c221813;
        C22187 c221814;
        Object obj;
        Object obj2;
        boolean z2;
        boolean zM39406;
        boolean z3;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C4548 c4548M39388;
        C7370 c7370;
        boolean zM39407;
        boolean z4;
        ?? r6;
        C22187 c221815;
        C4548 c4548;
        C5959 c5959;
        C5959 c59510;
        C5959 c59511;
        C4548 c4549;
        C22187 c221816;
        C4548 c4548M39389;
        boolean z5;
        boolean zM39408;
        boolean z6;
        synchronized (c16747.f51405) {
            C22187 c221817 = null;
            C5959 c59512 = null;
            C22187 c221818 = null;
            C22187 c221819 = null;
            C22187 c221820 = null;
            if (c16747.f51409 != null) {
                C22187 c221821 = c16747.f51424;
                if (c221821 != null) {
                    C11604.m28505(c221821.f71979);
                    c16747.f51432.add(c16747.f51424);
                }
                c22187 = new C22187(c16747.f51409);
                c16747.f51409 = null;
                c16747.f51424 = c22187;
            } else {
                c22187 = c16747.f51424;
            }
            ?? M39388 = c22187;
            ?? r7 = 0;
            if (M39388 == 0) {
                c16747.f51420 = false;
                return;
            }
            boolean z7 = true;
            M39388.f71980 = true;
            try {
                try {
                    c16747.m39398();
                    InterfaceC11104 interfaceC11104 = M39388.f71981;
                    if (interfaceC11104 == null) {
                        C20071 c20071M39389 = c16747.m39389(M39388);
                        synchronized (c16747.f51405) {
                            z5 = c16747.f51424 == M39388 && c16747.f51413 == M39388.f71979.f34612 && !M39388.f71979.f34603 && C11604.m28489(M39388.f71979);
                            if (z5) {
                                M39388.f71981 = c20071M39389.f65004;
                                M39388.getClass();
                                interfaceC11104 = c20071M39389.f65004;
                            } else {
                                c16747.m39402(M39388.f71979);
                            }
                        }
                        if (!z5) {
                            synchronized (c16747.f51405) {
                                if (c16747.f51424 == M39388 && M39388.f71979.f34603) {
                                    c16747.f51424 = null;
                                }
                                M39388.f71980 = false;
                                if (c16747.f51424 != M39388) {
                                    c16747.f51432.add(M39388);
                                }
                                c16747.f51420 = false;
                                zM39408 = c16747.m39405();
                                if (c16747.f51409 == null && c16747.f51424 == null) {
                                    c16747.f51405.notifyAll();
                                }
                                z6 = c16747.f51412;
                                c16747.f51412 = false;
                            }
                            try {
                                c16747.m39398();
                                if (zM39408) {
                                    c16747.m39400();
                                }
                                if (z6) {
                                    InterfaceC12309 interfaceC12309 = c16747.f51423;
                                    C11003.requireNonNull(interfaceC12309);
                                    c16747.m39390(new RunnableC2539(1, interfaceC12309));
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                if (!zM39408) {
                                    throw th;
                                }
                                c16747.m39400();
                                throw th;
                            }
                        }
                    }
                    m39391(M39388.f71979);
                    EnumC4569 enumC4569Mo6347 = interfaceC11104.mo6347(c16747.f51427, c16747.f51407, M39388.f71979.f34604.f67332);
                    m39391(M39388.f71979);
                    EnumC4569 enumC4569 = EnumC4569.COMPLETED;
                    if (enumC4569Mo6347 == enumC4569) {
                        if (!M39388.f71979.f34600.m50980()) {
                            C13014 c13014 = (C13014) interfaceC11104;
                            C15650 c15650M25633 = c13014.f38956.m25633();
                            C14239 c14239M23887 = (c15650M25633 == null || M39388.f71979.f34608 == null) ? null : M39388.f71979.f34608.m23887(c15650M25633.m36849());
                            synchronized (c16747.f51405) {
                                try {
                                    try {
                                        if (c16747.f51424 == M39388 && !M39388.f71979.f34603 && C11604.m28489(M39388.f71979) && c16747.f51413 == M39388.f71979.f34612) {
                                            c16747.f51424 = null;
                                            if (c15650M25633 != null && c13014.f38956.m25636()) {
                                                C5959 c59513 = new C5959(M39388.f71979.f34612, M39388.f71979.f34611, M39388.f71979.f34605, c15650M25633, M39388.f71979.f34608 != null, M39388.f71979.f34607, c14239M23887);
                                                try {
                                                    c16747.f51422 = c59513;
                                                    c16747.f51431 = true;
                                                    c16747.f51404 = C14986.m35494(M39388.f71979.f34605, new C7931[0]);
                                                    c16747.f51416 = M39388.f71979.f34611;
                                                    c59510 = c59513;
                                                    c4548M39388 = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    c59511 = c59513;
                                                    c221816 = null;
                                                    c4549 = null;
                                                    z7 = false;
                                                    z2 = true;
                                                    c221815 = c221816;
                                                    c4548 = c4549;
                                                    r6 = M39388;
                                                    c5959 = c59511;
                                                    while (true) {
                                                        break;
                                                    }
                                                    throw th;
                                                }
                                            }
                                            if (Thread.currentThread().isInterrupted()) {
                                                throw new C13719();
                                            }
                                            c16747.m39402(M39388.f71979);
                                            C11604 c11604 = M39388.f71979;
                                            EnumC3137 enumC3137 = EnumC3137.INVALID_RESULT;
                                            new IllegalStateException("Syntax task completed without publication");
                                            c4548M39388 = c16747.m39388(c11604, enumC3137);
                                        } else {
                                            if (c16747.f51424 == M39388) {
                                                c16747.f51424 = null;
                                            }
                                            c16747.m39402(M39388.f71979);
                                            c4548M39388 = null;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c4549 = c4548M39388;
                                        c59511 = c59510;
                                        c221816 = null;
                                        z7 = false;
                                        z2 = true;
                                        c221815 = c221816;
                                        c4548 = c4549;
                                        r6 = M39388;
                                        c5959 = c59511;
                                        while (true) {
                                            break;
                                            break;
                                        }
                                        throw th;
                                    }
                                    c59510 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r6 = M39388;
                                    c221815 = null;
                                    c4548 = null;
                                    z7 = false;
                                    z2 = true;
                                    c5959 = null;
                                }
                            }
                            try {
                                break;
                                throw th;
                            } catch (Error e) {
                                e = e;
                                r8 = c221815;
                                c221817 = c221815;
                                M39388 = c4548;
                                r7 = r6;
                                r16 = c5959;
                                synchronized (c16747.f51405) {
                                    if (c16747.f51424 == r7) {
                                        c16747.f51424 = c221817;
                                    }
                                    c16747.m39402(r7.f71979);
                                    throw e;
                                }
                            } catch (RuntimeException e2) {
                                e = e2;
                                r8 = c221815;
                                c221817 = c221815;
                                M39388 = c4548;
                                r7 = r6;
                                r16 = c5959;
                                if (!(e instanceof C13719)) {
                                    z2 = false;
                                }
                                synchronized (c16747.f51405) {
                                    if (c16747.f51424 == r7) {
                                        c16747.f51424 = c221817;
                                    }
                                    if (z2) {
                                        C11604.m28505(r7.f71979);
                                    }
                                    c16747.m39402(r7.f71979);
                                    M39388 = M39388;
                                    if (!z2) {
                                        M39388 = c16747.m39388(r7.f71979, m39387(e));
                                    }
                                    synchronized (c16747.f51405) {
                                        if (c16747.f51424 == r7) {
                                            c16747.f51424 = c221817;
                                        }
                                        r7.f71980 = z7;
                                        if (c16747.f51424 != r7) {
                                            c16747.f51432.add(r7);
                                        }
                                        c16747.f51420 = z7;
                                        zM39406 = c16747.m39405();
                                        if (c16747.f51409 == null) {
                                            c16747.f51405.notifyAll();
                                        }
                                        z3 = c16747.f51412;
                                        c16747.f51412 = z7;
                                        c16747.m39398();
                                        if (zM39406) {
                                            c16747.m39400();
                                        }
                                        if (z3) {
                                            InterfaceC12309 interfaceC123010 = c16747.f51423;
                                            C11003.requireNonNull(interfaceC123010);
                                            c16747.m39390(new RunnableC2539(1, interfaceC123010));
                                        }
                                        if (r16 != 0) {
                                            final long j = r16.f18268;
                                            c16747.m39390(new Runnable() { // from class: l.۠ۡܿ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C16747.m39406(this.f24879, j);
                                                }
                                            });
                                        }
                                        if (r8 != 0) {
                                            final long j2 = r8.f22638;
                                            c16747.m39390(new Runnable() { // from class: l.֨ۡܿ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C16747.m39393(this.f3751, j2);
                                                }
                                            });
                                        }
                                        if (M39388 != 0) {
                                            c16747.m39390(new RunnableC20004(2, c16747, M39388));
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r9 = c221815;
                                c22188 = c221815;
                                r4 = c4548;
                                r5 = r6;
                                r17 = c5959;
                                synchronized (c16747.f51405) {
                                    if (c16747.f51424 == r5) {
                                        c16747.f51424 = c22188;
                                    }
                                    r5.f71980 = z7;
                                    if (c16747.f51424 != r5) {
                                        c16747.f51432.add(r5);
                                    }
                                    c16747.f51420 = z7;
                                    zM39405 = c16747.m39405();
                                    if (c16747.f51409 == null) {
                                        c16747.f51405.notifyAll();
                                    }
                                    z = c16747.f51412;
                                    c16747.f51412 = z7;
                                    c16747.m39398();
                                    if (zM39405) {
                                        c16747.m39400();
                                    }
                                    if (z) {
                                        InterfaceC12309 interfaceC123011 = c16747.f51423;
                                        C11003.requireNonNull(interfaceC123011);
                                        c16747.m39390(new RunnableC2539(1, interfaceC123011));
                                    }
                                    if (r17 != 0) {
                                        final long j3 = r17.f18268;
                                        c16747.m39390(new Runnable() { // from class: l.۠ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C16747.m39406(this.f24879, j3);
                                            }
                                        });
                                    }
                                    if (r9 != 0) {
                                        final long j4 = r9.f22638;
                                        c16747.m39390(new Runnable() { // from class: l.֨ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C16747.m39393(this.f3751, j4);
                                            }
                                        });
                                    }
                                    if (r4 != 0) {
                                        c16747.m39390(new RunnableC20004(2, c16747, r4));
                                    }
                                    throw th;
                                }
                            }
                        }
                        C1931 c1931 = (C1931) interfaceC11104;
                        try {
                            synchronized (c16747.f51405) {
                                try {
                                    if (c16747.f51424 == M39388 && !M39388.f71979.f34603 && C11604.m28489(M39388.f71979) && c16747.f51413 == M39388.f71979.f34612) {
                                        c16747.f51424 = null;
                                        if (c16747.f51417.m47215(c1931.f6469)) {
                                            C14280 c14280M47216 = c16747.f51417.m47216();
                                            if (c14280M47216 != null && c14280M47216.m34063() == M39388.f71979.f34602 && c14280M47216.m34064() == M39388.f71979.f34611 && c14280M47216.m34058() == M39388.f71979.f34605 && c14280M47216.m34060() == C11604.m28490(M39388.f71979) && c14280M47216.m34061() == C11604.m28495(M39388.f71979)) {
                                                c7370 = new C7370(M39388.f71979.f34612, M39388.f71979.f34611, M39388.f71979.f34605, c14280M47216, M39388.f71979.f34607);
                                                try {
                                                    c16747.f51410 = c7370;
                                                    c16747.f51418 = C14986.m35494(M39388.f71979.f34605, new C7931[0]);
                                                    c16747.f51415 = M39388.f71979.f34611;
                                                    c16747.m39399();
                                                    c4548M39389 = null;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    enumC4569 = null;
                                                }
                                            } else {
                                                c16747.f51417.m47214();
                                                C11604 c11605 = M39388.f71979;
                                                EnumC3137 enumC3138 = EnumC3137.INVALID_RESULT;
                                                new IllegalStateException("Syntax window task published an invalid result");
                                                c4548M39389 = c16747.m39388(c11605, enumC3138);
                                                c7370 = null;
                                            }
                                            c4548M39388 = c4548M39389;
                                        } else {
                                            if (Thread.currentThread().isInterrupted()) {
                                                throw new C13719();
                                            }
                                            c16747.m39407();
                                            C11604 c11606 = M39388.f71979;
                                            EnumC3137 enumC3139 = EnumC3137.INVALID_RESULT;
                                            new IllegalStateException("Syntax window task completed without publication");
                                            c4548M39388 = c16747.m39388(c11606, enumC3139);
                                            c7370 = null;
                                        }
                                    } else {
                                        if (c16747.f51424 == M39388) {
                                            c16747.f51424 = null;
                                        }
                                        c16747.m39402(M39388.f71979);
                                        c4548M39388 = null;
                                        c7370 = null;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    enumC4569 = null;
                                    c7370 = null;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                        try {
                            throw th;
                        } catch (Error e3) {
                            e = e3;
                            c221814 = null;
                            obj6 = enumC4569;
                            obj5 = c7370;
                            z7 = false;
                            c221817 = c221818;
                            M39388 = obj6;
                            r7 = M39388;
                            r8 = obj5;
                            r16 = c221814;
                            synchronized (c16747.f51405) {
                                if (c16747.f51424 == r7) {
                                    c16747.f51424 = c221817;
                                }
                                c16747.m39402(r7.f71979);
                            }
                            throw e;
                        } catch (RuntimeException e4) {
                            e = e4;
                            c221813 = null;
                            obj4 = enumC4569;
                            obj3 = c7370;
                            z7 = false;
                            z2 = true;
                            c221817 = c221819;
                            M39388 = obj4;
                            r7 = M39388;
                            r8 = obj3;
                            r16 = c221813;
                            if (!(e instanceof C13719) && ((!(e instanceof C8097) || ((C8097) e).m21522() != EnumC0335.CANCELED) && C11604.m28489(r7.f71979))) {
                                z2 = false;
                            }
                            synchronized (c16747.f51405) {
                                if (c16747.f51424 == r7) {
                                    c16747.f51424 = c221817;
                                }
                                if (z2) {
                                    C11604.m28505(r7.f71979);
                                }
                                c16747.m39402(r7.f71979);
                                M39388 = M39388;
                                if (!z2) {
                                    M39388 = c16747.m39388(r7.f71979, m39387(e));
                                }
                            }
                            synchronized (c16747.f51405) {
                                if (c16747.f51424 == r7 && r7.f71979.f34603) {
                                    c16747.f51424 = c221817;
                                }
                                r7.f71980 = z7;
                                if (c16747.f51424 != r7) {
                                    c16747.f51432.add(r7);
                                }
                                c16747.f51420 = z7;
                                zM39406 = c16747.m39405();
                                if (c16747.f51409 == null && c16747.f51424 == null) {
                                    c16747.f51405.notifyAll();
                                }
                                z3 = c16747.f51412;
                                c16747.f51412 = z7;
                            }
                            try {
                                c16747.m39398();
                                if (zM39406) {
                                    c16747.m39400();
                                }
                                if (z3) {
                                    InterfaceC12309 interfaceC123012 = c16747.f51423;
                                    C11003.requireNonNull(interfaceC123012);
                                    c16747.m39390(new RunnableC2539(1, interfaceC123012));
                                }
                                if (r16 != 0) {
                                    final long j5 = r16.f18268;
                                    c16747.m39390(new Runnable() { // from class: l.۠ۡܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C16747.m39406(this.f24879, j5);
                                        }
                                    });
                                }
                                if (r8 != 0) {
                                    final long j6 = r8.f22638;
                                    c16747.m39390(new Runnable() { // from class: l.֨ۡܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C16747.m39393(this.f3751, j6);
                                        }
                                    });
                                }
                                if (M39388 != 0) {
                                    c16747.m39390(new RunnableC20004(2, c16747, M39388));
                                    return;
                                }
                                return;
                            } catch (Throwable th9) {
                                if (!zM39406) {
                                    throw th9;
                                }
                                c16747.m39400();
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            c221812 = null;
                            obj2 = enumC4569;
                            obj = c7370;
                            z7 = false;
                            c22188 = c221820;
                            r4 = obj2;
                            r5 = M39388;
                            r9 = obj;
                            r17 = c221812;
                            synchronized (c16747.f51405) {
                                if (c16747.f51424 == r5) {
                                    c16747.f51424 = c22188;
                                }
                                r5.f71980 = z7;
                                if (c16747.f51424 != r5) {
                                    c16747.f51432.add(r5);
                                }
                                c16747.f51420 = z7;
                                zM39405 = c16747.m39405();
                                if (c16747.f51409 == null) {
                                    c16747.f51405.notifyAll();
                                }
                                z = c16747.f51412;
                                c16747.f51412 = z7;
                                try {
                                    c16747.m39398();
                                    if (zM39405) {
                                        c16747.m39400();
                                    }
                                    if (z) {
                                        InterfaceC12309 interfaceC123013 = c16747.f51423;
                                        C11003.requireNonNull(interfaceC123013);
                                        c16747.m39390(new RunnableC2539(1, interfaceC123013));
                                    }
                                    if (r17 != 0) {
                                        final long j7 = r17.f18268;
                                        c16747.m39390(new Runnable() { // from class: l.۠ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C16747.m39406(this.f24879, j7);
                                            }
                                        });
                                    }
                                    if (r9 != 0) {
                                        final long j8 = r9.f22638;
                                        c16747.m39390(new Runnable() { // from class: l.֨ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C16747.m39393(this.f3751, j8);
                                            }
                                        });
                                    }
                                    if (r4 != 0) {
                                        c16747.m39390(new RunnableC20004(2, c16747, r4));
                                    }
                                    throw th;
                                } catch (Throwable th11) {
                                    if (!zM39405) {
                                        throw th11;
                                    }
                                    c16747.m39400();
                                    throw th11;
                                }
                            }
                        }
                        synchronized (c16747.f51405) {
                            if (c16747.f51424 == M39388 && M39388.f71979.f34603) {
                                c16747.f51424 = null;
                            }
                            M39388.f71980 = false;
                            if (c16747.f51424 != M39388) {
                                c16747.f51432.add(M39388);
                            }
                            c16747.f51420 = false;
                            zM39407 = c16747.m39405();
                            if (c16747.f51409 == null && c16747.f51424 == null) {
                                c16747.f51405.notifyAll();
                            }
                            z4 = c16747.f51412;
                            c16747.f51412 = false;
                        }
                        try {
                            c16747.m39398();
                            if (zM39407) {
                                c16747.m39400();
                            }
                            if (z4) {
                                InterfaceC12309 interfaceC123014 = c16747.f51423;
                                C11003.requireNonNull(interfaceC123014);
                                c16747.m39390(new RunnableC2539(1, interfaceC123014));
                            }
                            if (c59512 != null) {
                                final long j9 = c59512.f18268;
                                c16747.m39390(new Runnable() { // from class: l.۠ۡܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C16747.m39406(this.f24879, j9);
                                    }
                                });
                            }
                            if (c7370 != null) {
                                final long j10 = c7370.f22638;
                                c16747.m39390(new Runnable() { // from class: l.֨ۡܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C16747.m39393(this.f3751, j10);
                                    }
                                });
                            }
                            if (c4548M39388 != null) {
                                c16747.m39390(new RunnableC20004(2, c16747, c4548M39388));
                            }
                        } catch (Throwable th12) {
                            if (!zM39407) {
                                throw th12;
                            }
                            c16747.m39400();
                            throw th12;
                        }
                    }
                    try {
                        if (enumC4569Mo6347 == EnumC4569.ABORTED) {
                            c22189 = null;
                            c221811 = null;
                            c221810 = null;
                            try {
                                throw new IllegalStateException("Syntax task aborted without a failure");
                            } catch (Error e5) {
                                e = e5;
                                C22187 c221822 = c221811;
                                C22187 c221823 = c221822;
                                c221814 = c221823;
                                c221818 = c221822;
                                obj6 = c221823;
                                obj5 = c221811;
                                z7 = false;
                                c221817 = c221818;
                                M39388 = obj6;
                                r7 = M39388;
                                r8 = obj5;
                                r16 = c221814;
                                synchronized (c16747.f51405) {
                                    if (c16747.f51424 == r7) {
                                        c16747.f51424 = c221817;
                                    }
                                    c16747.m39402(r7.f71979);
                                    throw e;
                                }
                            } catch (RuntimeException e6) {
                                e = e6;
                                C22187 c221824 = c221810;
                                C22187 c221825 = c221824;
                                c221813 = c221825;
                                c221819 = c221824;
                                obj4 = c221825;
                                obj3 = c221810;
                                z7 = false;
                                z2 = true;
                                c221817 = c221819;
                                M39388 = obj4;
                                r7 = M39388;
                                r8 = obj3;
                                r16 = c221813;
                                if (!(e instanceof C13719)) {
                                    z2 = false;
                                }
                                synchronized (c16747.f51405) {
                                    if (c16747.f51424 == r7) {
                                        c16747.f51424 = c221817;
                                    }
                                    if (z2) {
                                        C11604.m28505(r7.f71979);
                                    }
                                    c16747.m39402(r7.f71979);
                                    M39388 = M39388;
                                    if (!z2) {
                                        M39388 = c16747.m39388(r7.f71979, m39387(e));
                                    }
                                    synchronized (c16747.f51405) {
                                        if (c16747.f51424 == r7) {
                                            c16747.f51424 = c221817;
                                        }
                                        r7.f71980 = z7;
                                        if (c16747.f51424 != r7) {
                                            c16747.f51432.add(r7);
                                        }
                                        c16747.f51420 = z7;
                                        zM39406 = c16747.m39405();
                                        if (c16747.f51409 == null) {
                                            c16747.f51405.notifyAll();
                                        }
                                        z3 = c16747.f51412;
                                        c16747.f51412 = z7;
                                        c16747.m39398();
                                        if (zM39406) {
                                            c16747.m39400();
                                        }
                                        if (z3) {
                                            InterfaceC12309 interfaceC123015 = c16747.f51423;
                                            C11003.requireNonNull(interfaceC123015);
                                            c16747.m39390(new RunnableC2539(1, interfaceC123015));
                                        }
                                        if (r16 != 0) {
                                            final long j11 = r16.f18268;
                                            c16747.m39390(new Runnable() { // from class: l.۠ۡܿ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C16747.m39406(this.f24879, j11);
                                                }
                                            });
                                        }
                                        if (r8 != 0) {
                                            final long j12 = r8.f22638;
                                            c16747.m39390(new Runnable() { // from class: l.֨ۡܿ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C16747.m39393(this.f3751, j12);
                                                }
                                            });
                                        }
                                        if (M39388 != 0) {
                                            c16747.m39390(new RunnableC20004(2, c16747, M39388));
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                C22187 c221826 = c22189;
                                C22187 c221827 = c221826;
                                c221812 = c221827;
                                c221820 = c221826;
                                obj2 = c221827;
                                obj = c22189;
                                z7 = false;
                                c22188 = c221820;
                                r4 = obj2;
                                r5 = M39388;
                                r9 = obj;
                                r17 = c221812;
                                synchronized (c16747.f51405) {
                                    if (c16747.f51424 == r5) {
                                        c16747.f51424 = c22188;
                                    }
                                    r5.f71980 = z7;
                                    if (c16747.f51424 != r5) {
                                        c16747.f51432.add(r5);
                                    }
                                    c16747.f51420 = z7;
                                    zM39405 = c16747.m39405();
                                    if (c16747.f51409 == null) {
                                        c16747.f51405.notifyAll();
                                    }
                                    z = c16747.f51412;
                                    c16747.f51412 = z7;
                                    c16747.m39398();
                                    if (zM39405) {
                                        c16747.m39400();
                                    }
                                    if (z) {
                                        InterfaceC12309 interfaceC123016 = c16747.f51423;
                                        C11003.requireNonNull(interfaceC123016);
                                        c16747.m39390(new RunnableC2539(1, interfaceC123016));
                                    }
                                    if (r17 != 0) {
                                        final long j13 = r17.f18268;
                                        c16747.m39390(new Runnable() { // from class: l.۠ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C16747.m39406(this.f24879, j13);
                                            }
                                        });
                                    }
                                    if (r9 != 0) {
                                        final long j14 = r9.f22638;
                                        c16747.m39390(new Runnable() { // from class: l.֨ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C16747.m39393(this.f3751, j14);
                                            }
                                        });
                                    }
                                    if (r4 != 0) {
                                        c16747.m39390(new RunnableC20004(2, c16747, r4));
                                    }
                                    throw th;
                                }
                            }
                        }
                        c59512 = null;
                        c4548M39388 = null;
                    } catch (Error e7) {
                        e = e7;
                        c221811 = null;
                    } catch (RuntimeException e8) {
                        e = e8;
                        c221810 = null;
                    } catch (Throwable th14) {
                        th = th14;
                        c22189 = null;
                    }
                    c7370 = null;
                    synchronized (c16747.f51405) {
                        if (c16747.f51424 == M39388) {
                            c16747.f51424 = null;
                        }
                        M39388.f71980 = false;
                        if (c16747.f51424 != M39388) {
                            c16747.f51432.add(M39388);
                        }
                        c16747.f51420 = false;
                        zM39407 = c16747.m39405();
                        if (c16747.f51409 == null) {
                            c16747.f51405.notifyAll();
                        }
                        z4 = c16747.f51412;
                        c16747.f51412 = false;
                        c16747.m39398();
                        if (zM39407) {
                            c16747.m39400();
                        }
                        if (z4) {
                            InterfaceC12309 interfaceC123017 = c16747.f51423;
                            C11003.requireNonNull(interfaceC123017);
                            c16747.m39390(new RunnableC2539(1, interfaceC123017));
                        }
                        if (c59512 != null) {
                            final long j15 = c59512.f18268;
                            c16747.m39390(new Runnable() { // from class: l.۠ۡܿ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C16747.m39406(this.f24879, j15);
                                }
                            });
                        }
                        if (c7370 != null) {
                            final long j16 = c7370.f22638;
                            c16747.m39390(new Runnable() { // from class: l.֨ۡܿ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C16747.m39393(this.f3751, j16);
                                }
                            });
                        }
                        if (c4548M39388 != null) {
                            c16747.m39390(new RunnableC20004(2, c16747, c4548M39388));
                        }
                    }
                } catch (Error e9) {
                    e = e9;
                    c221811 = null;
                } catch (RuntimeException e10) {
                    e = e10;
                    c221810 = null;
                } catch (Throwable th15) {
                    th = th15;
                    c22189 = null;
                }
            } catch (Throwable th16) {
                th = th16;
                r9 = r8;
                c22188 = c221817;
                r4 = M39388;
                r5 = r7;
                r17 = r16;
                synchronized (c16747.f51405) {
                    if (c16747.f51424 == r5 && r5.f71979.f34603) {
                        c16747.f51424 = c22188;
                    }
                    r5.f71980 = z7;
                    if (c16747.f51424 != r5) {
                        c16747.f51432.add(r5);
                    }
                    c16747.f51420 = z7;
                    zM39405 = c16747.m39405();
                    if (c16747.f51409 == null && c16747.f51424 == null) {
                        c16747.f51405.notifyAll();
                    }
                    z = c16747.f51412;
                    c16747.f51412 = z7;
                }
                c16747.m39398();
                if (zM39405) {
                    c16747.m39400();
                }
                if (z) {
                    InterfaceC12309 interfaceC123018 = c16747.f51423;
                    C11003.requireNonNull(interfaceC123018);
                    c16747.m39390(new RunnableC2539(1, interfaceC123018));
                }
                if (r17 != 0) {
                    final long j17 = r17.f18268;
                    c16747.m39390(new Runnable() { // from class: l.۠ۡܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16747.m39406(this.f24879, j17);
                        }
                    });
                }
                if (r9 != 0) {
                    final long j18 = r9.f22638;
                    c16747.m39390(new Runnable() { // from class: l.֨ۡܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16747.m39393(this.f3751, j18);
                        }
                    });
                }
                if (r4 != 0) {
                    c16747.m39390(new RunnableC20004(2, c16747, r4));
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C20071 m39389(C22187 c22187) throws Throwable {
        C5959 c5959;
        C7370 c7370;
        C10214 c10214M16781;
        C11604 c11604 = c22187.f71979;
        m39391(c11604);
        C7744 c7744Mo26556 = c11604.f34601.mo26556();
        c22187.f71982 = c7744Mo26556;
        if (c7744Mo26556.m20767() != c11604.f34611 || c7744Mo26556.length() != c11604.f34605) {
            throw new C13719();
        }
        synchronized (this.f51405) {
            C22187 c22188 = this.f51424;
            if (c22188 == null || c22188.f71979 != c11604 || this.f51413 != c11604.f34612 || this.f51425 != c11604.f34602 || this.f51421 != c11604.f34601 || this.f51434 != c11604.f34600.m50980() || c11604.f34603) {
                throw new C13719();
            }
            c5959 = this.f51422;
            c7370 = this.f51410;
        }
        m39391(c11604);
        long j = 0;
        if (c11604.f34600.m50980()) {
            C14280 c14280 = c7370 != null ? c7370.f22640 : null;
            if (this.f51417.m47216() != c14280) {
                this.f51417.m47214();
            }
            C6520 c6520M47213 = this.f51417.m47213(c11604.f34602, c11604.f34601, c7744Mo26556, c11604.f34611, C11604.m28490(c11604), C11604.m28495(c11604), new C0314(c11604), c11604.f34599 == c7370 ? c14280 : null, c11604.f34606);
            m39391(c11604);
            if (this.f51429) {
                c6520M47213.m18033(c11604.f34604, this.f51433, new C15130(this, c11604));
            }
            return new C20071(new C1931(c6520M47213), 0L);
        }
        if (this.f51411.m16784() != (c5959 == null ? null : c5959.f18266)) {
            this.f51411.m16783();
        } else if (c5959 != null) {
            j = c5959.f18268;
        }
        C15650 c15650 = (c11604.f34597 != null && c11604.f34597 == c5959 && this.f51411.m16784() == c11604.f34597.f18266) ? c11604.f34597.f18266 : null;
        if (c11604.f34600 == EnumC22892.EDIT) {
            c10214M16781 = this.f51411.m16782(c11604.f34602, c11604.f34601, c7744Mo26556, c15650, c11604.f34611, c11604.f34606, new C0314(c11604));
        } else {
            c10214M16781 = this.f51411.m16781(c11604.f34602, c11604.f34601, c7744Mo26556, c11604.f34611, new C0314(c11604));
        }
        m39391(c11604);
        if (this.f51429) {
            c10214M16781.m25634(c11604.f34604, this.f51433, new C15130(this, c11604));
        }
        return new C20071(new C13014(c10214M16781), j);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m39400() {
        boolean z = false;
        Object c4548 = null;
        try {
            this.f51433.execute(new RunnableC6438(1, this));
        } catch (Error e) {
            synchronized (this.f51405) {
                this.f51420 = false;
                m39408();
                this.f51424 = null;
                this.f51411.m16785();
                this.f51417.m47217();
                C5980 c5980 = this.f51411;
                C5959 c5959 = this.f51422;
                if (c5959 != null) {
                    c4548 = c5959.f18266;
                }
                if (c5980.m16784() != c4548) {
                    c5980.m16783();
                    m39399();
                }
                m39407();
                m39398();
                throw e;
            }
        } catch (RuntimeException unused) {
            synchronized (this.f51405) {
                this.f51420 = false;
                C11604 c11604 = this.f51409;
                if (c11604 == null) {
                    C22187 c22187 = this.f51424;
                    c11604 = c22187 == null ? null : c22187.f71979;
                }
                if (c11604 != null && this.f51413 == c11604.f34612 && C11604.m28489(c11604)) {
                    z = true;
                }
                m39408();
                this.f51424 = null;
                this.f51411.m16785();
                this.f51417.m47217();
                C5980 c5981 = this.f51411;
                C5959 c59510 = this.f51422;
                if (c5981.m16784() != (c59510 == null ? null : c59510.f18266)) {
                    c5981.m16783();
                    m39399();
                }
                m39407();
                c4548 = z ? new C4548(this.f51414, c11604.f34612, c11604.f34611, c11604.f34605, c11604.f34600, C11604.m28490(c11604), C11604.m28495(c11604), EnumC3137.SCHEDULER_REJECTED) : null;
                m39398();
                if (c4548 != null) {
                    m39390(new RunnableC20004(2, this, c4548));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m39406(C16747 c16747, long j) {
        synchronized (c16747.f51405) {
            C5959 c5959 = c16747.f51422;
            if (c5959 != null && c5959.f18268 == j && c16747.f51413 == j && c16747.m39397(c5959.f18269, c5959.f18270)) {
                ((C10899) c16747.f51423).f32771.m47481(c5959);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39393(C16747 c16747, long j) {
        synchronized (c16747.f51405) {
            C7370 c7370 = c16747.f51410;
            if (c7370 != null && c7370.f22638 == j && c16747.f51413 == j && c16747.m39397(c7370.f22637, c7370.f22639)) {
                ((C10899) c16747.f51423).f32771.m47482(c7370);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39394(C16747 c16747, C4548 c4548) {
        synchronized (c16747.f51405) {
            if (c16747.f51413 == c4548.f14512 && c16747.m39397(c4548.f14510, c4548.f14511)) {
                C10899 c10899 = (C10899) c16747.f51423;
                C20777.m47492(c10899.f32771, c4548);
                c10899.f32772.postInvalidateOnAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39390(Runnable runnable) {
        try {
            this.f51426.execute(new RunnableC5254(0, runnable));
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m39404() {
        if (this.f51403 != null) {
            this.f51403.f30627 = true;
        }
        this.f51403 = null;
        long j = this.f51428 + 1;
        this.f51428 = j;
        this.f51413 = j;
        this.f51405.notifyAll();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m39399() {
        this.f51431 = false;
        this.f51404 = null;
        this.f51416 = 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m39401() {
        this.f51418 = null;
        this.f51415 = 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m39408() {
        if (this.f51403 != null) {
            this.f51403.f30627 = true;
        }
        this.f51403 = null;
        C11604 c11604 = this.f51409;
        if (c11604 != null) {
            C11604.m28505(c11604);
        }
        C22187 c22187 = this.f51424;
        if (c22187 != null) {
            C11604.m28505(c22187.f71979);
            if (!this.f51424.f71980) {
                this.f51432.add(this.f51424);
            }
        }
        this.f51409 = null;
        this.f51424 = null;
        this.f51405.notifyAll();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m39398() {
        C22187 c22187;
        while (true) {
            synchronized (this.f51405) {
                c22187 = (C22187) this.f51432.pollFirst();
            }
            if (c22187 == null) {
                return;
            } else {
                try {
                    C22187.m49834(c22187);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m39402(C11604 c11604) {
        if (this.f51403 != null && this.f51403.f30628 == c11604.f34612) {
            this.f51403.f30627 = true;
            this.f51403 = null;
            this.f51412 = true;
        }
        if (this.f51425 == c11604.f34602 && this.f51421 == c11604.f34601 && this.f51434 == c11604.f34600.m50980()) {
            if (c11604.f34600.m50980()) {
                this.f51417.m47217();
                m39407();
                return;
            }
            this.f51411.m16785();
            C5980 c5980 = this.f51411;
            C5959 c5959 = this.f51422;
            if (c5980.m16784() != (c5959 != null ? c5959.f18266 : null)) {
                c5980.m16783();
                m39399();
                return;
            }
            return;
        }
        this.f51411.m16783();
        this.f51417.m47214();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m39407() {
        C7370 c7370 = this.f51410;
        C14280 c14280 = c7370 == null ? null : c7370.f22640;
        C20632 c20632 = this.f51417;
        if (c20632.m47216() != c14280) {
            c20632.m47214();
            m39401();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private boolean m39405() {
        if (this.f51420) {
            return false;
        }
        if (this.f51409 == null && this.f51424 == null) {
            return false;
        }
        this.f51420 = true;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C4548 m39388(C11604 c11604, EnumC3137 enumC3137) {
        if (this.f51413 != c11604.f34612 || c11604.f34603 || !C11604.m28489(c11604)) {
            return null;
        }
        return new C4548(this.f51414, c11604.f34612, c11604.f34611, c11604.f34605, c11604.f34600, C11604.m28490(c11604), C11604.m28495(c11604), enumC3137);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3137 m39387(RuntimeException runtimeException) {
        if (runtimeException instanceof C8097) {
            int i = C21482.f69116[((C8097) runtimeException).m21522().ordinal()];
            if (i == 1) {
                return EnumC3137.REGEX_TIMEOUT;
            }
            if (i == 2) {
                return EnumC3137.REGEX_RESOURCE_LIMIT;
            }
            if (i == 3) {
                return EnumC3137.INVALID_RESULT;
            }
            if (i != 4) {
                throw new IncompatibleClassChangeError();
            }
            throw new IllegalArgumentException("Canceled syntax requests must not publish failures", runtimeException);
        }
        return EnumC3137.EXECUTION_BUG;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39391(C11604 c11604) {
        if (c11604.f34603 || !C11604.m28489(c11604)) {
            throw new C13719();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m39397(int i, int i2) {
        InterfaceC20445 interfaceC20445 = this.f51421;
        if (interfaceC20445 == null) {
            return false;
        }
        try {
            return interfaceC20445.mo26548() == i && interfaceC20445.length() == i2 && interfaceC20445.mo26548() == i;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
