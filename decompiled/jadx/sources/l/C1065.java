package l;

/* JADX INFO: renamed from: l.֨ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1065 extends AbstractC0525 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f3913;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1065(ActivityC17169 activityC17169) {
        super(true);
        this.f3913 = activityC17169;
    }

    @Override // l.AbstractC0525
    /* JADX INFO: renamed from: ۧ */
    public final void mo1201() {
        ActivityC17169 activityC17169 = this.f3913;
        if (activityC17169.f52605.m31666(8388611)) {
            if (activityC17169.f52599.m38954()) {
                activityC17169.f52599.m38953(true);
                return;
            } else {
                activityC17169.f52605.m31647(8388611);
                return;
            }
        }
        if (activityC17169.f52618 != -1 && activityC17169.f52618 < activityC17169.f52616.size()) {
            InterfaceC4557 interfaceC4557 = (ComponentCallbacksC9205) activityC17169.f52616.get(activityC17169.f52618);
            if ((interfaceC4557 instanceof InterfaceC0440) && ((InterfaceC0440) interfaceC4557).mo1996()) {
                return;
            }
        }
        if (!activityC17169.f52603.isEmpty()) {
            String str = (String) activityC17169.f52603.pop();
            for (int i = 0; i < activityC17169.f52616.size(); i++) {
                if (((AbstractC14346) activityC17169.f52616.get(i)).m34232().equals(str)) {
                    ActivityC17169.m40275(activityC17169, i, false);
                    return;
                }
            }
            ActivityC17169.m40275(activityC17169, 0, false);
            return;
        }
        activityC17169.m40345(true);
    }
}
