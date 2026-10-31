package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17519 extends AbstractC18910 implements InterfaceC18204, InterfaceC10422 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjIntConsumer c;
    public final /* synthetic */ C22416 d;

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

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        this.a = this.d.apply(this.a, ((C17519) interfaceC18204).a);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // l.InterfaceC0585
    public final void accept(int i) {
        this.c.accept(this.a, i);
    }

    public C17519(Supplier supplier, ObjIntConsumer objIntConsumer, C22416 c22416) {
        this.b = supplier;
        this.c = objIntConsumer;
        this.d = c22416;
    }
}
