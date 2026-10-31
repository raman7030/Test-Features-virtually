package l;

/* JADX INFO: renamed from: l.ۨܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes4.dex */
public class C11842 implements InterfaceC7860, InterfaceC21972 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC7860 f35328;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1880 f35329;

    public C11842(C1880 c1880, InterfaceC7860 interfaceC7860) {
        this.f35329 = c1880;
        this.f35328 = interfaceC7860;
    }

    @Override // l.InterfaceC7860
    /* JADX INFO: renamed from: ܽ */
    public final int mo8424() {
        return this.f35328.mo8424();
    }

    @Override // l.InterfaceC7860
    /* JADX INFO: renamed from: ᩳ */
    public final int mo14974() {
        return this.f35328.mo14974();
    }

    @Override // l.InterfaceC21972
    public final String getName() {
        return ((InterfaceC21972) this.f35328).getName();
    }

    @Override // l.InterfaceC21972
    public final String getType() {
        return (String) C21908.m49309(this.f35329.f6388.m39233(), ((InterfaceC21972) this.f35328).getType());
    }

    @Override // l.InterfaceC21972
    public final String getSignature() {
        return ((InterfaceC21972) this.f35328).getSignature();
    }
}
