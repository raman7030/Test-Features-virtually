package p067l;

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
public interface InterfaceC2804 extends InterfaceC14147 {
    /* JADX INFO: renamed from: a */
    InterfaceC2804 mo4422a(C18546 c18546);

    boolean allMatch(DoublePredicate doublePredicate);

    boolean anyMatch(DoublePredicate doublePredicate);

    C6790 average();

    InterfaceC19157 boxed();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC2804 distinct();

    InterfaceC2804 dropWhile(DoublePredicate doublePredicate);

    InterfaceC2804 filter(DoublePredicate doublePredicate);

    C6790 findAny();

    C6790 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    /* JADX INFO: renamed from: h */
    InterfaceC20165 mo4423h();

    /* JADX INFO: renamed from: i */
    InterfaceC13123 mo4424i();

    @Override // p067l.InterfaceC14147
    InterfaceC3932 iterator();

    InterfaceC2804 limit(long j);

    InterfaceC2804 map(DoubleUnaryOperator doubleUnaryOperator);

    InterfaceC19157 mapToObj(DoubleFunction doubleFunction);

    C6790 max();

    C6790 min();

    boolean noneMatch(DoublePredicate doublePredicate);

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    InterfaceC2804 parallel();

    InterfaceC2804 peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    C6790 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    InterfaceC2804 sequential();

    InterfaceC2804 skip(long j);

    InterfaceC2804 sorted();

    @Override // p067l.InterfaceC14147
    InterfaceC10124 spliterator();

    double sum();

    C14895 summaryStatistics();

    InterfaceC2804 takeWhile(DoublePredicate doublePredicate);

    double[] toArray();
}
