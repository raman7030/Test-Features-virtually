package l;

/* JADX INFO: renamed from: l.ܿ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R3P1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17008 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C17008 f52163 = new C17008(-1, -1);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f52164;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f52165;

    static {
        new C17008(0, 0);
    }

    public C17008(int i, int i2) {
        C22632.m50631((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f52165 = i;
        this.f52164 = i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39892() {
        return this.f52165;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39891() {
        return this.f52164;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17008) {
            C17008 c17008 = (C17008) obj;
            if (this.f52165 == c17008.f52165 && this.f52164 == c17008.f52164) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f52165 + "x" + this.f52164;
    }

    public final int hashCode() {
        int i = this.f52165;
        return ((i >>> 16) | (i << 16)) ^ this.f52164;
    }
}
