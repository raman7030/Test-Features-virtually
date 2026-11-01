package p067l;

/* JADX INFO: renamed from: l.֫ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4173 {

    /* JADX INFO: renamed from: ֫ */
    public C15376 f9191;

    /* JADX INFO: renamed from: ۧ */
    public C9342 f9192;

    /* JADX INFO: renamed from: ܽ */
    public int f9193;

    public C4173(int i, C15376 c15376) {
        this.f9193 = i;
        this.f9191 = c15376;
    }

    public C4173(int i, C9342 c9342) {
        this.f9193 = i;
        this.f9192 = c9342;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4173.class == obj.getClass()) {
            C4173 c4173 = (C4173) obj;
            C9342 c9342 = c4173.f9192;
            C15376 c15376 = c4173.f9191;
            if (this.f9193 != c4173.f9193) {
                return false;
            }
            C15376 c15377 = this.f9191;
            if (c15377 == null ? c15376 != null : !c15377.equals(c15376)) {
                return false;
            }
            C9342 c9343 = this.f9192;
            if (c9343 != null) {
                return c9343.equals(c9342);
            }
            if (c9342 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9193 * 31;
        C15376 c15376 = this.f9191;
        int iHashCode = (i + (c15376 != null ? c15376.hashCode() : 0)) * 31;
        C9342 c9342 = this.f9192;
        return iHashCode + (c9342 != null ? c9342.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m8452() {
        return this.f9193;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15376 m8450() {
        return this.f9191;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9342 m8451() {
        return this.f9192;
    }
}
