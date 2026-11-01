package p067l;

/* JADX INFO: renamed from: l.᩻ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B55V */
/* JADX INFO: loaded from: classes.dex */
public final class C24874 {

    /* JADX INFO: renamed from: ֫ */
    public String f79458;

    /* JADX INFO: renamed from: ۧ */
    public String f79459;

    /* JADX INFO: renamed from: ܽ */
    public String f79460;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24874.class != obj.getClass()) {
            return false;
        }
        C24874 c24874 = (C24874) obj;
        if (C12826.equals(this.f79460, c24874.f79460)) {
            return C12826.equals(this.f79458, c24874.f79458);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f79460;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f79458;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
