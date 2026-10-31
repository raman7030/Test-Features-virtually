package l;

/* JADX INFO: renamed from: l.۟ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB9X */
/* JADX INFO: loaded from: classes3.dex */
public final class C7389 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13217 f22740;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 f22741;

    public C7389(C13217 c13217, AbstractC13717 abstractC13717) {
        if (c13217 == null) {
            throw new NullPointerException("name == null");
        }
        if (abstractC13717 == null) {
            throw new NullPointerException("value == null");
        }
        this.f22740 = c13217;
        this.f22741 = abstractC13717;
    }

    public final String toString() {
        return this.f22740.mo2463() + ":" + this.f22741;
    }

    public final int hashCode() {
        return this.f22741.hashCode() + (this.f22740.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7389)) {
            return false;
        }
        C7389 c7389 = (C7389) obj;
        return this.f22740.equals(c7389.f22740) && this.f22741.equals(c7389.f22741);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C7389 c7389) {
        int iCompareTo = this.f22740.compareTo(c7389.f22740);
        return iCompareTo != 0 ? iCompareTo : this.f22741.compareTo(c7389.f22741);
    }

    public final C13217 getName() {
        return this.f22740;
    }

    public final AbstractC13717 getValue() {
        return this.f22741;
    }
}
