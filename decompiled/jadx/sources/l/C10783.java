package l;

/* JADX INFO: renamed from: l.ۧۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes4.dex */
public final class C10783 implements InterfaceC6403 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20661 f32434;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6403 f32435;

    public C10783(C20661 c20661, InterfaceC6403 interfaceC6403) {
        this.f32434 = c20661;
        this.f32435 = interfaceC6403;
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        try {
            this.f32435.mo7076(abstractC5698);
        } catch (C20515 unused) {
            abstractC5698.f17563 |= 513;
            ((C19955) abstractC5698.f17560).f64618 = this.f32434.f66526;
        }
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo7078() {
        return this.f32435.mo7078();
    }
}
