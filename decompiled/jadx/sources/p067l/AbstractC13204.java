package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۨ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13204 extends AbstractC14463 implements InterfaceC19157 {
    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 sorted() {
        return new C8921(this);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 distinct() {
        return new C17637(this, EnumC9335.f25418m | EnumC9335.f25425t);
    }

    @Override // p067l.InterfaceC19157
    public final C18189 min(Comparator comparator) {
        C12826.requireNonNull(comparator);
        return reduce(new C3261(comparator, 1));
    }

    @Override // p067l.InterfaceC19157
    public final C18189 findAny() {
        return (C18189) m33094i0(C19238.f57498d);
    }

    @Override // p067l.InterfaceC19157
    public final C18189 findFirst() {
        return (C18189) m33094i0(C19238.f57497c);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 sorted(Comparator comparator) {
        return new C8921(this, comparator);
    }

    @Override // p067l.InterfaceC19157
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        C12826.requireNonNull(biFunction);
        C12826.requireNonNull(binaryOperator);
        return m33094i0(new C24262(EnumC10521.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // p067l.InterfaceC19157
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        C12826.requireNonNull(binaryOperator);
        C12826.requireNonNull(binaryOperator);
        return m33094i0(new C24262(EnumC10521.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // p067l.InterfaceC19157
    public void forEach(Consumer consumer) {
        C12826.requireNonNull(consumer);
        m33094i0(new C4898(consumer, false));
    }

    @Override // p067l.InterfaceC19157
    public void forEachOrdered(Consumer consumer) {
        C12826.requireNonNull(consumer);
        m33094i0(new C4898(consumer, true));
    }

    @Override // p067l.InterfaceC19157
    public final C18189 max(Comparator comparator) {
        C12826.requireNonNull(comparator);
        return reduce(new C3261(comparator, 0));
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: m0 */
    public final EnumC10521 mo17912m0() {
        return EnumC10521.REFERENCE;
    }

    @Override // p067l.InterfaceC19157
    public final C18189 reduce(BinaryOperator binaryOperator) {
        C12826.requireNonNull(binaryOperator);
        return (C18189) m33094i0(new C11523(EnumC10521.REFERENCE, binaryOperator, 2));
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7324 mo17910k0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847, boolean z, IntFunction intFunction) {
        return AbstractC11111.m25593H(abstractC14463, interfaceC16847, z, intFunction);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: t0 */
    public final InterfaceC16847 mo17913t0(AbstractC14463 abstractC14463, Supplier supplier, boolean z) {
        return new C10777(abstractC14463, supplier, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: l0 */
    public final boolean mo17911l0(InterfaceC16847 interfaceC16847, InterfaceC2925 interfaceC2925) {
        boolean zMo4233f;
        do {
            zMo4233f = interfaceC2925.mo4233f();
            if (zMo4233f) {
                break;
            }
        } while (interfaceC16847.tryAdvance(interfaceC2925));
        return zMo4233f;
    }

    @Override // p067l.AbstractC11111
    /* JADX INFO: renamed from: c0 */
    public final InterfaceC10873 mo17909c0(long j, IntFunction intFunction) {
        return AbstractC11111.m25592G(j, intFunction);
    }

    @Override // p067l.InterfaceC14147
    public final Iterator iterator() {
        return C23554.iterator(spliterator());
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 filter(Predicate predicate) {
        C12826.requireNonNull(predicate);
        return new C10973(this, EnumC9335.f25425t, predicate, 4);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 map(Function function) {
        C12826.requireNonNull(function);
        return new C15544(this, EnumC9335.f25421p | EnumC9335.f25419n, function, 0);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC13123 mapToInt(ToIntFunction toIntFunction) {
        C12826.requireNonNull(toIntFunction);
        return new C9631(this, EnumC9335.f25421p | EnumC9335.f25419n, toIntFunction, 4);
    }

    @Override // p067l.InterfaceC19157
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        C12826.requireNonNull(supplier);
        C12826.requireNonNull(biConsumer);
        C12826.requireNonNull(biConsumer2);
        return m33094i0(new C24262(EnumC10521.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC20165 mapToLong(ToLongFunction toLongFunction) {
        C12826.requireNonNull(toLongFunction);
        return new C23023(this, EnumC9335.f25421p | EnumC9335.f25419n, toLongFunction, 6);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC2804 mapToDouble(ToDoubleFunction toDoubleFunction) {
        C12826.requireNonNull(toDoubleFunction);
        return new C23043(this, EnumC9335.f25421p | EnumC9335.f25419n, toDoubleFunction, 5);
    }

    @Override // p067l.InterfaceC19157
    public final long count() {
        return ((Long) m33094i0(new C10006(2))).longValue();
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 flatMap(Function function) {
        C12826.requireNonNull(function);
        return new C15544(this, EnumC9335.f25421p | EnumC9335.f25419n | EnumC9335.f25425t, function, 1);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC13123 flatMapToInt(Function function) {
        C12826.requireNonNull(function);
        return new C9631(this, EnumC9335.f25421p | EnumC9335.f25419n | EnumC9335.f25425t, function, 5);
    }

    @Override // p067l.InterfaceC19157
    /* JADX INFO: renamed from: f */
    public final InterfaceC2804 mo7918f(C18546 c18546) {
        C12826.requireNonNull(c18546);
        return new C23043(this, EnumC9335.f25421p | EnumC9335.f25419n | EnumC9335.f25425t, c18546, 6);
    }

    @Override // p067l.InterfaceC19157
    public final Object collect(InterfaceC13477 interfaceC13477) {
        Object objM33094i0;
        if (!this.f41311h.f41321r || !interfaceC13477.characteristics().contains(EnumC8112.CONCURRENT) || (EnumC9335.ORDERED.m21660s(this.f41316m) && !interfaceC13477.characteristics().contains(EnumC8112.UNORDERED))) {
            Supplier supplier = ((InterfaceC13477) C12826.requireNonNull(interfaceC13477)).supplier();
            objM33094i0 = m33094i0(new C24858(EnumC10521.REFERENCE, interfaceC13477.combiner(), interfaceC13477.accumulator(), supplier, interfaceC13477));
        } else {
            objM33094i0 = interfaceC13477.supplier().get();
            forEach(new C12233(7, interfaceC13477.accumulator(), objM33094i0));
        }
        return interfaceC13477.characteristics().contains(EnumC8112.IDENTITY_FINISH) ? objM33094i0 : interfaceC13477.finisher().apply(objM33094i0);
    }

    @Override // p067l.InterfaceC19157
    /* JADX INFO: renamed from: l */
    public final InterfaceC20165 mo7919l(C18546 c18546) {
        C12826.requireNonNull(c18546);
        return new C23023(this, EnumC9335.f25421p | EnumC9335.f25419n | EnumC9335.f25425t, c18546, 5);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 peek(Consumer consumer) {
        C12826.requireNonNull(consumer);
        return new C10973(this, consumer);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC23592.m52406h(this, 0L, j);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC23592.m52406h(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 takeWhile(Predicate predicate) {
        int i = AbstractC8861.f24038a;
        C12826.requireNonNull(predicate);
        return new C8941(this, AbstractC8861.f24038a, predicate, 0);
    }

    @Override // p067l.InterfaceC19157
    public final InterfaceC19157 dropWhile(Predicate predicate) {
        int i = AbstractC8861.f24038a;
        C12826.requireNonNull(predicate);
        return new C8941(this, AbstractC8861.f24039b, predicate, 1);
    }

    @Override // p067l.InterfaceC19157
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC11111.m25600S(m33095j0(intFunction), intFunction).mo3499m(intFunction);
    }

    @Override // p067l.InterfaceC19157
    public final Object[] toArray() {
        return toArray(new C24933(19));
    }

    @Override // p067l.InterfaceC19157
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25610d0(EnumC21702.ANY, predicate))).booleanValue();
    }

    @Override // p067l.InterfaceC19157
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25610d0(EnumC21702.ALL, predicate))).booleanValue();
    }

    @Override // p067l.InterfaceC19157
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) m33094i0(AbstractC11111.m25610d0(EnumC21702.NONE, predicate))).booleanValue();
    }

    @Override // p067l.InterfaceC19157
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
