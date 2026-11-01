package p067l;

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
public abstract class AbstractC20580 extends AbstractC14463 implements InterfaceC20165 {
    @Override // p067l.InterfaceC20165
    public final C14166 findAny() {
        return (C14166) m33094i0(C14699.f41925d);
    }

    @Override // p067l.InterfaceC20165
    public final C14166 findFirst() {
        return (C14166) m33094i0(C14699.f41924c);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC20165 sorted() {
        return new C13459(this, EnumC9335.f25422q | EnumC9335.f25420o);
    }

    public void forEach(LongConsumer longConsumer) {
        C12826.requireNonNull(longConsumer);
        m33094i0(new C12945(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        C12826.requireNonNull(longConsumer);
        m33094i0(new C12945(longConsumer, true));
    }

    /* JADX INFO: renamed from: u0 */
    public static InterfaceC2766 m46539u0(InterfaceC16847 interfaceC16847) {
        if (interfaceC16847 instanceof InterfaceC2766) {
            return (InterfaceC2766) interfaceC16847;
        }
        if (AbstractC13655.f38425a) {
            AbstractC13655.m31054a(AbstractC14463.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: m0 */
    public final EnumC10521 mo17912m0() {
        return EnumC10521.LONG_VALUE;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7324 mo17910k0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847, boolean z, IntFunction intFunction) {
        return AbstractC11111.m25596K(abstractC14463, interfaceC16847, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: t0 */
    public final InterfaceC16847 mo17913t0(AbstractC14463 abstractC14463, Supplier supplier, boolean z) {
        return new C12294(abstractC14463, supplier, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: l0 */
    public final boolean mo17911l0(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925) {
        LongConsumer c18841;
        boolean zMo4233f;
        InterfaceC2766 interfaceC2766M46539u0 = m46539u0(interfaceC16847);
        if (interfaceC2925 instanceof LongConsumer) {
            c18841 = (LongConsumer) interfaceC2925;
        } else {
            if (AbstractC13655.f38425a) {
                AbstractC13655.m31054a(AbstractC14463.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            C12826.requireNonNull(interfaceC2925);
            c18841 = new C18841(interfaceC2925, 1);
        }
        do {
            zMo4233f = interfaceC2925.mo4233f();
            if (zMo4233f) {
                break;
            }
        } while (interfaceC2766M46539u0.tryAdvance(c18841));
        return zMo4233f;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: c0 */
    public final InterfaceC10873 mo17909c0(long j, IntFunction intFunction) {
        return AbstractC11111.m25606Y(j);
    }

    @Override // p067l.InterfaceC14147
    public final InterfaceC8802 iterator() {
        InterfaceC2766 interfaceC2766Spliterator = spliterator();
        C12826.requireNonNull(interfaceC2766Spliterator);
        return new C24283(interfaceC2766Spliterator);
    }

    @Override // p067l.AbstractC14463, p067l.InterfaceC14147
    public final InterfaceC2766 spliterator() {
        return m46539u0(super.spliterator());
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC2804 asDoubleStream() {
        return new C24363(this, EnumC9335.f25419n, 2);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC19157 boxed() {
        return new C10973(this, 0, new C24933(5), 2);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC20165 map(LongUnaryOperator longUnaryOperator) {
        C12826.requireNonNull(longUnaryOperator);
        return new C23023(this, EnumC9335.f25421p | EnumC9335.f25419n, longUnaryOperator, 1);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC19157 mapToObj(LongFunction longFunction) {
        C12826.requireNonNull(longFunction);
        return new C10973(this, EnumC9335.f25421p | EnumC9335.f25419n, longFunction, 2);
    }

    @Override // p067l.InterfaceC20165
    /* JADX INFO: renamed from: k */
    public final InterfaceC13123 mo33217k() {
        C12826.requireNonNull(null);
        return new C15665(this, EnumC9335.f25421p | EnumC9335.f25419n, 2);
    }

    @Override // p067l.InterfaceC20165
    /* JADX INFO: renamed from: c */
    public final InterfaceC2804 mo33216c() {
        C12826.requireNonNull(null);
        return new C24363(this, EnumC9335.f25421p | EnumC9335.f25419n, 3);
    }

    @Override // p067l.InterfaceC20165
    /* JADX INFO: renamed from: a */
    public final InterfaceC20165 mo33215a(C18546 c18546) {
        C12826.requireNonNull(c18546);
        return new C23023(this, EnumC9335.f25421p | EnumC9335.f25419n | EnumC9335.f25425t, c18546, 2);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC20165 filter(LongPredicate longPredicate) {
        C12826.requireNonNull(longPredicate);
        return new C23023(this, EnumC9335.f25425t, longPredicate, 3);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC20165 peek(LongConsumer longConsumer) {
        C12826.requireNonNull(longConsumer);
        return new C23023(this, longConsumer);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC20165 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC23592.m52405g(this, 0L, j);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC20165 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC23592.m52405g(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC20165 takeWhile(LongPredicate longPredicate) {
        int i = AbstractC8861.f24038a;
        C12826.requireNonNull(longPredicate);
        return new C19569(this, AbstractC8861.f24038a, longPredicate);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC20165 dropWhile(LongPredicate longPredicate) {
        int i = AbstractC8861.f24038a;
        C12826.requireNonNull(longPredicate);
        return new C5487(this, AbstractC8861.f24039b, longPredicate);
    }

    @Override // p067l.InterfaceC20165
    public final InterfaceC20165 distinct() {
        return ((AbstractC13204) boxed()).distinct().mapToLong(new C24933(2));
    }

    @Override // p067l.InterfaceC20165
    public final long sum() {
        return reduce(0L, new C24933(9));
    }

    @Override // p067l.InterfaceC20165
    public final C14166 min() {
        return reduce(new C24933(1));
    }

    @Override // p067l.InterfaceC20165
    public final C14166 max() {
        return reduce(new C24933(8));
    }

    @Override // p067l.InterfaceC20165
    public final C6790 average() {
        long[] jArr = (long[]) collect(new C5827(15), new C24933(6), new C24933(7));
        long j = jArr[0];
        return j > 0 ? new C6790(jArr[1] / j) : C6790.f17582c;
    }

    @Override // p067l.InterfaceC20165
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        C12826.requireNonNull(longBinaryOperator);
        return ((Long) m33094i0(new C23181(EnumC10521.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // p067l.InterfaceC20165
    public final C13555 summaryStatistics() {
        return (C13555) collect(new C5827(4), new C24933(0), new C24933(3));
    }

    @Override // p067l.InterfaceC20165
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        C12826.requireNonNull(biConsumer);
        C23673 c23673 = new C23673(biConsumer, 2);
        C12826.requireNonNull(supplier);
        C12826.requireNonNull(objLongConsumer);
        C12826.requireNonNull(c23673);
        return m33094i0(new C24262(EnumC10521.LONG_VALUE, c23673, objLongConsumer, supplier, 0));
    }

    @Override // p067l.InterfaceC20165
    public final boolean anyMatch(LongPredicate longPredicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25609b0(EnumC21702.ANY, longPredicate))).booleanValue();
    }

    @Override // p067l.InterfaceC20165
    public final boolean allMatch(LongPredicate longPredicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25609b0(EnumC21702.ALL, longPredicate))).booleanValue();
    }

    @Override // p067l.InterfaceC20165
    public final C14166 reduce(LongBinaryOperator longBinaryOperator) {
        C12826.requireNonNull(longBinaryOperator);
        return (C14166) m33094i0(new C11523(EnumC10521.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // p067l.InterfaceC20165
    public final boolean noneMatch(LongPredicate longPredicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25609b0(EnumC21702.NONE, longPredicate))).booleanValue();
    }

    @Override // p067l.InterfaceC20165
    public final long[] toArray() {
        return (long[]) AbstractC11111.m25603V((InterfaceC8169) m33095j0(new C24933(4))).mo4230b();
    }

    @Override // p067l.InterfaceC20165
    public final long count() {
        return ((Long) m33094i0(new C10006(0))).longValue();
    }
}
