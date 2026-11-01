package p067l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩻ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes.dex */
public final class C24929 extends AbstractC16211 {

    /* JADX INFO: renamed from: ᩳ */
    public static final AtomicReferenceFieldUpdater f79613 = AtomicReferenceFieldUpdater.newUpdater(C17552.class, Thread.class, "ۧ");

    /* JADX INFO: renamed from: ܽ */
    public static final AtomicReferenceFieldUpdater f79611 = AtomicReferenceFieldUpdater.newUpdater(C17552.class, C17552.class, "֫");

    /* JADX INFO: renamed from: ܿ */
    public static final AtomicReferenceFieldUpdater f79612 = AtomicReferenceFieldUpdater.newUpdater(AbstractC4813.class, C17552.class, "᩶");

    /* JADX INFO: renamed from: ֫ */
    public static final AtomicReferenceFieldUpdater f79609 = AtomicReferenceFieldUpdater.newUpdater(AbstractC4813.class, C12860.class, "᩸");

    /* JADX INFO: renamed from: ۧ */
    public static final AtomicReferenceFieldUpdater f79610 = AtomicReferenceFieldUpdater.newUpdater(AbstractC4813.class, Object.class, "᩹");

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20399(AbstractC4813 abstractC4813, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f79610;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4813, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4813) == obj);
        return false;
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20400(AbstractC4813 abstractC4813, C12860 c12860, C12860 c12861) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f79609;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4813, c12860, c12861)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4813) == c12860);
        return false;
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20401(AbstractC4813 abstractC4813, C17552 c17552, C17552 c17553) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f79612;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4813, c17552, c17553)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4813) == c17552);
        return false;
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final C17552 mo20396(AbstractC4813 abstractC4813) {
        return (C17552) f79612.getAndSet(abstractC4813, C17552.f52459);
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final void mo20397(C17552 c17552, Thread thread) {
        f79613.lazySet(c17552, thread);
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final void mo20398(C17552 c17552, C17552 c17553) {
        f79611.lazySet(c17552, c17553);
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final C12860 mo20395(AbstractC4813 abstractC4813, C12860 c12860) {
        return (C12860) f79609.getAndSet(abstractC4813, c12860);
    }
}
