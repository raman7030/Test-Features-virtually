package l;

import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۛ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6375 extends AbstractC12725 implements InterfaceC11315 {
    @Override // l.InterfaceC11315
    public final C18058 findAny() {
        return (C18058) i0(C19326.d);
    }

    @Override // l.InterfaceC11315
    public final C18058 findFirst() {
        return (C18058) i0(C19326.c);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 sorted() {
        return new C8141(this, EnumC7330.q | EnumC7330.o);
    }

    @Override // l.InterfaceC11315
    public void forEach(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        i0(new C4613(intConsumer, false));
    }

    @Override // l.InterfaceC11315
    public void forEachOrdered(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        i0(new C4613(intConsumer, true));
    }

    public static InterfaceC18764 u0(InterfaceC15234 interfaceC15234) {
        if (interfaceC15234 instanceof InterfaceC18764) {
            return (InterfaceC18764) interfaceC15234;
        }
        if (AbstractC11875.a) {
            AbstractC11875.a(AbstractC12725.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // l.AbstractC12725
    public final EnumC8578 m0() {
        return EnumC8578.INT_VALUE;
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 k0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234, boolean z, IntFunction intFunction) {
        return AbstractC9198.J(abstractC12725, interfaceC15234, z);
    }

    @Override // l.AbstractC12725
    public final InterfaceC15234 t0(AbstractC12725 abstractC12725, Supplier supplier, boolean z) {
        return new C23848(abstractC12725, supplier, z);
    }

    @Override // l.AbstractC12725
    public final boolean l0(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585) {
        IntConsumer c5878;
        boolean zF;
        InterfaceC18764 interfaceC18764U0 = u0(interfaceC15234);
        if (interfaceC0585 instanceof IntConsumer) {
            c5878 = (IntConsumer) interfaceC0585;
        } else {
            if (AbstractC11875.a) {
                AbstractC11875.a(AbstractC12725.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            C11003.requireNonNull(interfaceC0585);
            c5878 = new C5878(interfaceC0585, 1);
        }
        do {
            zF = interfaceC0585.f();
            if (zF) {
                break;
            }
        } while (interfaceC18764U0.tryAdvance(c5878));
        return zF;
    }

    @Override // l.AbstractC9198
    public final InterfaceC8948 c0(long j, IntFunction intFunction) {
        return AbstractC9198.X(j);
    }

    @Override // l.InterfaceC12393
    public final InterfaceC14529 iterator() {
        InterfaceC18764 interfaceC18764Spliterator = spliterator();
        C11003.requireNonNull(interfaceC18764Spliterator);
        return new C6125(interfaceC18764Spliterator);
    }

    @Override // l.AbstractC12725, l.InterfaceC12393
    public final InterfaceC18764 spliterator() {
        return u0(super.spliterator());
    }

    @Override // l.InterfaceC11315
    public final InterfaceC18725 asLongStream() {
        return new C9738(this, 0, 1);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC0458 asDoubleStream() {
        return new C23142(this, 0, 1);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC17664 boxed() {
        return new C9053(this, 0, new C10964(22), 1);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 map(IntUnaryOperator intUnaryOperator) {
        C11003.requireNonNull(intUnaryOperator);
        return new C7641(this, EnumC7330.p | EnumC7330.n, intUnaryOperator, 1);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC17664 mapToObj(IntFunction intFunction) {
        C11003.requireNonNull(intFunction);
        return new C9053(this, EnumC7330.p | EnumC7330.n, intFunction, 1);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC18725 mapToLong(IntToLongFunction intToLongFunction) {
        C11003.requireNonNull(intToLongFunction);
        return new C21732(this, EnumC7330.p | EnumC7330.n, intToLongFunction, 0);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC0458 mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        C11003.requireNonNull(intToDoubleFunction);
        return new C21753(this, EnumC7330.p | EnumC7330.n, intToDoubleFunction, 4);
    }

    @Override // l.InterfaceC11315
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        C11003.requireNonNull(intBinaryOperator);
        return ((Integer) i0(new C0543(EnumC8578.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 g(C16607 c16607) {
        C11003.requireNonNull(c16607);
        return new C7641(this, EnumC7330.p | EnumC7330.n | EnumC7330.t, c16607, 2);
    }

    @Override // l.InterfaceC11315
    public final C18058 reduce(IntBinaryOperator intBinaryOperator) {
        C11003.requireNonNull(intBinaryOperator);
        return (C18058) i0(new C9632(EnumC8578.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 filter(IntPredicate intPredicate) {
        C11003.requireNonNull(intPredicate);
        return new C7641(this, EnumC7330.t, intPredicate, 3);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 peek(IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        return new C7641(this, intConsumer);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC22331.f(this, 0L, j);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC22331.f(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 takeWhile(IntPredicate intPredicate) {
        int i = AbstractC6831.a;
        C11003.requireNonNull(intPredicate);
        return new C23764(this, AbstractC6831.a, intPredicate);
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 dropWhile(IntPredicate intPredicate) {
        int i = AbstractC6831.a;
        C11003.requireNonNull(intPredicate);
        return new C19782(this, AbstractC6831.b, intPredicate);
    }

    @Override // l.InterfaceC11315
    public final long count() {
        return ((Long) i0(new C8036(3))).longValue();
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 distinct() {
        return ((AbstractC11401) boxed()).distinct().mapToInt(new C10964(21));
    }

    @Override // l.InterfaceC11315
    public final int sum() {
        return reduce(0, new C10964(26));
    }

    @Override // l.InterfaceC11315
    public final C18058 min() {
        return reduce(new C10964(23));
    }

    @Override // l.InterfaceC11315
    public final C18058 max() {
        return reduce(new C10964(27));
    }

    @Override // l.InterfaceC11315
    public final C4652 average() {
        long[] jArr = (long[]) collect(new C3639(14), new C10964(28), new C10964(29));
        long j = jArr[0];
        return j > 0 ? new C4652(jArr[1] / j) : C4652.c;
    }

    @Override // l.InterfaceC11315
    public final C10359 summaryStatistics() {
        return (C10359) collect(new C3639(2), new C10964(24), new C10964(25));
    }

    @Override // l.InterfaceC11315
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        C11003.requireNonNull(biConsumer);
        C22416 c22416 = new C22416(biConsumer, 1);
        C11003.requireNonNull(supplier);
        C11003.requireNonNull(objIntConsumer);
        C11003.requireNonNull(c22416);
        return i0(new C23036(EnumC8578.INT_VALUE, c22416, objIntConsumer, supplier, 4));
    }

    @Override // l.InterfaceC11315
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) i0(AbstractC9198.a0(EnumC20342.ANY, intPredicate))).booleanValue();
    }

    @Override // l.InterfaceC11315
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) i0(AbstractC9198.a0(EnumC20342.ALL, intPredicate))).booleanValue();
    }

    @Override // l.InterfaceC11315
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) i0(AbstractC9198.a0(EnumC20342.NONE, intPredicate))).booleanValue();
    }

    @Override // l.InterfaceC11315
    public final int[] toArray() {
        return (int[]) AbstractC9198.U((InterfaceC6809) j0(new C10964(20))).b();
    }
}
