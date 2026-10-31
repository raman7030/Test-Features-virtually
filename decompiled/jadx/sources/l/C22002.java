package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VA */
/* JADX INFO: loaded from: classes.dex */
public final class C22002 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f70515;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Executor f70523;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f70525;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20798 f70526;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11440 f70527;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC21297 f70529;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f70531;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70522 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f70518 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile int f70520 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f70521 = 1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f70517 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f70528 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile long f70514 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile long f70530 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f70519 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f70516 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f70524 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m49501(C22002 c22002, int i, int i2, RunnableC7890 runnableC7890) {
        c22002.getClass();
        int i3 = runnableC7890.f24447;
        if (i3 > i) {
            return false;
        }
        if (runnableC7890.f24443 && runnableC7890.f24442 <= i2 && i2 < i3) {
            if (!runnableC7890.f24446) {
                return false;
            }
            c22002.f70516 = runnableC7890.f24442;
            c22002.f70524 = runnableC7890.f24439;
        }
        runnableC7890.m21179();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49502(C22002 c22002, int i, RunnableC7890 runnableC7890) {
        c22002.getClass();
        if (!runnableC7890.f24443) {
            int i2 = runnableC7890.f24442;
            C23244 c23244 = c22002.f70526.f67332;
            C11003.checkIndex(i, c23244.f74675);
            if (i2 != ((int) (((long) i) * ((long) c23244.f74676)))) {
                return false;
            }
        }
        runnableC7890.m21179();
        return true;
    }

    public C22002(C20798 c20798, Executor executor, InterfaceC17066 interfaceC17066, C11440 c11440) {
        this.f70526 = c20798;
        this.f70523 = executor;
        this.f70515 = interfaceC17066;
        this.f70527 = c11440;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e6, code lost:
    
        r1.m21180();
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m49516(final int i, int i2) {
        RunnableC7890 runnableC7890;
        if (this.f70525 || this.f70515.mo1526() || !this.f70526.m47593()) {
            m49515();
            return;
        }
        InterfaceC21297 interfaceC21297 = this.f70529;
        m49497(interfaceC21297 == null ? -1L : ((C15130) interfaceC21297).f46251.f34598);
        long j = this.f70514;
        final int i3 = (int) (j >>> 32);
        synchronized (this.f70522) {
            int i4 = this.f70516;
            if (i3 < i4 || i3 >= ((long) i4) + ((long) this.f70526.f67332.f74676)) {
                this.f70516 = -1;
                this.f70524 = Collections.EMPTY_LIST;
            }
            C5378.removeIf(this.f70522, new Predicate() { // from class: l.֡ۖܿ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C22002.m49501(this.f1240, i, i3, (RunnableC7890) obj);
                }
            });
        }
        m49507();
        if (this.f70529 != null) {
            C23244 c23244 = this.f70526.f67332;
            if (c23244.f74677 > 1 && c23244.f74675 > 1) {
                int i5 = (int) j;
                final int i6 = i3 / c23244.f74676;
                if (j != this.f70530) {
                    List list = this.f70524;
                    synchronized (this.f70522) {
                        for (RunnableC7890 runnableC7891 : this.f70522) {
                            if (runnableC7891.f24443 && runnableC7891.f24442 <= i3 && runnableC7891.f24447 > i3) {
                                list = runnableC7891.f24439;
                            }
                        }
                    }
                    if (!list.isEmpty() && ((C14945) list.get(0)).f45550 <= i3 && ((C14945) C7166.m19188(1, list)).f45549 >= i5) {
                        m49498(list, j, this.f70515);
                    }
                }
                if (i3 < i5 && i6 < this.f70526.f67332.f74675 && (i6 != this.f70517 || i5 > this.f70528)) {
                    synchronized (this.f70522) {
                        C5378.removeIf(this.f70522, new Predicate() { // from class: l.ۚۖܿ
                            @Override // java.util.function.Predicate
                            public /* synthetic */ Predicate and(Predicate predicate) {
                                return C19285.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* JADX INFO: renamed from: negate */
                            public /* synthetic */ Predicate mo4928negate() {
                                return C19285.$default$negate(this);
                            }

                            public /* synthetic */ Predicate or(Predicate predicate) {
                                return C19285.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return C22002.m49502(this.f15939, i6, (RunnableC7890) obj);
                            }
                        });
                        if (this.f70522.size() >= Math.min(3, this.f70526.f67332.f74677 - 1)) {
                            ArrayList arrayList = this.f70522;
                            ((RunnableC7890) arrayList.remove(arrayList.size() - 1)).m21179();
                        }
                        int iMin = (int) Math.min(this.f70526.f67335, ((long) i5) + 10000);
                        C23244 c23245 = this.f70526.f67332;
                        C11003.checkIndex(i6, c23245.f74675);
                        runnableC7890 = new RunnableC7890(this, (int) (((long) i6) * ((long) c23245.f74676)), Math.min(iMin, Math.max(i5, this.f70526.f67332.m51564(i6))), iMin);
                        if (runnableC7890.f24442 < runnableC7890.f24447) {
                            this.f70522.add(runnableC7890);
                        } else {
                            runnableC7890 = null;
                        }
                        this.f70517 = i6;
                        this.f70528 = runnableC7890 == null ? -1 : runnableC7890.f24447;
                    }
                    m49507();
                    if (runnableC7890 != null) {
                        runnableC7890.m21180();
                    }
                }
            }
        }
        this.f70521 = Math.max(this.f70521, (i / this.f70526.f67332.f74676) + 1);
        while (!this.f70525 && this.f70521 < this.f70526.f67332.f74675) {
            synchronized (this.f70522) {
                if (this.f70522.size() >= Math.min(3, this.f70526.f67332.f74677 - 1)) {
                    return;
                }
                C23244 c23246 = this.f70526.f67332;
                int i7 = this.f70521;
                C11003.checkIndex(i7, c23246.f74675);
                int i8 = (int) (((long) i7) * ((long) c23246.f74676));
                if (i8 >= i2) {
                    return;
                }
                Iterator it = this.f70522.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (((RunnableC7890) it.next()).f24442 == i8) {
                        z = true;
                    }
                }
                if (z) {
                    this.f70521++;
                } else {
                    C23244 c23247 = this.f70526.f67332;
                    int i9 = this.f70521;
                    this.f70521 = i9 + 1;
                    RunnableC7890 runnableC7892 = new RunnableC7890(this, i8, Math.min(i2, c23247.m51564(i9)));
                    this.f70522.add(runnableC7892);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49497(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i < 0 || i >= i2 || i2 > this.f70526.f67335) {
            return;
        }
        int iMin = (int) Math.min(i2, ((long) i) + 65536);
        int iMin2 = Math.min(10000, (65536 - (iMin - i)) / 2);
        int i3 = iMin2 / 2;
        int iMax = Math.max(0, i - i3);
        long j2 = iMin;
        int iMin3 = (int) Math.min(this.f70526.f67335, ((long) i3) + j2);
        long j3 = this.f70514;
        if (j3 == -1 || ((int) (j3 >>> 32)) > iMax || iMin3 > ((int) j3)) {
            int iMax2 = Math.max(0, i - iMin2);
            int iMin4 = (int) Math.min(this.f70526.f67335, j2 + ((long) iMin2));
            synchronized (this.f70522) {
                this.f70514 = (((long) iMin4) & 4294967295L) | (((long) iMax2) << 32);
                this.f70531 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m49498(List list, long j, InterfaceC17066 interfaceC17066) {
        C13035 c13035;
        C23097 c23097;
        synchronized (this.f70522) {
            if (!this.f70525 && this.f70514 == j && (this.f70519 != j || this.f70531 != list)) {
                C23097 c23098 = this.f70526.f67334;
                int i = (int) (j >>> 32);
                int i2 = (int) j;
                if (!list.isEmpty()) {
                    int iMax = Math.max(i, ((C14945) list.get(0)).f45550);
                    int iMin = (int) Math.min(Math.min(i2, ((C14945) C7166.m19188(1, list)).f45549), ((long) iMax) + 65536);
                    if (iMax < iMin) {
                        C9302 c9302M23868 = C9302.m23868(iMin - iMax, c23098.f74319, false);
                        C10008 c10008 = c23098.m51276() ? null : new C10008(c9302M23868, c23098.f74319, iMax);
                        long jNanoTime = System.nanoTime();
                        Iterator it = list.iterator();
                        int i3 = 0;
                        loop0: while (true) {
                            if (!it.hasNext()) {
                                if (c10008 != null) {
                                    c9302M23868 = c10008.m25174();
                                }
                                C16356 c16356 = new C16356();
                                c9302M23868.getClass();
                                C17768 c17768 = new C17768();
                                c17768.m41620(c9302M23868);
                                while (c17768.m41625()) {
                                    C21834 c21834M41624 = c17768.m41624();
                                    c16356.m38503(c17768.m41619() - c17768.m41622(), new C21834(null, c21834M41624.m49210(), 0, c21834M41624.m49212(), 0, 0), false);
                                }
                                if (!m49503(this, interfaceC17066, j)) {
                                    c13035 = new C13035(iMax, c16356.m38502());
                                    break;
                                }
                                break;
                            }
                            C14945 c14945 = (C14945) it.next();
                            if (c23098.m51276()) {
                                int iMax2 = Math.max(iMax, c14945.f45550);
                                c23097 = c23098;
                                int iMin2 = Math.min(iMin, c14945.f45549);
                                if (iMax2 < iMin2) {
                                    int i4 = i3;
                                    C9302 c9302 = c14945.f45548;
                                    int i5 = c14945.f45550;
                                    c9302M23868 = c9302M23868.m23881(iMax2 - iMax, iMin2 - iMax, c9302.m23886(iMax2 - i5, iMin2 - i5));
                                    i3 = i4;
                                }
                            } else {
                                c23097 = c23098;
                                Iterator it2 = c14945.f45552.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C12829 c12829M25175 = c10008.m25175((C5774) it2.next());
                                        while (true) {
                                            i3++;
                                            if (i3 <= 65536 && ((i3 & 255) != 0 || (!m49503(this, interfaceC17066, j) && System.nanoTime() - jNanoTime <= 8000000))) {
                                                if (c12829M25175 == null || c12829M25175.m31205()) {
                                                    if (c12829M25175 != null) {
                                                        c10008.m25177(c12829M25175);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            c23098 = c23097;
                            iMin = iMin;
                            it = it;
                            c13035 = null;
                            break;
                        }
                    }
                    c13035 = null;
                    break;
                }
                c13035 = null;
                break;
                if (c13035 != null) {
                    this.f70530 = j;
                    C15130 c15130 = (C15130) this.f70529;
                    C16747.m39395(c15130.f46250, c15130.f46251, c13035);
                } else {
                    if (interfaceC17066.mo1526() || !this.f70526.m47593()) {
                        return;
                    }
                    synchronized (this.f70522) {
                        if (!this.f70525 && this.f70514 == j) {
                            this.f70519 = j;
                            this.f70531 = list;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m49503(C22002 c22002, InterfaceC17066 interfaceC17066, long j) {
        return c22002.f70525 || interfaceC17066.mo1526() || !c22002.f70526.m47593() || c22002.f70514 != j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14945 m49514(int i) {
        C14945 c14945 = null;
        if (this.f70525 || i < this.f70520) {
            return null;
        }
        synchronized (this.f70522) {
            int iMin = Integer.MAX_VALUE;
            for (RunnableC7890 runnableC7890 : this.f70522) {
                if (!runnableC7890.f24443) {
                    for (C14945 c14946 : runnableC7890.f24439) {
                        int i2 = c14946.f45550;
                        if (i2 == i) {
                            c14945 = c14946;
                        }
                        if (i2 > i) {
                            iMin = Math.min(iMin, i2);
                        }
                    }
                }
            }
            this.f70520 = iMin;
        }
        return c14945;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49515() {
        this.f70525 = true;
        synchronized (this.f70522) {
            Iterator it = this.f70522.iterator();
            while (it.hasNext()) {
                ((RunnableC7890) it.next()).m21179();
            }
            this.f70522.clear();
            this.f70524 = Collections.EMPTY_LIST;
            this.f70516 = -1;
            this.f70531 = null;
        }
        m49507();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m49507() {
        while (true) {
            C7744 c7744 = (C7744) this.f70518.poll();
            if (c7744 == null) {
                return;
            } else {
                try {
                    c7744.close();
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
