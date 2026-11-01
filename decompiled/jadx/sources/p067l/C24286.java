package p067l;

/* JADX INFO: renamed from: l.᩺ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes.dex */
public final class C24286 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final int f76931;

    /* JADX INFO: renamed from: ᩹ */
    public final C19971 f76932;

    /* JADX INFO: renamed from: ֫ */
    public static void m53614(C24286 c24286, C3838 c3838, C24286 c24287) {
        c24286.getClass();
        c3838.m7530(c24286.f76932.f18866 - (c24287 == null ? 0 : c24287.f76932.f18866));
        c3838.m7530(c24286.f76931);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53613(C24286 c24286, int i, C24286 c24287) {
        int i2;
        if (c24287 == null) {
            i2 = 0;
        } else {
            c24286.getClass();
            i2 = c24287.f76932.f18866;
        }
        return C12981.m29759(c24286.f76931) + C12981.m29759(c24286.f76932.f18866 - i2) + i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C19971 c19971 = ((C24286) obj).f76932;
        C19971 c19972 = this.f76932;
        int iCompareTo = c19972.f60615.compareTo(c19971.f60615);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = c19972.f60619.compareTo(c19971.f60619);
        return iCompareTo2 != 0 ? iCompareTo2 : c19972.f60618.compareTo(c19971.f60618);
    }

    public C24286(C19971 c19971, int i) {
        this.f76932 = c19971;
        this.f76931 = i;
    }

    public C24286(C5651 c5651, C12556 c12556, C24286 c24286) {
        this.f76932 = (C19971) c5651.f13738.m3722(c12556.m28943() + (c24286 == null ? 0 : c24286.f76932.f18866));
        this.f76931 = c12556.m28943();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53616() {
        return (EnumC9242.STATIC.getValue() & this.f76931) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53615() {
        return (EnumC9242.FINAL.getValue() & this.f76931) != 0;
    }
}
