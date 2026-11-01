package p067l;

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
public final /* synthetic */ class C19828 implements Stream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC19157 f60288a;

    public /* synthetic */ C19828(InterfaceC19157 interfaceC19157) {
        this.f60288a = interfaceC19157;
    }

    public static /* synthetic */ Stream convert(InterfaceC19157 interfaceC19157) {
        if (interfaceC19157 == null) {
            return null;
        }
        return interfaceC19157 instanceof C3971 ? ((C3971) interfaceC19157).f8631a : new C19828(interfaceC19157);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f60288a.allMatch(predicate);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f60288a.anyMatch(predicate);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f60288a.close();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f60288a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        InterfaceC13477 c5312;
        InterfaceC19157 interfaceC19157 = this.f60288a;
        if (collector == null) {
            c5312 = null;
        } else {
            c5312 = collector instanceof C17896 ? ((C17896) collector).f53470a : new C5312(collector);
        }
        return interfaceC19157.collect(c5312);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f60288a.count();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return convert(this.f60288a.distinct());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return convert(this.f60288a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC19157 interfaceC19157 = this.f60288a;
        if (obj instanceof C19828) {
            obj = ((C19828) obj).f60288a;
        }
        return interfaceC19157.equals(obj);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return convert(this.f60288a.filter(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC17736.m40312n(this.f60288a.findAny());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC17736.m40312n(this.f60288a.findFirst());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream flatMap(Function function) {
        return convert(this.f60288a.flatMap(AbstractC11111.m25604W(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream flatMapToDouble(Function function) {
        return C16215.m36972b(this.f60288a.mo7918f(AbstractC11111.m25604W(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ IntStream flatMapToInt(Function function) {
        return C4405.convert(this.f60288a.flatMapToInt(AbstractC11111.m25604W(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ LongStream flatMapToLong(Function function) {
        return C19494.m44322b(this.f60288a.mo7919l(AbstractC11111.m25604W(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f60288a.forEach(consumer);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f60288a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f60288a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f60288a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f60288a.iterator();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return convert(this.f60288a.limit(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return convert(this.f60288a.map(function));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C16215.m36972b(this.f60288a.mapToDouble(toDoubleFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return C4405.convert(this.f60288a.mapToInt(toIntFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        return C19494.m44322b(this.f60288a.mapToLong(toLongFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC17736.m40312n(this.f60288a.max(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC17736.m40312n(this.f60288a.min(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f60288a.noneMatch(predicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C20065.m45433b(this.f60288a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C20065.m45433b(this.f60288a.parallel());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return convert(this.f60288a.peek(consumer));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f60288a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f60288a.reduce(obj, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC17736.m40312n(this.f60288a.reduce(binaryOperator));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C20065.m45433b(this.f60288a.sequential());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return convert(this.f60288a.skip(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return convert(this.f60288a.sorted());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return convert(this.f60288a.sorted(comparator));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return C10143.convert(this.f60288a.spliterator());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return convert(this.f60288a.takeWhile(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f60288a.toArray();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f60288a.toArray(intFunction);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ List toList() {
        return this.f60288a.toList();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C20065.m45433b(this.f60288a.unordered());
    }
}
