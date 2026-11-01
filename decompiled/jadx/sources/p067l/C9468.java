package p067l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۟۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9468 {
    @SafeVarargs
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m21991(Object... objArr) {
        int length = objArr.length;
        C23335.m51956(length, "arraySize");
        ArrayList arrayList = new ArrayList(C15129.m34552(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m21990(Iterator it) {
        ArrayList arrayList = new ArrayList();
        C6786.m15489(arrayList, it);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractList m21989(List list, InterfaceC18263 interfaceC18263) {
        if (list instanceof RandomAccess) {
            return new C13492(list, interfaceC18263);
        }
        return new C15502(list, interfaceC18263);
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m21992(List list) {
        if (list instanceof AbstractC16192) {
            return ((AbstractC16192) list).mo36886();
        }
        if (list instanceof C12151) {
            return ((C12151) list).m28076();
        }
        if (!(list instanceof RandomAccess)) {
            return new C12151(list);
        }
        return new C14832(list);
    }
}
