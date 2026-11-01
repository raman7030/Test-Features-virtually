package p067l;

/* JADX INFO: renamed from: l.᩸֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8DM */
/* JADX INFO: loaded from: classes4.dex */
public final class C22559 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final double f71153;

    public C22559(double d) {
        this.f71153 = d;
    }

    /* JADX INFO: renamed from: ֫ */
    public final double m50586() {
        return this.f71153;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C22559 c22559) {
        double d = c22559.f71153;
        double d2 = this.f71153;
        if (d2 < d) {
            return -1;
        }
        return d2 == d ? 0 : 1;
    }
}
