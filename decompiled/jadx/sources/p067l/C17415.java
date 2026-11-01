package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17415 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3669 f52063;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    public C17415(int i) {
        if ((i & 1) != 0) {
            this.f52063 = new C17435(65496, 2, "image/jpeg");
        } else {
            this.f52063 = new C4676();
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        return this.f52063.mo7079(interfaceC10375);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f52063.mo7078(interfaceC23116);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) {
        return this.f52063.mo7075(interfaceC10375, c24812);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f52063.mo7077(j, j2);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
        this.f52063.mo7076();
    }
}
