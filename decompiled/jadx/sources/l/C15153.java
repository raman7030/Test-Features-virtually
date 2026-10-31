package l;

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
public class C15153 implements InterfaceC1043, Serializable, InterfaceC1144 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC1043 f46305;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f46306;

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final /* synthetic */ void forEach(Consumer consumer) {
        C17250.m40537(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C5277.m15204(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C15153(InterfaceC11606 interfaceC11606, Object obj) {
        C11003.requireNonNull(interfaceC11606);
        this.f46305 = interfaceC11606;
        this.f46306 = obj;
    }

    @Override // l.InterfaceC1043
    public boolean add(int i) {
        boolean zAdd;
        synchronized (this.f46306) {
            zAdd = this.f46305.add(i);
        }
        return zAdd;
    }

    @Override // l.InterfaceC1043
    public boolean contains(int i) {
        boolean zContains;
        synchronized (this.f46306) {
            zContains = this.f46305.contains(i);
        }
        return zContains;
    }

    @Override // l.InterfaceC1043
    /* JADX INFO: renamed from: ۖ */
    public boolean mo3585(int i) {
        boolean zMo3585;
        synchronized (this.f46306) {
            zMo3585 = this.f46305.mo3585(i);
        }
        return zMo3585;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f46306) {
            size = this.f46305.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f46306) {
            zIsEmpty = this.f46305.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.InterfaceC1043
    /* JADX INFO: renamed from: ܶ */
    public int[] mo3586() {
        int[] iArrMo3586;
        synchronized (this.f46306) {
            iArrMo3586 = this.f46305.mo3586();
        }
        return iArrMo3586;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f46306) {
            array = this.f46305.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public boolean add(Integer num) {
        boolean zAdd;
        synchronized (this.f46306) {
            zAdd = this.f46305.add(num);
        }
        return zAdd;
    }

    @Override // l.InterfaceC1043, java.util.Collection
    @Deprecated
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f46306) {
            zContains = this.f46305.contains(obj);
        }
        return zContains;
    }

    @Override // l.InterfaceC1043, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f46306) {
            zRemove = this.f46305.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f46306) {
            array = this.f46305.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC6667 iterator() {
        return this.f46305.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16749 spliterator() {
        return this.f46305.spliterator();
    }

    @Override // l.InterfaceC1043, java.util.Collection
    @Deprecated
    public InterfaceC17664 stream() {
        return this.f46305.stream();
    }

    @Override // l.InterfaceC1043, java.util.Collection
    @Deprecated
    public InterfaceC17664 parallelStream() {
        return this.f46305.parallelStream();
    }

    @Override // l.InterfaceC14427
    public void forEach(IntConsumer intConsumer) {
        synchronized (this.f46306) {
            this.f46305.forEach(intConsumer);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f46306) {
            zAddAll = this.f46305.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f46306) {
            zContainsAll = this.f46305.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f46306) {
            zRemoveAll = this.f46305.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f46306) {
            zRetainAll = this.f46305.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // l.InterfaceC1043
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3584(IntPredicate intPredicate) {
        boolean zMo3584;
        synchronized (this.f46306) {
            zMo3584 = this.f46305.mo3584(intPredicate);
        }
        return zMo3584;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f46306) {
            this.f46305.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f46306) {
            string = this.f46305.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f46306) {
            iHashCode = this.f46305.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f46306) {
            zEquals = this.f46305.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f46306) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
