package l;

/* JADX INFO: renamed from: l.᩸᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C21835 implements InterfaceC19449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f69959;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f69960;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69961;

    public C21835(ActivityC1748 activityC1748, boolean z, C12392 c12392) {
        this.f69959 = activityC1748;
        this.f69961 = z;
        this.f69960 = c12392;
    }

    @Override // l.InterfaceC19449
    /* JADX INFO: renamed from: ֫ */
    public final void mo2703(boolean z) {
        ActivityC1748 activityC1748 = this.f69959;
        boolean z2 = this.f69961;
        if (z2) {
            activityC1748.f6050.m37570(z);
        } else {
            activityC1748.f6050.m37590(z);
        }
        if (this.f69960 != activityC1748.f6064.m20095()) {
            return;
        }
        if (z2) {
            activityC1748.m5847();
        } else {
            activityC1748.m5842();
        }
    }

    @Override // l.InterfaceC19449
    /* JADX INFO: renamed from: ֫ */
    public final void mo2704(boolean z, boolean z2) {
        ActivityC1748 activityC1748 = this.f69959;
        if (this.f69960 != activityC1748.f6064.m20095()) {
            return;
        }
        activityC1748.f6050.m37571(z);
        activityC1748.f6050.m37592(z2);
    }
}
