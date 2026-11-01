package p067l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۧۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AY1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12651 extends AbstractC8822 implements InterfaceC21132, InterfaceC13575 {

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35514 = AtomicReferenceFieldUpdater.newUpdater(C12651.class, Object.class, "_reusableCancellableContinuation");
    public volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC20461 f35515;

    /* JADX INFO: renamed from: ۙ */
    public Object f35516;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC5196 f35517;

    /* JADX INFO: renamed from: ۬ */
    public final Object f35518;

    @Override // p067l.InterfaceC13575
    public final InterfaceC16436 getContext() {
        return this.f35515.getContext();
    }

    @Override // p067l.AbstractC8822
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13575 mo19941() {
        return this;
    }

    public C12651(AbstractC5196 abstractC5196, AbstractC20461 abstractC20461) {
        super(-1);
        this.f35517 = abstractC5196;
        this.f35515 = abstractC20461;
        this.f35516 = C18014.f53780;
        this.f35518 = C14661.m33526(abstractC20461.getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // p067l.InterfaceC21132
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21132 mo5669() {
        AbstractC20461 abstractC20461 = this.f35515;
        if (C14110.m32033(abstractC20461)) {
            return abstractC20461;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m29084() {
        Object obj = this._reusableCancellableContinuation;
        C8548 c8548 = obj instanceof C8548 ? (C8548) obj : null;
        if (c8548 != null) {
            c8548.m19955();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m29085() {
        return this._reusableCancellableContinuation != null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C8548 m29086() {
        C16672 c16672 = C18014.f53779;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = c16672;
                return null;
            }
            if (obj instanceof C8548) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35514;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c16672)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return (C8548) obj;
            }
            if (obj != c16672 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    @Override // p067l.AbstractC8822
    /* JADX INFO: renamed from: ܽ */
    public final Object mo19952() {
        Object obj = this.f35516;
        this.f35516 = C18014.f53780;
        return obj;
    }

    @Override // p067l.InterfaceC13575
    /* JADX INFO: renamed from: ֫ */
    public final void mo10744(Object obj) {
        AbstractC20461 abstractC20461 = this.f35515;
        InterfaceC16436 context = abstractC20461.getContext();
        Throwable thM13520 = C6004.m13520(obj);
        Object c19948 = thM13520 == null ? obj : new C19948(thM13520, false);
        AbstractC5196 abstractC5196 = this.f35517;
        if (abstractC5196.mo11136()) {
            this.f35516 = c19948;
            this.f23951 = 0;
            abstractC5196.mo8227(context, this);
            return;
        }
        AbstractC4799 abstractC4799M10076 = C4780.m10076();
        if (abstractC4799M10076.m10128()) {
            this.f35516 = c19948;
            this.f23951 = 0;
            abstractC4799M10076.m10124((AbstractC8822) this);
            return;
        }
        abstractC4799M10076.m10125(true);
        try {
            InterfaceC16436 context2 = abstractC20461.getContext();
            Object objM33528 = C14661.m33528(context2, this.f35518);
            try {
                abstractC20461.mo10744(obj);
                C10027 c10027 = C10027.f27775;
                C14661.m33527(context2, objM33528);
                while (abstractC4799M10076.m10130()) {
                }
            } catch (Throwable th) {
                C14661.m33527(context2, objM33528);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m20384(th2, (Throwable) null);
            } finally {
                abstractC4799M10076.m10126();
            }
        }
    }

    @Override // p067l.AbstractC8822
    /* JADX INFO: renamed from: ֫ */
    public final void mo19942(Object obj, CancellationException cancellationException) {
        if (obj instanceof C20619) {
            throw null;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f35517 + ", " + C12846.m29417((InterfaceC13575) this.f35515) + ']';
    }

    /* JADX INFO: renamed from: ֫ */
    public final Throwable m29082(C8548 c8548) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C16672 c16672 = C18014.f53779;
            if (obj == c16672) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35514;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c16672, c8548)) {
                    if (atomicReferenceFieldUpdater.get(this) != c16672) {
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f35514;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29083(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C16672 c16672 = C18014.f53779;
            if (C13045.m29864(obj, c16672)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35514;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c16672, th)) {
                    if (atomicReferenceFieldUpdater.get(this) != c16672) {
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f35514;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                }
            }
            return false;
        }
    }
}
