package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩻ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes.dex */
public final class C23738 extends AbstractC14565 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f76862 = AtomicReferenceFieldUpdater.newUpdater(C15976.class, Thread.class, "ۧ");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f76860 = AtomicReferenceFieldUpdater.newUpdater(C15976.class, C15976.class, "֫");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f76861 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2572.class, C15976.class, "᩶");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f76858 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2572.class, C11039.class, "᩸");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f76859 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2572.class, Object.class, "᩹");

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18450(AbstractC2572 abstractC2572, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f76859;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2572, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2572) == obj);
        return false;
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18451(AbstractC2572 abstractC2572, C11039 c11039, C11039 c110310) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f76858;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2572, c11039, c110310)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2572) == c11039);
        return false;
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18452(AbstractC2572 abstractC2572, C15976 c15976, C15976 c15977) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f76861;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2572, c15976, c15977)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2572) == c15976);
        return false;
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final C15976 mo18447(AbstractC2572 abstractC2572) {
        return (C15976) f76861.getAndSet(abstractC2572, C15976.f49301);
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final void mo18448(C15976 c15976, Thread thread) {
        f76862.lazySet(c15976, thread);
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final void mo18449(C15976 c15976, C15976 c15977) {
        f76860.lazySet(c15976, c15977);
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final C11039 mo18446(AbstractC2572 abstractC2572, C11039 c11039) {
        return (C11039) f76858.getAndSet(abstractC2572, c11039);
    }
}
