package l;

/* JADX INFO: renamed from: l.ۡۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8703 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f26493;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f26494;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f26495;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8703 c8703 = (C8703) obj;
        int iCompare = Integer.compare(this.f26493, c8703.f26493);
        return iCompare == 0 ? this.f26495.compareTo(c8703.f26495) : iCompare;
    }

    public C8703(AbstractC15440 abstractC15440) {
        this.f26494 = abstractC15440;
        String lowerCase = abstractC15440.getName().toLowerCase();
        this.f26495 = lowerCase;
        this.f26493 = C15757.f48592.mo24837(C15757.f48592.mo24837(Integer.MAX_VALUE, lowerCase), abstractC15440.mo23554());
    }
}
