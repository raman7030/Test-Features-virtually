package p067l;

/* JADX INFO: renamed from: l.ۢܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11553 implements InterfaceC5264 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC17586 f32211;

    public C11553(ActivityC17586 activityC17586) {
        this.f32211 = activityC17586;
    }

    @Override // p067l.InterfaceC5264
    /* JADX INFO: renamed from: ֫ */
    public final void mo11379(int i) {
        ActivityC17586 activityC17586 = this.f32211;
        activityC17586.f52572.f30148 = activityC17586.m40042(i).getPath();
        activityC17586.f52572.f30145 = null;
        activityC17586.m40050();
    }

    @Override // p067l.InterfaceC5264
    /* JADX INFO: renamed from: ۧ */
    public final void mo11380(int i) {
        ActivityC17586.m40035(this.f32211, i);
    }

    @Override // p067l.InterfaceC5264
    /* JADX INFO: renamed from: ֫ */
    public final void mo11377() {
        ActivityC17586 activityC17586 = this.f32211;
        AbstractC14651 abstractC14651 = activityC17586.f52571;
        abstractC14651.getClass();
        if ((abstractC14651 instanceof C7276) || C8597.m20012(activityC17586.m40030()) || activityC17586.f52555 == null || !activityC17586.f52555.m49252(activityC17586.f52571.mo16693())) {
            activityC17586.m40037(!activityC17586.f52572.f30142);
        } else {
            activityC17586.f52555.m49256();
        }
    }

    @Override // p067l.InterfaceC5264
    /* JADX INFO: renamed from: ֫ */
    public final void mo11378(float f) {
        ActivityC17586 activityC17586 = this.f32211;
        float f2 = 1.0f - f;
        activityC17586.f13392.setAlpha(f2);
        activityC17586.f52573.setAlpha(f2);
        boolean z = activityC17586.f52563 > 0.0f;
        activityC17586.f52563 = f;
        if (z != (f > 0.0f)) {
            if (!activityC17586.f52558 && !activityC17586.isFinishing() && !activityC17586.isDestroyed()) {
                if (f > 0.0f && activityC17586.f52556) {
                    activityC17586.m40043(true);
                } else if (f == 0.0f && activityC17586.f52559) {
                    activityC17586.m40043(false);
                }
            }
            activityC17586.m40032();
        }
    }

    @Override // p067l.InterfaceC5264
    public final void onDismiss() {
        this.f32211.m40016(true);
    }
}
