package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23328 extends AbstractC0525 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f74983;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23328(ActivityC6604 activityC6604) {
        super(true);
        this.f74983 = activityC6604;
    }

    @Override // l.AbstractC0525
    /* JADX INFO: renamed from: ۧ */
    public final void mo1201() {
        EnumC4487 enumC4487;
        ActivityC6604 activityC6604 = this.f74983;
        EnumC4487 enumC4487M52000 = activityC6604.f20336.m52000();
        C23537 c23537 = activityC6604.f20336;
        if (c23537.f75588 && (enumC4487M52000 == (enumC4487 = EnumC4487.STRING_POOL) || enumC4487M52000 == EnumC4487.CONFIG)) {
            c23537.f75588 = false;
            if (enumC4487M52000 == enumC4487) {
                activityC6604.m10241(R.string.MT_Protector);
            } else {
                activityC6604.setTitle(c23537.f75568.mo18744());
            }
            activityC6604.f20339.notifyDataSetChanged();
            return;
        }
        activityC6604.m18117();
    }
}
