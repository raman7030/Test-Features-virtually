package l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5670 extends AbstractC12725 implements InterfaceC0458 {
    @Override // l.InterfaceC0458
    public final C4652 findAny() {
        return (C4652) i0(C17208.d);
    }

    @Override // l.InterfaceC0458
    public final C4652 findFirst() {
        return (C4652) i0(C17208.c);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 sorted() {
        return new C20842(this, EnumC7330.q | EnumC7330.o);
    }

    public static InterfaceC8160 u0(InterfaceC15234 interfaceC15234) {
        if (interfaceC15234 instanceof InterfaceC8160) {
            return (InterfaceC8160) interfaceC15234;
        }
        if (AbstractC11875.a) {
            AbstractC11875.a(AbstractC12725.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // l.InterfaceC0458
    public void forEach(DoubleConsumer doubleConsumer) {
        C11003.requireNonNull(doubleConsumer);
        i0(new C3908(doubleConsumer, false));
    }

    @Override // l.InterfaceC0458
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        C11003.requireNonNull(doubleConsumer);
        i0(new C3908(doubleConsumer, true));
    }

    @Override // l.AbstractC12725
    public final EnumC8578 m0() {
        return EnumC8578.DOUBLE_VALUE;
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 k0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234, boolean z, IntFunction intFunction) {
        return AbstractC9198.I(abstractC12725, interfaceC15234, z);
    }

    @Override // l.AbstractC12725
    public final InterfaceC15234 t0(AbstractC12725 abstractC12725, Supplier supplier, boolean z) {
        return new C1291(abstractC12725, supplier, z);
    }

    @Override // l.AbstractC12725
    public final boolean l0(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585) {
        DoubleConsumer c11708;
        boolean zF;
        InterfaceC8160 interfaceC8160U0 = u0(interfaceC15234);
        if (interfaceC0585 instanceof DoubleConsumer) {
            c11708 = (DoubleConsumer) interfaceC0585;
        } else {
            if (AbstractC11875.a) {
                AbstractC11875.a(AbstractC12725.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            C11003.requireNonNull(interfaceC0585);
            c11708 = new C11708(interfaceC0585, 1);
        }
        do {
            zF = interfaceC0585.f();
            if (zF) {
                break;
            }
        } while (interfaceC8160U0.tryAdvance(c11708));
        return zF;
    }

    @Override // l.AbstractC9198
    public final InterfaceC8948 c0(long j, IntFunction intFunction) {
        return AbstractC9198.O(j);
    }

    @Override // l.InterfaceC12393
    public final InterfaceC1645 iterator() {
        InterfaceC8160 interfaceC8160Spliterator = spliterator();
        C11003.requireNonNull(interfaceC8160Spliterator);
        return new C3241(interfaceC8160Spliterator);
    }

    @Override // l.AbstractC12725, l.InterfaceC12393
    public final InterfaceC8160 spliterator() {
        return u0(super.spliterator());
    }

    @Override // l.InterfaceC0458
    public final InterfaceC17664 boxed() {
        return new C9053(this, 0, new C10964(10), 0);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 map(DoubleUnaryOperator doubleUnaryOperator) {
        C11003.requireNonNull(doubleUnaryOperator);
        return new C21753(this, EnumC7330.p | EnumC7330.n, doubleUnaryOperator, 0);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC17664 mapToObj(DoubleFunction doubleFunction) {
        C11003.requireNonNull(doubleFunction);
        return new C9053(this, EnumC7330.p | EnumC7330.n, doubleFunction, 0);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC11315 i() {
        C11003.requireNonNull(null);
        return new C13990(this, EnumC7330.p | EnumC7330.n, 0);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC18725 h() {
        C11003.requireNonNull(null);
        return new C9738(this, EnumC7330.p | EnumC7330.n, 0);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 a(C17022 c17022) {
        C11003.requireNonNull(c17022);
        return new C21753(this, EnumC7330.p | EnumC7330.n | EnumC7330.t, c17022, 1);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 filter(DoublePredicate doublePredicate) {
        C11003.requireNonNull(doublePredicate);
        return new C21753(this, EnumC7330.t, doublePredicate, 2);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 peek(DoubleConsumer doubleConsumer) {
        C11003.requireNonNull(doubleConsumer);
        return new C21753(this, doubleConsumer);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC22331.e(this, 0L, j);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC22331.e(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 takeWhile(DoublePredicate doublePredicate) {
        int i = AbstractC6831.a;
        C11003.requireNonNull(doublePredicate);
        return new C3803(this, AbstractC6831.a, doublePredicate, 0);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 dropWhile(DoublePredicate doublePredicate) {
        int i = AbstractC6831.a;
        C11003.requireNonNull(doublePredicate);
        return new C3803(this, AbstractC6831.b, doublePredicate, 1);
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 distinct() {
        return ((AbstractC11401) boxed()).distinct().mapToDouble(new C10964(11));
    }

    @Override // l.InterfaceC0458
    public final double sum() {
        double[] dArr = (double[]) collect(new C3639(9), new C10964(14), new C10964(4));
        Set set = C22976.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // l.InterfaceC0458
    public final C4652 min() {
        return reduce(new C10964(5));
    }

    @Override // l.InterfaceC0458
    public final C4652 max() {
        return reduce(new C10964(13));
    }

    @Override // l.InterfaceC0458
    public final C4652 average() {
        double[] dArr = (double[]) collect(new C3639(8), new C10964(6), new C10964(7));
        if (dArr[2] <= 0.0d) {
            return C4652.c;
        }
        Set set = C22976.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new C4652(d / dArr[2]);
    }

    @Override // l.InterfaceC0458
    public final C13180 summaryStatistics() {
        return (C13180) collect(new C3639(0), new C10964(8), new C10964(9));
    }

    @Override // l.InterfaceC0458
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        C11003.requireNonNull(biConsumer);
        C22416 c22416 = new C22416(biConsumer, 0);
        C11003.requireNonNull(supplier);
        C11003.requireNonNull(objDoubleConsumer);
        C11003.requireNonNull(c22416);
        return i0(new C23036(EnumC8578.DOUBLE_VALUE, c22416, objDoubleConsumer, supplier, 1));
    }

    @Override // l.InterfaceC0458
    public final boolean anyMatch(DoublePredicate doublePredicate) {
        return ((Boolean) i0(AbstractC9198.Z(EnumC20342.ANY, doublePredicate))).booleanValue();
    }

    @Override // l.InterfaceC0458
    public final boolean allMatch(DoublePredicate doublePredicate) {
        return ((Boolean) i0(AbstractC9198.Z(EnumC20342.ALL, doublePredicate))).booleanValue();
    }

    @Override // l.InterfaceC0458
    public final boolean noneMatch(DoublePredicate doublePredicate) {
        return ((Boolean) i0(AbstractC9198.Z(EnumC20342.NONE, doublePredicate))).booleanValue();
    }

    @Override // l.InterfaceC0458
    public final double[] toArray() {
        return (double[]) AbstractC9198.T((InterfaceC8492) j0(new C10964(12))).b();
    }

    @Override // l.InterfaceC0458
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        C11003.requireNonNull(doubleBinaryOperator);
        return ((Double) i0(new C6461(EnumC8578.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // l.InterfaceC0458
    public final C4652 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        C11003.requireNonNull(doubleBinaryOperator);
        return (C4652) i0(new C9632(EnumC8578.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // l.InterfaceC0458
    public final long count() {
        return ((Long) i0(new C8036(1))).longValue();
    }
}
