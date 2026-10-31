package l;

/* JADX INFO: renamed from: l.ܰܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C13889 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22050 f41402;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f41403;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4160 f41404;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33299(C13889 c13889, C1547 c1547, C13889 c138810) {
        c13889.getClass();
        c1547.m5301(c13889.f41402.f16032 - (c138810 == null ? 0 : c138810.f41402.f16032));
        c1547.m5301(c13889.f41403);
        C4160 c4160 = c13889.f41404;
        c1547.m5301(c4160 != null ? c4160.f16030 : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m33298(C13889 c13889, int i, C13889 c138810) {
        int i2;
        if (c138810 == null) {
            i2 = 0;
        } else {
            c13889.getClass();
            i2 = c138810.f41402.f16032;
        }
        int iM27697 = C11166.m27697(c13889.f41403) + C11166.m27697(c13889.f41402.f16032 - i2) + i;
        C4160 c4160 = c13889.f41404;
        return iM27697 + (c4160 == null ? 1 : C11166.m27697(c4160.f16030));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f41402.compareTo(((C13889) obj).f41402);
    }

    public C13889(C22050 c22050, int i, C4160 c4160) {
        this.f41402 = c22050;
        this.f41403 = i;
        this.f41404 = c4160;
        if (c4160 != null) {
            c4160.m12582(this);
        }
    }

    public C13889(C3454 c3454, C12172 c12172, C10720 c10720, C13889 c13889) {
        this.f41402 = (C22050) c3454.f10929.m1314(c10720.m26903() + (c13889 == null ? 0 : c13889.f41402.f16032));
        this.f41403 = c10720.m26903();
        C4160 c4160 = (C4160) c12172.m29651(EnumC14993.TYPE_CODE_ITEM, c10720.m26903());
        this.f41404 = c4160;
        if (c4160 != null) {
            c4160.m12582(this);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33300() {
        return (((EnumC7233.STATIC.getValue() | EnumC7233.PRIVATE.getValue()) | EnumC7233.CONSTRUCTOR.getValue()) & this.f41403) != 0;
    }
}
