package l;

/* JADX INFO: renamed from: l.ۜܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6805 extends AbstractC14565 {
    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15976 mo18447(AbstractC2572 abstractC2572) {
        C15976 c15976;
        C15976 c15977 = C15976.f49301;
        synchronized (abstractC2572) {
            c15976 = abstractC2572.f8128;
            if (c15976 != c15977) {
                abstractC2572.f8128 = c15977;
            }
        }
        return c15976;
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18448(C15976 c15976, Thread thread) {
        c15976.f49303 = thread;
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18449(C15976 c15976, C15976 c15977) {
        c15976.f49302 = c15977;
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo18452(AbstractC2572 abstractC2572, C15976 c15976, C15976 c15977) {
        synchronized (abstractC2572) {
            if (abstractC2572.f8128 != c15976) {
                return false;
            }
            abstractC2572.f8128 = c15977;
            return true;
        }
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo18451(AbstractC2572 abstractC2572, C11039 c11039, C11039 c110310) {
        synchronized (abstractC2572) {
            if (abstractC2572.f8129 != c11039) {
                return false;
            }
            abstractC2572.f8129 = c110310;
            return true;
        }
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11039 mo18446(AbstractC2572 abstractC2572, C11039 c11039) {
        C11039 c110310;
        synchronized (abstractC2572) {
            c110310 = abstractC2572.f8129;
            if (c110310 != c11039) {
                abstractC2572.f8129 = c11039;
            }
        }
        return c110310;
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo18450(AbstractC2572 abstractC2572, Object obj, Object obj2) {
        synchronized (abstractC2572) {
            if (abstractC2572.f8130 != obj) {
                return false;
            }
            abstractC2572.f8130 = obj2;
            return true;
        }
    }
}
