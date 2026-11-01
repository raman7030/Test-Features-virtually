package p067l;

/* JADX INFO: renamed from: l.ܰܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C15568 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final C23324 f44483;

    /* JADX INFO: renamed from: ᩸ */
    public final int f44484;

    /* JADX INFO: renamed from: ᩹ */
    public final C6322 f44485;

    /* JADX INFO: renamed from: ֫ */
    public static void m35418(C15568 c15568, C3838 c3838, C15568 c15569) {
        c15568.getClass();
        c3838.m7530(c15568.f44483.f18866 - (c15569 == null ? 0 : c15569.f44483.f18866));
        c3838.m7530(c15568.f44484);
        C6322 c6322 = c15568.f44485;
        c3838.m7530(c6322 != null ? c6322.f18864 : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m35417(C15568 c15568, int i, C15568 c15569) {
        int i2;
        if (c15569 == null) {
            i2 = 0;
        } else {
            c15568.getClass();
            i2 = c15569.f44483.f18866;
        }
        int iM29759 = C12981.m29759(c15568.f44484) + C12981.m29759(c15568.f44483.f18866 - i2) + i;
        C6322 c6322 = c15568.f44485;
        return iM29759 + (c6322 == null ? 1 : C12981.m29759(c6322.f18864));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f44483.compareTo(((C15568) obj).f44483);
    }

    public C15568(C23324 c23324, int i, C6322 c6322) {
        this.f44483 = c23324;
        this.f44484 = i;
        this.f44485 = c6322;
        if (c6322 != null) {
            c6322.m14456(this);
        }
    }

    public C15568(C5651 c5651, C13936 c13936, C12556 c12556, C15568 c15568) {
        this.f44483 = (C23324) c5651.f13730.m3722(c12556.m28943() + (c15568 == null ? 0 : c15568.f44483.f18866));
        this.f44484 = c12556.m28943();
        C6322 c6322 = (C6322) c13936.m31713(EnumC16617.TYPE_CODE_ITEM, c12556.m28943());
        this.f44485 = c6322;
        if (c6322 != null) {
            c6322.m14456(this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35419() {
        return (((EnumC9242.STATIC.getValue() | EnumC9242.PRIVATE.getValue()) | EnumC9242.CONSTRUCTOR.getValue()) & this.f44484) != 0;
    }
}
