package l;

/* JADX INFO: renamed from: l.ܰۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C13541 implements InterfaceC2959 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11008 f40416;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f40417;

    public C13541(C11008 c11008, boolean[] zArr) {
        this.f40416 = c11008;
        this.f40417 = zArr;
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ܽ */
    public final void mo9041(int i) {
        if (i < this.f40416.f33115) {
            this.f40417[i] = false;
        }
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ֫ */
    public final void mo9039(int i) {
        if (i < this.f40416.f33115) {
            this.f40417[i] = false;
        }
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
