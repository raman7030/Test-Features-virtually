package p067l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes2.dex */
public final class C6786 {
    /* JADX INFO: renamed from: ܽ */
    public static int m15491(Iterator it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return C15129.m34552(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Iterator m15486(Iterator it, InterfaceC18263 interfaceC18263) {
        return new C20198(it, interfaceC18263);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m15484(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Iterator m15485(Iterator it, Iterator it2) {
        it.getClass();
        it2.getClass();
        return new C7457(new C4775(new Iterator[]{it, it2}));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15489(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m15490(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8069 m15487(Iterator it) {
        if (it instanceof C23550) {
            return (C23550) it;
        }
        return new C23550(it);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC21520 m15488(Iterable iterable, Comparator comparator) {
        C6194.m14026(iterable, "iterators");
        C6194.m14026(comparator, "comparator");
        return new C22880(iterable, comparator);
    }
}
