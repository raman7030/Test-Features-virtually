package p067l;

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
public abstract class AbstractC7758 extends AbstractC14463 implements InterfaceC2804 {
    @Override // p067l.InterfaceC2804
    public final C6790 findAny() {
        return (C6790) m33094i0(C18723.f55941d);
    }

    @Override // p067l.InterfaceC2804
    public final C6790 findFirst() {
        return (C6790) m33094i0(C18723.f55940c);
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC2804 sorted() {
        return new C22177(this, EnumC9335.f25422q | EnumC9335.f25420o);
    }

    /* JADX INFO: renamed from: u0 */
    public static InterfaceC10124 m17908u0(InterfaceC16847 interfaceC16847) {
        if (interfaceC16847 instanceof InterfaceC10124) {
            return (InterfaceC10124) interfaceC16847;
        }
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(AbstractC14463.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // p067l.InterfaceC2804
    public void forEach(DoubleConsumer doubleConsumer) {
        C12826.requireNonNull(doubleConsumer);
        m33094i0(new C6083(doubleConsumer, false));
    }

    @Override // p067l.InterfaceC2804
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        C12826.requireNonNull(doubleConsumer);
        m33094i0(new C6083(doubleConsumer, true));
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: m0 */
    public final EnumC10521 mo17912m0() {
        return EnumC10521.DOUBLE_VALUE;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7324 mo17910k0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847, boolean z, IntFunction intFunction) {
        return AbstractC11111.m25594I(abstractC14463, interfaceC16847, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: t0 */
    public final InterfaceC16847 mo17913t0(AbstractC14463 abstractC14463, Supplier supplier, boolean z) {
        return new C3596(abstractC14463, supplier, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: l0 */
    public final boolean mo17911l0(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925) {
        DoubleConsumer c13496;
        boolean zMo4233f;
        InterfaceC10124 interfaceC10124M17908u0 = m17908u0(interfaceC16847);
        if (interfaceC2925 instanceof DoubleConsumer) {
            c13496 = (DoubleConsumer) interfaceC2925;
        } else {
            if (AbstractC13655.f38425a) {
                AbstractC13655.m31054a(AbstractC14463.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            C12826.requireNonNull(interfaceC2925);
            c13496 = new C13496(interfaceC2925, 1);
        }
        do {
            zMo4233f = interfaceC2925.mo4233f();
            if (zMo4233f) {
                break;
            }
        } while (interfaceC10124M17908u0.tryAdvance(c13496));
        return zMo4233f;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: c0 */
    public final InterfaceC10873 mo17909c0(long j, IntFunction intFunction) {
        return AbstractC11111.m25598O(j);
    }

    @Override // p067l.InterfaceC14147
    public final InterfaceC3932 iterator() {
        InterfaceC10124 interfaceC10124Spliterator = spliterator();
        C12826.requireNonNull(interfaceC10124Spliterator);
        return new C5449(interfaceC10124Spliterator);
    }

    @Override // p067l.AbstractC14463, p067l.InterfaceC14147
    public final InterfaceC10124 spliterator() {
        return m17908u0(super.spliterator());
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC19157 boxed() {
        return new C10973(this, 0, new C12789(10), 0);
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC2804 map(DoubleUnaryOperator doubleUnaryOperator) {
        C12826.requireNonNull(doubleUnaryOperator);
        return new C23043(this, EnumC9335.f25421p | EnumC9335.f25419n, doubleUnaryOperator, 0);
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC19157 mapToObj(DoubleFunction doubleFunction) {
        C12826.requireNonNull(doubleFunction);
        return new C10973(this, EnumC9335.f25421p | EnumC9335.f25419n, doubleFunction, 0);
    }

    @Override // p067l.InterfaceC2804
    /* JADX INFO: renamed from: i */
    public final InterfaceC13123 mo4424i() {
        C12826.requireNonNull(null);
        return new C15665(this, EnumC9335.f25421p | EnumC9335.f25419n, 0);
    }

    @Override // p067l.InterfaceC2804
    /* JADX INFO: renamed from: h */
    public final InterfaceC20165 mo4423h() {
        C12826.requireNonNull(null);
        return new C11624(this, EnumC9335.f25421p | EnumC9335.f25419n, 0);
    }

    @Override // p067l.InterfaceC2804
    /* JADX INFO: renamed from: a */
    public final InterfaceC2804 mo4422a(C18546 c18546) {
        C12826.requireNonNull(c18546);
        return new C23043(this, EnumC9335.f25421p | EnumC9335.f25419n | EnumC9335.f25425t, c18546, 1);
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC2804 filter(DoublePredicate doublePredicate) {
        C12826.requireNonNull(doublePredicate);
        return new C23043(this, EnumC9335.f25425t, doublePredicate, 2);
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC2804 peek(DoubleConsumer doubleConsumer) {
        C12826.requireNonNull(doubleConsumer);
        return new C23043(this, doubleConsumer);
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC2804 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC23592.m52403e(this, 0L, j);
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC2804 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC23592.m52403e(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC2804 takeWhile(DoublePredicate doublePredicate) {
        int i = AbstractC8861.f24038a;
        C12826.requireNonNull(doublePredicate);
        return new C5983(this, AbstractC8861.f24038a, doublePredicate, 0);
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC2804 dropWhile(DoublePredicate doublePredicate) {
        int i = AbstractC8861.f24038a;
        C12826.requireNonNull(doublePredicate);
        return new C5983(this, AbstractC8861.f24039b, doublePredicate, 1);
    }

    @Override // p067l.InterfaceC2804
    public final InterfaceC2804 distinct() {
        return ((AbstractC13204) boxed()).distinct().mapToDouble(new C12789(11));
    }

    @Override // p067l.InterfaceC2804
    public final double sum() {
        double[] dArr = (double[]) collect(new C5827(9), new C12789(14), new C12789(4));
        Set set = C24205.f76714a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // p067l.InterfaceC2804
    public final C6790 min() {
        return reduce(new C12789(5));
    }

    @Override // p067l.InterfaceC2804
    public final C6790 max() {
        return reduce(new C12789(13));
    }

    @Override // p067l.InterfaceC2804
    public final C6790 average() {
        double[] dArr = (double[]) collect(new C5827(8), new C12789(6), new C12789(7));
        if (dArr[2] <= 0.0d) {
            return C6790.f17582c;
        }
        Set set = C24205.f76714a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new C6790(d / dArr[2]);
    }

    @Override // p067l.InterfaceC2804
    public final C14895 summaryStatistics() {
        return (C14895) collect(new C5827(0), new C12789(8), new C12789(9));
    }

    @Override // p067l.InterfaceC2804
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        C12826.requireNonNull(biConsumer);
        C23673 c23673 = new C23673(biConsumer, 0);
        C12826.requireNonNull(supplier);
        C12826.requireNonNull(objDoubleConsumer);
        C12826.requireNonNull(c23673);
        return m33094i0(new C24262(EnumC10521.DOUBLE_VALUE, c23673, objDoubleConsumer, supplier, 1));
    }

    @Override // p067l.InterfaceC2804
    public final boolean anyMatch(DoublePredicate doublePredicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25607Z(EnumC21702.ANY, doublePredicate))).booleanValue();
    }

    @Override // p067l.InterfaceC2804
    public final boolean allMatch(DoublePredicate doublePredicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25607Z(EnumC21702.ALL, doublePredicate))).booleanValue();
    }

    @Override // p067l.InterfaceC2804
    public final boolean noneMatch(DoublePredicate doublePredicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25607Z(EnumC21702.NONE, doublePredicate))).booleanValue();
    }

    @Override // p067l.InterfaceC2804
    public final double[] toArray() {
        return (double[]) AbstractC11111.m25601T((InterfaceC10440) m33095j0(new C12789(12))).mo4230b();
    }

    @Override // p067l.InterfaceC2804
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        C12826.requireNonNull(doubleBinaryOperator);
        return ((Double) m33094i0(new C8509(EnumC10521.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // p067l.InterfaceC2804
    public final C6790 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        C12826.requireNonNull(doubleBinaryOperator);
        return (C6790) m33094i0(new C11523(EnumC10521.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // p067l.InterfaceC2804
    public final long count() {
        return ((Long) m33094i0(new C10006(1))).longValue();
    }
}
