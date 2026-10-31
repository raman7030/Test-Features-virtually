package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4648 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m13616(Iterator it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return C13426.m32450(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterator m13611(Iterator it, InterfaceC16724 interfaceC16724) {
        return new C18760(it, interfaceC16724);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m13609(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterator m13610(Iterator it, Iterator it2) {
        it.getClass();
        it2.getClass();
        return new C5354(new C2532(new Iterator[]{it, it2}));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13614(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m13615(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC5998 m13612(Iterator it) {
        if (it instanceof C22287) {
            return (C22287) it;
        }
        return new C22287(it);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC20151 m13613(Iterable iterable, Comparator comparator) {
        C4025.m12106(iterable, "iterators");
        C4025.m12106(comparator, "comparator");
        return new C21582(iterable, comparator);
    }
}
