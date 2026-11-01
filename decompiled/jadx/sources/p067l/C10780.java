package p067l;

/* JADX INFO: renamed from: l.ۡۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10780 extends AbstractC16695 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f29871;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C17484 f29872;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10780(C17484 c17484, C14645 c14645, int i, int i2, int i3) {
        super(c14645, i, i2);
        this.f29872 = c17484;
        this.f29871 = i3;
    }

    @Override // p067l.AbstractC16695
    /* JADX INFO: renamed from: ֫ */
    public final Object mo24840(C20168 c20168, int i) {
        if (i == this.f29871 - 1) {
            return new C18669(c20168);
        }
        return new C4745(this.f29872.f52288, c20168);
    }
}
