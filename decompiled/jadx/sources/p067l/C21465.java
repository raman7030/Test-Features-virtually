package p067l;

/* JADX INFO: renamed from: l.᩶ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4YY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21465 implements InterfaceC5180 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f67709;

    /* JADX INFO: renamed from: ۧ */
    public int f67710;

    /* JADX INFO: renamed from: ܽ */
    public boolean f67711;

    public C21465(int i) {
        this.f67710 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48627(AbstractC9476 abstractC9476) {
        this.f67709 = false;
        this.f67711 = false;
        C14567.m33309(abstractC9476, false, this);
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ܽ */
    public final void mo11093(int i) {
        if (i == this.f67710) {
            this.f67709 = true;
        }
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ֫ */
    public final void mo11091(int i) {
        if (i == this.f67710) {
            this.f67711 = true;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m48629() {
        return this.f67711;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48628() {
        return this.f67709;
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ۧ */
    public final void mo11092(int i) {
        mo11093(i);
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11094(int i) {
        mo11091(i);
    }
}
