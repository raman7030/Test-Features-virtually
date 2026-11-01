package p067l;

/* JADX INFO: renamed from: l.֫᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R524 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4310 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC25097 f9623;

    /* JADX INFO: renamed from: ۢ */
    public abstract EnumC25137 mo5081();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo5082(C3838 c3838, int i);

    /* JADX INFO: renamed from: ֫ */
    public int mo8841(int i) {
        return this.f9623.f80338.f80466 / 2;
    }

    public AbstractC4310(EnumC25097 enumC25097) {
        this.f9623 = enumC25097;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8842(C3838 c3838, int i) {
        mo5082(c3838, i);
        return mo8841(i) + i;
    }
}
