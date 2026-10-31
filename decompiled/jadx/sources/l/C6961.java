package l;

/* JADX INFO: renamed from: l.ۜ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6961 extends AbstractC8540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22630 f21456 = new C22630();

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f21456;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        char cCharAt;
        int iMo44153 = interfaceC19124.mo44153();
        if (!m18802(interfaceC19124, iMo44153)) {
            return null;
        }
        int iMo44151 = interfaceC19124.mo44151() + interfaceC19124.mo44150();
        int i = iMo44151 + 1;
        CharSequence charSequenceM38335 = interfaceC19124.getLine().m38335();
        int i2 = iMo44153 + 1;
        if (i2 < charSequenceM38335.length() && ((cCharAt = charSequenceM38335.charAt(i2)) == '\t' || cCharAt == ' ')) {
            i = iMo44151 + 2;
        }
        return new C14721(-1, i, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18802(InterfaceC19124 interfaceC19124, int i) {
        CharSequence charSequenceM38335 = interfaceC19124.getLine().m38335();
        return interfaceC19124.mo44151() < 4 && i < charSequenceM38335.length() && charSequenceM38335.charAt(i) == '>';
    }
}
