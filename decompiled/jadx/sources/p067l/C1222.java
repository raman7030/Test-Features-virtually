package p067l;

/* JADX INFO: renamed from: l.۟᩵ */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1222 extends AbstractC1467 {
    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final void mo22443(C0915 c0915, Thread thread) {
        c0915.f7988 = thread;
    }

    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final void mo22444(C0915 c0915, C0915 c0916) {
        c0915.f7987 = c0916;
    }

    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22446(AbstractC1370 abstractC1370, C0915 c0915, C0915 c0916) {
        synchronized (abstractC1370) {
            if (abstractC1370.f34941 != c0915) {
                return false;
            }
            abstractC1370.f34941 = c0916;
            return true;
        }
    }

    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22447(AbstractC1370 abstractC1370, C1432 c1432, C1432 c1433) {
        synchronized (abstractC1370) {
            if (abstractC1370.f34942 != c1432) {
                return false;
            }
            abstractC1370.f34942 = c1433;
            return true;
        }
    }

    @Override // p067l.AbstractC1467
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22445(AbstractC1370 abstractC1370, Object obj, Object obj2) {
        synchronized (abstractC1370) {
            if (abstractC1370.f34943 != obj) {
                return false;
            }
            abstractC1370.f34943 = obj2;
            return true;
        }
    }
}
