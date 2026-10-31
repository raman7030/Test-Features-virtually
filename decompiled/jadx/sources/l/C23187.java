package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23187 extends AbstractC12604 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f74527;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f74528;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f74529;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f74530;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f74531;

    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20465(AbstractC10635 abstractC10635, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f74528;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC10635, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC10635) == obj);
        return false;
    }

    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20466(AbstractC10635 abstractC10635, C1462 c1462, C1462 c1463) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f74530;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC10635, c1462, c1463)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC10635) == c1462);
        return false;
    }

    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20467(AbstractC10635 abstractC10635, C11899 c11899, C11899 c118910) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f74527;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC10635, c11899, c118910)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC10635) == c11899);
        return false;
    }

    public C23187(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f74531 = atomicReferenceFieldUpdater;
        this.f74529 = atomicReferenceFieldUpdater2;
        this.f74530 = atomicReferenceFieldUpdater3;
        this.f74527 = atomicReferenceFieldUpdater4;
        this.f74528 = atomicReferenceFieldUpdater5;
    }

    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫ */
    public final void mo20463(C1462 c1462, Thread thread) {
        this.f74531.lazySet(c1462, thread);
    }

    @Override // l.AbstractC12604
    /* JADX INFO: renamed from: ֫ */
    public final void mo20464(C1462 c1462, C1462 c1463) {
        this.f74529.lazySet(c1462, c1463);
    }
}
