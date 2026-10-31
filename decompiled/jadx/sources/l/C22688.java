package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩺֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D26 */
/* JADX INFO: loaded from: classes.dex */
public class C22688 implements InterfaceC5755, Serializable, InterfaceC1144 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC5755 f73316;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10142 f73317;

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final /* synthetic */ void forEach(Consumer consumer) {
        C20841.m47659(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C9989.m25150(this, predicate);
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

    public C22688(InterfaceC11668 interfaceC11668, C10142 c10142) {
        C11003.requireNonNull(interfaceC11668);
        this.f73316 = interfaceC11668;
        this.f73317 = c10142;
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ۧ */
    public boolean mo8955(char c) {
        boolean zMo8955;
        synchronized (this.f73317) {
            zMo8955 = this.f73316.mo8955(c);
        }
        return zMo8955;
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ᩻ */
    public boolean mo8956(char c) {
        boolean zMo8956;
        synchronized (this.f73317) {
            zMo8956 = this.f73316.mo8956(c);
        }
        return zMo8956;
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ܿ */
    public boolean mo2005(char c) {
        boolean zMo2005;
        synchronized (this.f73317) {
            zMo2005 = this.f73316.mo2005(c);
        }
        return zMo2005;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f73317) {
            size = this.f73316.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f73317) {
            zIsEmpty = this.f73316.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f73317) {
            array = this.f73316.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public boolean add(Character ch) {
        boolean zAdd;
        synchronized (this.f73317) {
            zAdd = this.f73316.add(ch);
        }
        return zAdd;
    }

    @Override // l.InterfaceC5755, java.util.Collection
    @Deprecated
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f73317) {
            zContains = this.f73316.contains(obj);
        }
        return zContains;
    }

    @Override // l.InterfaceC5755, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f73317) {
            zRemove = this.f73316.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f73317) {
            array = this.f73316.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC15900 iterator() {
        return this.f73316.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16770 spliterator() {
        return this.f73316.spliterator();
    }

    @Override // l.InterfaceC5755, java.util.Collection
    @Deprecated
    public InterfaceC17664 stream() {
        return this.f73316.stream();
    }

    @Override // l.InterfaceC5755, java.util.Collection
    @Deprecated
    public InterfaceC17664 parallelStream() {
        return this.f73316.parallelStream();
    }

    @Override // l.InterfaceC9552
    /* JADX INFO: renamed from: ֫ */
    public void mo10076(InterfaceC23662 interfaceC23662) {
        synchronized (this.f73317) {
            this.f73316.mo10076(interfaceC23662);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f73317) {
            zAddAll = this.f73316.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f73317) {
            zContainsAll = this.f73316.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f73317) {
            zRemoveAll = this.f73316.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f73317) {
            zRetainAll = this.f73316.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ֫ */
    public boolean mo16207(InterfaceC6023 interfaceC6023) {
        boolean zMo16207;
        synchronized (this.f73317) {
            zMo16207 = this.f73316.mo16207(interfaceC6023);
        }
        return zMo16207;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f73317) {
            this.f73316.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f73317) {
            string = this.f73316.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f73317) {
            iHashCode = this.f73316.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f73317) {
            zEquals = this.f73316.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f73317) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
