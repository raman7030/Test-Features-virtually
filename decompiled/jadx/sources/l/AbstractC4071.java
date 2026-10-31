package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۘܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4071 extends AbstractCollection implements InterfaceC11169, InterfaceC1144 {
    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public /* synthetic */ void forEach(Consumer consumer) {
        C19636.m45149(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C1996.m6528(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C22291.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(mo42464stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return add(((Float) obj).floatValue());
    }

    public boolean add(float f) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean mo4106(float f) {
        InterfaceC1290 it = iterator();
        while (it.hasNext()) {
            if (f == it.nextFloat()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC0584
    /* JADX INFO: renamed from: ۧ */
    public void mo2423(InterfaceC4113 interfaceC4113) {
        iterator().forEachRemaining(interfaceC4113);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo12230(InterfaceC11169 interfaceC11169) {
        InterfaceC1290 it = interfaceC11169.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextFloat())) {
                z = true;
            }
        }
        return z;
    }

    @Override // l.InterfaceC11169
    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean add(Float f) {
        return add(f.floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC11169) {
            return mo12230((InterfaceC11169) collection);
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC11169
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo17038(((Float) obj).floatValue());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo12233(InterfaceC11169 interfaceC11169) {
        InterfaceC1290 it = interfaceC11169.iterator();
        while (it.hasNext()) {
            if (!mo17038(it.nextFloat())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC11169
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo4106(((Float) obj).floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC11169) {
            return mo12233((InterfaceC11169) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean mo12234(InterfaceC11169 interfaceC11169) {
        InterfaceC1290 it = interfaceC11169.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo4106(it.nextFloat())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC11169) {
            return mo12234((InterfaceC11169) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo12235(InterfaceC11169 interfaceC11169) {
        InterfaceC1290 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC11169.mo17038(it.nextFloat())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC11169) {
            return mo12235((InterfaceC11169) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC1290 it = iterator();
        int size = size();
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(String.valueOf(it.nextFloat()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // l.InterfaceC11169
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo12231(InterfaceC23162 interfaceC23162) {
        InterfaceC1290 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC23162.mo17154(it.nextFloat())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC11169, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public final InterfaceC17664 mo42464stream() {
        return C14841.stream(C5378.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC11169, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC17664 mo42463parallelStream() {
        return C14841.stream(C5378.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
