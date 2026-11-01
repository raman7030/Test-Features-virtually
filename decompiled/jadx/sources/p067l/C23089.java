package p067l;

/* JADX INFO: renamed from: l.᩸᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1570 */
/* JADX INFO: loaded from: classes.dex */
public final class C23089 extends AbstractC15711 {
    @Override // p067l.AbstractC3880
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3880 mo7667(C3702 c3702) {
        return new C23089(this.f8417, this.f45527.mo8844(c3702), this.f45528.mo8844(c3702));
    }

    public final String toString() {
        int i = C17052.f50437[this.f8417.ordinal()];
        if (i == 1) {
            return this.f45527 + " = " + this.f45528;
        }
        if (i == 2 || i == 3) {
            return this.f45527 + " := " + this.f45528;
        }
        if (i == 4) {
            return this.f45527 + " <- " + this.f45528;
        }
        return super.toString();
    }

    public C23089(EnumC9677 enumC9677, AbstractC10348 abstractC10348, AbstractC10348 abstractC10349) {
        super(enumC9677, EnumC3031.E2);
        this.f45527 = abstractC10348;
        this.f45528 = abstractC10349;
    }
}
