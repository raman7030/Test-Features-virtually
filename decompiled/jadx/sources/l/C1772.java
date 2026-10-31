package l;

/* JADX INFO: renamed from: l.֫ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1772 implements InterfaceC15417 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f6139;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f6140;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f6141;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f6142;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8411 f6143;

    public C1772(boolean[] zArr, ActivityC8411 activityC8411, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206, C2978 c2978) {
        this.f6142 = zArr;
        this.f6143 = activityC8411;
        this.f6139 = abstractActivityC3346;
        this.f6140 = dialogInterfaceC0206;
        this.f6141 = c2978;
    }

    @Override // l.InterfaceC15417
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo5899() {
        boolean[] zArr = this.f6142;
        zArr[0] = true;
        ActivityC8411 activityC8411 = this.f6143;
        if (activityC8411 != null) {
            activityC8411.m22016(true);
        }
        ActivityC8411 activityC8412 = this.f6143;
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f6140;
        AbstractActivityC3346 abstractActivityC3346 = this.f6139;
        abstractActivityC3346.m10219(new RunnableC7477(zArr, activityC8412, dialogInterfaceC0206, abstractActivityC3346, this.f6141, 0));
    }

    @Override // l.InterfaceC15417
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5898() {
        boolean[] zArr = this.f6142;
        if (zArr[0]) {
            zArr[0] = false;
            this.f6139.m10219((Runnable) null);
            ActivityC8411 activityC8411 = this.f6143;
            if (activityC8411 != null) {
                activityC8411.m22016(false);
            }
        }
    }
}
