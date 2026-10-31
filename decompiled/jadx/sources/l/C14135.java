package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܰ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14135 extends AbstractC18910 implements InterfaceC18204, InterfaceC14696 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjLongConsumer c;
    public final /* synthetic */ C22416 d;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC14696
    public final /* synthetic */ void l(Long l2) {
        AbstractC9198.r(this, l2);
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        this.a = this.d.apply(this.a, ((C14135) interfaceC18204).a);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // l.InterfaceC0585
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    public C14135(Supplier supplier, ObjLongConsumer objLongConsumer, C22416 c22416) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = c22416;
    }
}
