package p067l;

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
public abstract class AbstractC8428 extends AbstractC14463 implements InterfaceC13123 {
    @Override // p067l.InterfaceC13123
    public final C19531 findAny() {
        return (C19531) m33094i0(C20736.f63985d);
    }

    @Override // p067l.InterfaceC13123
    public final C19531 findFirst() {
        return (C19531) m33094i0(C20736.f63984c);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC13123 sorted() {
        return new C10106(this, EnumC9335.f25422q | EnumC9335.f25420o);
    }

    @Override // p067l.InterfaceC13123
    public void forEach(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        m33094i0(new C6753(intConsumer, false));
    }

    @Override // p067l.InterfaceC13123
    public void forEachOrdered(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        m33094i0(new C6753(intConsumer, true));
    }

    /* JADX INFO: renamed from: u0 */
    public static InterfaceC20202 m19635u0(InterfaceC16847 interfaceC16847) {
        if (interfaceC16847 instanceof InterfaceC20202) {
            return (InterfaceC20202) interfaceC16847;
        }
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(AbstractC14463.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: m0 */
    public final EnumC10521 mo17912m0() {
        return EnumC10521.INT_VALUE;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7324 mo17910k0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847, boolean z, IntFunction intFunction) {
        return AbstractC11111.m25595J(abstractC14463, interfaceC16847, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: t0 */
    public final InterfaceC16847 mo17913t0(AbstractC14463 abstractC14463, Supplier supplier, boolean z) {
        return new C25034(abstractC14463, supplier, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: l0 */
    public final boolean mo17911l0(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925) {
        IntConsumer c7955;
        boolean zMo4233f;
        InterfaceC20202 interfaceC20202M19635u0 = m19635u0(interfaceC16847);
        if (interfaceC2925 instanceof IntConsumer) {
            c7955 = (IntConsumer) interfaceC2925;
        } else {
            if (AbstractC13655.f38425a) {
                AbstractC13655.m31054a(AbstractC14463.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            C12826.requireNonNull(interfaceC2925);
            c7955 = new C7955(interfaceC2925, 1);
        }
        do {
            zMo4233f = interfaceC2925.mo4233f();
            if (zMo4233f) {
                break;
            }
        } while (interfaceC20202M19635u0.tryAdvance(c7955));
        return zMo4233f;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: c0 */
    public final InterfaceC10873 mo17909c0(long j, IntFunction intFunction) {
        return AbstractC11111.m25605X(j);
    }

    @Override // p067l.InterfaceC14147
    public final InterfaceC16177 iterator() {
        InterfaceC20202 interfaceC20202Spliterator = spliterator();
        C12826.requireNonNull(interfaceC20202Spliterator);
        return new C8190(interfaceC20202Spliterator);
    }

    @Override // p067l.AbstractC14463, p067l.InterfaceC14147
    public final InterfaceC20202 spliterator() {
        return m19635u0(super.spliterator());
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC20165 asLongStream() {
        return new C11624(this, 0, 1);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC2804 asDoubleStream() {
        return new C24363(this, 0, 1);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC19157 boxed() {
        return new C10973(this, 0, new C12789(22), 1);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC13123 map(IntUnaryOperator intUnaryOperator) {
        C12826.requireNonNull(intUnaryOperator);
        return new C9631(this, EnumC9335.f25421p | EnumC9335.f25419n, intUnaryOperator, 1);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC19157 mapToObj(IntFunction intFunction) {
        C12826.requireNonNull(intFunction);
        return new C10973(this, EnumC9335.f25421p | EnumC9335.f25419n, intFunction, 1);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC20165 mapToLong(IntToLongFunction intToLongFunction) {
        C12826.requireNonNull(intToLongFunction);
        return new C23023(this, EnumC9335.f25421p | EnumC9335.f25419n, intToLongFunction, 0);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC2804 mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        C12826.requireNonNull(intToDoubleFunction);
        return new C23043(this, EnumC9335.f25421p | EnumC9335.f25419n, intToDoubleFunction, 4);
    }

    @Override // p067l.InterfaceC13123
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        C12826.requireNonNull(intBinaryOperator);
        return ((Integer) m33094i0(new C2885(EnumC10521.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // p067l.InterfaceC13123
    /* JADX INFO: renamed from: g */
    public final InterfaceC13123 mo19636g(C18152 c18152) {
        C12826.requireNonNull(c18152);
        return new C9631(this, EnumC9335.f25421p | EnumC9335.f25419n | EnumC9335.f25425t, c18152, 2);
    }

    @Override // p067l.InterfaceC13123
    public final C19531 reduce(IntBinaryOperator intBinaryOperator) {
        C12826.requireNonNull(intBinaryOperator);
        return (C19531) m33094i0(new C11523(EnumC10521.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC13123 filter(IntPredicate intPredicate) {
        C12826.requireNonNull(intPredicate);
        return new C9631(this, EnumC9335.f25425t, intPredicate, 3);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC13123 peek(IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        return new C9631(this, intConsumer);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC13123 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC23592.m52404f(this, 0L, j);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC13123 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC23592.m52404f(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC13123 takeWhile(IntPredicate intPredicate) {
        int i = AbstractC8861.f24038a;
        C12826.requireNonNull(intPredicate);
        return new C24954(this, AbstractC8861.f24038a, intPredicate);
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC13123 dropWhile(IntPredicate intPredicate) {
        int i = AbstractC8861.f24038a;
        C12826.requireNonNull(intPredicate);
        return new C21170(this, AbstractC8861.f24039b, intPredicate);
    }

    @Override // p067l.InterfaceC13123
    public final long count() {
        return ((Long) m33094i0(new C10006(3))).longValue();
    }

    @Override // p067l.InterfaceC13123
    public final InterfaceC13123 distinct() {
        return ((AbstractC13204) boxed()).distinct().mapToInt(new C12789(21));
    }

    @Override // p067l.InterfaceC13123
    public final int sum() {
        return reduce(0, new C12789(26));
    }

    @Override // p067l.InterfaceC13123
    public final C19531 min() {
        return reduce(new C12789(23));
    }

    @Override // p067l.InterfaceC13123
    public final C19531 max() {
        return reduce(new C12789(27));
    }

    @Override // p067l.InterfaceC13123
    public final C6790 average() {
        long[] jArr = (long[]) collect(new C5827(14), new C12789(28), new C12789(29));
        long j = jArr[0];
        return j > 0 ? new C6790(jArr[1] / j) : C6790.f17582c;
    }

    @Override // p067l.InterfaceC13123
    public final C12214 summaryStatistics() {
        return (C12214) collect(new C5827(2), new C12789(24), new C12789(25));
    }

    @Override // p067l.InterfaceC13123
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        C12826.requireNonNull(biConsumer);
        C23673 c23673 = new C23673(biConsumer, 1);
        C12826.requireNonNull(supplier);
        C12826.requireNonNull(objIntConsumer);
        C12826.requireNonNull(c23673);
        return m33094i0(new C24262(EnumC10521.INT_VALUE, c23673, objIntConsumer, supplier, 4));
    }

    @Override // p067l.InterfaceC13123
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25608a0(EnumC21702.ANY, intPredicate))).booleanValue();
    }

    @Override // p067l.InterfaceC13123
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25608a0(EnumC21702.ALL, intPredicate))).booleanValue();
    }

    @Override // p067l.InterfaceC13123
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25608a0(EnumC21702.NONE, intPredicate))).booleanValue();
    }

    @Override // p067l.InterfaceC13123
    public final int[] toArray() {
        return (int[]) AbstractC11111.m25602U((InterfaceC8840) m33095j0(new C12789(20))).mo4230b();
    }
}
