package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0816 extends AbstractC18910 implements InterfaceC18204 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ BiFunction c;
    public final /* synthetic */ BinaryOperator d;

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(double d) {
        AbstractC9198.m();
        throw null;
    }

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        this.a = this.d.apply(this.a, ((C0816) interfaceC18204).a);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.a = this.c.apply(this.a, obj);
    }

    public C0816(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.b = obj;
        this.c = biFunction;
        this.d = binaryOperator;
    }
}
