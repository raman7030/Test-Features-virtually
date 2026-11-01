package p067l;

/* JADX INFO: renamed from: l.ܰۧ */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public class C1525 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC2023 f44145;

    public C1525(ActivityC2023 activityC2023) {
        this.f44145 = activityC2023;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_DESTROY) {
            ActivityC2023 activityC2023 = this.f44145;
            activityC2023.f79808.m43145();
            if (!activityC2023.isChangingConfigurations()) {
                activityC2023.getViewModelStore().m12225();
            }
            ExecutorC1568 executorC1568 = activityC2023.f79807;
            ActivityC2023 activityC2024 = executorC1568.f47856;
            activityC2024.getWindow().getDecorView().removeCallbacks(executorC1568);
            activityC2024.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC1568);
        }
    }
}
