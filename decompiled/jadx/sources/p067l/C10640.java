package p067l;

/* JADX INFO: renamed from: l.ۡۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10640 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final int f29418;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17043 f29419;

    /* JADX INFO: renamed from: ᩹ */
    public final String f29420;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C10640 c10640 = (C10640) obj;
        int iCompare = Integer.compare(this.f29418, c10640.f29418);
        return iCompare == 0 ? this.f29420.compareTo(c10640.f29420) : iCompare;
    }

    public C10640(AbstractC17043 abstractC17043) {
        this.f29419 = abstractC17043;
        String lowerCase = abstractC17043.getName().toLowerCase();
        this.f29420 = lowerCase;
        this.f29418 = C17344.f51731.mo26852(C17344.f51731.mo26852(Integer.MAX_VALUE, lowerCase), abstractC17043.mo25505());
    }
}
