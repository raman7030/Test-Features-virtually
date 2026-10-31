package l;

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
public final /* synthetic */ class C2142 implements IntStream {
    public final /* synthetic */ InterfaceC11315 a;

    public /* synthetic */ C2142(InterfaceC11315 interfaceC11315) {
        this.a = interfaceC11315;
    }

    public static /* synthetic */ IntStream convert(InterfaceC11315 interfaceC11315) {
        if (interfaceC11315 == null) {
            return null;
        }
        return interfaceC11315 instanceof C7454 ? ((C7454) interfaceC11315).a : new C2142(interfaceC11315);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return this.a.allMatch(intPredicate);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return this.a.anyMatch(intPredicate);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C14569.b(this.a.asDoubleStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream asLongStream() {
        return C18019.b(this.a.asLongStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC16169.o(this.a.average());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Stream boxed() {
        return C18370.convert(this.a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objIntConsumer, biConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream distinct() {
        return convert(this.a.distinct());
    }

    public final /* synthetic */ IntStream dropWhile(IntPredicate intPredicate) {
        return convert(this.a.dropWhile(intPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC11315 interfaceC11315 = this.a;
        if (obj instanceof C2142) {
            obj = ((C2142) obj).a;
        }
        return interfaceC11315.equals(obj);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream filter(IntPredicate intPredicate) {
        return convert(this.a.filter(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findAny() {
        return AbstractC16169.p(this.a.findAny());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findFirst() {
        return AbstractC16169.p(this.a.findFirst());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.a.forEach(intConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.a.forEachOrdered(intConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Integer> iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Integer> iterator2() {
        InterfaceC14529 it = this.a.iterator();
        if (it == null) {
            return null;
        }
        return it instanceof C13638 ? ((C13638) it).a : new C10983(it);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream limit(long j) {
        return convert(this.a.limit(j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream map(IntUnaryOperator intUnaryOperator) {
        return convert(this.a.map(intUnaryOperator));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return C14569.b(this.a.mapToDouble(intToDoubleFunction));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return C18019.b(this.a.mapToLong(intToLongFunction));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
        return C18370.convert(this.a.mapToObj(intFunction));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt max() {
        return AbstractC16169.p(this.a.max());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt min() {
        return AbstractC16169.p(this.a.min());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return this.a.noneMatch(intPredicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C18620.b(this.a.onClose(runnable));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C18620.b(this.a.parallel());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ IntStream parallel() {
        return convert(this.a.parallel());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
        return convert(this.a.peek(intConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return this.a.reduce(i, intBinaryOperator);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC16169.p(this.a.reduce(intBinaryOperator));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C18620.b(this.a.sequential());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ IntStream sequential() {
        return convert(this.a.sequential());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream skip(long j) {
        return convert(this.a.skip(j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ IntStream sorted() {
        return convert(this.a.sorted());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Integer> spliterator() {
        return C20155.a(this.a.spliterator());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Integer> spliterator2() {
        return C8180.convert(this.a.spliterator());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int sum() {
        return this.a.sum();
    }

    public final /* synthetic */ IntStream takeWhile(IntPredicate intPredicate) {
        return convert(this.a.takeWhile(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C18620.b(this.a.unordered());
    }

    @Override // java.util.stream.IntStream
    public final IntSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override // java.util.stream.IntStream
    public final IntStream flatMap(IntFunction intFunction) {
        InterfaceC11315 interfaceC11315 = this.a;
        C16607 c16607 = new C16607();
        c16607.a = intFunction;
        return convert(interfaceC11315.g(c16607));
    }
}
