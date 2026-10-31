package l;

/* JADX INFO: renamed from: l.ܿۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17187 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f52687;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17187(ActivityC6604 activityC6604, ActivityC6604 activityC6605) {
        super(activityC6605, -1);
        this.f52687 = activityC6604;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        ActivityC6604 activityC6604 = this.f52687;
        C23537 c23537 = activityC6604.f20336;
        c23537.f75567.getItem(c23537.f75565).m10319(m31260());
        activityC6604.f20336.f75587 = true;
        activityC6604.f20339.notifyDataSetChanged();
        m31262();
    }
}
