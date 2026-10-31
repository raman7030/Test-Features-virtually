package l;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۫ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12538 implements InterfaceC18204, InterfaceC10422 {
    public boolean a;
    public int b;
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

    public C12538(IntBinaryOperator intBinaryOperator) {
        this.c = intBinaryOperator;
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        C12538 c12538 = (C12538) interfaceC18204;
        if (c12538.a) {
            return;
        }
        accept(c12538.b);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = true;
        this.b = 0;
    }

    @Override // l.InterfaceC0585
    public final void accept(int i) {
        if (this.a) {
            this.a = false;
            this.b = i;
        } else {
            this.b = this.c.applyAsInt(this.b, i);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? C18058.c : new C18058(this.b);
    }
}
