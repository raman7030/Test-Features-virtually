package l;

import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ᩳۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18019 implements LongStream {
    public final /* synthetic */ InterfaceC18725 a;

    public /* synthetic */ C18019(InterfaceC18725 interfaceC18725) {
        this.a = interfaceC18725;
    }

    public static /* synthetic */ LongStream b(InterfaceC18725 interfaceC18725) {
        if (interfaceC18725 == null) {
            return null;
        }
        return interfaceC18725 instanceof C12811 ? ((C12811) interfaceC18725).a : new C18019(interfaceC18725);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.a.allMatch(longPredicate);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.a.anyMatch(longPredicate);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C14569.b(this.a.asDoubleStream());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC16169.o(this.a.average());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return C18370.convert(this.a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return b(this.a.distinct());
    }

    public final /* synthetic */ LongStream dropWhile(LongPredicate longPredicate) {
        return b(this.a.dropWhile(longPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC18725 interfaceC18725 = this.a;
        if (obj instanceof C18019) {
            obj = ((C18019) obj).a;
        }
        return interfaceC18725.equals(obj);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream filter(LongPredicate longPredicate) {
        return b(this.a.filter(longPredicate));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findAny() {
        return AbstractC16169.q(this.a.findAny());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findFirst() {
        return AbstractC16169.q(this.a.findFirst());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Long> iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Long> iterator2() {
        InterfaceC6769 it = this.a.iterator();
        if (it == null) {
            return null;
        }
        return it instanceof C6749 ? ((C6749) it).a : new C8866(it);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return b(this.a.map(longUnaryOperator));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return C14569.b(this.a.c());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return C2142.convert(this.a.k());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C18370.convert(this.a.mapToObj(longFunction));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong max() {
        return AbstractC16169.q(this.a.max());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong min() {
        return AbstractC16169.q(this.a.min());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.a.noneMatch(longPredicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C18620.b(this.a.onClose(runnable));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C18620.b(this.a.parallel());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return b(this.a.parallel());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return b(this.a.peek(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC16169.q(this.a.reduce(longBinaryOperator));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C18620.b(this.a.sequential());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return b(this.a.sequential());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return b(this.a.sorted());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Long> spliterator() {
        return C8242.a(this.a.spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Long> spliterator2() {
        return C8180.convert(this.a.spliterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    public final /* synthetic */ LongStream takeWhile(LongPredicate longPredicate) {
        return b(this.a.takeWhile(longPredicate));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C18620.b(this.a.unordered());
    }

    @Override // java.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public final LongStream flatMap(LongFunction longFunction) {
        InterfaceC18725 interfaceC18725 = this.a;
        C17022 c17022 = new C17022(12);
        c17022.b = longFunction;
        return b(interfaceC18725.a(c17022));
    }
}
