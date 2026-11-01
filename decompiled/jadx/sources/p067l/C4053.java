package p067l;

/* JADX INFO: renamed from: l.֫ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4053 implements InterfaceC17021 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractActivityC5549 f8915;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ DialogInterfaceC2564 f8916;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C0990 f8917;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ boolean[] f8918;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC10363 f8919;

    public C4053(boolean[] zArr, ActivityC10363 activityC10363, AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564, C0990 c0990) {
        this.f8918 = zArr;
        this.f8919 = activityC10363;
        this.f8915 = abstractActivityC5549;
        this.f8916 = dialogInterfaceC2564;
        this.f8917 = c0990;
    }

    @Override // p067l.InterfaceC17021
    /* JADX INFO: renamed from: ۧ */
    public final void mo8110() {
        boolean[] zArr = this.f8918;
        zArr[0] = true;
        ActivityC10363 activityC10363 = this.f8919;
        if (activityC10363 != null) {
            activityC10363.m23986(true);
        }
        ActivityC10363 activityC10364 = this.f8919;
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f8916;
        AbstractActivityC5549 abstractActivityC5549 = this.f8915;
        abstractActivityC5549.m12255(new RunnableC9475(zArr, activityC10364, dialogInterfaceC2564, abstractActivityC5549, this.f8917, 0));
    }

    @Override // p067l.InterfaceC17021
    /* JADX INFO: renamed from: ֫ */
    public final void mo8109() {
        boolean[] zArr = this.f8918;
        if (zArr[0]) {
            zArr[0] = false;
            this.f8915.m12255((Runnable) null);
            ActivityC10363 activityC10363 = this.f8919;
            if (activityC10363 != null) {
                activityC10363.m23986(false);
            }
        }
    }
}
