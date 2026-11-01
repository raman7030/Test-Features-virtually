package p067l;

import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
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
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֫᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4405 implements IntStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13123 f9895a;

    public /* synthetic */ C4405(InterfaceC13123 interfaceC13123) {
        this.f9895a = interfaceC13123;
    }

    public static /* synthetic */ IntStream convert(InterfaceC13123 interfaceC13123) {
        if (interfaceC13123 == null) {
            return null;
        }
        return interfaceC13123 instanceof C9453 ? ((C9453) interfaceC13123).f25788a : new C4405(interfaceC13123);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return this.f9895a.allMatch(intPredicate);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return this.f9895a.anyMatch(intPredicate);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C16215.m36972b(this.f9895a.asDoubleStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream asLongStream() {
        return C19494.m44322b(this.f9895a.asLongStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC17736.m40313o(this.f9895a.average());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Stream boxed() {
        return C19828.convert(this.f9895a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f9895a.close();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.f9895a.collect(supplier, objIntConsumer, biConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ long count() {
        return this.f9895a.count();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream distinct() {
        return convert(this.f9895a.distinct());
    }

    public final /* synthetic */ IntStream dropWhile(IntPredicate intPredicate) {
        return convert(this.f9895a.dropWhile(intPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC13123 interfaceC13123 = this.f9895a;
        if (obj instanceof C4405) {
            obj = ((C4405) obj).f9895a;
        }
        return interfaceC13123.equals(obj);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream filter(IntPredicate intPredicate) {
        return convert(this.f9895a.filter(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findAny() {
        return AbstractC17736.m40314p(this.f9895a.findAny());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findFirst() {
        return AbstractC17736.m40314p(this.f9895a.findFirst());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.f9895a.forEach(intConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.f9895a.forEachOrdered(intConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f9895a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f9895a.isParallel();
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Integer> iterator() {
        return this.f9895a.iterator();
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Integer> iterator2() {
        InterfaceC16177 it = this.f9895a.iterator();
        if (it == null) {
            return null;
        }
        return it instanceof C15330 ? ((C15330) it).f43739a : new C12807(it);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream limit(long j) {
        return convert(this.f9895a.limit(j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream map(IntUnaryOperator intUnaryOperator) {
        return convert(this.f9895a.map(intUnaryOperator));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return C16215.m36972b(this.f9895a.mapToDouble(intToDoubleFunction));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return C19494.m44322b(this.f9895a.mapToLong(intToLongFunction));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
        return C19828.convert(this.f9895a.mapToObj(intFunction));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt max() {
        return AbstractC17736.m40314p(this.f9895a.max());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt min() {
        return AbstractC17736.m40314p(this.f9895a.min());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return this.f9895a.noneMatch(intPredicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C20065.m45433b(this.f9895a.onClose(runnable));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C20065.m45433b(this.f9895a.parallel());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ IntStream parallel() {
        return convert(this.f9895a.parallel());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
        return convert(this.f9895a.peek(intConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return this.f9895a.reduce(i, intBinaryOperator);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC17736.m40314p(this.f9895a.reduce(intBinaryOperator));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C20065.m45433b(this.f9895a.sequential());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ IntStream sequential() {
        return convert(this.f9895a.sequential());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream skip(long j) {
        return convert(this.f9895a.skip(j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream sorted() {
        return convert(this.f9895a.sorted());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Integer> spliterator() {
        return C21524.m48720a(this.f9895a.spliterator());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Integer> spliterator2() {
        return C10143.convert(this.f9895a.spliterator());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int sum() {
        return this.f9895a.sum();
    }

    public final /* synthetic */ IntStream takeWhile(IntPredicate intPredicate) {
        return convert(this.f9895a.takeWhile(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int[] toArray() {
        return this.f9895a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C20065.m45433b(this.f9895a.unordered());
    }

    @Override // java.util.stream.IntStream
    public final IntSummaryStatistics summaryStatistics() {
        this.f9895a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override // java.util.stream.IntStream
    public final IntStream flatMap(IntFunction intFunction) {
        InterfaceC13123 interfaceC13123 = this.f9895a;
        C18152 c18152 = new C18152();
        c18152.f54184a = intFunction;
        return convert(interfaceC13123.mo19636g(c18152));
    }
}
