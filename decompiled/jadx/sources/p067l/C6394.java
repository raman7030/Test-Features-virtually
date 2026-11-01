package p067l;

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
public final class C6394 extends ReentrantLock {

    /* JADX INFO: renamed from: ֫֫ */
    public final AbstractQueue f16544;

    /* JADX INFO: renamed from: ۗ */
    public final long f16545;

    /* JADX INFO: renamed from: ۙ */
    public final ConcurrentMapC16391 f16546;

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC16431 f16547;

    /* JADX INFO: renamed from: ۟ */
    public final ReferenceQueue f16548;

    /* JADX INFO: renamed from: ۤ */
    public final AbstractQueue f16549;

    /* JADX INFO: renamed from: ۨ */
    public volatile AtomicReferenceArray f16550;

    /* JADX INFO: renamed from: ۫ */
    public final AtomicInteger f16551 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬ */
    public int f16552;

    /* JADX INFO: renamed from: ܰ */
    public long f16553;

    /* JADX INFO: renamed from: ᩶ */
    public final ReferenceQueue f16554;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractQueue f16555;

    /* JADX INFO: renamed from: ᩹ */
    public volatile int f16556;

    /* JADX INFO: renamed from: ᩺ */
    public int f16557;

    public C6394(ConcurrentMapC16391 concurrentMapC16391, int i, long j, InterfaceC16431 interfaceC16431) {
        Collection concurrentLinkedQueue;
        Collection c19745;
        Collection c21797;
        this.f16546 = concurrentMapC16391;
        this.f16545 = j;
        interfaceC16431.getClass();
        this.f16547 = interfaceC16431;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.f16557 = length;
        if (concurrentMapC16391.f48177 == EnumC17772.INSTANCE && length == j) {
            this.f16557 = length + 1;
        }
        this.f16550 = atomicReferenceArray;
        EnumC3711 enumC3711 = concurrentMapC16391.f48168;
        EnumC3711 enumC3712 = EnumC3711.f7852;
        this.f16554 = enumC3711 != enumC3712 ? new ReferenceQueue() : null;
        this.f16548 = concurrentMapC16391.f48181 != enumC3712 ? new ReferenceQueue() : null;
        if (!concurrentMapC16391.m37211() && !concurrentMapC16391.m37208()) {
            concurrentLinkedQueue = ConcurrentMapC16391.f48158;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f16549 = (AbstractQueue) concurrentLinkedQueue;
        if (!concurrentMapC16391.m37212()) {
            c19745 = ConcurrentMapC16391.f48158;
        } else {
            c19745 = new C19745();
        }
        this.f16544 = (AbstractQueue) c19745;
        if (!concurrentMapC16391.m37211() && !concurrentMapC16391.m37208()) {
            c21797 = ConcurrentMapC16391.f48158;
        } else {
            c21797 = new C21797();
        }
        this.f16555 = (AbstractQueue) c21797;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC25109 m14617(InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010) {
        Object key = interfaceC25109.getKey();
        if (key == null) {
            return null;
        }
        InterfaceC5723 interfaceC5723Mo19584 = interfaceC25109.mo19584();
        Object obj = interfaceC5723Mo19584.get();
        if (obj == null && interfaceC5723Mo19584.mo12721()) {
            return null;
        }
        InterfaceC25109 interfaceC25109Mo12699 = this.f16546.f48176.mo12699(this, interfaceC25109, interfaceC251010, key);
        interfaceC25109Mo12699.mo19576(interfaceC5723Mo19584.mo8869(this.f16548, obj, interfaceC25109Mo12699));
        return interfaceC25109Mo12699;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14624(InterfaceC25109 interfaceC25109, Object obj, Object obj2, long j) {
        InterfaceC5723 interfaceC5723Mo19584 = interfaceC25109.mo19584();
        ConcurrentMapC16391 concurrentMapC16391 = this.f16546;
        int iMo27090 = concurrentMapC16391.f48177.mo27090(obj, obj2);
        C6194.m14035("Weights must be non-negative", iMo27090 >= 0);
        interfaceC25109.mo19576(concurrentMapC16391.f48181.mo5138(this, interfaceC25109, obj2, iMo27090));
        m14619();
        this.f16553 += (long) iMo27090;
        if (concurrentMapC16391.m37211()) {
            interfaceC25109.mo19575(j);
        }
        if (concurrentMapC16391.m37212() || concurrentMapC16391.f48171 > 0) {
            interfaceC25109.mo19582(j);
        }
        this.f16555.add(interfaceC25109);
        this.f16544.add(interfaceC25109);
        interfaceC5723Mo19584.mo12719(obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m14611(Object obj, int i, AbstractC20456 abstractC20456) {
        C25169 c25169;
        InterfaceC5723 interfaceC5723Mo19584;
        Object objM14612;
        lock();
        try {
            long jMo42007 = this.f16546.f48174.mo42007();
            m14628(jMo42007);
            boolean z = true;
            int i2 = this.f16556 - 1;
            AtomicReferenceArray atomicReferenceArray = this.f16550;
            int length = (atomicReferenceArray.length() - 1) & i;
            InterfaceC25109 interfaceC25109 = (InterfaceC25109) atomicReferenceArray.get(length);
            InterfaceC25109 interfaceC25109Mo12698 = interfaceC25109;
            while (true) {
                c25169 = null;
                if (interfaceC25109Mo12698 == null) {
                    interfaceC5723Mo19584 = null;
                    break;
                }
                Object key = interfaceC25109Mo12698.getKey();
                if (interfaceC25109Mo12698.getHash() != i || key == null || !this.f16546.f48166.m29558(obj, key)) {
                    interfaceC25109Mo12698 = interfaceC25109Mo12698.getNext();
                } else {
                    interfaceC5723Mo19584 = interfaceC25109Mo12698.mo19584();
                    if (!interfaceC5723Mo19584.mo12720()) {
                        Object obj2 = interfaceC5723Mo19584.get();
                        if (obj2 == null) {
                            m14622(key, obj2, interfaceC5723Mo19584.mo8870(), EnumC4993.f11373);
                        } else if (this.f16546.m37209(interfaceC25109Mo12698, jMo42007)) {
                            m14622(key, obj2, interfaceC5723Mo19584.mo8870(), EnumC4993.f11371);
                        } else {
                            m14630(interfaceC25109Mo12698, jMo42007);
                            this.f16547.mo20964();
                            unlock();
                            m14634();
                            return obj2;
                        }
                        this.f16544.remove(interfaceC25109Mo12698);
                        this.f16555.remove(interfaceC25109Mo12698);
                        this.f16556 = i2;
                        break;
                    }
                    z = false;
                    break;
                }
            }
            if (z) {
                c25169 = new C25169();
                if (interfaceC25109Mo12698 == null) {
                    EnumC15760 enumC15760 = this.f16546.f48176;
                    obj.getClass();
                    interfaceC25109Mo12698 = enumC15760.mo12698(this, obj, i, interfaceC25109);
                    interfaceC25109Mo12698.mo19576(c25169);
                    atomicReferenceArray.set(length, interfaceC25109Mo12698);
                } else {
                    interfaceC25109Mo12698.mo19576(c25169);
                }
            }
            unlock();
            m14634();
            if (z) {
                try {
                    synchronized (interfaceC25109Mo12698) {
                        objM14612 = m14612(obj, i, c25169, c25169.m55237(obj, abstractC20456));
                    }
                    this.f16547.mo20960();
                    return objM14612;
                } catch (Throwable th) {
                    this.f16547.mo20960();
                    throw th;
                }
            }
            return m14615(interfaceC25109Mo12698, obj, interfaceC5723Mo19584);
        } catch (Throwable th2) {
            unlock();
            m14634();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m14615(InterfaceC25109 interfaceC25109, Object obj, InterfaceC5723 interfaceC5723) {
        InterfaceC16431 interfaceC16431 = this.f16547;
        if (!interfaceC5723.mo12720()) {
            throw new AssertionError();
        }
        C6194.m14034(obj, "Recursive load of: %s", !Thread.holdsLock(interfaceC25109));
        try {
            Object objMo12722 = interfaceC5723.mo12722();
            if (objMo12722 == null) {
                throw new C6374("CacheLoader returned null for key " + obj + ".");
            }
            m14633(interfaceC25109, this.f16546.f48174.mo42007());
            interfaceC16431.mo20960();
            return objMo12722;
        } catch (Throwable th) {
            interfaceC16431.mo20960();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m14612(Object obj, int i, C25169 c25169, InterfaceFutureC5483 interfaceFutureC5483) throws Throwable {
        Object objM30788;
        InterfaceC16431 interfaceC16431 = this.f16547;
        try {
            objM30788 = C13530.m30788(interfaceFutureC5483);
            try {
                if (objM30788 == null) {
                    throw new C6374("CacheLoader returned null for key " + obj + ".");
                }
                C14240 c14240 = c25169.f80526;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                interfaceC16431.mo20963(c14240.m32721());
                m14621(obj, i, c25169, objM30788);
                return objM30788;
            } catch (Throwable th) {
                th = th;
                if (objM30788 == null) {
                    C14240 c14241 = c25169.f80526;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    interfaceC16431.mo20961(c14241.m32721());
                    lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = this.f16550;
                        int length = (atomicReferenceArray.length() - 1) & i;
                        InterfaceC25109 interfaceC25109 = (InterfaceC25109) atomicReferenceArray.get(length);
                        for (InterfaceC25109 next = interfaceC25109; next != null; next = next.getNext()) {
                            Object key = next.getKey();
                            if (next.getHash() == i && key != null && this.f16546.f48166.m29558(obj, key)) {
                                if (next.mo19584() != c25169) {
                                    break;
                                }
                                if (c25169.f80528.mo12721()) {
                                    next.mo19576(c25169.f80528);
                                    break;
                                }
                                atomicReferenceArray.set(length, m14626(interfaceC25109, next));
                                break;
                            }
                        }
                    } finally {
                        unlock();
                        m14634();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            objM30788 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m14614(InterfaceC25109 interfaceC25109, final Object obj, final int i, Object obj2, long j, AbstractC20456 abstractC20456) {
        Object objM30788;
        C25169 c25169;
        final C25169 c251610;
        if (this.f16546.f48171 > 0 && j - interfaceC25109.mo19579() > this.f16546.f48171 && !interfaceC25109.mo19584().mo12720()) {
            lock();
            try {
                long jMo42007 = this.f16546.f48174.mo42007();
                m14628(jMo42007);
                AtomicReferenceArray atomicReferenceArray = this.f16550;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC25109 interfaceC251010 = (InterfaceC25109) atomicReferenceArray.get(length);
                InterfaceC25109 next = interfaceC251010;
                while (true) {
                    objM30788 = null;
                    if (next != null) {
                        Object key = next.getKey();
                        if (next.getHash() != i || key == null || !this.f16546.f48166.m29558(obj, key)) {
                            next = next.getNext();
                        } else {
                            InterfaceC5723 interfaceC5723Mo19584 = next.mo19584();
                            if (!interfaceC5723Mo19584.mo12720() && jMo42007 - next.mo19579() >= this.f16546.f48171) {
                                this.f16552++;
                                c25169 = new C25169(interfaceC5723Mo19584);
                                next.mo19576(c25169);
                            } else {
                                unlock();
                                m14634();
                                c251610 = null;
                                break;
                            }
                        }
                    } else {
                        this.f16552++;
                        c25169 = new C25169();
                        EnumC15760 enumC15760 = this.f16546.f48176;
                        obj.getClass();
                        InterfaceC25109 interfaceC25109Mo12698 = enumC15760.mo12698(this, obj, i, interfaceC251010);
                        interfaceC25109Mo12698.mo19576(c25169);
                        atomicReferenceArray.set(length, interfaceC25109Mo12698);
                    }
                    unlock();
                    m14634();
                    c251610 = c25169;
                    break;
                }
                if (c251610 != null) {
                    final InterfaceFutureC5483 interfaceFutureC5483M55237 = c251610.m55237(obj, abstractC20456);
                    interfaceFutureC5483M55237.mo12113(new Runnable() { // from class: l.ۖ᩹ܺ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6394 c6394 = this.f11836;
                            Object obj3 = obj;
                            int i2 = i;
                            C25169 c251611 = c251610;
                            try {
                                c6394.m14612(obj3, i2, c251611, interfaceFutureC5483M55237);
                            } catch (Throwable th) {
                                ConcurrentMapC16391.f48159.log(Level.WARNING, "Exception thrown during refresh", th);
                                c251611.f80527.mo28152(th);
                            }
                        }
                    }, C14200.m32670());
                    if (interfaceFutureC5483M55237.isDone()) {
                        try {
                            objM30788 = C13530.m30788(interfaceFutureC5483M55237);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (objM30788 != null) {
                    return objM30788;
                }
            } catch (Throwable th) {
                unlock();
                m14634();
                throw th;
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m14631() {
        if (tryLock()) {
            try {
                m14627();
            } finally {
                unlock();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0112 A[EDGE_INSN: B:47:0x0112->B:48:0x0115 BREAK  A[LOOP:3: B:26:0x00b6->B:41:0x0102]] */
    /* JADX INFO: renamed from: ۧ */
    public final void m14627() {
        int i = 0;
        if (this.f16546.f48168 != EnumC3711.f7852) {
            int i2 = 0;
            do {
                Object objPoll = this.f16554.poll();
                if (objPoll == null) {
                    break;
                }
                InterfaceC25109 interfaceC25109 = (InterfaceC25109) objPoll;
                ConcurrentMapC16391 concurrentMapC16391 = this.f16546;
                concurrentMapC16391.getClass();
                int hash = interfaceC25109.getHash();
                C6394 c6394M37210 = concurrentMapC16391.m37210(hash);
                c6394M37210.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = c6394M37210.f16550;
                    int length = hash & (atomicReferenceArray.length() - 1);
                    InterfaceC25109 interfaceC251010 = (InterfaceC25109) atomicReferenceArray.get(length);
                    for (InterfaceC25109 next = interfaceC251010; next != null; next = next.getNext()) {
                        if (next == interfaceC25109) {
                            c6394M37210.f16552++;
                            InterfaceC25109 interfaceC25109M14618 = c6394M37210.m14618(interfaceC251010, next, next.getKey(), next.mo19584().get(), next.mo19584(), EnumC4993.f11373);
                            int i3 = c6394M37210.f16556 - 1;
                            atomicReferenceArray.set(length, interfaceC25109M14618);
                            c6394M37210.f16556 = i3;
                            break;
                        }
                    }
                    c6394M37210.unlock();
                    c6394M37210.m14634();
                    i2++;
                } catch (Throwable th) {
                    c6394M37210.unlock();
                    c6394M37210.m14634();
                    throw th;
                }
            } while (i2 != 16);
        }
        if (this.f16546.f48181 != EnumC3711.f7852) {
            do {
                Object objPoll2 = this.f16548.poll();
                if (objPoll2 == null) {
                    return;
                }
                InterfaceC5723 interfaceC5723 = (InterfaceC5723) objPoll2;
                ConcurrentMapC16391 concurrentMapC16392 = this.f16546;
                concurrentMapC16392.getClass();
                InterfaceC25109 entry = interfaceC5723.getEntry();
                int hash2 = entry.getHash();
                C6394 c6394M37211 = concurrentMapC16392.m37210(hash2);
                Object key = entry.getKey();
                c6394M37211.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray2 = c6394M37211.f16550;
                    int length2 = hash2 & (atomicReferenceArray2.length() - 1);
                    InterfaceC25109 interfaceC251011 = (InterfaceC25109) atomicReferenceArray2.get(length2);
                    InterfaceC25109 next2 = interfaceC251011;
                    while (true) {
                        if (next2 == null) {
                            c6394M37211.unlock();
                            if (!c6394M37211.isHeldByCurrentThread()) {
                                c6394M37211.m14634();
                                break;
                            }
                            break;
                        }
                        Object key2 = next2.getKey();
                        if (next2.getHash() == hash2 && key2 != null && c6394M37211.f16546.f48166.m29558(key, key2)) {
                            if (next2.mo19584() != interfaceC5723) {
                                c6394M37211.unlock();
                                if (!c6394M37211.isHeldByCurrentThread()) {
                                    c6394M37211.m14634();
                                    break;
                                }
                                break;
                            }
                            c6394M37211.f16552++;
                            InterfaceC25109 interfaceC25109M14619 = c6394M37211.m14618(interfaceC251011, next2, key2, interfaceC5723.get(), interfaceC5723, EnumC4993.f11373);
                            int i4 = c6394M37211.f16556 - 1;
                            atomicReferenceArray2.set(length2, interfaceC25109M14619);
                            c6394M37211.f16556 = i4;
                            c6394M37211.unlock();
                            if (!c6394M37211.isHeldByCurrentThread()) {
                                c6394M37211.m14634();
                                break;
                            }
                            break;
                        }
                        next2 = next2.getNext();
                    }
                    i++;
                } catch (Throwable th2) {
                    c6394M37211.unlock();
                    if (!c6394M37211.isHeldByCurrentThread()) {
                        c6394M37211.m14634();
                    }
                    throw th2;
                }
            } while (i != 16);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m14633(InterfaceC25109 interfaceC25109, long j) {
        if (this.f16546.m37211()) {
            interfaceC25109.mo19575(j);
        }
        this.f16549.add(interfaceC25109);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14630(InterfaceC25109 interfaceC25109, long j) {
        if (this.f16546.m37211()) {
            interfaceC25109.mo19575(j);
        }
        this.f16555.add(interfaceC25109);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14619() {
        while (true) {
            InterfaceC25109 interfaceC25109 = (InterfaceC25109) this.f16549.poll();
            if (interfaceC25109 == null) {
                return;
            }
            AbstractQueue abstractQueue = this.f16555;
            if (abstractQueue.contains(interfaceC25109)) {
                abstractQueue.add(interfaceC25109);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14620(long j) {
        InterfaceC25109 interfaceC25109;
        InterfaceC25109 interfaceC251010;
        m14619();
        do {
            interfaceC25109 = (InterfaceC25109) this.f16544.peek();
            ConcurrentMapC16391 concurrentMapC16391 = this.f16546;
            if (interfaceC25109 == null || !concurrentMapC16391.m37209(interfaceC25109, j)) {
                do {
                    interfaceC251010 = (InterfaceC25109) this.f16555.peek();
                    if (interfaceC251010 == null || !concurrentMapC16391.m37209(interfaceC251010, j)) {
                        return;
                    }
                } while (m14625(interfaceC251010, interfaceC251010.getHash(), EnumC4993.f11371));
                throw new AssertionError();
            }
        } while (m14625(interfaceC25109, interfaceC25109.getHash(), EnumC4993.f11371));
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14622(Object obj, Object obj2, int i, EnumC4993 enumC4993) {
        this.f16553 -= (long) i;
        if (enumC4993.mo10570()) {
            this.f16547.mo20962();
        }
        ConcurrentMapC16391 concurrentMapC16391 = this.f16546;
        if (concurrentMapC16391.f48160 != ConcurrentMapC16391.f48158) {
            concurrentMapC16391.f48160.offer(new C20416(obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14623(InterfaceC25109 interfaceC25109) {
        InterfaceC25109 interfaceC251010;
        if (this.f16546.m37208()) {
            m14619();
            long jMo8870 = interfaceC25109.mo19584().mo8870();
            long j = this.f16545;
            if (jMo8870 > j && !m14625(interfaceC25109, interfaceC25109.getHash(), EnumC4993.f11370)) {
                throw new AssertionError();
            }
            while (this.f16553 > j) {
                Iterator it = this.f16555.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new AssertionError();
                    }
                    interfaceC251010 = (InterfaceC25109) it.next();
                } while (interfaceC251010.mo19584().mo8870() <= 0);
                if (!m14625(interfaceC251010, interfaceC251010.getHash(), EnumC4993.f11370)) {
                    throw new AssertionError();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC25109 m14616(int i, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.f16550;
        for (InterfaceC25109 next = (InterfaceC25109) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); next != null; next = next.getNext()) {
            if (next.getHash() == i) {
                Object key = next.getKey();
                if (key == null) {
                    m14631();
                } else if (this.f16546.f48166.m29558(obj, key)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m14613(InterfaceC25109 interfaceC25109, long j) {
        if (interfaceC25109.getKey() == null) {
            m14631();
            return null;
        }
        Object obj = interfaceC25109.mo19584().get();
        if (obj == null) {
            m14631();
            return null;
        }
        if (!this.f16546.m37209(interfaceC25109, j)) {
            return obj;
        }
        if (!tryLock()) {
            return null;
        }
        try {
            m14620(j);
            return null;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m14610(Object obj, int i, Object obj2, boolean z) {
        int i2;
        lock();
        try {
            long jMo42007 = this.f16546.f48174.mo42007();
            m14628(jMo42007);
            if (this.f16556 + 1 > this.f16557) {
                m14632();
            }
            AtomicReferenceArray atomicReferenceArray = this.f16550;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC25109 interfaceC25109 = (InterfaceC25109) atomicReferenceArray.get(length);
            for (InterfaceC25109 next = interfaceC25109; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i && key != null && this.f16546.f48166.m29558(obj, key)) {
                    InterfaceC5723 interfaceC5723Mo19584 = next.mo19584();
                    Object obj3 = interfaceC5723Mo19584.get();
                    if (obj3 != null) {
                        if (z) {
                            m14630(next, jMo42007);
                        } else {
                            this.f16552++;
                            m14622(obj, obj3, interfaceC5723Mo19584.mo8870(), EnumC4993.f11368);
                            m14624(next, obj, obj2, jMo42007);
                            m14623(next);
                        }
                        return obj3;
                    }
                    this.f16552++;
                    if (interfaceC5723Mo19584.mo12721()) {
                        m14622(obj, obj3, interfaceC5723Mo19584.mo8870(), EnumC4993.f11373);
                        m14624(next, obj, obj2, jMo42007);
                        i2 = this.f16556;
                    } else {
                        m14624(next, obj, obj2, jMo42007);
                        i2 = this.f16556 + 1;
                    }
                    this.f16556 = i2;
                    m14623(next);
                    return null;
                }
            }
            this.f16552++;
            InterfaceC25109 interfaceC25109Mo12698 = this.f16546.f48176.mo12698(this, obj, i, interfaceC25109);
            m14624(interfaceC25109Mo12698, obj, obj2, jMo42007);
            atomicReferenceArray.set(length, interfaceC25109Mo12698);
            this.f16556++;
            m14623(interfaceC25109Mo12698);
            return null;
        } finally {
            unlock();
            m14634();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m14632() {
        AtomicReferenceArray atomicReferenceArray = this.f16550;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.f16556;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f16557 = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC25109 next = (InterfaceC25109) atomicReferenceArray.get(i2);
            if (next != null) {
                InterfaceC25109 next2 = next.getNext();
                int hash = next.getHash() & length2;
                if (next2 == null) {
                    atomicReferenceArray2.set(hash, next);
                } else {
                    InterfaceC25109 interfaceC25109 = next;
                    while (next2 != null) {
                        int hash2 = next2.getHash() & length2;
                        if (hash2 != hash) {
                            interfaceC25109 = next2;
                            hash = hash2;
                        }
                        next2 = next2.getNext();
                    }
                    atomicReferenceArray2.set(hash, interfaceC25109);
                    while (next != interfaceC25109) {
                        int hash3 = next.getHash() & length2;
                        InterfaceC25109 interfaceC25109M14617 = m14617(next, (InterfaceC25109) atomicReferenceArray2.get(hash3));
                        if (interfaceC25109M14617 != null) {
                            atomicReferenceArray2.set(hash3, interfaceC25109M14617);
                        } else {
                            m14629(next);
                            i--;
                        }
                        next = next.getNext();
                    }
                }
            }
        }
        this.f16550 = atomicReferenceArray2;
        this.f16556 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14621(Object obj, int i, C25169 c25169, Object obj2) {
        lock();
        try {
            long jMo42007 = this.f16546.f48174.mo42007();
            m14628(jMo42007);
            int i2 = this.f16556 + 1;
            if (i2 > this.f16557) {
                m14632();
                i2 = this.f16556 + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f16550;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC25109 interfaceC25109 = (InterfaceC25109) atomicReferenceArray.get(length);
            for (InterfaceC25109 next = interfaceC25109; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i && key != null && this.f16546.f48166.m29558(obj, key)) {
                    InterfaceC5723 interfaceC5723Mo19584 = next.mo19584();
                    Object obj3 = interfaceC5723Mo19584.get();
                    if (c25169 == interfaceC5723Mo19584 || (obj3 == null && interfaceC5723Mo19584 != ConcurrentMapC16391.f48157)) {
                        this.f16552++;
                        if (c25169.f80528.mo12721()) {
                            m14622(obj, obj3, c25169.f80528.mo8870(), obj3 == null ? EnumC4993.f11373 : EnumC4993.f11368);
                            i2--;
                        }
                        m14624(next, obj, obj2, jMo42007);
                        this.f16556 = i2;
                        m14623(next);
                    } else {
                        m14622(obj, obj2, 0, EnumC4993.f11368);
                    }
                }
            }
            this.f16552++;
            EnumC15760 enumC15760 = this.f16546.f48176;
            obj.getClass();
            InterfaceC25109 interfaceC25109Mo12698 = enumC15760.mo12698(this, obj, i, interfaceC25109);
            m14624(interfaceC25109Mo12698, obj, obj2, jMo42007);
            atomicReferenceArray.set(length, interfaceC25109Mo12698);
            this.f16556 = i2;
            m14623(interfaceC25109Mo12698);
        } finally {
            unlock();
            m14634();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC25109 m14618(InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010, Object obj, Object obj2, InterfaceC5723 interfaceC5723, EnumC4993 enumC4993) {
        m14622(obj, obj2, interfaceC5723.mo8870(), enumC4993);
        this.f16544.remove(interfaceC251010);
        this.f16555.remove(interfaceC251010);
        if (interfaceC5723.mo12720()) {
            interfaceC5723.mo12719(null);
            return interfaceC25109;
        }
        return m14626(interfaceC25109, interfaceC251010);
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC25109 m14626(InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010) {
        int i = this.f16556;
        InterfaceC25109 next = interfaceC251010.getNext();
        while (interfaceC25109 != interfaceC251010) {
            InterfaceC25109 interfaceC25109M14617 = m14617(interfaceC25109, next);
            if (interfaceC25109M14617 != null) {
                next = interfaceC25109M14617;
            } else {
                m14629(interfaceC25109);
                i--;
            }
            interfaceC25109 = interfaceC25109.getNext();
        }
        this.f16556 = i;
        return next;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14629(InterfaceC25109 interfaceC25109) {
        Object key = interfaceC25109.getKey();
        interfaceC25109.getHash();
        m14622(key, interfaceC25109.mo19584().get(), interfaceC25109.mo19584().mo8870(), EnumC4993.f11373);
        this.f16544.remove(interfaceC25109);
        this.f16555.remove(interfaceC25109);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14625(InterfaceC25109 interfaceC25109, int i, EnumC4993 enumC4993) {
        AtomicReferenceArray atomicReferenceArray = this.f16550;
        int length = i & (atomicReferenceArray.length() - 1);
        InterfaceC25109 interfaceC251010 = (InterfaceC25109) atomicReferenceArray.get(length);
        for (InterfaceC25109 next = interfaceC251010; next != null; next = next.getNext()) {
            if (next == interfaceC25109) {
                this.f16552++;
                InterfaceC25109 interfaceC25109M14618 = m14618(interfaceC251010, next, next.getKey(), next.mo19584().get(), next.mo19584(), enumC4993);
                int i2 = this.f16556 - 1;
                atomicReferenceArray.set(length, interfaceC25109M14618);
                this.f16556 = i2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m14635() {
        if ((this.f16551.incrementAndGet() & 63) == 0) {
            m14628(this.f16546.f48174.mo42007());
            m14634();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14628(long j) {
        if (tryLock()) {
            try {
                m14627();
                m14620(j);
                this.f16551.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m14634() {
        if (isHeldByCurrentThread()) {
            return;
        }
        while (true) {
            ConcurrentMapC16391 concurrentMapC16391 = this.f16546;
            C20416 c20416 = (C20416) concurrentMapC16391.f48160.poll();
            if (c20416 == null) {
                return;
            }
            try {
                concurrentMapC16391.f48165.mo14487(c20416);
            } catch (Throwable th) {
                ConcurrentMapC16391.f48159.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }
}
