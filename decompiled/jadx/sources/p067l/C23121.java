package p067l;

/* JADX INFO: renamed from: l.᩸᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23121 implements InterfaceC20853 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC4030 f72668;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14146 f72669;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean f72670;

    public C23121(ActivityC4030 activityC4030, boolean z, C14146 c14146) {
        this.f72668 = activityC4030;
        this.f72670 = z;
        this.f72669 = c14146;
    }

    @Override // p067l.InterfaceC20853
    /* JADX INFO: renamed from: ֫ */
    public final void mo5042(boolean z) {
        ActivityC4030 activityC4030 = this.f72668;
        boolean z2 = this.f72670;
        if (z2) {
            activityC4030.f8826.m39742(z);
        } else {
            activityC4030.f8826.m39762(z);
        }
        if (this.f72669 != activityC4030.f8840.m22070()) {
            return;
        }
        if (z2) {
            activityC4030.m8057();
        } else {
            activityC4030.m8052();
        }
    }

    @Override // p067l.InterfaceC20853
    /* JADX INFO: renamed from: ֫ */
    public final void mo5043(boolean z, boolean z2) {
        ActivityC4030 activityC4030 = this.f72668;
        if (this.f72669 != activityC4030.f8840.m22070()) {
            return;
        }
        activityC4030.f8826.m39743(z);
        activityC4030.f8826.m39764(z2);
    }
}
