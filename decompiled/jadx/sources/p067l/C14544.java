package p067l;

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
public final /* synthetic */ class C14544 implements InterfaceC20165 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LongStream f41498a;

    public /* synthetic */ C14544(LongStream longStream) {
        this.f41498a = longStream;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC20165 m33214b(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C19494 ? ((C19494) longStream).f59390a : new C14544(longStream);
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.f41498a.allMatch(longPredicate);
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.f41498a.anyMatch(longPredicate);
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC2804 asDoubleStream() {
        return C12452.m28669b(this.f41498a.asDoubleStream());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ C6790 average() {
        return AbstractC17736.m40309k(this.f41498a.average());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC19157 boxed() {
        return C3971.m7917b(this.f41498a.boxed());
    }

    @Override // p067l.InterfaceC20165
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2804 mo33216c() {
        return C12452.m28669b(this.f41498a.mapToDouble(null));
    }

    @Override // p067l.InterfaceC14147, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f41498a.close();
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f41498a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ long count() {
        return this.f41498a.count();
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 distinct() {
        return m33214b(this.f41498a.distinct());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 dropWhile(LongPredicate longPredicate) {
        return m33214b(this.f41498a.dropWhile(longPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f41498a;
        if (obj instanceof C14544) {
            obj = ((C14544) obj).f41498a;
        }
        return longStream.equals(obj);
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 filter(LongPredicate longPredicate) {
        return m33214b(this.f41498a.filter(longPredicate));
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ C14166 findAny() {
        return AbstractC17736.m40311m(this.f41498a.findAny());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ C14166 findFirst() {
        return AbstractC17736.m40311m(this.f41498a.findFirst());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f41498a.forEach(longConsumer);
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f41498a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f41498a.hashCode();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ boolean isParallel() {
        return this.f41498a.isParallel();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ Iterator iterator() {
        return this.f41498a.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // p067l.InterfaceC20165, p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC8802 iterator() {
        ?? it = this.f41498a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C10795 ? ((C10795) it).f29926a : new C8783(it);
    }

    @Override // p067l.InterfaceC20165
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC13123 mo33217k() {
        return C9453.convert(this.f41498a.mapToInt(null));
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 limit(long j) {
        return m33214b(this.f41498a.limit(j));
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 map(LongUnaryOperator longUnaryOperator) {
        return m33214b(this.f41498a.map(longUnaryOperator));
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC19157 mapToObj(LongFunction longFunction) {
        return C3971.m7917b(this.f41498a.mapToObj(longFunction));
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ C14166 max() {
        return AbstractC17736.m40311m(this.f41498a.max());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ C14166 min() {
        return AbstractC17736.m40311m(this.f41498a.min());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.f41498a.noneMatch(longPredicate);
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 onClose(Runnable runnable) {
        return C19394.m44142b(this.f41498a.onClose(runnable));
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 parallel() {
        return C19394.m44142b(this.f41498a.parallel());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 parallel() {
        return m33214b(this.f41498a.parallel());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 peek(LongConsumer longConsumer) {
        return m33214b(this.f41498a.peek(longConsumer));
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.f41498a.reduce(j, longBinaryOperator);
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ C14166 reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC17736.m40311m(this.f41498a.reduce(longBinaryOperator));
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 sequential() {
        return C19394.m44142b(this.f41498a.sequential());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 sequential() {
        return m33214b(this.f41498a.sequential());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 skip(long j) {
        return m33214b(this.f41498a.skip(j));
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 sorted() {
        return m33214b(this.f41498a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // p067l.InterfaceC20165, p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC2766 spliterator() {
        return C5430.m11938a(this.f41498a.spliterator());
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC16847 spliterator() {
        return C5508.m12135a(this.f41498a.spliterator());
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ long sum() {
        return this.f41498a.sum();
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC20165 takeWhile(LongPredicate longPredicate) {
        return m33214b(this.f41498a.takeWhile(longPredicate));
    }

    @Override // p067l.InterfaceC20165
    public final /* synthetic */ long[] toArray() {
        return this.f41498a.toArray();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 unordered() {
        return C19394.m44142b(this.f41498a.unordered());
    }

    @Override // p067l.InterfaceC20165
    public final C13555 summaryStatistics() {
        this.f41498a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // p067l.InterfaceC20165
    /* JADX INFO: renamed from: a */
    public final InterfaceC20165 mo33215a(C18546 c18546) {
        LongStream longStream = this.f41498a;
        C18546 c18547 = new C18546(12);
        c18547.f55375b = c18546;
        return m33214b(longStream.flatMap(c18547));
    }
}
