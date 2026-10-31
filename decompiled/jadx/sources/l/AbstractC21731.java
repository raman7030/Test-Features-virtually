package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩸ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1Q1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21731 extends AbstractCollection implements InterfaceC1043, InterfaceC1144 {
    public /* synthetic */ void forEach(Consumer consumer) {
        C17250.m40537(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C5277.m15204(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C22291.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public boolean add(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo3585(int i) {
        InterfaceC6667 it = iterator();
        while (it.hasNext()) {
            if (i == it.nextInt()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public void forEach(IntConsumer intConsumer) {
        iterator().forEachRemaining(intConsumer);
    }

    /* JADX INFO: renamed from: ܶ */
    public int[] mo3586() {
        int size = size();
        if (size == 0) {
            return C19389.f62753;
        }
        int[] iArr = new int[size];
        InterfaceC6667 it = iterator();
        if (size < 0) {
            throw new IllegalArgumentException(C18307.m42645(size, "The maximum number of elements (", ") is negative"));
        }
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size == 0 || !it.hasNext()) {
                break;
            }
            iArr[i] = it.nextInt();
            i++;
            size = i2;
        }
        return iArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        return add(num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC1043
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return contains(((Integer) obj).intValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo16696(InterfaceC1043 interfaceC1043) {
        InterfaceC6667 it = interfaceC1043.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, l.InterfaceC1043
    @Deprecated
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo3585(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC1043) {
            return mo16696((InterfaceC1043) collection);
        }
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo21524(InterfaceC1043 interfaceC1043) {
        InterfaceC6667 it = interfaceC1043.iterator();
        while (it.hasNext()) {
            if (!contains(it.nextInt())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC1043) {
            return mo21524((InterfaceC1043) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo21525(InterfaceC1043 interfaceC1043) {
        InterfaceC6667 it = interfaceC1043.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo3585(it.nextInt())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC1043) {
            return mo21525((InterfaceC1043) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo21526(InterfaceC1043 interfaceC1043) {
        InterfaceC6667 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC1043.contains(it.nextInt())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC1043) {
            return mo21526((InterfaceC1043) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC6667 it = iterator();
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
                sb.append(String.valueOf(it.nextInt()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo3584(IntPredicate intPredicate) {
        C11003.requireNonNull(intPredicate);
        InterfaceC6667 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (intPredicate.test(it.nextInt())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC1043
    public final InterfaceC17664 stream() {
        return C14841.stream(C5378.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC1043
    public final InterfaceC17664 parallelStream() {
        return C14841.stream(C5378.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
