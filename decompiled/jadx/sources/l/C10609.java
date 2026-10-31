package l;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: l.ۤ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10609 implements InterfaceC0458 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ C10609(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ InterfaceC0458 b(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C14569 ? ((C14569) doubleStream).a : new C10609(doubleStream);
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.a.allMatch(doublePredicate);
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.a.anyMatch(doublePredicate);
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ C4652 average() {
        return AbstractC16169.k(this.a.average());
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC17664 boxed() {
        return C1686.b(this.a.boxed());
    }

    @Override // l.InterfaceC12393, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC0458 distinct() {
        return b(this.a.distinct());
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC0458 dropWhile(DoublePredicate doublePredicate) {
        return b(this.a.dropWhile(doublePredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof C10609) {
            obj = ((C10609) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC0458 filter(DoublePredicate doublePredicate) {
        return b(this.a.filter(doublePredicate));
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ C4652 findAny() {
        return AbstractC16169.k(this.a.findAny());
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ C4652 findFirst() {
        return AbstractC16169.k(this.a.findFirst());
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC18725 h() {
        return C12811.b(this.a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC11315 i() {
        return C7454.convert(this.a.mapToInt(null));
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // l.InterfaceC0458, l.InterfaceC12393
    public final /* synthetic */ InterfaceC1645 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C22935 ? ((C22935) it).a : new C10236(it);
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC0458 limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC0458 map(DoubleUnaryOperator doubleUnaryOperator) {
        return b(this.a.map(doubleUnaryOperator));
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC17664 mapToObj(DoubleFunction doubleFunction) {
        return C1686.b(this.a.mapToObj(doubleFunction));
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ C4652 max() {
        return AbstractC16169.k(this.a.max());
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ C4652 min() {
        return AbstractC16169.k(this.a.min());
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.a.noneMatch(doublePredicate);
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 onClose(Runnable runnable) {
        return C17914.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC0458, l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC0458 parallel() {
        return b(this.a.parallel());
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 parallel() {
        return C17914.b(this.a.parallel());
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC0458 peek(DoubleConsumer doubleConsumer) {
        return b(this.a.peek(doubleConsumer));
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ C4652 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC16169.k(this.a.reduce(doubleBinaryOperator));
    }

    @Override // l.InterfaceC0458, l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC0458 sequential() {
        return b(this.a.sequential());
    }

    @Override // l.InterfaceC12393, l.InterfaceC18725
    public final /* synthetic */ InterfaceC12393 sequential() {
        return C17914.b(this.a.sequential());
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC0458 skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC0458 sorted() {
        return b(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // l.InterfaceC0458, l.InterfaceC12393
    public final /* synthetic */ InterfaceC8160 spliterator() {
        return C19450.a(this.a.spliterator());
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC15234 spliterator() {
        return C3303.a(this.a.spliterator());
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ InterfaceC0458 takeWhile(DoublePredicate doublePredicate) {
        return b(this.a.takeWhile(doublePredicate));
    }

    @Override // l.InterfaceC0458
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC12393
    public final /* synthetic */ InterfaceC12393 unordered() {
        return C17914.b(this.a.unordered());
    }

    @Override // l.InterfaceC0458
    public final C13180 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // l.InterfaceC0458
    public final InterfaceC0458 a(C17022 c17022) {
        DoubleStream doubleStream = this.a;
        C17022 c17023 = new C17022(10);
        c17023.b = c17022;
        return b(doubleStream.flatMap(c17023));
    }
}
