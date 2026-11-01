package p067l;

/* JADX INFO: renamed from: l.ۨܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13519 extends AbstractC4627 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f37994;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f37995;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14645 f37996;

    public C13519(C14645 c14645, int i, int i2) {
        this.f37996 = c14645;
        this.f37995 = i;
        this.f37994 = i2;
    }

    @Override // p067l.AbstractC4627
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9142(int i) {
        C14645 c14645 = this.f37996;
        return AbstractC12674.m29151(c14645, c14645.m33504().mo13855((i * 4) + this.f37995 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37994;
    }
}
