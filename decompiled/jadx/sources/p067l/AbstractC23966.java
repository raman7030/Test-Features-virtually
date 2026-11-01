package p067l;

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
public abstract class AbstractC23966 extends AbstractCollection implements Serializable, InterfaceC3456 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ᩸ */
    public static final Object[] f76146 = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public /* synthetic */ void forEach(Consumer consumer) {
        C23241.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract AbstractC21520 iterator();

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC19157 mo56527parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C2785.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(mo56528stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public /* synthetic */ InterfaceC19157 mo56528stream() {
        return C16474.stream(C7480.m17261b(this), false);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo21230();

    /* JADX INFO: renamed from: ܽ */
    public Object[] mo26252() {
        return null;
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return C23554.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f76146);
    }

    /* JADX INFO: renamed from: ܿ */
    public int mo26253() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo26254() {
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
    public AbstractC16192 mo18927() {
        if (isEmpty()) {
            int i = AbstractC16192.f47662;
            return C18009.f53770;
        }
        Object[] array = toArray(f76146);
        int i2 = AbstractC16192.f47662;
        return AbstractC16192.m36884(array.length, array);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo26245(int i, Object[] objArr) {
        AbstractC21520 it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object writeReplace() {
        return new C19546(toArray(f76146));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo26252 = mo26252();
            if (objArrMo26252 == null) {
                if (objArr.length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(objArrMo26252, mo26253(), mo26254(), objArr.getClass());
            }
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo26245(0, objArr);
        return objArr;
    }
}
