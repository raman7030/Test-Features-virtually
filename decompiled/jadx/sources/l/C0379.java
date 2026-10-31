package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֡ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0379 extends C4964 implements InterfaceC6103, InterfaceC7620 {
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

    @Override // l.InterfaceC8948
    public final InterfaceC5214 build() {
        return this;
    }

    @Override // l.InterfaceC7620, l.InterfaceC8948
    public final InterfaceC6103 build() {
        return this;
    }

    @Override // l.InterfaceC0585
    public final void end() {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ InterfaceC5214 j(long j, long j2, IntFunction intFunction) {
        return AbstractC9198.E(this, j, j2);
    }

    @Override // l.InterfaceC14696
    public final /* synthetic */ void l(Long l2) {
        AbstractC9198.r(this, l2);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC9198.v(this, intFunction);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC5214
    public final /* bridge */ /* synthetic */ InterfaceC5214 a(int i) {
        a(i);
        throw null;
    }

    @Override // l.InterfaceC23558, l.InterfaceC5214
    public final InterfaceC23558 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC9198.y(this, (Long[]) objArr, i);
    }

    @Override // l.AbstractC2576, l.InterfaceC23558
    public final void e(int i, Object obj) {
        super.e(i, (long[]) obj);
    }

    @Override // l.AbstractC2576, l.InterfaceC23558
    public final void g(Object obj) {
        super.g((LongConsumer) obj);
    }

    @Override // l.C4964, l.AbstractC2576, java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    public final InterfaceC1124 spliterator() {
        return super.spliterator();
    }

    @Override // l.C4964, l.AbstractC2576, java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return super.spliterator();
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        clear();
        s(j);
    }

    @Override // l.AbstractC2576, l.InterfaceC23558
    public final Object b() {
        return (long[]) super.b();
    }
}
