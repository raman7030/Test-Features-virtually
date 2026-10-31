package l;

/* JADX INFO: renamed from: l.֫᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R524 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2043 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC23915 f6840;

    /* JADX INFO: renamed from: ۢ */
    public abstract EnumC23957 mo2742();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo2743(C1547 c1547, int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo6715(int i) {
        return this.f6840.f77587.f77714 / 2;
    }

    public AbstractC2043(EnumC23915 enumC23915) {
        this.f6840 = enumC23915;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6716(C1547 c1547, int i) {
        mo2743(c1547, i);
        return mo6715(i) + i;
    }
}
