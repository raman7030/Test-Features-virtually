package p067l;

/* JADX INFO: renamed from: l.۫ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G14L */
/* JADX INFO: loaded from: classes3.dex */
public final class C13949 {

    /* JADX INFO: renamed from: ֫ */
    public final String f39342;

    /* JADX INFO: renamed from: ۧ */
    public final C13279 f39343;

    /* JADX INFO: renamed from: ܽ */
    public final String f39344;

    /* JADX INFO: renamed from: ᩳ */
    public final String f39345;

    public C13949(C13279 c13279, String str, String str2, String str3) {
        this.f39343 = c13279;
        this.f39345 = str;
        this.f39344 = str2;
        this.f39342 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13949.class == obj.getClass()) {
            C13949 c13949 = (C13949) obj;
            String str = c13949.f39342;
            String str2 = c13949.f39344;
            String str3 = c13949.f39345;
            String str4 = this.f39345;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = this.f39344;
            if (str5 == null ? str2 != null : !str5.equals(str2)) {
                return false;
            }
            String str6 = this.f39342;
            if (str6 != null) {
                return str6.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39345;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f39344;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39342;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
