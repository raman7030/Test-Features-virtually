package p067l;

/* JADX INFO: renamed from: l.ܿۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18703 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC8645 f55868;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18703(ActivityC8645 activityC8645, ActivityC8645 activityC8646) {
        super(activityC8646, -1);
        this.f55868 = activityC8645;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        ActivityC8645 activityC8645 = this.f55868;
        C24738 c24738 = activityC8645.f23213;
        c24738.f78313.getItem(c24738.f78311).m12357(m33346());
        activityC8645.f23213.f78333 = true;
        activityC8645.f23216.notifyDataSetChanged();
        m33348();
    }
}
