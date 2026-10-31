package l;

/* JADX INFO: renamed from: l.᩹ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MX */
/* JADX INFO: loaded from: classes.dex */
public final class C22316 extends AbstractC2377 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72334;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20200 f72335;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72336;

    public C22316(C20200 c20200, int i, int i2) {
        this.f72335 = c20200;
        this.f72336 = i;
        this.f72334 = i2;
    }

    @Override // l.AbstractC2377
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7047(int i) {
        C12918 c12918 = this.f72335.f65358;
        return c12918.m31401(c12918.m31418().m11936((i * 2) + this.f72336));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f72334;
    }
}
