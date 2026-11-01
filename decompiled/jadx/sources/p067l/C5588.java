package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۗܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5588 extends AbstractC23851 implements InterfaceC7580 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo12365n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.InterfaceC7580
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo12365n(Double d) {
        AbstractC11111.m25612n(this, d);
    }

    @Override // p067l.AbstractC20341, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f75779b);
    }

    @Override // p067l.InterfaceC19670
    /* JADX INFO: renamed from: i */
    public final void mo5379i(InterfaceC19670 interfaceC19670) {
        this.f75779b += ((AbstractC23851) interfaceC19670).f75779b;
    }

    @Override // p067l.AbstractC23851, p067l.InterfaceC2925
    public final void accept(double d) {
        this.f75779b++;
    }
}
