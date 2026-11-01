package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9QE */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18347 extends AbstractC6238 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // p067l.AbstractC6238, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
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

    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC12984
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14152(InterfaceC24382 interfaceC24382) {
        return false;
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC2924
    /* JADX INFO: renamed from: ۧ */
    public final void mo4794(InterfaceC6278 interfaceC6278) {
    }

    @Override // p067l.InterfaceC12984
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo18969(float f) {
        return false;
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C23712.f75461;
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC3595 iterator() {
        return C23712.f75461;
    }

    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return C22352.f70551;
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

    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18327 spliterator() {
        return C22352.f70551;
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC6238, java.util.Collection, p067l.InterfaceC3456
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C12826.requireNonNull(predicate);
        return false;
    }

    @Override // p067l.AbstractC6238
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo14154(InterfaceC12984 interfaceC12984) {
        return interfaceC12984.isEmpty();
    }

    @Override // p067l.AbstractC6238
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14151(InterfaceC12984 interfaceC12984) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC6238
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14155(InterfaceC12984 interfaceC12984) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC6238
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo14156(InterfaceC12984 interfaceC12984) {
        throw new UnsupportedOperationException();
    }
}
