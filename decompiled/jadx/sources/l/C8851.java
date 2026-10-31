package l;

/* JADX INFO: renamed from: l.ۡۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8851 extends AbstractC15075 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26948;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15905 f26949;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8851(C15905 c15905, C12918 c12918, int i, int i2, int i3) {
        super(c12918, i, i2);
        this.f26949 = c15905;
        this.f26948 = i3;
    }

    @Override // l.AbstractC15075
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo22869(C18729 c18729, int i) {
        if (i == this.f26948 - 1) {
            return new C17152(c18729);
        }
        return new C2501(this.f26949.f49142, c18729);
    }
}
