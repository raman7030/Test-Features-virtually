package p067l;

/* JADX INFO: renamed from: l.ۨܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes4.dex */
public class C13623 implements InterfaceC9838, InterfaceC23250 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC9838 f38333;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C4155 f38334;

    public C13623(C4155 c4155, InterfaceC9838 interfaceC9838) {
        this.f38334 = c4155;
        this.f38333 = interfaceC9838;
    }

    @Override // p067l.InterfaceC9838
    /* JADX INFO: renamed from: ܽ */
    public final int mo10470() {
        return this.f38333.mo10470();
    }

    @Override // p067l.InterfaceC9838
    /* JADX INFO: renamed from: ᩳ */
    public final int mo16884() {
        return this.f38333.mo16884();
    }

    @Override // p067l.InterfaceC23250
    public final String getName() {
        return ((InterfaceC23250) this.f38333).getName();
    }

    @Override // p067l.InterfaceC23250
    public final String getType() {
        return (String) C23190.m51662(this.f38334.f9170.m41469(), ((InterfaceC23250) this.f38333).getType());
    }

    @Override // p067l.InterfaceC23250
    public final String getSignature() {
        return ((InterfaceC23250) this.f38333).getSignature();
    }
}
