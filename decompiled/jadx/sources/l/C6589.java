package l;

/* JADX INFO: renamed from: l.ۜۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ASK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6589 extends AbstractC12938 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f20297;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f20298;

    @Override // l.AbstractC12938
    /* JADX INFO: renamed from: ֫ */
    public final int mo3363() {
        return 2;
    }

    public C6589(AbstractC23041 abstractC23041, int i, int i2) {
        super(abstractC23041);
        this.f20297 = i;
        this.f20298 = i2;
    }

    @Override // l.AbstractC12938
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3364(int i, int i2) {
        return i >= this.f20297 && i <= this.f20298;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.f20297);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.f20298);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }

    @Override // l.AbstractC12938
    /* JADX INFO: renamed from: ܽ */
    public final C23936 mo3365() {
        C23936 c23936 = new C23936(new int[0]);
        c23936.m52720(this.f20297, this.f20298);
        return c23936;
    }
}
