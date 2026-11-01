package p067l;

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
public final class C18976 extends AbstractC5390 {

    /* JADX INFO: renamed from: ۗ֫ */
    public static final byte[] f56580;

    /* JADX INFO: renamed from: ֡֫ */
    public boolean f56581;

    /* JADX INFO: renamed from: ֨֫ */
    public boolean f56582;

    /* JADX INFO: renamed from: ۖ֫ */
    public volatile Throwable f56583;

    /* JADX INFO: renamed from: ۘ֫ */
    public C22076 f56584;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f56585;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f56586;

    /* JADX INFO: renamed from: ۠֫ */
    public C6652 f56587;

    /* JADX INFO: renamed from: ܶ֫ */
    public volatile C22076 f56588;

    /* JADX INFO: renamed from: ܺ֫ */
    public final AtomicInteger f56589;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final AtomicInteger f56590;

    /* JADX INFO: renamed from: ᩵֫ */
    public final ReentrantLock f56591;

    /* JADX INFO: renamed from: ᩶֫ */
    public C22076 f56592;

    /* JADX INFO: renamed from: ᩸֫ */
    public volatile RunnableC12942 f56593;

    /* JADX INFO: renamed from: ᩹֫ */
    public C22076 f56594;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m43114(boolean z, char c) {
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

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final synchronized int mo10186(C6731 c6731) {
        return m43121(c6731.m15391(), c6731.m15388());
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10193() {
        return false;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۧ */
    public final synchronized long mo11822(int i, int i2) {
        if (this.f56593 == null && !this.f12816 && this.f12798 == this.f56584) {
            return super.mo11822(i, i2);
        }
        if (this.f56593 == null) {
            if (!this.f12821.m32496(this)) {
                return 0L;
            }
            i2 = m43121(i, i2);
        }
        if (!(i2 > 0 && m43121(i, i2) == i2)) {
            return 0L;
        }
        C22076 c22076 = this.f12798;
        double d = i;
        return (((long) c22076.get(Math.min(c22076.m49691(), ((int) ((d + ((double) i2)) / ((double) this.f12837.m26496()))) + 200)).m30798()) & 4294967295L) | (((long) c22076.get(Math.min(c22076.m49691(), Math.max(0, ((int) (d / ((double) this.f12837.m26496()))) - 200))).f38061) << 32);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean mo11824(int i) {
        return super.mo11824(i);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean mo10200(C6731 c6731) {
        int iM15391;
        int iM15388;
        iM15391 = c6731.m15391();
        iM15388 = c6731.m15388();
        return iM15388 > 0 && m43121(iM15391, iM15388) == iM15388;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ܶ */
    public final synchronized void mo11828() {
        if (m11801()) {
            this.f12833.m51209(this, this.f12815, this.f56584, this.f12837.m26497());
        }
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ܽ */
    public final synchronized long mo11831(int i, int i2) {
        if (this.f56593 == null && !this.f12816 && this.f12798 == this.f56584) {
            return super.mo11831(i, i2);
        }
        if (this.f56593 == null) {
            if (!this.f12821.m32496(this)) {
                return -1L;
            }
            i2 = m43121(i, i2);
        }
        if (!(i2 > 0 && m43121(i, i2) == i2)) {
            return -1L;
        }
        C22076 c22076 = this.f12798;
        double d = i;
        return (((long) c22076.get(Math.min(c22076.m49691(), (int) ((d + ((double) i2)) / ((double) this.f12837.m26496())))).m30798()) & 4294967295L) | (((long) c22076.get(Math.min(c22076.m49691(), Math.max(0, (int) (d / ((double) this.f12837.m26496()))))).f38061) << 32);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ܿ */
    public final synchronized boolean mo11835(int i, int i2) {
        if (!this.f12816 && this.f12798 == this.f56584) {
            super.mo11835(i, i2);
            return true;
        }
        return false;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo10205() {
        return (byte) 1;
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m43128() {
        return !this.f56582 && this.f12798 == this.f56584;
    }

    public C18976(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929, boolean z, int i, C5311 c5311, C10794 c10794, C9729 c9729) {
        super(c14146, c23929);
        this.f56591 = new ReentrantLock();
        this.f56590 = new AtomicInteger(0);
        this.f56582 = false;
        this.f56589 = new AtomicInteger();
        this.f56594 = new C22076();
        this.f56592 = new C22076();
        this.f12814 = i;
        if (c9729 != null) {
            m11812(interfaceC9768, c9729.m22742());
        }
        try {
            this.f56581 = z;
            m11832();
            this.f56585 = c14146.m32458();
            m11811(interfaceC9768);
            this.f56587 = c5311.m11489(this, c10794);
            this.f56584 = this.f12798;
            this.f12800 = m43131();
            if ((this.f56585 - mo10202()) - mo10195() != ((C18976) c5311.f12482).f56586) {
                this.f56587 = null;
            }
            m43120(false);
        } finally {
            if (!this.f12816) {
                m11817();
            }
        }
    }

    public C18976(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929, boolean z) {
        this(c14146, interfaceC9768, c23929, z, -1, null);
    }

    public C18976(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929, boolean z, int i, C9729 c9729) {
        super(c14146, c23929);
        this.f56591 = new ReentrantLock();
        this.f56590 = new AtomicInteger(0);
        this.f56582 = false;
        this.f56589 = new AtomicInteger();
        this.f56594 = new C22076();
        this.f56592 = new C22076();
        this.f12814 = i;
        if (c9729 != null) {
            m11812(interfaceC9768, c9729.m22742());
        }
        this.f56581 = z;
        this.f56585 = c14146.m32458();
        mo10199(interfaceC9768);
    }

    public C18976(C14146 c14146, InterfaceC9768 interfaceC9768, C23929 c23929, C14677 c14677) {
        super(c14146, interfaceC9768, c23929, c14677);
        this.f56591 = new ReentrantLock();
        this.f56590 = new AtomicInteger(0);
        this.f56582 = false;
        this.f56589 = new AtomicInteger();
        this.f56594 = new C22076();
        this.f56592 = new C22076();
        this.f56585 = c14677.readInt();
        this.f56586 = c14677.readInt();
        this.f56581 = c14677.m33585();
        m11832();
        this.f56584 = this.f12798;
        m11811(interfaceC9768);
        m11817();
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final void mo10191(String str) {
        super.mo10191(str);
        m43116();
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۧ */
    public final void mo10199(InterfaceC9768 interfaceC9768) {
        try {
            m43124(interfaceC9768);
        } finally {
            if (!this.f12816) {
                m11817();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m43124(InterfaceC9768 interfaceC9768) {
        m11832();
        this.f56587 = null;
        this.f56590.incrementAndGet();
        mo10198();
        try {
            this.f56591.lock();
            this.f12826 = false;
            m11811(interfaceC9768);
            C22076 c22076 = this.f12798.isEmpty() ? this.f12798 : new C22076();
            C22921 c22921 = this.f12833.isEmpty() ? this.f12833 : new C22921();
            c22921.clear();
            C9729 c9729M11841 = m11841();
            try {
                int iM26497 = this.f12837.m26497();
                C24481 c24481M11808 = m11808(c9729M11841, 0, c9729M11841.length());
                try {
                    C13533 c13533 = new C13533();
                    boolean z = true;
                    boolean z2 = true;
                    int i = 0;
                    int i2 = 0;
                    while (z2) {
                        if (this.f12826) {
                            c22076.clear();
                            c22921.clear();
                            c24481M11808.close();
                            c9729M11841.close();
                            this.f56591.unlock();
                            return;
                        }
                        c22921.add(C20910.m47222(this, c9729M11841, i, iM26497));
                        int iM53980 = c24481M11808.m53980();
                        if (iM53980 == -1) {
                            iM53980 = c9729M11841.length();
                            z2 = false;
                        }
                        c13533.m30799(i, iM53980, i2);
                        c22076.m49680(c13533);
                        i = iM53980 + 1;
                        i2++;
                        try {
                            c9729M11841.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    c24481M11808.close();
                    c22921.m51213();
                    c9729M11841.close();
                    this.f12798 = c22076;
                    this.f12833 = c22921;
                    this.f56591.unlock();
                    synchronized (this.f56590) {
                        this.f56584 = this.f12798;
                        this.f56590.incrementAndGet();
                        this.f12800 = m43131();
                        int iM32458 = this.f12821.m32458();
                        boolean z3 = iM32458 > 0 && iM32458 != this.f56585;
                        if (z3) {
                            this.f56585 = iM32458;
                        }
                        if ((this.f56585 - mo10202()) - mo10195() > 0) {
                            z = false;
                        }
                        this.f56582 = z;
                        if (!z) {
                            m43120(false);
                            if (z3) {
                                m43116();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        c24481M11808.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c9729M11841.close();
                throw th4;
            }
        } catch (Throwable th5) {
            this.f56591.unlock();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43127(boolean z) {
        this.f56581 = z;
        this.f56586 = 0;
        m43120(false);
        m43116();
    }

    /* JADX INFO: renamed from: ܰ */
    public final boolean m43130() {
        return this.f56581;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ܳ */
    public final void mo11827(int i) {
        synchronized (this.f56590) {
            if (i > 0) {
                if ((this.f56585 != i || this.f56582) && m11801()) {
                    this.f56585 = i;
                    if ((i - mo10202()) - mo10195() <= 0) {
                        this.f56582 = true;
                        return;
                    }
                    if (this.f56584.m49690()) {
                        this.f56582 = false;
                        return;
                    }
                    if (this.f56593 != null) {
                        m43115();
                    } else if (this.f56582) {
                        this.f56582 = false;
                        m43120(false);
                    } else {
                        m43120(true);
                    }
                    m43116();
                    this.f12821.postInvalidate();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m43132(int i) {
        int i2;
        return !this.f56582 && (i2 = this.f56585) == i && (i2 - mo10202()) - mo10195() > 0;
    }

    /* JADX INFO: renamed from: ۟ */
    private void m43116() {
        int iMo10202;
        if (this.f12820.isEmpty() || (iMo10202 = (this.f56585 - mo10202()) - mo10195()) <= 0) {
            return;
        }
        this.f12820.size();
        C22076 c22076 = new C22076(0);
        this.f12826 = false;
        String str = this.f12806;
        C22076 c22077 = this.f12820;
        int size = c22077.size();
        C23929 c23929 = this.f12837;
        m43102((CharSequence) str, c22077, c22076, size, iMo10202, true, new C19647(c23929, this.f56581, c23929.m53013(), mo11802(), this.f56581), new BooleanSupplier() { // from class: l.۫ۧܿ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f40117.f12826;
            }
        }, (C18305) null, false);
        this.f12820 = c22076;
    }

    /* JADX INFO: renamed from: ܳ */
    private int m43121(int i, int i2) {
        if (i < 0 || i2 <= 0 || this.f12819 || this.f56583 != null || this.f12798.isEmpty()) {
            return 0;
        }
        if (this.f12798 == this.f56584 && (!this.f12816 || this.f56588 != null)) {
            return i2;
        }
        if (this.f12798 != this.f56588) {
            return 0;
        }
        return (int) Math.max(0.0d, Math.min(i2, (Math.ceil(this.f12837.m26496() * (((long) this.f12798.size()) - 1)) - 1.0d) - ((double) i)));
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۤ */
    public final int mo10197() {
        return this.f56589.get();
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ᩶ */
    public final Throwable mo10204() {
        return this.f56583;
    }

    /* JADX INFO: renamed from: ᩺ */
    public final int m43131() {
        C22076 c22076 = this.f56584;
        return m11805((c22076 == null || c22076.isEmpty() || this.f12798.isEmpty()) ? 0 : this.f56584.m49695().f38063 - this.f12798.m49695().f38063);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo11814() {
        return this.f56593 != null || this.f12816;
    }

    /* JADX INFO: renamed from: ۨ */
    public final void m43129() {
        RunnableC12942 runnableC12942 = this.f56593;
        this.f56593 = null;
        if (runnableC12942 != null) {
            runnableC12942.f36395 = true;
            this.f12798 = this.f56584;
            this.f56588 = null;
        }
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۧ */
    public final void mo10198() {
        m43129();
        if (this.f12816) {
            this.f12819 = true;
            while (this.f12816) {
                SystemClock.sleep(100L);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m43120(boolean z) {
        if (m11801() || m11820()) {
            InterfaceC9768 interfaceC9768 = this.f12815;
            boolean zMo4003 = interfaceC9768.mo4003();
            int i = this.f56590.get();
            interfaceC9768.setReadOnly(true);
            synchronized (this) {
                if (this.f12815 == interfaceC9768 && i == this.f56590.get()) {
                    m43111(z, interfaceC9768, i, zMo4003);
                    return;
                }
                interfaceC9768.setReadOnly(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫֫ */
    public void m43115() {
        C19647 c19647;
        this.f12800 = m43131();
        int iMo10202 = (this.f56585 - mo10202()) - mo10195();
        if (iMo10202 <= 0) {
            this.f56582 = true;
            return;
        }
        int iM11803 = m11803(this.f12821.m32472() + 1);
        int iM49682 = this.f12798.m49682(iM11803);
        synchronized (this.f12837) {
            c19647 = new C19647(this.f12837.m26500(), this.f56581, this.f12837.m53013(), mo11802(), this.f56581);
        }
        int iM32472 = (int) (this.f12821.m32472() - (c19647.f59772.m26496() * iM11803));
        RunnableC12942 runnableC12942 = this.f56593;
        if (runnableC12942 != null) {
            runnableC12942.f36395 = true;
        }
        this.f56589.incrementAndGet();
        if (this.f12816) {
            this.f12819 = true;
        }
        RunnableC12942 runnableC12943 = new RunnableC12942(this, iMo10202, c19647, iM49682, iM32472);
        this.f56593 = runnableC12943;
        this.f56583 = null;
        this.f56582 = false;
        runnableC12943.f36384.setReadOnly(true);
        C14146 c14146 = this.f12821;
        c14146.getClass();
        int i = 0;
        C7050.m16212(new RunnableC9413(i, c14146));
        runnableC12943.f36394 = new RunnableC3931(i, c14146);
        try {
            C4081.f8987.execute(runnableC12943);
        } catch (Error | RuntimeException e) {
            runnableC12943.f36384.setReadOnly(false);
            runnableC12943.f36394.run();
            this.f56593 = null;
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m43111(boolean r29, p067l.InterfaceC9768 r30, int r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C18976.m43111(boolean, l.۟᩺ᩳ, int, boolean):void");
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m43112(C18976 c18976, int i, int i2, InterfaceC9768 interfaceC9768, int i3) {
        return (!c18976.f12826 && !c18976.f12819 && i == c18976.f56590.get() && i2 == c18976.f56589.get() && c18976.f12815 == interfaceC9768 && c18976.m11825() == i3) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #5 {all -> 0x006a, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0018, B:9:0x001e, B:36:0x0072, B:38:0x0078), top: B:51:0x0009 }] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m43108(C18976 c18976, List list, C21503 c21503, C22076 c22076, int i, InterfaceC9768 interfaceC9768, int i2, int i3, int i4, int i5, int i6, float f, ArrayList arrayList, C22076 c22077, Runnable runnable) throws Throwable {
        boolean z = false;
        try {
            try {
                try {
                    C22076 c22076M20611 = C8918.m20611(new C5409(c18976), list, c21503);
                    if (c22076M20611 != null && !c21503.getAsBoolean()) {
                        C22076 c22078 = new C22076(c22076);
                        c22078.m49681(c22076M20611);
                        c18976.f56584 = c22078;
                        c18976.f12798 = c22078;
                        c18976.f56586 = i;
                        try {
                            c18976.m43103(interfaceC9768, i2, i3, i4, c22078, i5, i6, f);
                            c18976.m43100(arrayList.size(), C8918.f24163, c22078);
                        } catch (Error e) {
                            e = e;
                            z = true;
                            if (!c21503.getAsBoolean()) {
                                c18976.f56583 = e;
                            }
                            if (!z && !c18976.f12821.m32554(c18976)) {
                                c18976.f12798 = c22077;
                            }
                            c18976.m43104(interfaceC9768, runnable);
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            z = true;
                            if (!c21503.getAsBoolean()) {
                                c18976.f56583 = e;
                            }
                            if (!z) {
                                c18976.f12798 = c22077;
                            }
                            c18976.m43104(interfaceC9768, runnable);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z && !c18976.f12821.m32554(c18976)) {
                                c18976.f12798 = c22077;
                            }
                            c18976.m43104(interfaceC9768, runnable);
                            throw th;
                        }
                    } else if (!c18976.f12821.m32554(c18976)) {
                        c18976.f12798 = c22077;
                    }
                    c18976.m43104(interfaceC9768, runnable);
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
    /* JADX INFO: renamed from: ֫ */
    public void m43100(int i, int i2, C22076 c22076) {
        SystemClock.elapsedRealtime();
        c22076.size();
        Math.min(i2, i);
        Integer.toHexString(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22076 m43095(CharSequence charSequence, C22076 c22076, C22330 c22330, int i, C19647 c19647, BooleanSupplier booleanSupplier) {
        int i2;
        C11601 c11601;
        C22076 c22077 = new C22076();
        List listM50152 = c22330.m50152();
        C15543 c15543M49686 = c22076.m49686();
        C13533 c13533 = new C13533();
        int i3 = 0;
        while (i3 < listM50152.size() && !booleanSupplier.getAsBoolean()) {
            C11601 c11602 = (C11601) listM50152.get(i3);
            if (c11602.m26713()) {
                if (c22076.m49682(c11602.m26714()) >= c11602.m26712() && c22076.m49685(c11602.m26715() - 1) <= c11602.m26710()) {
                    c22077.m49678(c11602.m26714(), c11602.m26715(), c22076);
                } else {
                    for (int iM26714 = c11602.m26714(); iM26714 < c11602.m26715(); iM26714++) {
                        C13533 c13533M35335 = c15543M49686.m35335(iM26714);
                        if (c13533M35335.f38061 < c11602.m26712() || c13533M35335.f38062 > c11602.m26710()) {
                            c13533M35335.m30799(Math.max(c13533M35335.f38061, c11602.m26712()), Math.min(c13533M35335.f38062, c11602.m26710()), c13533M35335.f38063);
                            c13533M35335.m30801(false);
                        }
                        c22077.m49680(c13533M35335);
                    }
                }
                i3++;
            } else {
                C22076 c22078 = new C22076();
                while (true) {
                    i2 = i3 + 1;
                    c11601 = (C11601) listM50152.get(i3);
                    int iM26715 = c11601.m26714();
                    while (iM26715 < c11601.m26715()) {
                        int iMin = Math.min(c11601.m26715(), c22076.m49692(iM26715) + 1);
                        c13533.m30799(Math.max(c22076.m49682(iM26715), c11601.m26712()), Math.min(c22076.m49685(iMin - 1), c11601.m26710()), c22076.m49684(iM26715));
                        c22078.m49680(c13533);
                        iM26715 = iMin;
                    }
                    if (i2 >= listM50152.size() || ((C11601) listM50152.get(i2)).m26713()) {
                        break;
                    }
                    i3 = i2;
                }
                m43102(charSequence, c22078, c22077, c22078.size(), i, c11602.m26711(), c19647, booleanSupplier, (C18305) null, !c11601.m26716());
                i3 = i2;
            }
        }
        return c22077;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m43113(C22076 c22076, int i, float f) {
        if (!c22076.isEmpty() && c22076.m49695().f38062 >= i) {
            int size = c22076.size() - 1;
            int i2 = 0;
            while (i2 < size) {
                int i3 = (i2 + size) >>> 1;
                if (c22076.m49685(i3) <= i) {
                    i2 = i3 + 1;
                } else {
                    size = i3;
                }
            }
            if ((((long) (c22076.size() - i2)) - 1) * f > this.f12821.m32606()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43104(InterfaceC9768 interfaceC9768, Runnable runnable) {
        try {
            m11817();
            interfaceC9768.setReadOnly(false);
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    this.f12816 = false;
                    this.f12821.m32564(this);
                }
            }
            this.f12821.postInvalidate();
        } catch (Throwable th) {
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    this.f12816 = false;
                    this.f12821.m32564(this);
                }
            }
            this.f12821.postInvalidate();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43103(final InterfaceC9768 interfaceC9768, final int i, final int i2, final int i3, final C22076 c22076, int i4, final int i5, final float f) {
        if (this.f12814 >= 0) {
            return;
        }
        final int iM43117 = m43117(c22076, i4);
        this.f12821.post(new Runnable() { // from class: l.ۛۧܿ
            @Override // java.lang.Runnable
            public final void run() {
                C18976.m43109(this.f21346, interfaceC9768, i, i2, c22076, i3, f, iM43117, i5);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m43109(C18976 c18976, InterfaceC9768 interfaceC9768, int i, int i2, C22076 c22076, int i3, float f, int i4, int i5) {
        C14146 c14146 = c18976.f12821;
        if (c14146.f40275 == c18976 && c18976.f12815 == interfaceC9768 && interfaceC9768.mo28581() == i && c18976.m11825() == i && c18976.f56589.get() == i2 && c18976.f12798 == c22076 && !c14146.m32418(c18976) && c14146.m32460() == i3) {
            c14146.m32428(c14146.m32585(((int) (f * i4)) + i5));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m43117(C22076 c22076, int i) {
        int size = c22076.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) >>> 1;
            if (c22076.m49682(i3) >= i || c22076.m49685(i3) > i) {
                size = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43102(CharSequence charSequence, C22076 c22076, C22076 c22077, int i, int i2, boolean z, C19647 c19647, BooleanSupplier booleanSupplier, C18305 c18305, boolean z2) {
        c22077.getClass();
        C8664 c8664 = new C8664(c22077);
        try {
            m43101(charSequence, c22076, c8664, i, i2, z, c19647, booleanSupplier, c18305, z2);
            c8664.close();
        } catch (Throwable th) {
            try {
                c8664.close();
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
    /* JADX INFO: renamed from: ֫ */
    public static void m43101(CharSequence charSequence, C22076 c22076, C8664 c8664, int i, int i2, boolean z, C19647 c19647, BooleanSupplier booleanSupplier, C18305 c18305, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        char cCharAt;
        boolean z3;
        float[] fArr;
        int iM52676;
        float fM26486;
        float f2;
        int i7;
        C13533 c13533;
        C11477 c11477;
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
        C8664 c8665 = c8664;
        C11477 c11478 = c19647.f59772;
        C15763 c15763 = charSequence instanceof C15763 ? (C15763) charSequence : null;
        float[] fArrM26492 = c15763 != null ? c11478.m26492() : null;
        C13533 c13534 = new C13533();
        boolean z4 = c19647.f59770;
        int i16 = c19647.f59768;
        boolean z5 = z;
        int i17 = 0;
        while (i17 < i && !booleanSupplier.getAsBoolean()) {
            int iMin = Math.min(i, c22076.m49692(i17) + 1);
            int iM49684 = c22076.m49684(i17);
            float f4 = i2;
            if (!z5) {
                if (c19647.f59771) {
                    f4 -= i16;
                }
                z5 = true;
            }
            float f5 = c19647.f59769 ? f4 - i16 : f4;
            int iM49682 = c22076.m49682(i17);
            float f6 = f4;
            int iM49685 = c22076.m49685(iMin - 1);
            int i18 = i;
            boolean z6 = z5;
            int i19 = iM49682;
            while (true) {
                float f7 = 0.0f;
                int i20 = i19;
                int i21 = i20;
                i3 = iM49682;
                int i22 = i18;
                int i23 = 0;
                int i24 = i21;
                while (true) {
                    if (i20 < iM49685) {
                        byte[] bArr = f56580;
                        if (c15763 != null) {
                            i4 = i16;
                            if (i20 + 1 < iM49685) {
                                char[] cArrM35827 = c15763.m35827(i20);
                                int iM35826 = c15763.m35826();
                                c15763 = c15763;
                                int iMin2 = Math.min(Math.min(iM49685 - 1, c15763.m35825() - 1) - i20, 256 - i23) + i20;
                                int i25 = i20;
                                while (true) {
                                    if (i25 >= iMin2) {
                                        c13534 = c13534;
                                        i5 = iM49684;
                                        break;
                                    }
                                    int i26 = i25 - iM35826;
                                    c13534 = c13534;
                                    char c = cArrM35827[i26];
                                    i5 = iM49684;
                                    if (c > 127 || c == '\t') {
                                        break;
                                    }
                                    char c2 = cArrM35827[i26 + 1];
                                    char[] cArr = cArrM35827;
                                    if (c2 == 65039 || c2 == 8419) {
                                        int i27 = C8142.f21498;
                                        if (('0' > c || c > '9') && c != '#' && c != '*') {
                                            f3 = f7 + fArrM26492[c];
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
                                            c13534 = c13534;
                                            iM49684 = i5;
                                            f7 = f3;
                                            cArrM35827 = cArr;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        f3 = f7 + fArrM26492[c];
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
                                        c13534 = c13534;
                                        iM49684 = i5;
                                        f7 = f3;
                                        cArrM35827 = cArr;
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
                                        int i29 = C8142.f21498;
                                        if (!(('0' > cCharAt && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*') || (i13 = i20 + 1) >= iM49685) {
                                            fArr = fArrM26492;
                                        } else {
                                            char cCharAt3 = charSequence.charAt(i13);
                                            fArr = fArrM26492;
                                            if (cCharAt3 == 65039 || cCharAt3 == 8419) {
                                                z3 = false;
                                            }
                                        }
                                    } else {
                                        fArr = fArrM26492;
                                    }
                                    if (z3 || (i23 = i23 + 1) == 256) {
                                        if (booleanSupplier.getAsBoolean()) {
                                            return;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    if (z3) {
                                        iM52676 = i20 + 1;
                                    } else {
                                        iM52676 = C23669.m52676(i20, iM49685, charSequence);
                                    }
                                    if (z3) {
                                        fM26486 = c11478.m26483(cCharAt);
                                    } else {
                                        fM26486 = c11478.m26486(charSequence, i20, iM52676, f);
                                    }
                                    f2 = f + fM26486;
                                    if (i19 != i20 || (f2 <= f6 && !(z2 && iMin == i22 && iM52676 == iM49685 && f2 > f5))) {
                                        i7 = i4;
                                        c13533 = c13534;
                                        iM49684 = i5;
                                        if (f2 <= f5) {
                                            if (z4) {
                                                c11477 = c11478;
                                                if (iM52676 - i20 < 2 || (cCharAt >= 128 ? !(cCharAt != 8203 && ((cCharAt < 55296 || cCharAt > 56319) && (cCharAt < 11904 || !m43114(true, cCharAt) || (i10 = i20 + 1) >= charSequence.length() || !m43114(false, charSequence.charAt(i10))))) : !((b = bArr[cCharAt]) == 2 ? (i11 = i20 + 1) < charSequence.length() && ((cCharAt2 = charSequence.charAt(i11)) >= 128 ? Character.isDigit(cCharAt2) : cCharAt2 >= '0' && cCharAt2 <= '9') : b != 1))) {
                                                    i6 = iM52676;
                                                    i21 = i6;
                                                }
                                            } else {
                                                c11477 = c11478;
                                            }
                                            i21 = iM52676;
                                            i6 = i6;
                                        } else {
                                            c11477 = c11478;
                                        }
                                        i8 = i6;
                                        i20 = iM52676;
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
                                        C13533 c13535 = c13534;
                                        iM49684 = i5;
                                        c13535.m30799(i19, i20, iM49684);
                                        c8664.m20108(c13535);
                                        if (z6) {
                                            if (c19647.f59771) {
                                                i12 = i4;
                                                f6 -= i12;
                                            } else {
                                                i12 = i4;
                                            }
                                            f5 = c19647.f59769 ? f6 - i12 : f6;
                                            z6 = false;
                                        } else {
                                            i12 = i4;
                                        }
                                        if (c18305 != null && c18305.m41683(c13535, c8664)) {
                                            return;
                                        }
                                        iM49682 = i3;
                                        c13534 = c13535;
                                        fArrM26492 = fArr;
                                        i16 = i12;
                                        i18 = i22;
                                        c8665 = c8664;
                                        i19 = i20;
                                        c15763 = c15763;
                                    }
                                } else {
                                    c11477 = c11478;
                                    i20 = i25;
                                    i9 = i22;
                                    i8 = i24;
                                    f2 = f7;
                                    i7 = i4;
                                    c13533 = c13534;
                                    iM49684 = i5;
                                    fArr = fArrM26492;
                                }
                            }
                            c13534 = c13533;
                            fArrM26492 = fArr;
                            i16 = i7;
                            i24 = i8;
                            f7 = f2;
                            c11478 = c11477;
                            c15763 = c15763;
                            i22 = i9;
                            c8665 = c8664;
                        } else {
                            i4 = i16;
                        }
                        i5 = iM49684;
                        i6 = i24;
                        f = f7;
                        cCharAt = charSequence.charAt(i20);
                        if (cCharAt <= 127) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            int i210 = C8142.f21498;
                            if ('0' > cCharAt) {
                            }
                            fArr = fArrM26492;
                        } else {
                            fArr = fArrM26492;
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
                            iM52676 = i20 + 1;
                        } else {
                            iM52676 = C23669.m52676(i20, iM49685, charSequence);
                        }
                        if (z3) {
                            fM26486 = c11478.m26483(cCharAt);
                        } else {
                            fM26486 = c11478.m26486(charSequence, i20, iM52676, f);
                        }
                        f2 = f + fM26486;
                        if (i19 != i20) {
                        }
                        i7 = i4;
                        c13533 = c13534;
                        iM49684 = i5;
                        if (f2 <= f5) {
                            if (z4) {
                                c11477 = c11478;
                                if (iM52676 - i20 < 2) {
                                }
                                i6 = iM52676;
                                i21 = i6;
                            } else {
                                c11477 = c11478;
                            }
                            i21 = iM52676;
                            i6 = i6;
                        } else {
                            c11477 = c11478;
                        }
                        i8 = i6;
                        i20 = iM52676;
                        i9 = i;
                        c13534 = c13533;
                        fArrM26492 = fArr;
                        i16 = i7;
                        i24 = i8;
                        f7 = f2;
                        c11478 = c11477;
                        c15763 = c15763;
                        i22 = i9;
                        c8665 = c8664;
                    }
                }
            }
            C8664 c8666 = c8665;
            C11477 c11479 = c11478;
            C15763 c15764 = c15763;
            float[] fArr2 = fArrM26492;
            int i30 = i16;
            C13533 c13536 = c13534;
            if (i19 != iM49685 || i3 == iM49685) {
                if (booleanSupplier.getAsBoolean()) {
                    return;
                }
                c13536.m30799(i19, iM49685, iM49684);
                c8666.m20108(c13536);
            }
            c13534 = c13536;
            i17 = iMin;
            c8665 = c8666;
            z5 = z5;
            fArrM26492 = fArr2;
            i16 = i30;
            c11478 = c11479;
            c15763 = c15764;
        }
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo11802() {
        return !this.f12837.f75980;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo11818() {
        return this.f56581;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ۢ */
    public final float mo10196() {
        return this.f56585;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo10188(int i, int i2, int i3) {
        m11829();
        if (mo11814()) {
            throw new IllegalStateException("Layout is still preparing");
        }
        m11811(this.f12815);
        if ((this.f56585 - mo10202()) - mo10195() <= 0) {
            mo10199(this.f12815);
            return;
        }
        try {
            C9729 c9729M11841 = m11841();
            try {
                m43099(i, i2, i3, c9729M11841);
                c9729M11841.close();
                m11817();
            } catch (Throwable th) {
                try {
                    c9729M11841.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m11817();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43099(int i, int i2, int i3, C9729 c9729) {
        int size;
        int i4;
        int iM11806;
        int i5;
        int iM11805;
        int i6 = i;
        C22076 c22076 = this.f56594;
        c22076.clear();
        int iM11807 = m11806(i6, false);
        c22076.m49680(this.f12798.get(iM11807));
        if (i2 > 0) {
            iM11806 = m11806(i6 + i2, false);
            c22076.m49678(iM11807 + 1, iM11806 + 1, this.f12798);
            C13533 c13533 = c22076.get(0);
            C13533 c13533M49695 = c22076.m49695();
            size = c22076.size();
            i4 = c13533M49695.f38063 - c13533.f38063;
            int i7 = c13533M49695.f38062 - i2;
            if (c22076.size() == 1) {
                c13533M49695 = new C13533();
            }
            c13533.f38062 = i6;
            c13533M49695.f38061 = i6;
            c13533M49695.f38062 = i7;
            c22076.clear();
            c22076.m49680(c13533);
            c22076.m49680(c13533M49695);
        } else {
            C13533 c13534 = c22076.get(0);
            C13533 c13535 = new C13533();
            c13535.f38061 = i6;
            c13535.f38062 = c13534.f38062;
            c13534.f38062 = i6;
            c22076.m49689(0, c13534);
            c22076.m49680(c13535);
            size = 1;
            i4 = 0;
            iM11806 = iM11807;
        }
        if (i3 > 0) {
            int i8 = c22076.get(0).f38063;
            int i9 = i6 + i3;
            C13533 c13536 = new C13533();
            C24481 c24481M11808 = m11808(c9729, i6, i9);
            boolean z = true;
            while (z) {
                try {
                    int iM53980 = c24481M11808.m53980();
                    if (iM53980 == -1 || iM53980 >= i9) {
                        z = false;
                        iM53980 = i9;
                    }
                    c13536.m30799(i6, iM53980, i8);
                    c22076.add(c22076.m49691(), c13536);
                    i6 = iM53980 + 1;
                    i8++;
                } catch (Throwable th) {
                    try {
                        c24481M11808.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            c24481M11808.close();
            c22076.m49677(c22076.m49691(), c22076.size(), i3, 0);
        }
        C13533 c13533M49696 = c22076.m49695();
        c13533M49696.f38063 = c22076.m49684(c22076.size() - 2);
        c22076.m49689(c22076.m49691(), c13533M49696);
        int i10 = c22076.m49695().f38063 - c22076.get(0).f38063;
        for (int iM49691 = c22076.m49691(); iM49691 >= 0; iM49691--) {
            if (c22076.m49682(iM49691) == c22076.m49685(iM49691) && (!c22076.m49696(iM49691) || !c22076.m49683(iM49691))) {
                c22076.m49676(iM49691, iM49691 + 1);
            }
        }
        int i11 = i3 - i2;
        int i12 = i10 - i4;
        int iM49684 = this.f12798.m49684(iM11807);
        int iM49693 = this.f12798.m49693(iM11807);
        if (i12 != 0) {
            if (i12 < 0) {
                this.f12833.m51207(iM49684, iM49684 - i12);
            } else {
                this.f12833.m51212(iM49684, i12);
            }
        }
        C14146 c14146 = this.f12821;
        if (c14146.f40228) {
            this.f12798.m49688(iM11807, size, c22076);
            int size2 = iM11807 + c22076.size();
            c22076.clear();
            C22076 c22077 = this.f12798;
            c22077.m49677(size2, c22077.size(), i11, i12);
            return;
        }
        C23929 c23929 = this.f12837;
        if (!c23929.f75988 || (iM11805 = m11805(i12)) == this.f12800) {
            if (iM11807 > 0) {
                C13533 c13537 = this.f12798.get(iM11807 - 1);
                if (c13537.f38063 == c22076.get(0).f38063) {
                    c22076.add(0, c13537);
                    iM11807--;
                }
            }
            int iM49685 = this.f12798.m49684(iM11806);
            int i13 = iM11806 + 1;
            int iM49692 = (i13 >= this.f12798.size() || this.f12798.m49684(i13) != iM49685) ? i13 : this.f12798.m49692(i13) + 1;
            if (i13 < iM49692) {
                c22076.m49680(new C13533(this.f12798.m49682(i13) + i11, this.f12798.m49685(iM49692 - 1) + i11, iM49685 + i12));
            }
            C22076 c22078 = this.f56592;
            c22078.clear();
            int iMo10202 = (this.f56585 - mo10202()) - mo10195();
            this.f56586 = iMo10202;
            boolean zM49696 = this.f12798.m49696(iM11807);
            C18305 c18305 = i13 < iM49692 ? new C18305(this.f12798, i13, iM49692, i11, i12) : null;
            int i14 = iM49692;
            m43102((CharSequence) c9729, c22076, c22078, c22076.size(), iMo10202, zM49696, new C19647(c23929, this.f56581, c23929.m53013(), mo11802(), this.f56581), new BooleanSupplier() { // from class: l.ۤۧܿ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f33862.f12826;
                }
            }, c18305, false);
            this.f12798.m49688(iM11807, (c18305 == null ? i14 : c18305.f54669) - iM11807, c22078);
            int size3 = c22078.size() + iM11807;
            c22076.clear();
            c22078.clear();
            C22076 c22079 = this.f12798;
            c22079.m49677(size3, c22079.size(), i11, i12);
        } else {
            this.f12798.m49688(iM11807, size, c22076);
            int size4 = iM11807 + c22076.size();
            c22076.clear();
            C22076 c220710 = this.f12798;
            c220710.m49677(size4, c220710.size(), i11, i12);
            this.f12800 = iM11805;
            m43120(true);
        }
        int iM26497 = c23929.m26497();
        int i15 = iM49693;
        int i16 = 0;
        while (i16 <= i10) {
            int i17 = iM49684 + i16;
            int iM49694 = this.f12798.m49694(i17, i15);
            this.f12833.m51208(i17, this, c9729, this.f12798.m49682(iM49694), iM26497);
            i16++;
            i15 = iM49694;
        }
        int i18 = iM49684 + i10 + 1;
        C24991 c24991 = c14146.f40252.f24113;
        if (c24991.f79773) {
            int iM11834 = m11834(c24991.f79772);
            int iM11835 = m11834(c24991.f79771);
            C13533 c13538 = this.f12798.get(iM11834);
            C13533 c13539 = this.f12798.get(iM11835);
            int iMin = Math.min(iM49684, c13538.f38063);
            int iMax = Math.max(i18, c13539.f38063 + 1);
            int i19 = iMin;
            int i20 = i19;
            while (i20 < iM49684) {
                int iM49695 = this.f12798.m49694(i20, i19);
                this.f12833.m51208(i20, this, c9729, this.f12798.m49682(iM49695), iM26497);
                i20++;
                i19 = iM49695;
            }
            int iMax2 = Math.max(i19, i18);
            while (i18 < iMax) {
                int iM49696 = this.f12798.m49694(i18, iMax2);
                this.f12833.m51208(i18, this, c9729, this.f12798.m49682(iM49696), iM26497);
                i18++;
                iMax2 = iM49696;
            }
            i5 = iMin;
            i18 = iMax;
        } else {
            i5 = iM49684;
        }
        this.f12833.m51214(i5, i18);
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final void mo10187(float f) {
        if (this.f56593 != null) {
            this.f56593.f36389 = true;
            this.f56593.f36395 = true;
        }
        this.f12800 = m43131();
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ᩸ */
    public final void mo10206() {
        this.f12800 = m43131();
        if (m11801() || m11820()) {
            if (this.f12821.f40275 == this && Looper.myLooper() == Looper.getMainLooper() && !this.f12815.mo4003() && (this.f56593 != null || m11826() > 100000)) {
                m43115();
            } else {
                m43120(false);
            }
        }
        m43116();
        this.f12821.invalidate();
        this.f12821.mo27928();
    }

    static {
        byte[] bArr = new byte[128];
        for (char c : " !?;,=|>\t".toCharArray()) {
            bArr[c] = 1;
        }
        for (char c2 : "+-*/.".toCharArray()) {
            bArr[c2] = 2;
        }
        f56580 = bArr;
    }

    @Override // p067l.AbstractC5390
    /* JADX INFO: renamed from: ֫ */
    public final void mo10192(C11996 c11996) {
        ReentrantLock reentrantLock = this.f56591;
        try {
            reentrantLock.lock();
            super.mo10192(c11996);
            reentrantLock.unlock();
            c11996.writeInt(this.f56585);
            c11996.writeInt(this.f56586);
            c11996.m27445(this.f56581);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
