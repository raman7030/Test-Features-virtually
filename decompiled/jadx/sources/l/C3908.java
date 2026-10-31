package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۘۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3908 extends AbstractC20300 implements InterfaceC5483 {
    public final DoubleConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // l.InterfaceC5483
    public final /* synthetic */ void n(Double d) {
        AbstractC9198.n(this, d);
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

    public C3908(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // l.AbstractC20300, l.InterfaceC0585
    public final void accept(double d) {
        this.b.accept(d);
    }
}
