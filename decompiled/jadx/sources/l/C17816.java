package l;

/* JADX INFO: renamed from: l.ᩳۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E50W */
/* JADX INFO: loaded from: classes5.dex */
public final class C17816 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18522 f54455;

    public C17816(C3454 c3454, C10720 c10720, byte b) {
        this.f54455 = (C18522) c3454.f10937.m1314((int) C3563.m10864(c10720.m26902(b + 1)));
    }

    public C17816(C18522 c18522) {
        this.f54455 = c18522;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        byte[] bArrM10865 = C3563.m10865(this.f54455.m14661());
        c1547.m5300(EnumC3705.VALUE_ENUM.f11701 | ((bArrM10865.length - 1) << 5));
        c1547.m5298(bArrM10865, 0, bArrM10865.length);
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return C3563.m10863(this.f54455.m14661()) + i + 1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        return this.f54455.m14661() - ((C17816) abstractC16404).f54455.m14661();
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_ENUM;
    }

    public final int hashCode() {
        return this.f54455.hashCode();
    }
}
