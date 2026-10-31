package l;

/* JADX INFO: renamed from: l.ۖۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L5UY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2294 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22755 f7417;

    public C2294(C3454 c3454, C10720 c10720, byte b) {
        this.f7417 = (C22755) c3454.f10926.m1314((int) C3563.m10864(c10720.m26902(b + 1)));
    }

    public C2294(C22755 c22755) {
        this.f7417 = c22755;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        byte[] bArrM10865 = C3563.m10865(this.f7417.m14661());
        c1547.m5300(EnumC3705.VALUE_TYPE.f11701 | ((bArrM10865.length - 1) << 5));
        c1547.m5298(bArrM10865, 0, bArrM10865.length);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return C3563.m10863(this.f7417.m14661()) + i + 1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        return this.f7417.m14661() - ((C2294) abstractC16404).f7417.m14661();
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_TYPE;
    }

    public final int hashCode() {
        return this.f7417.hashCode();
    }
}
