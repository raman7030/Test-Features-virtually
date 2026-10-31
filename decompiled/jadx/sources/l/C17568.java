package l;

/* JADX INFO: renamed from: l.ܿ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C17568 extends AbstractC18980 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f53685;

    public C17568(String str) {
        super(EnumC1340.NEW);
        this.f53685 = str;
    }

    @Override // l.AbstractC18980, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C17568(this.f53685);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C17568(this.f53685);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        return "NEW " + C0459.m2045(this.f53685);
    }
}
