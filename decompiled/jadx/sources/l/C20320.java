package l;

/* JADX INFO: renamed from: l.᩶ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20320 extends AbstractC20984 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1022 f65623;

    public C20320(AbstractC10442 abstractC10442) {
        super(0);
        this.f65623 = abstractC10442;
    }

    public C20320(InterfaceC1022 interfaceC1022, int i, int i2) {
        super(i, i2);
        this.f65623 = interfaceC1022;
    }

    @Override // l.AbstractC20984
    /* JADX INFO: renamed from: ۧ */
    public final int mo24371() {
        return this.f65623.size();
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫ */
    public final int mo3394(int i) {
        return this.f65623.getInt(i);
    }

    @Override // l.AbstractC18161
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16749 mo3395(int i, int i2) {
        return new C20320(this.f65623, i, i2);
    }
}
