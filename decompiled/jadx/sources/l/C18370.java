package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
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
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ᩳ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18370 implements Stream {
    public final /* synthetic */ InterfaceC17664 a;

    public /* synthetic */ C18370(InterfaceC17664 interfaceC17664) {
        this.a = interfaceC17664;
    }

    public static /* synthetic */ Stream convert(InterfaceC17664 interfaceC17664) {
        if (interfaceC17664 == null) {
            return null;
        }
        return interfaceC17664 instanceof C1686 ? ((C1686) interfaceC17664).a : new C18370(interfaceC17664);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        InterfaceC11688 c3097;
        InterfaceC17664 interfaceC17664 = this.a;
        if (collector == null) {
            c3097 = null;
        } else {
            c3097 = collector instanceof C16338 ? ((C16338) collector).a : new C3097(collector);
        }
        return interfaceC17664.collect(c3097);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return convert(this.a.distinct());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return convert(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC17664 interfaceC17664 = this.a;
        if (obj instanceof C18370) {
            obj = ((C18370) obj).a;
        }
        return interfaceC17664.equals(obj);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return convert(this.a.filter(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC16169.n(this.a.findAny());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC16169.n(this.a.findFirst());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream flatMap(Function function) {
        return convert(this.a.flatMap(AbstractC9198.W(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream flatMapToDouble(Function function) {
        return C14569.b(this.a.f(AbstractC9198.W(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ IntStream flatMapToInt(Function function) {
        return C2142.convert(this.a.flatMapToInt(AbstractC9198.W(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ LongStream flatMapToLong(Function function) {
        return C18019.b(this.a.l(AbstractC9198.W(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return convert(this.a.limit(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return convert(this.a.map(function));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C14569.b(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return C2142.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        return C18019.b(this.a.mapToLong(toLongFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC16169.n(this.a.max(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC16169.n(this.a.min(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C18620.b(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C18620.b(this.a.parallel());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return convert(this.a.peek(consumer));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC16169.n(this.a.reduce(binaryOperator));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C18620.b(this.a.sequential());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return convert(this.a.skip(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return convert(this.a.sorted());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return convert(this.a.sorted(comparator));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return C8180.convert(this.a.spliterator());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return convert(this.a.takeWhile(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ List toList() {
        return this.a.toList();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C18620.b(this.a.unordered());
    }
}
