package l;

/* JADX INFO: renamed from: l.ۛܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6088 extends AbstractC18605 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18663;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18664;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12918 f18665;

    public C6088(C12918 c12918, int i, int i2) {
        this.f18665 = c12918;
        this.f18664 = i;
        this.f18663 = i2;
    }

    @Override // l.AbstractC18605
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo16999(int i) {
        C12918 c12918 = this.f18665;
        return new C10803(c12918, c12918.m31418().mo11935((i * 4) + this.f18664 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18663;
    }
}
