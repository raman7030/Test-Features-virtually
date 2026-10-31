package l;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5756 implements InterfaceC18204 {
    public boolean a;
    public Object b;
    public final /* synthetic */ BinaryOperator c;

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

    public C5756(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        C5756 c5756 = (C5756) interfaceC18204;
        if (c5756.a) {
            return;
        }
        n(c5756.b);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        if (this.a) {
            this.a = false;
            this.b = obj;
        } else {
            this.b = this.c.apply(this.b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? C16646.empty() : C16646.of(this.b);
    }
}
