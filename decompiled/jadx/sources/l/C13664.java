package l;

/* JADX INFO: renamed from: l.ܰ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5B9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13664 extends AbstractC4657 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f40745;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f40746;

    public C13664(C12918 c12918, C18729 c18729, int i) {
        this.f40745 = c12918;
        this.f40746 = c18729.m43380(i + 1);
    }

    @Override // l.InterfaceC11158
    public final InterfaceC19583 getValue() {
        return new C21611(this.f40745, this.f40746);
    }
}
