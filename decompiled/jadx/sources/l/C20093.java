package l;

/* JADX INFO: renamed from: l.᩶ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4YY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20093 implements InterfaceC2959 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f65069;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f65070;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f65071;

    public C20093(int i) {
        this.f65070 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46311(AbstractC7479 abstractC7479) {
        this.f65069 = false;
        this.f65071 = false;
        C12836.m31223(abstractC7479, false, this);
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ܽ */
    public final void mo9041(int i) {
        if (i == this.f65070) {
            this.f65069 = true;
        }
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ֫ */
    public final void mo9039(int i) {
        if (i == this.f65070) {
            this.f65071 = true;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m46313() {
        return this.f65071;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46312() {
        return this.f65069;
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ۧ */
    public final void mo9040(int i) {
        mo9041(i);
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9042(int i) {
        mo9039(i);
    }
}
