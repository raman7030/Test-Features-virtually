package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23358 extends AbstractC0868 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC17874 f74459;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23358(ActivityC17874 activityC17874) {
        super(true);
        this.f74459 = activityC17874;
    }

    @Override // p067l.AbstractC0868
    /* JADX INFO: renamed from: ۧ */
    public final void mo3603() {
        ActivityC17874 activityC17874 = this.f74459;
        if (activityC17874.f53420.m33753(8388611)) {
            if (activityC17874.f53411.m41180()) {
                activityC17874.f53411.m41179(true);
                return;
            } else {
                activityC17874.f53420.m33734(8388611);
                return;
            }
        }
        if (activityC17874.f53413 != -1) {
            ComponentCallbacksC11117 componentCallbacksC11117M16772 = activityC17874.m5172().m16772(R.id.MT_Protector);
            if ((componentCallbacksC11117M16772 instanceof C23631) && ((C23631) componentCallbacksC11117M16772).m52569()) {
                return;
            }
        }
        activityC17874.m40664(true);
    }
}
