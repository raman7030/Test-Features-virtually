package l;

/* JADX INFO: renamed from: l.֨᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8DU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1320 implements InterfaceC7838 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4728;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20371 f4729;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ double f4730;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21782 f4731;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ double f4732;

    public C1320(C21782 c21782, int i, InterfaceC20371 interfaceC20371, double d, double d2) {
        this.f4731 = c21782;
        this.f4728 = i;
        this.f4729 = interfaceC20371;
        this.f4730 = d;
        this.f4732 = d2;
    }

    @Override // l.InterfaceC7838
    public final void run() {
        int i = this.f4728;
        C21782 c21782 = this.f4731;
        C15430 c15430M49108 = C21782.m49108(c21782, i);
        InterfaceC21077 interfaceC21077 = c15430M49108.f47243;
        C18960 c18960 = ((C4143) this.f4729).f13115;
        interfaceC21077.mo6589(c18960.f59810);
        C18960.m43766(c18960, interfaceC21077);
        c15430M49108.f47243.mo6588(this.f4730, this.f4732, ((C7216) c21782.m49111()).m19305());
    }
}
