package l;

import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܳܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14569 implements DoubleStream {
    public final /* synthetic */ InterfaceC0458 a;

    public /* synthetic */ C14569(InterfaceC0458 interfaceC0458) {
        this.a = interfaceC0458;
    }

    public static /* synthetic */ DoubleStream b(InterfaceC0458 interfaceC0458) {
        if (interfaceC0458 == null) {
            return null;
        }
        return interfaceC0458 instanceof C10609 ? ((C10609) interfaceC0458).a : new C14569(interfaceC0458);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.a.allMatch(doublePredicate);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.a.anyMatch(doublePredicate);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC16169.o(this.a.average());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Stream boxed() {
        return C18370.convert(this.a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream distinct() {
        return b(this.a.distinct());
    }

    public final /* synthetic */ DoubleStream dropWhile(DoublePredicate doublePredicate) {
        return b(this.a.dropWhile(doublePredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0458 interfaceC0458 = this.a;
        if (obj instanceof C14569) {
            obj = ((C14569) obj).a;
        }
        return interfaceC0458.equals(obj);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream filter(DoublePredicate doublePredicate) {
        return b(this.a.filter(doublePredicate));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findAny() {
        return AbstractC16169.o(this.a.findAny());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findFirst() {
        return AbstractC16169.o(this.a.findFirst());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Double> iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Double> iterator2() {
        InterfaceC1645 it = this.a.iterator();
        if (it == null) {
            return null;
        }
        return it instanceof C10236 ? ((C10236) it).a : new C22935(it);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return b(this.a.map(doubleUnaryOperator));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        return C2142.convert(this.a.i());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C18019.b(this.a.h());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C18370.convert(this.a.mapToObj(doubleFunction));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble max() {
        return AbstractC16169.o(this.a.max());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble min() {
        return AbstractC16169.o(this.a.min());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.a.noneMatch(doublePredicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C18620.b(this.a.onClose(runnable));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C18620.b(this.a.parallel());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream parallel() {
        return b(this.a.parallel());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        return b(this.a.peek(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC16169.o(this.a.reduce(doubleBinaryOperator));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C18620.b(this.a.sequential());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream sequential() {
        return b(this.a.sequential());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream sorted() {
        return b(this.a.sorted());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Double> spliterator() {
        return C5338.a(this.a.spliterator());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Double> spliterator2() {
        return C8180.convert(this.a.spliterator());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    public final /* synthetic */ DoubleStream takeWhile(DoublePredicate doublePredicate) {
        return b(this.a.takeWhile(doublePredicate));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C18620.b(this.a.unordered());
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream flatMap(DoubleFunction doubleFunction) {
        InterfaceC0458 interfaceC0458 = this.a;
        C17022 c17022 = new C17022(10);
        c17022.b = doubleFunction;
        return b(interfaceC0458.a(c17022));
    }
}
