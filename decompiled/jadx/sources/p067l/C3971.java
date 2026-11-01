package p067l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֫۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3971 implements InterfaceC19157 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Stream f8631a;

    public /* synthetic */ C3971(Stream stream) {
        this.f8631a = stream;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC19157 m7917b(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C19828 ? ((C19828) stream).f60288a : new C3971(stream);
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f8631a.allMatch(predicate);
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f8631a.anyMatch(predicate);
    }

    @Override // p067l.InterfaceC14147, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f8631a.close();
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f8631a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ Object collect(InterfaceC13477 interfaceC13477) {
        Collector c17896;
        Stream stream = this.f8631a;
        if (interfaceC13477 == null) {
            c17896 = null;
        } else {
            c17896 = interfaceC13477 instanceof C5312 ? ((C5312) interfaceC13477).f12494a : new C17896(interfaceC13477);
        }
        return stream.collect(c17896);
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ long count() {
        return this.f8631a.count();
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 distinct() {
        return m7917b(this.f8631a.distinct());
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 dropWhile(Predicate predicate) {
        return m7917b(this.f8631a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream stream = this.f8631a;
        if (obj instanceof C3971) {
            obj = ((C3971) obj).f8631a;
        }
        return stream.equals(obj);
    }

    @Override // p067l.InterfaceC19157
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2804 mo7918f(C18546 c18546) {
        return C12452.m28669b(this.f8631a.flatMapToDouble(AbstractC11111.m25604W(c18546)));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 filter(Predicate predicate) {
        return m7917b(this.f8631a.filter(predicate));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ C18189 findAny() {
        return AbstractC17736.m40308j(this.f8631a.findAny());
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ C18189 findFirst() {
        return AbstractC17736.m40308j(this.f8631a.findFirst());
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 flatMap(Function function) {
        return m7917b(this.f8631a.flatMap(AbstractC11111.m25604W(function)));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC13123 flatMapToInt(Function function) {
        return C9453.convert(this.f8631a.flatMapToInt(AbstractC11111.m25604W(function)));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f8631a.forEach(consumer);
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f8631a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f8631a.hashCode();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ boolean isParallel() {
        return this.f8631a.isParallel();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ Iterator iterator() {
        return this.f8631a.iterator();
    }

    @Override // p067l.InterfaceC19157
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC20165 mo7919l(C18546 c18546) {
        return C14544.m33214b(this.f8631a.flatMapToLong(AbstractC11111.m25604W(c18546)));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 limit(long j) {
        return m7917b(this.f8631a.limit(j));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 map(Function function) {
        return m7917b(this.f8631a.map(function));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC2804 mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C12452.m28669b(this.f8631a.mapToDouble(toDoubleFunction));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC13123 mapToInt(ToIntFunction toIntFunction) {
        return C9453.convert(this.f8631a.mapToInt(toIntFunction));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC20165 mapToLong(ToLongFunction toLongFunction) {
        return C14544.m33214b(this.f8631a.mapToLong(toLongFunction));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ C18189 max(Comparator comparator) {
        return AbstractC17736.m40308j(this.f8631a.max(comparator));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ C18189 min(Comparator comparator) {
        return AbstractC17736.m40308j(this.f8631a.min(comparator));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f8631a.noneMatch(predicate);
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 onClose(Runnable runnable) {
        return C19394.m44142b(this.f8631a.onClose(runnable));
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 parallel() {
        return C19394.m44142b(this.f8631a.parallel());
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 peek(Consumer consumer) {
        return m7917b(this.f8631a.peek(consumer));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f8631a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f8631a.reduce(obj, binaryOperator);
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ C18189 reduce(BinaryOperator binaryOperator) {
        return AbstractC17736.m40308j(this.f8631a.reduce(binaryOperator));
    }

    @Override // p067l.InterfaceC14147, p067l.InterfaceC20165
    public final /* synthetic */ InterfaceC14147 sequential() {
        return C19394.m44142b(this.f8631a.sequential());
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 skip(long j) {
        return m7917b(this.f8631a.skip(j));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 sorted() {
        return m7917b(this.f8631a.sorted());
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 sorted(Comparator comparator) {
        return m7917b(this.f8631a.sorted(comparator));
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC16847 spliterator() {
        return C5508.m12135a(this.f8631a.spliterator());
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ InterfaceC19157 takeWhile(Predicate predicate) {
        return m7917b(this.f8631a.takeWhile(predicate));
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ Object[] toArray() {
        return this.f8631a.toArray();
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f8631a.toArray(intFunction);
    }

    @Override // p067l.InterfaceC19157
    public final /* synthetic */ List toList() {
        return this.f8631a.toList();
    }

    @Override // p067l.InterfaceC14147
    public final /* synthetic */ InterfaceC14147 unordered() {
        return C19394.m44142b(this.f8631a.unordered());
    }
}
