package l;

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
public final /* synthetic */ class C7454 implements InterfaceC11315 {
    public final /* synthetic */ IntStream a;

    public /* synthetic */ C7454(IntStream intStream) {
        this.a = intStream;
    }

    public static /* synthetic */ InterfaceC11315 convert(IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return intStream instanceof C2142 ? ((C2142) intStream).a : new C7454(intStream);
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return this.a.allMatch(intPredicate);
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return this.a.anyMatch(intPredicate);
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC0458 asDoubleStream() {
        return C10609.b(this.a.asDoubleStream());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC18725 asLongStream() {
        return C12811.b(this.a.asLongStream());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ C4652 average() {
        return AbstractC16169.k(this.a.average());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC17664 boxed() {
        return C1686.b(this.a.boxed());
    }

    @Override // l.InterfaceC12393, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objIntConsumer, biConsumer);
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC11315 distinct() {
        return convert(this.a.distinct());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC11315 dropWhile(IntPredicate intPredicate) {
        return convert(this.a.dropWhile(intPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntStream intStream = this.a;
        if (obj instanceof C7454) {
            obj = ((C7454) obj).a;
        }
        return intStream.equals(obj);
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC11315 filter(IntPredicate intPredicate) {
        return convert(this.a.filter(intPredicate));
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ C18058 findAny() {
        return AbstractC16169.l(this.a.findAny());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ C18058 findFirst() {
        return AbstractC16169.l(this.a.findFirst());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.a.forEach(intConsumer);
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.a.forEachOrdered(intConsumer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
    @Override // l.InterfaceC11315, l.InterfaceC12393
    public final /* synthetic */ InterfaceC14529 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C10983 ? ((C10983) it).a : new C13638(it);
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC11315 limit(long j) {
        return convert(this.a.limit(j));
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC11315 map(IntUnaryOperator intUnaryOperator) {
        return convert(this.a.map(intUnaryOperator));
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC0458 mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return C10609.b(this.a.mapToDouble(intToDoubleFunction));
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC18725 mapToLong(IntToLongFunction intToLongFunction) {
        return C12811.b(this.a.mapToLong(intToLongFunction));
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC17664 mapToObj(IntFunction intFunction) {
        return C1686.b(this.a.mapToObj(intFunction));
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ C18058 max() {
        return AbstractC16169.l(this.a.max());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ C18058 min() {
        return AbstractC16169.l(this.a.min());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return this.a.noneMatch(intPredicate);
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 onClose(Runnable runnable) {
        return C17914.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC11315, l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC11315 parallel() {
        return convert(this.a.parallel());
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 parallel() {
        return C17914.b(this.a.parallel());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC11315 peek(IntConsumer intConsumer) {
        return convert(this.a.peek(intConsumer));
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return this.a.reduce(i, intBinaryOperator);
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ C18058 reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC16169.l(this.a.reduce(intBinaryOperator));
    }

    @Override // l.InterfaceC11315, l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC11315 sequential() {
        return convert(this.a.sequential());
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 sequential() {
        return C17914.b(this.a.sequential());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC11315 skip(long j) {
        return convert(this.a.skip(j));
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC11315 sorted() {
        return convert(this.a.sorted());
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC15234 spliterator() {
        return C3303.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
    @Override // l.InterfaceC11315, l.InterfaceC12393
    public final /* synthetic */ InterfaceC18764 spliterator() {
        return C21566.a(this.a.spliterator());
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ int sum() {
        return this.a.sum();
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ InterfaceC11315 takeWhile(IntPredicate intPredicate) {
        return convert(this.a.takeWhile(intPredicate));
    }

    @Override // l.InterfaceC11315
    public final /* synthetic */ int[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 unordered() {
        return C17914.b(this.a.unordered());
    }

    @Override // l.InterfaceC11315
    public final C10359 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
    }

    @Override // l.InterfaceC11315
    public final InterfaceC11315 g(C16607 c16607) {
        IntStream intStream = this.a;
        C16607 c16608 = new C16607();
        c16608.a = c16607;
        return convert(intStream.flatMap(c16608));
    }
}
