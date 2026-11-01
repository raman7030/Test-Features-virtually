package p067l;

import java.util.Iterator;
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
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.۟ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9453 implements InterfaceC13123 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IntStream f25788a;

    public /* synthetic */ C9453(IntStream intStream) {
        this.f25788a = intStream;
    }

    public static /* synthetic */ InterfaceC13123 convert(IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return intStream instanceof C4405 ? ((C4405) intStream).f9895a : new C9453(intStream);
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return this.f25788a.allMatch(intPredicate);
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return this.f25788a.anyMatch(intPredicate);
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC2804 asDoubleStream() {
        return C12452.m28669b(this.f25788a.asDoubleStream());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC20165 asLongStream() {
        return C14544.m33214b(this.f25788a.asLongStream());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ C6790 average() {
        return AbstractC17736.m40309k(this.f25788a.average());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC19157 boxed() {
        return C3971.m7917b(this.f25788a.boxed());
    }

    @Override // p067l.InterfaceC14147, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f25788a.close();
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.f25788a.collect(supplier, objIntConsumer, biConsumer);
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ long count() {
        return this.f25788a.count();
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC13123 distinct() {
        return convert(this.f25788a.distinct());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC13123 dropWhile(IntPredicate intPredicate) {
        return convert(this.f25788a.dropWhile(intPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntStream intStream = this.f25788a;
        if (obj instanceof C9453) {
            obj = ((C9453) obj).f25788a;
        }
        return intStream.equals(obj);
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC13123 filter(IntPredicate intPredicate) {
        return convert(this.f25788a.filter(intPredicate));
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ C19531 findAny() {
        return AbstractC17736.m40310l(this.f25788a.findAny());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ C19531 findFirst() {
        return AbstractC17736.m40310l(this.f25788a.findFirst());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.f25788a.forEach(intConsumer);
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.f25788a.forEachOrdered(intConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25788a.hashCode();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ boolean isParallel() {
        return this.f25788a.isParallel();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ Iterator iterator() {
        return this.f25788a.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
    @Override // p067l.InterfaceC13123, p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC16177 iterator() {
        ?? it = this.f25788a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C12807 ? ((C12807) it).f36037a : new C15330(it);
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC13123 limit(long j) {
        return convert(this.f25788a.limit(j));
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC13123 map(IntUnaryOperator intUnaryOperator) {
        return convert(this.f25788a.map(intUnaryOperator));
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC2804 mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return C12452.m28669b(this.f25788a.mapToDouble(intToDoubleFunction));
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC20165 mapToLong(IntToLongFunction intToLongFunction) {
        return C14544.m33214b(this.f25788a.mapToLong(intToLongFunction));
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC19157 mapToObj(IntFunction intFunction) {
        return C3971.m7917b(this.f25788a.mapToObj(intFunction));
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ C19531 max() {
        return AbstractC17736.m40310l(this.f25788a.max());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ C19531 min() {
        return AbstractC17736.m40310l(this.f25788a.min());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return this.f25788a.noneMatch(intPredicate);
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 onClose(Runnable runnable) {
        return C19394.m44142b(this.f25788a.onClose(runnable));
    }

    @Override // p067l.InterfaceC13123, p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC13123 parallel() {
        return convert(this.f25788a.parallel());
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 parallel() {
        return C19394.m44142b(this.f25788a.parallel());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC13123 peek(IntConsumer intConsumer) {
        return convert(this.f25788a.peek(intConsumer));
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return this.f25788a.reduce(i, intBinaryOperator);
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ C19531 reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC17736.m40310l(this.f25788a.reduce(intBinaryOperator));
    }

    @Override // p067l.InterfaceC13123, p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC13123 sequential() {
        return convert(this.f25788a.sequential());
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 sequential() {
        return C19394.m44142b(this.f25788a.sequential());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC13123 skip(long j) {
        return convert(this.f25788a.skip(j));
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC13123 sorted() {
        return convert(this.f25788a.sorted());
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC16847 spliterator() {
        return C5508.m12135a(this.f25788a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
    @Override // p067l.InterfaceC13123, p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC20202 spliterator() {
        return C22865.m51071a(this.f25788a.spliterator());
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ int sum() {
        return this.f25788a.sum();
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ InterfaceC13123 takeWhile(IntPredicate intPredicate) {
        return convert(this.f25788a.takeWhile(intPredicate));
    }

    @Override // p067l.InterfaceC13123
    public final /* synthetic */ int[] toArray() {
        return this.f25788a.toArray();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 unordered() {
        return C19394.m44142b(this.f25788a.unordered());
    }

    @Override // p067l.InterfaceC13123
    public final C12214 summaryStatistics() {
        this.f25788a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
    }

    @Override // p067l.InterfaceC13123
    /* JADX INFO: renamed from: g */
    public final InterfaceC13123 mo19636g(C18152 c18152) {
        IntStream intStream = this.f25788a;
        C18152 c18153 = new C18152();
        c18153.f54184a = c18152;
        return convert(intStream.flatMap(c18153));
    }
}
