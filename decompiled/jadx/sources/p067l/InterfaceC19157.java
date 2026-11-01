package p067l;

import java.util.Comparator;
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

/* JADX INFO: renamed from: l.ܿ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC19157 extends InterfaceC14147 {
    boolean allMatch(Predicate predicate);

    boolean anyMatch(Predicate predicate);

    Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    Object collect(InterfaceC13477 interfaceC13477);

    long count();

    InterfaceC19157 distinct();

    InterfaceC19157 dropWhile(Predicate predicate);

    /* JADX INFO: renamed from: f */
    InterfaceC2804 mo7918f(C18546 c18546);

    InterfaceC19157 filter(Predicate predicate);

    C18189 findAny();

    C18189 findFirst();

    InterfaceC19157 flatMap(Function function);

    InterfaceC13123 flatMapToInt(Function function);

    void forEach(Consumer consumer);

    void forEachOrdered(Consumer consumer);

    /* JADX INFO: renamed from: l */
    InterfaceC20165 mo7919l(C18546 c18546);

    InterfaceC19157 limit(long j);

    InterfaceC19157 map(Function function);

    InterfaceC2804 mapToDouble(ToDoubleFunction toDoubleFunction);

    InterfaceC13123 mapToInt(ToIntFunction toIntFunction);

    InterfaceC20165 mapToLong(ToLongFunction toLongFunction);

    C18189 max(Comparator comparator);

    C18189 min(Comparator comparator);

    boolean noneMatch(Predicate predicate);

    InterfaceC19157 peek(Consumer consumer);

    Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator);

    Object reduce(Object obj, BinaryOperator binaryOperator);

    C18189 reduce(BinaryOperator binaryOperator);

    InterfaceC19157 skip(long j);

    InterfaceC19157 sorted();

    InterfaceC19157 sorted(Comparator comparator);

    InterfaceC19157 takeWhile(Predicate predicate);

    Object[] toArray();

    Object[] toArray(IntFunction intFunction);

    List toList();
}
