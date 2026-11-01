package p067l;

/* JADX INFO: renamed from: l.֫ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4155 implements InterfaceC19837 {

    /* JADX INFO: renamed from: ֫ */
    public final C18236 f9170;

    @Override // p067l.InterfaceC19837
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6575(Object obj) {
        InterfaceC9838 interfaceC9838 = (InterfaceC9838) obj;
        int iMo10470 = interfaceC9838.mo10470();
        if (iMo10470 == 3) {
            return new C9599(this, (InterfaceC5145) interfaceC9838);
        }
        if (iMo10470 != 5) {
            return iMo10470 != 6 ? interfaceC9838 : new C15633(this, (InterfaceC21239) interfaceC9838);
        }
        return new C24351(this, (InterfaceC16543) interfaceC9838);
    }

    public C4155(C18236 c18236) {
        this.f9170 = c18236;
    }
}
