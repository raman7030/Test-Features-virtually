package p067l;

/* JADX INFO: renamed from: l.ᩴۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K250 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20101 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final C14930 f62196;

    /* JADX INFO: renamed from: ᩹ */
    public final C14930 f62197;

    /* JADX INFO: renamed from: ֫ */
    public static C20101 m45523(C14930 c14930, C14930 c14931) {
        if (c14930 == null && c14931 == null) {
            return null;
        }
        return new C20101(c14930, c14931);
    }

    public C20101(C14930 c14930, C14930 c14931) {
        this.f62196 = c14930;
        this.f62197 = c14931;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C20101) && compareTo((C20101) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C20101 c20101) {
        int iCompareTo;
        AbstractC15405 abstractC15405 = c20101.f62196;
        C14930 c14930 = this.f62196;
        if (c14930 == abstractC15405) {
            iCompareTo = 0;
        } else if (c14930 == null) {
            iCompareTo = -1;
        } else {
            iCompareTo = abstractC15405 == null ? 1 : c14930.compareTo(abstractC15405);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        AbstractC15405 abstractC15406 = c20101.f62197;
        C14930 c14931 = this.f62197;
        if (c14931 == abstractC15406) {
            return 0;
        }
        if (c14931 == null) {
            return -1;
        }
        if (abstractC15406 == null) {
            return 1;
        }
        return c14931.compareTo(abstractC15406);
    }

    public final int hashCode() {
        C14930 c14930 = this.f62196;
        int iHashCode = (c14930 == null ? 0 : c14930.hashCode()) * 31;
        C14930 c14931 = this.f62197;
        return iHashCode + (c14931 != null ? c14931.hashCode() : 0);
    }

    public final String toString() {
        C14930 c14930 = this.f62197;
        C14930 c14931 = this.f62196;
        if (c14931 != null && c14930 == null) {
            return c14931.m34150();
        }
        if (c14931 == null && c14930 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(c14931 == null ? "" : c14931.m34150());
        sb.append("|");
        sb.append(c14930 != null ? c14930.m34150() : "");
        return sb.toString();
    }

    public final C14930 getName() {
        return this.f62196;
    }

    public final C14930 getSignature() {
        return this.f62197;
    }
}
