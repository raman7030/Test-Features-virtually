package p067l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܽܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R704 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18285 {

    /* JADX INFO: renamed from: ۟ */
    public static final ExecutorC10715 f54584 = new ExecutorC10715(Runtime.getRuntime().availableProcessors());

    /* JADX INFO: renamed from: ֡ */
    public final int f54585;

    /* JADX INFO: renamed from: ֨ */
    public volatile C12056 f54586;

    /* JADX INFO: renamed from: ֫ */
    public C16611 f54587;

    /* JADX INFO: renamed from: ۗ */
    public int f54589;

    /* JADX INFO: renamed from: ۘ */
    public final long f54590;

    /* JADX INFO: renamed from: ۚ */
    public C13397 f54592;

    /* JADX INFO: renamed from: ۛ */
    public C9373 f54593;

    /* JADX INFO: renamed from: ۠ */
    public boolean f54595;

    /* JADX INFO: renamed from: ۡ */
    public long f54596;

    /* JADX INFO: renamed from: ۤ */
    public int f54598;

    /* JADX INFO: renamed from: ۧ */
    public int f54599;

    /* JADX INFO: renamed from: ۫ */
    public C16611 f54601;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC21800 f54602;

    /* JADX INFO: renamed from: ܰ */
    public boolean f54603;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC21800 f54604;

    /* JADX INFO: renamed from: ܶ */
    public C8032 f54605;

    /* JADX INFO: renamed from: ܺ */
    public final InterfaceC14067 f54606;

    /* JADX INFO: renamed from: ܽ */
    public C23455 f54607;

    /* JADX INFO: renamed from: ܿ */
    public C24320 f54608;

    /* JADX INFO: renamed from: ᩳ */
    public final ExecutorC4009 f54609;

    /* JADX INFO: renamed from: ᩴ */
    public final int f54610;

    /* JADX INFO: renamed from: ᩵ */
    public long f54611;

    /* JADX INFO: renamed from: ᩷ */
    public C22135 f54613;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f54614;

    /* JADX INFO: renamed from: ᩺ */
    public final Executor f54616;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f54617;

    /* JADX INFO: renamed from: ۖ */
    public final Object f54588 = new Object();

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayDeque f54615 = new ArrayDeque();

    /* JADX INFO: renamed from: ۢ */
    public final Object f54597 = new Object();

    /* JADX INFO: renamed from: ۜ */
    public final C8052 f54594 = new C8052();

    /* JADX INFO: renamed from: ۨ */
    public final C21977 f54600 = new C21977();

    /* JADX INFO: renamed from: ۙ */
    public long f54591 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f54612 = true;

    public C18285(ExecutorC4009 executorC4009, InterfaceC14067 interfaceC14067) {
        ExecutorC10715 executorC10715 = f54584;
        C12826.requireNonNull(executorC10715, "workerExecutor");
        this.f54616 = executorC10715;
        this.f54585 = executorC10715.f29681;
        this.f54609 = executorC4009;
        this.f54606 = interfaceC14067;
        this.f54610 = 4096;
        this.f54590 = 8000000L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41651(C24320 c24320, InterfaceC21800 interfaceC21800, C11209 c11209, int i) {
        m41632(c24320, interfaceC21800, interfaceC21800.mo28581(), interfaceC21800.length(), EnumC24125.FRESH, c11209, i, 0, 0, 0, -1, -1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41650(C24320 c24320, InterfaceC21800 interfaceC21800, int i, int i2, int i3, C11209 c11209, int i4) {
        C12826.requireNonNull(interfaceC21800, TextBundle.TEXT_ENTRY);
        int iMo28581 = interfaceC21800.mo28581();
        int length = interfaceC21800.length();
        long j = i2;
        long j2 = (((long) length) - ((long) i3)) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || j2 < 0 || j2 > 2147483647L || ((long) i) + j > j2) {
            throw new IndexOutOfBoundsException("Invalid syntax worker edit range");
        }
        m41632(c24320, interfaceC21800, iMo28581, length, EnumC24125.EDIT, c11209, i4, i, i2, i3, -1, -1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41656(C24320 c24320, InterfaceC21800 interfaceC21800, int i, int i2, int i3) {
        C12826.requireNonNull(c24320, "program");
        C12826.requireNonNull(interfaceC21800, TextBundle.TEXT_ENTRY);
        int iMo28581 = interfaceC21800.mo28581();
        int length = interfaceC21800.length();
        C12826.checkFromToIndex(i, i2, length);
        m41632(c24320, interfaceC21800, iMo28581, length, EnumC24125.WINDOW, null, i3, 0, 0, 0, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41649(C24320 c24320, InterfaceC21800 interfaceC21800, int i, int i2, int i3) {
        C16611 c16611;
        int iMo28581 = interfaceC21800.mo28581();
        long j = i2;
        long length = (((long) interfaceC21800.length()) - ((long) i3)) + j;
        if (i < 0 || i2 < 0 || i3 < 0 || length < 0 || length > 2147483647L || ((long) i) + j > length) {
            throw new IndexOutOfBoundsException("Invalid syntax window edit range");
        }
        try {
            synchronized (this.f54588) {
                m41640();
                m41644();
                this.f54600.m49544();
                C8052 c8052 = this.f54594;
                C8032 c8032 = this.f54605;
                if (c8052.m18710() != (c8032 == null ? null : c8032.f21120)) {
                    c8052.m18709();
                    m41635();
                }
                m41643();
                m41635();
                if (this.f54617 && this.f54608 == c24320 && this.f54604 == interfaceC21800 && this.f54593 != null && (c16611 = this.f54601) != null && this.f54598 + 1 == iMo28581 && c16611.m37665() == length) {
                    this.f54601 = this.f54601.m37655(new C9906(i, i2 + i, i3));
                    this.f54598 = iMo28581;
                } else {
                    m41637();
                }
            }
            m41634();
        } catch (Throwable th) {
            m41634();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C8032 m41657() {
        C8032 c8032;
        synchronized (this.f54588) {
            c8032 = this.f54605;
        }
        return c8032;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C9373 m41659() {
        C9373 c9373;
        synchronized (this.f54588) {
            c9373 = this.f54593;
        }
        return c9373;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41648(InterfaceC21800 interfaceC21800, int i, int i2) {
        if (i < 0 || i >= i2 || i2 > interfaceC21800.length()) {
            return;
        }
        synchronized (this.f54588) {
            if (this.f54604 != interfaceC21800) {
                return;
            }
            this.f54602 = interfaceC21800;
            this.f54589 = interfaceC21800.mo28581();
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            this.f54591 = j;
            C13397 c13397 = this.f54592;
            if (c13397 == null) {
                C23455 c23455 = this.f54607;
                c13397 = c23455 == null ? null : c23455.f74700;
            }
            if (c13397 != null && C13397.m30535(c13397)) {
                c13397.f37595 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12056 m41655() {
        return this.f54586;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41631(final C18285 c18285, C13397 c13397, C14757 c14757) {
        synchronized (c18285.f54588) {
            C23455 c23455 = c18285.f54607;
            if (c23455 != null && c23455.f74700 == c13397 && !c13397.f37600 && c18285.f54596 == c13397.f37609 && C13397.m30535(c13397)) {
                if (c18285.f54586 != null) {
                    c18285.f54586.f33589 = true;
                }
                c18285.f54586 = new C12056(c13397, c14757);
                final long j = c13397.f37609;
                c18285.m41626(new Runnable() { // from class: l.᩵ۡܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18285.m41639(this.f65303, j);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41639(C18285 c18285, long j) {
        synchronized (c18285.f54588) {
            C12056 c12056 = c18285.f54586;
            if (c12056 != null && c12056.f33590 == j && c12056.m27613()) {
                C22115.m49823(((C12727) c18285.f54606).f35749, c12056);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m41645(InterfaceC21800 interfaceC21800) {
        long j;
        synchronized (this.f54588) {
            j = this.f54604 == interfaceC21800 ? this.f54596 : 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41647(long j) {
        if (j != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(500L) + System.nanoTime();
            synchronized (this.f54588) {
                while (this.f54596 == j && (this.f54592 != null || this.f54607 != null)) {
                    long jNanoTime = nanos - System.nanoTime();
                    if (jNanoTime <= 0) {
                        return;
                    } else {
                        TimeUnit.NANOSECONDS.timedWait(this.f54588, jNanoTime);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41653(C8032 c8032) {
        boolean z;
        synchronized (this.f54588) {
            z = this.f54605 == c8032 && this.f54596 == c8032.f21122 && m41633(c8032.f21123, c8032.f21124);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41654(C9373 c9373) {
        boolean z;
        synchronized (this.f54588) {
            z = this.f54593 == c9373 && this.f54596 == c9373.f25550 && m41633(c9373.f25549, c9373.f25551);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41652(C6691 c6691) {
        boolean z;
        synchronized (this.f54588) {
            z = c6691.f17337 == this.f54597 && this.f54596 == c6691.f17342 && m41633(c6691.f17340, c6691.f17341);
        }
        return z;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m41658() {
        try {
            synchronized (this.f54588) {
                m41640();
                m41644();
                this.f54594.m18711();
                this.f54600.m49544();
                C17242 c17242 = null;
                this.f54613 = null;
                C8052 c8052 = this.f54594;
                C8032 c8032 = this.f54605;
                if (c8032 != null) {
                    c17242 = c8032.f21120;
                }
                if (c8052.m18710() != c17242) {
                    c8052.m18709();
                    m41635();
                }
                m41643();
                m41635();
                m41637();
            }
            m41634();
        } catch (Throwable th) {
            m41634();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41646() {
        try {
            synchronized (this.f54588) {
                m41640();
                m41644();
                this.f54594.m18709();
                this.f54600.m49541();
                this.f54608 = null;
                this.f54604 = null;
                this.f54602 = null;
                this.f54591 = -1L;
                this.f54617 = false;
                this.f54613 = null;
                this.f54605 = null;
                this.f54593 = null;
                m41635();
                m41637();
            }
            m41634();
        } catch (Throwable th) {
            m41634();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41632(C24320 c24320, InterfaceC21800 interfaceC21800, int i, int i2, EnumC24125 enumC24125, C11209 c11209, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean zM41641;
        C16611 c16611;
        C16611 c16612;
        C12826.requireNonNull(c24320, "program");
        C12826.requireNonNull(interfaceC21800, TextBundle.TEXT_ENTRY);
        if (enumC24125 != EnumC24125.WINDOW && c11209 != null && c11209.m25889() != i2) {
            throw new IllegalArgumentException("Display syntax base length mismatch");
        }
        try {
            synchronized (this.f54588) {
                try {
                    C12056 c12056 = this.f54586;
                    boolean z = this.f54604 != interfaceC21800;
                    C24320 c24321 = this.f54608;
                    boolean z2 = (c24321 == c24320 && !z && (c24321 == null || this.f54617 == enumC24125.m53371())) ? false : true;
                    m41640();
                    m41644();
                    if (z2) {
                        this.f54594.m18709();
                        this.f54600.m49541();
                        if (this.f54602 != interfaceC21800) {
                            this.f54602 = null;
                            this.f54591 = -1L;
                        }
                        this.f54608 = c24320;
                        this.f54604 = interfaceC21800;
                        this.f54617 = enumC24125.m53371();
                        this.f54605 = null;
                        this.f54593 = null;
                        m41635();
                        m41637();
                    } else if (enumC24125.m53371()) {
                        this.f54600.m49544();
                    } else {
                        this.f54594.m18711();
                    }
                    boolean z3 = z2;
                    long j = (((long) i2) - ((long) i6)) + ((long) i5);
                    if (enumC24125 == EnumC24125.EDIT && this.f54614 && this.f54605 != null && (c16612 = this.f54587) != null && this.f54599 + 1 == i && c16612.m37665() == j) {
                        this.f54587 = this.f54587.m37655(new C9906(i4, i5 + i4, i6));
                        this.f54599 = i;
                    } else {
                        m41635();
                    }
                    if (!enumC24125.m53371() || (c16611 = this.f54601) == null || this.f54598 != i || c16611.m37665() != i2) {
                        m41637();
                    }
                    C8032 c8032 = this.f54614 ? this.f54605 : null;
                    C22135 c22135 = this.f54613;
                    if (c22135 == null || c22135.f70017 != c24320 || c22135.f70019 != interfaceC21800 || c22135.f70016 != i || c22135.f70018 != i2) {
                        this.f54613 = new C22135(c24320, interfaceC21800, i, i2, this.f54585);
                    }
                    C13397 c13397 = new C13397(this.f54596, this.f54613, enumC24125, c8032, enumC24125.m53371() ? this.f54601 : this.f54587, c11209, i3, i7, i8, this.f54601 == null ? null : this.f54593);
                    this.f54592 = c13397;
                    if (this.f54602 == interfaceC21800 && this.f54589 == i) {
                        long j2 = this.f54591;
                        if (j2 != -1) {
                            c13397.f37595 = j2;
                        }
                    }
                    if (!z3 && c12056 != null && enumC24125.m53371() && c12056.f33587 == this.f54613) {
                        C14757 c14757 = c12056.f33588;
                        if (c14757.f42082 < i8 && c14757.f42081 > i7) {
                            this.f54586 = new C12056(this.f54592, c14757);
                        }
                    }
                    zM41641 = m41641();
                } catch (Throwable th) {
                    throw th;
                }
            }
            m41634();
            if (zM41641) {
                m41636();
            }
        } catch (Throwable th2) {
            m41634();
            throw th2;
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m41628(final C18285 c18285) {
        C23455 c23455;
        ?? r16;
        ?? r8;
        ?? r9;
        C23455 c23456;
        ?? r17;
        ?? r5;
        ?? r4;
        boolean zM41641;
        boolean z;
        C23455 c23457;
        C23455 c23458;
        C23455 c23459;
        C23455 c234510;
        C23455 c234511;
        C23455 c234512;
        Object obj;
        Object obj2;
        boolean z2;
        boolean zM41642;
        boolean z3;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C6691 c6691M41624;
        C9373 c9373;
        boolean zM41643;
        boolean z4;
        ?? r6;
        C23455 c234513;
        C6691 c6691;
        C8032 c8032;
        C8032 c8033;
        C8032 c8034;
        C6691 c6692;
        C23455 c234514;
        C6691 c6691M41625;
        boolean z5;
        boolean zM41644;
        boolean z6;
        synchronized (c18285.f54588) {
            C23455 c234515 = null;
            C8032 c8035 = null;
            C23455 c234516 = null;
            C23455 c234517 = null;
            C23455 c234518 = null;
            if (c18285.f54592 != null) {
                C23455 c234519 = c18285.f54607;
                if (c234519 != null) {
                    C13397.m30551(c234519.f74700);
                    c18285.f54615.add(c18285.f54607);
                }
                c23455 = new C23455(c18285.f54592);
                c18285.f54592 = null;
                c18285.f54607 = c23455;
            } else {
                c23455 = c18285.f54607;
            }
            ?? M41624 = c23455;
            ?? r7 = 0;
            if (M41624 == 0) {
                c18285.f54603 = false;
                return;
            }
            boolean z7 = true;
            M41624.f74701 = true;
            try {
                try {
                    c18285.m41634();
                    InterfaceC12922 interfaceC12922 = M41624.f74702;
                    if (interfaceC12922 == null) {
                        C21444 c21444M41625 = c18285.m41625(M41624);
                        synchronized (c18285.f54588) {
                            z5 = c18285.f54607 == M41624 && c18285.f54596 == M41624.f74700.f37609 && !M41624.f74700.f37600 && C13397.m30535(M41624.f74700);
                            if (z5) {
                                M41624.f74702 = c21444M41625.f67645;
                                M41624.getClass();
                                interfaceC12922 = c21444M41625.f67645;
                            } else {
                                c18285.m41638(M41624.f74700);
                            }
                        }
                        if (!z5) {
                            synchronized (c18285.f54588) {
                                if (c18285.f54607 == M41624 && M41624.f74700.f37600) {
                                    c18285.f54607 = null;
                                }
                                M41624.f74701 = false;
                                if (c18285.f54607 != M41624) {
                                    c18285.f54615.add(M41624);
                                }
                                c18285.f54603 = false;
                                zM41644 = c18285.m41641();
                                if (c18285.f54592 == null && c18285.f54607 == null) {
                                    c18285.f54588.notifyAll();
                                }
                                z6 = c18285.f54595;
                                c18285.f54595 = false;
                            }
                            try {
                                c18285.m41634();
                                if (zM41644) {
                                    c18285.m41636();
                                }
                                if (z6) {
                                    InterfaceC14067 interfaceC14067 = c18285.f54606;
                                    C12826.requireNonNull(interfaceC14067);
                                    c18285.m41626(new RunnableC4782(1, interfaceC14067));
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                if (!zM41644) {
                                    throw th;
                                }
                                c18285.m41636();
                                throw th;
                            }
                        }
                    }
                    m41627(M41624.f74700);
                    EnumC6711 enumC6711Mo8520 = interfaceC12922.mo8520(c18285.f54610, c18285.f54590, M41624.f74700.f37601.f70015);
                    m41627(M41624.f74700);
                    EnumC6711 enumC6711 = EnumC6711.COMPLETED;
                    if (enumC6711Mo8520 == enumC6711) {
                        if (!M41624.f74700.f37597.m53371()) {
                            C14737 c14737 = (C14737) interfaceC12922;
                            C17242 c17242M27655 = c14737.f42003.m27655();
                            C15901 c15901M25896 = (c17242M27655 == null || M41624.f74700.f37605 == null) ? null : M41624.f74700.f37605.m25896(c17242M27655.m39015());
                            synchronized (c18285.f54588) {
                                try {
                                    try {
                                        if (c18285.f54607 == M41624 && !M41624.f74700.f37600 && C13397.m30535(M41624.f74700) && c18285.f54596 == M41624.f74700.f37609) {
                                            c18285.f54607 = null;
                                            if (c17242M27655 != null && c14737.f42003.m27658()) {
                                                C8032 c8036 = new C8032(M41624.f74700.f37609, M41624.f74700.f37608, M41624.f74700.f37602, c17242M27655, M41624.f74700.f37605 != null, M41624.f74700.f37604, c15901M25896);
                                                try {
                                                    c18285.f54605 = c8036;
                                                    c18285.f54614 = true;
                                                    c18285.f54587 = C16611.m37650(M41624.f74700.f37602, new C9906[0]);
                                                    c18285.f54599 = M41624.f74700.f37608;
                                                    c8033 = c8036;
                                                    c6691M41624 = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    c8034 = c8036;
                                                    c234514 = null;
                                                    c6692 = null;
                                                    z7 = false;
                                                    z2 = true;
                                                    c234513 = c234514;
                                                    c6691 = c6692;
                                                    r6 = M41624;
                                                    c8032 = c8034;
                                                    while (true) {
                                                        break;
                                                    }
                                                    throw th;
                                                }
                                            }
                                            if (Thread.currentThread().isInterrupted()) {
                                                throw new C15407();
                                            }
                                            c18285.m41638(M41624.f74700);
                                            C13397 c13397 = M41624.f74700;
                                            EnumC5350 enumC5350 = EnumC5350.INVALID_RESULT;
                                            new IllegalStateException("Syntax task completed without publication");
                                            c6691M41624 = c18285.m41624(c13397, enumC5350);
                                        } else {
                                            if (c18285.f54607 == M41624) {
                                                c18285.f54607 = null;
                                            }
                                            c18285.m41638(M41624.f74700);
                                            c6691M41624 = null;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c6692 = c6691M41624;
                                        c8034 = c8033;
                                        c234514 = null;
                                        z7 = false;
                                        z2 = true;
                                        c234513 = c234514;
                                        c6691 = c6692;
                                        r6 = M41624;
                                        c8032 = c8034;
                                        while (true) {
                                            break;
                                            break;
                                        }
                                        throw th;
                                    }
                                    c8033 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r6 = M41624;
                                    c234513 = null;
                                    c6691 = null;
                                    z7 = false;
                                    z2 = true;
                                    c8032 = null;
                                }
                            }
                            try {
                                break;
                                throw th;
                            } catch (Error e) {
                                e = e;
                                r8 = c234513;
                                c234515 = c234513;
                                M41624 = c6691;
                                r7 = r6;
                                r16 = c8032;
                                synchronized (c18285.f54588) {
                                    if (c18285.f54607 == r7) {
                                        c18285.f54607 = c234515;
                                    }
                                    c18285.m41638(r7.f74700);
                                    throw e;
                                }
                            } catch (RuntimeException e2) {
                                e = e2;
                                r8 = c234513;
                                c234515 = c234513;
                                M41624 = c6691;
                                r7 = r6;
                                r16 = c8032;
                                if (!(e instanceof C15407)) {
                                    z2 = false;
                                }
                                synchronized (c18285.f54588) {
                                    if (c18285.f54607 == r7) {
                                        c18285.f54607 = c234515;
                                    }
                                    if (z2) {
                                        C13397.m30551(r7.f74700);
                                    }
                                    c18285.m41638(r7.f74700);
                                    M41624 = M41624;
                                    if (!z2) {
                                        M41624 = c18285.m41624(r7.f74700, m41623(e));
                                    }
                                    synchronized (c18285.f54588) {
                                        if (c18285.f54607 == r7) {
                                            c18285.f54607 = c234515;
                                        }
                                        r7.f74701 = z7;
                                        if (c18285.f54607 != r7) {
                                            c18285.f54615.add(r7);
                                        }
                                        c18285.f54603 = z7;
                                        zM41642 = c18285.m41641();
                                        if (c18285.f54592 == null) {
                                            c18285.f54588.notifyAll();
                                        }
                                        z3 = c18285.f54595;
                                        c18285.f54595 = z7;
                                        c18285.m41634();
                                        if (zM41642) {
                                            c18285.m41636();
                                        }
                                        if (z3) {
                                            InterfaceC14067 interfaceC14068 = c18285.f54606;
                                            C12826.requireNonNull(interfaceC14068);
                                            c18285.m41626(new RunnableC4782(1, interfaceC14068));
                                        }
                                        if (r16 != 0) {
                                            final long j = r16.f21122;
                                            c18285.m41626(new Runnable() { // from class: l.۠ۡܿ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C18285.m41642(this.f27791, j);
                                                }
                                            });
                                        }
                                        if (r8 != 0) {
                                            final long j2 = r8.f25550;
                                            c18285.m41626(new Runnable() { // from class: l.֨ۡܿ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C18285.m41629(this.f6524, j2);
                                                }
                                            });
                                        }
                                        if (M41624 != 0) {
                                            c18285.m41626(new RunnableC21380(2, c18285, M41624));
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r9 = c234513;
                                c23456 = c234513;
                                r4 = c6691;
                                r5 = r6;
                                r17 = c8032;
                                synchronized (c18285.f54588) {
                                    if (c18285.f54607 == r5) {
                                        c18285.f54607 = c23456;
                                    }
                                    r5.f74701 = z7;
                                    if (c18285.f54607 != r5) {
                                        c18285.f54615.add(r5);
                                    }
                                    c18285.f54603 = z7;
                                    zM41641 = c18285.m41641();
                                    if (c18285.f54592 == null) {
                                        c18285.f54588.notifyAll();
                                    }
                                    z = c18285.f54595;
                                    c18285.f54595 = z7;
                                    c18285.m41634();
                                    if (zM41641) {
                                        c18285.m41636();
                                    }
                                    if (z) {
                                        InterfaceC14067 interfaceC14069 = c18285.f54606;
                                        C12826.requireNonNull(interfaceC14069);
                                        c18285.m41626(new RunnableC4782(1, interfaceC14069));
                                    }
                                    if (r17 != 0) {
                                        final long j3 = r17.f21122;
                                        c18285.m41626(new Runnable() { // from class: l.۠ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C18285.m41642(this.f27791, j3);
                                            }
                                        });
                                    }
                                    if (r9 != 0) {
                                        final long j4 = r9.f25550;
                                        c18285.m41626(new Runnable() { // from class: l.֨ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C18285.m41629(this.f6524, j4);
                                            }
                                        });
                                    }
                                    if (r4 != 0) {
                                        c18285.m41626(new RunnableC21380(2, c18285, r4));
                                    }
                                    throw th;
                                }
                            }
                        }
                        C4204 c4204 = (C4204) interfaceC12922;
                        try {
                            synchronized (c18285.f54588) {
                                try {
                                    if (c18285.f54607 == M41624 && !M41624.f74700.f37600 && C13397.m30535(M41624.f74700) && c18285.f54596 == M41624.f74700.f37609) {
                                        c18285.f54607 = null;
                                        if (c18285.f54600.m49542(c4204.f9249)) {
                                            C15940 c15940M49543 = c18285.f54600.m49543();
                                            if (c15940M49543 != null && c15940M49543.m36196() == M41624.f74700.f37599 && c15940M49543.m36197() == M41624.f74700.f37608 && c15940M49543.m36191() == M41624.f74700.f37602 && c15940M49543.m36193() == C13397.m30536(M41624.f74700) && c15940M49543.m36194() == C13397.m30541(M41624.f74700)) {
                                                c9373 = new C9373(M41624.f74700.f37609, M41624.f74700.f37608, M41624.f74700.f37602, c15940M49543, M41624.f74700.f37604);
                                                try {
                                                    c18285.f54593 = c9373;
                                                    c18285.f54601 = C16611.m37650(M41624.f74700.f37602, new C9906[0]);
                                                    c18285.f54598 = M41624.f74700.f37608;
                                                    c18285.m41635();
                                                    c6691M41625 = null;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    enumC6711 = null;
                                                }
                                            } else {
                                                c18285.f54600.m49541();
                                                C13397 c13398 = M41624.f74700;
                                                EnumC5350 enumC5351 = EnumC5350.INVALID_RESULT;
                                                new IllegalStateException("Syntax window task published an invalid result");
                                                c6691M41625 = c18285.m41624(c13398, enumC5351);
                                                c9373 = null;
                                            }
                                            c6691M41624 = c6691M41625;
                                        } else {
                                            if (Thread.currentThread().isInterrupted()) {
                                                throw new C15407();
                                            }
                                            c18285.m41643();
                                            C13397 c13399 = M41624.f74700;
                                            EnumC5350 enumC5352 = EnumC5350.INVALID_RESULT;
                                            new IllegalStateException("Syntax window task completed without publication");
                                            c6691M41624 = c18285.m41624(c13399, enumC5352);
                                            c9373 = null;
                                        }
                                    } else {
                                        if (c18285.f54607 == M41624) {
                                            c18285.f54607 = null;
                                        }
                                        c18285.m41638(M41624.f74700);
                                        c6691M41624 = null;
                                        c9373 = null;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    enumC6711 = null;
                                    c9373 = null;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                        try {
                            throw th;
                        } catch (Error e3) {
                            e = e3;
                            c234512 = null;
                            obj6 = enumC6711;
                            obj5 = c9373;
                            z7 = false;
                            c234515 = c234516;
                            M41624 = obj6;
                            r7 = M41624;
                            r8 = obj5;
                            r16 = c234512;
                            synchronized (c18285.f54588) {
                                if (c18285.f54607 == r7) {
                                    c18285.f54607 = c234515;
                                }
                                c18285.m41638(r7.f74700);
                            }
                            throw e;
                        } catch (RuntimeException e4) {
                            e = e4;
                            c234511 = null;
                            obj4 = enumC6711;
                            obj3 = c9373;
                            z7 = false;
                            z2 = true;
                            c234515 = c234517;
                            M41624 = obj4;
                            r7 = M41624;
                            r8 = obj3;
                            r16 = c234511;
                            if (!(e instanceof C15407) && ((!(e instanceof C10064) || ((C10064) e).m23490() != EnumC2687.CANCELED) && C13397.m30535(r7.f74700))) {
                                z2 = false;
                            }
                            synchronized (c18285.f54588) {
                                if (c18285.f54607 == r7) {
                                    c18285.f54607 = c234515;
                                }
                                if (z2) {
                                    C13397.m30551(r7.f74700);
                                }
                                c18285.m41638(r7.f74700);
                                M41624 = M41624;
                                if (!z2) {
                                    M41624 = c18285.m41624(r7.f74700, m41623(e));
                                }
                            }
                            synchronized (c18285.f54588) {
                                if (c18285.f54607 == r7 && r7.f74700.f37600) {
                                    c18285.f54607 = c234515;
                                }
                                r7.f74701 = z7;
                                if (c18285.f54607 != r7) {
                                    c18285.f54615.add(r7);
                                }
                                c18285.f54603 = z7;
                                zM41642 = c18285.m41641();
                                if (c18285.f54592 == null && c18285.f54607 == null) {
                                    c18285.f54588.notifyAll();
                                }
                                z3 = c18285.f54595;
                                c18285.f54595 = z7;
                            }
                            try {
                                c18285.m41634();
                                if (zM41642) {
                                    c18285.m41636();
                                }
                                if (z3) {
                                    InterfaceC14067 interfaceC140610 = c18285.f54606;
                                    C12826.requireNonNull(interfaceC140610);
                                    c18285.m41626(new RunnableC4782(1, interfaceC140610));
                                }
                                if (r16 != 0) {
                                    final long j5 = r16.f21122;
                                    c18285.m41626(new Runnable() { // from class: l.۠ۡܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C18285.m41642(this.f27791, j5);
                                        }
                                    });
                                }
                                if (r8 != 0) {
                                    final long j6 = r8.f25550;
                                    c18285.m41626(new Runnable() { // from class: l.֨ۡܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C18285.m41629(this.f6524, j6);
                                        }
                                    });
                                }
                                if (M41624 != 0) {
                                    c18285.m41626(new RunnableC21380(2, c18285, M41624));
                                    return;
                                }
                                return;
                            } catch (Throwable th9) {
                                if (!zM41642) {
                                    throw th9;
                                }
                                c18285.m41636();
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            c234510 = null;
                            obj2 = enumC6711;
                            obj = c9373;
                            z7 = false;
                            c23456 = c234518;
                            r4 = obj2;
                            r5 = M41624;
                            r9 = obj;
                            r17 = c234510;
                            synchronized (c18285.f54588) {
                                if (c18285.f54607 == r5) {
                                    c18285.f54607 = c23456;
                                }
                                r5.f74701 = z7;
                                if (c18285.f54607 != r5) {
                                    c18285.f54615.add(r5);
                                }
                                c18285.f54603 = z7;
                                zM41641 = c18285.m41641();
                                if (c18285.f54592 == null) {
                                    c18285.f54588.notifyAll();
                                }
                                z = c18285.f54595;
                                c18285.f54595 = z7;
                                try {
                                    c18285.m41634();
                                    if (zM41641) {
                                        c18285.m41636();
                                    }
                                    if (z) {
                                        InterfaceC14067 interfaceC140611 = c18285.f54606;
                                        C12826.requireNonNull(interfaceC140611);
                                        c18285.m41626(new RunnableC4782(1, interfaceC140611));
                                    }
                                    if (r17 != 0) {
                                        final long j7 = r17.f21122;
                                        c18285.m41626(new Runnable() { // from class: l.۠ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C18285.m41642(this.f27791, j7);
                                            }
                                        });
                                    }
                                    if (r9 != 0) {
                                        final long j8 = r9.f25550;
                                        c18285.m41626(new Runnable() { // from class: l.֨ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C18285.m41629(this.f6524, j8);
                                            }
                                        });
                                    }
                                    if (r4 != 0) {
                                        c18285.m41626(new RunnableC21380(2, c18285, r4));
                                    }
                                    throw th;
                                } catch (Throwable th11) {
                                    if (!zM41641) {
                                        throw th11;
                                    }
                                    c18285.m41636();
                                    throw th11;
                                }
                            }
                        }
                        synchronized (c18285.f54588) {
                            if (c18285.f54607 == M41624 && M41624.f74700.f37600) {
                                c18285.f54607 = null;
                            }
                            M41624.f74701 = false;
                            if (c18285.f54607 != M41624) {
                                c18285.f54615.add(M41624);
                            }
                            c18285.f54603 = false;
                            zM41643 = c18285.m41641();
                            if (c18285.f54592 == null && c18285.f54607 == null) {
                                c18285.f54588.notifyAll();
                            }
                            z4 = c18285.f54595;
                            c18285.f54595 = false;
                        }
                        try {
                            c18285.m41634();
                            if (zM41643) {
                                c18285.m41636();
                            }
                            if (z4) {
                                InterfaceC14067 interfaceC140612 = c18285.f54606;
                                C12826.requireNonNull(interfaceC140612);
                                c18285.m41626(new RunnableC4782(1, interfaceC140612));
                            }
                            if (c8035 != null) {
                                final long j9 = c8035.f21122;
                                c18285.m41626(new Runnable() { // from class: l.۠ۡܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C18285.m41642(this.f27791, j9);
                                    }
                                });
                            }
                            if (c9373 != null) {
                                final long j10 = c9373.f25550;
                                c18285.m41626(new Runnable() { // from class: l.֨ۡܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C18285.m41629(this.f6524, j10);
                                    }
                                });
                            }
                            if (c6691M41624 != null) {
                                c18285.m41626(new RunnableC21380(2, c18285, c6691M41624));
                            }
                        } catch (Throwable th12) {
                            if (!zM41643) {
                                throw th12;
                            }
                            c18285.m41636();
                            throw th12;
                        }
                    }
                    try {
                        if (enumC6711Mo8520 == EnumC6711.ABORTED) {
                            c23457 = null;
                            c23459 = null;
                            c23458 = null;
                            try {
                                throw new IllegalStateException("Syntax task aborted without a failure");
                            } catch (Error e5) {
                                e = e5;
                                C23455 c234520 = c23459;
                                C23455 c234521 = c234520;
                                c234512 = c234521;
                                c234516 = c234520;
                                obj6 = c234521;
                                obj5 = c23459;
                                z7 = false;
                                c234515 = c234516;
                                M41624 = obj6;
                                r7 = M41624;
                                r8 = obj5;
                                r16 = c234512;
                                synchronized (c18285.f54588) {
                                    if (c18285.f54607 == r7) {
                                        c18285.f54607 = c234515;
                                    }
                                    c18285.m41638(r7.f74700);
                                    throw e;
                                }
                            } catch (RuntimeException e6) {
                                e = e6;
                                C23455 c234522 = c23458;
                                C23455 c234523 = c234522;
                                c234511 = c234523;
                                c234517 = c234522;
                                obj4 = c234523;
                                obj3 = c23458;
                                z7 = false;
                                z2 = true;
                                c234515 = c234517;
                                M41624 = obj4;
                                r7 = M41624;
                                r8 = obj3;
                                r16 = c234511;
                                if (!(e instanceof C15407)) {
                                    z2 = false;
                                }
                                synchronized (c18285.f54588) {
                                    if (c18285.f54607 == r7) {
                                        c18285.f54607 = c234515;
                                    }
                                    if (z2) {
                                        C13397.m30551(r7.f74700);
                                    }
                                    c18285.m41638(r7.f74700);
                                    M41624 = M41624;
                                    if (!z2) {
                                        M41624 = c18285.m41624(r7.f74700, m41623(e));
                                    }
                                    synchronized (c18285.f54588) {
                                        if (c18285.f54607 == r7) {
                                            c18285.f54607 = c234515;
                                        }
                                        r7.f74701 = z7;
                                        if (c18285.f54607 != r7) {
                                            c18285.f54615.add(r7);
                                        }
                                        c18285.f54603 = z7;
                                        zM41642 = c18285.m41641();
                                        if (c18285.f54592 == null) {
                                            c18285.f54588.notifyAll();
                                        }
                                        z3 = c18285.f54595;
                                        c18285.f54595 = z7;
                                        c18285.m41634();
                                        if (zM41642) {
                                            c18285.m41636();
                                        }
                                        if (z3) {
                                            InterfaceC14067 interfaceC140613 = c18285.f54606;
                                            C12826.requireNonNull(interfaceC140613);
                                            c18285.m41626(new RunnableC4782(1, interfaceC140613));
                                        }
                                        if (r16 != 0) {
                                            final long j11 = r16.f21122;
                                            c18285.m41626(new Runnable() { // from class: l.۠ۡܿ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C18285.m41642(this.f27791, j11);
                                                }
                                            });
                                        }
                                        if (r8 != 0) {
                                            final long j12 = r8.f25550;
                                            c18285.m41626(new Runnable() { // from class: l.֨ۡܿ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C18285.m41629(this.f6524, j12);
                                                }
                                            });
                                        }
                                        if (M41624 != 0) {
                                            c18285.m41626(new RunnableC21380(2, c18285, M41624));
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                C23455 c234524 = c23457;
                                C23455 c234525 = c234524;
                                c234510 = c234525;
                                c234518 = c234524;
                                obj2 = c234525;
                                obj = c23457;
                                z7 = false;
                                c23456 = c234518;
                                r4 = obj2;
                                r5 = M41624;
                                r9 = obj;
                                r17 = c234510;
                                synchronized (c18285.f54588) {
                                    if (c18285.f54607 == r5) {
                                        c18285.f54607 = c23456;
                                    }
                                    r5.f74701 = z7;
                                    if (c18285.f54607 != r5) {
                                        c18285.f54615.add(r5);
                                    }
                                    c18285.f54603 = z7;
                                    zM41641 = c18285.m41641();
                                    if (c18285.f54592 == null) {
                                        c18285.f54588.notifyAll();
                                    }
                                    z = c18285.f54595;
                                    c18285.f54595 = z7;
                                    c18285.m41634();
                                    if (zM41641) {
                                        c18285.m41636();
                                    }
                                    if (z) {
                                        InterfaceC14067 interfaceC140614 = c18285.f54606;
                                        C12826.requireNonNull(interfaceC140614);
                                        c18285.m41626(new RunnableC4782(1, interfaceC140614));
                                    }
                                    if (r17 != 0) {
                                        final long j13 = r17.f21122;
                                        c18285.m41626(new Runnable() { // from class: l.۠ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C18285.m41642(this.f27791, j13);
                                            }
                                        });
                                    }
                                    if (r9 != 0) {
                                        final long j14 = r9.f25550;
                                        c18285.m41626(new Runnable() { // from class: l.֨ۡܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C18285.m41629(this.f6524, j14);
                                            }
                                        });
                                    }
                                    if (r4 != 0) {
                                        c18285.m41626(new RunnableC21380(2, c18285, r4));
                                    }
                                    throw th;
                                }
                            }
                        }
                        c8035 = null;
                        c6691M41624 = null;
                    } catch (Error e7) {
                        e = e7;
                        c23459 = null;
                    } catch (RuntimeException e8) {
                        e = e8;
                        c23458 = null;
                    } catch (Throwable th14) {
                        th = th14;
                        c23457 = null;
                    }
                    c9373 = null;
                    synchronized (c18285.f54588) {
                        if (c18285.f54607 == M41624) {
                            c18285.f54607 = null;
                        }
                        M41624.f74701 = false;
                        if (c18285.f54607 != M41624) {
                            c18285.f54615.add(M41624);
                        }
                        c18285.f54603 = false;
                        zM41643 = c18285.m41641();
                        if (c18285.f54592 == null) {
                            c18285.f54588.notifyAll();
                        }
                        z4 = c18285.f54595;
                        c18285.f54595 = false;
                        c18285.m41634();
                        if (zM41643) {
                            c18285.m41636();
                        }
                        if (z4) {
                            InterfaceC14067 interfaceC140615 = c18285.f54606;
                            C12826.requireNonNull(interfaceC140615);
                            c18285.m41626(new RunnableC4782(1, interfaceC140615));
                        }
                        if (c8035 != null) {
                            final long j15 = c8035.f21122;
                            c18285.m41626(new Runnable() { // from class: l.۠ۡܿ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C18285.m41642(this.f27791, j15);
                                }
                            });
                        }
                        if (c9373 != null) {
                            final long j16 = c9373.f25550;
                            c18285.m41626(new Runnable() { // from class: l.֨ۡܿ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C18285.m41629(this.f6524, j16);
                                }
                            });
                        }
                        if (c6691M41624 != null) {
                            c18285.m41626(new RunnableC21380(2, c18285, c6691M41624));
                        }
                    }
                } catch (Error e9) {
                    e = e9;
                    c23459 = null;
                } catch (RuntimeException e10) {
                    e = e10;
                    c23458 = null;
                } catch (Throwable th15) {
                    th = th15;
                    c23457 = null;
                }
            } catch (Throwable th16) {
                th = th16;
                r9 = r8;
                c23456 = c234515;
                r4 = M41624;
                r5 = r7;
                r17 = r16;
                synchronized (c18285.f54588) {
                    if (c18285.f54607 == r5 && r5.f74700.f37600) {
                        c18285.f54607 = c23456;
                    }
                    r5.f74701 = z7;
                    if (c18285.f54607 != r5) {
                        c18285.f54615.add(r5);
                    }
                    c18285.f54603 = z7;
                    zM41641 = c18285.m41641();
                    if (c18285.f54592 == null && c18285.f54607 == null) {
                        c18285.f54588.notifyAll();
                    }
                    z = c18285.f54595;
                    c18285.f54595 = z7;
                }
                c18285.m41634();
                if (zM41641) {
                    c18285.m41636();
                }
                if (z) {
                    InterfaceC14067 interfaceC140616 = c18285.f54606;
                    C12826.requireNonNull(interfaceC140616);
                    c18285.m41626(new RunnableC4782(1, interfaceC140616));
                }
                if (r17 != 0) {
                    final long j17 = r17.f21122;
                    c18285.m41626(new Runnable() { // from class: l.۠ۡܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18285.m41642(this.f27791, j17);
                        }
                    });
                }
                if (r9 != 0) {
                    final long j18 = r9.f25550;
                    c18285.m41626(new Runnable() { // from class: l.֨ۡܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18285.m41629(this.f6524, j18);
                        }
                    });
                }
                if (r4 != 0) {
                    c18285.m41626(new RunnableC21380(2, c18285, r4));
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C21444 m41625(C23455 c23455) throws Throwable {
        C8032 c8032;
        C9373 c9373;
        C12076 c12076M18707;
        C13397 c13397 = c23455.f74700;
        m41627(c13397);
        C9729 c9729Mo28589 = c13397.f37598.mo28589();
        c23455.f74703 = c9729Mo28589;
        if (c9729Mo28589.m22747() != c13397.f37608 || c9729Mo28589.length() != c13397.f37602) {
            throw new C15407();
        }
        synchronized (this.f54588) {
            C23455 c23456 = this.f54607;
            if (c23456 == null || c23456.f74700 != c13397 || this.f54596 != c13397.f37609 || this.f54608 != c13397.f37599 || this.f54604 != c13397.f37598 || this.f54617 != c13397.f37597.m53371() || c13397.f37600) {
                throw new C15407();
            }
            c8032 = this.f54605;
            c9373 = this.f54593;
        }
        m41627(c13397);
        long j = 0;
        if (c13397.f37597.m53371()) {
            C15940 c15940 = c9373 != null ? c9373.f25552 : null;
            if (this.f54600.m49543() != c15940) {
                this.f54600.m49541();
            }
            C8565 c8565M49540 = this.f54600.m49540(c13397.f37599, c13397.f37598, c9729Mo28589, c13397.f37608, C13397.m30536(c13397), C13397.m30541(c13397), new C2667(c13397), c13397.f37596 == c9373 ? c15940 : null, c13397.f37603);
            m41627(c13397);
            if (this.f54612) {
                c8565M49540.m19982(c13397.f37601, this.f54616, new C16748(this, c13397));
            }
            return new C21444(new C4204(c8565M49540), 0L);
        }
        if (this.f54594.m18710() != (c8032 == null ? null : c8032.f21120)) {
            this.f54594.m18709();
        } else if (c8032 != null) {
            j = c8032.f21122;
        }
        C17242 c17242 = (c13397.f37594 != null && c13397.f37594 == c8032 && this.f54594.m18710() == c13397.f37594.f21120) ? c13397.f37594.f21120 : null;
        if (c13397.f37597 == EnumC24125.EDIT) {
            c12076M18707 = this.f54594.m18708(c13397.f37599, c13397.f37598, c9729Mo28589, c17242, c13397.f37608, c13397.f37603, new C2667(c13397));
        } else {
            c12076M18707 = this.f54594.m18707(c13397.f37599, c13397.f37598, c9729Mo28589, c13397.f37608, new C2667(c13397));
        }
        m41627(c13397);
        if (this.f54612) {
            c12076M18707.m27656(c13397.f37601, this.f54616, new C16748(this, c13397));
        }
        return new C21444(new C14737(c12076M18707), j);
    }

    /* JADX INFO: renamed from: ۡ */
    private void m41636() {
        boolean z = false;
        Object c6691 = null;
        try {
            this.f54616.execute(new RunnableC8487(1, this));
        } catch (Error e) {
            synchronized (this.f54588) {
                this.f54603 = false;
                m41644();
                this.f54607 = null;
                this.f54594.m18711();
                this.f54600.m49544();
                C8052 c8052 = this.f54594;
                C8032 c8032 = this.f54605;
                if (c8032 != null) {
                    c6691 = c8032.f21120;
                }
                if (c8052.m18710() != c6691) {
                    c8052.m18709();
                    m41635();
                }
                m41643();
                m41634();
                throw e;
            }
        } catch (RuntimeException unused) {
            synchronized (this.f54588) {
                this.f54603 = false;
                C13397 c13397 = this.f54592;
                if (c13397 == null) {
                    C23455 c23455 = this.f54607;
                    c13397 = c23455 == null ? null : c23455.f74700;
                }
                if (c13397 != null && this.f54596 == c13397.f37609 && C13397.m30535(c13397)) {
                    z = true;
                }
                m41644();
                this.f54607 = null;
                this.f54594.m18711();
                this.f54600.m49544();
                C8052 c8053 = this.f54594;
                C8032 c8033 = this.f54605;
                if (c8053.m18710() != (c8033 == null ? null : c8033.f21120)) {
                    c8053.m18709();
                    m41635();
                }
                m41643();
                c6691 = z ? new C6691(this.f54597, c13397.f37609, c13397.f37608, c13397.f37602, c13397.f37597, C13397.m30536(c13397), C13397.m30541(c13397), EnumC5350.SCHEDULER_REJECTED) : null;
                m41634();
                if (c6691 != null) {
                    m41626(new RunnableC21380(2, this, c6691));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m41642(C18285 c18285, long j) {
        synchronized (c18285.f54588) {
            C8032 c8032 = c18285.f54605;
            if (c8032 != null && c8032.f21122 == j && c18285.f54596 == j && c18285.m41633(c8032.f21123, c8032.f21124)) {
                ((C12727) c18285.f54606).f35749.m49809(c8032);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41629(C18285 c18285, long j) {
        synchronized (c18285.f54588) {
            C9373 c9373 = c18285.f54593;
            if (c9373 != null && c9373.f25550 == j && c18285.f54596 == j && c18285.m41633(c9373.f25549, c9373.f25551)) {
                ((C12727) c18285.f54606).f35749.m49810(c9373);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41630(C18285 c18285, C6691 c6691) {
        synchronized (c18285.f54588) {
            if (c18285.f54596 == c6691.f17342 && c18285.m41633(c6691.f17340, c6691.f17341)) {
                C12727 c12727 = (C12727) c18285.f54606;
                C22115.m49820(c12727.f35749, c6691);
                c12727.f35750.postInvalidateOnAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41626(Runnable runnable) {
        try {
            this.f54609.execute(new RunnableC7362(0, runnable));
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m41640() {
        if (this.f54586 != null) {
            this.f54586.f33589 = true;
        }
        this.f54586 = null;
        long j = this.f54611 + 1;
        this.f54611 = j;
        this.f54596 = j;
        this.f54588.notifyAll();
    }

    /* JADX INFO: renamed from: ۜ */
    private void m41635() {
        this.f54614 = false;
        this.f54587 = null;
        this.f54599 = 0;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m41637() {
        this.f54601 = null;
        this.f54598 = 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m41644() {
        if (this.f54586 != null) {
            this.f54586.f33589 = true;
        }
        this.f54586 = null;
        C13397 c13397 = this.f54592;
        if (c13397 != null) {
            C13397.m30551(c13397);
        }
        C23455 c23455 = this.f54607;
        if (c23455 != null) {
            C13397.m30551(c23455.f74700);
            if (!this.f54607.f74701) {
                this.f54615.add(this.f54607);
            }
        }
        this.f54592 = null;
        this.f54607 = null;
        this.f54588.notifyAll();
    }

    /* JADX INFO: renamed from: ۖ */
    private void m41634() {
        C23455 c23455;
        while (true) {
            synchronized (this.f54588) {
                c23455 = (C23455) this.f54615.pollFirst();
            }
            if (c23455 == null) {
                return;
            } else {
                try {
                    C23455.m52161(c23455);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m41638(C13397 c13397) {
        if (this.f54586 != null && this.f54586.f33590 == c13397.f37609) {
            this.f54586.f33589 = true;
            this.f54586 = null;
            this.f54595 = true;
        }
        if (this.f54608 == c13397.f37599 && this.f54604 == c13397.f37598 && this.f54617 == c13397.f37597.m53371()) {
            if (c13397.f37597.m53371()) {
                this.f54600.m49544();
                m41643();
                return;
            }
            this.f54594.m18711();
            C8052 c8052 = this.f54594;
            C8032 c8032 = this.f54605;
            if (c8052.m18710() != (c8032 != null ? c8032.f21120 : null)) {
                c8052.m18709();
                m41635();
                return;
            }
            return;
        }
        this.f54594.m18709();
        this.f54600.m49541();
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m41643() {
        C9373 c9373 = this.f54593;
        C15940 c15940 = c9373 == null ? null : c9373.f25552;
        C21977 c21977 = this.f54600;
        if (c21977.m49543() != c15940) {
            c21977.m49541();
            m41637();
        }
    }

    /* JADX INFO: renamed from: ܺ */
    private boolean m41641() {
        if (this.f54603) {
            return false;
        }
        if (this.f54592 == null && this.f54607 == null) {
            return false;
        }
        this.f54603 = true;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private C6691 m41624(C13397 c13397, EnumC5350 enumC5350) {
        if (this.f54596 != c13397.f37609 || c13397.f37600 || !C13397.m30535(c13397)) {
            return null;
        }
        return new C6691(this.f54597, c13397.f37609, c13397.f37608, c13397.f37602, c13397.f37597, C13397.m30536(c13397), C13397.m30541(c13397), enumC5350);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5350 m41623(RuntimeException runtimeException) {
        if (runtimeException instanceof C10064) {
            int i = C22785.f71814[((C10064) runtimeException).m23490().ordinal()];
            if (i == 1) {
                return EnumC5350.REGEX_TIMEOUT;
            }
            if (i == 2) {
                return EnumC5350.REGEX_RESOURCE_LIMIT;
            }
            if (i == 3) {
                return EnumC5350.INVALID_RESULT;
            }
            if (i != 4) {
                throw new IncompatibleClassChangeError();
            }
            throw new IllegalArgumentException("Canceled syntax requests must not publish failures", runtimeException);
        }
        return EnumC5350.EXECUTION_BUG;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41627(C13397 c13397) {
        if (c13397.f37600 || !C13397.m30535(c13397)) {
            throw new C15407();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m41633(int i, int i2) {
        InterfaceC21800 interfaceC21800 = this.f54604;
        if (interfaceC21800 == null) {
            return false;
        }
        try {
            return interfaceC21800.mo28581() == i && interfaceC21800.length() == i2 && interfaceC21800.mo28581() == i;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
