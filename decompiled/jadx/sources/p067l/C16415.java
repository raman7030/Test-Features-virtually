package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16415 extends AbstractC17756 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final C11723 f48257;

    public C16415(C21111 c21111) {
        super(c21111);
        this.f48257 = new C11723(c21111);
    }

    @Override // p067l.AbstractC17756
    /* JADX INFO: renamed from: ֫ */
    public final void mo14536(int i, Object obj) {
        C11723 c11723 = this.f48257;
        c11723.f32683 = i;
        ((Consumer) obj).accept(c11723);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM40337 = m40337();
        C11723 c11723 = this.f48257;
        c11723.f32683 = iM40337;
        return c11723;
    }
}
