package l;

/* JADX INFO: renamed from: l.ܺ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16153 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22755 f49753;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f49754;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38079(C16153 c16153, C1547 c1547) {
        c16153.getClass();
        c1547.m5301(c16153.f49753.f16032);
        c1547.m5301(c16153.f49754);
    }

    public C16153(C22755 c22755, int i) {
        this.f49753 = c22755;
        this.f49754 = i;
    }

    public C16153(C3454 c3454, C10720 c10720) {
        this.f49753 = (C22755) c3454.f10926.m1314(c10720.m26903());
        this.f49754 = c10720.m26903();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38078(C16153 c16153) {
        return C11166.m27697(c16153.f49754) + C11166.m27697(c16153.f49753.f16032);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38080() {
        return this.f49754;
    }

    public final int hashCode() {
        return (this.f49753.hashCode() * 31) + this.f49754;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16153.class.equals(obj.getClass())) {
            C16153 c16153 = (C16153) obj;
            if (this.f49753 == c16153.f49753 && this.f49754 == c16153.f49754) {
                return true;
            }
        }
        return false;
    }
}
