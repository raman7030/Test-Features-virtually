package p067l;

/* JADX INFO: renamed from: l.ᩳ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19754 {

    /* JADX INFO: renamed from: ֫ */
    public final int f60102;

    /* JADX INFO: renamed from: ۧ */
    public final int f60103;

    public AbstractC19754(int i, int i2) {
        this.f60102 = i;
        this.f60103 = (1 << i2) - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44901(int i, int i2) {
        int i3 = this.f60102;
        return (i >> (8 - i3)) + ((i2 & this.f60103) << i3);
    }
}
