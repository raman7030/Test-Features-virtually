package p067l;

/* JADX INFO: renamed from: l.ۜۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ASK */
/* JADX INFO: loaded from: classes3.dex */
public final class C8630 extends AbstractC14664 {

    /* JADX INFO: renamed from: ܽ */
    public final int f23174;

    /* JADX INFO: renamed from: ᩳ */
    public final int f23175;

    @Override // p067l.AbstractC14664
    /* JADX INFO: renamed from: ֫ */
    public final int mo5682() {
        return 2;
    }

    public C8630(AbstractC24266 abstractC24266, int i, int i2) {
        super(abstractC24266);
        this.f23174 = i;
        this.f23175 = i2;
    }

    @Override // p067l.AbstractC14664
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5683(int i, int i2) {
        return i >= this.f23174 && i <= this.f23175;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.f23174);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.f23175);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }

    @Override // p067l.AbstractC14664
    /* JADX INFO: renamed from: ܽ */
    public final C25117 mo5684() {
        C25117 c25117 = new C25117(new int[0]);
        c25117.m55126(this.f23174, this.f23175);
        return c25117;
    }
}
