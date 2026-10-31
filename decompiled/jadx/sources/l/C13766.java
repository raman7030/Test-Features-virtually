package l;

/* JADX INFO: renamed from: l.ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public class C13766 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23809 f41068;

    public C13766(ActivityC23809 activityC23809) {
        this.f41068 = activityC23809;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_DESTROY) {
            ActivityC23809 activityC23809 = this.f41068;
            activityC23809.f77057.m40887();
            if (!activityC23809.isChangingConfigurations()) {
                activityC23809.getViewModelStore().m10189();
            }
            ExecutorC14636 executorC14636 = activityC23809.f77056;
            ActivityC23809 activityC238010 = executorC14636.f44749;
            activityC238010.getWindow().getDecorView().removeCallbacks(executorC14636);
            activityC238010.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC14636);
        }
    }
}
