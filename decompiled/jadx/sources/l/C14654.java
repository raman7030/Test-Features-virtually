package l;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܳܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14654 implements InterfaceC18204, InterfaceC10422 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ IntBinaryOperator c;

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(double d) {
        AbstractC9198.m();
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
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10422
    public final /* synthetic */ void d(Integer num) {
        AbstractC9198.p(this, num);
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ boolean f() {
        return false;
    }

    public C14654(int i, IntBinaryOperator intBinaryOperator) {
        this.b = i;
        this.c = intBinaryOperator;
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        accept(((C14654) interfaceC18204).a);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // l.InterfaceC0585
    public final void accept(int i) {
        this.a = this.c.applyAsInt(this.a, i);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.a);
    }
}
