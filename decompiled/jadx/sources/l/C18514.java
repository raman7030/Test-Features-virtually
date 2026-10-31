package l;

/* JADX INFO: renamed from: l.ᩴۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18514 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f57373;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f57374;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f57375;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f57376;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f57377;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f57378;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f57379;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f57380;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f57381;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f57382;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m43025() {
        return this.f57373;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m43026() {
        return this.f57377;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m43028() {
        return this.f57381;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m43027() {
        return this.f57382;
    }

    public final String toString() {
        return "Attribute{name='" + this.f57373 + "', value='" + this.f57377 + "', nameLine=" + this.f57380 + ", nameColumn=" + this.f57376 + ", nameStartPosition=" + this.f57379 + ", nameEndPosition=" + this.f57378 + ", valueLine=" + this.f57381 + ", valueColumn=" + this.f57382 + ", valueStartPosition=" + this.f57375 + ", valueEndPosition=" + this.f57374 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18514.class == obj.getClass()) {
            C18514 c18514 = (C18514) obj;
            if (this.f57380 != c18514.f57380 || this.f57376 != c18514.f57376 || this.f57379 != c18514.f57379 || this.f57378 != c18514.f57378 || this.f57381 != c18514.f57381 || this.f57382 != c18514.f57382 || this.f57375 != c18514.f57375 || this.f57374 != c18514.f57374) {
                return false;
            }
            String str = this.f57373;
            if (str == null ? c18514.f57373 != null : !str.equals(c18514.f57373)) {
                return false;
            }
            String str2 = this.f57377;
            String str3 = c18514.f57377;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f57373;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f57377;
        return ((((((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f57380) * 31) + this.f57376) * 31) + this.f57379) * 31) + this.f57378) * 31) + this.f57381) * 31) + this.f57382) * 31) + this.f57375) * 31) + this.f57374;
    }
}
