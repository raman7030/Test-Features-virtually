package l;

/* JADX INFO: renamed from: l.֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B54W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1649 extends C1080 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10822 f5751;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f5750 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5749 = 0;

    public C1649(C10822 c10822) {
        this.f5751 = c10822;
    }

    @Override // l.C1080, l.InterfaceC21882
    /* JADX INFO: renamed from: ֫ */
    public final void mo3669() {
        if (this.f5750) {
            return;
        }
        this.f5750 = true;
        InterfaceC21882 interfaceC21882 = this.f5751.f32551;
        if (interfaceC21882 != null) {
            interfaceC21882.mo3669();
        }
    }

    @Override // l.InterfaceC21882
    public final void onAnimationEnd() {
        int i = this.f5749 + 1;
        this.f5749 = i;
        C10822 c10822 = this.f5751;
        if (i == c10822.f32547.size()) {
            InterfaceC21882 interfaceC21882 = c10822.f32551;
            if (interfaceC21882 != null) {
                interfaceC21882.onAnimationEnd();
            }
            this.f5749 = 0;
            this.f5750 = false;
            c10822.m27059();
        }
    }
}
