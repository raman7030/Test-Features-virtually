package l;

/* JADX INFO: renamed from: l.᩻ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N55R */
/* JADX INFO: loaded from: classes.dex */
public final class C23460 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f75291;

    public C23460(C10720 c10720, byte b) {
        this.f75291 = (int) C3563.m10861(c10720.m26902(b + 1));
    }

    public C23460(int i) {
        this.f75291 = i;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        byte[] bArrM10862 = C3563.m10862(this.f75291);
        c1547.m5300(EnumC3705.VALUE_INT.f11701 | ((bArrM10862.length - 1) << 5));
        c1547.m5298(bArrM10862, 0, bArrM10862.length);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return C3563.m10866(this.f75291) + i + 1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        int i = ((C23460) abstractC16404).f75291;
        int i2 = this.f75291;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_INT;
    }

    public final int hashCode() {
        return this.f75291;
    }
}
