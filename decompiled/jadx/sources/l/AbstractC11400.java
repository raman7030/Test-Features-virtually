package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D26 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11400 extends AbstractC20910 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.AbstractC20910, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
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

    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC20910, l.InterfaceC9552
    /* JADX INFO: renamed from: ֫ */
    public final void mo10076(InterfaceC23662 interfaceC23662) {
    }

    @Override // l.AbstractC20910, l.InterfaceC5755
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16207(InterfaceC6023 interfaceC6023) {
        return false;
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8956(char c) {
        return false;
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C0378.f1795;
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ InterfaceC15900 iterator() {
        return C0378.f1795;
    }

    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return C16064.f49532;
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

    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16770 spliterator() {
        return C16064.f49532;
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20910, java.util.Collection, l.InterfaceC1144
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C11003.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC20910
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo28162(InterfaceC5755 interfaceC5755) {
        return interfaceC5755.isEmpty();
    }

    @Override // l.AbstractC20910
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo28161(InterfaceC5755 interfaceC5755) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20910
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo28163(InterfaceC5755 interfaceC5755) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20910
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo28164(InterfaceC5755 interfaceC5755) {
        throw new UnsupportedOperationException();
    }
}
