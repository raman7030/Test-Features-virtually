package p067l;

/* JADX INFO: renamed from: l.֨ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3359 implements InterfaceC7383 {

    /* JADX INFO: renamed from: ᩶ */
    public int f6629 = 1;

    /* JADX INFO: renamed from: ᩸ */
    public int f6630;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC7383 f6631;

    public C3359(InterfaceC7383 interfaceC7383) {
        this.f6631 = interfaceC7383;
    }

    @Override // p067l.InterfaceC7383
    /* JADX INFO: renamed from: ۚ֫ */
    public final void mo5865() {
        this.f6631.mo5865();
    }

    @Override // p067l.InterfaceC7383
    /* JADX INFO: renamed from: ۠֫ */
    public final void mo5866() {
        this.f6631.mo5866();
    }

    @Override // p067l.InterfaceC7383
    /* JADX INFO: renamed from: ۗ */
    public final void mo5864() {
        this.f6631.mo5864();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m5867(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f6629 = i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m5869(int i) {
        this.f6630 += i;
    }

    @Override // p067l.InterfaceC7383
    /* JADX INFO: renamed from: ۧ */
    public final void mo5868(int i) {
        this.f6631.mo5868((i / this.f6629) + this.f6630);
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f6631.mo3924();
    }
}
