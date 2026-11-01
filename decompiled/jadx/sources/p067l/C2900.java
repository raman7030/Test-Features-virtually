package p067l;

/* JADX INFO: renamed from: l.֡ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBF2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2900 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final C14260 f5015;

    /* JADX INFO: renamed from: ᩹ */
    public final int f5016;

    public C2900(C14260 c14260, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        this.f5016 = i;
        this.f5015 = c14260;
    }

    public final int hashCode() {
        return this.f5015.hashCode() + (this.f5016 * 31);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2900) && compareTo((C2900) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2900 c2900) {
        int i = c2900.f5016;
        int i2 = this.f5016;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f5015.compareTo((AbstractC15405) c2900.f5015);
    }

    /* JADX INFO: renamed from: ܽۧ */
    public final C14260 m4675() {
        return this.f5015;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m4673() {
        return this.f5016;
    }
}
