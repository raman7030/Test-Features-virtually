package p067l;

/* JADX INFO: renamed from: l.۠ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C10210 implements InterfaceC11081 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C22951 f28303;

    /* JADX INFO: renamed from: ᩶ */
    public final C21199 f28304;

    /* JADX INFO: renamed from: ᩸ */
    public C21199 f28305;

    /* JADX INFO: renamed from: ᩹ */
    public int f28306 = 0;

    public C10210(C22951 c22951, C21199 c21199, C21199 c211910) {
        this.f28303 = c22951;
        this.f28304 = c21199;
        this.f28305 = c211910;
    }

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ۧ */
    public final void mo18031(AbstractC13152 abstractC13152, int i) {
        boolean z = abstractC13152 instanceof C21199;
        C22951 c22951 = this.f28303;
        if (z) {
            C21199 c21199 = (C21199) abstractC13152;
            if (c22951.f72196.m32711(c21199.m47899())) {
                C16914 c16914M51264 = C22951.m51264(c22951, c21199);
                C21199 c211910 = c16914M51264.f50076;
                this.f28305.m47895(c211910);
                this.f28306 += c16914M51264.f50077;
                this.f28305 = c211910;
                return;
            }
            if (abstractC13152 != this.f28304) {
                this.f28306++;
                return;
            }
            return;
        }
        if (abstractC13152 instanceof C12620) {
            this.f28305.m47895(new C12620(((C12620) abstractC13152).m27066()));
        } else if ((abstractC13152 instanceof C19857) && c22951.f72196.m32711(abstractC13152.mo30143().mo5244())) {
            this.f28305.m47895(new C19857(((C19857) abstractC13152).m27063()));
        } else {
            this.f28306++;
        }
    }

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ֫ */
    public final void mo18030(AbstractC13152 abstractC13152, int i) {
        if ((abstractC13152 instanceof C21199) && this.f28303.f72196.m32711(abstractC13152.mo5244())) {
            this.f28305 = this.f28305.mo30143();
        }
    }
}
