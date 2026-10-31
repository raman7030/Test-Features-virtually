package l;

/* JADX INFO: renamed from: l.᩺۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes.dex */
public final class C23010 extends AbstractC9606 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f74081 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7488 f74082;

    public C23010(AbstractC7488 abstractC7488) {
        this.f74082 = abstractC7488;
    }

    @Override // l.AbstractC9606
    public final void onScrollStateChanged(C13132 c13132, int i) {
        super.onScrollStateChanged(c13132, i);
        if (i == 0 && this.f74081) {
            this.f74081 = false;
            this.f74082.snapToTargetExistingView();
        }
    }

    @Override // l.AbstractC9606
    public final void onScrolled(C13132 c13132, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f74081 = true;
    }
}
