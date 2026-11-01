package p067l;

/* JADX INFO: renamed from: l.ۤܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C12230 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC8206 f34169;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12230(ActivityC8206 activityC8206, ActivityC8206 activityC8207) {
        super(activityC8207, -1);
        this.f34169 = activityC8206;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        try {
            this.f34169.f21774.f44485.f16385 = Integer.parseInt(m33346().trim());
            ActivityC22429.f70770 = true;
            m33348();
        } catch (Exception e) {
            m33337(e.getMessage());
        }
    }
}
