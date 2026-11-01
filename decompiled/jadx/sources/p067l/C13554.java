package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C13554 extends AbstractC19177 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C22531 f38125;

    /* JADX INFO: renamed from: ۫ */
    public C18506 f38126;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13554(C22531 c22531) {
        super(c22531);
        this.f38125 = c22531;
    }

    @Override // p067l.AbstractC19177
    /* JADX INFO: renamed from: ֫ */
    public final void mo22195(int i, Object obj) {
        C18506 c18506 = new C18506(this.f38125, i);
        this.f38126 = c18506;
        ((Consumer) obj).accept(c18506);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C18506 c18506 = new C18506(this.f38125, m43665());
        this.f38126 = c18506;
        return c18506;
    }

    @Override // p067l.AbstractC19177, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f38126.f55272 = -1;
    }
}
