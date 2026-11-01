package p067l;

/* JADX INFO: renamed from: l.ۨܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13546 extends AbstractC11498 {

    /* JADX INFO: renamed from: ֫ */
    public String f38100 = "//";

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C15556 f38101;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C3488 f38102;

    public C13546(C15556 c15556, C3488 c3488) {
        this.f38101 = c15556;
        this.f38102 = c3488;
    }

    @Override // p067l.AbstractC11498
    public final void onScrolled(C14849 c14849, int i, int i2) {
        String strM35393 = this.f38101.m35393();
        if (C12826.equals(this.f38100, strM35393)) {
            return;
        }
        this.f38100 = strM35393;
        this.f38102.m45213n(strM35393);
    }
}
