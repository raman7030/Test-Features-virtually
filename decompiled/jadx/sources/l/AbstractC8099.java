package l;

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
public abstract class AbstractC8099 extends AbstractC21731 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return false;
    }

    @Override // l.AbstractC21731, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
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

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return C3845.f12278;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ InterfaceC6667 iterator() {
        return C3845.f12278;
    }

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return C2639.f8329;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C7829.f24229;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return C2639.f8329;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, java.util.Collection, l.InterfaceC1144
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C11003.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo3586() {
        return C19389.f62753;
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo21524(InterfaceC1043 interfaceC1043) {
        return interfaceC1043.isEmpty();
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16696(InterfaceC1043 interfaceC1043) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo21525(InterfaceC1043 interfaceC1043) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo21526(InterfaceC1043 interfaceC1043) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3584(IntPredicate intPredicate) {
        C11003.requireNonNull(intPredicate);
        return false;
    }
}
