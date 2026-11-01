package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18105 extends AbstractC0868 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ActivityC10059 f54052;

    /* JADX INFO: renamed from: ᩳ */
    public C10748 f54053;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18105(ActivityC10059 activityC10059) {
        super(true);
        this.f54052 = activityC10059;
        this.f54053 = C10748.m24757();
    }

    @Override // p067l.AbstractC0868
    /* JADX INFO: renamed from: ۧ */
    public final void mo3603() {
        ActivityC10059 activityC10059 = this.f54052;
        if (activityC10059.f27835 != null && activityC10059.f27835.m4415() == 0 && activityC10059.f27836.f10614.m17101()) {
            return;
        }
        if (this.f54053.m24763()) {
            C22682.m50801();
            activityC10059.finish();
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
    }
}
