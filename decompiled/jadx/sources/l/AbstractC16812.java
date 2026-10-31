package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9QE */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16812 extends AbstractC4071 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.AbstractC4071, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC4071, l.InterfaceC11169
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12231(InterfaceC23162 interfaceC23162) {
        return false;
    }

    @Override // l.AbstractC4071, l.InterfaceC0584
    /* JADX INFO: renamed from: ۧ */
    public final void mo2423(InterfaceC4113 interfaceC4113) {
    }

    @Override // l.InterfaceC11169
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo17038(float f) {
        return false;
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C22457.f72735;
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC1290 iterator() {
        return C22457.f72735;
    }

    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return C21026.f67866;
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

    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16791 spliterator() {
        return C21026.f67866;
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4071, java.util.Collection, l.InterfaceC1144
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C11003.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC4071
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo12233(InterfaceC11169 interfaceC11169) {
        return interfaceC11169.isEmpty();
    }

    @Override // l.AbstractC4071
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12230(InterfaceC11169 interfaceC11169) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4071
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12234(InterfaceC11169 interfaceC11169) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC4071
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo12235(InterfaceC11169 interfaceC11169) {
        throw new UnsupportedOperationException();
    }
}
