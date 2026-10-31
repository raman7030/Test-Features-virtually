package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15832 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1368 f48925;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    public C15832(int i) {
        if ((i & 1) != 0) {
            this.f48925 = new C15853(65496, 2, "image/jpeg");
        } else {
            this.f48925 = new C2428();
        }
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return this.f48925.mo4841(interfaceC8424);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f48925.mo4840(interfaceC21830);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        return this.f48925.mo4837(interfaceC8424, c23615);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f48925.mo4839(j, j2);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
        this.f48925.mo4838();
    }
}
