package p067l;

/* JADX INFO: renamed from: l.᩺۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes.dex */
public final class C24237 extends AbstractC11498 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f76820 = false;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC9485 f76821;

    public C24237(AbstractC9485 abstractC9485) {
        this.f76821 = abstractC9485;
    }

    @Override // p067l.AbstractC11498
    public final void onScrollStateChanged(C14849 c14849, int i) {
        super.onScrollStateChanged(c14849, i);
        if (i == 0 && this.f76820) {
            this.f76820 = false;
            this.f76821.snapToTargetExistingView();
        }
    }

    @Override // p067l.AbstractC11498
    public final void onScrolled(C14849 c14849, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f76820 = true;
    }
}
