package p067l;

/* JADX INFO: renamed from: l.ۧۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12669 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC8645 f35562;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12669(ActivityC8645 activityC8645, ActivityC8645 activityC8646) {
        super(activityC8646, -1);
        this.f35562 = activityC8645;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.length() > 0) {
            ActivityC8645 activityC8645 = this.f35562;
            activityC8645.f23213.f78323.m23890(strM33346);
            activityC8645.f23216.notifyDataSetChanged();
            activityC8645.f23213.f78333 = true;
        }
        m33348();
    }
}
