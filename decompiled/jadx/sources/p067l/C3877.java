package p067l;

/* JADX INFO: renamed from: l.֫ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5X9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3877 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩸ */
    public final double f8406;

    public C3877(C12556 c12556, byte b) {
        this.f8406 = Double.longBitsToDouble(C5755.m12834(c12556.m28942(b + 1)));
    }

    public C3877(double d) {
        this.f8406 = d;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7663(C3838 c3838) {
        byte[] bArrM12840 = C5755.m12840(Double.doubleToRawLongBits(this.f8406));
        c3838.m7529(EnumC5889.VALUE_DOUBLE.f14502 | ((bArrM12840.length - 1) << 5));
        c3838.m7527(bArrM12840, 0, bArrM12840.length);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final int mo7662(int i) {
        return C5755.m12847(Double.doubleToRawLongBits(this.f8406)) + i + 1;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        return Double.compare(this.f8406, ((C3877) abstractC17958).f8406);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_DOUBLE;
    }

    public final int hashCode() {
        return (int) Double.doubleToRawLongBits(this.f8406);
    }
}
