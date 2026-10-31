package l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۡۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8825 extends AbstractC7474 implements Set, InterfaceC8886 {
    public static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C18370.convert(C14841.stream(C5378.b(this), true));
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public final /* synthetic */ InterfaceC17664 mo42463parallelStream() {
        return C14841.stream(C5378.b(this), true);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return C18370.convert(C14841.stream(C5378.b(this), false));
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public final /* synthetic */ InterfaceC17664 mo42464stream() {
        return C14841.stream(C5378.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // l.AbstractC7474, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.a.get(key)) == null || (value = entry.getValue()) == null) {
            return false;
        }
        return value == obj2 || value.equals(obj2);
    }

    @Override // l.AbstractC7474, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.a.remove(key, value);
    }

    @Override // l.AbstractC7474, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentMapC10942 concurrentMapC10942 = this.a;
        C0357[] c0357Arr = concurrentMapC10942.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        return new C9531(c0357Arr, length, length, concurrentMapC10942);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.a.f(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final boolean removeIf(Predicate predicate) {
        ConcurrentMapC10942 concurrentMapC10942 = this.a;
        predicate.getClass();
        C0357[] c0357Arr = concurrentMapC10942.a;
        boolean z = false;
        if (c0357Arr != null) {
            C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
            while (true) {
                C0357 c0357A = c15173.a();
                if (c0357A == null) {
                    break;
                }
                Object obj = c0357A.b;
                Object obj2 = c0357A.c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentMapC10942.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C0357[] c0357Arr = this.a.a;
        int iHashCode = 0;
        if (c0357Arr != null) {
            C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
            while (true) {
                C0357 c0357A = c15173.a();
                if (c0357A == null) {
                    break;
                }
                iHashCode += c0357A.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set != this) {
            return containsAll(set) && set.containsAll(this);
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, l.InterfaceC8886, l.InterfaceC4323
    public final InterfaceC15234 spliterator() {
        ConcurrentMapC10942 concurrentMapC10942 = this.a;
        long j = concurrentMapC10942.j();
        C0357[] c0357Arr = concurrentMapC10942.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        return new C15879(c0357Arr, length, 0, length, j >= 0 ? j : 0L, concurrentMapC10942);
    }

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C0357[] c0357Arr = this.a.a;
        if (c0357Arr == null) {
            return;
        }
        C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
        while (true) {
            C0357 c0357A = c15173.a();
            if (c0357A == null) {
                return;
            } else {
                consumer.n(new C19409(c0357A.b, c0357A.c, this.a));
            }
        }
    }
}
