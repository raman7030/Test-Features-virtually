package p067l;

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
public final class C23279 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18588 f73229;

    /* JADX INFO: renamed from: ܳ */
    public final Executor f73237;

    /* JADX INFO: renamed from: ܽ */
    public volatile boolean f73239;

    /* JADX INFO: renamed from: ܿ */
    public final C22135 f73240;

    /* JADX INFO: renamed from: ᩳ */
    public final C13241 f73241;

    /* JADX INFO: renamed from: ᩵ */
    public InterfaceC22609 f73243;

    /* JADX INFO: renamed from: ᩻ */
    public List f73245;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f73236 = new ArrayList();

    /* JADX INFO: renamed from: ۚ */
    public final ConcurrentLinkedQueue f73232 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ۡ */
    public volatile int f73234 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۢ */
    public int f73235 = 1;

    /* JADX INFO: renamed from: ۘ */
    public int f73231 = -1;

    /* JADX INFO: renamed from: ᩴ */
    public int f73242 = -1;

    /* JADX INFO: renamed from: ֡ */
    public volatile long f73228 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public volatile long f73244 = -1;

    /* JADX INFO: renamed from: ۜ */
    public long f73233 = -1;

    /* JADX INFO: renamed from: ۖ */
    public int f73230 = -1;

    /* JADX INFO: renamed from: ܺ */
    public List f73238 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m51836(C23279 c23279, int i, int i2, RunnableC9867 runnableC9867) {
        c23279.getClass();
        int i3 = runnableC9867.f27363;
        if (i3 > i) {
            return false;
        }
        if (runnableC9867.f27359 && runnableC9867.f27358 <= i2 && i2 < i3) {
            if (!runnableC9867.f27362) {
                return false;
            }
            c23279.f73230 = runnableC9867.f27358;
            c23279.f73238 = runnableC9867.f27355;
        }
        runnableC9867.m23144();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m51837(C23279 c23279, int i, RunnableC9867 runnableC9867) {
        c23279.getClass();
        if (!runnableC9867.f27359) {
            int i2 = runnableC9867.f27358;
            C24460 c24460 = c23279.f73240.f70015;
            C12826.checkIndex(i, c24460.f77418);
            if (i2 != ((int) (((long) i) * ((long) c24460.f77419)))) {
                return false;
            }
        }
        runnableC9867.m23144();
        return true;
    }

    public C23279(C22135 c22135, Executor executor, InterfaceC18588 interfaceC18588, C13241 c13241) {
        this.f73240 = c22135;
        this.f73237 = executor;
        this.f73229 = interfaceC18588;
        this.f73241 = c13241;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e6, code lost:
    
        r1.m23145();
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m51851(final int i, int i2) {
        RunnableC9867 runnableC9867;
        if (this.f73239 || this.f73229.mo3924() || !this.f73240.m49921()) {
            m51850();
            return;
        }
        InterfaceC22609 interfaceC22609 = this.f73243;
        m51832(interfaceC22609 == null ? -1L : ((C16748) interfaceC22609).f49371.f37595);
        long j = this.f73228;
        final int i3 = (int) (j >>> 32);
        synchronized (this.f73236) {
            int i4 = this.f73230;
            if (i3 < i4 || i3 >= ((long) i4) + ((long) this.f73240.f70015.f77419)) {
                this.f73230 = -1;
                this.f73238 = Collections.EMPTY_LIST;
            }
            C7480.removeIf(this.f73236, new Predicate() { // from class: l.֡ۖܿ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m3602or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C23279.m51836(this.f4016, i, i3, (RunnableC9867) obj);
                }
            });
        }
        m51842();
        if (this.f73243 != null) {
            C24460 c24460 = this.f73240.f70015;
            if (c24460.f77420 > 1 && c24460.f77418 > 1) {
                int i5 = (int) j;
                final int i6 = i3 / c24460.f77419;
                if (j != this.f73244) {
                    List list = this.f73238;
                    synchronized (this.f73236) {
                        for (RunnableC9867 runnableC9868 : this.f73236) {
                            if (runnableC9868.f27359 && runnableC9868.f27358 <= i3 && runnableC9868.f27363 > i3) {
                                list = runnableC9868.f27355;
                            }
                        }
                    }
                    if (!list.isEmpty() && ((C16572) list.get(0)).f48664 <= i3 && ((C16572) C9179.m21131(1, list)).f48663 >= i5) {
                        m51833(list, j, this.f73229);
                    }
                }
                if (i3 < i5 && i6 < this.f73240.f70015.f77418 && (i6 != this.f73231 || i5 > this.f73242)) {
                    synchronized (this.f73236) {
                        C7480.removeIf(this.f73236, new Predicate() { // from class: l.ۚۖܿ
                            @Override // java.util.function.Predicate
                            public /* synthetic */ Predicate and(Predicate predicate) {
                                return C20697.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* JADX INFO: renamed from: negate */
                            public /* synthetic */ Predicate mo55838negate() {
                                return C20697.$default$negate(this);
                            }

                            /* JADX INFO: renamed from: or */
                            public /* synthetic */ Predicate m16525or(Predicate predicate) {
                                return C20697.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return C23279.m51837(this.f18775, i6, (RunnableC9867) obj);
                            }
                        });
                        if (this.f73236.size() >= Math.min(3, this.f73240.f70015.f77420 - 1)) {
                            ArrayList arrayList = this.f73236;
                            ((RunnableC9867) arrayList.remove(arrayList.size() - 1)).m23144();
                        }
                        int iMin = (int) Math.min(this.f73240.f70018, ((long) i5) + 10000);
                        C24460 c24461 = this.f73240.f70015;
                        C12826.checkIndex(i6, c24461.f77418);
                        runnableC9867 = new RunnableC9867(this, (int) (((long) i6) * ((long) c24461.f77419)), Math.min(iMin, Math.max(i5, this.f73240.f70015.m53961(i6))), iMin);
                        if (runnableC9867.f27358 < runnableC9867.f27363) {
                            this.f73236.add(runnableC9867);
                        } else {
                            runnableC9867 = null;
                        }
                        this.f73231 = i6;
                        this.f73242 = runnableC9867 == null ? -1 : runnableC9867.f27363;
                    }
                    m51842();
                    if (runnableC9867 != null) {
                        runnableC9867.m23145();
                    }
                }
            }
        }
        this.f73235 = Math.max(this.f73235, (i / this.f73240.f70015.f77419) + 1);
        while (!this.f73239 && this.f73235 < this.f73240.f70015.f77418) {
            synchronized (this.f73236) {
                if (this.f73236.size() >= Math.min(3, this.f73240.f70015.f77420 - 1)) {
                    return;
                }
                C24460 c24462 = this.f73240.f70015;
                int i7 = this.f73235;
                C12826.checkIndex(i7, c24462.f77418);
                int i8 = (int) (((long) i7) * ((long) c24462.f77419));
                if (i8 >= i2) {
                    return;
                }
                Iterator it = this.f73236.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (((RunnableC9867) it.next()).f27358 == i8) {
                        z = true;
                    }
                }
                if (z) {
                    this.f73235++;
                } else {
                    C24460 c24463 = this.f73240.f70015;
                    int i9 = this.f73235;
                    this.f73235 = i9 + 1;
                    RunnableC9867 runnableC9869 = new RunnableC9867(this, i8, Math.min(i2, c24463.m53961(i9)));
                    this.f73236.add(runnableC9869);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51832(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i < 0 || i >= i2 || i2 > this.f73240.f70018) {
            return;
        }
        int iMin = (int) Math.min(i2, ((long) i) + 65536);
        int iMin2 = Math.min(10000, (65536 - (iMin - i)) / 2);
        int i3 = iMin2 / 2;
        int iMax = Math.max(0, i - i3);
        long j2 = iMin;
        int iMin3 = (int) Math.min(this.f73240.f70018, ((long) i3) + j2);
        long j3 = this.f73228;
        if (j3 == -1 || ((int) (j3 >>> 32)) > iMax || iMin3 > ((int) j3)) {
            int iMax2 = Math.max(0, i - iMin2);
            int iMin4 = (int) Math.min(this.f73240.f70018, j2 + ((long) iMin2));
            synchronized (this.f73236) {
                this.f73228 = (((long) iMin4) & 4294967295L) | (((long) iMax2) << 32);
                this.f73245 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX INFO: renamed from: ֫ */
    public void m51833(List list, long j, InterfaceC18588 interfaceC18588) {
        C14757 c14757;
        C24320 c24320;
        synchronized (this.f73236) {
            if (!this.f73239 && this.f73228 == j && (this.f73233 != j || this.f73245 != list)) {
                C24320 c24321 = this.f73240.f70017;
                int i = (int) (j >>> 32);
                int i2 = (int) j;
                if (!list.isEmpty()) {
                    int iMax = Math.max(i, ((C16572) list.get(0)).f48664);
                    int iMin = (int) Math.min(Math.min(i2, ((C16572) C9179.m21131(1, list)).f48663), ((long) iMax) + 65536);
                    if (iMax < iMin) {
                        C11209 c11209M25877 = C11209.m25877(iMin - iMax, c24321.f77065, false);
                        C11880 c11880 = c24321.m53670() ? null : new C11880(c11209M25877, c24321.f77065, iMax);
                        long jNanoTime = System.nanoTime();
                        Iterator it = list.iterator();
                        int i3 = 0;
                        loop0: while (true) {
                            if (!it.hasNext()) {
                                if (c11880 != null) {
                                    c11209M25877 = c11880.m27191();
                                }
                                C17913 c17913 = new C17913();
                                c11209M25877.getClass();
                                C19255 c19255 = new C19255();
                                c19255.m43866(c11209M25877);
                                while (c19255.m43871()) {
                                    C23120 c23120M43870 = c19255.m43870();
                                    c17913.m40720(c19255.m43865() - c19255.m43868(), new C23120(null, c23120M43870.m51561(), 0, c23120M43870.m51563(), 0, 0), false);
                                }
                                if (!m51838(this, interfaceC18588, j)) {
                                    c14757 = new C14757(iMax, c17913.m40719());
                                    break;
                                }
                                break;
                            }
                            C16572 c16572 = (C16572) it.next();
                            if (c24321.m53670()) {
                                int iMax2 = Math.max(iMax, c16572.f48664);
                                c24320 = c24321;
                                int iMin2 = Math.min(iMin, c16572.f48663);
                                if (iMax2 < iMin2) {
                                    int i4 = i3;
                                    C11209 c11209 = c16572.f48662;
                                    int i5 = c16572.f48664;
                                    c11209M25877 = c11209M25877.m25890(iMax2 - iMax, iMin2 - iMax, c11209.m25895(iMax2 - i5, iMin2 - i5));
                                    i3 = i4;
                                }
                            } else {
                                c24320 = c24321;
                                Iterator it2 = c16572.f48666.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C14561 c14561M27192 = c11880.m27192((C7856) it2.next());
                                        while (true) {
                                            i3++;
                                            if (i3 <= 65536 && ((i3 & 255) != 0 || (!m51838(this, interfaceC18588, j) && System.nanoTime() - jNanoTime <= 8000000))) {
                                                if (c14561M27192 == null || c14561M27192.m33291()) {
                                                    if (c14561M27192 != null) {
                                                        c11880.m27194(c14561M27192);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            c24321 = c24320;
                            iMin = iMin;
                            it = it;
                            c14757 = null;
                            break;
                        }
                    }
                    c14757 = null;
                    break;
                }
                c14757 = null;
                break;
                if (c14757 != null) {
                    this.f73244 = j;
                    C16748 c16748 = (C16748) this.f73243;
                    C18285.m41631(c16748.f49370, c16748.f49371, c14757);
                } else {
                    if (interfaceC18588.mo3924() || !this.f73240.m49921()) {
                        return;
                    }
                    synchronized (this.f73236) {
                        if (!this.f73239 && this.f73228 == j) {
                            this.f73233 = j;
                            this.f73245 = list;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m51838(C23279 c23279, InterfaceC18588 interfaceC18588, long j) {
        return c23279.f73239 || interfaceC18588.mo3924() || !c23279.f73240.m49921() || c23279.f73228 != j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16572 m51849(int i) {
        C16572 c16572 = null;
        if (this.f73239 || i < this.f73234) {
            return null;
        }
        synchronized (this.f73236) {
            int iMin = Integer.MAX_VALUE;
            for (RunnableC9867 runnableC9867 : this.f73236) {
                if (!runnableC9867.f27359) {
                    for (C16572 c16573 : runnableC9867.f27355) {
                        int i2 = c16573.f48664;
                        if (i2 == i) {
                            c16572 = c16573;
                        }
                        if (i2 > i) {
                            iMin = Math.min(iMin, i2);
                        }
                    }
                }
            }
            this.f73234 = iMin;
        }
        return c16572;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51850() {
        this.f73239 = true;
        synchronized (this.f73236) {
            Iterator it = this.f73236.iterator();
            while (it.hasNext()) {
                ((RunnableC9867) it.next()).m23144();
            }
            this.f73236.clear();
            this.f73238 = Collections.EMPTY_LIST;
            this.f73230 = -1;
            this.f73245 = null;
        }
        m51842();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m51842() {
        while (true) {
            C9729 c9729 = (C9729) this.f73232.poll();
            if (c9729 == null) {
                return;
            } else {
                try {
                    c9729.close();
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
