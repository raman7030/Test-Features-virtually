package p067l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.᩵ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AIE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20622 extends AbstractC3857 implements Closeable {

    /* JADX INFO: renamed from: ֨֫ */
    public Object f63691;

    /* JADX INFO: renamed from: ۗ֫ */
    public final AtomicInteger f63692;

    /* JADX INFO: renamed from: ۙ֫ */
    public volatile int f63693;

    /* JADX INFO: renamed from: ۠֫ */
    public Iterator f63694;

    /* JADX INFO: renamed from: ۫֫ */
    public final ConcurrentMapC12768 f63695;

    /* JADX INFO: renamed from: ۬֫ */
    public final ArrayList f63696;

    /* JADX INFO: renamed from: ܶ֫ */
    public final AbstractC5160 f63697;

    /* JADX INFO: renamed from: ᩶֫ */
    public volatile int f63698;

    /* JADX INFO: renamed from: ᩸֫ */
    public final ReentrantReadWriteLock f63699;

    /* JADX INFO: renamed from: ᩹֫ */
    public volatile int f63700;

    public C20622(AbstractC5160 abstractC5160, C8192 c8192) {
        super(c8192, "pool");
        this.f63700 = 8;
        this.f63693 = 0;
        this.f63698 = 8;
        this.f63695 = new ConcurrentMapC12768();
        this.f63696 = new ArrayList();
        this.f63699 = new ReentrantReadWriteLock(true);
        this.f63692 = new AtomicInteger(0);
        this.f63697 = abstractC5160;
        m7596(c8192);
        this.f63700 = c8192.m3673();
        this.f63698 = c8192.m3670();
        m7594(-1);
        this.f63693 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46570(Object obj, InterfaceC11866 interfaceC11866) {
        if (interfaceC11866 != null) {
            this.f63697.getClass();
            C21293 c21293M45283 = ((C19951) this.f63695.get(obj)).m45283();
            if (m7601()) {
                c21293M45283.addFirst(interfaceC11866);
            } else {
                c21293M45283.addLast(interfaceC11866);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m46581(Object obj) {
        boolean z;
        long millis = m7600().toMillis();
        AbstractC5160 abstractC5160 = this.f63697;
        if (!this.f8318) {
            boolean zM7606 = m7606();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C19951 c19951M46577 = m46577(obj);
            do {
                InterfaceC11866 interfaceC11866M46576 = null;
                while (true) {
                    if (interfaceC11866M46576 == null) {
                        try {
                            interfaceC11866M46576 = (InterfaceC11866) c19951M46577.m45283().pollFirst();
                            boolean zMo11029 = false;
                            z = interfaceC11866M46576 == null && (interfaceC11866M46576 = m46576(obj)) != null;
                            if (zM7606) {
                                if (interfaceC11866M46576 == null) {
                                    if (millis < 0) {
                                        interfaceC11866M46576 = (InterfaceC11866) c19951M46577.m45283().m48130();
                                    } else {
                                        C21293 c21293M45283 = c19951M46577.m45283();
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        interfaceC11866M46576 = (InterfaceC11866) c21293M45283.m48127(millis);
                                    }
                                }
                                if (interfaceC11866M46576 == null) {
                                    throw new NoSuchElementException("Timeout waiting for idle object, borrowMaxWaitMillis=" + millis);
                                }
                            } else if (interfaceC11866M46576 == null) {
                                throw new NoSuchElementException("Pool exhausted");
                            }
                            if (!interfaceC11866M46576.mo27173()) {
                                interfaceC11866M46576 = null;
                            }
                            if (interfaceC11866M46576 != null) {
                                try {
                                    abstractC5160.getClass();
                                } catch (Exception e) {
                                    try {
                                        EnumC13877 enumC13877 = EnumC13877.NORMAL;
                                        m46572(obj, interfaceC11866M46576, true);
                                    } catch (Exception unused) {
                                    }
                                    if (z) {
                                        NoSuchElementException noSuchElementException = new NoSuchElementException("Unable to activate object");
                                        noSuchElementException.initCause(e);
                                        throw noSuchElementException;
                                    }
                                    interfaceC11866M46576 = null;
                                }
                                if (interfaceC11866M46576 != null && m7609()) {
                                    try {
                                        zMo11029 = abstractC5160.mo11029(obj, interfaceC11866M46576);
                                        th = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (th instanceof ThreadDeath) {
                                            throw ((ThreadDeath) th);
                                        }
                                        if (th instanceof VirtualMachineError) {
                                            throw ((VirtualMachineError) th);
                                        }
                                    }
                                    if (!zMo11029) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            m46575(obj);
                            throw th2;
                        }
                    } else {
                        m46575(obj);
                        m7597(interfaceC11866M46576, C5057.ofMillis(System.currentTimeMillis() - jCurrentTimeMillis));
                        return interfaceC11866M46576.mo27170();
                    }
                }
                try {
                    EnumC13877 enumC13878 = EnumC13877.NORMAL;
                    m46572(obj, interfaceC11866M46576, true);
                    this.f8326.incrementAndGet();
                } catch (Exception unused2) {
                }
            } while (!z);
            NoSuchElementException noSuchElementException2 = new NoSuchElementException("Unable to validate object");
            noSuchElementException2.initCause(th);
            throw noSuchElementException2;
        }
        throw new IllegalStateException("Pool not open");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46583(Object obj) {
        try {
            C21293 c21293M45283 = m46577(obj).m45283();
            for (InterfaceC11866 interfaceC11866 = (InterfaceC11866) c21293M45283.pollFirst(); interfaceC11866 != null; interfaceC11866 = (InterfaceC11866) c21293M45283.pollFirst()) {
                try {
                    EnumC13877 enumC13877 = EnumC13877.NORMAL;
                    m46572(obj, interfaceC11866, true);
                } catch (Exception unused) {
                }
            }
        } finally {
            m46575(obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46571(TreeMap treeMap, Object obj, C19951 c19951) {
        if (c19951 != null) {
            C21230.forEach(c19951.m45283(), new C10584(1, treeMap, obj));
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m46575(Object obj) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f63695;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f63699;
        Lock lock = reentrantReadWriteLock.readLock();
        try {
            lock.lock();
            C19951 c19951 = (C19951) concurrentMapC12768.get(obj);
            if (c19951.m45284().decrementAndGet() == 0 && c19951.m45282().get() == 0) {
                lock.unlock();
                lock = reentrantReadWriteLock.writeLock();
                lock.lock();
                if (c19951.m45282().get() == 0 && c19951.m45284().get() == 0) {
                    concurrentMapC12768.remove(obj);
                    this.f63696.remove(obj);
                }
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m46572(Object obj, InterfaceC11866 interfaceC11866, boolean z) {
        boolean zEquals;
        C19951 c19951M46577 = m46577(obj);
        try {
            synchronized (interfaceC11866) {
                zEquals = interfaceC11866.getState().equals(EnumC7842.IDLE);
                if (zEquals || z) {
                    zEquals = c19951M46577.m45283().removeFirstOccurrence(interfaceC11866);
                }
            }
            if (zEquals || z) {
                c19951M46577.m45281().remove(new C15217(interfaceC11866.mo27170()));
                interfaceC11866.invalidate();
                try {
                    this.f63697.mo11027(obj, interfaceC11866);
                    c19951M46577.m45282().decrementAndGet();
                    this.f8328.incrementAndGet();
                    this.f63692.decrementAndGet();
                    m46575(obj);
                    return true;
                } catch (Throwable th) {
                    c19951M46577.m45282().decrementAndGet();
                    this.f8328.incrementAndGet();
                    this.f63692.decrementAndGet();
                    throw th;
                }
            }
            m46575(obj);
            return false;
        } catch (Throwable th2) {
            m46575(obj);
            throw th2;
        }
    }

    @Override // p067l.AbstractC3857
    /* JADX INFO: renamed from: ֫ */
    public final void mo7593() {
        ConcurrentMapC12768 concurrentMapC12768 = this.f63695;
        int i = this.f63700;
        if (this.f63693 <= i) {
            i = this.f63693;
        }
        if (i < 1) {
            return;
        }
        for (Object obj : concurrentMapC12768.keySet()) {
            C19951 c19951 = (C19951) concurrentMapC12768.get(obj);
            int iM46569 = m46569(c19951);
            for (int i2 = 0; i2 < iM46569 && m46569(c19951) > 0; i2++) {
                m46578(obj);
                if (c19951 == null) {
                    c19951 = (C19951) concurrentMapC12768.get(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m46569(C19951 c19951) {
        if (c19951 != null) {
            int iM7598 = m7598();
            int i = this.f63698;
            int i2 = this.f63700;
            if (this.f63693 <= i2) {
                i2 = this.f63693;
            }
            int size = i2 - c19951.m45283().size();
            if (i > 0) {
                size = Math.min(size, Math.max(0, i - c19951.m45283().size()));
            }
            return iM7598 > 0 ? Math.min(size, Math.max(0, (iM7598 - (this.f63692.get() - m46580())) - m46580())) : size;
        }
        int i3 = this.f63700;
        return this.f63693 > i3 ? i3 : this.f63693;
    }

    /* JADX INFO: renamed from: ۟ */
    private void m46573() {
        int i = this.f63698;
        C21293 c21293 = null;
        Object obj = null;
        int i2 = 0;
        for (Map.Entry entry : this.f63695.entrySet()) {
            Object key = entry.getKey();
            C19951 c19951 = (C19951) entry.getValue();
            if (c19951 != null) {
                C21293 c21293M45283 = c19951.m45283();
                int iM48128 = c21293M45283.m48128();
                C19951 c19952 = (C19951) this.f63695.get(key);
                if ((c19952 != null ? c19952.m45281().size() - c19952.m45283().size() : 0) < i && iM48128 > i2) {
                    c21293 = c21293M45283;
                    obj = key;
                    i2 = iM48128;
                }
            }
        }
        if (c21293 != null) {
            m46577(obj);
            try {
                InterfaceC11866 interfaceC11866M46576 = m46576(obj);
                if (interfaceC11866M46576 != null) {
                    m46570(obj, interfaceC11866M46576);
                }
            } catch (Exception unused) {
            } finally {
                m46575(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private InterfaceC11866 m46576(Object obj) {
        boolean zM46572;
        int i = this.f63698;
        int i2 = i < 0 ? Integer.MAX_VALUE : i;
        int iM7598 = m7598();
        C19951 c19951 = (C19951) this.f63695.get(obj);
        boolean z = true;
        while (z) {
            int iIncrementAndGet = this.f63692.incrementAndGet();
            if (iM7598 <= -1 || iIncrementAndGet <= iM7598) {
                z = false;
            } else {
                this.f63692.decrementAndGet();
                if (m46580() == 0) {
                    return null;
                }
                final TreeMap treeMap = new TreeMap();
                C19473.forEach(this.f63695, new BiConsumer() { // from class: l.ܺۘ֡
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        C20622.m46571(treeMap, obj2, (C19951) obj3);
                    }

                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C19355.$default$andThen(this, biConsumer);
                    }
                });
                int size = ((int) (((double) treeMap.size()) * 0.15d)) + 1;
                Iterator it = treeMap.entrySet().iterator();
                while (it.hasNext() && size > 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object value = entry.getValue();
                    InterfaceC11866 interfaceC11866 = (InterfaceC11866) entry.getKey();
                    try {
                        EnumC13877 enumC13877 = EnumC13877.NORMAL;
                        zM46572 = m46572(value, interfaceC11866, false);
                    } catch (Exception unused) {
                        zM46572 = true;
                    }
                    if (zM46572) {
                        size--;
                    }
                }
            }
        }
        Boolean bool = null;
        while (bool == null) {
            synchronized (c19951.f60563) {
                if (c19951.m45282().incrementAndGet() > i2) {
                    c19951.m45282().decrementAndGet();
                    if (c19951.f60564 == 0) {
                        bool = Boolean.FALSE;
                    } else {
                        c19951.f60563.wait();
                    }
                } else {
                    C19951.m45278(c19951);
                    bool = Boolean.TRUE;
                }
            }
        }
        if (!bool.booleanValue()) {
            this.f63692.decrementAndGet();
            return null;
        }
        try {
            try {
                AbstractC5160 abstractC5160 = this.f63697;
                InterfaceC11866 interfaceC11866Mo11028 = abstractC5160.mo11028(abstractC5160.mo11026(obj));
                synchronized (c19951.f60563) {
                    C19951.m45280(c19951);
                    c19951.f60563.notifyAll();
                }
                this.f8330.incrementAndGet();
                c19951.m45281().put(new C15217(((C17938) interfaceC11866Mo11028).mo27170()), interfaceC11866Mo11028);
                return interfaceC11866Mo11028;
            } catch (Exception e) {
                this.f63692.decrementAndGet();
                c19951.m45282().decrementAndGet();
                throw e;
            }
        } catch (Throwable th) {
            synchronized (c19951.f60563) {
                C19951.m45280(c19951);
                c19951.f60563.notifyAll();
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8318) {
            return;
        }
        synchronized (this.f8320) {
            if (this.f8318) {
                return;
            }
            m7595(C5057.ofMillis(-1L));
            this.f8318 = true;
            C21230.forEach(this.f63695.keySet(), new C19555(1, this));
            m7599();
            C21230.forEach(this.f63695.values(), new C5869());
            C21230.forEach(this.f63695.keySet(), new C19555(1, this));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46578(Object obj) {
        if (!this.f8318) {
            m46577(obj);
            try {
                m46570(obj, m46576(obj));
                return;
            } finally {
                m46575(obj);
            }
        }
        throw new IllegalStateException("Pool not open");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0011, B:12:0x0024, B:14:0x0035, B:18:0x0049, B:20:0x004e, B:38:0x00aa, B:40:0x00ae, B:43:0x00b2, B:44:0x00bc, B:94:0x0168, B:56:0x00ee, B:59:0x00fe, B:73:0x0129, B:75:0x0137, B:77:0x013b, B:78:0x013d, B:79:0x013e, B:80:0x0140, B:81:0x0141, B:83:0x0147, B:67:0x011e, B:69:0x0122, B:84:0x0154, B:85:0x0156, B:86:0x0157, B:87:0x0159, B:88:0x015a, B:61:0x0105, B:50:0x00de, B:52:0x00e2, B:54:0x00e6, B:89:0x015e, B:90:0x0160, B:91:0x0161, B:92:0x0163, B:93:0x0164, B:22:0x0054, B:24:0x0058, B:29:0x007a, B:31:0x0082, B:34:0x0095, B:37:0x00a7, B:26:0x005e, B:28:0x0071, B:96:0x016c, B:97:0x016f, B:98:0x0170, B:15:0x003a, B:11:0x0022, B:27:0x006c, B:64:0x0114, B:47:0x00c6), top: B:106:0x0011, inners: #1, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0129 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:8:0x0011, B:12:0x0024, B:14:0x0035, B:18:0x0049, B:20:0x004e, B:38:0x00aa, B:40:0x00ae, B:43:0x00b2, B:44:0x00bc, B:94:0x0168, B:56:0x00ee, B:59:0x00fe, B:73:0x0129, B:75:0x0137, B:77:0x013b, B:78:0x013d, B:79:0x013e, B:80:0x0140, B:81:0x0141, B:83:0x0147, B:67:0x011e, B:69:0x0122, B:84:0x0154, B:85:0x0156, B:86:0x0157, B:87:0x0159, B:88:0x015a, B:61:0x0105, B:50:0x00de, B:52:0x00e2, B:54:0x00e6, B:89:0x015e, B:90:0x0160, B:91:0x0161, B:92:0x0163, B:93:0x0164, B:22:0x0054, B:24:0x0058, B:29:0x007a, B:31:0x0082, B:34:0x0095, B:37:0x00a7, B:26:0x005e, B:28:0x0071, B:96:0x016c, B:97:0x016f, B:98:0x0170, B:15:0x003a, B:11:0x0022, B:27:0x006c, B:64:0x0114, B:47:0x00c6), top: B:106:0x0011, inners: #1, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x013b A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:8:0x0011, B:12:0x0024, B:14:0x0035, B:18:0x0049, B:20:0x004e, B:38:0x00aa, B:40:0x00ae, B:43:0x00b2, B:44:0x00bc, B:94:0x0168, B:56:0x00ee, B:59:0x00fe, B:73:0x0129, B:75:0x0137, B:77:0x013b, B:78:0x013d, B:79:0x013e, B:80:0x0140, B:81:0x0141, B:83:0x0147, B:67:0x011e, B:69:0x0122, B:84:0x0154, B:85:0x0156, B:86:0x0157, B:87:0x0159, B:88:0x015a, B:61:0x0105, B:50:0x00de, B:52:0x00e2, B:54:0x00e6, B:89:0x015e, B:90:0x0160, B:91:0x0161, B:92:0x0163, B:93:0x0164, B:22:0x0054, B:24:0x0058, B:29:0x007a, B:31:0x0082, B:34:0x0095, B:37:0x00a7, B:26:0x005e, B:28:0x0071, B:96:0x016c, B:97:0x016f, B:98:0x0170, B:15:0x003a, B:11:0x0022, B:27:0x006c, B:64:0x0114, B:47:0x00c6), top: B:106:0x0011, inners: #1, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013e A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:8:0x0011, B:12:0x0024, B:14:0x0035, B:18:0x0049, B:20:0x004e, B:38:0x00aa, B:40:0x00ae, B:43:0x00b2, B:44:0x00bc, B:94:0x0168, B:56:0x00ee, B:59:0x00fe, B:73:0x0129, B:75:0x0137, B:77:0x013b, B:78:0x013d, B:79:0x013e, B:80:0x0140, B:81:0x0141, B:83:0x0147, B:67:0x011e, B:69:0x0122, B:84:0x0154, B:85:0x0156, B:86:0x0157, B:87:0x0159, B:88:0x015a, B:61:0x0105, B:50:0x00de, B:52:0x00e2, B:54:0x00e6, B:89:0x015e, B:90:0x0160, B:91:0x0161, B:92:0x0163, B:93:0x0164, B:22:0x0054, B:24:0x0058, B:29:0x007a, B:31:0x0082, B:34:0x0095, B:37:0x00a7, B:26:0x005e, B:28:0x0071, B:96:0x016c, B:97:0x016f, B:98:0x0170, B:15:0x003a, B:11:0x0022, B:27:0x006c, B:64:0x0114, B:47:0x00c6), top: B:106:0x0011, inners: #1, #2, #3, #4, #5, #6 }] */
    @Override // p067l.AbstractC3857
    /* JADX INFO: renamed from: ܽ */
    public final void mo7605() {
        int iCeil;
        C13207 c13207;
        InterfaceC11866 next;
        Deque dequeM30209;
        boolean zMo28985;
        boolean z;
        boolean zMo11029;
        if (this.f8318) {
            throw new IllegalStateException("Pool not open");
        }
        if (m46580() > 0) {
            InterfaceC18609 interfaceC18609M7603 = m7603();
            synchronized (this.f8323) {
                C5057 c5057M7607 = m7607();
                C5057 c5057M7604 = m7604();
                int i = this.f63700;
                if (this.f63693 <= i) {
                    i = this.f63693;
                }
                C19280 c19280 = new C19280(c5057M7607, c5057M7604, i);
                boolean zM7608 = m7608();
                int iM46580 = m46580();
                int iM7592 = m7592();
                if (iM7592 >= 0) {
                    iCeil = Math.min(iM7592, iM46580);
                } else {
                    iCeil = (int) Math.ceil(((double) iM46580) / Math.abs(iM7592));
                }
                int i2 = 0;
                while (i2 < iCeil) {
                    C13207 c13208 = this.f8331;
                    Object th = null;
                    if (c13208 == null || !c13208.hasNext()) {
                        Iterator it = this.f63694;
                        if (it == null || !it.hasNext()) {
                            ArrayList arrayList = new ArrayList();
                            Lock lock = this.f63699.readLock();
                            lock.lock();
                            try {
                                arrayList.addAll(this.f63696);
                                lock.unlock();
                                this.f63694 = arrayList.iterator();
                            } catch (Throwable th2) {
                                lock.unlock();
                                throw th2;
                            }
                        }
                        while (this.f63694.hasNext()) {
                            Object next2 = this.f63694.next();
                            this.f63691 = next2;
                            C19951 c19951 = (C19951) this.f63695.get(next2);
                            if (c19951 != null) {
                                C13207 c13209 = new C13207(this, c19951.m45283());
                                this.f8331 = c13209;
                                if (c13209.hasNext()) {
                                    break;
                                } else {
                                    this.f8331 = null;
                                }
                            }
                        }
                        c13207 = this.f8331;
                        if (c13207 == null) {
                            return;
                        }
                        try {
                            next = c13207.next();
                            dequeM30209 = this.f8331.m30209();
                            if (next.mo27169()) {
                                try {
                                    zMo28985 = interfaceC18609M7603.mo28985(c19280, next, ((C19951) this.f63695.get(this.f63691)).m45283().size());
                                } catch (Throwable th3) {
                                    if (th3 instanceof ThreadDeath) {
                                        throw ((ThreadDeath) th3);
                                    }
                                    if (!(th3 instanceof VirtualMachineError)) {
                                        new Exception(th3);
                                        zMo28985 = false;
                                    } else {
                                        throw ((VirtualMachineError) th3);
                                    }
                                }
                                if (zMo28985) {
                                    Object obj = this.f63691;
                                    EnumC13877 enumC13877 = EnumC13877.NORMAL;
                                    m46572(obj, next, true);
                                    this.f8321.incrementAndGet();
                                } else {
                                    if (zM7608) {
                                        try {
                                            this.f63697.getClass();
                                            z = true;
                                        } catch (Exception unused) {
                                            Object obj2 = this.f63691;
                                            EnumC13877 enumC13878 = EnumC13877.NORMAL;
                                            m46572(obj2, next, true);
                                            this.f8321.incrementAndGet();
                                            z = false;
                                        }
                                        if (z) {
                                            try {
                                                zMo11029 = this.f63697.mo11029(this.f63691, next);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                if (th instanceof ThreadDeath) {
                                                    throw ((ThreadDeath) th);
                                                }
                                                if (th instanceof VirtualMachineError) {
                                                    throw ((VirtualMachineError) th);
                                                }
                                                zMo11029 = false;
                                            }
                                            if (!zMo11029) {
                                                Object obj3 = this.f63691;
                                                EnumC13877 enumC13879 = EnumC13877.NORMAL;
                                                m46572(obj3, next, true);
                                                this.f8321.incrementAndGet();
                                                if (th != null) {
                                                    if (th instanceof RuntimeException) {
                                                        throw ((RuntimeException) th);
                                                    }
                                                    throw ((Error) th);
                                                }
                                            } else {
                                                try {
                                                    this.f63697.getClass();
                                                } catch (Exception unused2) {
                                                    Object obj4 = this.f63691;
                                                    EnumC13877 enumC138710 = EnumC13877.NORMAL;
                                                    m46572(obj4, next, true);
                                                    this.f8321.incrementAndGet();
                                                }
                                            }
                                        }
                                    }
                                    next.mo27168(dequeM30209);
                                }
                            } else {
                                i2--;
                            }
                        } catch (NoSuchElementException unused3) {
                            i2--;
                            this.f8331 = null;
                        }
                        i2++;
                    } else {
                        c13207 = this.f8331;
                        if (c13207 == null) {
                            return;
                        }
                        next = c13207.next();
                        dequeM30209 = this.f8331.m30209();
                        if (next.mo27169()) {
                            i2--;
                        } else {
                            zMo28985 = interfaceC18609M7603.mo28985(c19280, next, ((C19951) this.f63695.get(this.f63691)).m45283().size());
                            if (zMo28985) {
                                Object obj5 = this.f63691;
                                EnumC13877 enumC138711 = EnumC13877.NORMAL;
                                m46572(obj5, next, true);
                                this.f8321.incrementAndGet();
                            } else {
                                if (zM7608) {
                                    this.f63697.getClass();
                                    z = true;
                                    if (z) {
                                        zMo11029 = this.f63697.mo11029(this.f63691, next);
                                        if (!zMo11029) {
                                            Object obj6 = this.f63691;
                                            EnumC13877 enumC138712 = EnumC13877.NORMAL;
                                            m46572(obj6, next, true);
                                            this.f8321.incrementAndGet();
                                            if (th != null) {
                                                if (th instanceof RuntimeException) {
                                                    throw ((RuntimeException) th);
                                                }
                                                throw ((Error) th);
                                            }
                                        } else {
                                            this.f63697.getClass();
                                        }
                                    }
                                }
                                next.mo27168(dequeM30209);
                            }
                        }
                        i2++;
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public final int m46580() {
        return C7480.stream(this.f63695.values()).mapToInt(new C10563()).sum();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m46584(Object obj) {
        C19951 c19951 = (C19951) this.f63695.get(obj);
        if (c19951 != null) {
            return c19951.m45283().size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܰ */
    private boolean m46574() {
        return C7480.stream(this.f63695.values()).anyMatch(new C4528());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46579(Object obj, Object obj2) {
        C19951 c19951 = (C19951) this.f63695.get(obj);
        InterfaceC11866 interfaceC11866 = (InterfaceC11866) c19951.m45281().get(new C15217(obj2));
        if (interfaceC11866 == null) {
            throw new IllegalStateException("Object not currently part of this pool");
        }
        synchronized (interfaceC11866) {
            if (interfaceC11866.getState() != EnumC7842.INVALID) {
                m46572(obj, interfaceC11866, true);
            }
        }
        if (c19951.f60562.m48129()) {
            m46578(obj);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private C19951 m46577(Object obj) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f63695;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f63699;
        Lock lock = reentrantReadWriteLock.readLock();
        try {
            lock.lock();
            C19951 c19951 = (C19951) concurrentMapC12768.get(obj);
            if (c19951 == null) {
                lock.unlock();
                lock = reentrantReadWriteLock.writeLock();
                lock.lock();
                c19951 = (C19951) concurrentMapC12768.get(obj);
                if (c19951 == null) {
                    c19951 = new C19951();
                    c19951.m45284().incrementAndGet();
                    concurrentMapC12768.put(obj, c19951);
                    this.f63696.add(obj);
                } else {
                    c19951.m45284().incrementAndGet();
                }
            } else {
                c19951.m45284().incrementAndGet();
            }
            return c19951;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    public final void m46582(Object obj, Object obj2) {
        C19951 c19951 = (C19951) this.f63695.get(obj);
        if (c19951 == null) {
            throw new IllegalStateException("No keyed pool found under the given key.");
        }
        InterfaceC11866 interfaceC11866 = (InterfaceC11866) c19951.m45281().get(new C15217(obj2));
        if (interfaceC11866 != null) {
            synchronized (interfaceC11866) {
                if (interfaceC11866.getState() != EnumC7842.ALLOCATED) {
                    throw new IllegalStateException("Object has already been returned to this pool or is invalid");
                }
                interfaceC11866.mo27175();
            }
            C5057 c5057Mo27176 = interfaceC11866.mo27176();
            try {
                try {
                    try {
                        this.f63697.getClass();
                        if (interfaceC11866.mo27171()) {
                            int i = this.f63700;
                            C21293 c21293M45283 = c19951.m45283();
                            if (this.f8318 || (i > -1 && i <= c21293M45283.size())) {
                                try {
                                    EnumC13877 enumC13877 = EnumC13877.NORMAL;
                                    m46572(obj, interfaceC11866, true);
                                } catch (Exception unused) {
                                }
                            } else {
                                if (m7601()) {
                                    c21293M45283.addFirst(interfaceC11866);
                                } else {
                                    c21293M45283.addLast(interfaceC11866);
                                }
                                if (this.f8318) {
                                    m46583(obj);
                                }
                            }
                            if (m46574()) {
                                m46573();
                            }
                            m7602(c5057Mo27176);
                            return;
                        }
                        throw new IllegalStateException("Object has already been returned to this pool");
                    } catch (Exception unused2) {
                        if (c19951.f60562.m48129()) {
                            try {
                                m46578(obj);
                            } catch (Exception unused3) {
                            }
                        }
                        if (m46574()) {
                            m46573();
                        }
                        m7602(c5057Mo27176);
                        return;
                    }
                } catch (Exception unused4) {
                    EnumC13877 enumC13878 = EnumC13877.NORMAL;
                    m46572(obj, interfaceC11866, true);
                    if (c19951.f60562.m48129()) {
                        m46578(obj);
                    }
                    if (m46574()) {
                        m46573();
                    }
                    m7602(c5057Mo27176);
                    return;
                }
            } catch (Throwable th) {
                if (m46574()) {
                    m46573();
                }
                m7602(c5057Mo27176);
                throw th;
            }
        }
        throw new IllegalStateException("Returned object not currently part of this pool");
    }

    @Override // p067l.AbstractC3857, p067l.AbstractC14547
    /* JADX INFO: renamed from: ֫ */
    public final void mo3668(StringBuilder sb) {
        super.mo3668(sb);
        sb.append(", maxIdlePerKey=");
        sb.append(this.f63700);
        sb.append(", minIdlePerKey=");
        sb.append(this.f63693);
        sb.append(", maxTotalPerKey=");
        sb.append(this.f63698);
        sb.append(", factory=");
        sb.append(this.f63697);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", poolMap=");
        sb.append(this.f63695);
        sb.append(", poolKeyList=");
        sb.append(this.f63696);
        sb.append(", keyLock=");
        sb.append(this.f63699);
        sb.append(", numTotal=");
        sb.append(this.f63692);
        sb.append(", evictionKeyIterator=");
        sb.append(this.f63694);
        sb.append(", evictionKey=");
        sb.append(this.f63691);
        sb.append(", abandonedConfig=");
        sb.append((Object) null);
    }
}
