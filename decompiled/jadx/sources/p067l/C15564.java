package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C15564 extends AbstractC19177 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final C18506 f44473;

    public C15564(C22531 c22531) {
        super(c22531);
        this.f44473 = new C18506(c22531);
    }

    @Override // p067l.AbstractC19177
    /* JADX INFO: renamed from: ֫ */
    public final void mo22195(int i, Object obj) {
        C18506 c18506 = this.f44473;
        c18506.f55272 = i;
        ((Consumer) obj).accept(c18506);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM43665 = m43665();
        C18506 c18506 = this.f44473;
        c18506.f55272 = iM43665;
        return c18506;
    }
}
