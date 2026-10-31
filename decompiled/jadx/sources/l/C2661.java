package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2661 extends AbstractC20300 {
    public final Consumer b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // l.InterfaceC21048
    public final Object b(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        abstractC12725.f0(interfaceC15234, this);
        return null;
    }

    @Override // l.InterfaceC21048
    public final /* bridge */ /* synthetic */ Object e(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        a(abstractC9198, interfaceC15234);
        return null;
    }

    public C2661(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.b.n(obj);
    }
}
