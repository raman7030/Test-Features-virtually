package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩶ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21485 extends AbstractC9472 implements InterfaceC3456 {
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

    @Override // java.util.Collection, java.lang.Iterable
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

    @Override // p067l.AbstractC9472, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25965a.containsValue(obj);
    }

    @Override // p067l.AbstractC9472, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        AbstractC24837 abstractC24837;
        if (obj == null) {
            return false;
        }
        Object it = iterator();
        do {
            abstractC24837 = (AbstractC24837) it;
            if (!abstractC24837.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C6062) it).next()));
        abstractC24837.remove();
        return true;
    }

    @Override // p067l.AbstractC9472, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentMapC12768 concurrentMapC12768 = this.f25965a;
        C2708[] c2708Arr = concurrentMapC12768.f35948a;
        int length = c2708Arr == null ? 0 : c2708Arr.length;
        return new C6062(c2708Arr, length, length, concurrentMapC12768, 1);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC9472, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z = false;
        while (true) {
            AbstractC24837 abstractC24837 = (AbstractC24837) it;
            if (!abstractC24837.hasNext()) {
                return z;
            }
            if (collection.contains(((C6062) it).next())) {
                abstractC24837.remove();
                z = true;
            }
        }
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
                if (predicate.test(obj2) && concurrentMapC12768.m29319g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        ConcurrentMapC12768 concurrentMapC12768 = this.f25965a;
        long jM29320j = concurrentMapC12768.m29320j();
        C2708[] c2708Arr = concurrentMapC12768.f35948a;
        int length = c2708Arr == null ? 0 : c2708Arr.length;
        return new C20144(c2708Arr, length, 0, length, jM29320j < 0 ? 0L : jM29320j, 1);
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
                consumer.m45213n(c2708M38035a.f4546c);
            }
        }
    }
}
