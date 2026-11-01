package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۨ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13359 extends AbstractC20341 implements InterfaceC19670, InterfaceC7580 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Supplier f37502b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ObjDoubleConsumer f37503c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C23673 f37504d;

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(int i) {
        AbstractC11111.m25618t();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(long j) {
        AbstractC11111.m25619u();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo12365n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void end() {
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        return false;
    }

    @Override // p067l.InterfaceC7580
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo12365n(Double d) {
        AbstractC11111.m25612n(this, d);
    }

    @Override // p067l.InterfaceC19670
    /* JADX INFO: renamed from: i */
    public final void mo5379i(InterfaceC19670 interfaceC19670) {
        this.f62821a = this.f37504d.apply(this.f62821a, ((C13359) interfaceC19670).f62821a);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f62821a = this.f37502b.get();
    }

    @Override // p067l.InterfaceC2925
    public final void accept(double d) {
        this.f37503c.accept(this.f62821a, d);
    }

    public C13359(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C23673 c23673) {
        this.f37502b = supplier;
        this.f37503c = objDoubleConsumer;
        this.f37504d = c23673;
    }
}
