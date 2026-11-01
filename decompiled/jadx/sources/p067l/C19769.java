package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19769 extends AbstractC17756 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C21111 f60132;

    /* JADX INFO: renamed from: ۫ */
    public C11723 f60133;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19769(C21111 c21111) {
        super(c21111);
        this.f60132 = c21111;
    }

    @Override // p067l.AbstractC17756
    /* JADX INFO: renamed from: ֫ */
    public final void mo14536(int i, Object obj) {
        C11723 c11723 = new C11723(this.f60132, i);
        this.f60133 = c11723;
        ((Consumer) obj).accept(c11723);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C11723 c11723 = new C11723(this.f60132, m40337());
        this.f60133 = c11723;
        return c11723;
    }

    @Override // p067l.AbstractC17756, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f60133.f32683 = -1;
    }
}
