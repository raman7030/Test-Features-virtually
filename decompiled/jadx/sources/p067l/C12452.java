package p067l;

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
public final /* synthetic */ class C12452 implements InterfaceC2804 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DoubleStream f34841a;

    public /* synthetic */ C12452(DoubleStream doubleStream) {
        this.f34841a = doubleStream;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2804 m28669b(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C16215 ? ((C16215) doubleStream).f47717a : new C12452(doubleStream);
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.f34841a.allMatch(doublePredicate);
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.f34841a.anyMatch(doublePredicate);
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ C6790 average() {
        return AbstractC17736.m40309k(this.f34841a.average());
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC19157 boxed() {
        return C3971.m7917b(this.f34841a.boxed());
    }

    @Override // p067l.InterfaceC14147, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f34841a.close();
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f34841a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ long count() {
        return this.f34841a.count();
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC2804 distinct() {
        return m28669b(this.f34841a.distinct());
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC2804 dropWhile(DoublePredicate doublePredicate) {
        return m28669b(this.f34841a.dropWhile(doublePredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f34841a;
        if (obj instanceof C12452) {
            obj = ((C12452) obj).f34841a;
        }
        return doubleStream.equals(obj);
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC2804 filter(DoublePredicate doublePredicate) {
        return m28669b(this.f34841a.filter(doublePredicate));
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ C6790 findAny() {
        return AbstractC17736.m40309k(this.f34841a.findAny());
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ C6790 findFirst() {
        return AbstractC17736.m40309k(this.f34841a.findFirst());
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f34841a.forEach(doubleConsumer);
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f34841a.forEachOrdered(doubleConsumer);
    }

    @Override // p067l.InterfaceC2804
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC20165 mo4423h() {
        return C14544.m33214b(this.f34841a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.f34841a.hashCode();
    }

    @Override // p067l.InterfaceC2804
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC13123 mo4424i() {
        return C9453.convert(this.f34841a.mapToInt(null));
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ boolean isParallel() {
        return this.f34841a.isParallel();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ Iterator iterator() {
        return this.f34841a.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // p067l.InterfaceC2804, p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC3932 iterator() {
        ?? it = this.f34841a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C24166 ? ((C24166) it).f76644a : new C12097(it);
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC2804 limit(long j) {
        return m28669b(this.f34841a.limit(j));
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC2804 map(DoubleUnaryOperator doubleUnaryOperator) {
        return m28669b(this.f34841a.map(doubleUnaryOperator));
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC19157 mapToObj(DoubleFunction doubleFunction) {
        return C3971.m7917b(this.f34841a.mapToObj(doubleFunction));
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ C6790 max() {
        return AbstractC17736.m40309k(this.f34841a.max());
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ C6790 min() {
        return AbstractC17736.m40309k(this.f34841a.min());
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.f34841a.noneMatch(doublePredicate);
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 onClose(Runnable runnable) {
        return C19394.m44142b(this.f34841a.onClose(runnable));
    }

    @Override // p067l.InterfaceC2804, p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC2804 parallel() {
        return m28669b(this.f34841a.parallel());
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 parallel() {
        return C19394.m44142b(this.f34841a.parallel());
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC2804 peek(DoubleConsumer doubleConsumer) {
        return m28669b(this.f34841a.peek(doubleConsumer));
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f34841a.reduce(d, doubleBinaryOperator);
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ C6790 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC17736.m40309k(this.f34841a.reduce(doubleBinaryOperator));
    }

    @Override // p067l.InterfaceC2804, p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC2804 sequential() {
        return m28669b(this.f34841a.sequential());
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 sequential() {
        return C19394.m44142b(this.f34841a.sequential());
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC2804 skip(long j) {
        return m28669b(this.f34841a.skip(j));
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC2804 sorted() {
        return m28669b(this.f34841a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // p067l.InterfaceC2804, p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC10124 spliterator() {
        return C20854.m47082a(this.f34841a.spliterator());
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC16847 spliterator() {
        return C5508.m12135a(this.f34841a.spliterator());
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ double sum() {
        return this.f34841a.sum();
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ InterfaceC2804 takeWhile(DoublePredicate doublePredicate) {
        return m28669b(this.f34841a.takeWhile(doublePredicate));
    }

    @Override // p067l.InterfaceC2804
    public final /* synthetic */ double[] toArray() {
        return this.f34841a.toArray();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 unordered() {
        return C19394.m44142b(this.f34841a.unordered());
    }

    @Override // p067l.InterfaceC2804
    public final C14895 summaryStatistics() {
        this.f34841a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // p067l.InterfaceC2804
    /* JADX INFO: renamed from: a */
    public final InterfaceC2804 mo4422a(C18546 c18546) {
        DoubleStream doubleStream = this.f34841a;
        C18546 c18547 = new C18546(10);
        c18547.f55375b = c18546;
        return m28669b(doubleStream.flatMap(c18547));
    }
}
