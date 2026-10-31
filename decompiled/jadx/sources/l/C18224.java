package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ᩳᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18224 implements InterfaceC11169, Serializable, InterfaceC1144 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC11169 f56634;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21647 f56635;

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final /* synthetic */ void forEach(Consumer consumer) {
        C19636.m45149(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C1996.m6528(this, predicate);
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
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C18224(InterfaceC11169 interfaceC11169, C21647 c21647) {
        C11003.requireNonNull(interfaceC11169);
        this.f56634 = interfaceC11169;
        this.f56635 = c21647;
    }

    @Override // l.InterfaceC11169
    public final boolean add(float f) {
        boolean zAdd;
        synchronized (this.f56635) {
            zAdd = this.f56634.add(f);
        }
        return zAdd;
    }

    @Override // l.InterfaceC11169
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo17038(float f) {
        boolean zMo17038;
        synchronized (this.f56635) {
            zMo17038 = this.f56634.mo17038(f);
        }
        return zMo17038;
    }

    @Override // l.InterfaceC11169
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo4106(float f) {
        boolean zMo4106;
        synchronized (this.f56635) {
            zMo4106 = this.f56634.mo4106(f);
        }
        return zMo4106;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f56635) {
            size = this.f56634.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f56635) {
            zIsEmpty = this.f56634.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f56635) {
            array = this.f56634.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public final boolean add(Float f) {
        boolean zAdd;
        synchronized (this.f56635) {
            zAdd = this.f56634.add(f);
        }
        return zAdd;
    }

    @Override // l.InterfaceC11169, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f56635) {
            zContains = this.f56634.contains(obj);
        }
        return zContains;
    }

    @Override // l.InterfaceC11169, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f56635) {
            zRemove = this.f56634.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f56635) {
            array = this.f56634.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f56634.iterator();
    }

    @Override // l.InterfaceC11169, java.util.Collection, java.lang.Iterable, l.InterfaceC0584
    public final InterfaceC1290 iterator() {
        return this.f56634.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return this.f56634.spliterator();
    }

    @Override // l.InterfaceC11169, java.util.Collection, java.lang.Iterable
    public final InterfaceC16791 spliterator() {
        return this.f56634.spliterator();
    }

    @Override // l.InterfaceC11169, l.InterfaceC1144
    @Deprecated
    /* JADX INFO: renamed from: stream, reason: collision with other method in class */
    public final InterfaceC17664 mo42464stream() {
        return this.f56634.mo42464stream();
    }

    @Override // l.InterfaceC11169, l.InterfaceC1144
    @Deprecated
    /* JADX INFO: renamed from: parallelStream, reason: collision with other method in class */
    public final InterfaceC17664 mo42463parallelStream() {
        return this.f56634.mo42463parallelStream();
    }

    @Override // l.InterfaceC0584
    /* JADX INFO: renamed from: ۧ */
    public final void mo2423(InterfaceC4113 interfaceC4113) {
        synchronized (this.f56635) {
            this.f56634.mo2423(interfaceC4113);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f56635) {
            zAddAll = this.f56634.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f56635) {
            zContainsAll = this.f56634.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f56635) {
            zRemoveAll = this.f56634.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f56635) {
            zRetainAll = this.f56634.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // l.InterfaceC11169
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12231(InterfaceC23162 interfaceC23162) {
        boolean zMo12231;
        synchronized (this.f56635) {
            zMo12231 = this.f56634.mo12231(interfaceC23162);
        }
        return zMo12231;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f56635) {
            this.f56634.clear();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.f56635) {
            string = this.f56634.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f56635) {
            iHashCode = this.f56634.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f56635) {
            zEquals = this.f56634.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f56635) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
