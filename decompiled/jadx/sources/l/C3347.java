package l;

/* JADX INFO: renamed from: l.ۗܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: MAHH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3347 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f10598;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f10599;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f10600;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f10601;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f10602;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f10603;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f10604;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f10605;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f10606;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f10607;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f10608;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3347 m10246(int i, AbstractC3577 abstractC3577) {
        if (abstractC3577 instanceof C1936) {
            return new C3347(i, (C1936) abstractC3577);
        }
        if (abstractC3577 instanceof C6875) {
            return new C3347(i, (C6875) abstractC3577);
        }
        throw new RuntimeException();
    }

    public C3347(int i, C1936 c1936) {
        this.f10600 = i;
        this.f10607 = 0;
        this.f10604 = c1936.f6478;
        this.f10608 = c1936.f6481;
        this.f10601 = c1936.f6479;
        this.f10603 = c1936.f6482;
        this.f10606 = c1936.f11354;
        this.f10598 = c1936.f6477;
        this.f10605 = c1936.f6480;
        this.f10602 = true;
        this.f10599 = false;
    }

    public C3347(int i, C6875 c6875) {
        this.f10600 = i;
        this.f10607 = 1;
        this.f10604 = c6875.f21246;
        this.f10608 = c6875.f21245;
        this.f10601 = c6875.f21243;
        this.f10603 = c6875.f21247;
        this.f10606 = c6875.f11354;
        this.f10598 = c6875.f21242;
        this.f10605 = c6875.f21248;
        this.f10602 = c6875.f21244;
        this.f10599 = c6875.f21249;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3347.class != obj.getClass()) {
            return false;
        }
        C3347 c3347 = (C3347) obj;
        return this.f10600 == c3347.f10600 && this.f10607 == c3347.f10607 && this.f10608 == c3347.f10608 && this.f10605 == c3347.f10605 && this.f10602 == c3347.f10602 && this.f10599 == c3347.f10599 && this.f10604.equals(c3347.f10604) && this.f10601.equals(c3347.f10601) && this.f10603.equals(c3347.f10603) && this.f10598.equals(c3347.f10598);
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f10600), Integer.valueOf(this.f10607), this.f10604, Integer.valueOf(this.f10608), this.f10601, this.f10603, this.f10598, Boolean.valueOf(this.f10605), Boolean.valueOf(this.f10602), Boolean.valueOf(this.f10599));
    }
}
