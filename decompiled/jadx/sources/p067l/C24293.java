package p067l;

/* JADX INFO: renamed from: l.᩺ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes.dex */
public final class C24293 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f76952;

    /* JADX INFO: renamed from: ۧ */
    public final Object f76953;

    public C24293(Object obj, Object obj2) {
        this.f76952 = obj;
        this.f76953 = obj2;
    }

    public final String toString() {
        return "Pair[" + this.f76952 + "," + this.f76953 + "]";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24293)) {
            return false;
        }
        C24293 c24293 = (C24293) obj;
        return C12826.equals(this.f76952, c24293.f76952) && C12826.equals(this.f76953, c24293.f76953);
    }

    public final int hashCode() {
        Object obj = this.f76953;
        Object obj2 = this.f76952;
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
