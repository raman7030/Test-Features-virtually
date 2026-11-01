package p067l;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩴۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20165 extends InterfaceC14147 {
    /* JADX INFO: renamed from: a */
    InterfaceC20165 mo33215a(C18546 c18546);

    boolean allMatch(LongPredicate longPredicate);

    boolean anyMatch(LongPredicate longPredicate);

    InterfaceC2804 asDoubleStream();

    C6790 average();

    InterfaceC19157 boxed();

    /* JADX INFO: renamed from: c */
    InterfaceC2804 mo33216c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC20165 distinct();

    InterfaceC20165 dropWhile(LongPredicate longPredicate);

    InterfaceC20165 filter(LongPredicate longPredicate);

    C14166 findAny();

    C14166 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // p067l.InterfaceC14147
    InterfaceC8802 iterator();

    /* JADX INFO: renamed from: k */
    InterfaceC13123 mo33217k();

    InterfaceC20165 limit(long j);

    InterfaceC20165 map(LongUnaryOperator longUnaryOperator);

    InterfaceC19157 mapToObj(LongFunction longFunction);

    C14166 max();

    C14166 min();

    boolean noneMatch(LongPredicate longPredicate);

    InterfaceC20165 parallel();

    InterfaceC20165 peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    C14166 reduce(LongBinaryOperator longBinaryOperator);

    InterfaceC20165 sequential();

    InterfaceC20165 skip(long j);

    InterfaceC20165 sorted();

    @Override // p067l.InterfaceC14147
    InterfaceC2766 spliterator();

    long sum();

    C13555 summaryStatistics();

    InterfaceC20165 takeWhile(LongPredicate longPredicate);

    long[] toArray();
}
