package p067l;

/* JADX INFO: renamed from: l.ۨۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13305 extends AbstractC4627 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f37364;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18155 f37365;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f37366;

    public C13305(C18155 c18155, int i, int i2) {
        this.f37365 = c18155;
        this.f37366 = i;
        this.f37364 = i2;
    }

    @Override // p067l.AbstractC4627
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9142(int i) {
        C14645 c14645 = this.f37365.f54212;
        return c14645.m33487(c14645.m33504().m13856((i * 2) + this.f37366));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37364;
    }
}
