package l;

/* JADX INFO: renamed from: l.ܳۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H55A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14287 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f43066;

    public C14287(C10720 c10720, byte b) {
        this.f43066 = Float.intBitsToFloat((int) ((C3563.m10854(c10720.m26902(b + 1)) >> 32) & 4294967295L));
    }

    public C14287(float f) {
        this.f43066 = f;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        byte[] bArrM10860 = C3563.m10860(((long) Float.floatToRawIntBits(this.f43066)) << 32);
        c1547.m5300(EnumC3705.VALUE_FLOAT.f11701 | ((bArrM10860.length - 1) << 5));
        c1547.m5298(bArrM10860, 0, bArrM10860.length);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return C3563.m10867(((long) Float.floatToRawIntBits(this.f43066)) << 32) + i + 1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        return Float.compare(this.f43066, ((C14287) abstractC16404).f43066);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_FLOAT;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f43066);
    }
}
