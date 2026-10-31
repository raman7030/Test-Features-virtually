package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩺ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5UX */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22725 extends AbstractCollection implements Serializable, InterfaceC1144 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Object[] f73423 = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public /* synthetic */ void forEach(Consumer consumer) {
        C21962.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract AbstractC20151 iterator();

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC17664 mo42463parallelStream() {
        return C14841.stream(C5378.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C0438.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(mo42464stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public /* synthetic */ InterfaceC17664 mo42464stream() {
        return C14841.stream(C5378.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo19283();

    /* JADX INFO: renamed from: ܽ */
    public Object[] mo24242() {
        return null;
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return C22291.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f73423);
    }

    /* JADX INFO: renamed from: ܿ */
    public int mo24243() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo24244() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractC14545 mo16996() {
        if (isEmpty()) {
            int i = AbstractC14545.f44556;
            return C16457.f50591;
        }
        Object[] array = toArray(f73423);
        int i2 = AbstractC14545.f44556;
        return AbstractC14545.m34735(array.length, array);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo24235(int i, Object[] objArr) {
        AbstractC20151 it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object writeReplace() {
        return new C18074(toArray(f73423));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo24242 = mo24242();
            if (objArrMo24242 == null) {
                if (objArr.length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(objArrMo24242, mo24243(), mo24244(), objArr.getClass());
            }
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo24235(0, objArr);
        return objArr;
    }
}
