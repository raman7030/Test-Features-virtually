package p067l;

/* JADX INFO: renamed from: l.ۖ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes2.dex */
public final class C4480 {

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f10060;

    /* JADX INFO: renamed from: ۧ */
    public volatile long f10061;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ViewOnClickListenerC20574 f10062;

    /* JADX INFO: renamed from: ܽ */
    public final C19644 f10063;

    /* JADX INFO: renamed from: ܿ */
    public volatile C10515 f10064;

    /* JADX INFO: renamed from: ᩳ */
    public final C8838 f10065;

    public C4480(ViewOnClickListenerC20574 viewOnClickListenerC20574, C8838 c8838, C19644 c19644) {
        this.f10062 = viewOnClickListenerC20574;
        this.f10065 = c8838;
        this.f10063 = c19644;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9484() {
        C10515 c10515 = this.f10064;
        if (c10515 == null || c10515.f29088 || c10515.f29089 == 0 || !this.f10062.m46521(this.f10063) || this.f10063.m44646() != this.f10061) {
            return;
        }
        this.f10065.m20435();
        C8838 c8838 = this.f10065;
        int i = c10515.f29090;
        C12862 c12862 = c8838.f23986;
        c12862.m29454(i, true);
        c8838.invalidate();
        c8838.m20432(c12862.m29480());
        this.f10060 = true;
    }
}
