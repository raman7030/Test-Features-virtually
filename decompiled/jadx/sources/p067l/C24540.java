package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩺᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24540 extends AbstractC0868 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC8645 f77730;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24540(ActivityC8645 activityC8645) {
        super(true);
        this.f77730 = activityC8645;
    }

    @Override // p067l.AbstractC0868
    /* JADX INFO: renamed from: ۧ */
    public final void mo3603() {
        EnumC6633 enumC6633;
        ActivityC8645 activityC8645 = this.f77730;
        EnumC6633 enumC6633M54402 = activityC8645.f23213.m54402();
        C24738 c24738 = activityC8645.f23213;
        if (c24738.f78334 && (enumC6633M54402 == (enumC6633 = EnumC6633.STRING_POOL) || enumC6633M54402 == EnumC6633.CONFIG)) {
            c24738.f78334 = false;
            if (enumC6633M54402 == enumC6633) {
                activityC8645.m12277(R.string.MT_Protector);
            } else {
                activityC8645.setTitle(c24738.f78314.mo20694());
            }
            activityC8645.f23216.notifyDataSetChanged();
            return;
        }
        activityC8645.m20069();
    }
}
