package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩵۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19491 extends AbstractC0439 implements InterfaceC17373 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62988 = AtomicReferenceFieldUpdater.newUpdater(AbstractC19491.class, Object.class, "_queue");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62989 = AtomicReferenceFieldUpdater.newUpdater(AbstractC19491.class, Object.class, "_delayed");
    public volatile /* synthetic */ Object _queue = null;
    public volatile /* synthetic */ Object _delayed = null;
    public volatile /* synthetic */ int _isCompleted = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m44897(AbstractC19491 abstractC19491) {
        return abstractC19491._isCompleted;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44901(long j, AbstractRunnableC3968 abstractRunnableC3968) {
        int iM12005;
        Thread threadMo1995;
        if (this._isCompleted != 0) {
            iM12005 = 1;
        } else {
            C18785 c18785 = (C18785) this._delayed;
            if (c18785 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62989;
                C18785 c18786 = new C18785();
                c18786.f59299 = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c18786) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                C11233.m27799(obj);
                c18785 = (C18785) obj;
            }
            iM12005 = abstractRunnableC3968.m12005(j, c18785, (RunnableC16667) this);
        }
        if (iM12005 != 0) {
            if (iM12005 == 1) {
                mo1994(j, abstractRunnableC3968);
                return;
            } else {
                if (iM12005 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C18785 c18787 = (C18785) this._delayed;
        if ((c18787 != null ? (AbstractRunnableC3968) c18787.m29730() : null) != abstractRunnableC3968 || Thread.currentThread() == (threadMo1995 = mo1995())) {
            return;
        }
        LockSupport.unpark(threadMo1995);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44900() {
        if (!m8097()) {
            return false;
        }
        C18785 c18785 = (C18785) this._delayed;
        if (c18785 != null && !c18785.m29729()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C15756) {
            return ((C15756) obj).m37154();
        }
        return obj == C5379.f16732;
    }

    @Override // l.AbstractC2557
    public void shutdown() {
        AbstractRunnableC3968 abstractRunnableC3968;
        C2537.m8048();
        this._isCompleted = 1;
        loop0: while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62988;
                C15050 c15050 = C5379.f16732;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c15050)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else {
                if (obj instanceof C15756) {
                    ((C15756) obj).m37152();
                    break;
                }
                if (obj == C5379.f16732) {
                    break;
                }
                C15756 c15756 = new C15756(8, true);
                c15756.m37151((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f62988;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c15756)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
        }
        while (m44899() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C18785 c18785 = (C18785) this._delayed;
            if (c18785 == null || (abstractRunnableC3968 = (AbstractRunnableC3968) c18785.m29731()) == null) {
                return;
            } else {
                mo1994(jNanoTime, abstractRunnableC3968);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ae  */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m44899() {
        C18785 c18785;
        AbstractRunnableC3968 abstractRunnableC3968;
        InterfaceC10113 interfaceC10113M29726;
        if (!m8098()) {
            C18785 c18786 = (C18785) this._delayed;
            Runnable runnable = null;
            if (c18786 != null && !c18786.m29729()) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (c18786) {
                        InterfaceC10113 interfaceC10113M29725 = c18786.m29725();
                        if (interfaceC10113M29725 == null) {
                            interfaceC10113M29726 = null;
                        } else {
                            AbstractRunnableC3968 abstractRunnableC3969 = (AbstractRunnableC3968) interfaceC10113M29725;
                            interfaceC10113M29726 = ((jNanoTime - abstractRunnableC3969.f12594) > 0L ? 1 : ((jNanoTime - abstractRunnableC3969.f12594) == 0L ? 0 : -1)) >= 0 ? m44898(abstractRunnableC3969) : false ? c18786.m29726(0) : null;
                        }
                    }
                } while (((AbstractRunnableC3968) interfaceC10113M29726) != null);
            }
            loop1: while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    break;
                }
                if (obj instanceof C15756) {
                    C15756 c15756 = (C15756) obj;
                    Object objM37155 = c15756.m37155();
                    if (objM37155 != C15756.f48585) {
                        runnable = (Runnable) objM37155;
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62988;
                    C15756 c15756M37156 = c15756.m37156();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c15756M37156) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == C5379.f16732) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f62988;
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
            if (super.m8095() != 0) {
                Object obj2 = this._queue;
                if (obj2 == null) {
                    c18785 = (C18785) this._delayed;
                    if (c18785 == null && (abstractRunnableC3968 = (AbstractRunnableC3968) c18785.m29730()) != null) {
                        long jNanoTime2 = abstractRunnableC3968.f12594 - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                } else if (obj2 instanceof C15756) {
                    if (((C15756) obj2).m37154()) {
                        c18785 = (C18785) this._delayed;
                        return c18785 == null ? C13132.FOREVER_NS : C13132.FOREVER_NS;
                    }
                } else if (obj2 == C5379.f16732) {
                    return C13132.FOREVER_NS;
                }
            }
        }
        return 0L;
    }

    @Override // l.AbstractC2975
    /* JADX INFO: renamed from: ֫ */
    public final void mo6030(InterfaceC14801 interfaceC14801, Runnable runnable) {
        mo39181(runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo39181(Runnable runnable) {
        if (m44898(runnable)) {
            Thread threadMo1995 = mo1995();
            if (Thread.currentThread() != threadMo1995) {
                LockSupport.unpark(threadMo1995);
                return;
            }
            return;
        }
        RunnableC16667.f51171.mo39181(runnable);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m44902() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final boolean m44898(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62988;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C15756)) {
                if (obj == C5379.f16732) {
                    return false;
                }
                C15756 c15756 = new C15756(8, true);
                c15756.m37151((Runnable) obj);
                c15756.m37151(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f62988;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c15756)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return true;
            }
            C15756 c15757 = (C15756) obj;
            int iM37151 = c15757.m37151(runnable);
            if (iM37151 == 0) {
                return true;
            }
            if (iM37151 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f62988;
                C15756 c15756M37156 = c15757.m37156();
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c15756M37156) && atomicReferenceFieldUpdater3.get(this) == obj) {
                }
            } else if (iM37151 == 2) {
                return false;
            }
        }
    }
}
