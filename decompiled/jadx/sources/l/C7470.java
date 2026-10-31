package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۟۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7470 {
    @SafeVarargs
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m20016(Object... objArr) {
        int length = objArr.length;
        C22061.m49620(length, "arraySize");
        ArrayList arrayList = new ArrayList(C13426.m32450(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m20015(Iterator it) {
        ArrayList arrayList = new ArrayList();
        C4648.m13614(arrayList, it);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractList m20014(List list, InterfaceC16724 interfaceC16724) {
        if (list instanceof RandomAccess) {
            return new C11704(list, interfaceC16724);
        }
        return new C13819(list, interfaceC16724);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m20017(List list) {
        if (list instanceof AbstractC14545) {
            return ((AbstractC14545) list).mo34737();
        }
        if (list instanceof C10293) {
            return ((C10293) list).m26052();
        }
        if (!(list instanceof RandomAccess)) {
            return new C10293(list);
        }
        return new C13114(list);
    }
}
