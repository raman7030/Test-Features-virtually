package l;

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
public interface InterfaceC17664 extends InterfaceC12393 {
    boolean allMatch(Predicate predicate);

    boolean anyMatch(Predicate predicate);

    Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    Object collect(InterfaceC11688 interfaceC11688);

    long count();

    InterfaceC17664 distinct();

    InterfaceC17664 dropWhile(Predicate predicate);

    InterfaceC0458 f(C17022 c17022);

    InterfaceC17664 filter(Predicate predicate);

    C16646 findAny();

    C16646 findFirst();

    InterfaceC17664 flatMap(Function function);

    InterfaceC11315 flatMapToInt(Function function);

    void forEach(Consumer consumer);

    void forEachOrdered(Consumer consumer);

    InterfaceC18725 l(C17022 c17022);

    InterfaceC17664 limit(long j);

    InterfaceC17664 map(Function function);

    InterfaceC0458 mapToDouble(ToDoubleFunction toDoubleFunction);

    InterfaceC11315 mapToInt(ToIntFunction toIntFunction);

    InterfaceC18725 mapToLong(ToLongFunction toLongFunction);

    C16646 max(Comparator comparator);

    C16646 min(Comparator comparator);

    boolean noneMatch(Predicate predicate);

    InterfaceC17664 peek(Consumer consumer);

    Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator);

    Object reduce(Object obj, BinaryOperator binaryOperator);

    C16646 reduce(BinaryOperator binaryOperator);

    InterfaceC17664 skip(long j);

    InterfaceC17664 sorted();

    InterfaceC17664 sorted(Comparator comparator);

    InterfaceC17664 takeWhile(Predicate predicate);

    Object[] toArray();

    Object[] toArray(IntFunction intFunction);

    List toList();
}
