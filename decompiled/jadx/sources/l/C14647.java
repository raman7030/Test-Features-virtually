package l;

/* JADX INFO: renamed from: l.ܳܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14647 implements InterfaceC8840 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f44774;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f44775;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8353 f44776;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3749 f44777;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C5544 f44778;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC11058 f44779;

    @Override // l.InterfaceC8840
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8840 mo22837() {
        return this;
    }

    @Override // l.InterfaceC8840
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8840 mo22838(C10045 c10045) {
        return this;
    }

    @Override // l.InterfaceC8840
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8840 mo22840(boolean z) {
        return this;
    }

    @Override // l.InterfaceC8840
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC8840 mo22839(InterfaceC11058 interfaceC11058) {
        m34936(interfaceC11058);
        return this;
    }

    public C14647(InterfaceC15097 interfaceC15097, InterfaceC20419 interfaceC20419) {
        C5544 c5544 = new C5544(interfaceC20419);
        C3749 c3749 = new C3749();
        C23135 c23135 = new C23135();
        this.f44775 = interfaceC15097;
        this.f44778 = c5544;
        this.f44777 = c3749;
        this.f44779 = c23135;
        this.f44774 = 1048576;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34936(InterfaceC11058 interfaceC11058) {
        C22632.m50629(interfaceC11058, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f44779 = interfaceC11058;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34935(C8353 c8353) {
        this.f44776 = c8353;
    }

    @Override // l.InterfaceC8840
    /* JADX INFO: renamed from: ֫ */
    public final C23820 mo22836(C11197 c11197) {
        c11197.f33612.getClass();
        return new C23820(c11197, this.f44775, this.f44778, this.f44777.m11377(c11197), this.f44779, this.f44774, this.f44776);
    }
}
