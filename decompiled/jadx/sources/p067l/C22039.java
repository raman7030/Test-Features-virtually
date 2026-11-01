package p067l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩷ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAXM */
/* JADX INFO: loaded from: classes4.dex */
public class C22039 {
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    public volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69353 = AtomicReferenceFieldUpdater.newUpdater(C22039.class, Object.class, "_next");

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69354 = AtomicReferenceFieldUpdater.newUpdater(C22039.class, Object.class, "_prev");

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69352 = AtomicReferenceFieldUpdater.newUpdater(C22039.class, Object.class, "_removedRef");

    /* JADX INFO: renamed from: ܺ */
    public boolean mo42507() {
        return m49643() instanceof C2591;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C22039 m49639() {
        C22039 c22039;
        Object objM49643 = m49643();
        C2591 c2591 = objM49643 instanceof C2591 ? (C2591) objM49643 : null;
        return (c2591 == null || (c22039 = c2591.f4283) == null) ? (C22039) objM49643 : c22039;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C22039 m49642() {
        C22039 c22039M49633 = m49633();
        if (c22039M49633 != null) {
            return c22039M49633;
        }
        Object obj = this._prev;
        while (true) {
            C22039 c22039 = (C22039) obj;
            if (!c22039.mo42507()) {
                return c22039;
            }
            obj = c22039._prev;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49636(C24896 c24896) {
        f69354.lazySet(c24896, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69353;
        atomicReferenceFieldUpdater.lazySet(c24896, this);
        while (m49643() == this) {
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, this, c24896)) {
                    c24896.m49632(this);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49637(C22039 c22039, C18685 c18685) {
        f69354.lazySet(c22039, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69353;
        atomicReferenceFieldUpdater.lazySet(c22039, c18685);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c18685, c22039)) {
            if (atomicReferenceFieldUpdater.get(this) != c18685) {
                return false;
            }
        }
        c22039.m49632(c18685);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49635(C22039 c22039, C18685 c18685, AbstractC24720 abstractC24720) {
        f69354.lazySet(c22039, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69353;
        atomicReferenceFieldUpdater.lazySet(c22039, c18685);
        abstractC24720.f78232 = c18685;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c18685, abstractC24720)) {
            if (atomicReferenceFieldUpdater.get(this) != c18685) {
                return 0;
            }
        }
        return abstractC24720.mo35195(this) == null ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C22039 m49638() {
        while (true) {
            Object objM49643 = m49643();
            if (objM49643 instanceof C2591) {
                return ((C2591) objM49643).f4283;
            }
            if (objM49643 == this) {
                return (C22039) objM49643;
            }
            C22039 c22039 = (C22039) objM49643;
            C2591 c2591 = (C2591) c22039._removedRef;
            if (c2591 == null) {
                c2591 = new C2591(c22039);
                f69352.lazySet(c22039, c2591);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69353;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM49643, c2591)) {
                    c22039.m49633();
                    return null;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objM49643);
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m49641() {
        ((C2591) m49643()).f4283.m49640();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m49640() {
        C22039 c22039 = this;
        while (true) {
            Object objM49643 = c22039.m49643();
            if (objM49643 instanceof C2591) {
                c22039 = ((C2591) objM49643).f4283;
            } else {
                c22039.m49633();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private final C22039 m49633() {
        C22039 c22039;
        Object obj;
        loop0: while (true) {
            C22039 c220310 = (C22039) this._prev;
            c22039 = c220310;
            while (true) {
                C22039 c220311 = null;
                while (true) {
                    obj = c22039._next;
                    if (obj == this) {
                        if (c220310 != c22039) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69354;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, c220310, c22039)) {
                                if (atomicReferenceFieldUpdater.get(this) != c220310) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (mo42507()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof AbstractC20698) {
                        ((AbstractC20698) obj).mo35195(c22039);
                        break;
                    }
                    if (!(obj instanceof C2591)) {
                        c220311 = c22039;
                        c22039 = (C22039) obj;
                    } else {
                        if (c220311 != null) {
                            break;
                        }
                        c22039 = (C22039) c22039._prev;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f69353;
                C22039 c220312 = ((C2591) obj).f4283;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c220311, c22039, c220312)) {
                    if (atomicReferenceFieldUpdater2.get(c220311) != c22039) {
                        break;
                    }
                }
                c22039 = c220311;
            }
        }
        return c22039;
    }

    public String toString() {
        return new C8627(this) + '@' + C12846.m29416(this);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Object m49643() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC20698)) {
                return obj;
            }
            ((AbstractC20698) obj).mo35195(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public final void m49632(C22039 c22039) {
        while (true) {
            C22039 c220310 = (C22039) c22039._prev;
            if (m49643() != c22039) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69354;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c22039, c220310, this)) {
                    if (mo42507()) {
                        c22039.m49633();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c22039) == c220310);
        }
    }
}
