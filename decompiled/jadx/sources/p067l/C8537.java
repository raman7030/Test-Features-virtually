package p067l;

/* JADX INFO: renamed from: l.ۜۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes2.dex */
public class C8537 {

    /* JADX INFO: renamed from: ᩸ */
    public Object f22916;

    /* JADX INFO: renamed from: ᩹ */
    public Object f22917;

    public C8537(Object obj, Object obj2) {
        this.f22916 = obj;
        this.f22917 = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8537 c8537 = (C8537) obj;
        if (this.f22916.equals(c8537.f22916)) {
            return this.f22917.equals(c8537.f22917);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f22916;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f22917;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{ " + this.f22916 + ", " + this.f22917 + " }";
    }
}
