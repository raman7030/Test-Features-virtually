package l;

/* JADX INFO: renamed from: l.᩶ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19975 extends AbstractC2377 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12918 f64691;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f64692;

    public C19975(C12918 c12918, int i) {
        this.f64691 = c12918;
        this.f64692 = i;
    }

    @Override // l.AbstractC2377
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7047(int i) {
        C12918 c12918 = this.f64691;
        return new C1149(c12918, (i * 12) + c12918.f38781 + 4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64692;
    }
}
