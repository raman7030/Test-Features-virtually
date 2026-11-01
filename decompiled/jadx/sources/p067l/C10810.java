package p067l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۡ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10810 {
    /* JADX INFO: renamed from: ֫ */
    public static Object[] m24924(Iterable iterable, Class cls) {
        Collection collectionM21990;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, 0);
        if (iterable instanceof Collection) {
            collectionM21990 = (Collection) iterable;
        } else {
            collectionM21990 = C9468.m21990(iterable.iterator());
        }
        return collectionM21990.toArray(objArr);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m24930(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return C6786.m15491(iterable.iterator());
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m24927(Iterable iterable, InterfaceC20276 interfaceC20276) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            interfaceC20276.getClass();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (!interfaceC20276.apply(obj)) {
                    if (i2 > i) {
                        try {
                            list.set(i, obj);
                        } catch (IllegalArgumentException unused) {
                            m24922(list, interfaceC20276, i, i2);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            m24922(list, interfaceC20276, i, i2);
                            return;
                        }
                    }
                    i++;
                }
            }
            list.subList(i, list.size()).clear();
            return;
        }
        Iterator it = iterable.iterator();
        interfaceC20276.getClass();
        while (it.hasNext()) {
            if (interfaceC20276.apply(it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24922(List list, InterfaceC20276 interfaceC20276, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (interfaceC20276.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Iterable m24918(Iterable iterable) {
        return new C3178(iterable);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Iterable m24919(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new C16589(iterableArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m24921(Collection collection) {
        Iterator it = collection.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: ܿ */
    public static Object[] m24929(Iterable iterable) {
        Collection collectionM21990;
        if (iterable instanceof Collection) {
            collectionM21990 = (Collection) iterable;
        } else {
            collectionM21990 = C9468.m21990(iterable.iterator());
        }
        return collectionM21990.toArray();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m24923(Iterable iterable, InterfaceC20276 interfaceC20276) {
        Iterator it = iterable.iterator();
        C6194.m14026(interfaceC20276, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC20276.apply(it.next())) {
                if (i != -1) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m24926(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return C9179.m21131(1, list);
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Iterable m24920(Iterable iterable, InterfaceC18263 interfaceC18263) {
        iterable.getClass();
        return new C22210(iterable, interfaceC18263);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Iterable m24925(Iterable iterable, InterfaceC20276 interfaceC20276) {
        iterable.getClass();
        interfaceC20276.getClass();
        return new C8798(iterable, interfaceC20276);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m24928(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }
}
