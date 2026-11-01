package p067l;

/* JADX INFO: renamed from: l.ۖ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8LH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4479 implements InterfaceC20314 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20314 f10057;

    /* JADX INFO: renamed from: ۧ */
    public boolean f10058;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C5820 f10059;

    public C4479(C5820 c5820, InterfaceC20314 interfaceC20314) {
        this.f10059 = c5820;
        this.f10057 = interfaceC20314;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9479() {
        this.f10058 = false;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8569() {
        return !this.f10059.m13101() && this.f10057.mo8569();
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final void mo8568() {
        this.f10057.mo8568();
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final int mo8567(C5221 c5221, C23128 c23128, int i) {
        C5820 c5820 = this.f10059;
        if (c5820.m13101()) {
            return -3;
        }
        if (this.f10058) {
            c23128.m14569(4);
            return -4;
        }
        long jMo4633 = c5820.mo4633();
        int iMo8567 = this.f10057.mo8567(c5221, c23128, i);
        if (iMo8567 == -5) {
            C10307 c10307 = c5221.f12253;
            c10307.getClass();
            int i2 = c10307.f28544;
            int i3 = c10307.f28543;
            if (i3 == 0 && i2 == 0) {
                return -5;
            }
            if (c5820.f14287 != 0) {
                i3 = 0;
            }
            if (c5820.f14289 != Long.MIN_VALUE) {
                i2 = 0;
            }
            C3601 c3601M23918 = c10307.m23918();
            c3601M23918.m6709(i3);
            c3601M23918.m6690(i2);
            c5221.f12253 = c3601M23918.m6672();
            return -5;
        }
        long j = c5820.f14289;
        if (j == Long.MIN_VALUE || ((iMo8567 != -4 || c23128.f72706 < j) && !(iMo8567 == -3 && jMo4633 == Long.MIN_VALUE && !c23128.f72705))) {
            return iMo8567;
        }
        c23128.mo7();
        c23128.m14569(4);
        this.f10058 = true;
        return -4;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final int mo8566(long j) {
        if (this.f10059.m13101()) {
            return -3;
        }
        return this.f10057.mo8566(j);
    }
}
