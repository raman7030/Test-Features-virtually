package p067l;

/* JADX INFO: renamed from: l.ܿ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R3P1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18532 {

    /* JADX INFO: renamed from: ܽ */
    public static final C18532 f55343 = new C18532(-1, -1);

    /* JADX INFO: renamed from: ֫ */
    public final int f55344;

    /* JADX INFO: renamed from: ۧ */
    public final int f55345;

    static {
        new C18532(0, 0);
    }

    public C18532(int i, int i2) {
        C23877.m52957((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f55345 = i;
        this.f55344 = i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m42135() {
        return this.f55345;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m42134() {
        return this.f55344;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18532) {
            C18532 c18532 = (C18532) obj;
            if (this.f55345 == c18532.f55345 && this.f55344 == c18532.f55344) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f55345 + "x" + this.f55344;
    }

    public final int hashCode() {
        int i = this.f55345;
        return ((i >>> 16) | (i << 16)) ^ this.f55344;
    }
}
