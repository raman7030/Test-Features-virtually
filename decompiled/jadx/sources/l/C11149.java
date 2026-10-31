package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۧܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11149 extends C12559 implements InterfaceC8492, InterfaceC16086 {
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC8948
    public final InterfaceC5214 build() {
        return this;
    }

    @Override // l.InterfaceC16086, l.InterfaceC8948
    public final InterfaceC8492 build() {
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
        return AbstractC9198.C(this, j, j2);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC9198.v(this, intFunction);
    }

    @Override // l.InterfaceC5483
    public final /* synthetic */ void n(Double d) {
        AbstractC9198.n(this, d);
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
        AbstractC9198.w(this, (Double[]) objArr, i);
    }

    @Override // l.AbstractC2576, l.InterfaceC23558
    public final void e(int i, Object obj) {
        super.e(i, (double[]) obj);
    }

    @Override // l.AbstractC2576, l.InterfaceC23558
    public final void g(Object obj) {
        super.g((DoubleConsumer) obj);
    }

    @Override // l.C12559, l.AbstractC2576, java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
    public final InterfaceC1124 spliterator() {
        return super.spliterator();
    }

    @Override // l.C12559, l.AbstractC2576, java.lang.Iterable, l.InterfaceC4323, l.InterfaceC1144, java.util.Set, l.InterfaceC8886
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
        return (double[]) super.b();
    }
}
