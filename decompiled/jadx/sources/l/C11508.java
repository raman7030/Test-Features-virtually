package l;

/* JADX INFO: renamed from: l.ۨۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11508 extends AbstractC2377 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34367;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16611 f34368;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34369;

    public C11508(C16611 c16611, int i, int i2) {
        this.f34368 = c16611;
        this.f34369 = i;
        this.f34367 = i2;
    }

    @Override // l.AbstractC2377
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7047(int i) {
        C12918 c12918 = this.f34368.f51035;
        return c12918.m31401(c12918.m31418().m11936((i * 2) + this.f34369));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34367;
    }
}
