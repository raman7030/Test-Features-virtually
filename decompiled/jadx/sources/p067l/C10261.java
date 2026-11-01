package p067l;

/* JADX INFO: renamed from: l.۠ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10261 extends AbstractC25033 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6948 f28411;

    public C10261(AbstractC16965 abstractC16965) {
        super(0);
        this.f28411 = abstractC16965;
    }

    public C10261(InterfaceC6948 interfaceC6948, int i, int i2) {
        super(i, i2);
        this.f28411 = interfaceC6948;
    }

    @Override // p067l.AbstractC25033
    /* JADX INFO: renamed from: ۧ */
    public final int mo23876() {
        return this.f28411.size();
    }

    @Override // p067l.AbstractC19669
    /* JADX INFO: renamed from: ֫ */
    public final float mo23874(int i) {
        return this.f28411.getFloat(i);
    }

    @Override // p067l.AbstractC19669
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18327 mo23875(int i, int i2) {
        return new C10261(this.f28411, i, i2);
    }
}
