package p067l;

/* JADX INFO: renamed from: l.֡۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2640 extends AbstractC11359 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public int f4410;

    /* JADX INFO: renamed from: ᩹ */
    public int f4411;

    /* JADX INFO: renamed from: ܿ */
    public abstract Iterable mo4028();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f4411;
        int i2 = ((AbstractC2640) obj).f4411;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public AbstractC2640(Object obj) {
        super(obj);
        this.f4411 = -1;
    }
}
