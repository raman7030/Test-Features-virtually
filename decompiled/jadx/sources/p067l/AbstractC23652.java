package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
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
public abstract class AbstractC23652 extends AbstractCollection implements InterfaceC13223, InterfaceC3456 {
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C23554.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(mo56528stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
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

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public void forEach(Consumer consumer) {
        C12826.requireNonNull(consumer);
        forEach(consumer instanceof LongConsumer ? (LongConsumer) consumer : new C19296(consumer));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo19003(((Long) obj).longValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo19002(InterfaceC13223 interfaceC13223) {
        InterfaceC24660 it = interfaceC13223.iterator();
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
        return mo14952(((Long) obj).longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC13223) {
            return mo19002((InterfaceC13223) collection);
        }
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo52599(InterfaceC13223 interfaceC13223) {
        InterfaceC24660 it = interfaceC13223.iterator();
        while (it.hasNext()) {
            if (!mo19003(it.nextLong())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC13223) {
            return mo52599((InterfaceC13223) collection);
        }
        return super.containsAll(collection);
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo14950(InterfaceC13223 interfaceC13223) {
        InterfaceC24660 it = interfaceC13223.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (mo14952(it.nextLong())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC13223) {
            return mo14950((InterfaceC13223) collection);
        }
        return super.removeAll(collection);
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo52600(InterfaceC13223 interfaceC13223) {
        InterfaceC24660 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!interfaceC13223.mo19003(it.nextLong())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC13223) {
            return mo52600((InterfaceC13223) collection);
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC24660 it = iterator();
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
                sb.append(C0249l.f1198d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public boolean removeIf(final Predicate predicate) {
        return mo14949(predicate instanceof LongPredicate ? (LongPredicate) predicate : new LongPredicate() { // from class: l.ۛۖᩴ
            public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
                return C5944.$default$and(this, longPredicate);
            }

            public /* synthetic */ LongPredicate negate() {
                return C5944.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ LongPredicate m18165or(LongPredicate longPredicate) {
                return C5944.$default$or(this, longPredicate);
            }

            @Override // java.util.function.LongPredicate
            public final boolean test(long j) {
                return predicate.test(Long.valueOf(j));
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo14949(LongPredicate longPredicate) {
        C12826.requireNonNull(longPredicate);
        InterfaceC24660 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (longPredicate.test(it.nextLong())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public final InterfaceC19157 mo56528stream() {
        return C16474.stream(C7480.m17261b(this), false);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC19157 mo56527parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }
}
