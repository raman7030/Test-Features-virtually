package l;

/* JADX INFO: renamed from: l.۫ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G14L */
/* JADX INFO: loaded from: classes3.dex */
public final class C12185 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f36331;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11480 f36332;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f36333;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f36334;

    public C12185(C11480 c11480, String str, String str2, String str3) {
        this.f36332 = c11480;
        this.f36334 = str;
        this.f36333 = str2;
        this.f36331 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12185.class == obj.getClass()) {
            C12185 c12185 = (C12185) obj;
            String str = c12185.f36331;
            String str2 = c12185.f36333;
            String str3 = c12185.f36334;
            String str4 = this.f36334;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = this.f36333;
            if (str5 == null ? str2 != null : !str5.equals(str2)) {
                return false;
            }
            String str6 = this.f36331;
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
        String str = this.f36334;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f36333;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36331;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
