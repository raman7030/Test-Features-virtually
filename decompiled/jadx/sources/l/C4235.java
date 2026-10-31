package l;

import java.lang.ref.ReferenceQueue;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۘ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4235 extends ReentrantLock {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f13731;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f13732;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC14754 f13733;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14796 f13734;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ReferenceQueue f13735;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f13736;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile AtomicReferenceArray f13737;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f13738 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f13739;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f13740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ReferenceQueue f13741;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f13742;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f13743;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f13744;

    public C4235(ConcurrentMapC14754 concurrentMapC14754, int i, long j, InterfaceC14796 interfaceC14796) {
        Collection concurrentLinkedQueue;
        Collection c18283;
        Collection c20442;
        this.f13733 = concurrentMapC14754;
        this.f13732 = j;
        interfaceC14796.getClass();
        this.f13734 = interfaceC14796;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.f13744 = length;
        if (concurrentMapC14754.f45064 == EnumC16207.INSTANCE && length == j) {
            this.f13744 = length + 1;
        }
        this.f13737 = atomicReferenceArray;
        EnumC1412 enumC1412 = concurrentMapC14754.f45055;
        EnumC1412 enumC1413 = EnumC1412.f5081;
        this.f13741 = enumC1412 != enumC1413 ? new ReferenceQueue() : null;
        this.f13735 = concurrentMapC14754.f45068 != enumC1413 ? new ReferenceQueue() : null;
        if (!concurrentMapC14754.m35064() && !concurrentMapC14754.m35061()) {
            concurrentLinkedQueue = ConcurrentMapC14754.f45045;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f13736 = (AbstractQueue) concurrentLinkedQueue;
        if (!concurrentMapC14754.m35065()) {
            c18283 = ConcurrentMapC14754.f45045;
        } else {
            c18283 = new C18283();
        }
        this.f13731 = (AbstractQueue) c18283;
        if (!concurrentMapC14754.m35064() && !concurrentMapC14754.m35061()) {
            c20442 = ConcurrentMapC14754.f45045;
        } else {
            c20442 = new C20442();
        }
        this.f13742 = (AbstractQueue) c20442;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 m12741(InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928) {
        Object key = interfaceC23927.getKey();
        if (key == null) {
            return null;
        }
        InterfaceC3529 interfaceC3529Mo17644 = interfaceC23927.mo17644();
        Object obj = interfaceC3529Mo17644.get();
        if (obj == null && interfaceC3529Mo17644.mo10725()) {
            return null;
        }
        InterfaceC23927 interfaceC23927Mo10704 = this.f13733.f45063.mo10704(this, interfaceC23927, interfaceC23928, key);
        interfaceC23927Mo10704.mo17636(interfaceC3529Mo17644.mo6743(this.f13735, obj, interfaceC23927Mo10704));
        return interfaceC23927Mo10704;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12748(InterfaceC23927 interfaceC23927, Object obj, Object obj2, long j) {
        InterfaceC3529 interfaceC3529Mo17644 = interfaceC23927.mo17644();
        ConcurrentMapC14754 concurrentMapC14754 = this.f13733;
        int iMo25073 = concurrentMapC14754.f45064.mo25073(obj, obj2);
        C4025.m12115("Weights must be non-negative", iMo25073 >= 0);
        interfaceC23927.mo17636(concurrentMapC14754.f45068.mo2793(this, interfaceC23927, obj2, iMo25073));
        m12743();
        this.f13740 += (long) iMo25073;
        if (concurrentMapC14754.m35064()) {
            interfaceC23927.mo17635(j);
        }
        if (concurrentMapC14754.m35065() || concurrentMapC14754.f45058 > 0) {
            interfaceC23927.mo17642(j);
        }
        this.f13742.add(interfaceC23927);
        this.f13731.add(interfaceC23927);
        interfaceC3529Mo17644.mo10723(obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12735(Object obj, int i, AbstractC19031 abstractC19031) {
        C23990 c23990;
        InterfaceC3529 interfaceC3529Mo17644;
        Object objM12736;
        lock();
        try {
            long jMo39766 = this.f13733.f45061.mo39766();
            m12752(jMo39766);
            boolean z = true;
            int i2 = this.f13743 - 1;
            AtomicReferenceArray atomicReferenceArray = this.f13737;
            int length = (atomicReferenceArray.length() - 1) & i;
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            InterfaceC23927 interfaceC23927Mo10703 = interfaceC23927;
            while (true) {
                c23990 = null;
                if (interfaceC23927Mo10703 == null) {
                    interfaceC3529Mo17644 = null;
                    break;
                }
                Object key = interfaceC23927Mo10703.getKey();
                if (interfaceC23927Mo10703.getHash() != i || key == null || !this.f13733.f45053.m27496(obj, key)) {
                    interfaceC23927Mo10703 = interfaceC23927Mo10703.getNext();
                } else {
                    interfaceC3529Mo17644 = interfaceC23927Mo10703.mo17644();
                    if (!interfaceC3529Mo17644.mo10724()) {
                        Object obj2 = interfaceC3529Mo17644.get();
                        if (obj2 == null) {
                            m12746(key, obj2, interfaceC3529Mo17644.mo6744(), EnumC2761.f8579);
                        } else if (this.f13733.m35062(interfaceC23927Mo10703, jMo39766)) {
                            m12746(key, obj2, interfaceC3529Mo17644.mo6744(), EnumC2761.f8577);
                        } else {
                            m12754(interfaceC23927Mo10703, jMo39766);
                            this.f13734.mo19007();
                            unlock();
                            m12758();
                            return obj2;
                        }
                        this.f13731.remove(interfaceC23927Mo10703);
                        this.f13742.remove(interfaceC23927Mo10703);
                        this.f13743 = i2;
                        break;
                    }
                    z = false;
                    break;
                }
            }
            if (z) {
                c23990 = new C23990();
                if (interfaceC23927Mo10703 == null) {
                    EnumC14090 enumC14090 = this.f13733.f45063;
                    obj.getClass();
                    interfaceC23927Mo10703 = enumC14090.mo10703(this, obj, i, interfaceC23927);
                    interfaceC23927Mo10703.mo17636(c23990);
                    atomicReferenceArray.set(length, interfaceC23927Mo10703);
                } else {
                    interfaceC23927Mo10703.mo17636(c23990);
                }
            }
            unlock();
            m12758();
            if (z) {
                try {
                    synchronized (interfaceC23927Mo10703) {
                        objM12736 = m12736(obj, i, c23990, c23990.m52831(obj, abstractC19031));
                    }
                    this.f13734.mo19003();
                    return objM12736;
                } catch (Throwable th) {
                    this.f13734.mo19003();
                    throw th;
                }
            }
            return m12739(interfaceC23927Mo10703, obj, interfaceC3529Mo17644);
        } catch (Throwable th2) {
            unlock();
            m12758();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12739(InterfaceC23927 interfaceC23927, Object obj, InterfaceC3529 interfaceC3529) {
        InterfaceC14796 interfaceC14796 = this.f13734;
        if (!interfaceC3529.mo10724()) {
            throw new AssertionError();
        }
        C4025.m12114(obj, "Recursive load of: %s", !Thread.holdsLock(interfaceC23927));
        try {
            Object objMo10726 = interfaceC3529.mo10726();
            if (objMo10726 == null) {
                throw new C4214("CacheLoader returned null for key " + obj + ".");
            }
            m12757(interfaceC23927, this.f13733.f45061.mo39766());
            interfaceC14796.mo19003();
            return objMo10726;
        } catch (Throwable th) {
            interfaceC14796.mo19003();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12736(Object obj, int i, C23990 c23990, InterfaceFutureC3277 interfaceFutureC3277) throws Throwable {
        Object objM28740;
        InterfaceC14796 interfaceC14796 = this.f13734;
        try {
            objM28740 = C11744.m28740(interfaceFutureC3277);
            try {
                if (objM28740 == null) {
                    throw new C4214("CacheLoader returned null for key " + obj + ".");
                }
                C12491 c12491 = c23990.f77775;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                interfaceC14796.mo19006(c12491.m30656());
                m12745(obj, i, c23990, objM28740);
                return objM28740;
            } catch (Throwable th) {
                th = th;
                if (objM28740 == null) {
                    C12491 c12492 = c23990.f77775;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    interfaceC14796.mo19004(c12492.m30656());
                    lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = this.f13737;
                        int length = (atomicReferenceArray.length() - 1) & i;
                        InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
                        for (InterfaceC23927 next = interfaceC23927; next != null; next = next.getNext()) {
                            Object key = next.getKey();
                            if (next.getHash() == i && key != null && this.f13733.f45053.m27496(obj, key)) {
                                if (next.mo17644() != c23990) {
                                    break;
                                }
                                if (c23990.f77777.mo10725()) {
                                    next.mo17636(c23990.f77777);
                                    break;
                                }
                                atomicReferenceArray.set(length, m12750(interfaceC23927, next));
                                break;
                            }
                        }
                    } finally {
                        unlock();
                        m12758();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            objM28740 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12738(InterfaceC23927 interfaceC23927, final Object obj, final int i, Object obj2, long j, AbstractC19031 abstractC19031) {
        Object objM28740;
        C23990 c23990;
        final C23990 c23991;
        if (this.f13733.f45058 > 0 && j - interfaceC23927.mo17639() > this.f13733.f45058 && !interfaceC23927.mo17644().mo10724()) {
            lock();
            try {
                long jMo39766 = this.f13733.f45061.mo39766();
                m12752(jMo39766);
                AtomicReferenceArray atomicReferenceArray = this.f13737;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC23927 interfaceC23928 = (InterfaceC23927) atomicReferenceArray.get(length);
                InterfaceC23927 next = interfaceC23928;
                while (true) {
                    objM28740 = null;
                    if (next != null) {
                        Object key = next.getKey();
                        if (next.getHash() != i || key == null || !this.f13733.f45053.m27496(obj, key)) {
                            next = next.getNext();
                        } else {
                            InterfaceC3529 interfaceC3529Mo17644 = next.mo17644();
                            if (!interfaceC3529Mo17644.mo10724() && jMo39766 - next.mo17639() >= this.f13733.f45058) {
                                this.f13739++;
                                c23990 = new C23990(interfaceC3529Mo17644);
                                next.mo17636(c23990);
                            } else {
                                unlock();
                                m12758();
                                c23991 = null;
                                break;
                            }
                        }
                    } else {
                        this.f13739++;
                        c23990 = new C23990();
                        EnumC14090 enumC14090 = this.f13733.f45063;
                        obj.getClass();
                        InterfaceC23927 interfaceC23927Mo10703 = enumC14090.mo10703(this, obj, i, interfaceC23928);
                        interfaceC23927Mo10703.mo17636(c23990);
                        atomicReferenceArray.set(length, interfaceC23927Mo10703);
                    }
                    unlock();
                    m12758();
                    c23991 = c23990;
                    break;
                }
                if (c23991 != null) {
                    final InterfaceFutureC3277 interfaceFutureC3277M52831 = c23991.m52831(obj, abstractC19031);
                    interfaceFutureC3277M52831.mo10080(new Runnable() { // from class: l.ۖ᩹ܺ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4235 c4235 = this.f9042;
                            Object obj3 = obj;
                            int i2 = i;
                            C23990 c23992 = c23991;
                            try {
                                c4235.m12736(obj3, i2, c23992, interfaceFutureC3277M52831);
                            } catch (Throwable th) {
                                ConcurrentMapC14754.f45046.log(Level.WARNING, "Exception thrown during refresh", th);
                                c23992.f77776.mo26127(th);
                            }
                        }
                    }, C12449.m30605());
                    if (interfaceFutureC3277M52831.isDone()) {
                        try {
                            objM28740 = C11744.m28740(interfaceFutureC3277M52831);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (objM28740 != null) {
                    return objM28740;
                }
            } catch (Throwable th) {
                unlock();
                m12758();
                throw th;
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m12755() {
        if (tryLock()) {
            try {
                m12751();
            } finally {
                unlock();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0112 A[EDGE_INSN: B:47:0x0112->B:48:0x0115 BREAK  A[LOOP:3: B:26:0x00b6->B:41:0x0102]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12751() {
        int i = 0;
        if (this.f13733.f45055 != EnumC1412.f5081) {
            int i2 = 0;
            do {
                Object objPoll = this.f13741.poll();
                if (objPoll == null) {
                    break;
                }
                InterfaceC23927 interfaceC23927 = (InterfaceC23927) objPoll;
                ConcurrentMapC14754 concurrentMapC14754 = this.f13733;
                concurrentMapC14754.getClass();
                int hash = interfaceC23927.getHash();
                C4235 c4235M35063 = concurrentMapC14754.m35063(hash);
                c4235M35063.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = c4235M35063.f13737;
                    int length = hash & (atomicReferenceArray.length() - 1);
                    InterfaceC23927 interfaceC23928 = (InterfaceC23927) atomicReferenceArray.get(length);
                    for (InterfaceC23927 next = interfaceC23928; next != null; next = next.getNext()) {
                        if (next == interfaceC23927) {
                            c4235M35063.f13739++;
                            InterfaceC23927 interfaceC23927M12742 = c4235M35063.m12742(interfaceC23928, next, next.getKey(), next.mo17644().get(), next.mo17644(), EnumC2761.f8579);
                            int i3 = c4235M35063.f13743 - 1;
                            atomicReferenceArray.set(length, interfaceC23927M12742);
                            c4235M35063.f13743 = i3;
                            break;
                        }
                    }
                    c4235M35063.unlock();
                    c4235M35063.m12758();
                    i2++;
                } catch (Throwable th) {
                    c4235M35063.unlock();
                    c4235M35063.m12758();
                    throw th;
                }
            } while (i2 != 16);
        }
        if (this.f13733.f45068 != EnumC1412.f5081) {
            do {
                Object objPoll2 = this.f13735.poll();
                if (objPoll2 == null) {
                    return;
                }
                InterfaceC3529 interfaceC3529 = (InterfaceC3529) objPoll2;
                ConcurrentMapC14754 concurrentMapC14755 = this.f13733;
                concurrentMapC14755.getClass();
                InterfaceC23927 entry = interfaceC3529.getEntry();
                int hash2 = entry.getHash();
                C4235 c4235M35064 = concurrentMapC14755.m35063(hash2);
                Object key = entry.getKey();
                c4235M35064.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray2 = c4235M35064.f13737;
                    int length2 = hash2 & (atomicReferenceArray2.length() - 1);
                    InterfaceC23927 interfaceC23929 = (InterfaceC23927) atomicReferenceArray2.get(length2);
                    InterfaceC23927 next2 = interfaceC23929;
                    while (true) {
                        if (next2 == null) {
                            c4235M35064.unlock();
                            if (!c4235M35064.isHeldByCurrentThread()) {
                                c4235M35064.m12758();
                                break;
                            }
                            break;
                        }
                        Object key2 = next2.getKey();
                        if (next2.getHash() == hash2 && key2 != null && c4235M35064.f13733.f45053.m27496(key, key2)) {
                            if (next2.mo17644() != interfaceC3529) {
                                c4235M35064.unlock();
                                if (!c4235M35064.isHeldByCurrentThread()) {
                                    c4235M35064.m12758();
                                    break;
                                }
                                break;
                            }
                            c4235M35064.f13739++;
                            InterfaceC23927 interfaceC23927M12743 = c4235M35064.m12742(interfaceC23929, next2, key2, interfaceC3529.get(), interfaceC3529, EnumC2761.f8579);
                            int i4 = c4235M35064.f13743 - 1;
                            atomicReferenceArray2.set(length2, interfaceC23927M12743);
                            c4235M35064.f13743 = i4;
                            c4235M35064.unlock();
                            if (!c4235M35064.isHeldByCurrentThread()) {
                                c4235M35064.m12758();
                                break;
                            }
                            break;
                        }
                        next2 = next2.getNext();
                    }
                    i++;
                } catch (Throwable th2) {
                    c4235M35064.unlock();
                    if (!c4235M35064.isHeldByCurrentThread()) {
                        c4235M35064.m12758();
                    }
                    throw th2;
                }
            } while (i != 16);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12757(InterfaceC23927 interfaceC23927, long j) {
        if (this.f13733.m35064()) {
            interfaceC23927.mo17635(j);
        }
        this.f13736.add(interfaceC23927);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12754(InterfaceC23927 interfaceC23927, long j) {
        if (this.f13733.m35064()) {
            interfaceC23927.mo17635(j);
        }
        this.f13742.add(interfaceC23927);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12743() {
        while (true) {
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) this.f13736.poll();
            if (interfaceC23927 == null) {
                return;
            }
            AbstractQueue abstractQueue = this.f13742;
            if (abstractQueue.contains(interfaceC23927)) {
                abstractQueue.add(interfaceC23927);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12744(long j) {
        InterfaceC23927 interfaceC23927;
        InterfaceC23927 interfaceC23928;
        m12743();
        do {
            interfaceC23927 = (InterfaceC23927) this.f13731.peek();
            ConcurrentMapC14754 concurrentMapC14754 = this.f13733;
            if (interfaceC23927 == null || !concurrentMapC14754.m35062(interfaceC23927, j)) {
                do {
                    interfaceC23928 = (InterfaceC23927) this.f13742.peek();
                    if (interfaceC23928 == null || !concurrentMapC14754.m35062(interfaceC23928, j)) {
                        return;
                    }
                } while (m12749(interfaceC23928, interfaceC23928.getHash(), EnumC2761.f8577));
                throw new AssertionError();
            }
        } while (m12749(interfaceC23927, interfaceC23927.getHash(), EnumC2761.f8577));
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12746(Object obj, Object obj2, int i, EnumC2761 enumC2761) {
        this.f13740 -= (long) i;
        if (enumC2761.mo8522()) {
            this.f13734.mo19005();
        }
        ConcurrentMapC14754 concurrentMapC14754 = this.f13733;
        if (concurrentMapC14754.f45047 != ConcurrentMapC14754.f45045) {
            concurrentMapC14754.f45047.offer(new C18989(obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12747(InterfaceC23927 interfaceC23927) {
        InterfaceC23927 interfaceC23928;
        if (this.f13733.m35061()) {
            m12743();
            long jMo6744 = interfaceC23927.mo17644().mo6744();
            long j = this.f13732;
            if (jMo6744 > j && !m12749(interfaceC23927, interfaceC23927.getHash(), EnumC2761.f8576)) {
                throw new AssertionError();
            }
            while (this.f13740 > j) {
                Iterator it = this.f13742.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new AssertionError();
                    }
                    interfaceC23928 = (InterfaceC23927) it.next();
                } while (interfaceC23928.mo17644().mo6744() <= 0);
                if (!m12749(interfaceC23928, interfaceC23928.getHash(), EnumC2761.f8576)) {
                    throw new AssertionError();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 m12740(int i, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.f13737;
        for (InterfaceC23927 next = (InterfaceC23927) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); next != null; next = next.getNext()) {
            if (next.getHash() == i) {
                Object key = next.getKey();
                if (key == null) {
                    m12755();
                } else if (this.f13733.f45053.m27496(obj, key)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12737(InterfaceC23927 interfaceC23927, long j) {
        if (interfaceC23927.getKey() == null) {
            m12755();
            return null;
        }
        Object obj = interfaceC23927.mo17644().get();
        if (obj == null) {
            m12755();
            return null;
        }
        if (!this.f13733.m35062(interfaceC23927, j)) {
            return obj;
        }
        if (!tryLock()) {
            return null;
        }
        try {
            m12744(j);
            return null;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12734(Object obj, int i, Object obj2, boolean z) {
        int i2;
        lock();
        try {
            long jMo39766 = this.f13733.f45061.mo39766();
            m12752(jMo39766);
            if (this.f13743 + 1 > this.f13744) {
                m12756();
            }
            AtomicReferenceArray atomicReferenceArray = this.f13737;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            for (InterfaceC23927 next = interfaceC23927; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i && key != null && this.f13733.f45053.m27496(obj, key)) {
                    InterfaceC3529 interfaceC3529Mo17644 = next.mo17644();
                    Object obj3 = interfaceC3529Mo17644.get();
                    if (obj3 != null) {
                        if (z) {
                            m12754(next, jMo39766);
                        } else {
                            this.f13739++;
                            m12746(obj, obj3, interfaceC3529Mo17644.mo6744(), EnumC2761.f8574);
                            m12748(next, obj, obj2, jMo39766);
                            m12747(next);
                        }
                        return obj3;
                    }
                    this.f13739++;
                    if (interfaceC3529Mo17644.mo10725()) {
                        m12746(obj, obj3, interfaceC3529Mo17644.mo6744(), EnumC2761.f8579);
                        m12748(next, obj, obj2, jMo39766);
                        i2 = this.f13743;
                    } else {
                        m12748(next, obj, obj2, jMo39766);
                        i2 = this.f13743 + 1;
                    }
                    this.f13743 = i2;
                    m12747(next);
                    return null;
                }
            }
            this.f13739++;
            InterfaceC23927 interfaceC23927Mo10703 = this.f13733.f45063.mo10703(this, obj, i, interfaceC23927);
            m12748(interfaceC23927Mo10703, obj, obj2, jMo39766);
            atomicReferenceArray.set(length, interfaceC23927Mo10703);
            this.f13743++;
            m12747(interfaceC23927Mo10703);
            return null;
        } finally {
            unlock();
            m12758();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12756() {
        AtomicReferenceArray atomicReferenceArray = this.f13737;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.f13743;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f13744 = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC23927 next = (InterfaceC23927) atomicReferenceArray.get(i2);
            if (next != null) {
                InterfaceC23927 next2 = next.getNext();
                int hash = next.getHash() & length2;
                if (next2 == null) {
                    atomicReferenceArray2.set(hash, next);
                } else {
                    InterfaceC23927 interfaceC23927 = next;
                    while (next2 != null) {
                        int hash2 = next2.getHash() & length2;
                        if (hash2 != hash) {
                            interfaceC23927 = next2;
                            hash = hash2;
                        }
                        next2 = next2.getNext();
                    }
                    atomicReferenceArray2.set(hash, interfaceC23927);
                    while (next != interfaceC23927) {
                        int hash3 = next.getHash() & length2;
                        InterfaceC23927 interfaceC23927M12741 = m12741(next, (InterfaceC23927) atomicReferenceArray2.get(hash3));
                        if (interfaceC23927M12741 != null) {
                            atomicReferenceArray2.set(hash3, interfaceC23927M12741);
                        } else {
                            m12753(next);
                            i--;
                        }
                        next = next.getNext();
                    }
                }
            }
        }
        this.f13737 = atomicReferenceArray2;
        this.f13743 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12745(Object obj, int i, C23990 c23990, Object obj2) {
        lock();
        try {
            long jMo39766 = this.f13733.f45061.mo39766();
            m12752(jMo39766);
            int i2 = this.f13743 + 1;
            if (i2 > this.f13744) {
                m12756();
                i2 = this.f13743 + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f13737;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(length);
            for (InterfaceC23927 next = interfaceC23927; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i && key != null && this.f13733.f45053.m27496(obj, key)) {
                    InterfaceC3529 interfaceC3529Mo17644 = next.mo17644();
                    Object obj3 = interfaceC3529Mo17644.get();
                    if (c23990 == interfaceC3529Mo17644 || (obj3 == null && interfaceC3529Mo17644 != ConcurrentMapC14754.f45044)) {
                        this.f13739++;
                        if (c23990.f77777.mo10725()) {
                            m12746(obj, obj3, c23990.f77777.mo6744(), obj3 == null ? EnumC2761.f8579 : EnumC2761.f8574);
                            i2--;
                        }
                        m12748(next, obj, obj2, jMo39766);
                        this.f13743 = i2;
                        m12747(next);
                    } else {
                        m12746(obj, obj2, 0, EnumC2761.f8574);
                    }
                }
            }
            this.f13739++;
            EnumC14090 enumC14090 = this.f13733.f45063;
            obj.getClass();
            InterfaceC23927 interfaceC23927Mo10703 = enumC14090.mo10703(this, obj, i, interfaceC23927);
            m12748(interfaceC23927Mo10703, obj, obj2, jMo39766);
            atomicReferenceArray.set(length, interfaceC23927Mo10703);
            this.f13743 = i2;
            m12747(interfaceC23927Mo10703);
        } finally {
            unlock();
            m12758();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 m12742(InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928, Object obj, Object obj2, InterfaceC3529 interfaceC3529, EnumC2761 enumC2761) {
        m12746(obj, obj2, interfaceC3529.mo6744(), enumC2761);
        this.f13731.remove(interfaceC23928);
        this.f13742.remove(interfaceC23928);
        if (interfaceC3529.mo10724()) {
            interfaceC3529.mo10723(null);
            return interfaceC23927;
        }
        return m12750(interfaceC23927, interfaceC23928);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 m12750(InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928) {
        int i = this.f13743;
        InterfaceC23927 next = interfaceC23928.getNext();
        while (interfaceC23927 != interfaceC23928) {
            InterfaceC23927 interfaceC23927M12741 = m12741(interfaceC23927, next);
            if (interfaceC23927M12741 != null) {
                next = interfaceC23927M12741;
            } else {
                m12753(interfaceC23927);
                i--;
            }
            interfaceC23927 = interfaceC23927.getNext();
        }
        this.f13743 = i;
        return next;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12753(InterfaceC23927 interfaceC23927) {
        Object key = interfaceC23927.getKey();
        interfaceC23927.getHash();
        m12746(key, interfaceC23927.mo17644().get(), interfaceC23927.mo17644().mo6744(), EnumC2761.f8579);
        this.f13731.remove(interfaceC23927);
        this.f13742.remove(interfaceC23927);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12749(InterfaceC23927 interfaceC23927, int i, EnumC2761 enumC2761) {
        AtomicReferenceArray atomicReferenceArray = this.f13737;
        int length = i & (atomicReferenceArray.length() - 1);
        InterfaceC23927 interfaceC23928 = (InterfaceC23927) atomicReferenceArray.get(length);
        for (InterfaceC23927 next = interfaceC23928; next != null; next = next.getNext()) {
            if (next == interfaceC23927) {
                this.f13739++;
                InterfaceC23927 interfaceC23927M12742 = m12742(interfaceC23928, next, next.getKey(), next.mo17644().get(), next.mo17644(), enumC2761);
                int i2 = this.f13743 - 1;
                atomicReferenceArray.set(length, interfaceC23927M12742);
                this.f13743 = i2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m12759() {
        if ((this.f13738.incrementAndGet() & 63) == 0) {
            m12752(this.f13733.f45061.mo39766());
            m12758();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12752(long j) {
        if (tryLock()) {
            try {
                m12751();
                m12744(j);
                this.f13738.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m12758() {
        if (isHeldByCurrentThread()) {
            return;
        }
        while (true) {
            ConcurrentMapC14754 concurrentMapC14754 = this.f13733;
            C18989 c18989 = (C18989) concurrentMapC14754.f45047.poll();
            if (c18989 == null) {
                return;
            }
            try {
                concurrentMapC14754.f45052.mo12612(c18989);
            } catch (Throwable th) {
                ConcurrentMapC14754.f45046.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }
}
