package l;

/* JADX INFO: renamed from: l.ᩴۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K250 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18658 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13217 f58973;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13217 f58974;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18658 m43257(C13217 c13217, C13217 c13218) {
        if (c13217 == null && c13218 == null) {
            return null;
        }
        return new C18658(c13217, c13218);
    }

    public C18658(C13217 c13217, C13217 c13218) {
        this.f58973 = c13217;
        this.f58974 = c13218;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C18658) && compareTo((C18658) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C18658 c18658) {
        int iCompareTo;
        AbstractC13717 abstractC13717 = c18658.f58973;
        C13217 c13217 = this.f58973;
        if (c13217 == abstractC13717) {
            iCompareTo = 0;
        } else if (c13217 == null) {
            iCompareTo = -1;
        } else {
            iCompareTo = abstractC13717 == null ? 1 : c13217.compareTo(abstractC13717);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        AbstractC13717 abstractC13718 = c18658.f58974;
        C13217 c13218 = this.f58974;
        if (c13218 == abstractC13718) {
            return 0;
        }
        if (c13218 == null) {
            return -1;
        }
        if (abstractC13718 == null) {
            return 1;
        }
        return c13218.compareTo(abstractC13718);
    }

    public final int hashCode() {
        C13217 c13217 = this.f58973;
        int iHashCode = (c13217 == null ? 0 : c13217.hashCode()) * 31;
        C13217 c13218 = this.f58974;
        return iHashCode + (c13218 != null ? c13218.hashCode() : 0);
    }

    public final String toString() {
        C13217 c13217 = this.f58974;
        C13217 c13218 = this.f58973;
        if (c13218 != null && c13217 == null) {
            return c13218.m32052();
        }
        if (c13218 == null && c13217 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(c13218 == null ? "" : c13218.m32052());
        sb.append("|");
        sb.append(c13217 != null ? c13217.m32052() : "");
        return sb.toString();
    }

    public final C13217 getName() {
        return this.f58973;
    }

    public final C13217 getSignature() {
        return this.f58974;
    }
}
