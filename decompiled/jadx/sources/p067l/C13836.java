package p067l;

/* JADX INFO: renamed from: l.۫֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9YI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13836 {

    /* JADX INFO: renamed from: ֫ */
    public final String f39093;

    /* JADX INFO: renamed from: ۧ */
    public final String f39094;

    /* JADX INFO: renamed from: ܳ */
    public final String f39095;

    /* JADX INFO: renamed from: ܽ */
    public final String f39096;

    /* JADX INFO: renamed from: ܿ */
    public final int f39097;

    /* JADX INFO: renamed from: ᩳ */
    public final String f39098;

    /* JADX INFO: renamed from: ᩻ */
    public final int f39099;

    /* JADX INFO: renamed from: ֫ */
    public static C13836 m31505(int i, AbstractC5769 abstractC5769) {
        if (abstractC5769 instanceof C24564) {
            return new C13836(i, (C24564) abstractC5769);
        }
        throw new RuntimeException();
    }

    public C13836(int i, C24564 c24564) {
        this.f39099 = i;
        this.f39094 = c24564.f77777;
        this.f39097 = c24564.f77780;
        this.f39093 = c24564.f77776;
        this.f39095 = c24564.f77779;
        this.f39098 = c24564.f77778;
        this.f39096 = c24564.f14159;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13836.class != obj.getClass()) {
            return false;
        }
        C13836 c13836 = (C13836) obj;
        if (this.f39099 == c13836.f39099 && this.f39097 == c13836.f39097 && this.f39094.equals(c13836.f39094) && this.f39093.equals(c13836.f39093) && this.f39095.equals(c13836.f39095)) {
            return this.f39098.equals(c13836.f39098);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39098.hashCode() + C12832.m29411(C12832.m29411((C12832.m29411(this.f39099 * 31, 31, this.f39094) + this.f39097) * 31, 31, this.f39093), 31, this.f39095);
    }
}
