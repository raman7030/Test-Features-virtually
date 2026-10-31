package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17780 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m41658(List list, Object obj) {
        if (list == null) {
            list = new ArrayList(1);
        }
        list.add(obj);
        return list;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m41657(Object[] objArr) {
        if (objArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m41656(int[] iArr) {
        if (iArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m41655(int i, Object[] objArr) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }
}
