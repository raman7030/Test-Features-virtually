package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D26 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13203 extends AbstractC22241 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // p067l.AbstractC22241, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
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

    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC11447
    /* JADX INFO: renamed from: ֫ */
    public final void mo12109(InterfaceC24857 interfaceC24857) {
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC7838
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18126(InterfaceC8093 interfaceC8093) {
        return false;
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo11024(char c) {
        return false;
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C2728.f4574;
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ InterfaceC17480 iterator() {
        return C2728.f4574;
    }

    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return C17636.f52695;
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

    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18307 spliterator() {
        return C17636.f52695;
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC22241, java.util.Collection, p067l.InterfaceC3456
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C12826.requireNonNull(predicate);
        return false;
    }

    @Override // p067l.AbstractC22241
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo30206(InterfaceC7838 interfaceC7838) {
        return interfaceC7838.isEmpty();
    }

    @Override // p067l.AbstractC22241
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30205(InterfaceC7838 interfaceC7838) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC22241
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo30207(InterfaceC7838 interfaceC7838) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC22241
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo30208(InterfaceC7838 interfaceC7838) {
        throw new UnsupportedOperationException();
    }
}
