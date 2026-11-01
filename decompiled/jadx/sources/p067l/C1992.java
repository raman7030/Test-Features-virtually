package p067l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩺᩵ */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1992 extends AbstractC1467 {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicReferenceFieldUpdater f77270;

    /* JADX INFO: renamed from: ۧ */
    public final AtomicReferenceFieldUpdater f77271;

    /* JADX INFO: renamed from: ܽ */
    public final AtomicReferenceFieldUpdater f77272;

    /* JADX INFO: renamed from: ܿ */
    public final AtomicReferenceFieldUpdater f77273;

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicReferenceFieldUpdater f77274;

    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22445(AbstractC1370 abstractC1370, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f77271;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1370, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1370) == obj);
        return false;
    }

    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22446(AbstractC1370 abstractC1370, C0915 c0915, C0915 c0916) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f77273;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1370, c0915, c0916)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1370) == c0915);
        return false;
    }

    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22447(AbstractC1370 abstractC1370, C1432 c1432, C1432 c1433) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f77270;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1370, c1432, c1433)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1370) == c1432);
        return false;
    }

    public C1992(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f77274 = atomicReferenceFieldUpdater;
        this.f77272 = atomicReferenceFieldUpdater2;
        this.f77273 = atomicReferenceFieldUpdater3;
        this.f77270 = atomicReferenceFieldUpdater4;
        this.f77271 = atomicReferenceFieldUpdater5;
    }

    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final void mo22443(C0915 c0915, Thread thread) {
        this.f77274.lazySet(c0915, thread);
    }

    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final void mo22444(C0915 c0915, C0915 c0916) {
        this.f77272.lazySet(c0915, c0916);
    }
}
