package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10066 extends AbstractC23022 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return false;
    }

    @Override // p067l.AbstractC23022, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
    }

    @Override // java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return C6023.f15086;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ InterfaceC8705 iterator() {
        return C6023.f15086;
    }

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return C4877.f11123;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C9809.f27145;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return C4877.f11123;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, java.util.Collection, p067l.InterfaceC3456
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C12826.requireNonNull(predicate);
        return false;
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo5873() {
        return C20796.f65364;
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo23492(InterfaceC3360 interfaceC3360) {
        return interfaceC3360.isEmpty();
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18622(InterfaceC3360 interfaceC3360) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo23493(InterfaceC3360 interfaceC3360) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo23494(InterfaceC3360 interfaceC3360) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5871(IntPredicate intPredicate) {
        C12826.requireNonNull(intPredicate);
        return false;
    }
}
