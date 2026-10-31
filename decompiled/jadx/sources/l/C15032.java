package l;

/* JADX INFO: renamed from: l.ܶۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N7UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15032 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f45808;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f45809;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f45810;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f45811;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f45812;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f45813;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15032 m35556(int i, AbstractC3577 abstractC3577) {
        if (abstractC3577 instanceof C5156) {
            return new C15032(i, (C5156) abstractC3577);
        }
        throw new RuntimeException();
    }

    public C15032(int i, C5156 c5156) {
        this.f45810 = i;
        this.f45813 = c5156.f16123;
        this.f45812 = c5156.f16122;
        this.f45808 = c5156.f16119;
        this.f45811 = c5156.f16121;
        this.f45809 = c5156.f16120;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15032.class == obj.getClass()) {
            C15032 c15032 = (C15032) obj;
            if (this.f45810 == c15032.f45810 && this.f45809 == c15032.f45809 && this.f45813.equals(c15032.f45813) && this.f45812.equals(c15032.f45812) && this.f45808.equals(c15032.f45808) && this.f45811.equals(c15032.f45811)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11010.m27349(C11010.m27349(C11010.m27349(C11010.m27349(this.f45810 * 31, 31, this.f45813), 31, this.f45812), 31, this.f45808), 31, this.f45811) + (this.f45809 ? 1231 : 1237);
    }
}
