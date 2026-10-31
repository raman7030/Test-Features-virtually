package l;

/* JADX INFO: renamed from: l.ۙܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C4OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4677 extends AbstractC2377 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14861;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3266 f14862;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14863;

    public C4677(C3266 c3266, int i, int i2) {
        this.f14862 = c3266;
        this.f14863 = i;
        this.f14861 = i2;
    }

    @Override // l.AbstractC2377
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7047(int i) {
        C12918 c12918 = this.f14862.f10250;
        return c12918.m31401(c12918.m31418().m11936((i * 2) + this.f14863));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14861;
    }
}
