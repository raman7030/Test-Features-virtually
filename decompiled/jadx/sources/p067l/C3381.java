package p067l;

/* JADX INFO: renamed from: l.֨ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3381 extends AbstractC0868 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC18686 f6684;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3381(ActivityC18686 activityC18686) {
        super(true);
        this.f6684 = activityC18686;
    }

    @Override // p067l.AbstractC0868
    /* JADX INFO: renamed from: ۧ */
    public final void mo3603() {
        ActivityC18686 activityC18686 = this.f6684;
        if (activityC18686.f55786.m33753(8388611)) {
            if (activityC18686.f55780.m41180()) {
                activityC18686.f55780.m41179(true);
                return;
            } else {
                activityC18686.f55786.m33734(8388611);
                return;
            }
        }
        if (activityC18686.f55799 != -1 && activityC18686.f55799 < activityC18686.f55797.size()) {
            InterfaceC6699 interfaceC6699 = (ComponentCallbacksC11117) activityC18686.f55797.get(activityC18686.f55799);
            if ((interfaceC6699 instanceof InterfaceC2787) && ((InterfaceC2787) interfaceC6699).mo4372()) {
                return;
            }
        }
        if (!activityC18686.f55784.isEmpty()) {
            String str = (String) activityC18686.f55784.pop();
            for (int i = 0; i < activityC18686.f55797.size(); i++) {
                if (((AbstractC16003) activityC18686.f55797.get(i)).m36365().equals(str)) {
                    ActivityC18686.m42520(activityC18686, i, false);
                    return;
                }
            }
            ActivityC18686.m42520(activityC18686, 0, false);
            return;
        }
        activityC18686.m42590(true);
    }
}
