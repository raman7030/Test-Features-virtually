package p067l;

/* JADX INFO: renamed from: l.ۙܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6888 extends AbstractC21309 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4544 f17914;

    public C6888(AbstractC8229 abstractC8229) {
        super(0);
        this.f17914 = abstractC8229;
    }

    public C6888(InterfaceC4544 interfaceC4544, int i, int i2) {
        super(i, i2);
        this.f17914 = interfaceC4544;
    }

    @Override // p067l.AbstractC21309
    /* JADX INFO: renamed from: ۧ */
    public final int mo15786() {
        return this.f17914.size();
    }

    @Override // p067l.AbstractC9908
    /* JADX INFO: renamed from: ֫ */
    public final long mo15784(int i) {
        return this.f17914.getLong(i);
    }

    @Override // p067l.AbstractC9908
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3202 mo15785(int i, int i2) {
        return new C6888(this.f17914, i, i2);
    }
}
