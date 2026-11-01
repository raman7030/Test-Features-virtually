package p067l;

/* JADX INFO: renamed from: l.۠ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4S8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10205 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public int f28294;

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo4018(C5636 c5636);

    /* JADX INFO: renamed from: ۧ */
    public abstract double mo4019();

    /* JADX INFO: renamed from: ܿ */
    public void mo14008() {
    }

    public AbstractC10205(int i) {
        this.f28294 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m23803() {
        return this.f28294;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC10205 abstractC10205) {
        int iCompare = Integer.compare(this.f28294, abstractC10205.f28294);
        return iCompare == 0 ? Double.compare(mo4019(), abstractC10205.mo4019()) : iCompare;
    }
}
