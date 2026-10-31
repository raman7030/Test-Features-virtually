package l;

/* JADX INFO: renamed from: l.֨ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1042 implements InterfaceC5276 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f3857 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f3858;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC5276 f3859;

    public C1042(InterfaceC5276 interfaceC5276) {
        this.f3859 = interfaceC5276;
    }

    @Override // l.InterfaceC5276
    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final void mo3578() {
        this.f3859.mo3578();
    }

    @Override // l.InterfaceC5276
    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final void mo3579() {
        this.f3859.mo3579();
    }

    @Override // l.InterfaceC5276
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void mo3577() {
        this.f3859.mo3577();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m3580(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f3857 = i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m3582(int i) {
        this.f3858 += i;
    }

    @Override // l.InterfaceC5276
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo3581(int i) {
        this.f3859.mo3581((i / this.f3857) + this.f3858);
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f3859.mo1526();
    }
}
