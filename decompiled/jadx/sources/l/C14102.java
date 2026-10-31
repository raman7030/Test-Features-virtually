package l;

/* JADX INFO: renamed from: l.ܰ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5D4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14102 extends AbstractC19686 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f42578;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f42579;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f42580;

    public C14102(AbstractC8396 abstractC8396, String str, String str2, String str3) {
        super(EnumC1340.FIELD, abstractC8396);
        this.f42578 = str3;
        this.f42580 = str2;
        this.f42579 = str;
    }

    @Override // l.AbstractC19686, l.AbstractC8396
    public final AbstractC8396 clone() {
        AbstractC8396 abstractC8396 = this.f63597;
        abstractC8396.getClass();
        return new C14102(abstractC8396.clone(), this.f42579, this.f42580, this.f42578);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C14102(this.f63597.mo6718(c1403), this.f42579, this.f42580, this.f42578);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        return this.f63597 + "." + this.f42580;
    }
}
