package l;

/* JADX INFO: renamed from: l.ۙ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 159C */
/* JADX INFO: loaded from: classes3.dex */
public final class C4868 extends AbstractC23212 implements InterfaceC3457 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13334 f15390;

    @Override // l.InterfaceC3457
    /* JADX INFO: renamed from: ֫ */
    public final C13334 mo10582() {
        return this.f15390;
    }

    public C4868(EnumC7690 enumC7690, AbstractC8396 abstractC8396, C13334 c13334) {
        super(enumC7690, abstractC8396);
        this.f15390 = c13334;
    }

    @Override // l.AbstractC1591
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1591 mo5437(C1403 c1403) {
        C13334 c13334Mo4896 = c1403.mo4896(this.f15390);
        return new C4868(this.f5638, this.f74596.mo6718(c1403), c13334Mo4896);
    }

    public final String toString() {
        return "if " + this.f74596 + " GOTO " + this.f15390.m32315();
    }
}
