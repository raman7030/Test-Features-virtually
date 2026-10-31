package l;

/* JADX INFO: renamed from: l.ۚ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N65V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5574 extends AbstractC8396 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC8396[] f17269;

    @Override // l.AbstractC8396
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15835(AbstractC8396[] abstractC8396Arr) {
        this.f17269 = abstractC8396Arr;
    }

    public AbstractC5574(EnumC1340 enumC1340, AbstractC8396[] abstractC8396Arr) {
        super(enumC1340, EnumC0697.En);
        this.f17269 = abstractC8396Arr;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC8396[] m15836() {
        int length = this.f17269.length;
        AbstractC8396[] abstractC8396Arr = new AbstractC8396[length];
        for (int i = 0; i < length; i++) {
            AbstractC8396 abstractC8396 = this.f17269[i];
            abstractC8396.getClass();
            abstractC8396Arr[i] = abstractC8396.clone();
        }
        return abstractC8396Arr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC8396[] m15837(C1403 c1403) {
        int length = this.f17269.length;
        AbstractC8396[] abstractC8396Arr = new AbstractC8396[length];
        for (int i = 0; i < length; i++) {
            abstractC8396Arr[i] = this.f17269[i].mo6718(c1403);
        }
        return abstractC8396Arr;
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC8396[] mo15838() {
        return this.f17269;
    }
}
