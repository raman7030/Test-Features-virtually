package p067l;

/* JADX INFO: renamed from: l.ۙ۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6781 extends AbstractC0868 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC12088 f17557;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6781(ActivityC12088 activityC12088) {
        super(true);
        this.f17557 = activityC12088;
    }

    @Override // p067l.AbstractC0868
    /* JADX INFO: renamed from: ۧ */
    public final void mo3603() {
        ActivityC12088 activityC12088 = this.f17557;
        if (activityC12088.f33719.getVisibility() == 0) {
            ActivityC12088.m27775(activityC12088);
        } else {
            activityC12088.finish();
        }
    }
}
