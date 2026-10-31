package l;

/* JADX INFO: renamed from: l.ۡܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C8919 extends C1875 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2569 f27122;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f27123;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8919(InterfaceC1169 interfaceC1169, C2569 c2569) {
        super((AbstractC23747) interfaceC1169);
        this.f27122 = c2569;
    }

    @Override // l.C1875
    /* JADX INFO: renamed from: ܳ */
    public final int mo6205(int i) {
        this.f27122.m8120();
        if (size() >= 200000) {
            throw C5391.m15357(EnumC0451.LIMIT, "Token count limit exceeded");
        }
        return super.mo6205(Math.min(i, 200000 - size()));
    }

    @Override // l.C1875
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC0463 mo6211(int i) {
        int i2 = this.f27123 + 1;
        this.f27123 = i2;
        if ((i2 & 1023) == 0) {
            this.f27122.m8120();
        }
        return super.mo6211(i);
    }
}
