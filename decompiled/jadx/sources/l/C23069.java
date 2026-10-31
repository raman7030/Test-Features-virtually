package l;

/* JADX INFO: renamed from: l.᩺ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes.dex */
public final class C23069 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f74207;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f74208;

    public C23069(Object obj, Object obj2) {
        this.f74207 = obj;
        this.f74208 = obj2;
    }

    public final String toString() {
        return "Pair[" + this.f74207 + "," + this.f74208 + "]";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23069)) {
            return false;
        }
        C23069 c23069 = (C23069) obj;
        return C11003.equals(this.f74207, c23069.f74207) && C11003.equals(this.f74208, c23069.f74208);
    }

    public final int hashCode() {
        Object obj = this.f74208;
        Object obj2 = this.f74207;
        if (obj2 == null) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode() + 1;
        }
        if (obj == null) {
            return obj2.hashCode() + 2;
        }
        return obj.hashCode() + (obj2.hashCode() * 17);
    }
}
