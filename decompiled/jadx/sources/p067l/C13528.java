package p067l;

/* JADX INFO: renamed from: l.ۨܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13528 extends AbstractC18046 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4636 f38049;

    public C13528(C4636 c4636) {
        this.f38049 = c4636;
    }

    @Override // p067l.AbstractC18046
    public final void onPageSelected(int i) {
        C4636 c4636 = this.f38049;
        if (c4636.f10402 != i) {
            c4636.f10402 = i;
            c4636.f10401.m54413();
        }
    }

    @Override // p067l.AbstractC18046
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f38049.m9786();
        }
    }
}
