package p067l;

/* JADX INFO: renamed from: l.۬ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8M4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14948 implements InterfaceC20314 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20314 f42688;

    /* JADX INFO: renamed from: ۧ */
    public final long f42689;

    public C14948(InterfaceC20314 interfaceC20314, long j) {
        this.f42688 = interfaceC20314;
        this.f42689 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20314 m34195() {
        return this.f42688;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8569() {
        return this.f42688.mo8569();
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final void mo8568() {
        this.f42688.mo8568();
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final int mo8567(C5221 c5221, C23128 c23128, int i) {
        int iMo8567 = this.f42688.mo8567(c5221, c23128, i);
        if (iMo8567 == -4) {
            c23128.f72706 += this.f42689;
        }
        return iMo8567;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final int mo8566(long j) {
        return this.f42688.mo8566(j - this.f42689);
    }
}
