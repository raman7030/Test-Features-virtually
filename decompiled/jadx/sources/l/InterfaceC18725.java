package l;

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
public interface InterfaceC18725 extends InterfaceC12393 {
    InterfaceC18725 a(C17022 c17022);

    boolean allMatch(LongPredicate longPredicate);

    boolean anyMatch(LongPredicate longPredicate);

    InterfaceC0458 asDoubleStream();

    C4652 average();

    InterfaceC17664 boxed();

    InterfaceC0458 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC18725 distinct();

    InterfaceC18725 dropWhile(LongPredicate longPredicate);

    InterfaceC18725 filter(LongPredicate longPredicate);

    C12413 findAny();

    C12413 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // l.InterfaceC12393
    InterfaceC6769 iterator();

    InterfaceC11315 k();

    InterfaceC18725 limit(long j);

    InterfaceC18725 map(LongUnaryOperator longUnaryOperator);

    InterfaceC17664 mapToObj(LongFunction longFunction);

    C12413 max();

    C12413 min();

    boolean noneMatch(LongPredicate longPredicate);

    InterfaceC18725 parallel();

    InterfaceC18725 peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    C12413 reduce(LongBinaryOperator longBinaryOperator);

    InterfaceC18725 sequential();

    InterfaceC18725 skip(long j);

    InterfaceC18725 sorted();

    @Override // l.InterfaceC12393
    InterfaceC0418 spliterator();

    long sum();

    C11770 summaryStatistics();

    InterfaceC18725 takeWhile(LongPredicate longPredicate);

    long[] toArray();
}
