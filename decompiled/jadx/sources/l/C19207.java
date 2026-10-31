package l;

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
public final class C19207 extends AbstractC1567 implements Closeable {

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public Object f60460;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f60461;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public volatile int f60462;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public Iterator f60463;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f60464;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f60465;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2938 f60466;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public volatile int f60467;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f60468;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public volatile int f60469;

    public C19207(AbstractC2938 abstractC2938, C6127 c6127) {
        super(c6127, "pool");
        this.f60469 = 8;
        this.f60462 = 0;
        this.f60467 = 8;
        this.f60464 = new ConcurrentMapC10942();
        this.f60465 = new ArrayList();
        this.f60468 = new ReentrantReadWriteLock(true);
        this.f60461 = new AtomicInteger(0);
        this.f60466 = abstractC2938;
        m5367(c6127);
        this.f60469 = c6127.m1265();
        this.f60467 = c6127.m1262();
        m5365(-1);
        this.f60462 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44275(Object obj, InterfaceC9994 interfaceC9994) {
        if (interfaceC9994 != null) {
            this.f60466.getClass();
            C19913 c19913M43005 = ((C18501) this.f60464.get(obj)).m43005();
            if (m5372()) {
                c19913M43005.addFirst(interfaceC9994);
            } else {
                c19913M43005.addLast(interfaceC9994);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m44286(Object obj) {
        boolean z;
        long millis = m5371().toMillis();
        AbstractC2938 abstractC2938 = this.f60466;
        if (!this.f5537) {
            boolean zM5377 = m5377();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C18501 c18501M44282 = m44282(obj);
            do {
                InterfaceC9994 interfaceC9994M44281 = null;
                while (true) {
                    if (interfaceC9994M44281 == null) {
                        try {
                            interfaceC9994M44281 = (InterfaceC9994) c18501M44282.m43005().pollFirst();
                            boolean zMo8961 = false;
                            z = interfaceC9994M44281 == null && (interfaceC9994M44281 = m44281(obj)) != null;
                            if (zM5377) {
                                if (interfaceC9994M44281 == null) {
                                    if (millis < 0) {
                                        interfaceC9994M44281 = (InterfaceC9994) c18501M44282.m43005().m45818();
                                    } else {
                                        C19913 c19913M43005 = c18501M44282.m43005();
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        interfaceC9994M44281 = (InterfaceC9994) c19913M43005.m45815(millis);
                                    }
                                }
                                if (interfaceC9994M44281 == null) {
                                    throw new NoSuchElementException("Timeout waiting for idle object, borrowMaxWaitMillis=" + millis);
                                }
                            } else if (interfaceC9994M44281 == null) {
                                throw new NoSuchElementException("Pool exhausted");
                            }
                            if (!interfaceC9994M44281.mo25156()) {
                                interfaceC9994M44281 = null;
                            }
                            if (interfaceC9994M44281 != null) {
                                try {
                                    abstractC2938.getClass();
                                } catch (Exception e) {
                                    try {
                                        EnumC12110 enumC12110 = EnumC12110.NORMAL;
                                        m44277(obj, interfaceC9994M44281, true);
                                    } catch (Exception unused) {
                                    }
                                    if (z) {
                                        NoSuchElementException noSuchElementException = new NoSuchElementException("Unable to activate object");
                                        noSuchElementException.initCause(e);
                                        throw noSuchElementException;
                                    }
                                    interfaceC9994M44281 = null;
                                }
                                if (interfaceC9994M44281 != null && m5380()) {
                                    try {
                                        zMo8961 = abstractC2938.mo8961(obj, interfaceC9994M44281);
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
                                    if (!zMo8961) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            m44280(obj);
                            throw th2;
                        }
                    } else {
                        m44280(obj);
                        m5368(interfaceC9994M44281, C2828.ofMillis(System.currentTimeMillis() - jCurrentTimeMillis));
                        return interfaceC9994M44281.mo25153();
                    }
                }
                try {
                    EnumC12110 enumC12111 = EnumC12110.NORMAL;
                    m44277(obj, interfaceC9994M44281, true);
                    this.f5545.incrementAndGet();
                } catch (Exception unused2) {
                }
            } while (!z);
            NoSuchElementException noSuchElementException2 = new NoSuchElementException("Unable to validate object");
            noSuchElementException2.initCause(th);
            throw noSuchElementException2;
        }
        throw new IllegalStateException("Pool not open");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44288(Object obj) {
        try {
            C19913 c19913M43005 = m44282(obj).m43005();
            for (InterfaceC9994 interfaceC9994 = (InterfaceC9994) c19913M43005.pollFirst(); interfaceC9994 != null; interfaceC9994 = (InterfaceC9994) c19913M43005.pollFirst()) {
                try {
                    EnumC12110 enumC12110 = EnumC12110.NORMAL;
                    m44277(obj, interfaceC9994, true);
                } catch (Exception unused) {
                }
            }
        } finally {
            m44280(obj);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44276(TreeMap treeMap, Object obj, C18501 c18501) {
        if (c18501 != null) {
            C19846.forEach(c18501.m43005(), new C8645(1, treeMap, obj));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m44280(Object obj) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f60464;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f60468;
        Lock lock = reentrantReadWriteLock.readLock();
        try {
            lock.lock();
            C18501 c18501 = (C18501) concurrentMapC10942.get(obj);
            if (c18501.m43006().decrementAndGet() == 0 && c18501.m43004().get() == 0) {
                lock.unlock();
                lock = reentrantReadWriteLock.writeLock();
                lock.lock();
                if (c18501.m43004().get() == 0 && c18501.m43006().get() == 0) {
                    concurrentMapC10942.remove(obj);
                    this.f60465.remove(obj);
                }
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m44277(Object obj, InterfaceC9994 interfaceC9994, boolean z) {
        boolean zEquals;
        C18501 c18501M44282 = m44282(obj);
        try {
            synchronized (interfaceC9994) {
                zEquals = interfaceC9994.getState().equals(EnumC5760.IDLE);
                if (zEquals || z) {
                    zEquals = c18501M44282.m43005().removeFirstOccurrence(interfaceC9994);
                }
            }
            if (zEquals || z) {
                c18501M44282.m43003().remove(new C13520(interfaceC9994.mo25153()));
                interfaceC9994.invalidate();
                try {
                    this.f60466.mo8959(obj, interfaceC9994);
                    c18501M44282.m43004().decrementAndGet();
                    this.f5547.incrementAndGet();
                    this.f60461.decrementAndGet();
                    m44280(obj);
                    return true;
                } catch (Throwable th) {
                    c18501M44282.m43004().decrementAndGet();
                    this.f5547.incrementAndGet();
                    this.f60461.decrementAndGet();
                    throw th;
                }
            }
            m44280(obj);
            return false;
        } catch (Throwable th2) {
            m44280(obj);
            throw th2;
        }
    }

    @Override // l.AbstractC1567
    /* JADX INFO: renamed from: ֫ */
    public final void mo5364() {
        ConcurrentMapC10942 concurrentMapC10942 = this.f60464;
        int i = this.f60469;
        if (this.f60462 <= i) {
            i = this.f60462;
        }
        if (i < 1) {
            return;
        }
        for (Object obj : concurrentMapC10942.keySet()) {
            C18501 c18501 = (C18501) concurrentMapC10942.get(obj);
            int iM44274 = m44274(c18501);
            for (int i2 = 0; i2 < iM44274 && m44274(c18501) > 0; i2++) {
                m44283(obj);
                if (c18501 == null) {
                    c18501 = (C18501) concurrentMapC10942.get(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m44274(C18501 c18501) {
        if (c18501 != null) {
            int iM5369 = m5369();
            int i = this.f60467;
            int i2 = this.f60469;
            if (this.f60462 <= i2) {
                i2 = this.f60462;
            }
            int size = i2 - c18501.m43005().size();
            if (i > 0) {
                size = Math.min(size, Math.max(0, i - c18501.m43005().size()));
            }
            return iM5369 > 0 ? Math.min(size, Math.max(0, (iM5369 - (this.f60461.get() - m44285())) - m44285())) : size;
        }
        int i3 = this.f60469;
        return this.f60462 > i3 ? i3 : this.f60462;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m44278() {
        int i = this.f60467;
        C19913 c19913 = null;
        Object obj = null;
        int i2 = 0;
        for (Map.Entry entry : this.f60464.entrySet()) {
            Object key = entry.getKey();
            C18501 c18501 = (C18501) entry.getValue();
            if (c18501 != null) {
                C19913 c19913M43005 = c18501.m43005();
                int iM45816 = c19913M43005.m45816();
                C18501 c18502 = (C18501) this.f60464.get(key);
                if ((c18502 != null ? c18502.m43003().size() - c18502.m43005().size() : 0) < i && iM45816 > i2) {
                    c19913 = c19913M43005;
                    obj = key;
                    i2 = iM45816;
                }
            }
        }
        if (c19913 != null) {
            m44282(obj);
            try {
                InterfaceC9994 interfaceC9994M44281 = m44281(obj);
                if (interfaceC9994M44281 != null) {
                    m44275(obj, interfaceC9994M44281);
                }
            } catch (Exception unused) {
            } finally {
                m44280(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private InterfaceC9994 m44281(Object obj) {
        boolean zM44277;
        int i = this.f60467;
        int i2 = i < 0 ? Integer.MAX_VALUE : i;
        int iM5369 = m5369();
        C18501 c18501 = (C18501) this.f60464.get(obj);
        boolean z = true;
        while (z) {
            int iIncrementAndGet = this.f60461.incrementAndGet();
            if (iM5369 <= -1 || iIncrementAndGet <= iM5369) {
                z = false;
            } else {
                this.f60461.decrementAndGet();
                if (m44285() == 0) {
                    return null;
                }
                final TreeMap treeMap = new TreeMap();
                C17997.forEach(this.f60464, new BiConsumer() { // from class: l.ܺۘ֡
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        C19207.m44276(treeMap, obj2, (C18501) obj3);
                    }

                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C17873.$default$andThen(this, biConsumer);
                    }
                });
                int size = ((int) (((double) treeMap.size()) * 0.15d)) + 1;
                Iterator it = treeMap.entrySet().iterator();
                while (it.hasNext() && size > 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object value = entry.getValue();
                    InterfaceC9994 interfaceC9994 = (InterfaceC9994) entry.getKey();
                    try {
                        EnumC12110 enumC12110 = EnumC12110.NORMAL;
                        zM44277 = m44277(value, interfaceC9994, false);
                    } catch (Exception unused) {
                        zM44277 = true;
                    }
                    if (zM44277) {
                        size--;
                    }
                }
            }
        }
        Boolean bool = null;
        while (bool == null) {
            synchronized (c18501.f57341) {
                if (c18501.m43004().incrementAndGet() > i2) {
                    c18501.m43004().decrementAndGet();
                    if (c18501.f57342 == 0) {
                        bool = Boolean.FALSE;
                    } else {
                        c18501.f57341.wait();
                    }
                } else {
                    C18501.m43000(c18501);
                    bool = Boolean.TRUE;
                }
            }
        }
        if (!bool.booleanValue()) {
            this.f60461.decrementAndGet();
            return null;
        }
        try {
            try {
                AbstractC2938 abstractC2938 = this.f60466;
                InterfaceC9994 interfaceC9994Mo8960 = abstractC2938.mo8960(abstractC2938.mo8958(obj));
                synchronized (c18501.f57341) {
                    C18501.m43002(c18501);
                    c18501.f57341.notifyAll();
                }
                this.f5549.incrementAndGet();
                c18501.m43003().put(new C13520(((C16383) interfaceC9994Mo8960).mo25153()), interfaceC9994Mo8960);
                return interfaceC9994Mo8960;
            } catch (Exception e) {
                this.f60461.decrementAndGet();
                c18501.m43004().decrementAndGet();
                throw e;
            }
        } catch (Throwable th) {
            synchronized (c18501.f57341) {
                C18501.m43002(c18501);
                c18501.f57341.notifyAll();
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5537) {
            return;
        }
        synchronized (this.f5539) {
            if (this.f5537) {
                return;
            }
            m5366(C2828.ofMillis(-1L));
            this.f5537 = true;
            C19846.forEach(this.f60464.keySet(), new C18084(1, this));
            m5370();
            C19846.forEach(this.f60464.values(), new C3684());
            C19846.forEach(this.f60464.keySet(), new C18084(1, this));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44283(Object obj) {
        if (!this.f5537) {
            m44282(obj);
            try {
                m44275(obj, m44281(obj));
                return;
            } finally {
                m44280(obj);
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
    @Override // l.AbstractC1567
    /* JADX INFO: renamed from: ܽ */
    public final void mo5376() {
        int iCeil;
        C11405 c11405;
        InterfaceC9994 next;
        Deque dequeM28165;
        boolean zMo26941;
        boolean z;
        boolean zMo8961;
        if (this.f5537) {
            throw new IllegalStateException("Pool not open");
        }
        if (m44285() > 0) {
            InterfaceC17089 interfaceC17089M5374 = m5374();
            synchronized (this.f5542) {
                C2828 c2828M5378 = m5378();
                C2828 c2828M5375 = m5375();
                int i = this.f60469;
                if (this.f60462 <= i) {
                    i = this.f60462;
                }
                C17795 c17795 = new C17795(c2828M5378, c2828M5375, i);
                boolean zM5379 = m5379();
                int iM44285 = m44285();
                int iM5363 = m5363();
                if (iM5363 >= 0) {
                    iCeil = Math.min(iM5363, iM44285);
                } else {
                    iCeil = (int) Math.ceil(((double) iM44285) / Math.abs(iM5363));
                }
                int i2 = 0;
                while (i2 < iCeil) {
                    C11405 c11406 = this.f5550;
                    Object th = null;
                    if (c11406 == null || !c11406.hasNext()) {
                        Iterator it = this.f60463;
                        if (it == null || !it.hasNext()) {
                            ArrayList arrayList = new ArrayList();
                            Lock lock = this.f60468.readLock();
                            lock.lock();
                            try {
                                arrayList.addAll(this.f60465);
                                lock.unlock();
                                this.f60463 = arrayList.iterator();
                            } catch (Throwable th2) {
                                lock.unlock();
                                throw th2;
                            }
                        }
                        while (this.f60463.hasNext()) {
                            Object next2 = this.f60463.next();
                            this.f60460 = next2;
                            C18501 c18501 = (C18501) this.f60464.get(next2);
                            if (c18501 != null) {
                                C11405 c11407 = new C11405(this, c18501.m43005());
                                this.f5550 = c11407;
                                if (c11407.hasNext()) {
                                    break;
                                } else {
                                    this.f5550 = null;
                                }
                            }
                        }
                        c11405 = this.f5550;
                        if (c11405 == null) {
                            return;
                        }
                        try {
                            next = c11405.next();
                            dequeM28165 = this.f5550.m28165();
                            if (next.mo25152()) {
                                try {
                                    zMo26941 = interfaceC17089M5374.mo26941(c17795, next, ((C18501) this.f60464.get(this.f60460)).m43005().size());
                                } catch (Throwable th3) {
                                    if (th3 instanceof ThreadDeath) {
                                        throw ((ThreadDeath) th3);
                                    }
                                    if (!(th3 instanceof VirtualMachineError)) {
                                        new Exception(th3);
                                        zMo26941 = false;
                                    } else {
                                        throw ((VirtualMachineError) th3);
                                    }
                                }
                                if (zMo26941) {
                                    Object obj = this.f60460;
                                    EnumC12110 enumC12110 = EnumC12110.NORMAL;
                                    m44277(obj, next, true);
                                    this.f5540.incrementAndGet();
                                } else {
                                    if (zM5379) {
                                        try {
                                            this.f60466.getClass();
                                            z = true;
                                        } catch (Exception unused) {
                                            Object obj2 = this.f60460;
                                            EnumC12110 enumC12111 = EnumC12110.NORMAL;
                                            m44277(obj2, next, true);
                                            this.f5540.incrementAndGet();
                                            z = false;
                                        }
                                        if (z) {
                                            try {
                                                zMo8961 = this.f60466.mo8961(this.f60460, next);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                if (th instanceof ThreadDeath) {
                                                    throw ((ThreadDeath) th);
                                                }
                                                if (th instanceof VirtualMachineError) {
                                                    throw ((VirtualMachineError) th);
                                                }
                                                zMo8961 = false;
                                            }
                                            if (!zMo8961) {
                                                Object obj3 = this.f60460;
                                                EnumC12110 enumC12112 = EnumC12110.NORMAL;
                                                m44277(obj3, next, true);
                                                this.f5540.incrementAndGet();
                                                if (th != null) {
                                                    if (th instanceof RuntimeException) {
                                                        throw ((RuntimeException) th);
                                                    }
                                                    throw ((Error) th);
                                                }
                                            } else {
                                                try {
                                                    this.f60466.getClass();
                                                } catch (Exception unused2) {
                                                    Object obj4 = this.f60460;
                                                    EnumC12110 enumC12113 = EnumC12110.NORMAL;
                                                    m44277(obj4, next, true);
                                                    this.f5540.incrementAndGet();
                                                }
                                            }
                                        }
                                    }
                                    next.mo25151(dequeM28165);
                                }
                            } else {
                                i2--;
                            }
                        } catch (NoSuchElementException unused3) {
                            i2--;
                            this.f5550 = null;
                        }
                        i2++;
                    } else {
                        c11405 = this.f5550;
                        if (c11405 == null) {
                            return;
                        }
                        next = c11405.next();
                        dequeM28165 = this.f5550.m28165();
                        if (next.mo25152()) {
                            i2--;
                        } else {
                            zMo26941 = interfaceC17089M5374.mo26941(c17795, next, ((C18501) this.f60464.get(this.f60460)).m43005().size());
                            if (zMo26941) {
                                Object obj5 = this.f60460;
                                EnumC12110 enumC12114 = EnumC12110.NORMAL;
                                m44277(obj5, next, true);
                                this.f5540.incrementAndGet();
                            } else {
                                if (zM5379) {
                                    this.f60466.getClass();
                                    z = true;
                                    if (z) {
                                        zMo8961 = this.f60466.mo8961(this.f60460, next);
                                        if (!zMo8961) {
                                            Object obj6 = this.f60460;
                                            EnumC12110 enumC12115 = EnumC12110.NORMAL;
                                            m44277(obj6, next, true);
                                            this.f5540.incrementAndGet();
                                            if (th != null) {
                                                if (th instanceof RuntimeException) {
                                                    throw ((RuntimeException) th);
                                                }
                                                throw ((Error) th);
                                            }
                                        } else {
                                            this.f60466.getClass();
                                        }
                                    }
                                }
                                next.mo25151(dequeM28165);
                            }
                        }
                        i2++;
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44285() {
        return C5378.stream(this.f60464.values()).mapToInt(new C8623()).sum();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m44289(Object obj) {
        C18501 c18501 = (C18501) this.f60464.get(obj);
        if (c18501 != null) {
            return c18501.m43005().size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m44279() {
        return C5378.stream(this.f60464.values()).anyMatch(new C2273());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44284(Object obj, Object obj2) {
        C18501 c18501 = (C18501) this.f60464.get(obj);
        InterfaceC9994 interfaceC9994 = (InterfaceC9994) c18501.m43003().get(new C13520(obj2));
        if (interfaceC9994 == null) {
            throw new IllegalStateException("Object not currently part of this pool");
        }
        synchronized (interfaceC9994) {
            if (interfaceC9994.getState() != EnumC5760.INVALID) {
                m44277(obj, interfaceC9994, true);
            }
        }
        if (c18501.f57340.m45817()) {
            m44283(obj);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C18501 m44282(Object obj) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f60464;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f60468;
        Lock lock = reentrantReadWriteLock.readLock();
        try {
            lock.lock();
            C18501 c18501 = (C18501) concurrentMapC10942.get(obj);
            if (c18501 == null) {
                lock.unlock();
                lock = reentrantReadWriteLock.writeLock();
                lock.lock();
                c18501 = (C18501) concurrentMapC10942.get(obj);
                if (c18501 == null) {
                    c18501 = new C18501();
                    c18501.m43006().incrementAndGet();
                    concurrentMapC10942.put(obj, c18501);
                    this.f60465.add(obj);
                } else {
                    c18501.m43006().incrementAndGet();
                }
            } else {
                c18501.m43006().incrementAndGet();
            }
            return c18501;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44287(Object obj, Object obj2) {
        C18501 c18501 = (C18501) this.f60464.get(obj);
        if (c18501 == null) {
            throw new IllegalStateException("No keyed pool found under the given key.");
        }
        InterfaceC9994 interfaceC9994 = (InterfaceC9994) c18501.m43003().get(new C13520(obj2));
        if (interfaceC9994 != null) {
            synchronized (interfaceC9994) {
                if (interfaceC9994.getState() != EnumC5760.ALLOCATED) {
                    throw new IllegalStateException("Object has already been returned to this pool or is invalid");
                }
                interfaceC9994.mo25158();
            }
            C2828 c2828Mo25159 = interfaceC9994.mo25159();
            try {
                try {
                    try {
                        this.f60466.getClass();
                        if (interfaceC9994.mo25154()) {
                            int i = this.f60469;
                            C19913 c19913M43005 = c18501.m43005();
                            if (this.f5537 || (i > -1 && i <= c19913M43005.size())) {
                                try {
                                    EnumC12110 enumC12110 = EnumC12110.NORMAL;
                                    m44277(obj, interfaceC9994, true);
                                } catch (Exception unused) {
                                }
                            } else {
                                if (m5372()) {
                                    c19913M43005.addFirst(interfaceC9994);
                                } else {
                                    c19913M43005.addLast(interfaceC9994);
                                }
                                if (this.f5537) {
                                    m44288(obj);
                                }
                            }
                            if (m44279()) {
                                m44278();
                            }
                            m5373(c2828Mo25159);
                            return;
                        }
                        throw new IllegalStateException("Object has already been returned to this pool");
                    } catch (Exception unused2) {
                        if (c18501.f57340.m45817()) {
                            try {
                                m44283(obj);
                            } catch (Exception unused3) {
                            }
                        }
                        if (m44279()) {
                            m44278();
                        }
                        m5373(c2828Mo25159);
                        return;
                    }
                } catch (Exception unused4) {
                    EnumC12110 enumC12111 = EnumC12110.NORMAL;
                    m44277(obj, interfaceC9994, true);
                    if (c18501.f57340.m45817()) {
                        m44283(obj);
                    }
                    if (m44279()) {
                        m44278();
                    }
                    m5373(c2828Mo25159);
                    return;
                }
            } catch (Throwable th) {
                if (m44279()) {
                    m44278();
                }
                m5373(c2828Mo25159);
                throw th;
            }
        }
        throw new IllegalStateException("Returned object not currently part of this pool");
    }

    @Override // l.AbstractC1567, l.AbstractC12815
    /* JADX INFO: renamed from: ֫ */
    public final void mo1260(StringBuilder sb) {
        super.mo1260(sb);
        sb.append(", maxIdlePerKey=");
        sb.append(this.f60469);
        sb.append(", minIdlePerKey=");
        sb.append(this.f60462);
        sb.append(", maxTotalPerKey=");
        sb.append(this.f60467);
        sb.append(", factory=");
        sb.append(this.f60466);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", poolMap=");
        sb.append(this.f60464);
        sb.append(", poolKeyList=");
        sb.append(this.f60465);
        sb.append(", keyLock=");
        sb.append(this.f60468);
        sb.append(", numTotal=");
        sb.append(this.f60461);
        sb.append(", evictionKeyIterator=");
        sb.append(this.f60463);
        sb.append(", evictionKey=");
        sb.append(this.f60460);
        sb.append(", abandonedConfig=");
        sb.append((Object) null);
    }
}
