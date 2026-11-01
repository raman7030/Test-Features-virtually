package p067l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩵۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20893 extends AbstractC2786 implements InterfaceC18880 {

    /* JADX INFO: renamed from: ۫ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65605 = AtomicReferenceFieldUpdater.newUpdater(AbstractC20893.class, Object.class, "_queue");

    /* JADX INFO: renamed from: ۬ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65606 = AtomicReferenceFieldUpdater.newUpdater(AbstractC20893.class, Object.class, "_delayed");
    public volatile /* synthetic */ Object _queue = null;
    public volatile /* synthetic */ Object _delayed = null;
    public volatile /* synthetic */ int _isCompleted = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX INFO: renamed from: ֫ */
    public static final boolean m47194(AbstractC20893 abstractC20893) {
        return abstractC20893._isCompleted;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47198(long j, AbstractRunnableC6140 abstractRunnableC6140) {
        int iM13929;
        Thread threadMo4371;
        if (this._isCompleted != 0) {
            iM13929 = 1;
        } else {
            C20222 c20222 = (C20222) this._delayed;
            if (c20222 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65606;
                C20222 c20223 = new C20222();
                c20223.f62522 = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c20223) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                C13045.m29861(obj);
                c20222 = (C20222) obj;
            }
            iM13929 = abstractRunnableC6140.m13929(j, c20222, (RunnableC18209) this);
        }
        if (iM13929 != 0) {
            if (iM13929 == 1) {
                mo4370(j, abstractRunnableC6140);
                return;
            } else {
                if (iM13929 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C20222 c20224 = (C20222) this._delayed;
        if ((c20224 != null ? (AbstractRunnableC6140) c20224.m31792() : null) != abstractRunnableC6140 || Thread.currentThread() == (threadMo4371 = mo4371())) {
            return;
        }
        LockSupport.unpark(threadMo4371);
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m47197() {
        if (!m10129()) {
            return false;
        }
        C20222 c20222 = (C20222) this._delayed;
        if (c20222 != null && !c20222.m31791()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C17343) {
            return ((C17343) obj).m39324();
        }
        return obj == C7481.f19570;
    }

    @Override // p067l.AbstractC4799
    public void shutdown() {
        AbstractRunnableC6140 abstractRunnableC6140;
        C4780.m10078();
        this._isCompleted = 1;
        loop0: while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65605;
                C16672 c16672 = C7481.f19570;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c16672)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else {
                if (obj instanceof C17343) {
                    ((C17343) obj).m39322();
                    break;
                }
                if (obj == C7481.f19570) {
                    break;
                }
                C17343 c17343 = new C17343(8, true);
                c17343.m39321((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f65605;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c17343)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
        }
        while (m47196() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C20222 c20222 = (C20222) this._delayed;
            if (c20222 == null || (abstractRunnableC6140 = (AbstractRunnableC6140) c20222.m31793()) == null) {
                return;
            } else {
                mo4370(jNanoTime, abstractRunnableC6140);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ae  */
    /* JADX INFO: renamed from: ۗ */
    public final long m47196() {
        C20222 c20222;
        AbstractRunnableC6140 abstractRunnableC6140;
        InterfaceC11980 interfaceC11980M31788;
        if (!m10130()) {
            C20222 c20223 = (C20222) this._delayed;
            Runnable runnable = null;
            if (c20223 != null && !c20223.m31791()) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (c20223) {
                        InterfaceC11980 interfaceC11980M31787 = c20223.m31787();
                        if (interfaceC11980M31787 == null) {
                            interfaceC11980M31788 = null;
                        } else {
                            AbstractRunnableC6140 abstractRunnableC6141 = (AbstractRunnableC6140) interfaceC11980M31787;
                            interfaceC11980M31788 = ((jNanoTime - abstractRunnableC6141.f15405) > 0L ? 1 : ((jNanoTime - abstractRunnableC6141.f15405) == 0L ? 0 : -1)) >= 0 ? m47195(abstractRunnableC6141) : false ? c20223.m31788(0) : null;
                        }
                    }
                } while (((AbstractRunnableC6140) interfaceC11980M31788) != null);
            }
            loop1: while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    break;
                }
                if (obj instanceof C17343) {
                    C17343 c17343 = (C17343) obj;
                    Object objM39325 = c17343.m39325();
                    if (objM39325 != C17343.f51724) {
                        runnable = (Runnable) objM39325;
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65605;
                    C17343 c17343M39326 = c17343.m39326();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c17343M39326) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == C7481.f19570) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f65605;
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop1;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == obj);
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            if (super.m10127() != 0) {
                Object obj2 = this._queue;
                if (obj2 == null) {
                    c20222 = (C20222) this._delayed;
                    if (c20222 == null && (abstractRunnableC6140 = (AbstractRunnableC6140) c20222.m31792()) != null) {
                        long jNanoTime2 = abstractRunnableC6140.f15405 - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                } else if (obj2 instanceof C17343) {
                    if (((C17343) obj2).m39324()) {
                        c20222 = (C20222) this._delayed;
                        return c20222 == null ? C14849.FOREVER_NS : C14849.FOREVER_NS;
                    }
                } else if (obj2 == C7481.f19570) {
                    return C14849.FOREVER_NS;
                }
            }
        }
        return 0L;
    }

    @Override // p067l.AbstractC5196
    /* JADX INFO: renamed from: ֫ */
    public final void mo8227(InterfaceC16436 interfaceC16436, Runnable runnable) {
        mo41416(runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo41416(Runnable runnable) {
        if (m47195(runnable)) {
            Thread threadMo4371 = mo4371();
            if (Thread.currentThread() != threadMo4371) {
                LockSupport.unpark(threadMo4371);
                return;
            }
            return;
        }
        RunnableC18209.f54356.mo41416(runnable);
    }

    /* JADX INFO: renamed from: ۬ */
    public final void m47199() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX INFO: renamed from: ۧ */
    private final boolean m47195(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65605;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C17343)) {
                if (obj == C7481.f19570) {
                    return false;
                }
                C17343 c17343 = new C17343(8, true);
                c17343.m39321((Runnable) obj);
                c17343.m39321(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f65605;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c17343)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return true;
            }
            C17343 c17344 = (C17343) obj;
            int iM39321 = c17344.m39321(runnable);
            if (iM39321 == 0) {
                return true;
            }
            if (iM39321 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f65605;
                C17343 c17343M39326 = c17344.m39326();
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c17343M39326) && atomicReferenceFieldUpdater3.get(this) == obj) {
                }
            } else if (iM39321 == 2) {
                return false;
            }
        }
    }
}
