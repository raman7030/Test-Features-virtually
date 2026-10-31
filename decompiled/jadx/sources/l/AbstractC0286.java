package l;

/* JADX INFO: renamed from: l.֡۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0286 extends AbstractC9460 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1632;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f1633;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public abstract Iterable mo1628();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f1633;
        int i2 = ((AbstractC0286) obj).f1633;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public AbstractC0286(Object obj) {
        super(obj);
        this.f1633 = -1;
    }
}
