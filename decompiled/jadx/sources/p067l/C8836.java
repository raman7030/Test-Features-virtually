package p067l;

/* JADX INFO: renamed from: l.ۜܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8836 extends AbstractC16211 {
    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final C17552 mo20396(AbstractC4813 abstractC4813) {
        C17552 c17552;
        C17552 c17553 = C17552.f52459;
        synchronized (abstractC4813) {
            c17552 = abstractC4813.f10918;
            if (c17552 != c17553) {
                abstractC4813.f10918 = c17553;
            }
        }
        return c17552;
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final void mo20397(C17552 c17552, Thread thread) {
        c17552.f52461 = thread;
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final void mo20398(C17552 c17552, C17552 c17553) {
        c17552.f52460 = c17553;
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20401(AbstractC4813 abstractC4813, C17552 c17552, C17552 c17553) {
        synchronized (abstractC4813) {
            if (abstractC4813.f10918 != c17552) {
                return false;
            }
            abstractC4813.f10918 = c17553;
            return true;
        }
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20400(AbstractC4813 abstractC4813, C12860 c12860, C12860 c12861) {
        synchronized (abstractC4813) {
            if (abstractC4813.f10919 != c12860) {
                return false;
            }
            abstractC4813.f10919 = c12861;
            return true;
        }
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final C12860 mo20395(AbstractC4813 abstractC4813, C12860 c12860) {
        C12860 c12861;
        synchronized (abstractC4813) {
            c12861 = abstractC4813.f10919;
            if (c12861 != c12860) {
                abstractC4813.f10919 = c12860;
            }
        }
        return c12861;
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20399(AbstractC4813 abstractC4813, Object obj, Object obj2) {
        synchronized (abstractC4813) {
            if (abstractC4813.f10920 != obj) {
                return false;
            }
            abstractC4813.f10920 = obj2;
            return true;
        }
    }
}
