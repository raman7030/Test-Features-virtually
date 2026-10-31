package l;

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
public final class C8882 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object[] m22953(Iterable iterable, Class cls) {
        Collection collectionM20015;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, 0);
        if (iterable instanceof Collection) {
            collectionM20015 = (Collection) iterable;
        } else {
            collectionM20015 = C7470.m20015(iterable.iterator());
        }
        return collectionM20015.toArray(objArr);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m22959(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return C4648.m13616(iterable.iterator());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m22956(Iterable iterable, InterfaceC18842 interfaceC18842) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            interfaceC18842.getClass();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (!interfaceC18842.apply(obj)) {
                    if (i2 > i) {
                        try {
                            list.set(i, obj);
                        } catch (IllegalArgumentException unused) {
                            m22951(list, interfaceC18842, i, i2);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            m22951(list, interfaceC18842, i, i2);
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
        interfaceC18842.getClass();
        while (it.hasNext()) {
            if (interfaceC18842.apply(it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22951(List list, InterfaceC18842 interfaceC18842, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (interfaceC18842.apply(list.get(size))) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterable m22947(Iterable iterable) {
        return new C0852(iterable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterable m22948(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new C14963(iterableArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m22950(Collection collection) {
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Object[] m22958(Iterable iterable) {
        Collection collectionM20015;
        if (iterable instanceof Collection) {
            collectionM20015 = (Collection) iterable;
        } else {
            collectionM20015 = C7470.m20015(iterable.iterator());
        }
        return collectionM20015.toArray();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22952(Iterable iterable, InterfaceC18842 interfaceC18842) {
        Iterator it = iterable.iterator();
        C4025.m12106(interfaceC18842, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC18842.apply(it.next())) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m22955(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return C7166.m19188(1, list);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterable m22949(Iterable iterable, InterfaceC16724 interfaceC16724) {
        iterable.getClass();
        return new C20877(iterable, interfaceC16724);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Iterable m22954(Iterable iterable, InterfaceC18842 interfaceC18842) {
        iterable.getClass();
        interfaceC18842.getClass();
        return new C6765(iterable, interfaceC18842);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m22957(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }
}
