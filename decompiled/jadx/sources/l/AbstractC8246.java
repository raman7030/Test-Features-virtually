package l;

/* JADX INFO: renamed from: l.۠ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4S8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8246 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f25384;

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo1618(C3438 c3438);

    /* JADX INFO: renamed from: ۧ */
    public abstract double mo1619();

    /* JADX INFO: renamed from: ܿ */
    public void mo12088() {
    }

    public AbstractC8246(int i) {
        this.f25384 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m21833() {
        return this.f25384;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(AbstractC8246 abstractC8246) {
        int iCompare = Integer.compare(this.f25384, abstractC8246.f25384);
        return iCompare == 0 ? Double.compare(mo1619(), abstractC8246.mo1619()) : iCompare;
    }
}
