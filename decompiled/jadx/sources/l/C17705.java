package l;

/* JADX INFO: renamed from: l.ᩳ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes4.dex */
public final class C17705 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f54181;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f54182;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return -Long.compare(this.f54182, ((C17705) obj).f54182);
    }

    public C17705(AbstractC15440 abstractC15440) {
        this.f54181 = abstractC15440;
        this.f54182 = abstractC15440.mo23127();
    }
}
