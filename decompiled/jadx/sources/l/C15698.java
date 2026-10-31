package l;

/* JADX INFO: renamed from: l.ܺۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4QP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15698 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11467 f48387;

    public C15698(C3454 c3454, C10720 c10720, byte b) {
        this.f48387 = (C11467) c3454.f10947.m1314((int) C3563.m10864(c10720.m26902(b + 1)));
    }

    public C15698(C11467 c11467) {
        this.f48387 = c11467;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        byte[] bArrM10865 = C3563.m10865(this.f48387.m14661());
        c1547.m5300(EnumC3705.VALUE_STRING.f11701 | ((bArrM10865.length - 1) << 5));
        c1547.m5298(bArrM10865, 0, bArrM10865.length);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return C3563.m10863(this.f48387.m14661()) + i + 1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        return this.f48387.m14661() - ((C15698) abstractC16404).f48387.m14661();
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_STRING;
    }

    public final int hashCode() {
        return this.f48387.hashCode();
    }
}
