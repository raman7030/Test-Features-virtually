package l;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0458 extends InterfaceC12393 {
    InterfaceC0458 a(C17022 c17022);

    boolean allMatch(DoublePredicate doublePredicate);

    boolean anyMatch(DoublePredicate doublePredicate);

    C4652 average();

    InterfaceC17664 boxed();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC0458 distinct();

    InterfaceC0458 dropWhile(DoublePredicate doublePredicate);

    InterfaceC0458 filter(DoublePredicate doublePredicate);

    C4652 findAny();

    C4652 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    InterfaceC18725 h();

    InterfaceC11315 i();

    @Override // l.InterfaceC12393
    InterfaceC1645 iterator();

    InterfaceC0458 limit(long j);

    InterfaceC0458 map(DoubleUnaryOperator doubleUnaryOperator);

    InterfaceC17664 mapToObj(DoubleFunction doubleFunction);

    C4652 max();

    C4652 min();

    boolean noneMatch(DoublePredicate doublePredicate);

    @Override // l.InterfaceC12393, l.InterfaceC18725
    InterfaceC0458 parallel();

    InterfaceC0458 peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    C4652 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // l.InterfaceC12393, l.InterfaceC18725
    InterfaceC0458 sequential();

    InterfaceC0458 skip(long j);

    InterfaceC0458 sorted();

    @Override // l.InterfaceC12393
    InterfaceC8160 spliterator();

    double sum();

    C13180 summaryStatistics();

    InterfaceC0458 takeWhile(DoublePredicate doublePredicate);

    double[] toArray();
}
