package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۘۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6083 extends AbstractC21662 implements InterfaceC7580 {

    /* JADX INFO: renamed from: b */
    public final DoubleConsumer f15290b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo12365n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p067l.InterfaceC7580
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo12365n(Double d) {
        AbstractC11111.m25612n(this, d);
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: b */
    public final Object mo10392b(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        abstractC14463.mo25629f0(interfaceC16847, this);
        return null;
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo10393e(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847) {
        m48868a(abstractC11111, interfaceC16847);
        return null;
    }

    public C6083(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.f15290b = doubleConsumer;
    }

    @Override // p067l.AbstractC21662, p067l.InterfaceC2925
    public final void accept(double d) {
        this.f15290b.accept(d);
    }
}
