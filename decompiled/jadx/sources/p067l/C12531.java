package p067l;

/* JADX INFO: renamed from: l.ۧ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12531 {

    /* JADX INFO: renamed from: ֫ */
    public final int f35158;

    /* JADX INFO: renamed from: ۧ */
    public final int f35159;

    public C12531(int i, int i2) {
        this.f35158 = i;
        this.f35159 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12531.class == obj.getClass()) {
            C12531 c12531 = (C12531) obj;
            if (this.f35158 == c12531.f35158 && this.f35159 == c12531.f35159) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f35158 * 31) + this.f35159;
    }
}
