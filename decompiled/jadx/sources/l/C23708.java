package l;

/* JADX INFO: renamed from: l.᩻۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes.dex */
public final class C23708 implements InterfaceC3953 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15240 f76773;

    public final String toString() {
        return "CheckContext: basicHandler";
    }

    public C23708(C15240 c15240) {
        this.f76773 = c15240;
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final void mo1084(InterfaceC3109 interfaceC3109, C16719 c16719) {
        C22364 c22364 = this.f76773.f46757;
        C12281 c12281 = C6241.f19132;
        c22364.m7273(interfaceC3109, new C12281("compiler", "prob.found.req", c16719));
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3859(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C1386 c1386) {
        return this.f76773.f46788.m17531(abstractC4308, abstractC4309, c1386);
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final C0384 mo3857() {
        return this.f76773.f46782.f20931;
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ۧ */
    public final C6755 mo3860() {
        return this.f76773.f46789.f37355;
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final C1386 mo3858(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        return new C19476(this.f76773, interfaceC3109, "unchecked.assign", abstractC4308, abstractC4309);
    }
}
