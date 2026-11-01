package p067l;

/* JADX INFO: renamed from: l.ܽܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 25TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18311 extends C16299 {

    /* JADX INFO: renamed from: ۫ */
    public String f54713;

    public C18311(String str, int i, int i2, InterfaceC13638 interfaceC13638) {
        super(interfaceC13638);
        this.f54713 = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        boolean z = this.f47906 instanceof InterfaceC6932;
        String str = this.f54713;
        if (z) {
            return "NoViableAltException('" + ((char) m37092()) + "'@[" + str + "])";
        }
        return "NoViableAltException(" + m37092() + "@[" + str + "])";
    }
}
