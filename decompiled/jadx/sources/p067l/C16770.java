package p067l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܶۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes5.dex */
public class C16770 implements InterfaceC3360, Serializable, InterfaceC3456 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC3360 f49424;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f49425;

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final /* synthetic */ void forEach(Consumer consumer) {
        C18763.m42786(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(parallelStream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C7384.m17107(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C16770(InterfaceC13399 interfaceC13399, Object obj) {
        C12826.requireNonNull(interfaceC13399);
        this.f49424 = interfaceC13399;
        this.f49425 = obj;
    }

    @Override // p067l.InterfaceC3360
    public boolean add(int i) {
        boolean zAdd;
        synchronized (this.f49425) {
            zAdd = this.f49424.add(i);
        }
        return zAdd;
    }

    @Override // p067l.InterfaceC3360
    public boolean contains(int i) {
        boolean zContains;
        synchronized (this.f49425) {
            zContains = this.f49424.contains(i);
        }
        return zContains;
    }

    @Override // p067l.InterfaceC3360
    /* JADX INFO: renamed from: ۖ */
    public boolean mo5872(int i) {
        boolean zMo5872;
        synchronized (this.f49425) {
            zMo5872 = this.f49424.mo5872(i);
        }
        return zMo5872;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f49425) {
            size = this.f49424.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f49425) {
            zIsEmpty = this.f49424.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // p067l.InterfaceC3360
    /* JADX INFO: renamed from: ܶ */
    public int[] mo5873() {
        int[] iArrMo5873;
        synchronized (this.f49425) {
            iArrMo5873 = this.f49424.mo5873();
        }
        return iArrMo5873;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f49425) {
            array = this.f49424.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public boolean add(Integer num) {
        boolean zAdd;
        synchronized (this.f49425) {
            zAdd = this.f49424.add(num);
        }
        return zAdd;
    }

    @Override // p067l.InterfaceC3360, java.util.Collection
    @Deprecated
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f49425) {
            zContains = this.f49424.contains(obj);
        }
        return zContains;
    }

    @Override // p067l.InterfaceC3360, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f49425) {
            zRemove = this.f49424.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f49425) {
            array = this.f49424.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC8705 iterator() {
        return this.f49424.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18287 spliterator() {
        return this.f49424.spliterator();
    }

    @Override // p067l.InterfaceC3360, java.util.Collection
    @Deprecated
    public InterfaceC19157 stream() {
        return this.f49424.stream();
    }

    @Override // p067l.InterfaceC3360, java.util.Collection
    @Deprecated
    public InterfaceC19157 parallelStream() {
        return this.f49424.parallelStream();
    }

    @Override // p067l.InterfaceC16080
    public void forEach(IntConsumer intConsumer) {
        synchronized (this.f49425) {
            this.f49424.forEach(intConsumer);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f49425) {
            zAddAll = this.f49424.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f49425) {
            zContainsAll = this.f49424.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f49425) {
            zRemoveAll = this.f49424.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f49425) {
            zRetainAll = this.f49424.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // p067l.InterfaceC3360
    /* JADX INFO: renamed from: ֫ */
    public boolean mo5871(IntPredicate intPredicate) {
        boolean zMo5871;
        synchronized (this.f49425) {
            zMo5871 = this.f49424.mo5871(intPredicate);
        }
        return zMo5871;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f49425) {
            this.f49424.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f49425) {
            string = this.f49424.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f49425) {
            iHashCode = this.f49424.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f49425) {
            zEquals = this.f49424.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f49425) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
