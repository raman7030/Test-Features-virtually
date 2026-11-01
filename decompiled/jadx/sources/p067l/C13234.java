package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۨۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1V9 */
/* JADX INFO: loaded from: classes4.dex */
public class C13234 extends AbstractC19535 {

    /* JADX INFO: renamed from: ᩶ */
    public final C18236 f37199;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC21909 f37200;

    @Override // p067l.InterfaceC21909
    public final int getVisibility() {
        return this.f37200.getVisibility();
    }

    @Override // p067l.InterfaceC21909
    public final String getType() {
        return (String) this.f37199.m41469().mo6575(this.f37200.getType());
    }

    @Override // p067l.InterfaceC21909
    public Set getElements() {
        return C23190.m51664(this.f37200.getElements(), this.f37199.m41470());
    }

    public C13234(C18236 c18236, InterfaceC21909 interfaceC21909) {
        this.f37199 = c18236;
        this.f37200 = interfaceC21909;
    }
}
