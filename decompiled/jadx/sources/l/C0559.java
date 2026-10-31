package l;

/* JADX INFO: renamed from: l.֡ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBF2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0559 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12512 f2241;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f2242;

    public C0559(C12512 c12512, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        this.f2242 = i;
        this.f2241 = c12512;
    }

    public final int hashCode() {
        return this.f2241.hashCode() + (this.f2242 * 31);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0559) && compareTo((C0559) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0559 c0559) {
        int i = c0559.f2242;
        int i2 = this.f2242;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f2241.compareTo((AbstractC13717) c0559.f2241);
    }

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public final C12512 m2307() {
        return this.f2241;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m2305() {
        return this.f2242;
    }
}
