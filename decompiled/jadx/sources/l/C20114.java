package l;

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
public final class C20114 extends AbstractC7474 implements InterfaceC1144 {
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

    @Override // java.util.Collection, java.lang.Iterable
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

    @Override // l.AbstractC7474, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // l.AbstractC7474, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        AbstractC23641 abstractC23641;
        if (obj == null) {
            return false;
        }
        Object it = iterator();
        do {
            abstractC23641 = (AbstractC23641) it;
            if (!abstractC23641.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C3886) it).next()));
        abstractC23641.remove();
        return true;
    }

    @Override // l.AbstractC7474, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentMapC10942 concurrentMapC10942 = this.a;
        C0357[] c0357Arr = concurrentMapC10942.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        return new C3886(c0357Arr, length, length, concurrentMapC10942, 1);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC7474, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z = false;
        while (true) {
            AbstractC23641 abstractC23641 = (AbstractC23641) it;
            if (!abstractC23641.hasNext()) {
                return z;
            }
            if (collection.contains(((C3886) it).next())) {
                abstractC23641.remove();
                z = true;
            }
        }
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
                if (predicate.test(obj2) && concurrentMapC10942.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        ConcurrentMapC10942 concurrentMapC10942 = this.a;
        long j = concurrentMapC10942.j();
        C0357[] c0357Arr = concurrentMapC10942.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        return new C18703(c0357Arr, length, 0, length, j < 0 ? 0L : j, 1);
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
                consumer.n(c0357A.c);
            }
        }
    }
}
