package l;

/* JADX INFO: renamed from: l.۬ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8A6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12901 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f38712;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f38713;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38714;

    public C12901(String str, int i, String str2) {
        this.f38712 = str;
        this.f38714 = i;
        this.f38713 = str2;
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f38714), this.f38713) + (m31344() * 31);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m31340() {
        return this.f38712;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31342() {
        return this.f38714;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m31343(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12901) {
            return m31341(obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m31344() {
        return C11003.hash(this.f38712);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31341(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12901)) {
            return false;
        }
        return C11003.equals(this.f38712, ((C12901) obj).f38712);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12901)) {
            return false;
        }
        C12901 c12901 = (C12901) obj;
        return m31343(obj) && this.f38714 == c12901.f38714 && C11003.equals(this.f38713, c12901.f38713);
    }

    public final String toString() {
        String strM31340 = m31340();
        String strM14172 = strM31340 == null ? "null" : C4860.m14172("\"", strM31340, "\"");
        Integer numValueOf = Integer.valueOf(this.f38714);
        String str = this.f38713;
        return String.format("NetShareInfo1{netName: %s, type: %08x, remark: %s}", strM14172, numValueOf, str != null ? C4860.m14172("\"", str, "\"") : "null");
    }
}
