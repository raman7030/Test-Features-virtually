package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩹ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: EC53 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22394 extends AbstractCollection implements InterfaceC11421, InterfaceC1144 {
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
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
        return add(((Long) obj).longValue());
    }

    public boolean add(long j) {
        throw new UnsupportedOperationException();
    }

    public void forEach(LongConsumer longConsumer) {
        iterator().forEachRemaining(longConsumer);
    }

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public void forEach(Consumer consumer) {
        C11003.requireNonNull(consumer);
        forEach(consumer instanceof LongConsumer ? (LongConsumer) consumer : new C17811(consumer));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo17071(((Long) obj).longValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo17070(InterfaceC11421 interfaceC11421) {
        InterfaceC23455 it = interfaceC11421.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.nextLong())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo13088(((Long) obj).longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC11421) {
            return mo17070((InterfaceC11421) collection);
        }
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo50259(InterfaceC11421 interfaceC11421) {
        InterfaceC23455 it = interfaceC11421.iterator();
        while (it.hasNext()) {
            if (!mo17071(it.nextLong())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC11421) {
            return mo50259((InterfaceC11421) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo13086(InterfaceC11421 interfaceC11421) {
        InterfaceC23455 it = interfaceC11421.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo13088(it.nextLong())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC11421) {
            return mo13086((InterfaceC11421) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo50260(InterfaceC11421 interfaceC11421) {
        InterfaceC23455 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC11421.mo17071(it.nextLong())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC11421) {
            return mo50260((InterfaceC11421) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC23455 it = iterator();
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
                sb.append(String.valueOf(it.nextLong()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public boolean removeIf(final Predicate predicate) {
        return mo13085(predicate instanceof LongPredicate ? (LongPredicate) predicate : new LongPredicate() { // from class: l.ۛۖᩴ
            public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
                return C3762.$default$and(this, longPredicate);
            }

            public /* synthetic */ LongPredicate negate() {
                return C3762.$default$negate(this);
            }

            public /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
                return C3762.$default$or(this, longPredicate);
            }

            @Override // java.util.function.LongPredicate
            public final boolean test(long j) {
                return predicate.test(Long.valueOf(j));
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo13085(LongPredicate longPredicate) {
        C11003.requireNonNull(longPredicate);
        InterfaceC23455 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (longPredicate.test(it.nextLong())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public final InterfaceC17664 mo42464stream() {
        return C14841.stream(C5378.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC17664 mo42463parallelStream() {
        return C14841.stream(C5378.b(this), true);
    }
}
