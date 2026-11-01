package p067l;

/* JADX INFO: renamed from: l.ܺ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes4.dex */
public final class C17720 {

    /* JADX INFO: renamed from: ֫ */
    public final C23994 f52919;

    /* JADX INFO: renamed from: ۧ */
    public int f52920;

    /* JADX INFO: renamed from: ֫ */
    public static void m40271(C17720 c17720, C3838 c3838) {
        c17720.getClass();
        c3838.m7530(c17720.f52919.f18866);
        c3838.m7530(c17720.f52920);
    }

    public C17720(C23994 c23994, int i) {
        this.f52919 = c23994;
        this.f52920 = i;
    }

    public C17720(C5651 c5651, C12556 c12556) {
        this.f52919 = (C23994) c5651.f13727.m3722(c12556.m28943());
        this.f52920 = c12556.m28943();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m40270(C17720 c17720) {
        return C12981.m29759(c17720.f52920) + C12981.m29759(c17720.f52919.f18866);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40272() {
        return this.f52920;
    }

    public final int hashCode() {
        return (this.f52919.hashCode() * 31) + this.f52920;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17720.class.equals(obj.getClass())) {
            C17720 c17720 = (C17720) obj;
            if (this.f52919 == c17720.f52919 && this.f52920 == c17720.f52920) {
                return true;
            }
        }
        return false;
    }
}
