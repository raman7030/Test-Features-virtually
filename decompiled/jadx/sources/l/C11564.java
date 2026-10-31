package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۨ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11564 extends AbstractC18910 implements InterfaceC18204, InterfaceC5483 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjDoubleConsumer c;
    public final /* synthetic */ C22416 d;

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(int i) {
        AbstractC9198.t();
        throw null;
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(long j) {
        AbstractC9198.u();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC5483
    public final /* synthetic */ void n(Double d) {
        AbstractC9198.n(this, d);
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        this.a = this.d.apply(this.a, ((C11564) interfaceC18204).a);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // l.InterfaceC0585
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    public C11564(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C22416 c22416) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = c22416;
    }
}
