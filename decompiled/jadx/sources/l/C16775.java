package l;

/* JADX INFO: renamed from: l.ܽܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 25TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16775 extends C14658 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f51531;

    public C16775(String str, int i, int i2, InterfaceC11858 interfaceC11858) {
        super(interfaceC11858);
        this.f51531 = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        boolean z = this.f44796 instanceof InterfaceC4802;
        String str = this.f51531;
        if (z) {
            return "NoViableAltException('" + ((char) m34945()) + "'@[" + str + "])";
        }
        return "NoViableAltException(" + m34945() + "@[" + str + "])";
    }
}
