package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6CN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23951 extends AbstractC23652 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // p067l.AbstractC23652, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // p067l.AbstractC23652, p067l.InterfaceC18625
    public final void forEach(LongConsumer longConsumer) {
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.InterfaceC13223
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo19003(long j) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C10579.f29293;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p067l.InterfaceC13223, p067l.InterfaceC18625, java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC24660 iterator() {
        return C10579.f29293;
    }

    @Override // p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return C5215.f12242;
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

    @Override // p067l.AbstractC23652, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // p067l.AbstractC23652, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23652, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23652, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23652, java.util.Collection, p067l.InterfaceC3456
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C12826.requireNonNull(predicate);
        return false;
    }

    @Override // p067l.AbstractC23652
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo52599(InterfaceC13223 interfaceC13223) {
        return interfaceC13223.isEmpty();
    }

    @Override // p067l.AbstractC23652
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19002(InterfaceC13223 interfaceC13223) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23652
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14950(InterfaceC13223 interfaceC13223) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23652
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo52600(InterfaceC13223 interfaceC13223) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23652, p067l.InterfaceC13223
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14949(LongPredicate longPredicate) {
        C12826.requireNonNull(longPredicate);
        return false;
    }
}
