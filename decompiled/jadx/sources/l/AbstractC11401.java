package l;

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
public abstract class AbstractC11401 extends AbstractC12725 implements InterfaceC17664 {
    @Override // l.InterfaceC17664
    public final InterfaceC17664 sorted() {
        return new C6894(this);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 distinct() {
        return new C16065(this, EnumC7330.m | EnumC7330.t);
    }

    @Override // l.InterfaceC17664
    public final C16646 min(Comparator comparator) {
        C11003.requireNonNull(comparator);
        return reduce(new C0939(comparator, 1));
    }

    @Override // l.InterfaceC17664
    public final C16646 findAny() {
        return (C16646) i0(C17750.d);
    }

    @Override // l.InterfaceC17664
    public final C16646 findFirst() {
        return (C16646) i0(C17750.c);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 sorted(Comparator comparator) {
        return new C6894(this, comparator);
    }

    @Override // l.InterfaceC17664
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        C11003.requireNonNull(biFunction);
        C11003.requireNonNull(binaryOperator);
        return i0(new C23036(EnumC8578.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // l.InterfaceC17664
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        C11003.requireNonNull(binaryOperator);
        C11003.requireNonNull(binaryOperator);
        return i0(new C23036(EnumC8578.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // l.InterfaceC17664
    public void forEach(Consumer consumer) {
        C11003.requireNonNull(consumer);
        i0(new C2661(consumer, false));
    }

    @Override // l.InterfaceC17664
    public void forEachOrdered(Consumer consumer) {
        C11003.requireNonNull(consumer);
        i0(new C2661(consumer, true));
    }

    @Override // l.InterfaceC17664
    public final C16646 max(Comparator comparator) {
        C11003.requireNonNull(comparator);
        return reduce(new C0939(comparator, 0));
    }

    @Override // l.AbstractC12725
    public final EnumC8578 m0() {
        return EnumC8578.REFERENCE;
    }

    @Override // l.InterfaceC17664
    public final C16646 reduce(BinaryOperator binaryOperator) {
        C11003.requireNonNull(binaryOperator);
        return (C16646) i0(new C9632(EnumC8578.REFERENCE, binaryOperator, 2));
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 k0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234, boolean z, IntFunction intFunction) {
        return AbstractC9198.H(abstractC12725, interfaceC15234, z, intFunction);
    }

    @Override // l.AbstractC12725
    public final InterfaceC15234 t0(AbstractC12725 abstractC12725, Supplier supplier, boolean z) {
        return new C8847(abstractC12725, supplier, z);
    }

    @Override // l.AbstractC12725
    public final boolean l0(InterfaceC15234 interfaceC15234, InterfaceC0585 interfaceC0585) {
        boolean zF;
        do {
            zF = interfaceC0585.f();
            if (zF) {
                break;
            }
        } while (interfaceC15234.tryAdvance(interfaceC0585));
        return zF;
    }

    @Override // l.AbstractC9198
    public final InterfaceC8948 c0(long j, IntFunction intFunction) {
        return AbstractC9198.G(j, intFunction);
    }

    @Override // l.InterfaceC12393
    public final Iterator iterator() {
        return C22291.iterator(spliterator());
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 filter(Predicate predicate) {
        C11003.requireNonNull(predicate);
        return new C9053(this, EnumC7330.t, predicate, 4);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 map(Function function) {
        C11003.requireNonNull(function);
        return new C13863(this, EnumC7330.p | EnumC7330.n, function, 0);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC11315 mapToInt(ToIntFunction toIntFunction) {
        C11003.requireNonNull(toIntFunction);
        return new C7641(this, EnumC7330.p | EnumC7330.n, toIntFunction, 4);
    }

    @Override // l.InterfaceC17664
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        C11003.requireNonNull(supplier);
        C11003.requireNonNull(biConsumer);
        C11003.requireNonNull(biConsumer2);
        return i0(new C23036(EnumC8578.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // l.InterfaceC17664
    public final InterfaceC18725 mapToLong(ToLongFunction toLongFunction) {
        C11003.requireNonNull(toLongFunction);
        return new C21732(this, EnumC7330.p | EnumC7330.n, toLongFunction, 6);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC0458 mapToDouble(ToDoubleFunction toDoubleFunction) {
        C11003.requireNonNull(toDoubleFunction);
        return new C21753(this, EnumC7330.p | EnumC7330.n, toDoubleFunction, 5);
    }

    @Override // l.InterfaceC17664
    public final long count() {
        return ((Long) i0(new C8036(2))).longValue();
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 flatMap(Function function) {
        C11003.requireNonNull(function);
        return new C13863(this, EnumC7330.p | EnumC7330.n | EnumC7330.t, function, 1);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC11315 flatMapToInt(Function function) {
        C11003.requireNonNull(function);
        return new C7641(this, EnumC7330.p | EnumC7330.n | EnumC7330.t, function, 5);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC0458 f(C17022 c17022) {
        C11003.requireNonNull(c17022);
        return new C21753(this, EnumC7330.p | EnumC7330.n | EnumC7330.t, c17022, 6);
    }

    @Override // l.InterfaceC17664
    public final Object collect(InterfaceC11688 interfaceC11688) {
        Object objI0;
        if (!this.h.r || !interfaceC11688.characteristics().contains(EnumC6043.CONCURRENT) || (EnumC7330.ORDERED.s(this.m) && !interfaceC11688.characteristics().contains(EnumC6043.UNORDERED))) {
            Supplier supplier = ((InterfaceC11688) C11003.requireNonNull(interfaceC11688)).supplier();
            objI0 = i0(new C23663(EnumC8578.REFERENCE, interfaceC11688.combiner(), interfaceC11688.accumulator(), supplier, interfaceC11688));
        } else {
            objI0 = interfaceC11688.supplier().get();
            forEach(new C10379(7, interfaceC11688.accumulator(), objI0));
        }
        return interfaceC11688.characteristics().contains(EnumC6043.IDENTITY_FINISH) ? objI0 : interfaceC11688.finisher().apply(objI0);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC18725 l(C17022 c17022) {
        C11003.requireNonNull(c17022);
        return new C21732(this, EnumC7330.p | EnumC7330.n | EnumC7330.t, c17022, 5);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 peek(Consumer consumer) {
        C11003.requireNonNull(consumer);
        return new C9053(this, consumer);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC22331.h(this, 0L, j);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC22331.h(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 takeWhile(Predicate predicate) {
        int i = AbstractC6831.a;
        C11003.requireNonNull(predicate);
        return new C6915(this, AbstractC6831.a, predicate, 0);
    }

    @Override // l.InterfaceC17664
    public final InterfaceC17664 dropWhile(Predicate predicate) {
        int i = AbstractC6831.a;
        C11003.requireNonNull(predicate);
        return new C6915(this, AbstractC6831.b, predicate, 1);
    }

    @Override // l.InterfaceC17664
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC9198.S(j0(intFunction), intFunction).m(intFunction);
    }

    @Override // l.InterfaceC17664
    public final Object[] toArray() {
        return toArray(new C23742(19));
    }

    @Override // l.InterfaceC17664
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) i0(AbstractC9198.d0(EnumC20342.ANY, predicate))).booleanValue();
    }

    @Override // l.InterfaceC17664
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) i0(AbstractC9198.d0(EnumC20342.ALL, predicate))).booleanValue();
    }

    @Override // l.InterfaceC17664
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) i0(AbstractC9198.d0(EnumC20342.NONE, predicate))).booleanValue();
    }

    @Override // l.InterfaceC17664
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
