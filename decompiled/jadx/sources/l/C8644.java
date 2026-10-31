package l;

/* JADX INFO: renamed from: l.ۡۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8644 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short f26391;

    public C8644(C10720 c10720, byte b) {
        this.f26391 = (short) C3563.m10861(c10720.m26902(b + 1));
    }

    public C8644(short s) {
        this.f26391 = s;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        byte[] bArrM10862 = C3563.m10862(this.f26391);
        c1547.m5300(EnumC3705.VALUE_SHORT.f11701 | ((bArrM10862.length - 1) << 5));
        c1547.m5298(bArrM10862, 0, bArrM10862.length);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return C3563.m10866(this.f26391) + i + 1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        short s = ((C8644) abstractC16404).f26391;
        short s2 = this.f26391;
        if (s2 < s) {
            return -1;
        }
        return s2 > s ? 1 : 0;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_SHORT;
    }

    public final int hashCode() {
        return this.f26391;
    }
}
