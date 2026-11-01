package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩷۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22077 implements InterfaceC19670, InterfaceC7580 {

    /* JADX INFO: renamed from: a */
    public boolean f69442a;

    /* JADX INFO: renamed from: b */
    public double f69443b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DoubleBinaryOperator f69444c;

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

    public C22077(DoubleBinaryOperator doubleBinaryOperator) {
        this.f69444c = doubleBinaryOperator;
    }

    @Override // p067l.InterfaceC19670
    /* JADX INFO: renamed from: i */
    public final void mo5379i(InterfaceC19670 interfaceC19670) {
        C22077 c22077 = (C22077) interfaceC19670;
        if (c22077.f69442a) {
            return;
        }
        accept(c22077.f69443b);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f69442a = true;
        this.f69443b = 0.0d;
    }

    @Override // p067l.InterfaceC2925
    public final void accept(double d) {
        if (this.f69442a) {
            this.f69442a = false;
            this.f69443b = d;
        } else {
            this.f69443b = this.f69444c.applyAsDouble(this.f69443b, d);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f69442a ? C6790.f17582c : new C6790(this.f69443b);
    }
}
