package p067l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۜۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GANU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8548 extends AbstractC8822 implements InterfaceC13575, InterfaceC21132 {
    public volatile /* synthetic */ int _decision;
    public volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC13575 f22965;

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16436 f22966;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC10834 f22967;

    /* JADX INFO: renamed from: ۫ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22964 = AtomicIntegerFieldUpdater.newUpdater(C8548.class, "_decision");

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22963 = AtomicReferenceFieldUpdater.newUpdater(C8548.class, Object.class, "_state");

    /* JADX INFO: renamed from: ֫ */
    public static void m19937(Object obj, InterfaceC17797 interfaceC17797) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC17797 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19950(InterfaceC17797 interfaceC17797) {
        m19936(Boolean.TRUE, this.f23951, interfaceC17797);
    }

    @Override // p067l.InterfaceC13575
    /* JADX INFO: renamed from: ֫ */
    public final void mo10744(Object obj) {
        Throwable thM13520 = C6004.m13520(obj);
        if (thM13520 != null) {
            obj = new C19948(thM13520, false);
        }
        m19936(obj, this.f23951, null);
    }

    /* JADX INFO: renamed from: ۧ */
    private final void m19939(InterfaceC17797 interfaceC17797, Throwable th) {
        try {
            interfaceC17797.invoke(th);
        } catch (Throwable th2) {
            C7878.m18198(new C7207("Exception in invokeOnCancellation handler for " + this, th2), this.f22966);
        }
    }

    @Override // p067l.AbstractC8822
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13575 mo19941() {
        return this.f22965;
    }

    public C8548(InterfaceC13575 interfaceC13575, int i) {
        super(i);
        this.f22965 = interfaceC13575;
        this.f22966 = interfaceC13575.getContext();
        this._decision = 0;
        this._state = C17935.f53569;
    }

    @Override // p067l.InterfaceC13575
    public final InterfaceC16436 getContext() {
        return this.f22966;
    }

    @Override // p067l.AbstractC8822
    /* JADX INFO: renamed from: ܽ */
    public final Object mo19952() {
        return this._state;
    }

    /* JADX INFO: renamed from: ᩷ */
    private final boolean m19940() {
        return this.f23951 == 2 && ((C12651) this.f22965).m29085();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m19957() {
        Object obj = this._state;
        if ((obj instanceof C5866) && ((C5866) obj).f14429 != null) {
            m19955();
            return false;
        }
        this._decision = 0;
        this._state = C17935.f53569;
        return true;
    }

    @Override // p067l.InterfaceC21132
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21132 mo5669() {
        InterfaceC13575 interfaceC13575 = this.f22965;
        if (interfaceC13575 instanceof InterfaceC21132) {
            return (InterfaceC21132) interfaceC13575;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19944(CancellationException cancellationException) {
        if (!m19940() ? false : ((C12651) this.f22965).m29083((Throwable) cancellationException)) {
            return;
        }
        m19943((Throwable) cancellationException);
        if (m19940()) {
            return;
        }
        m19955();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19947(AbstractC24641 abstractC24641, Throwable th) {
        try {
            abstractC24641.mo11964(th);
        } catch (Throwable th2) {
            C7878.m18198(new C7207("Exception in invokeOnCancellation handler for " + this, th2), this.f22966);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19946(InterfaceC17797 interfaceC17797, Throwable th) {
        try {
            interfaceC17797.invoke(th);
        } catch (Throwable th2) {
            C7878.m18198(new C7207("Exception in resume onCancellation handler for " + this, th2), this.f22966);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final Object m19951() {
        C12651 c12651;
        Throwable thM29082;
        Throwable thM29083;
        C14186 c14186 = C14186.f40444;
        boolean zM19940 = m19940();
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    if (zM19940) {
                        InterfaceC13575 interfaceC13575 = this.f22965;
                        c12651 = interfaceC13575 instanceof C12651 ? (C12651) interfaceC13575 : null;
                        if (c12651 != null && (thM29082 = c12651.m29082(this)) != null) {
                            m19955();
                            m19943(thM29082);
                        }
                    }
                    Object obj = this._state;
                    if (obj instanceof C19948) {
                        throw ((C19948) obj).f60554;
                    }
                    int i2 = this.f23951;
                    if (i2 == 1 || i2 == 2) {
                        InterfaceC16436 interfaceC16436 = this.f22966;
                        C14186 c14187 = InterfaceC12175.f34023;
                        InterfaceC12175 interfaceC12175 = (InterfaceC12175) interfaceC16436.mo11134(c14186);
                        if (interfaceC12175 != null && !interfaceC12175.mo28094()) {
                            CancellationException cancellationExceptionMo28095 = interfaceC12175.mo28095();
                            mo19942(obj, cancellationExceptionMo28095);
                            throw cancellationExceptionMo28095;
                        }
                    }
                    return mo19953(obj);
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f22964.compareAndSet(this, 0, 1));
        if (this.f22967 == null) {
            InterfaceC16436 interfaceC16437 = this.f22966;
            C14186 c14188 = InterfaceC12175.f34023;
            InterfaceC12175 interfaceC12176 = (InterfaceC12175) interfaceC16437.mo11134(c14186);
            if (interfaceC12176 != null) {
                this.f22967 = interfaceC12176.mo28091((1 & 1) == 0, (1 & 2) != 0, new C10560(this));
            }
        }
        if (zM19940) {
            InterfaceC13575 interfaceC13576 = this.f22965;
            c12651 = interfaceC13576 instanceof C12651 ? (C12651) interfaceC13576 : null;
            if (c12651 != null && (thM29083 = c12651.m29082(this)) != null) {
                m19955();
                m19943(thM29083);
            }
        }
        return EnumC9061.COROUTINE_SUSPENDED;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19945(InterfaceC17797 interfaceC17797) {
        AbstractC24641 abstractC24641 = (AbstractC24641) interfaceC17797;
        while (true) {
            Object obj = this._state;
            if (obj instanceof C17935) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22963;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC24641)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof AbstractC24641) {
                m19937(obj, interfaceC17797);
                throw null;
            }
            if (obj instanceof C19948) {
                C19948 c19948 = (C19948) obj;
                if (!c19948.m45275()) {
                    m19937(obj, interfaceC17797);
                    throw null;
                }
                if (obj instanceof C11231) {
                    m19939(interfaceC17797, c19948.f60554);
                    return;
                }
                return;
            }
            if (!(obj instanceof C5866)) {
                if (abstractC24641 instanceof AbstractC19277) {
                    return;
                }
                C5866 c5866 = new C5866(obj, abstractC24641, (InterfaceC17797) null, (Throwable) null, 28);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22963;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c5866)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return;
            }
            C5866 c5867 = (C5866) obj;
            if (c5867.f14428 != null) {
                m19937(obj, interfaceC17797);
                throw null;
            }
            if (abstractC24641 instanceof AbstractC19277) {
                return;
            }
            Throwable th = c5867.f14427;
            if (th != null) {
                m19939(interfaceC17797, th);
                return;
            }
            C5866 c5866M13171 = C5866.m13171(c5867, abstractC24641, null, 29);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f22963;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c5866M13171)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m19934(InterfaceC22215 interfaceC22215, Object obj, int i, InterfaceC17797 interfaceC17797) {
        if (obj instanceof C19948) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC17797 != null || ((interfaceC22215 instanceof AbstractC24641) && !(interfaceC22215 instanceof AbstractC19277))) {
            return new C5866(obj, interfaceC22215 instanceof AbstractC24641 ? (AbstractC24641) interfaceC22215 : null, interfaceC17797, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۧ */
    private final C16672 m19938(Object obj, InterfaceC17797 interfaceC17797) {
        C16672 c16672 = C21960.f69014;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC22215)) {
                return null;
            }
            Object objM19934 = m19934((InterfaceC22215) obj2, obj, this.f23951, interfaceC17797);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22963;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM19934)) {
                    if (!m19940()) {
                        m19955();
                    }
                    return c16672;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m19955() {
        InterfaceC10834 interfaceC10834 = this.f22967;
        if (interfaceC10834 == null) {
            return;
        }
        interfaceC10834.mo13934();
        this.f22967 = C8803.f23899;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C16672 m19948() {
        return m19938(Boolean.FALSE, (InterfaceC17797) null);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C16672 m19954(InterfaceC17797 interfaceC17797) {
        return m19938(Boolean.TRUE, interfaceC17797);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m19956() {
        m19935(this.f23951);
    }

    @Override // p067l.AbstractC8822
    /* JADX INFO: renamed from: ܽ */
    public final Object mo19953(Object obj) {
        return obj instanceof C5866 ? ((C5866) obj).f14430 : obj;
    }

    @Override // p067l.AbstractC8822
    /* JADX INFO: renamed from: ۧ */
    public final Throwable mo19949(Object obj) {
        Throwable thMo19949 = super.mo19949(obj);
        if (thMo19949 != null) {
            return thMo19949;
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(C12846.m29417(this.f22965));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof InterfaceC22215) {
            str = "Active";
        } else {
            str = obj instanceof C11231 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C12846.m29416((Object) this));
        return sb.toString();
    }

    @Override // p067l.AbstractC8822
    /* JADX INFO: renamed from: ֫ */
    public final void mo19942(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof InterfaceC22215) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C19948) {
                return;
            }
            if (!(obj2 instanceof C5866)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22963;
                C5866 c5866 = new C5866(obj2, (AbstractC24641) null, (InterfaceC17797) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c5866)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C5866 c5867 = (C5866) obj2;
            if (c5867.f14427 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C5866 c5866M13171 = C5866.m13171(c5867, null, cancellationException, 15);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22963;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c5866M13171)) {
                    AbstractC24641 abstractC24641 = c5867.f14428;
                    if (abstractC24641 != null) {
                        m19947(abstractC24641, (Throwable) cancellationException);
                    }
                    InterfaceC17797 interfaceC17797 = c5867.f14431;
                    if (interfaceC17797 != null) {
                        m19946(interfaceC17797, (Throwable) cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19943(Throwable th) {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof InterfaceC22215)) {
                return;
            }
            boolean z = obj instanceof AbstractC24641;
            C11231 c11231 = new C11231(this, th, z);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22963;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c11231)) {
                    AbstractC24641 abstractC24641 = z ? (AbstractC24641) obj : null;
                    if (abstractC24641 != null) {
                        m19947(abstractC24641, th);
                    }
                    if (!m19940()) {
                        m19955();
                    }
                    m19935(this.f23951);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m19935(int i) {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC13575 interfaceC13575 = this.f22965;
                boolean z = i == 4;
                if (!z && (interfaceC13575 instanceof C12651)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.f23951;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        C12651 c12651 = (C12651) interfaceC13575;
                        AbstractC5196 abstractC5196 = c12651.f35517;
                        InterfaceC16436 context = c12651.f35515.getContext();
                        if (abstractC5196.mo11136()) {
                            abstractC5196.mo8227(context, this);
                            return;
                        }
                        AbstractC4799 abstractC4799M10076 = C4780.m10076();
                        if (abstractC4799M10076.m10128()) {
                            abstractC4799M10076.m10124((AbstractC8822) this);
                            return;
                        }
                        abstractC4799M10076.m10125(true);
                        try {
                            C22234.m50071(this, this.f22965, true);
                            do {
                            } while (abstractC4799M10076.m10130());
                        } catch (Throwable th) {
                            try {
                                m20384(th, (Throwable) null);
                            } finally {
                                abstractC4799M10076.m10126();
                            }
                        }
                        return;
                    }
                }
                C22234.m50071(this, interfaceC13575, z);
                return;
            }
        } while (!f22964.compareAndSet(this, 0, 2));
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m19936(Object obj, int i, InterfaceC17797 interfaceC17797) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC22215)) {
                if (obj2 instanceof C11231) {
                    C11231 c11231 = (C11231) obj2;
                    if (c11231.m26012()) {
                        if (interfaceC17797 != null) {
                            m19946(interfaceC17797, c11231.f60554);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objM19934 = m19934((InterfaceC22215) obj2, obj, i, interfaceC17797);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22963;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM19934)) {
                    if (!m19940()) {
                        m19955();
                    }
                    m19935(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }
}
