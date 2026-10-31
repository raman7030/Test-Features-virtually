package l;

/* JADX INFO: renamed from: l.ܳ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 157Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C14745 extends AbstractC5574 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f45025;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f45026;

    public C14745(String str, int i, AbstractC8396[] abstractC8396Arr) {
        super(EnumC1340.NEW_MUTI_ARRAY, abstractC8396Arr);
        this.f45026 = str;
        this.f45025 = i;
    }

    @Override // l.AbstractC5574, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C14745(this.f45026, this.f45025, m15836());
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C14745(this.f45026, this.f45025, m15837(c1403));
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        StringBuilder sb = new StringBuilder("new ");
        sb.append(C0459.m2045(this.f45026));
        for (AbstractC8396 abstractC8396 : this.f17269) {
            sb.append('[');
            sb.append(abstractC8396);
            sb.append(']');
        }
        for (int length = this.f17269.length; length < this.f45025; length++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
