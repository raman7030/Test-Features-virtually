package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۧۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AY1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10819 extends AbstractC6790 implements InterfaceC19742, InterfaceC11791 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32538 = AtomicReferenceFieldUpdater.newUpdater(C10819.class, Object.class, "_reusableCancellableContinuation");
    public volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC19036 f32539;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f32540;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC2975 f32541;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f32542;

    @Override // l.InterfaceC11791
    public final InterfaceC14801 getContext() {
        return this.f32539.getContext();
    }

    @Override // l.AbstractC6790
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11791 mo17992() {
        return this;
    }

    public C10819(AbstractC2975 abstractC2975, AbstractC19036 abstractC19036) {
        super(-1);
        this.f32541 = abstractC2975;
        this.f32539 = abstractC19036;
        this.f32540 = C16462.f50602;
        this.f32542 = C12934.m31439(abstractC19036.getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // l.InterfaceC19742
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19742 mo3350() {
        AbstractC19036 abstractC19036 = this.f32539;
        if (C12354.m29972(abstractC19036)) {
            return abstractC19036;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m27039() {
        Object obj = this._reusableCancellableContinuation;
        C6502 c6502 = obj instanceof C6502 ? (C6502) obj : null;
        if (c6502 != null) {
            c6502.m18006();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m27040() {
        return this._reusableCancellableContinuation != null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6502 m27041() {
        C15050 c15050 = C16462.f50601;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = c15050;
                return null;
            }
            if (obj instanceof C6502) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32538;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c15050)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return (C6502) obj;
            }
            if (obj != c15050 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    @Override // l.AbstractC6790
    /* JADX INFO: renamed from: ܽ */
    public final Object mo18003() {
        Object obj = this.f32540;
        this.f32540 = C16462.f50602;
        return obj;
    }

    @Override // l.InterfaceC11791
    /* JADX INFO: renamed from: ֫ */
    public final void mo8683(Object obj) {
        AbstractC19036 abstractC19036 = this.f32539;
        InterfaceC14801 context = abstractC19036.getContext();
        Throwable thM11584 = C3825.m11584(obj);
        Object c18497 = thM11584 == null ? obj : new C18497(thM11584, false);
        AbstractC2975 abstractC2975 = this.f32541;
        if (abstractC2975.mo9084()) {
            this.f32540 = c18497;
            this.f21073 = 0;
            abstractC2975.mo6030(context, this);
            return;
        }
        AbstractC2557 abstractC2557M8046 = C2537.m8046();
        if (abstractC2557M8046.m8096()) {
            this.f32540 = c18497;
            this.f21073 = 0;
            abstractC2557M8046.m8092((AbstractC6790) this);
            return;
        }
        abstractC2557M8046.m8093(true);
        try {
            InterfaceC14801 context2 = abstractC19036.getContext();
            Object objM31441 = C12934.m31441(context2, this.f32542);
            try {
                abstractC19036.mo8683(obj);
                C8058 c8058 = C8058.f24861;
                C12934.m31440(context2, objM31441);
                while (abstractC2557M8046.m8098()) {
                }
            } catch (Throwable th) {
                C12934.m31440(context2, objM31441);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m18435(th2, (Throwable) null);
            } finally {
                abstractC2557M8046.m8094();
            }
        }
    }

    @Override // l.AbstractC6790
    /* JADX INFO: renamed from: ֫ */
    public final void mo17993(Object obj, CancellationException cancellationException) {
        if (obj instanceof C19203) {
            throw null;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f32541 + ", " + C11024.m27355((InterfaceC11791) this.f32539) + ']';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable m27037(C6502 c6502) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C15050 c15050 = C16462.f50601;
            if (obj == c15050) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32538;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c15050, c6502)) {
                    if (atomicReferenceFieldUpdater.get(this) != c15050) {
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f32538;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27038(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C15050 c15050 = C16462.f50601;
            if (C11233.m27802(obj, c15050)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32538;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c15050, th)) {
                    if (atomicReferenceFieldUpdater.get(this) != c15050) {
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f32538;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                }
            }
            return false;
        }
    }
}
