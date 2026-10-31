package l;

/* JADX INFO: renamed from: l.᩸֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8DM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21245 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final double f68471;

    public C21245(double d) {
        this.f68471 = d;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m48255() {
        return this.f68471;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C21245 c21245) {
        double d = c21245.f68471;
        double d2 = this.f68471;
        if (d2 < d) {
            return -1;
        }
        return d2 == d ? 0 : 1;
    }
}
