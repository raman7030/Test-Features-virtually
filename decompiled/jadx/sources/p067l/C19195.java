package p067l;

/* JADX INFO: renamed from: l.ᩳ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes4.dex */
public final class C19195 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17043 f57373;

    /* JADX INFO: renamed from: ᩹ */
    public final long f57374;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return -Long.compare(this.f57374, ((C19195) obj).f57374);
    }

    public C19195(AbstractC17043 abstractC17043) {
        this.f57373 = abstractC17043;
        this.f57374 = abstractC17043.mo25101();
    }
}
