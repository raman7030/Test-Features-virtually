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

/* JADX INFO: renamed from: l.ۧ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13123 extends InterfaceC14147 {
    boolean allMatch(IntPredicate intPredicate);

    boolean anyMatch(IntPredicate intPredicate);

    InterfaceC2804 asDoubleStream();

    InterfaceC20165 asLongStream();

    C6790 average();

    InterfaceC19157 boxed();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC13123 distinct();

    InterfaceC13123 dropWhile(IntPredicate intPredicate);

    InterfaceC13123 filter(IntPredicate intPredicate);

    C19531 findAny();

    C19531 findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    /* JADX INFO: renamed from: g */
    InterfaceC13123 mo19636g(C18152 c18152);

    @Override // p067l.InterfaceC14147
    InterfaceC16177 iterator();

    InterfaceC13123 limit(long j);

    InterfaceC13123 map(IntUnaryOperator intUnaryOperator);

    InterfaceC2804 mapToDouble(IntToDoubleFunction intToDoubleFunction);

    InterfaceC20165 mapToLong(IntToLongFunction intToLongFunction);

    InterfaceC19157 mapToObj(IntFunction intFunction);

    C19531 max();

    C19531 min();

    boolean noneMatch(IntPredicate intPredicate);

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    InterfaceC13123 parallel();

    InterfaceC13123 peek(IntConsumer intConsumer);

    int reduce(int i, IntBinaryOperator intBinaryOperator);

    C19531 reduce(IntBinaryOperator intBinaryOperator);

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    InterfaceC13123 sequential();

    InterfaceC13123 skip(long j);

    InterfaceC13123 sorted();

    @Override // p067l.InterfaceC14147
    InterfaceC20202 spliterator();

    int sum();

    C12214 summaryStatistics();

    InterfaceC13123 takeWhile(IntPredicate intPredicate);

    int[] toArray();
}
