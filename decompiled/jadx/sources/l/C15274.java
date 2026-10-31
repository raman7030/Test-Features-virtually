package l;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܶܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15274 implements InterfaceC18204, InterfaceC5483 {
    public double a;
    public final /* synthetic */ double b;
    public final /* synthetic */ DoubleBinaryOperator c;

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

    public C15274(double d, DoubleBinaryOperator doubleBinaryOperator) {
        this.b = d;
        this.c = doubleBinaryOperator;
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        accept(((C15274) interfaceC18204).a);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // l.InterfaceC0585
    public final void accept(double d) {
        this.a = this.c.applyAsDouble(this.a, d);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.a);
    }
}
