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

/* JADX INFO: renamed from: l.ۧ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11315 extends InterfaceC12393 {
    boolean allMatch(IntPredicate intPredicate);

    boolean anyMatch(IntPredicate intPredicate);

    InterfaceC0458 asDoubleStream();

    InterfaceC18725 asLongStream();

    C4652 average();

    InterfaceC17664 boxed();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC11315 distinct();

    InterfaceC11315 dropWhile(IntPredicate intPredicate);

    InterfaceC11315 filter(IntPredicate intPredicate);

    C18058 findAny();

    C18058 findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    InterfaceC11315 g(C16607 c16607);

    @Override // l.InterfaceC12393
    InterfaceC14529 iterator();

    InterfaceC11315 limit(long j);

    InterfaceC11315 map(IntUnaryOperator intUnaryOperator);

    InterfaceC0458 mapToDouble(IntToDoubleFunction intToDoubleFunction);

    InterfaceC18725 mapToLong(IntToLongFunction intToLongFunction);

    InterfaceC17664 mapToObj(IntFunction intFunction);

    C18058 max();

    C18058 min();

    boolean noneMatch(IntPredicate intPredicate);

    @Override // l.InterfaceC12393, l.InterfaceC18725
    InterfaceC11315 parallel();

    InterfaceC11315 peek(IntConsumer intConsumer);

    int reduce(int i, IntBinaryOperator intBinaryOperator);

    C18058 reduce(IntBinaryOperator intBinaryOperator);

    @Override // l.InterfaceC12393, l.InterfaceC18725
    InterfaceC11315 sequential();

    InterfaceC11315 skip(long j);

    InterfaceC11315 sorted();

    @Override // l.InterfaceC12393
    InterfaceC18764 spliterator();

    int sum();

    C10359 summaryStatistics();

    InterfaceC11315 takeWhile(IntPredicate intPredicate);

    int[] toArray();
}
