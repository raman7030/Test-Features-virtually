package l;

/* JADX INFO: renamed from: l.᩻ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B55V */
/* JADX INFO: loaded from: classes.dex */
public final class C23680 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f76708;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f76709;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f76710;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23680.class != obj.getClass()) {
            return false;
        }
        C23680 c23680 = (C23680) obj;
        if (C11003.equals(this.f76710, c23680.f76710)) {
            return C11003.equals(this.f76708, c23680.f76708);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f76710;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76708;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
