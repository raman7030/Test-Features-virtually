package l;

/* JADX INFO: renamed from: l.֫ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1899 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13687 f6410;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7338 f6411;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6412;

    public C1899(int i, C13687 c13687) {
        this.f6412 = i;
        this.f6410 = c13687;
    }

    public C1899(int i, C7338 c7338) {
        this.f6412 = i;
        this.f6411 = c7338;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1899.class == obj.getClass()) {
            C1899 c1899 = (C1899) obj;
            C7338 c7338 = c1899.f6411;
            C13687 c13687 = c1899.f6410;
            if (this.f6412 != c1899.f6412) {
                return false;
            }
            C13687 c13688 = this.f6410;
            if (c13688 == null ? c13687 != null : !c13688.equals(c13687)) {
                return false;
            }
            C7338 c7339 = this.f6411;
            if (c7339 != null) {
                return c7339.equals(c7338);
            }
            if (c7338 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f6412 * 31;
        C13687 c13687 = this.f6410;
        int iHashCode = (i + (c13687 != null ? c13687.hashCode() : 0)) * 31;
        C7338 c7338 = this.f6411;
        return iHashCode + (c7338 != null ? c7338.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6250() {
        return this.f6412;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13687 m6248() {
        return this.f6410;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7338 m6249() {
        return this.f6411;
    }
}
