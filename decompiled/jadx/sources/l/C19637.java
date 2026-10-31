package l;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩵ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19637 implements InterfaceC18204, InterfaceC14696 {
    public long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ LongBinaryOperator c;

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

    public C19637(long j, LongBinaryOperator longBinaryOperator) {
        this.b = j;
        this.c = longBinaryOperator;
    }

    @Override // l.InterfaceC18204
    public final void i(InterfaceC18204 interfaceC18204) {
        accept(((C19637) interfaceC18204).a);
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // l.InterfaceC0585
    public final void accept(long j) {
        this.a = this.c.applyAsLong(this.a, j);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.a);
    }
}
