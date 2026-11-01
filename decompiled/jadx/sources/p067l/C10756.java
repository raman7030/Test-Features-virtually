package p067l;

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
public final class C10756 extends AbstractC9472 implements Set, InterfaceC10814 {
    public static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C19828.convert(C16474.stream(C7480.m17261b(this), true));
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public final /* synthetic */ InterfaceC19157 mo56527parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return C19828.convert(C16474.stream(C7480.m17261b(this), false));
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public final /* synthetic */ InterfaceC19157 mo56528stream() {
        return C16474.stream(C7480.m17261b(this), false);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.f25965a.m29318f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // p067l.AbstractC9472, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f25965a.get(key)) == null || (value = entry.getValue()) == null) {
            return false;
        }
        return value == obj2 || value.equals(obj2);
    }

    @Override // p067l.AbstractC9472, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f25965a.remove(key, value);
    }

    @Override // p067l.AbstractC9472, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentMapC12768 concurrentMapC12768 = this.f25965a;
        C2708[] c2708Arr = concurrentMapC12768.f35948a;
        int length = c2708Arr == null ? 0 : c2708Arr.length;
        return new C11427(c2708Arr, length, length, concurrentMapC12768);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f25965a.m29318f(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final boolean removeIf(Predicate predicate) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f25965a;
        predicate.getClass();
        C2708[] c2708Arr = concurrentMapC12768.f35948a;
        boolean z = false;
        if (c2708Arr != null) {
            C16789 c16789 = new C16789(c2708Arr, c2708Arr.length, 0, c2708Arr.length);
            while (true) {
                C2708 c2708M38035a = c16789.m38035a();
                if (c2708M38035a == null) {
                    break;
                }
                Object obj = c2708M38035a.f4545b;
                Object obj2 = c2708M38035a.f4546c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentMapC12768.m29319g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C2708[] c2708Arr = this.f25965a.f35948a;
        int iHashCode = 0;
        if (c2708Arr != null) {
            C16789 c16789 = new C16789(c2708Arr, c2708Arr.length, 0, c2708Arr.length);
            while (true) {
                C2708 c2708M38035a = c16789.m38035a();
                if (c2708M38035a == null) {
                    break;
                }
                iHashCode += c2708M38035a.hashCode();
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

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p067l.InterfaceC10814, p067l.InterfaceC6477
    public final InterfaceC16847 spliterator() {
        ConcurrentMapC12768 concurrentMapC12768 = this.f25965a;
        long jM29320j = concurrentMapC12768.m29320j();
        C2708[] c2708Arr = concurrentMapC12768.f35948a;
        int length = c2708Arr == null ? 0 : c2708Arr.length;
        return new C17460(c2708Arr, length, 0, length, jM29320j >= 0 ? jM29320j : 0L, concurrentMapC12768);
    }

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C2708[] c2708Arr = this.f25965a.f35948a;
        if (c2708Arr == null) {
            return;
        }
        C16789 c16789 = new C16789(c2708Arr, c2708Arr.length, 0, c2708Arr.length);
        while (true) {
            C2708 c2708M38035a = c16789.m38035a();
            if (c2708M38035a == null) {
                return;
            } else {
                consumer.m45213n(new C20815(c2708M38035a.f4545b, c2708M38035a.f4546c, this.f25965a));
            }
        }
    }
}
