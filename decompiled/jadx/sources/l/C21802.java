package l;

/* JADX INFO: renamed from: l.᩸᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1570 */
/* JADX INFO: loaded from: classes.dex */
public final class C21802 extends AbstractC14039 {
    @Override // l.AbstractC1591
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1591 mo5437(C1403 c1403) {
        return new C21802(this.f5638, this.f42444.mo6718(c1403), this.f42445.mo6718(c1403));
    }

    public final String toString() {
        int i = C15450.f47308[this.f5638.ordinal()];
        if (i == 1) {
            return this.f42444 + " = " + this.f42445;
        }
        if (i == 2 || i == 3) {
            return this.f42444 + " := " + this.f42445;
        }
        if (i == 4) {
            return this.f42444 + " <- " + this.f42445;
        }
        return super.toString();
    }

    public C21802(EnumC7690 enumC7690, AbstractC8396 abstractC8396, AbstractC8396 abstractC8397) {
        super(enumC7690, EnumC0697.E2);
        this.f42444 = abstractC8396;
        this.f42445 = abstractC8397;
    }
}
