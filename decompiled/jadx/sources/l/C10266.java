package l;

/* JADX INFO: renamed from: l.ۤۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8WD */
/* JADX INFO: loaded from: classes3.dex */
public final class C10266 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f30920;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f30921;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f30922;

    public C10266(String str, String str2, boolean z) {
        this.f30921 = str;
        this.f30920 = z;
        this.f30922 = str2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m26000() {
        return this.f30921;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25999() {
        return this.f30920;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m26001() {
        return this.f30922;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataUri{contentType='");
        sb.append(this.f30921);
        sb.append("', base64=");
        sb.append(this.f30920);
        sb.append(", data='");
        return C9045.m23341(sb, this.f30922, "'}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10266.class == obj.getClass()) {
            C10266 c10266 = (C10266) obj;
            String str = c10266.f30922;
            String str2 = c10266.f30921;
            if (this.f30920 != c10266.f30920) {
                return false;
            }
            String str3 = this.f30921;
            if (str3 == null ? str2 != null : !str3.equals(str2)) {
                return false;
            }
            String str4 = this.f30922;
            if (str4 != null) {
                return str4.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f30921;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + (this.f30920 ? 1 : 0)) * 31;
        String str2 = this.f30922;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
