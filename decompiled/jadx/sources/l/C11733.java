package l;

/* JADX INFO: renamed from: l.ۨܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11733 extends AbstractC2377 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34994;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34995;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12918 f34996;

    public C11733(C12918 c12918, int i, int i2) {
        this.f34996 = c12918;
        this.f34995 = i;
        this.f34994 = i2;
    }

    @Override // l.AbstractC2377
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7047(int i) {
        C12918 c12918 = this.f34996;
        return AbstractC10844.m27106(c12918, c12918.m31418().mo11935((i * 4) + this.f34995 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34994;
    }
}
