package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6358 extends AbstractC17756 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C21111 f16474;

    @Override // p067l.AbstractC17756
    /* JADX INFO: renamed from: ֫ */
    public final void mo14536(int i, Object obj) {
        ((Consumer) obj).accept(this.f16474.f66370[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6358(C21111 c21111) {
        super(c21111);
        this.f16474 = c21111;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f16474.f66370[m40337()];
    }
}
