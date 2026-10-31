package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22085 extends AbstractC0525 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f71739;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22085(ActivityC16315 activityC16315) {
        super(true);
        this.f71739 = activityC16315;
    }

    @Override // l.AbstractC0525
    /* JADX INFO: renamed from: ۧ */
    public final void mo1201() {
        ActivityC16315 activityC16315 = this.f71739;
        if (activityC16315.f50253.m31666(8388611)) {
            if (activityC16315.f50244.m38954()) {
                activityC16315.f50244.m38953(true);
                return;
            } else {
                activityC16315.f50253.m31647(8388611);
                return;
            }
        }
        if (activityC16315.f50246 != -1) {
            ComponentCallbacksC9205 componentCallbacksC9205M14862 = activityC16315.m2843().m14862(R.id.MT_Protector);
            if ((componentCallbacksC9205M14862 instanceof C22372) && ((C22372) componentCallbacksC9205M14862).m50229()) {
                return;
            }
        }
        activityC16315.m38449(true);
    }
}
