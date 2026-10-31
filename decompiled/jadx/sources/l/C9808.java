package l;

/* JADX INFO: renamed from: l.ۢ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U582 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9808 extends AbstractC18980 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f29645;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f29646;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f29647;

    public C9808(String str, String str2, String str3) {
        super(EnumC1340.STATIC_FIELD);
        this.f29646 = str3;
        this.f29645 = str2;
        this.f29647 = str;
    }

    @Override // l.AbstractC18980, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C9808(this.f29647, this.f29645, this.f29646);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C9808(this.f29647, this.f29645, this.f29646);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        return C0459.m2045(this.f29647) + "." + this.f29645;
    }
}
