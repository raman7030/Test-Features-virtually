package l;

/* JADX INFO: renamed from: l.ۢܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9664 implements InterfaceC3047 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16012 f29262;

    public C9664(ActivityC16012 activityC16012) {
        this.f29262 = activityC16012;
    }

    @Override // l.InterfaceC3047
    /* JADX INFO: renamed from: ֫ */
    public final void mo9337(int i) {
        ActivityC16012 activityC16012 = this.f29262;
        activityC16012.f49409.f27214 = activityC16012.m37856(i).getPath();
        activityC16012.f49409.f27211 = null;
        activityC16012.m37864();
    }

    @Override // l.InterfaceC3047
    /* JADX INFO: renamed from: ۧ */
    public final void mo9338(int i) {
        ActivityC16012.m37849(this.f29262, i);
    }

    @Override // l.InterfaceC3047
    /* JADX INFO: renamed from: ֫ */
    public final void mo9335() {
        ActivityC16012 activityC16012 = this.f29262;
        AbstractC12924 abstractC12924 = activityC16012.f49408;
        abstractC12924.getClass();
        if ((abstractC12924 instanceof C5164) || C6554.m18062(activityC16012.m37844()) || activityC16012.f49392 == null || !activityC16012.f49392.m46929(activityC16012.f49408.mo14785())) {
            activityC16012.m37851(!activityC16012.f49409.f27208);
        } else {
            activityC16012.f49392.m46933();
        }
    }

    @Override // l.InterfaceC3047
    /* JADX INFO: renamed from: ֫ */
    public final void mo9336(float f) {
        ActivityC16012 activityC16012 = this.f29262;
        float f2 = 1.0f - f;
        activityC16012.f10584.setAlpha(f2);
        activityC16012.f49410.setAlpha(f2);
        boolean z = activityC16012.f49400 > 0.0f;
        activityC16012.f49400 = f;
        if (z != (f > 0.0f)) {
            if (!activityC16012.f49395 && !activityC16012.isFinishing() && !activityC16012.isDestroyed()) {
                if (f > 0.0f && activityC16012.f49393) {
                    activityC16012.m37857(true);
                } else if (f == 0.0f && activityC16012.f49396) {
                    activityC16012.m37857(false);
                }
            }
            activityC16012.m37846();
        }
    }

    @Override // l.InterfaceC3047
    public final void onDismiss() {
        this.f29262.m37830(true);
    }
}
