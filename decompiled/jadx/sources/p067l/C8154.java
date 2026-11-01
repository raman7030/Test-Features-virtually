package p067l;

/* JADX INFO: renamed from: l.ۛܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8154 extends AbstractC20050 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f21519;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f21520;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14645 f21521;

    public C8154(C14645 c14645, int i, int i2) {
        this.f21521 = c14645;
        this.f21520 = i;
        this.f21519 = i2;
    }

    @Override // p067l.AbstractC20050
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18930(int i) {
        C14645 c14645 = this.f21521;
        return new C12635(c14645, c14645.m33504().mo13855((i * 4) + this.f21520 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21519;
    }
}
