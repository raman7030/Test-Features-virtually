package p067l;

/* JADX INFO: renamed from: l.᩶ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21681 extends AbstractC22312 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3340 f68298;

    public C21681(AbstractC12293 abstractC12293) {
        super(0);
        this.f68298 = abstractC12293;
    }

    public C21681(InterfaceC3340 interfaceC3340, int i, int i2) {
        super(i, i2);
        this.f68298 = interfaceC3340;
    }

    @Override // p067l.AbstractC22312
    /* JADX INFO: renamed from: ۧ */
    public final int mo26381() {
        return this.f68298.size();
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final int mo5713(int i) {
        return this.f68298.getInt(i);
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18287 mo5714(int i, int i2) {
        return new C21681(this.f68298, i, i2);
    }
}
