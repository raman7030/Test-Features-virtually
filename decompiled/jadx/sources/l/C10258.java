package l;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10258 extends AbstractC18910 implements InterfaceC18204 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ BiConsumer c;
    public final /* synthetic */ BiConsumer d;

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
        this.d.accept(this.a, ((C10258) interfaceC18204).a);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.c.accept(this.a, obj);
    }

    public C10258(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = biConsumer2;
    }
}
