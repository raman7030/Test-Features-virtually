package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۜۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GANU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6502 extends AbstractC6790 implements InterfaceC11791, InterfaceC19742 {
    public volatile /* synthetic */ int _decision;
    public volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11791 f20087;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14801 f20088;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC8907 f20089;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20086 = AtomicIntegerFieldUpdater.newUpdater(C6502.class, "_decision");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20085 = AtomicReferenceFieldUpdater.newUpdater(C6502.class, Object.class, "_state");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17988(Object obj, InterfaceC16233 interfaceC16233) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC16233 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18001(InterfaceC16233 interfaceC16233) {
        m17987(Boolean.TRUE, this.f21073, interfaceC16233);
    }

    @Override // l.InterfaceC11791
    /* JADX INFO: renamed from: ֫ */
    public final void mo8683(Object obj) {
        Throwable thM11584 = C3825.m11584(obj);
        if (thM11584 != null) {
            obj = new C18497(thM11584, false);
        }
        m17987(obj, this.f21073, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m17990(InterfaceC16233 interfaceC16233, Throwable th) {
        try {
            interfaceC16233.invoke(th);
        } catch (Throwable th2) {
            C5797.m16273(new C5091("Exception in invokeOnCancellation handler for " + this, th2), this.f20088);
        }
    }

    @Override // l.AbstractC6790
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11791 mo17992() {
        return this.f20087;
    }

    public C6502(InterfaceC11791 interfaceC11791, int i) {
        super(i);
        this.f20087 = interfaceC11791;
        this.f20088 = interfaceC11791.getContext();
        this._decision = 0;
        this._state = C16379.f50397;
    }

    @Override // l.InterfaceC11791
    public final InterfaceC14801 getContext() {
        return this.f20088;
    }

    @Override // l.AbstractC6790
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object mo18003() {
        return this._state;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final boolean m17991() {
        return this.f21073 == 2 && ((C10819) this.f20087).m27040();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m18008() {
        Object obj = this._state;
        if ((obj instanceof C3680) && ((C3680) obj).f11625 != null) {
            m18006();
            return false;
        }
        this._decision = 0;
        this._state = C16379.f50397;
        return true;
    }

    @Override // l.InterfaceC19742
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19742 mo3350() {
        InterfaceC11791 interfaceC11791 = this.f20087;
        if (interfaceC11791 instanceof InterfaceC19742) {
            return (InterfaceC19742) interfaceC11791;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17995(CancellationException cancellationException) {
        if (!m17991() ? false : ((C10819) this.f20087).m27038((Throwable) cancellationException)) {
            return;
        }
        m17994((Throwable) cancellationException);
        if (m17991()) {
            return;
        }
        m18006();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17998(AbstractC23435 abstractC23435, Throwable th) {
        try {
            abstractC23435.mo9916(th);
        } catch (Throwable th2) {
            C5797.m16273(new C5091("Exception in invokeOnCancellation handler for " + this, th2), this.f20088);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17997(InterfaceC16233 interfaceC16233, Throwable th) {
        try {
            interfaceC16233.invoke(th);
        } catch (Throwable th2) {
            C5797.m16273(new C5091("Exception in resume onCancellation handler for " + this, th2), this.f20088);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m18002() {
        C10819 c10819;
        Throwable thM27037;
        Throwable thM27038;
        C12434 c12434 = C12434.f37427;
        boolean zM17991 = m17991();
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    if (zM17991) {
                        InterfaceC11791 interfaceC11791 = this.f20087;
                        c10819 = interfaceC11791 instanceof C10819 ? (C10819) interfaceC11791 : null;
                        if (c10819 != null && (thM27037 = c10819.m27037(this)) != null) {
                            m18006();
                            m17994(thM27037);
                        }
                    }
                    Object obj = this._state;
                    if (obj instanceof C18497) {
                        throw ((C18497) obj).f57332;
                    }
                    int i2 = this.f21073;
                    if (i2 == 1 || i2 == 2) {
                        InterfaceC14801 interfaceC14801 = this.f20088;
                        C12434 c12435 = InterfaceC10318.f31060;
                        InterfaceC10318 interfaceC10318 = (InterfaceC10318) interfaceC14801.mo9082(c12434);
                        if (interfaceC10318 != null && !interfaceC10318.mo26070()) {
                            CancellationException cancellationExceptionMo26071 = interfaceC10318.mo26071();
                            mo17993(obj, cancellationExceptionMo26071);
                            throw cancellationExceptionMo26071;
                        }
                    }
                    return mo18004(obj);
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f20086.compareAndSet(this, 0, 1));
        if (this.f20089 == null) {
            InterfaceC14801 interfaceC14802 = this.f20088;
            C12434 c12436 = InterfaceC10318.f31060;
            InterfaceC10318 interfaceC10319 = (InterfaceC10318) interfaceC14802.mo9082(c12434);
            if (interfaceC10319 != null) {
                this.f20089 = interfaceC10319.mo26067((1 & 1) == 0, (1 & 2) != 0, new C8619(this));
            }
        }
        if (zM17991) {
            InterfaceC11791 interfaceC11792 = this.f20087;
            c10819 = interfaceC11792 instanceof C10819 ? (C10819) interfaceC11792 : null;
            if (c10819 != null && (thM27038 = c10819.m27037(this)) != null) {
                m18006();
                m17994(thM27038);
            }
        }
        return EnumC7041.COROUTINE_SUSPENDED;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17996(InterfaceC16233 interfaceC16233) {
        AbstractC23435 abstractC23435 = (AbstractC23435) interfaceC16233;
        while (true) {
            Object obj = this._state;
            if (obj instanceof C16379) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20085;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC23435)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof AbstractC23435) {
                m17988(obj, interfaceC16233);
                throw null;
            }
            if (obj instanceof C18497) {
                C18497 c18497 = (C18497) obj;
                if (!c18497.m42997()) {
                    m17988(obj, interfaceC16233);
                    throw null;
                }
                if (obj instanceof C9325) {
                    m17990(interfaceC16233, c18497.f57332);
                    return;
                }
                return;
            }
            if (!(obj instanceof C3680)) {
                if (abstractC23435 instanceof AbstractC17791) {
                    return;
                }
                C3680 c3680 = new C3680(obj, abstractC23435, (InterfaceC16233) null, (Throwable) null, 28);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20085;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c3680)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return;
            }
            C3680 c3681 = (C3680) obj;
            if (c3681.f11624 != null) {
                m17988(obj, interfaceC16233);
                throw null;
            }
            if (abstractC23435 instanceof AbstractC17791) {
                return;
            }
            Throwable th = c3681.f11623;
            if (th != null) {
                m17990(interfaceC16233, th);
                return;
            }
            C3680 c3680M11209 = C3680.m11209(c3681, abstractC23435, null, 29);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f20085;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c3680M11209)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m17985(InterfaceC20882 interfaceC20882, Object obj, int i, InterfaceC16233 interfaceC16233) {
        if (obj instanceof C18497) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC16233 != null || ((interfaceC20882 instanceof AbstractC23435) && !(interfaceC20882 instanceof AbstractC17791))) {
            return new C3680(obj, interfaceC20882 instanceof AbstractC23435 ? (AbstractC23435) interfaceC20882 : null, interfaceC16233, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final C15050 m17989(Object obj, InterfaceC16233 interfaceC16233) {
        C15050 c15050 = C20614.f66332;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC20882)) {
                return null;
            }
            Object objM17985 = m17985((InterfaceC20882) obj2, obj, this.f21073, interfaceC16233);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20085;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM17985)) {
                    if (!m17991()) {
                        m18006();
                    }
                    return c15050;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m18006() {
        InterfaceC8907 interfaceC8907 = this.f20089;
        if (interfaceC8907 == null) {
            return;
        }
        interfaceC8907.mo12010();
        this.f20089 = C6770.f21025;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15050 m17999() {
        return m17989(Boolean.FALSE, (InterfaceC16233) null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15050 m18005(InterfaceC16233 interfaceC16233) {
        return m17989(Boolean.TRUE, interfaceC16233);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18007() {
        m17986(this.f21073);
    }

    @Override // l.AbstractC6790
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object mo18004(Object obj) {
        return obj instanceof C3680 ? ((C3680) obj).f11626 : obj;
    }

    @Override // l.AbstractC6790
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Throwable mo18000(Object obj) {
        Throwable thMo18000 = super.mo18000(obj);
        if (thMo18000 != null) {
            return thMo18000;
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(C11024.m27355(this.f20087));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof InterfaceC20882) {
            str = "Active";
        } else {
            str = obj instanceof C9325 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C11024.m27354((Object) this));
        return sb.toString();
    }

    @Override // l.AbstractC6790
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17993(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof InterfaceC20882) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C18497) {
                return;
            }
            if (!(obj2 instanceof C3680)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20085;
                C3680 c3680 = new C3680(obj2, (AbstractC23435) null, (InterfaceC16233) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c3680)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C3680 c3681 = (C3680) obj2;
            if (c3681.f11623 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C3680 c3680M11209 = C3680.m11209(c3681, null, cancellationException, 15);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20085;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c3680M11209)) {
                    AbstractC23435 abstractC23435 = c3681.f11624;
                    if (abstractC23435 != null) {
                        m17998(abstractC23435, (Throwable) cancellationException);
                    }
                    InterfaceC16233 interfaceC16233 = c3681.f11627;
                    if (interfaceC16233 != null) {
                        m17997(interfaceC16233, (Throwable) cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17994(Throwable th) {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof InterfaceC20882)) {
                return;
            }
            boolean z = obj instanceof AbstractC23435;
            C9325 c9325 = new C9325(this, th, z);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20085;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c9325)) {
                    AbstractC23435 abstractC23435 = z ? (AbstractC23435) obj : null;
                    if (abstractC23435 != null) {
                        m17998(abstractC23435, th);
                    }
                    if (!m17991()) {
                        m18006();
                    }
                    m17986(this.f21073);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m17986(int i) {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC11791 interfaceC11791 = this.f20087;
                boolean z = i == 4;
                if (!z && (interfaceC11791 instanceof C10819)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.f21073;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        C10819 c10819 = (C10819) interfaceC11791;
                        AbstractC2975 abstractC2975 = c10819.f32541;
                        InterfaceC14801 context = c10819.f32539.getContext();
                        if (abstractC2975.mo9084()) {
                            abstractC2975.mo6030(context, this);
                            return;
                        }
                        AbstractC2557 abstractC2557M8046 = C2537.m8046();
                        if (abstractC2557M8046.m8096()) {
                            abstractC2557M8046.m8092((AbstractC6790) this);
                            return;
                        }
                        abstractC2557M8046.m8093(true);
                        try {
                            C20902.m47741(this, this.f20087, true);
                            do {
                            } while (abstractC2557M8046.m8098());
                        } catch (Throwable th) {
                            try {
                                m18435(th, (Throwable) null);
                            } finally {
                                abstractC2557M8046.m8094();
                            }
                        }
                        return;
                    }
                }
                C20902.m47741(this, interfaceC11791, z);
                return;
            }
        } while (!f20086.compareAndSet(this, 0, 2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m17987(Object obj, int i, InterfaceC16233 interfaceC16233) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC20882)) {
                if (obj2 instanceof C9325) {
                    C9325 c9325 = (C9325) obj2;
                    if (c9325.m24003()) {
                        if (interfaceC16233 != null) {
                            m17997(interfaceC16233, c9325.f57332);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objM17985 = m17985((InterfaceC20882) obj2, obj, i, interfaceC16233);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20085;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM17985)) {
                    if (!m17991()) {
                        m18006();
                    }
                    m17986(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }
}
