package p067l;

/* JADX INFO: renamed from: l.ᩴۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19964 {

    /* JADX INFO: renamed from: ֫ */
    public String f60594;

    /* JADX INFO: renamed from: ۜ */
    public int f60595;

    /* JADX INFO: renamed from: ۢ */
    public int f60596;

    /* JADX INFO: renamed from: ۧ */
    public int f60597;

    /* JADX INFO: renamed from: ܳ */
    public String f60598;

    /* JADX INFO: renamed from: ܽ */
    public int f60599;

    /* JADX INFO: renamed from: ܿ */
    public int f60600;

    /* JADX INFO: renamed from: ᩳ */
    public int f60601;

    /* JADX INFO: renamed from: ᩷ */
    public int f60602;

    /* JADX INFO: renamed from: ᩻ */
    public int f60603;

    /* JADX INFO: renamed from: ֫ */
    public final String m45303() {
        return this.f60594;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m45304() {
        return this.f60598;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m45306() {
        return this.f60602;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m45305() {
        return this.f60603;
    }

    public final String toString() {
        return "Attribute{name='" + this.f60594 + "', value='" + this.f60598 + "', nameLine=" + this.f60601 + ", nameColumn=" + this.f60597 + ", nameStartPosition=" + this.f60600 + ", nameEndPosition=" + this.f60599 + ", valueLine=" + this.f60602 + ", valueColumn=" + this.f60603 + ", valueStartPosition=" + this.f60596 + ", valueEndPosition=" + this.f60595 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19964.class == obj.getClass()) {
            C19964 c19964 = (C19964) obj;
            if (this.f60601 != c19964.f60601 || this.f60597 != c19964.f60597 || this.f60600 != c19964.f60600 || this.f60599 != c19964.f60599 || this.f60602 != c19964.f60602 || this.f60603 != c19964.f60603 || this.f60596 != c19964.f60596 || this.f60595 != c19964.f60595) {
                return false;
            }
            String str = this.f60594;
            if (str == null ? c19964.f60594 != null : !str.equals(c19964.f60594)) {
                return false;
            }
            String str2 = this.f60598;
            String str3 = c19964.f60598;
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
        String str = this.f60594;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f60598;
        return ((((((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f60601) * 31) + this.f60597) * 31) + this.f60600) * 31) + this.f60599) * 31) + this.f60602) * 31) + this.f60603) * 31) + this.f60596) * 31) + this.f60595;
    }
}
