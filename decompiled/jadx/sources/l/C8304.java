package l;

/* JADX INFO: renamed from: l.۠ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8304 extends AbstractC23847 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4818 f25501;

    public C8304(AbstractC15358 abstractC15358) {
        super(0);
        this.f25501 = abstractC15358;
    }

    public C8304(InterfaceC4818 interfaceC4818, int i, int i2) {
        super(i, i2);
        this.f25501 = interfaceC4818;
    }

    @Override // l.AbstractC23847
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo21906() {
        return this.f25501.size();
    }

    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float mo21904(int i) {
        return this.f25501.getFloat(i);
    }

    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16791 mo21905(int i, int i2) {
        return new C8304(this.f25501, i, i2);
    }
}
