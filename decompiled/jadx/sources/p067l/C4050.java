package p067l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.֫ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C4050 extends AbstractC9472 implements Set, Serializable, InterfaceC10814 {
    public static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: b */
    public final Object f8913b;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C19828.convert(C16474.stream(C7480.m17261b(this), true));
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public final /* synthetic */ InterfaceC19157 mo56527parallelStream() {
        return C16474.stream(C7480.m17261b(this), true);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C2785.$default$removeIf(this, predicate);
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

    public C4050(ConcurrentMapC12768 concurrentMapC12768, Object obj) {
        super(concurrentMapC12768);
        this.f8913b = obj;
    }

    @Override // p067l.AbstractC9472, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f25965a.containsKey(obj);
    }

    @Override // p067l.AbstractC9472, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f25965a.remove(obj) != null;
    }

    @Override // p067l.AbstractC9472, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentMapC12768 concurrentMapC12768 = this.f25965a;
        C2708[] c2708Arr = concurrentMapC12768.f35948a;
        int length = c2708Arr == null ? 0 : c2708Arr.length;
        return new C6062(c2708Arr, length, length, concurrentMapC12768, 0);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2 = this.f8913b;
        if (obj2 != null) {
            return this.f25965a.m29318f(obj, obj2, true) == null;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Object obj = this.f8913b;
        if (obj == null) {
            throw new UnsupportedOperationException();
        }
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (this.f25965a.m29318f(it.next(), obj, true) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Object it = iterator();
        int iHashCode = 0;
        while (((AbstractC24837) it).hasNext()) {
            iHashCode += ((C6062) it).next().hashCode();
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
        return new C20144(c2708Arr, length, 0, length, jM29320j < 0 ? 0L : jM29320j, 0);
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
                consumer.m45213n(c2708M38035a.f4545b);
            }
        }
    }
}
