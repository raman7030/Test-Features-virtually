package p067l;

/* JADX INFO: renamed from: l.ۤۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8WD */
/* JADX INFO: loaded from: classes3.dex */
public final class C12125 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f33884;

    /* JADX INFO: renamed from: ۧ */
    public final String f33885;

    /* JADX INFO: renamed from: ܽ */
    public final String f33886;

    public C12125(String str, String str2, boolean z) {
        this.f33885 = str;
        this.f33884 = z;
        this.f33886 = str2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m28022() {
        return this.f33885;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28021() {
        return this.f33884;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m28023() {
        return this.f33886;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataUri{contentType='");
        sb.append(this.f33885);
        sb.append("', base64=");
        sb.append(this.f33884);
        sb.append(", data='");
        return C10965.m25286(sb, this.f33886, "'}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12125.class == obj.getClass()) {
            C12125 c12125 = (C12125) obj;
            String str = c12125.f33886;
            String str2 = c12125.f33885;
            if (this.f33884 != c12125.f33884) {
                return false;
            }
            String str3 = this.f33885;
            if (str3 == null ? str2 != null : !str3.equals(str2)) {
                return false;
            }
            String str4 = this.f33886;
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
        String str = this.f33885;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + (this.f33884 ? 1 : 0)) * 31;
        String str2 = this.f33886;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
