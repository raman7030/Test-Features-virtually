package l;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: l.۬֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12811 implements InterfaceC18725 {
    public final /* synthetic */ LongStream a;

    public /* synthetic */ C12811(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ InterfaceC18725 b(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C18019 ? ((C18019) longStream).a : new C12811(longStream);
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.a.allMatch(longPredicate);
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.a.anyMatch(longPredicate);
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC0458 asDoubleStream() {
        return C10609.b(this.a.asDoubleStream());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ C4652 average() {
        return AbstractC16169.k(this.a.average());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC17664 boxed() {
        return C1686.b(this.a.boxed());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC0458 c() {
        return C10609.b(this.a.mapToDouble(null));
    }

    @Override // l.InterfaceC12393, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 distinct() {
        return b(this.a.distinct());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 dropWhile(LongPredicate longPredicate) {
        return b(this.a.dropWhile(longPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof C12811) {
            obj = ((C12811) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 filter(LongPredicate longPredicate) {
        return b(this.a.filter(longPredicate));
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ C12413 findAny() {
        return AbstractC16169.m(this.a.findAny());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ C12413 findFirst() {
        return AbstractC16169.m(this.a.findFirst());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // l.InterfaceC18725, l.InterfaceC12393
    public final /* synthetic */ InterfaceC6769 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C8866 ? ((C8866) it).a : new C6749(it);
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC11315 k() {
        return C7454.convert(this.a.mapToInt(null));
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 map(LongUnaryOperator longUnaryOperator) {
        return b(this.a.map(longUnaryOperator));
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC17664 mapToObj(LongFunction longFunction) {
        return C1686.b(this.a.mapToObj(longFunction));
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ C12413 max() {
        return AbstractC16169.m(this.a.max());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ C12413 min() {
        return AbstractC16169.m(this.a.min());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.a.noneMatch(longPredicate);
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 onClose(Runnable runnable) {
        return C17914.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 parallel() {
        return C17914.b(this.a.parallel());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 parallel() {
        return b(this.a.parallel());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 peek(LongConsumer longConsumer) {
        return b(this.a.peek(longConsumer));
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ C12413 reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC16169.m(this.a.reduce(longBinaryOperator));
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 sequential() {
        return C17914.b(this.a.sequential());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 sequential() {
        return b(this.a.sequential());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 sorted() {
        return b(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // l.InterfaceC18725, l.InterfaceC12393
    public final /* synthetic */ InterfaceC0418 spliterator() {
        return C3221.a(this.a.spliterator());
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC15234 spliterator() {
        return C3303.a(this.a.spliterator());
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ InterfaceC18725 takeWhile(LongPredicate longPredicate) {
        return b(this.a.takeWhile(longPredicate));
    }

    @Override // l.InterfaceC18725
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 unordered() {
        return C17914.b(this.a.unordered());
    }

    @Override // l.InterfaceC18725
    public final C11770 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // l.InterfaceC18725
    public final InterfaceC18725 a(C17022 c17022) {
        LongStream longStream = this.a;
        C17022 c17023 = new C17022(12);
        c17023.b = c17022;
        return b(longStream.flatMap(c17023));
    }
}
