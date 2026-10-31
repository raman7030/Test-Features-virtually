package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۗܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3387 extends AbstractC22603 implements InterfaceC5483 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC5483
    public final /* synthetic */ void n(Double d) {
        AbstractC9198.n(this, d);
    }

    @Override // l.AbstractC18910, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        this.b += ((AbstractC22603) interfaceC18204).b;
    }

    @Override // l.AbstractC22603, l.InterfaceC0585
    public final void accept(double d) {
        this.b++;
    }
}
