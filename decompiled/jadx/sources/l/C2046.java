package l;

/* JADX INFO: renamed from: l.֫᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5DL */
/* JADX INFO: loaded from: classes3.dex */
public final class C2046 extends AbstractC13397 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C10161 f6843;

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo6719() {
        return "InvokeCustomExpr(....)";
    }

    public C2046(EnumC1340 enumC1340, AbstractC8396[] abstractC8396Arr, C10161 c10161) {
        super(enumC1340, abstractC8396Arr);
        this.f6843 = c10161;
    }

    @Override // l.AbstractC13397
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11072 mo6720() {
        return this.f6843.m25525();
    }

    @Override // l.AbstractC5574, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C2046(this.f25745, m15836(), this.f6843);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C2046(this.f25745, m15837(c1403), this.f6843);
    }
}
