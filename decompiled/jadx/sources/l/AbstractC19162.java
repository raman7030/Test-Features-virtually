package l;

import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩵֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19162 extends AbstractC12725 implements InterfaceC18725 {
    @Override // l.InterfaceC18725
    public final C12413 findAny() {
        return (C12413) i0(C12974.d);
    }

    @Override // l.InterfaceC18725
    public final C12413 findFirst() {
        return (C12413) i0(C12974.c);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 sorted() {
        return new C11669(this, EnumC7330.q | EnumC7330.o);
    }

    public void forEach(LongConsumer longConsumer) {
        C11003.requireNonNull(longConsumer);
        i0(new C11128(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        C11003.requireNonNull(longConsumer);
        i0(new C11128(longConsumer, true));
    }

    public static InterfaceC0418 u0(InterfaceC15234 interfaceC15234) {
        if (interfaceC15234 instanceof InterfaceC0418) {
            return (InterfaceC0418) interfaceC15234;
        }
        if (AbstractC11875.a) {
            AbstractC11875.a(AbstractC12725.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // l.AbstractC12725
    public final EnumC8578 m0() {
        return EnumC8578.LONG_VALUE;
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 k0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234, boolean z, IntFunction intFunction) {
        return AbstractC9198.K(abstractC12725, interfaceC15234, z);
    }

    @Override // l.AbstractC12725
    public final InterfaceC15234 t0(AbstractC12725 abstractC12725, Supplier supplier, boolean z) {
        return new C10443(abstractC12725, supplier, z);
    }

    @Override // l.AbstractC12725
    public final boolean l0(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585) {
        LongConsumer c17332;
        boolean zF;
        InterfaceC0418 interfaceC0418U0 = u0(interfaceC15234);
        if (interfaceC0585 instanceof LongConsumer) {
            c17332 = (LongConsumer) interfaceC0585;
        } else {
            if (AbstractC11875.a) {
                AbstractC11875.a(AbstractC12725.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            C11003.requireNonNull(interfaceC0585);
            c17332 = new C17332(interfaceC0585, 1);
        }
        do {
            zF = interfaceC0585.f();
            if (zF) {
                break;
            }
        } while (interfaceC0418U0.tryAdvance(c17332));
        return zF;
    }

    @Override // l.AbstractC9198
    public final InterfaceC8948 c0(long j, IntFunction intFunction) {
        return AbstractC9198.Y(j);
    }

    @Override // l.InterfaceC12393
    public final InterfaceC6769 iterator() {
        InterfaceC0418 interfaceC0418Spliterator = spliterator();
        C11003.requireNonNull(interfaceC0418Spliterator);
        return new C23058(interfaceC0418Spliterator);
    }

    @Override // l.AbstractC12725, l.InterfaceC12393
    public final InterfaceC0418 spliterator() {
        return u0(super.spliterator());
    }

    @Override // l.InterfaceC18725
    public final InterfaceC0458 asDoubleStream() {
        return new C23142(this, EnumC7330.n, 2);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC17664 boxed() {
        return new C9053(this, 0, new C23742(5), 2);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 map(LongUnaryOperator longUnaryOperator) {
        C11003.requireNonNull(longUnaryOperator);
        return new C21732(this, EnumC7330.p | EnumC7330.n, longUnaryOperator, 1);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC17664 mapToObj(LongFunction longFunction) {
        C11003.requireNonNull(longFunction);
        return new C9053(this, EnumC7330.p | EnumC7330.n, longFunction, 2);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC11315 k() {
        C11003.requireNonNull(null);
        return new C13990(this, EnumC7330.p | EnumC7330.n, 2);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC0458 c() {
        C11003.requireNonNull(null);
        return new C23142(this, EnumC7330.p | EnumC7330.n, 3);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 a(C17022 c17022) {
        C11003.requireNonNull(c17022);
        return new C21732(this, EnumC7330.p | EnumC7330.n | EnumC7330.t, c17022, 2);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 filter(LongPredicate longPredicate) {
        C11003.requireNonNull(longPredicate);
        return new C21732(this, EnumC7330.t, longPredicate, 3);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 peek(LongConsumer longConsumer) {
        C11003.requireNonNull(longConsumer);
        return new C21732(this, longConsumer);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC22331.g(this, 0L, j);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC22331.g(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 takeWhile(LongPredicate longPredicate) {
        int i = AbstractC6831.a;
        C11003.requireNonNull(longPredicate);
        return new C18098(this, AbstractC6831.a, longPredicate);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 dropWhile(LongPredicate longPredicate) {
        int i = AbstractC6831.a;
        C11003.requireNonNull(longPredicate);
        return new C3281(this, AbstractC6831.b, longPredicate);
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 distinct() {
        return ((AbstractC11401) boxed()).distinct().mapToLong(new C23742(2));
    }

    @Override // l.InterfaceC18725
    public final long sum() {
        return reduce(0L, new C23742(9));
    }

    @Override // l.InterfaceC18725
    public final C12413 min() {
        return reduce(new C23742(1));
    }

    @Override // l.InterfaceC18725
    public final C12413 max() {
        return reduce(new C23742(8));
    }

    @Override // l.InterfaceC18725
    public final C4652 average() {
        long[] jArr = (long[]) collect(new C3639(15), new C23742(6), new C23742(7));
        long j = jArr[0];
        return j > 0 ? new C4652(jArr[1] / j) : C4652.c;
    }

    @Override // l.InterfaceC18725
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        C11003.requireNonNull(longBinaryOperator);
        return ((Long) i0(new C21898(EnumC8578.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // l.InterfaceC18725
    public final C11770 summaryStatistics() {
        return (C11770) collect(new C3639(4), new C23742(0), new C23742(3));
    }

    @Override // l.InterfaceC18725
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        C11003.requireNonNull(biConsumer);
        C22416 c22416 = new C22416(biConsumer, 2);
        C11003.requireNonNull(supplier);
        C11003.requireNonNull(objLongConsumer);
        C11003.requireNonNull(c22416);
        return i0(new C23036(EnumC8578.LONG_VALUE, c22416, objLongConsumer, supplier, 0));
    }

    @Override // l.InterfaceC18725
    public final boolean anyMatch(LongPredicate longPredicate) {
        return ((Boolean) i0(AbstractC9198.b0(EnumC20342.ANY, longPredicate))).booleanValue();
    }

    @Override // l.InterfaceC18725
    public final boolean allMatch(LongPredicate longPredicate) {
        return ((Boolean) i0(AbstractC9198.b0(EnumC20342.ALL, longPredicate))).booleanValue();
    }

    @Override // l.InterfaceC18725
    public final C12413 reduce(LongBinaryOperator longBinaryOperator) {
        C11003.requireNonNull(longBinaryOperator);
        return (C12413) i0(new C9632(EnumC8578.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // l.InterfaceC18725
    public final boolean noneMatch(LongPredicate longPredicate) {
        return ((Boolean) i0(AbstractC9198.b0(EnumC20342.NONE, longPredicate))).booleanValue();
    }

    @Override // l.InterfaceC18725
    public final long[] toArray() {
        return (long[]) AbstractC9198.V((InterfaceC6103) j0(new C23742(4))).b();
    }

    @Override // l.InterfaceC18725
    public final long count() {
        return ((Long) i0(new C8036(0))).longValue();
    }
}
