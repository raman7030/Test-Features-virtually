package p067l;

/* JADX INFO: renamed from: l.᩸ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U58U */
/* JADX INFO: loaded from: classes.dex */
public final class C23048 {

    /* JADX INFO: renamed from: ֫ */
    public final String f72433;

    /* JADX INFO: renamed from: ۧ */
    public final String f72434;

    public C23048(String str, String str2) {
        this.f72433 = C5792.m13024(str);
        this.f72434 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23048.class == obj.getClass()) {
            C23048 c23048 = (C23048) obj;
            if (C12826.equals(this.f72433, c23048.f72433) && C12826.equals(this.f72434, c23048.f72434)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f72434.hashCode() * 31;
        String str = this.f72433;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    static {
        C5792.m13032(0);
        C5792.m13032(1);
    }
}
