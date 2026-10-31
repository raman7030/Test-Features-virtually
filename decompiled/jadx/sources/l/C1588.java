package l;

/* JADX INFO: renamed from: l.֫ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5X9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1588 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final double f5627;

    public C1588(C10720 c10720, byte b) {
        this.f5627 = Double.longBitsToDouble(C3563.m10854(c10720.m26902(b + 1)));
    }

    public C1588(double d) {
        this.f5627 = d;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5434(C1547 c1547) {
        byte[] bArrM10860 = C3563.m10860(Double.doubleToRawLongBits(this.f5627));
        c1547.m5300(EnumC3705.VALUE_DOUBLE.f11701 | ((bArrM10860.length - 1) << 5));
        c1547.m5298(bArrM10860, 0, bArrM10860.length);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo5433(int i) {
        return C3563.m10867(Double.doubleToRawLongBits(this.f5627)) + i + 1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo5436(AbstractC16404 abstractC16404) {
        return Double.compare(this.f5627, ((C1588) abstractC16404).f5627);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_DOUBLE;
    }

    public final int hashCode() {
        return (int) Double.doubleToRawLongBits(this.f5627);
    }
}
