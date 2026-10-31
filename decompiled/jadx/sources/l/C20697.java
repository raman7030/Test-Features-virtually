package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩷ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAXM */
/* JADX INFO: loaded from: classes4.dex */
public class C20697 {
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    public volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66672 = AtomicReferenceFieldUpdater.newUpdater(C20697.class, Object.class, "_next");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66673 = AtomicReferenceFieldUpdater.newUpdater(C20697.class, Object.class, "_prev");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66671 = AtomicReferenceFieldUpdater.newUpdater(C20697.class, Object.class, "_removedRef");

    /* JADX INFO: renamed from: ܺ */
    public boolean mo40262() {
        return m47316() instanceof C0234;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20697 m47312() {
        C20697 c20697;
        Object objM47316 = m47316();
        C0234 c0234 = objM47316 instanceof C0234 ? (C0234) objM47316 : null;
        return (c0234 == null || (c20697 = c0234.f1504) == null) ? (C20697) objM47316 : c20697;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20697 m47315() {
        C20697 c20697M47306 = m47306();
        if (c20697M47306 != null) {
            return c20697M47306;
        }
        Object obj = this._prev;
        while (true) {
            C20697 c20697 = (C20697) obj;
            if (!c20697.mo40262()) {
                return c20697;
            }
            obj = c20697._prev;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47309(C23703 c23703) {
        f66673.lazySet(c23703, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66672;
        atomicReferenceFieldUpdater.lazySet(c23703, this);
        while (m47316() == this) {
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, this, c23703)) {
                    c23703.m47305(this);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == this);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47310(C20697 c20697, C17168 c17168) {
        f66673.lazySet(c20697, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66672;
        atomicReferenceFieldUpdater.lazySet(c20697, c17168);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c17168, c20697)) {
            if (atomicReferenceFieldUpdater.get(this) != c17168) {
                return false;
            }
        }
        c20697.m47305(c17168);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47308(C20697 c20697, C17168 c17168, AbstractC23518 abstractC23518) {
        f66673.lazySet(c20697, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66672;
        atomicReferenceFieldUpdater.lazySet(c20697, c17168);
        abstractC23518.f75486 = c17168;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c17168, abstractC23518)) {
            if (atomicReferenceFieldUpdater.get(this) != c17168) {
                return 0;
            }
        }
        return abstractC23518.mo33080(this) == null ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20697 m47311() {
        while (true) {
            Object objM47316 = m47316();
            if (objM47316 instanceof C0234) {
                return ((C0234) objM47316).f1504;
            }
            if (objM47316 == this) {
                return (C20697) objM47316;
            }
            C20697 c20697 = (C20697) objM47316;
            C0234 c0234 = (C0234) c20697._removedRef;
            if (c0234 == null) {
                c0234 = new C0234(c20697);
                f66671.lazySet(c20697, c0234);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66672;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM47316, c0234)) {
                    c20697.m47306();
                    return null;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objM47316);
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m47314() {
        ((C0234) m47316()).f1504.m47313();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m47313() {
        C20697 c20697 = this;
        while (true) {
            Object objM47316 = c20697.m47316();
            if (objM47316 instanceof C0234) {
                c20697 = ((C0234) objM47316).f1504;
            } else {
                c20697.m47306();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private final C20697 m47306() {
        C20697 c20697;
        Object obj;
        loop0: while (true) {
            C20697 c20698 = (C20697) this._prev;
            c20697 = c20698;
            while (true) {
                C20697 c20699 = null;
                while (true) {
                    obj = c20697._next;
                    if (obj == this) {
                        if (c20698 != c20697) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66673;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, c20698, c20697)) {
                                if (atomicReferenceFieldUpdater.get(this) != c20698) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (mo40262()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof AbstractC19286) {
                        ((AbstractC19286) obj).mo33080(c20697);
                        break;
                    }
                    if (!(obj instanceof C0234)) {
                        c20699 = c20697;
                        c20697 = (C20697) obj;
                    } else {
                        if (c20699 != null) {
                            break;
                        }
                        c20697 = (C20697) c20697._prev;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f66672;
                C20697 c206910 = ((C0234) obj).f1504;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c20699, c20697, c206910)) {
                    if (atomicReferenceFieldUpdater2.get(c20699) != c20697) {
                        break;
                    }
                }
                c20697 = c20699;
            }
        }
        return c20697;
    }

    public String toString() {
        return new C6585(this) + '@' + C11024.m27354(this);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object m47316() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC19286)) {
                return obj;
            }
            ((AbstractC19286) obj).mo33080(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47305(C20697 c20697) {
        while (true) {
            C20697 c20698 = (C20697) c20697._prev;
            if (m47316() != c20697) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66673;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c20697, c20698, this)) {
                    if (mo40262()) {
                        c20697.m47306();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c20697) == c20698);
        }
    }
}
