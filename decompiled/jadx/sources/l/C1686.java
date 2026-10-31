package l;

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
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֫۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1686 implements InterfaceC17664 {
    public final /* synthetic */ Stream a;

    public /* synthetic */ C1686(Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ InterfaceC17664 b(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C18370 ? ((C18370) stream).a : new C1686(stream);
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // l.InterfaceC12393, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ Object collect(InterfaceC11688 interfaceC11688) {
        Collector c16338;
        Stream stream = this.a;
        if (interfaceC11688 == null) {
            c16338 = null;
        } else {
            c16338 = interfaceC11688 instanceof C3097 ? ((C3097) interfaceC11688).a : new C16338(interfaceC11688);
        }
        return stream.collect(c16338);
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 distinct() {
        return b(this.a.distinct());
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 dropWhile(Predicate predicate) {
        return b(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream stream = this.a;
        if (obj instanceof C1686) {
            obj = ((C1686) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC0458 f(C17022 c17022) {
        return C10609.b(this.a.flatMapToDouble(AbstractC9198.W(c17022)));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 filter(Predicate predicate) {
        return b(this.a.filter(predicate));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ C16646 findAny() {
        return AbstractC16169.j(this.a.findAny());
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ C16646 findFirst() {
        return AbstractC16169.j(this.a.findFirst());
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 flatMap(Function function) {
        return b(this.a.flatMap(AbstractC9198.W(function)));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC11315 flatMapToInt(Function function) {
        return C7454.convert(this.a.flatMapToInt(AbstractC9198.W(function)));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC18725 l(C17022 c17022) {
        return C12811.b(this.a.flatMapToLong(AbstractC9198.W(c17022)));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 map(Function function) {
        return b(this.a.map(function));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC0458 mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C10609.b(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC11315 mapToInt(ToIntFunction toIntFunction) {
        return C7454.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC18725 mapToLong(ToLongFunction toLongFunction) {
        return C12811.b(this.a.mapToLong(toLongFunction));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ C16646 max(Comparator comparator) {
        return AbstractC16169.j(this.a.max(comparator));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ C16646 min(Comparator comparator) {
        return AbstractC16169.j(this.a.min(comparator));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 onClose(Runnable runnable) {
        return C17914.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 parallel() {
        return C17914.b(this.a.parallel());
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 peek(Consumer consumer) {
        return b(this.a.peek(consumer));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ C16646 reduce(BinaryOperator binaryOperator) {
        return AbstractC16169.j(this.a.reduce(binaryOperator));
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 sequential() {
        return C17914.b(this.a.sequential());
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 sorted() {
        return b(this.a.sorted());
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 sorted(Comparator comparator) {
        return b(this.a.sorted(comparator));
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC15234 spliterator() {
        return C3303.a(this.a.spliterator());
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ InterfaceC17664 takeWhile(Predicate predicate) {
        return b(this.a.takeWhile(predicate));
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // l.InterfaceC17664
    public final /* synthetic */ List toList() {
        return this.a.toList();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 unordered() {
        return C17914.b(this.a.unordered());
    }
}
