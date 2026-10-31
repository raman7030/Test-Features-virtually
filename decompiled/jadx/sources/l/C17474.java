package l;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܿܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17474 extends AbstractC3179 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f53393;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f53394;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f53395;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public volatile Throwable f53396;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C20736 f53397;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f53398;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f53399;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C4507 f53400;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public volatile C20736 f53401;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f53402;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f53403;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f53404;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public C20736 f53405;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public volatile RunnableC11125 f53406;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C20736 f53407;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40856(boolean z, char c) {
        if ((c >= 11904 && c <= 12287) || c == 12288 || c == 12290) {
            return true;
        }
        if (c >= 12352 && c <= 12447) {
            if (z) {
                return true;
            }
            if (c == 12353 || c == 12355 || c == 12357 || c == 12359 || c == 12361 || c == 12387 || c == 12419 || c == 12421 || c == 12423 || c == 12430 || c == 12437 || c == 12438) {
                return false;
            }
            switch (c) {
                case 12443:
                case 12444:
                case 12445:
                case 12446:
                    return false;
                default:
                    return true;
            }
        }
        if (c < 12448 || c > 12543) {
            if (c >= 13312 && c <= 19893) {
                return true;
            }
            if (c >= 19968 && c <= 40891) {
                return true;
            }
            if (c >= 63744 && c <= 64217) {
                return true;
            }
            if (c >= 40960 && c <= 42127) {
                return true;
            }
            if (c >= 42128 && c <= 42191) {
                return true;
            }
            if (c < 65122 || c > 65126) {
                return c >= 65280 && c <= 65519;
            }
            return true;
        }
        if (z) {
            return true;
        }
        if (c == 12448 || c == 12449 || c == 12451 || c == 12453 || c == 12455 || c == 12457 || c == 12483 || c == 12515 || c == 12517 || c == 12519 || c == 12526 || c == 12533 || c == 12534) {
            return false;
        }
        switch (c) {
            case 12539:
            case 12540:
            case 12541:
            case 12542:
                return false;
            default:
                return true;
        }
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ֫ */
    public final synchronized int mo8153(C4590 c4590) {
        return m40863(c4590.m13502(), c4590.m13499());
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8160() {
        return false;
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ۧ */
    public final synchronized long mo9778(int i, int i2) {
        if (this.f53406 == null && !this.f10016 && this.f9998 == this.f53397) {
            return super.mo9778(i, i2);
        }
        if (this.f53406 == null) {
            if (!this.f10021.m30432(this)) {
                return 0L;
            }
            i2 = m40863(i, i2);
        }
        if (!(i2 > 0 && m40863(i, i2) == i2)) {
            return 0L;
        }
        C20736 c20736 = this.f9998;
        double d = i;
        return (((long) c20736.get(Math.min(c20736.m47364(), ((int) ((d + ((double) i2)) / ((double) this.f10037.m24484()))) + 200)).m28750()) & 4294967295L) | (((long) c20736.get(Math.min(c20736.m47364(), Math.max(0, ((int) (d / ((double) this.f10037.m24484()))) - 200))).f35062) << 32);
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean mo9780(int i) {
        return super.mo9780(i);
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean mo8167(C4590 c4590) {
        int iM13502;
        int iM13499;
        iM13502 = c4590.m13502();
        iM13499 = c4590.m13499();
        return iM13499 > 0 && m40863(iM13502, iM13499) == iM13499;
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ܶ */
    public final synchronized void mo9784() {
        if (m9757()) {
            this.f10033.m48861(this, this.f10015, this.f53397, this.f10037.m24485());
        }
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ܽ */
    public final synchronized long mo9787(int i, int i2) {
        if (this.f53406 == null && !this.f10016 && this.f9998 == this.f53397) {
            return super.mo9787(i, i2);
        }
        if (this.f53406 == null) {
            if (!this.f10021.m30432(this)) {
                return -1L;
            }
            i2 = m40863(i, i2);
        }
        if (!(i2 > 0 && m40863(i, i2) == i2)) {
            return -1L;
        }
        C20736 c20736 = this.f9998;
        double d = i;
        return (((long) c20736.get(Math.min(c20736.m47364(), (int) ((d + ((double) i2)) / ((double) this.f10037.m24484())))).m28750()) & 4294967295L) | (((long) c20736.get(Math.min(c20736.m47364(), Math.max(0, (int) (d / ((double) this.f10037.m24484()))))).f35062) << 32);
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ܿ */
    public final synchronized boolean mo9791(int i, int i2) {
        if (!this.f10016 && this.f9998 == this.f53397) {
            super.mo9791(i, i2);
            return true;
        }
        return false;
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo8172() {
        return (byte) 1;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m40870() {
        return !this.f53395 && this.f9998 == this.f53397;
    }

    public C17474(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, boolean z, int i, C3096 c3096, C8865 c8865, C7744 c7744) {
        super(c12392, c22686);
        this.f53404 = new ReentrantLock();
        this.f53403 = new AtomicInteger(0);
        this.f53395 = false;
        this.f53402 = new AtomicInteger();
        this.f53407 = new C20736();
        this.f53405 = new C20736();
        this.f10014 = i;
        if (c7744 != null) {
            m9768(interfaceC7785, c7744.m20762());
        }
        try {
            this.f53394 = z;
            m9788();
            this.f53398 = c12392.m30394();
            m9767(interfaceC7785);
            this.f53400 = c3096.m9446(this, c8865);
            this.f53397 = this.f9998;
            this.f10000 = m40873();
            if ((this.f53398 - mo8169()) - mo8162() != ((C17474) c3096.f9680).f53399) {
                this.f53400 = null;
            }
            m40862(false);
        } finally {
            if (!this.f10016) {
                m9773();
            }
        }
    }

    public C17474(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, boolean z) {
        this(c12392, interfaceC7785, c22686, z, -1, null);
    }

    public C17474(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, boolean z, int i, C7744 c7744) {
        super(c12392, c22686);
        this.f53404 = new ReentrantLock();
        this.f53403 = new AtomicInteger(0);
        this.f53395 = false;
        this.f53402 = new AtomicInteger();
        this.f53407 = new C20736();
        this.f53405 = new C20736();
        this.f10014 = i;
        if (c7744 != null) {
            m9768(interfaceC7785, c7744.m20762());
        }
        this.f53394 = z;
        this.f53398 = c12392.m30394();
        mo8166(interfaceC7785);
    }

    public C17474(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, C12951 c12951) {
        super(c12392, interfaceC7785, c22686, c12951);
        this.f53404 = new ReentrantLock();
        this.f53403 = new AtomicInteger(0);
        this.f53395 = false;
        this.f53402 = new AtomicInteger();
        this.f53407 = new C20736();
        this.f53405 = new C20736();
        this.f53398 = c12951.readInt();
        this.f53399 = c12951.readInt();
        this.f53394 = c12951.m31498();
        m9788();
        this.f53397 = this.f9998;
        m9767(interfaceC7785);
        m9773();
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ֫ */
    public final void mo8158(String str) {
        super.mo8158(str);
        m40858();
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ۧ */
    public final void mo8166(InterfaceC7785 interfaceC7785) {
        try {
            m40866(interfaceC7785);
        } finally {
            if (!this.f10016) {
                m9773();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m40866(InterfaceC7785 interfaceC7785) {
        m9788();
        this.f53400 = null;
        this.f53403.incrementAndGet();
        mo8165();
        try {
            this.f53404.lock();
            this.f10026 = false;
            m9767(interfaceC7785);
            C20736 c20736 = this.f9998.isEmpty() ? this.f9998 : new C20736();
            C21625 c21625 = this.f10033.isEmpty() ? this.f10033 : new C21625();
            c21625.clear();
            C7744 c7744M9797 = m9797();
            try {
                int iM24485 = this.f10037.m24485();
                C23266 c23266M9764 = m9764(c7744M9797, 0, c7744M9797.length());
                try {
                    C11747 c11747 = new C11747();
                    boolean z = true;
                    boolean z2 = true;
                    int i = 0;
                    int i2 = 0;
                    while (z2) {
                        if (this.f10026) {
                            c20736.clear();
                            c21625.clear();
                            c23266M9764.close();
                            c7744M9797.close();
                            this.f53404.unlock();
                            return;
                        }
                        c21625.add(C19509.m44924(this, c7744M9797, i, iM24485));
                        int iM51584 = c23266M9764.m51584();
                        if (iM51584 == -1) {
                            iM51584 = c7744M9797.length();
                            z2 = false;
                        }
                        c11747.m28751(i, iM51584, i2);
                        c20736.m47353(c11747);
                        i = iM51584 + 1;
                        i2++;
                        try {
                            c7744M9797.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    c23266M9764.close();
                    c21625.m48865();
                    c7744M9797.close();
                    this.f9998 = c20736;
                    this.f10033 = c21625;
                    this.f53404.unlock();
                    synchronized (this.f53403) {
                        this.f53397 = this.f9998;
                        this.f53403.incrementAndGet();
                        this.f10000 = m40873();
                        int iM30394 = this.f10021.m30394();
                        boolean z3 = iM30394 > 0 && iM30394 != this.f53398;
                        if (z3) {
                            this.f53398 = iM30394;
                        }
                        if ((this.f53398 - mo8169()) - mo8162() > 0) {
                            z = false;
                        }
                        this.f53395 = z;
                        if (!z) {
                            m40862(false);
                            if (z3) {
                                m40858();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        c23266M9764.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c7744M9797.close();
                throw th4;
            }
        } catch (Throwable th5) {
            this.f53404.unlock();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40869(boolean z) {
        this.f53394 = z;
        this.f53399 = 0;
        m40862(false);
        m40858();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m40872() {
        return this.f53394;
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ܳ */
    public final void mo9783(int i) {
        synchronized (this.f53403) {
            if (i > 0) {
                if ((this.f53398 != i || this.f53395) && m9757()) {
                    this.f53398 = i;
                    if ((i - mo8169()) - mo8162() <= 0) {
                        this.f53395 = true;
                        return;
                    }
                    if (this.f53397.m47363()) {
                        this.f53395 = false;
                        return;
                    }
                    if (this.f53406 != null) {
                        m40857();
                    } else if (this.f53395) {
                        this.f53395 = false;
                        m40862(false);
                    } else {
                        m40862(true);
                    }
                    m40858();
                    this.f10021.postInvalidate();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m40874(int i) {
        int i2;
        return !this.f53395 && (i2 = this.f53398) == i && (i2 - mo8169()) - mo8162() > 0;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m40858() {
        int iMo8169;
        if (this.f10020.isEmpty() || (iMo8169 = (this.f53398 - mo8169()) - mo8162()) <= 0) {
            return;
        }
        this.f10020.size();
        C20736 c20736 = new C20736(0);
        this.f10026 = false;
        String str = this.f10006;
        C20736 c20737 = this.f10020;
        int size = c20737.size();
        C22686 c22686 = this.f10037;
        m40844((CharSequence) str, c20737, c20736, size, iMo8169, true, new C18180(c22686, this.f53394, c22686.m50687(), mo9758(), this.f53394), new BooleanSupplier() { // from class: l.۫ۧܿ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f37101.f10026;
            }
        }, (C16768) null, false);
        this.f10020 = c20736;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m40863(int i, int i2) {
        if (i < 0 || i2 <= 0 || this.f10019 || this.f53396 != null || this.f9998.isEmpty()) {
            return 0;
        }
        if (this.f9998 == this.f53397 && (!this.f10016 || this.f53401 != null)) {
            return i2;
        }
        if (this.f9998 != this.f53401) {
            return 0;
        }
        return (int) Math.max(0.0d, Math.min(i2, (Math.ceil(this.f10037.m24484() * (((long) this.f9998.size()) - 1)) - 1.0d) - ((double) i)));
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ۤ */
    public final int mo8164() {
        return this.f53402.get();
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ᩶ */
    public final Throwable mo8171() {
        return this.f53396;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m40873() {
        C20736 c20736 = this.f53397;
        return m9761((c20736 == null || c20736.isEmpty() || this.f9998.isEmpty()) ? 0 : this.f53397.m47368().f35064 - this.f9998.m47368().f35064);
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo9770() {
        return this.f53406 != null || this.f10016;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40871() {
        RunnableC11125 runnableC11125 = this.f53406;
        this.f53406 = null;
        if (runnableC11125 != null) {
            runnableC11125.f33395 = true;
            this.f9998 = this.f53397;
            this.f53401 = null;
        }
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ۧ */
    public final void mo8165() {
        m40871();
        if (this.f10016) {
            this.f10019 = true;
            while (this.f10016) {
                SystemClock.sleep(100L);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40862(boolean z) {
        if (m9757() || m9776()) {
            InterfaceC7785 interfaceC7785 = this.f10015;
            boolean zMo1605 = interfaceC7785.mo1605();
            int i = this.f53403.get();
            interfaceC7785.setReadOnly(true);
            synchronized (this) {
                if (this.f10015 == interfaceC7785 && i == this.f53403.get()) {
                    m40853(z, interfaceC7785, i, zMo1605);
                    return;
                }
                interfaceC7785.setReadOnly(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public void m40857() {
        C18180 c18180;
        this.f10000 = m40873();
        int iMo8169 = (this.f53398 - mo8169()) - mo8162();
        if (iMo8169 <= 0) {
            this.f53395 = true;
            return;
        }
        int iM9759 = m9759(this.f10021.m30408() + 1);
        int iM47355 = this.f9998.m47355(iM9759);
        synchronized (this.f10037) {
            c18180 = new C18180(this.f10037.m24488(), this.f53394, this.f10037.m50687(), mo9758(), this.f53394);
        }
        int iM30408 = (int) (this.f10021.m30408() - (c18180.f56559.m24484() * iM9759));
        RunnableC11125 runnableC11125 = this.f53406;
        if (runnableC11125 != null) {
            runnableC11125.f33395 = true;
        }
        this.f53402.incrementAndGet();
        if (this.f10016) {
            this.f10019 = true;
        }
        RunnableC11125 runnableC11126 = new RunnableC11125(this, iMo8169, c18180, iM47355, iM30408);
        this.f53406 = runnableC11126;
        this.f53396 = null;
        this.f53395 = false;
        runnableC11126.f33384.setReadOnly(true);
        C12392 c12392 = this.f10021;
        c12392.getClass();
        int i = 0;
        C4925.m14315(new RunnableC7412(i, c12392));
        runnableC11126.f33394 = new RunnableC1644(i, c12392);
        try {
            C1802.f6208.execute(runnableC11126);
        } catch (Error | RuntimeException e) {
            runnableC11126.f33384.setReadOnly(false);
            runnableC11126.f33394.run();
            this.f53406 = null;
            throw e;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x035e */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m40853(boolean r29, l.InterfaceC7785 r30, int r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17474.m40853(boolean, l.۟᩺ᩳ, int, boolean):void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m40854(C17474 c17474, int i, int i2, InterfaceC7785 interfaceC7785, int i3) {
        return (!c17474.f10026 && !c17474.f10019 && i == c17474.f53403.get() && i2 == c17474.f53402.get() && c17474.f10015 == interfaceC7785 && c17474.m9781() == i3) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #5 {all -> 0x006a, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0018, B:9:0x001e, B:36:0x0072, B:38:0x0078), top: B:51:0x0009 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40850(C17474 c17474, List list, C20133 c20133, C20736 c20736, int i, InterfaceC7785 interfaceC7785, int i2, int i3, int i4, int i5, int i6, float f, ArrayList arrayList, C20736 c20737, Runnable runnable) throws Throwable {
        boolean z = false;
        try {
            try {
                try {
                    C20736 c20736M18662 = C6891.m18662(new C3199(c17474), list, c20133);
                    if (c20736M18662 != null && !c20133.getAsBoolean()) {
                        C20736 c20738 = new C20736(c20736);
                        c20738.m47354(c20736M18662);
                        c17474.f53397 = c20738;
                        c17474.f9998 = c20738;
                        c17474.f53399 = i;
                        try {
                            c17474.m40845(interfaceC7785, i2, i3, i4, c20738, i5, i6, f);
                            c17474.m40842(arrayList.size(), C6891.f21286, c20738);
                        } catch (Error e) {
                            e = e;
                            z = true;
                            if (!c20133.getAsBoolean()) {
                                c17474.f53396 = e;
                            }
                            if (!z && !c17474.f10021.m30490(c17474)) {
                                c17474.f9998 = c20737;
                            }
                            c17474.m40846(interfaceC7785, runnable);
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            z = true;
                            if (!c20133.getAsBoolean()) {
                                c17474.f53396 = e;
                            }
                            if (!z) {
                                c17474.f9998 = c20737;
                            }
                            c17474.m40846(interfaceC7785, runnable);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z && !c17474.f10021.m30490(c17474)) {
                                c17474.f9998 = c20737;
                            }
                            c17474.m40846(interfaceC7785, runnable);
                            throw th;
                        }
                    } else if (!c17474.f10021.m30490(c17474)) {
                        c17474.f9998 = c20737;
                    }
                    c17474.m40846(interfaceC7785, runnable);
                } catch (Error e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Error | Exception e5) {
            e = e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40842(int i, int i2, C20736 c20736) {
        SystemClock.elapsedRealtime();
        c20736.size();
        Math.min(i2, i);
        Integer.toHexString(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20736 m40837(CharSequence charSequence, C20736 c20736, C21003 c21003, int i, C18180 c18180, BooleanSupplier booleanSupplier) {
        int i2;
        C9714 c9714;
        C20736 c20737 = new C20736();
        List listM47822 = c21003.m47822();
        C13862 c13862M47359 = c20736.m47359();
        C11747 c11747 = new C11747();
        int i3 = 0;
        while (i3 < listM47822.size() && !booleanSupplier.getAsBoolean()) {
            C9714 c9715 = (C9714) listM47822.get(i3);
            if (c9715.m24699()) {
                if (c20736.m47355(c9715.m24700()) >= c9715.m24698() && c20736.m47358(c9715.m24701() - 1) <= c9715.m24696()) {
                    c20737.m47351(c9715.m24700(), c9715.m24701(), c20736);
                } else {
                    for (int iM24700 = c9715.m24700(); iM24700 < c9715.m24701(); iM24700++) {
                        C11747 c11747M33216 = c13862M47359.m33216(iM24700);
                        if (c11747M33216.f35062 < c9715.m24698() || c11747M33216.f35063 > c9715.m24696()) {
                            c11747M33216.m28751(Math.max(c11747M33216.f35062, c9715.m24698()), Math.min(c11747M33216.f35063, c9715.m24696()), c11747M33216.f35064);
                            c11747M33216.m28753(false);
                        }
                        c20737.m47353(c11747M33216);
                    }
                }
                i3++;
            } else {
                C20736 c20738 = new C20736();
                while (true) {
                    i2 = i3 + 1;
                    c9714 = (C9714) listM47822.get(i3);
                    int iM24701 = c9714.m24700();
                    while (iM24701 < c9714.m24701()) {
                        int iMin = Math.min(c9714.m24701(), c20736.m47365(iM24701) + 1);
                        c11747.m28751(Math.max(c20736.m47355(iM24701), c9714.m24698()), Math.min(c20736.m47358(iMin - 1), c9714.m24696()), c20736.m47357(iM24701));
                        c20738.m47353(c11747);
                        iM24701 = iMin;
                    }
                    if (i2 >= listM47822.size() || ((C9714) listM47822.get(i2)).m24699()) {
                        break;
                    }
                    i3 = i2;
                }
                m40844(charSequence, c20738, c20737, c20738.size(), i, c9715.m24697(), c18180, booleanSupplier, (C16768) null, !c9714.m24702());
                i3 = i2;
            }
        }
        return c20737;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40855(C20736 c20736, int i, float f) {
        if (!c20736.isEmpty() && c20736.m47368().f35063 >= i) {
            int size = c20736.size() - 1;
            int i2 = 0;
            while (i2 < size) {
                int i3 = (i2 + size) >>> 1;
                if (c20736.m47358(i3) <= i) {
                    i2 = i3 + 1;
                } else {
                    size = i3;
                }
            }
            if ((((long) (c20736.size() - i2)) - 1) * f > this.f10021.m30542()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40846(InterfaceC7785 interfaceC7785, Runnable runnable) {
        try {
            m9773();
            interfaceC7785.setReadOnly(false);
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    this.f10016 = false;
                    this.f10021.m30500(this);
                }
            }
            this.f10021.postInvalidate();
        } catch (Throwable th) {
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    this.f10016 = false;
                    this.f10021.m30500(this);
                }
            }
            this.f10021.postInvalidate();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40845(final InterfaceC7785 interfaceC7785, final int i, final int i2, final int i3, final C20736 c20736, int i4, final int i5, final float f) {
        if (this.f10014 >= 0) {
            return;
        }
        final int iM40859 = m40859(c20736, i4);
        this.f10021.post(new Runnable() { // from class: l.ۛۧܿ
            @Override // java.lang.Runnable
            public final void run() {
                C17474.m40851(this.f18491, interfaceC7785, i, i2, c20736, i3, f, iM40859, i5);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40851(C17474 c17474, InterfaceC7785 interfaceC7785, int i, int i2, C20736 c20736, int i3, float f, int i4, int i5) {
        C12392 c12392 = c17474.f10021;
        if (c12392.f37258 == c17474 && c17474.f10015 == interfaceC7785 && interfaceC7785.mo26548() == i && c17474.m9781() == i && c17474.f53402.get() == i2 && c17474.f9998 == c20736 && !c12392.m30354(c17474) && c12392.m30396() == i3) {
            c12392.m30364(c12392.m30521(((int) (f * i4)) + i5));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m40859(C20736 c20736, int i) {
        int size = c20736.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) >>> 1;
            if (c20736.m47355(i3) >= i || c20736.m47358(i3) > i) {
                size = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40844(CharSequence charSequence, C20736 c20736, C20736 c20737, int i, int i2, boolean z, C18180 c18180, BooleanSupplier booleanSupplier, C16768 c16768, boolean z2) {
        c20737.getClass();
        C6624 c6624 = new C6624(c20737);
        try {
            m40843(charSequence, c20736, c6624, i, i2, z, c18180, booleanSupplier, c16768, z2);
            c6624.close();
        } catch (Throwable th) {
            try {
                c6624.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0184  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:168:0x024e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0252  */
    /* JADX WARN: Code duplicated, block: B:209:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:211:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:227:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40843(CharSequence charSequence, C20736 c20736, C6624 c6624, int i, int i2, boolean z, C18180 c18180, BooleanSupplier booleanSupplier, C16768 c16768, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        char cCharAt;
        boolean z3;
        float[] fArr;
        int iM50336;
        float fM24474;
        float f2;
        int i7;
        C11747 c11747;
        C9584 c9584;
        int i8;
        int i9;
        int i10;
        byte b;
        int i11;
        char cCharAt2;
        int i12;
        int i13;
        float f3;
        int i14;
        int i15;
        byte b2;
        C6624 c6625 = c6624;
        C9584 c9585 = c18180.f56559;
        C14093 c14093 = charSequence instanceof C14093 ? (C14093) charSequence : null;
        float[] fArrM24480 = c14093 != null ? c9585.m24480() : null;
        C11747 c11748 = new C11747();
        boolean z4 = c18180.f56557;
        int i16 = c18180.f56555;
        boolean z5 = z;
        int i17 = 0;
        while (i17 < i && !booleanSupplier.getAsBoolean()) {
            int iMin = Math.min(i, c20736.m47365(i17) + 1);
            int iM47357 = c20736.m47357(i17);
            float f4 = i2;
            if (!z5) {
                if (c18180.f56558) {
                    f4 -= i16;
                }
                z5 = true;
            }
            float f5 = c18180.f56556 ? f4 - i16 : f4;
            int iM47355 = c20736.m47355(i17);
            float f6 = f4;
            int iM47358 = c20736.m47358(iMin - 1);
            int i18 = i;
            boolean z6 = z5;
            int i19 = iM47355;
            while (true) {
                float f7 = 0.0f;
                int i20 = i19;
                int i21 = i20;
                i3 = iM47355;
                int i22 = i18;
                int i23 = 0;
                int i24 = i21;
                while (true) {
                    if (i20 < iM47358) {
                        byte[] bArr = f53393;
                        if (c14093 != null) {
                            i4 = i16;
                            if (i20 + 1 < iM47358) {
                                char[] cArrM33702 = c14093.m33702(i20);
                                int iM33701 = c14093.m33701();
                                c14093 = c14093;
                                int iMin2 = Math.min(Math.min(iM47358 - 1, c14093.m33700() - 1) - i20, 256 - i23) + i20;
                                int i25 = i20;
                                while (true) {
                                    if (i25 >= iMin2) {
                                        c11748 = c11748;
                                        i5 = iM47357;
                                        break;
                                    }
                                    int i26 = i25 - iM33701;
                                    c11748 = c11748;
                                    char c = cArrM33702[i26];
                                    i5 = iM47357;
                                    if (c > 127 || c == '\t') {
                                        break;
                                    }
                                    char c2 = cArrM33702[i26 + 1];
                                    char[] cArr = cArrM33702;
                                    if (c2 == 65039 || c2 == 8419) {
                                        int i27 = C6075.f18642;
                                        if (('0' > c || c > '9') && c != '#' && c != '*') {
                                            f3 = f7 + fArrM24480[c];
                                            if (i19 == i25 && f3 > f6) {
                                                break;
                                            }
                                            i14 = i25 + 1;
                                            if (f3 <= f5) {
                                                if (z4) {
                                                    b2 = bArr[c];
                                                    i15 = i14;
                                                    if (b2 != 1 || (b2 == 2 && (c2 >= 128 ? !Character.isDigit(c2) : !(c2 >= '0' && c2 <= '9')))) {
                                                        i24 = i15;
                                                        i21 = i24;
                                                    }
                                                } else {
                                                    i15 = i14;
                                                }
                                                i21 = i15;
                                            } else {
                                                i15 = i14;
                                            }
                                            i25 = i15;
                                            c11748 = c11748;
                                            iM47357 = i5;
                                            f7 = f3;
                                            cArrM33702 = cArr;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        f3 = f7 + fArrM24480[c];
                                        if (i19 == i25) {
                                        }
                                        i14 = i25 + 1;
                                        if (f3 <= f5) {
                                            if (z4) {
                                                b2 = bArr[c];
                                                i15 = i14;
                                                if (b2 != 1) {
                                                }
                                                i24 = i15;
                                                i21 = i24;
                                            } else {
                                                i15 = i14;
                                            }
                                            i21 = i15;
                                        } else {
                                            i15 = i14;
                                        }
                                        i25 = i15;
                                        c11748 = c11748;
                                        iM47357 = i5;
                                        f7 = f3;
                                        cArrM33702 = cArr;
                                    }
                                }
                                int i28 = (i25 - i20) + i23;
                                if (i28 != 256) {
                                    i23 = i28;
                                } else if (booleanSupplier.getAsBoolean()) {
                                    return;
                                } else {
                                    i23 = 0;
                                }
                                if (i25 == i20 || i25 != iMin2) {
                                    i20 = i25;
                                    i6 = i24;
                                    f = f7;
                                    cCharAt = charSequence.charAt(i20);
                                    if (cCharAt <= 127 || cCharAt == '\t') {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        int i29 = C6075.f18642;
                                        if (!(('0' > cCharAt && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*') || (i13 = i20 + 1) >= iM47358) {
                                            fArr = fArrM24480;
                                        } else {
                                            char cCharAt3 = charSequence.charAt(i13);
                                            fArr = fArrM24480;
                                            if (cCharAt3 == 65039 || cCharAt3 == 8419) {
                                                z3 = false;
                                            }
                                        }
                                    } else {
                                        fArr = fArrM24480;
                                    }
                                    if (z3 || (i23 = i23 + 1) == 256) {
                                        if (booleanSupplier.getAsBoolean()) {
                                            return;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    if (z3) {
                                        iM50336 = i20 + 1;
                                    } else {
                                        iM50336 = C22412.m50336(i20, iM47358, charSequence);
                                    }
                                    if (z3) {
                                        fM24474 = c9585.m24471(cCharAt);
                                    } else {
                                        fM24474 = c9585.m24474(charSequence, i20, iM50336, f);
                                    }
                                    f2 = f + fM24474;
                                    if (i19 != i20 || (f2 <= f6 && !(z2 && iMin == i22 && iM50336 == iM47358 && f2 > f5))) {
                                        i7 = i4;
                                        c11747 = c11748;
                                        iM47357 = i5;
                                        if (f2 <= f5) {
                                            if (z4) {
                                                c9584 = c9585;
                                                if (iM50336 - i20 < 2 || (cCharAt >= 128 ? !(cCharAt != 8203 && ((cCharAt < 55296 || cCharAt > 56319) && (cCharAt < 11904 || !m40856(true, cCharAt) || (i10 = i20 + 1) >= charSequence.length() || !m40856(false, charSequence.charAt(i10))))) : !((b = bArr[cCharAt]) == 2 ? (i11 = i20 + 1) < charSequence.length() && ((cCharAt2 = charSequence.charAt(i11)) >= 128 ? Character.isDigit(cCharAt2) : cCharAt2 >= '0' && cCharAt2 <= '9') : b != 1))) {
                                                    i6 = iM50336;
                                                    i21 = i6;
                                                }
                                            } else {
                                                c9584 = c9585;
                                            }
                                            i21 = iM50336;
                                            i6 = i6;
                                        } else {
                                            c9584 = c9585;
                                        }
                                        i8 = i6;
                                        i20 = iM50336;
                                        i9 = i;
                                    } else {
                                        if (booleanSupplier.getAsBoolean()) {
                                            return;
                                        }
                                        if (!z4 || i6 <= i19) {
                                            i6 = i21;
                                        }
                                        if (i6 != i19) {
                                            i20 = i6;
                                        }
                                        C11747 c11749 = c11748;
                                        iM47357 = i5;
                                        c11749.m28751(i19, i20, iM47357);
                                        c6624.m18156(c11749);
                                        if (z6) {
                                            if (c18180.f56558) {
                                                i12 = i4;
                                                f6 -= i12;
                                            } else {
                                                i12 = i4;
                                            }
                                            f5 = c18180.f56556 ? f6 - i12 : f6;
                                            z6 = false;
                                        } else {
                                            i12 = i4;
                                        }
                                        if (c16768 != null && c16768.m39447(c11749, c6624)) {
                                            return;
                                        }
                                        iM47355 = i3;
                                        c11748 = c11749;
                                        fArrM24480 = fArr;
                                        i16 = i12;
                                        i18 = i22;
                                        c6625 = c6624;
                                        i19 = i20;
                                        c14093 = c14093;
                                    }
                                } else {
                                    c9584 = c9585;
                                    i20 = i25;
                                    i9 = i22;
                                    i8 = i24;
                                    f2 = f7;
                                    i7 = i4;
                                    c11747 = c11748;
                                    iM47357 = i5;
                                    fArr = fArrM24480;
                                }
                            }
                            c11748 = c11747;
                            fArrM24480 = fArr;
                            i16 = i7;
                            i24 = i8;
                            f7 = f2;
                            c9585 = c9584;
                            c14093 = c14093;
                            i22 = i9;
                            c6625 = c6624;
                        } else {
                            i4 = i16;
                        }
                        i5 = iM47357;
                        i6 = i24;
                        f = f7;
                        cCharAt = charSequence.charAt(i20);
                        if (cCharAt <= 127) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            int i210 = C6075.f18642;
                            if ('0' > cCharAt) {
                            }
                            fArr = fArrM24480;
                        } else {
                            fArr = fArrM24480;
                        }
                        if (z3) {
                            if (booleanSupplier.getAsBoolean()) {
                                return;
                            } else {
                                i23 = 0;
                            }
                        } else if (booleanSupplier.getAsBoolean()) {
                            return;
                        } else {
                            i23 = 0;
                        }
                        if (z3) {
                            iM50336 = i20 + 1;
                        } else {
                            iM50336 = C22412.m50336(i20, iM47358, charSequence);
                        }
                        if (z3) {
                            fM24474 = c9585.m24471(cCharAt);
                        } else {
                            fM24474 = c9585.m24474(charSequence, i20, iM50336, f);
                        }
                        f2 = f + fM24474;
                        if (i19 != i20) {
                        }
                        i7 = i4;
                        c11747 = c11748;
                        iM47357 = i5;
                        if (f2 <= f5) {
                            if (z4) {
                                c9584 = c9585;
                                if (iM50336 - i20 < 2) {
                                }
                                i6 = iM50336;
                                i21 = i6;
                            } else {
                                c9584 = c9585;
                            }
                            i21 = iM50336;
                            i6 = i6;
                        } else {
                            c9584 = c9585;
                        }
                        i8 = i6;
                        i20 = iM50336;
                        i9 = i;
                        c11748 = c11747;
                        fArrM24480 = fArr;
                        i16 = i7;
                        i24 = i8;
                        f7 = f2;
                        c9585 = c9584;
                        c14093 = c14093;
                        i22 = i9;
                        c6625 = c6624;
                    }
                }
            }
            C6624 c6626 = c6625;
            C9584 c9586 = c9585;
            C14093 c14094 = c14093;
            float[] fArr2 = fArrM24480;
            int i30 = i16;
            C11747 c117410 = c11748;
            if (i19 != iM47358 || i3 == iM47358) {
                if (booleanSupplier.getAsBoolean()) {
                    return;
                }
                c117410.m28751(i19, iM47358, iM47357);
                c6626.m18156(c117410);
            }
            c11748 = c117410;
            i17 = iMin;
            c6625 = c6626;
            z5 = z5;
            fArrM24480 = fArr2;
            i16 = i30;
            c9585 = c9586;
            c14093 = c14094;
        }
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo9758() {
        return !this.f10037.f73255;
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo9774() {
        return this.f53394;
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ۢ */
    public final float mo8163() {
        return this.f53398;
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo8155(int i, int i2, int i3) {
        m9785();
        if (mo9770()) {
            throw new IllegalStateException("Layout is still preparing");
        }
        m9767(this.f10015);
        if ((this.f53398 - mo8169()) - mo8162() <= 0) {
            mo8166(this.f10015);
            return;
        }
        try {
            C7744 c7744M9797 = m9797();
            try {
                m40841(i, i2, i3, c7744M9797);
                c7744M9797.close();
                m9773();
            } catch (Throwable th) {
                try {
                    c7744M9797.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m9773();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40841(int i, int i2, int i3, C7744 c7744) {
        int size;
        int i4;
        int iM9762;
        int i5;
        int iM9761;
        int i6 = i;
        C20736 c20736 = this.f53407;
        c20736.clear();
        int iM9763 = m9762(i6, false);
        c20736.m47353(this.f9998.get(iM9763));
        if (i2 > 0) {
            iM9762 = m9762(i6 + i2, false);
            c20736.m47351(iM9763 + 1, iM9762 + 1, this.f9998);
            C11747 c11747 = c20736.get(0);
            C11747 c11747M47368 = c20736.m47368();
            size = c20736.size();
            i4 = c11747M47368.f35064 - c11747.f35064;
            int i7 = c11747M47368.f35063 - i2;
            if (c20736.size() == 1) {
                c11747M47368 = new C11747();
            }
            c11747.f35063 = i6;
            c11747M47368.f35062 = i6;
            c11747M47368.f35063 = i7;
            c20736.clear();
            c20736.m47353(c11747);
            c20736.m47353(c11747M47368);
        } else {
            C11747 c11748 = c20736.get(0);
            C11747 c11749 = new C11747();
            c11749.f35062 = i6;
            c11749.f35063 = c11748.f35063;
            c11748.f35063 = i6;
            c20736.m47362(0, c11748);
            c20736.m47353(c11749);
            size = 1;
            i4 = 0;
            iM9762 = iM9763;
        }
        if (i3 > 0) {
            int i8 = c20736.get(0).f35064;
            int i9 = i6 + i3;
            C11747 c117410 = new C11747();
            C23266 c23266M9764 = m9764(c7744, i6, i9);
            boolean z = true;
            while (z) {
                try {
                    int iM51584 = c23266M9764.m51584();
                    if (iM51584 == -1 || iM51584 >= i9) {
                        z = false;
                        iM51584 = i9;
                    }
                    c117410.m28751(i6, iM51584, i8);
                    c20736.add(c20736.m47364(), c117410);
                    i6 = iM51584 + 1;
                    i8++;
                } catch (Throwable th) {
                    try {
                        c23266M9764.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            c23266M9764.close();
            c20736.m47350(c20736.m47364(), c20736.size(), i3, 0);
        }
        C11747 c11747M47369 = c20736.m47368();
        c11747M47369.f35064 = c20736.m47357(c20736.size() - 2);
        c20736.m47362(c20736.m47364(), c11747M47369);
        int i10 = c20736.m47368().f35064 - c20736.get(0).f35064;
        for (int iM47364 = c20736.m47364(); iM47364 >= 0; iM47364--) {
            if (c20736.m47355(iM47364) == c20736.m47358(iM47364) && (!c20736.m47369(iM47364) || !c20736.m47356(iM47364))) {
                c20736.m47349(iM47364, iM47364 + 1);
            }
        }
        int i11 = i3 - i2;
        int i12 = i10 - i4;
        int iM47357 = this.f9998.m47357(iM9763);
        int iM47366 = this.f9998.m47366(iM9763);
        if (i12 != 0) {
            if (i12 < 0) {
                this.f10033.m48859(iM47357, iM47357 - i12);
            } else {
                this.f10033.m48864(iM47357, i12);
            }
        }
        C12392 c12392 = this.f10021;
        if (c12392.f37211) {
            this.f9998.m47361(iM9763, size, c20736);
            int size2 = iM9763 + c20736.size();
            c20736.clear();
            C20736 c20737 = this.f9998;
            c20737.m47350(size2, c20737.size(), i11, i12);
            return;
        }
        C22686 c22686 = this.f10037;
        if (!c22686.f73263 || (iM9761 = m9761(i12)) == this.f10000) {
            if (iM9763 > 0) {
                C11747 c117411 = this.f9998.get(iM9763 - 1);
                if (c117411.f35064 == c20736.get(0).f35064) {
                    c20736.add(0, c117411);
                    iM9763--;
                }
            }
            int iM47358 = this.f9998.m47357(iM9762);
            int i13 = iM9762 + 1;
            int iM47365 = (i13 >= this.f9998.size() || this.f9998.m47357(i13) != iM47358) ? i13 : this.f9998.m47365(i13) + 1;
            if (i13 < iM47365) {
                c20736.m47353(new C11747(this.f9998.m47355(i13) + i11, this.f9998.m47358(iM47365 - 1) + i11, iM47358 + i12));
            }
            C20736 c20738 = this.f53405;
            c20738.clear();
            int iMo8169 = (this.f53398 - mo8169()) - mo8162();
            this.f53399 = iMo8169;
            boolean zM47369 = this.f9998.m47369(iM9763);
            C16768 c16768 = i13 < iM47365 ? new C16768(this.f9998, i13, iM47365, i11, i12) : null;
            int i14 = iM47365;
            m40844((CharSequence) c7744, c20736, c20738, c20736.size(), iMo8169, zM47369, new C18180(c22686, this.f53394, c22686.m50687(), mo9758(), this.f53394), new BooleanSupplier() { // from class: l.ۤۧܿ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f30901.f10026;
                }
            }, c16768, false);
            this.f9998.m47361(iM9763, (c16768 == null ? i14 : c16768.f51487) - iM9763, c20738);
            int size3 = c20738.size() + iM9763;
            c20736.clear();
            c20738.clear();
            C20736 c20739 = this.f9998;
            c20739.m47350(size3, c20739.size(), i11, i12);
        } else {
            this.f9998.m47361(iM9763, size, c20736);
            int size4 = iM9763 + c20736.size();
            c20736.clear();
            C20736 c207310 = this.f9998;
            c207310.m47350(size4, c207310.size(), i11, i12);
            this.f10000 = iM9761;
            m40862(true);
        }
        int iM24485 = c22686.m24485();
        int i15 = iM47366;
        int i16 = 0;
        while (i16 <= i10) {
            int i17 = iM47357 + i16;
            int iM47367 = this.f9998.m47367(i17, i15);
            this.f10033.m48860(i17, this, c7744, this.f9998.m47355(iM47367), iM24485);
            i16++;
            i15 = iM47367;
        }
        int i18 = iM47357 + i10 + 1;
        C23803 c23803 = c12392.f37235.f21235;
        if (c23803.f77021) {
            int iM9790 = m9790(c23803.f77020);
            int iM9791 = m9790(c23803.f77019);
            C11747 c117412 = this.f9998.get(iM9790);
            C11747 c117413 = this.f9998.get(iM9791);
            int iMin = Math.min(iM47357, c117412.f35064);
            int iMax = Math.max(i18, c117413.f35064 + 1);
            int i19 = iMin;
            int i20 = i19;
            while (i20 < iM47357) {
                int iM47368 = this.f9998.m47367(i20, i19);
                this.f10033.m48860(i20, this, c7744, this.f9998.m47355(iM47368), iM24485);
                i20++;
                i19 = iM47368;
            }
            int iMax2 = Math.max(i19, i18);
            while (i18 < iMax) {
                int iM47369 = this.f9998.m47367(i18, iMax2);
                this.f10033.m48860(i18, this, c7744, this.f9998.m47355(iM47369), iM24485);
                i18++;
                iMax2 = iM47369;
            }
            i5 = iMin;
            i18 = iMax;
        } else {
            i5 = iM47357;
        }
        this.f10033.m48866(i5, i18);
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ֫ */
    public final void mo8154(float f) {
        if (this.f53406 != null) {
            this.f53406.f33389 = true;
            this.f53406.f33395 = true;
        }
        this.f10000 = m40873();
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ᩸ */
    public final void mo8173() {
        this.f10000 = m40873();
        if (m9757() || m9776()) {
            if (this.f10021.f37258 == this && Looper.myLooper() == Looper.getMainLooper() && !this.f10015.mo1605() && (this.f53406 != null || m9782() > 100000)) {
                m40857();
            } else {
                m40862(false);
            }
        }
        m40858();
        this.f10021.invalidate();
        this.f10021.mo25906();
    }

    static {
        byte[] bArr = new byte[128];
        for (char c : " !?;,=|>\t".toCharArray()) {
            bArr[c] = 1;
        }
        for (char c2 : "+-*/.".toCharArray()) {
            bArr[c2] = 2;
        }
        f53393 = bArr;
    }

    @Override // l.AbstractC3179
    /* JADX INFO: renamed from: ֫ */
    public final void mo8159(C10130 c10130) {
        ReentrantLock reentrantLock = this.f53404;
        try {
            reentrantLock.lock();
            super.mo8159(c10130);
            reentrantLock.unlock();
            c10130.writeInt(this.f53398);
            c10130.writeInt(this.f53399);
            c10130.m25425(this.f53394);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
